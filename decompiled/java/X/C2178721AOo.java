package X;

import android.content.Context;
import android.view.OrientationEventListener;

/* JADX INFO: renamed from: X.1AOo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2178721AOo extends OrientationEventListener {
    public int LIZ;
    public final /* synthetic */ C2178731AOp LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    @Override // android.view.OrientationEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onOrientationChanged(int r5) {
        /*
            r4 = this;
            if (r5 < 0) goto L7c
            r0 = 360(0x168, float:5.04E-43)
            if (r5 >= r0) goto L7c
            X.1AOp r0 = r4.LIZIZ
            r0.getClass()
            r3 = -1
            r2 = 9
            if (r5 <= r2) goto L4b
            int r1 = 360 - r5
            X.1AOp r0 = r4.LIZIZ
            r0.getClass()
            if (r1 <= r2) goto L4b
            int r0 = r5 + (-90)
            int r1 = java.lang.Math.abs(r0)
            X.1AOp r0 = r4.LIZIZ
            r0.getClass()
            if (r1 > r2) goto L2d
            r2 = 8
        L28:
            int r0 = r4.LIZ
            if (r0 != r2) goto L4d
            return
        L2d:
            int r0 = r5 + (-180)
            int r1 = java.lang.Math.abs(r0)
            X.1AOp r0 = r4.LIZIZ
            r0.getClass()
            if (r1 <= r2) goto L28
            int r0 = r5 + (-270)
            int r1 = java.lang.Math.abs(r0)
            X.1AOp r0 = r4.LIZIZ
            r0.getClass()
            if (r1 > r2) goto L49
            r2 = 0
            goto L28
        L49:
            r2 = -1
            goto L28
        L4b:
            r2 = 1
            goto L28
        L4d:
            if (r2 == r3) goto L7c
            r4.LIZ = r2
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onOrientationChanged:"
            r1.append(r0)
            java.lang.String r0 = X.C1AP9.LIZ(r2)
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            X.1AOp r0 = r4.LIZIZ
            X.0peQ<X.1APF> r0 = r0.LIZ
            java.util.Iterator r1 = r0.iterator()
        L6c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r1.next()
            X.1APF r0 = (X.C1APF) r0
            r0.LIZ(r2)
            goto L6c
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2178721AOo.onOrientationChanged(int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2178721AOo(C2178731AOp c2178731AOp, Context context) {
        super(context);
        this.LIZIZ = c2178731AOp;
        this.LIZ = -1;
    }
}
