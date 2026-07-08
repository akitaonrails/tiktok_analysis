package Y;

import X.C1C7U;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS0S1300100_20 implements Runnable {
    public final int $t;
    public long j4;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fe A[Catch: JSONException -> 0x0224, TryCatch #2 {JSONException -> 0x0224, blocks: (B:96:0x01f6, B:98:0x01fe), top: B:126:0x01f6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instruction units count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS0S1300100_20.LIZ$0():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS0S1300100_20.LIZ$1():void");
    }

    public static final void run$0(ARunnableS0S1300100_20 aRunnableS0S1300100_20) {
        boolean zLIZ;
        C1C7U.LIZ("FrescoTraceListener@156d.onRequestFailure$1");
        try {
            aRunnableS0S1300100_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FrescoTraceListener@156d.onRequestFailure$1");
    }

    public static final void run$1(ARunnableS0S1300100_20 aRunnableS0S1300100_20) {
        boolean zLIZ;
        C1C7U.LIZ("FrescoTTNetFetcher@4e50.fetchWithTtnet$1$onAsyncResponse$1");
        try {
            aRunnableS0S1300100_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FrescoTTNetFetcher@4e50.fetchWithTtnet$1$onAsyncResponse$1");
    }

    public ARunnableS0S1300100_20(Object obj, Object obj2, String str, long j, Object obj3, int i) {
        this.$t = i;
        this.l3 = obj;
        this.l1 = obj2;
        this.s0 = str;
        this.j4 = j;
        this.l2 = obj3;
    }
}
