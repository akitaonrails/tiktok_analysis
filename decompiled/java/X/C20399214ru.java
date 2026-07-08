package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.PlaybookTagInfo;

/* JADX INFO: renamed from: X.14ru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20399214ru extends C09AY implements Function0<C1117360fBO> {
    public final /* synthetic */ C20398214rk LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20399214ru(C20398214rk c20398214rk) {
        super(0);
        this.LL = c20398214rk;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.14rl] */
    @Override // kotlin.jvm.functions.Function0
    public final C1117360fBO invoke() {
        final C1117360fBO c1117360fBO = new C1117360fBO();
        final C20398214rk c20398214rk = this.LL;
        final ?? r0 = new InterfaceC20406914t9() { // from class: X.14rl
            @Override // X.InterfaceC20406914t9
            public final void LIZ(PlaybookTagInfo playbookTagInfo) {
                Integer numValueOf;
                C20384514pX c20384514pX;
                PlaybookAnchorViewModel playbookAnchorViewModel = c20398214rk.LL;
                if (playbookAnchorViewModel != null && (c20384514pX = playbookAnchorViewModel.LLJJJJJIL) != null) {
                    numValueOf = Integer.valueOf(c20384514pX.LJJIL());
                } else {
                    numValueOf = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("clickTagInfo tag ");
                sbLIZ.append(playbookTagInfo);
                C20441214yg.LIZIZ("PlaybookPolymerizationListHeaderViewBinder", C2188811AlT.LIZIZ(sbLIZ));
                int i = playbookTagInfo.tagType;
                if (numValueOf != null && i == numValueOf.intValue()) {
                    C20441214yg.LIZIZ("PlaybookPolymerizationListHeaderViewBinder", "clickTagInfo tag return tagType is the same");
                    return;
                }
                Pair pairLIZIZ = LIZIZ(false, numValueOf);
                C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                C978360bZC.LJIIZILJ(playbookTagInfo.tagType, 2, C20385714pj.LIZ(c20398214rk.LL), "click");
                c20398214rk.LLILZ.LIZ(playbookTagInfo);
                Pair pairLIZIZ2 = LIZIZ(true, Integer.valueOf(playbookTagInfo.tagType));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("clickTagInfo lastSelect:");
                sbLIZ2.append(pairLIZIZ);
                sbLIZ2.append(" selectedIndex:");
                sbLIZ2.append(pairLIZIZ2);
                sbLIZ2.append(" tag ");
                sbLIZ2.append(playbookTagInfo);
                C20441214yg.LIZIZ("PlaybookPolymerizationListHeaderViewBinder", C2188811AlT.LIZIZ(sbLIZ2));
                c1117360fBO.notifyItemChanged(((Number) pairLIZIZ2.getSecond()).intValue());
            }

            public final Pair LIZIZ(boolean z, Integer num) {
                C20406414t4 c20406414t4;
                Pair pairLJI = C500260Jjc.LJI(c1117360fBO.LL, new C20400914sB(num));
                if (pairLJI.getFirst() instanceof C20406414t4) {
                    Object first = pairLJI.getFirst();
                    if ((first instanceof C20406414t4) && (c20406414t4 = (C20406414t4) first) != null) {
                        c20406414t4.LIZIZ = z;
                    }
                }
                c1117360fBO.notifyItemChanged(((Number) pairLJI.getSecond()).intValue());
                return pairLJI;
            }
        };
        c1117360fBO.LLLI(C20406414t4.class, new AbstractC960460b6K<C20406414t4, C20401514sH>(r0) { // from class: X.14sG
            public final InterfaceC20406914t9 LIZIZ;

            {
                this.LIZIZ = r0;
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C20401514sH(C786410Ut5.Td(layoutInflater, R.layout.h_j, viewGroup, false), this.LIZIZ);
            }
        });
        return c1117360fBO;
    }
}
