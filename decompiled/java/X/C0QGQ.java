package X;

import com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew;
import com.ss.android.ugc.aweme.search.performance.metrics.SearchMiddleMonitor;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0QGQ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QGQ extends AbstractC649410Pdb {
    public final WeakReference<DynamicSingleIntermediateFragmentNew> LIZ;

    public C0QGQ(WeakReference<DynamicSingleIntermediateFragmentNew> weakReference) {
        this.LIZ = weakReference;
    }

    @Override // X.AbstractC649410Pdb
    public final void LIZ(Object obj) {
        SearchMiddleMonitor searchMiddleMonitor = SearchMiddleMonitor.INSTANCE;
        if (searchMiddleMonitor.isHistory(obj)) {
            searchMiddleMonitor.updateHistoryEnd();
        }
        if (searchMiddleMonitor.isRecommend(obj)) {
            searchMiddleMonitor.updateRecommendEnd();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    @Override // X.AbstractC649410Pdb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.Object r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.search.performance.metrics.SearchMiddleMonitor r4 = com.ss.android.ugc.aweme.search.performance.metrics.SearchMiddleMonitor.INSTANCE
            boolean r0 = r4.isRecommend(r6)
            if (r0 == 0) goto L28
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew> r0 = r5.LIZ
            java.lang.Object r3 = r0.get()
            com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew r3 = (com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew) r3
            r2 = 0
            if (r3 == 0) goto L6d
            X.01GW r0 = X.C18101077b.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6d
            boolean r1 = r3.LLLJ
            r3.LLLJ = r2
            r0 = 1
            if (r1 != r0) goto L6d
        L28:
            boolean r0 = r4.isHistory(r6)
            if (r0 == 0) goto L6c
            boolean r0 = X.C0BRD.LIZ()
            if (r0 != 0) goto L6c
            Y.ARunnableS110S0100000_10 r1 = new Y.ARunnableS110S0100000_10
            r0 = 219(0xdb, float:3.07E-43)
            r1.<init>(r5, r0)
            X.C20639086r.LIZLLL(r1)
            r4.updateHistory()
            boolean r0 = X.C293280BeY.LIZ
            if (r0 != 0) goto L6c
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew> r0 = r5.LIZ
            java.lang.Object r0 = r0.get()
            com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew r0 = (com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew) r0
            if (r0 == 0) goto L52
            r0.VS()
        L52:
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew> r0 = r5.LIZ
            java.lang.Object r0 = r0.get()
            com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew r0 = (com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew) r0
            if (r0 == 0) goto L5f
            r0.FS()
        L5f:
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew> r0 = r5.LIZ
            java.lang.Object r0 = r0.get()
            com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew r0 = (com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew) r0
            if (r0 == 0) goto L6c
            r0.US()
        L6c:
            return
        L6d:
            Y.ARunnableS110S0100000_10 r1 = new Y.ARunnableS110S0100000_10
            r0 = 218(0xda, float:3.05E-43)
            r1.<init>(r5, r0)
            X.C20639086r.LIZLLL(r1)
            r4.updateRecommend()
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QGQ.LIZIZ(java.lang.Object):void");
    }
}
