package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.rank.impl.list.controller.RankPageController;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment;

/* JADX INFO: renamed from: X.0xCe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1810060xCe extends AbstractViewOnClickListenerC1105820esm {
    public final /* synthetic */ RankListFragment LLILZIL;
    public final /* synthetic */ int LLILZLL;

    @Override // X.AbstractViewOnClickListenerC1105820esm
    public final void LIZ() {
        RecyclerView.LayoutManager layoutManager;
        RecyclerView.LayoutManager layoutManager2;
        RankPageController rankPageControllerRR;
        InterfaceC1810050xCd interfaceC1810050xCd;
        int iPR = this.LLILZIL.PR(this.LLILZLL);
        if (iPR >= 0) {
            RankListFragment rankListFragment = this.LLILZIL;
            RunnableC781530UlD runnableC781530UlD = rankListFragment.LLJJJ;
            if (runnableC781530UlD != null && (layoutManager2 = runnableC781530UlD.getLayoutManager()) != null && layoutManager2.getItemCount() > 10 && (rankPageControllerRR = rankListFragment.RR()) != null && (interfaceC1810050xCd = rankPageControllerRR.LLIZLLLIL) != null) {
                interfaceC1810050xCd.AR();
            }
            Context context = this.LLILZIL.getContext();
            if (context == null) {
                return;
            }
            C1864560ycY c1864560ycY = new C1864560ycY(context, 2);
            c1864560ycY.LIZ = iPR;
            RunnableC781530UlD runnableC781530UlD2 = this.LLILZIL.LLJJJ;
            if (runnableC781530UlD2 != null && (layoutManager = runnableC781530UlD2.getLayoutManager()) != null) {
                layoutManager.startSmoothScroll(c1864560ycY);
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_bottom_bar_click");
            c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this.LLILZIL));
            c474500IjALIZ.LJJII(this.LLILZIL.LLILLL.LIZIZ.rankName, "rank_type");
            c474500IjALIZ.LJJII(C500260Jjc.LJIIZILJ(C475510Ikn.LJ(this.LLILZIL)) ? "anchor" : "user", "user_type");
            c474500IjALIZ.LJJII(Integer.valueOf(this.LLILZLL), "current_rank");
            c474500IjALIZ.LIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1810060xCe(RankListFragment rankListFragment, int i) {
        super(1200L);
        this.LLILZIL = rankListFragment;
        this.LLILZLL = i;
    }
}
