package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fXO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131000fXO {
    public final Function0<Unit> LIZ;
    public Bitmap LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;

    public C1131000fXO(AwS561S0100000_17 awS561S0100000_17) {
        this.LIZ = awS561S0100000_17;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c A[PHI: r2
      0x002c: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:5:0x000b, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap LIZ(com.bytedance.android.live.base.model.ImageModel r5) {
        /*
            r4 = this;
            r3 = 0
            if (r5 == 0) goto L70
            java.lang.String r2 = r5.getUri()
            int r0 = r2.length()
            if (r0 > 0) goto L2c
            java.util.List r0 = r5.getUrls()
            java.util.Iterator r1 = r0.iterator()
        L15:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r2 = r1.next()
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L15
        L28:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L70
        L2c:
            int r0 = r2.length()
            if (r0 == 0) goto L70
            android.graphics.Bitmap r1 = r4.LIZIZ
            if (r1 == 0) goto L47
            boolean r0 = r1.isRecycled()
            if (r0 != 0) goto L47
            java.lang.String r0 = r4.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 == 0) goto L47
            return r1
        L45:
            r2 = r3
            goto L28
        L47:
            java.lang.String r0 = r4.LIZLLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 != 0) goto L6f
            java.lang.String r0 = r4.LJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 != 0) goto L6f
            r4.LIZIZ = r3
            r4.LIZJ = r3
            r4.LIZLLL = r2
            r4.LJ = r3
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostFrescoHelper> r0 = com.bytedance.android.livesdkapi.host.IHostFrescoHelper.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostFrescoHelper r1 = (com.bytedance.android.livesdkapi.host.IHostFrescoHelper) r1
            X.0fXP r0 = new X.0fXP
            r0.<init>()
            r1.xW1(r5, r0)
        L6f:
            return r3
        L70:
            r4.LIZIZ = r3
            r4.LIZJ = r3
            r4.LIZLLL = r3
            r4.LJ = r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1131000fXO.LIZ(com.bytedance.android.live.base.model.ImageModel):android.graphics.Bitmap");
    }
}
