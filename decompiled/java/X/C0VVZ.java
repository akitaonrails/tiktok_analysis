package X;

import android.view.FrameMetrics;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0VVZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VVZ extends C0VVV implements C0VV1 {
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(1));

    @Override // X.C0VV1
    public final void LIZ(FrameMetrics frameMetrics) {
    }

    @Override // X.C0VV1
    public final void LIZJ() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    @Override // X.C0VV1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(long r14, long r16, boolean r18) throws java.lang.IllegalAccessException {
        /*
            r13 = this;
            r9 = r16
            r8 = r13
            boolean r0 = r8.LIZ
            if (r0 != 0) goto L8
            return
        L8:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto Lf
            return
        Lf:
            java.util.concurrent.LinkedBlockingDeque<X.0VVd> r0 = r8.LIZIZ
            java.lang.Object r12 = r0.peekFirst()
            X.0VVd r12 = (X.C798790VVd) r12
            if (r12 != 0) goto L1a
            return
        L1a:
            r7 = r18
            if (r7 == 0) goto L56
            X.01GW r0 = r8.LIZLLL
            java.lang.Object r2 = r0.getValue()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            r1 = 0
            if (r2 == 0) goto L2f
            X.0V2r r0 = X.C791390V2r.LJJIII
            java.lang.Object r1 = r2.get(r0)
        L2f:
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 == 0) goto L56
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L56
            long r5 = r1.longValue()
        L3b:
            long r3 = r9 - r14
            r1 = 5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L53
            X.0VVe r1 = new X.0VVe
            r1.<init>()
            r1.LIZ = r14
            r1.LIZIZ = r9
            r1.LIZJ = r7
            java.util.concurrent.CopyOnWriteArrayList<X.0VVe> r0 = r12.LIZIZ
            r0.add(r1)
        L53:
            if (r7 != 0) goto L59
            return
        L56:
            r5 = 0
            goto L3b
        L59:
            long r9 = r9 - r5
            float r0 = X.C0VXC.LIZ
            float r1 = (float) r9
            float r1 = r1 / r0
            r0 = 1077936128(0x40400000, float:3.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L65
            return
        L65:
            r0 = 1
            long r5 = r5 - r0
            java.util.concurrent.CopyOnWriteArrayList<X.0VVe> r0 = r12.LIZIZ
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r4 = r0.iterator()
        L73:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.0VVe r0 = (X.C798800VVe) r0
            long r1 = r0.LIZIZ
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L73
            r11.add(r3)
            goto L73
        L8a:
            java.util.concurrent.CopyOnWriteArrayList<X.0VVe> r0 = r12.LIZIZ
            r0.clear()
            X.0VVY r7 = new X.0VVY
            r7.<init>()
            java.util.concurrent.ExecutorService r0 = X.C741050T5b.LIZ
            r0.execute(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VVZ.LIZIZ(long, long, boolean):void");
    }
}
