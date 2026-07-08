package X;

import android.util.Size;

/* JADX INFO: renamed from: X.0l0O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341180l0O {
    public static final C1341180l0O LIZ = new C1341180l0O();

    public static void LIZ(C1331670kl3 c1331670kl3, C1341210l0R c1341210l0R) {
        C1341220l0S c1341220l0S;
        int width;
        AbstractC1341300l0a abstractC1341300l0a = c1341210l0R.LIZIZ;
        if ((abstractC1341300l0a instanceof C1341220l0S) && (c1341220l0S = (C1341220l0S) abstractC1341300l0a) != null) {
            Size size = c1341210l0R.LIZJ;
            int height = 0;
            if (size != null) {
                width = size.getWidth();
            } else {
                width = 0;
            }
            Size size2 = c1341210l0R.LIZJ;
            if (size2 != null) {
                height = size2.getHeight();
            }
            C708740Rr6.LIZ.LIZ(c1331670kl3, c1341220l0S.LIZ, width, height);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1331670kl3 LIZJ(X.C1341210l0R r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1341180l0O.LIZJ(X.0l0R, boolean):X.0kl3");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080 A[PHI: r3
      0x0080: PHI (r3v1 int) = (r3v0 int), (r3v4 int) binds: [B:33:0x007d, B:11:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C1331670kl3 r8, X.C1341210l0R r9, X.EnumC1341620l16 r10, boolean r11) {
        /*
            X.0l0a r2 = r9.LIZIZ
            boolean r1 = r2 instanceof X.AbstractC1341280l0Y
            r0 = 0
            if (r1 == 0) goto L82
            X.0l0Y r2 = (X.AbstractC1341280l0Y) r2
        L9:
            r6 = -1
            if (r2 == 0) goto L7c
            android.util.Size r0 = r2.LIZ()
            if (r0 == 0) goto L7c
            int r3 = r0.getWidth()
        L16:
            android.util.Size r0 = r2.LIZ()
            if (r0 == 0) goto L80
            int r4 = r0.getHeight()
        L20:
            android.util.Size r0 = r9.LIZJ
            if (r0 == 0) goto L7a
            int r0 = r0.getWidth()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 <= 0) goto L7a
            int r5 = r1.intValue()
        L36:
            android.util.Size r0 = r9.LIZJ
            if (r0 == 0) goto L4c
            int r0 = r0.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 <= 0) goto L4c
            int r6 = r1.intValue()
        L4c:
            r7 = r11
            r2 = r10
            X.0l0M r3 = X.C1341390l0j.LIZIZ(r2, r3, r4, r5, r6, r7)
            boolean r0 = r3.LIZ
            if (r0 == 0) goto L5a
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r8.LJIL = r0
        L5a:
            float r1 = r3.LIZIZ
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L6a
            X.0SNe r0 = X.C720280SNe.LIZ
            r0.getClass()
            X.C720280SNe.LIZ(r8, r1)
        L6a:
            android.util.Size r0 = r3.LIZJ
            int r2 = r0.getWidth()
            int r1 = r0.getHeight()
            int r0 = r3.LIZLLL
            r8.LJJIJIIJI(r2, r1, r0)
            return
        L7a:
            r5 = -1
            goto L36
        L7c:
            r3 = -1
            if (r2 == 0) goto L80
            goto L16
        L80:
            r4 = -1
            goto L20
        L82:
            r2 = r0
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1341180l0O.LIZIZ(X.0kl3, X.0l0R, X.0l16, boolean):void");
    }
}
