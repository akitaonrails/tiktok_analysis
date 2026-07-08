package X;

/* JADX INFO: renamed from: X.0eUp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090970eUp {
    public static final C1090970eUp LIZ = new C1090970eUp();
    public static int LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence LIZ(com.bytedance.android.livesdk.model.message.common.Text r5) {
        /*
            java.lang.String r1 = r5.key
            java.lang.String r0 = ""
            if (r1 == 0) goto L3a
            X.0fNV r2 = X.C1124870fNV.LIZJ()
            java.lang.String r1 = r5.key
            r2.getClass()
            java.lang.String r1 = X.C1124870fNV.LIZIZ(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L3a
            X.0fNV r2 = X.C1124870fNV.LIZJ()
            java.lang.String r1 = r5.key
            r2.getClass()
            java.lang.String r4 = X.C1124870fNV.LIZIZ(r1)
        L26:
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L39
            r3 = 0
            android.text.Spannable r2 = X.C1133830fbx.LJIILJJIL(r4, r5, r3)
            android.text.Spannable r1 = X.C1133830fbx.LIZ
            if (r2 == r1) goto L39
            android.text.Spannable r0 = X.C1133830fbx.LJIILJJIL(r4, r5, r3)
        L39:
            return r0
        L3a:
            java.lang.String r4 = r5.defaultPattern
            if (r4 != 0) goto L26
            r4 = r0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1090970eUp.LIZ(com.bytedance.android.livesdk.model.message.common.Text):java.lang.CharSequence");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051 A[PHI: r2
      0x0051: PHI (r2v2 int) = (r2v1 int), (r2v3 int) binds: [B:16:0x0036, B:18:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(com.bytedance.android.livesdk.model.message.common.TextPiece r6, android.graphics.Paint r7, float r8) {
        /*
            r4 = 1
            float[] r5 = new float[r4]
            com.bytedance.android.livesdk.model.message.common.TextPieceUser r0 = r6.userValue
            com.bytedance.android.live.base.model.user.User r1 = r0.user
            r0 = 0
            java.lang.CharSequence r0 = X.C1133830fbx.LJIILLIIL(r1, r0)
            if (r0 == 0) goto L14
            java.lang.String r3 = r0.toString()
            if (r3 != 0) goto L16
        L14:
            java.lang.String r3 = ""
        L16:
            int r0 = r3.length()
            r2 = 5
            if (r0 <= r2) goto L50
            int r0 = r7.breakText(r3, r4, r8, r5)
            if (r0 < r2) goto L2c
            r2 = r0
            r0 = 8
            if (r2 < r0) goto L2c
            int r2 = r2 + (-3)
            if (r2 < r4) goto L3b
        L2c:
            int r1 = r2 + (-1)
            char r0 = r3.charAt(r1)
            boolean r0 = java.lang.Character.isHighSurrogate(r0)
            if (r0 == 0) goto L51
            r2 = r1
            if (r1 >= r4) goto L51
        L3b:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r0 = 0
            java.lang.String r0 = r3.substring(r0, r4)
            r1.append(r0)
            java.lang.String r0 = "..."
            r1.append(r0)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
        L50:
            return r3
        L51:
            r4 = r2
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1090970eUp.LIZIZ(com.bytedance.android.livesdk.model.message.common.TextPiece, android.graphics.Paint, float):java.lang.String");
    }
}
