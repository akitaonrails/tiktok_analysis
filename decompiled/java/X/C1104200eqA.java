package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.xtab.XTabESportsHighlightCard;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.xtab.XtabESportshighlightCardVM;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.api.partnership.EsportsHighlightVideosResponse;

/* JADX INFO: renamed from: X.0eqA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104200eqA extends AbstractC21673619ry<C1104210eqB> {
    public List<C1104220eqC> LL = C13BV.INSTANCE;
    public final /* synthetic */ XTabESportsHighlightCard LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C1104200eqA(XTabESportsHighlightCard xTabESportsHighlightCard) {
        this.LLILLJJLI = xTabESportsHighlightCard;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1104210eqB c1104210eqB = (C1104210eqB) viewHolder;
        final C1104220eqC c1104220eqC = (C1104220eqC) ListProtector.get(this.LL, i);
        c1104210eqB.LL = c1104220eqC;
        C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(c1104220eqC.LIZ);
        c1324610kZfLIZJ.LJIL = true;
        c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
        c1324610kZfLIZJ.LJIJI(Float.valueOf(C497740JfY.LIZIZ(8.0f)));
        c1324610kZfLIZJ.LJJI(c1104210eqB.LLILLJJLI);
        c1104210eqB.LLILLL.setText(c1104220eqC.LIZIZ);
        c1104210eqB.LLILZ.setText(c1104220eqC.LIZJ);
        View view = c1104210eqB.itemView;
        final XTabESportsHighlightCard xTabESportsHighlightCard = this.LLILLJJLI;
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0zAF
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str;
                EsportsHighlightVideosResponse.EsportsInfo esportsInfo;
                String str2;
                EsportsHighlightVideosResponse.EsportsInfo esportsInfo2;
                List<C1104220eqC> list = this.LL.LL;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<C1104220eqC> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().LIZLLL);
                }
                ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).openESportsHighlightsVideoDetails(xTabESportsHighlightCard.LL, "live_highlights_tab", c1104220eqC.LIZLLL, C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_highlights_video_click");
                c474500IjALIZ.LJJII(c1104220eqC.LIZLLL, "item_id");
                String strLJFF = C1882380z5I.LJFF(C1882380z5I.LIZJ(xTabESportsHighlightCard.LLILLL), "room_id");
                String str3 = "";
                if (strLJFF == null) {
                    strLJFF = "";
                }
                c474500IjALIZ.LJJII(strLJFF, "room_id");
                String strLJFF2 = C1882380z5I.LJFF(C1882380z5I.LIZJ(xTabESportsHighlightCard.LLILLL), "author_id");
                if (strLJFF2 == null) {
                    strLJFF2 = "";
                }
                c474500IjALIZ.LJJII(strLJFF2, "anchor_id");
                XtabESportshighlightCardVM xtabESportshighlightCardVM = xTabESportsHighlightCard.LLJJJJLIIL;
                if (xtabESportshighlightCardVM == null || (esportsInfo2 = xtabESportshighlightCardVM.LLILZ) == null || (str = esportsInfo2.gameId) == null) {
                    str = "";
                }
                c474500IjALIZ.LJJII(str, "game_id");
                XtabESportshighlightCardVM xtabESportshighlightCardVM2 = xTabESportsHighlightCard.LLJJJJLIIL;
                if (xtabESportshighlightCardVM2 != null && (esportsInfo = xtabESportshighlightCardVM2.LLILZ) != null && (str2 = esportsInfo.gameName) != null) {
                    str3 = str2;
                }
                c474500IjALIZ.LJJII(str3, "game_name");
                c474500IjALIZ.LIZ();
            }
        }, view);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1104210eqB c1104210eqB = new C1104210eqB(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gqf, viewGroup, false));
        C2211631BhB.LJ(c1104210eqB.itemView, new C1104240eqE(c1104210eqB, this.LLILLJJLI));
        c1104210eqB.LLILLJJLI.getLayoutParams().height = (int) (((C14KS.LJFF() - ((int) C497740JfY.LIZIZ(32.0f))) / 2) * 1.586f);
        try {
            View view = c1104210eqB.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1104210eqB.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1104210eqB.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1104210eqB.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1104210eqB.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1104210eqB.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1104210eqB.class.getName();
        return c1104210eqB;
    }
}
