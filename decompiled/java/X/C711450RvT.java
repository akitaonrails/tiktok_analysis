package X;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0RvT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C711450RvT extends C0SR4 {
    public final SparseArray<ConcurrentLinkedQueue<View>> LLJJLIIIJLLLLLLLZ;

    @Override // X.C0SR4
    public final String LJJJLIIL() {
        return "story_immersive_feed";
    }

    @Override // X.C0SR4
    public final void LJJLIIIJILLIZJL(int i, int i2, List list) {
    }

    @Override // X.C0SR4
    public final void LJJLIIIJJI(int i, Aweme aweme) {
    }

    @Override // X.C0SR4
    public final List<C711420RvQ> LJJJJIZL() {
        return C1618440sDa.LIZIZ.LJJIIJ().LJIILLIIL(this.LLJI.param.getFrom()) ? C1697810uHb.LJIILJJIL(C711050Rup.LJ) : C1697810uHb.LJIILJJIL(C711230Rv7.LJ, C711200Rv4.LJ, C711520Rva.LJ);
    }

    @Override // X.C0SR4
    public final C711420RvQ LJJLI() {
        return C1618440sDa.LIZIZ.LJJIIJ().LJIILLIIL(this.LLJI.param.getFrom()) ? C711050Rup.LJ : C711200Rv4.LJ;
    }

    @Override // X.C0SR4, X.AbstractC714000Rza
    public final View LJJJI(int i, View view, ViewGroup viewGroup) {
        View viewPoll;
        if (view == null) {
            ConcurrentLinkedQueue<View> concurrentLinkedQueue = this.LLJJLIIIJLLLLLLLZ.get(LJJIL(i));
            if (concurrentLinkedQueue != null && (viewPoll = concurrentLinkedQueue.poll()) != null) {
                return super.LJJJI(i, viewPoll, viewGroup);
            }
        }
        return super.LJJJI(i, view, viewGroup);
    }

    public C711450RvT(Context context, LayoutInflater layoutInflater, C0HTT c0htt, Fragment fragment, C714460S0u c714460S0u, BaseFeedPageParams baseFeedPageParams, C0R9L c0r9l) {
        super(context, layoutInflater, c0htt, fragment, c714460S0u, baseFeedPageParams, c0r9l);
        this.LLJJLIIIJLLLLLLLZ = new SparseArray<>();
    }
}
