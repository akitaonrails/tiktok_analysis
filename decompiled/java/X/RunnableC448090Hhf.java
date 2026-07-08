package X;

import com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0Hhf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class RunnableC448090Hhf implements Runnable {
    public final WeakReference<DynamicSingleIntermediateFragmentNew> LL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AfterRecomInitTask@ad05.run");
        try {
            DynamicSingleIntermediateFragmentNew dynamicSingleIntermediateFragmentNew = this.LL.get();
            if (dynamicSingleIntermediateFragmentNew != null) {
                dynamicSingleIntermediateFragmentNew.BS();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AfterRecomInitTask@ad05.run");
    }

    public RunnableC448090Hhf(WeakReference<DynamicSingleIntermediateFragmentNew> weakReference) {
        this.LL = weakReference;
    }
}
