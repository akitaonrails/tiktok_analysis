package X;

import Y.ARunnableS41S0300000_8;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.tools.draft.adapter.viewholder.NewDraftViewHolder;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0M3A, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M3A implements Runnable {
    public final SafeHandler LL;
    public final C0M0P LLILLJJLI;
    public final WeakReference<NewDraftViewHolder> LLILLL;
    public boolean LLILZ;

    public C0M3A() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("NewDraftViewHolder$BindDraftCoverFallbackRunnable@dcd7.run");
        try {
            NewDraftViewHolder newDraftViewHolder = this.LLILLL.get();
            if (newDraftViewHolder != null) {
                newDraftViewHolder.P5(this.LLILLJJLI, new C0M3I() { // from class: X.0M3D
                    @Override // X.C0M3I
                    public final void LIZ(Bitmap bitmap, C1322110kVd c1322110kVd) {
                        C0M3A c0m3a = this.LIZ;
                        c0m3a.LL.post(new ARunnableS41S0300000_8(c0m3a, c1322110kVd, bitmap, 4));
                    }
                });
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NewDraftViewHolder$BindDraftCoverFallbackRunnable@dcd7.run");
    }

    public C0M3A(SafeHandler safeHandler, C0M0P c0m0p, WeakReference weakReference) {
        this.LL = safeHandler;
        this.LLILLJJLI = c0m0p;
        this.LLILLL = weakReference;
        this.LLILZ = false;
    }
}
