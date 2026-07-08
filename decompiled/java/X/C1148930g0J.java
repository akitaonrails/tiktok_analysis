package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g0J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1148930g0J extends AbstractC2172971A2l<C1148910g0H, AbstractC1149030g0T> {
    public final boolean LLILLJJLI;
    public final InterfaceC1149050g0V LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return ((C1148910g0H) ListProtector.get(this.LL.LJFF, i)).LJ.ordinal();
    }

    public C1148930g0J(boolean z, C1148900g0G c1148900g0G) {
        super(new AbstractC339510DSr<C1148910g0H>() { // from class: X.0g0L
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(C1148910g0H c1148910g0H, C1148910g0H c1148910g0H2) {
                List<String> listLIZ;
                C1148910g0H c1148910g0H3 = c1148910g0H;
                C1148910g0H c1148910g0H4 = c1148910g0H2;
                if (Intrinsics.LJFF(c1148910g0H3.LIZLLL, c1148910g0H4.LIZLLL) && c1148910g0H3.LJ == c1148910g0H4.LJ) {
                    ImageModel imageModel = c1148910g0H3.LIZIZ;
                    List<String> listLIZ2 = null;
                    if (imageModel != null) {
                        listLIZ = C842240X2g.LIZ(imageModel);
                    } else {
                        listLIZ = null;
                    }
                    ImageModel imageModel2 = c1148910g0H4.LIZIZ;
                    if (imageModel2 != null) {
                        listLIZ2 = C842240X2g.LIZ(imageModel2);
                    }
                    if (Intrinsics.LJFF(listLIZ, listLIZ2) && Intrinsics.LJFF(c1148910g0H3.LIZ, c1148910g0H4.LIZ) && Intrinsics.LJFF(c1148910g0H3.LIZJ, c1148910g0H4.LIZJ) && c1148910g0H3.LJI == c1148910g0H4.LJI && c1148910g0H3.LJII == c1148910g0H4.LJII) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(C1148910g0H c1148910g0H, C1148910g0H c1148910g0H2) {
                return Intrinsics.LJFF(c1148910g0H.LIZLLL, c1148910g0H2.LIZLLL);
            }
        });
        this.LLILLJJLI = z;
        this.LLILLL = c1148900g0G;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ((AbstractC1149030g0T) viewHolder).I5((C1148910g0H) ListProtector.get(this.LL.LJFF, i));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1148920g0I;
        if (i != EnumC1148880g0E.FAVORITE_ITEM.ordinal() && i != EnumC1148880g0E.OTHER_ITEM.ordinal()) {
            if (i == EnumC1148880g0E.FAVORITE_DISABLED_ITEM.ordinal()) {
                c1148920g0I = new C1148920g0I(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gqp, viewGroup, false), this.LLILLJJLI, false, this.LLILLL);
            } else if (i == EnumC1148880g0E.EMPTY_ITEM.ordinal()) {
                final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gqe, viewGroup, false);
                c1148920g0I = new AbstractC1149030g0T(viewTd) { // from class: X.0g0O
                    public final View LLILLJJLI;

                    {
                        super(viewTd);
                        this.LLILLJJLI = viewTd;
                    }

                    @Override // X.AbstractC1149030g0T
                    public final void I5(C1148910g0H c1148910g0H) {
                        TextView textView = (TextView) this.LLILLJJLI.findViewById(R.id.p6q);
                        if (textView != null) {
                            textView.setText(C497740JfY.LJIJI(2131841870));
                        }
                    }
                };
            } else if (i == EnumC1148880g0E.PLACEHOLDER.ordinal()) {
                final Space space = new Space(viewGroup.getContext());
                C786410Ut5.f6(space, new ViewGroup.LayoutParams(0, 0));
                c1148920g0I = new AbstractC1149030g0T(space) { // from class: X.0g0U
                    @Override // X.AbstractC1149030g0T
                    public final void I5(C1148910g0H c1148910g0H) {
                    }
                };
            } else {
                c1148920g0I = new C1148920g0I(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gqp, viewGroup, false), this.LLILLJJLI, true, this.LLILLL);
            }
        } else {
            c1148920g0I = new C1148920g0I(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gqp, viewGroup, false), this.LLILLJJLI, true, this.LLILLL);
        }
        try {
            View view = c1148920g0I.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1148920g0I.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1148920g0I.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1148920g0I.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1148920g0I.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1148920g0I.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1148920g0I.getClass().getName();
        return c1148920g0I;
    }
}
