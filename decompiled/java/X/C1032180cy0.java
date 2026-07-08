package X;

import Y.AsS43S0100000_16;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.rich.reward.ui.carousel.RewardPagerLayoutManager;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: X.0cy0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1032180cy0 {
    public RecyclerView LIZ;
    public RewardPagerLayoutManager LIZIZ;
    public C20635115or LIZJ;
    public boolean LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public final LinkedHashSet<InterfaceC1032450cyR> LIZLLL = new LinkedHashSet<>();
    public final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());
    public boolean LJIIIZ = true;
    public final AsS43S0100000_16 LJIIJ = new AsS43S0100000_16(this, 3);

    public final void LIZIZ() {
        RewardPagerLayoutManager rewardPagerLayoutManager;
        View viewLJFF;
        RecyclerView recyclerView = this.LIZ;
        if (recyclerView == null || (rewardPagerLayoutManager = this.LIZIZ) == null) {
            return;
        }
        C20635115or c20635115or = this.LIZJ;
        int width = recyclerView.getWidth();
        int iFindFirstVisibleItemPosition = (c20635115or == null || (viewLJFF = c20635115or.LJFF(rewardPagerLayoutManager)) == null) ? rewardPagerLayoutManager.findFirstVisibleItemPosition() : rewardPagerLayoutManager.getPosition(viewLJFF);
        View viewFindViewByPosition = rewardPagerLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition != null) {
            viewFindViewByPosition.getLeft();
            C13LZ.LJ(-viewFindViewByPosition.getLeft(), 0, width);
        }
        Iterator<InterfaceC1032450cyR> it2 = this.LIZLLL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIJ();
        }
        if (iFindFirstVisibleItemPosition != this.LJI) {
            this.LJI = iFindFirstVisibleItemPosition;
            Iterator<InterfaceC1032450cyR> it3 = this.LIZLLL.iterator();
            while (it3.hasNext()) {
                it3.next().onPageSelected(iFindFirstVisibleItemPosition);
            }
        }
        if (this.LJIIIIZZ == 0) {
            if (iFindFirstVisibleItemPosition != this.LJII || this.LJIIIZ) {
                this.LJII = iFindFirstVisibleItemPosition;
                Iterator<InterfaceC1032450cyR> it4 = this.LIZLLL.iterator();
                while (it4.hasNext()) {
                    it4.next().LIZ(iFindFirstVisibleItemPosition, this.LJIIIZ);
                }
                this.LJIIIZ = false;
            }
        }
    }

    public static void LIZ(C20635115or c20635115or, RecyclerView recyclerView) {
        try {
            c20635115or.LIZIZ(recyclerView);
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            C1033260czk.LIZIZ("attachToRecyclerView failed ", e);
        }
    }
}
