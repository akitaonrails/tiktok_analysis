package X;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0RvR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C711430RvR extends C0SR4 {
    public final SparseArray<ConcurrentLinkedQueue<View>> LLJJLIIIJLLLLLLLZ;

    @Override // X.C0SR4
    public final String LJJJLIIL() {
        return "story_feed";
    }

    @Override // X.C0SR4
    public final List<C711420RvQ> LJJJJIZL() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((Collection) C711270RvB.LJI.getValue());
        return arrayList;
    }

    @Override // X.C0SR4
    public final C711420RvQ LJJLI() {
        return C711250Rv9.LJ;
    }

    @Override // X.C0SR4, X.InterfaceC692440REc
    public final Aweme getItem(int i) {
        Object c098200Yq;
        try {
            c098200Yq = super.getItem(i);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (Aweme) c098200Yq;
    }

    @Override // X.C0SR4, X.AbstractC714000Rza
    public final View LJJJI(int i, View view, ViewGroup viewGroup) {
        View viewPoll;
        if (view == null) {
            ConcurrentLinkedQueue<View> concurrentLinkedQueue = this.LLJJLIIIJLLLLLLLZ.get(LJJIL(i));
            if (concurrentLinkedQueue != null && (viewPoll = concurrentLinkedQueue.poll()) != null) {
                int i2 = C2187451AjH.LIZ;
                return super.LJJJI(i, viewPoll, viewGroup);
            }
        }
        return super.LJJJI(i, view, viewGroup);
    }

    public C711430RvR(Context context, LayoutInflater layoutInflater, C0RST c0rst, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, C0R9L c0r9l) {
        super(context, layoutInflater, c0rst, fragment, onTouchListener, baseFeedPageParams, c0r9l);
        this.LLJJLIIIJLLLLLLLZ = new SparseArray<>();
    }
}
