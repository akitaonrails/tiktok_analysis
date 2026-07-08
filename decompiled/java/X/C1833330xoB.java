package X;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import webcast.api.game_station.GameDetailHotHashtagResponse;

/* JADX INFO: renamed from: X.0xoB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1833330xoB extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final List<GameDetailHotHashtagResponse.ResponseData.GameHashtag> LL;
    public boolean LLILLJJLI = true;
    public final /* synthetic */ C1885000z9W LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size() + 1;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i < this.LL.size()) {
            return 0;
        }
        return 1;
    }

    public C1833330xoB(C1885000z9W c1885000z9W, List<GameDetailHotHashtagResponse.ResponseData.GameHashtag> list) {
        this.LLILLL = c1885000z9W;
        this.LL = list;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        float fLIZIZ;
        if (viewHolder instanceof C1833340xoC) {
            final GameDetailHotHashtagResponse.ResponseData.GameHashtag gameHashtag = (GameDetailHotHashtagResponse.ResponseData.GameHashtag) ListProtector.get(this.LL, i);
            final C1833340xoC c1833340xoC = (C1833340xoC) viewHolder;
            C16F5 c16f5 = c1833340xoC.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('#');
            sbLIZ.append(gameHashtag.hashtagName);
            c16f5.setText(C2188811AlT.LIZIZ(sbLIZ));
            if (C497740JfY.LJJ()) {
                c1833340xoC.LL.setGravity(8388611);
            } else {
                c1833340xoC.LL.setGravity(3);
            }
            c1833340xoC.LLILLJJLI.setText(String.valueOf(c1833340xoC.getLayoutPosition() + 1));
            C16F5 c16f52 = c1833340xoC.LLILLL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(gameHashtag.hashtagPostCountFmt);
            sbLIZ2.append(' ');
            sbLIZ2.append(C497740JfY.LJIIJJI(2131755824, (int) gameHashtag.hashtagPostCount));
            c16f52.setText(C2188811AlT.LIZIZ(sbLIZ2));
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = c1833340xoC.itemView.getContext().getTheme();
            if (i > 2) {
                theme.resolveAttribute(R.attr.ezt, typedValue, true);
            } else {
                theme.resolveAttribute(R.attr.f00, typedValue, true);
            }
            c1833340xoC.LLILLJJLI.setTextColor(typedValue.data);
            String str = gameHashtag.hashtagName;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("aweme://search?keyword=");
            sbLIZ3.append(str);
            sbLIZ3.append("&from=");
            sbLIZ3.append("");
            sbLIZ3.append("&displayKeyword=");
            sbLIZ3.append(str);
            sbLIZ3.append("&back_flag=1&in_single_stack=true&extraLogParams=");
            sbLIZ3.append("");
            final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            View view = c1833340xoC.itemView;
            final C1885000z9W c1885000z9W = c1833340xoC.LLILZ.LLILLL;
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0z9b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    InterfaceC1881340z3c interfaceC1881340z3cLIZJ;
                    C1882420z5M c1882420z5MLIZLLL;
                    InterfaceC1883030z6L interfaceC1883030z6L = c1885000z9W.LJIIIZ;
                    C1882410z5L c1882410z5LLJIIIIZZ = null;
                    if (interfaceC1883030z6L != null) {
                        interfaceC1881340z3cLIZJ = interfaceC1883030z6L.LIZJ();
                    } else {
                        interfaceC1881340z3cLIZJ = null;
                    }
                    String str2 = gameHashtag.hashtagName;
                    Integer numValueOf = Integer.valueOf(c1833340xoC.getLayoutPosition() + 1);
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_hashtag_click");
                    if (interfaceC1881340z3cLIZJ != null) {
                        c1882420z5MLIZLLL = C1882380z5I.LIZLLL(interfaceC1881340z3cLIZJ);
                    } else {
                        c1882420z5MLIZLLL = null;
                    }
                    c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(c1882420z5MLIZLLL)));
                    c474500IjALIZ.LJJII(str2, "hashtag_name");
                    c474500IjALIZ.LJJII(numValueOf, "hashtag_order");
                    c474500IjALIZ.LJJII("videos", "tab_name");
                    if (interfaceC1881340z3cLIZJ != null) {
                        c1882410z5LLJIIIIZZ = C1882380z5I.LJIIIIZZ(interfaceC1881340z3cLIZJ);
                    }
                    String strLJFF = C1882380z5I.LJFF(c1882410z5LLJIIIIZZ, "sub_tab_name");
                    if (strLJFF == null) {
                        strLJFF = "";
                    }
                    c474500IjALIZ.LJJII(strLJFF, "sub_tab_name");
                    c474500IjALIZ.LIZ();
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(view2.getContext(), strLIZIZ);
                }
            }, view);
            ViewGroup.LayoutParams layoutParams = c1833340xoC.itemView.getLayoutParams();
            if (layoutParams instanceof C21681919tJ) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (i == 0) {
                fLIZIZ = C497740JfY.LIZIZ(64.0f);
            } else {
                fLIZIZ = C497740JfY.LIZIZ(0.0f);
            }
            int i2 = (int) fLIZIZ;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i2, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                return;
            }
            return;
        }
        if (!(viewHolder instanceof C1833350xoD)) {
            return;
        }
        viewHolder.itemView.findViewById(R.id.iri);
        if (this.LLILLJJLI) {
            C786410Ut5.LJLLLLLL(0, viewHolder.itemView);
        } else {
            C786410Ut5.LJLLLLLL(8, viewHolder.itemView);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1833340xoC;
        if (i != 0) {
            if (i == 1) {
                final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gne, viewGroup, false);
                c1833340xoC = new RecyclerView.ViewHolder(viewTd) { // from class: X.0xoD
                };
            } else {
                throw new IllegalArgumentException("Invalid view type");
            }
        } else {
            c1833340xoC = new C1833340xoC(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gnd, viewGroup, false));
        }
        try {
            View view = c1833340xoC.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1833340xoC.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1833340xoC.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1833340xoC.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1833340xoC.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1833340xoC.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1833340xoC.getClass().getName();
        return c1833340xoC;
    }
}
