package X;

import Y.ARunnableS77S0200000_8;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.tools.draft.adapter.viewholder.NewDraftViewHolder;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0M39, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M39 implements Runnable {
    public final SafeHandler LL;
    public final C0M0P LLILLJJLI;
    public final WeakReference<NewDraftViewHolder> LLILLL;
    public boolean LLILZ;

    public C0M39() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C561140Lzc c561140Lzc;
        C1C7U.LIZ("NewDraftViewHolder$BindAwemeDraftRunnable@816.run");
        try {
            NewDraftViewHolder newDraftViewHolder = this.LLILLL.get();
            this.LL.post(new ARunnableS77S0200000_8(this, (newDraftViewHolder == null || (c561140Lzc = newDraftViewHolder.LLILLJJLI) == null) ? null : c561140Lzc.LIZ(this.LLILLJJLI.LJ), 20));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NewDraftViewHolder$BindAwemeDraftRunnable@816.run");
    }

    public C0M39(SafeHandler safeHandler, C0M0P c0m0p, WeakReference weakReference) {
        this.LL = safeHandler;
        this.LLILLJJLI = c0m0p;
        this.LLILLL = weakReference;
        this.LLILZ = false;
    }
}
