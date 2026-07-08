package X;

/* JADX INFO: renamed from: X.0iMG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1239420iMG {
    public static final C1239420iMG LIZ = new C1239420iMG();
    public static long LIZIZ;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005f, code lost:
    
        r10.setWidth(X.C679280Qkg.LIZ(java.lang.Math.min(130, java.lang.Math.max(X.C679280Qkg.LIZIZ(java.lang.Float.valueOf(r3.getLineWidth(0))), X.C679280Qkg.LIZIZ(java.lang.Float.valueOf(r3.getLineWidth(1)))) + 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        r3 = X.C20588115hH.LIZLLL(r10, r10.getText(), r6, X.C814420VxA.LIZIZ(X.C418440Gaw.LIZIZ(102)), java.lang.Float.valueOf(X.C418440Gaw.LIZIZ(java.lang.Integer.valueOf(r2))), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005d, code lost:
    
        if (r3.getLineCount() <= 1) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float LIZ(com.bytedance.tux.input.TuxTextView r10) {
        /*
            android.text.TextPaint r6 = new android.text.TextPaint
            r6.<init>()
            r2 = 14
        L7:
            r0 = 9
            r3 = 102(0x66, float:1.43E-43)
            r9 = 1
            r1 = 10
            r4 = r10
            if (r0 >= r2) goto L91
            java.lang.CharSequence r5 = r4.getText()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r7 = X.C814420VxA.LIZIZ(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            java.lang.Float r8 = java.lang.Float.valueOf(r0)
            android.text.StaticLayout r0 = X.C20588115hH.LIZLLL(r4, r5, r6, r7, r8, r9)
            int r0 = r0.getLineCount()
            if (r0 != r9) goto L8d
            if (r2 != r1) goto L8b
        L39:
            java.lang.CharSequence r5 = r4.getText()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r7 = X.C814420VxA.LIZIZ(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            java.lang.Float r8 = java.lang.Float.valueOf(r0)
            android.text.StaticLayout r3 = X.C20588115hH.LIZLLL(r4, r5, r6, r7, r8, r9)
            int r0 = r3.getLineCount()
            if (r0 <= r9) goto L8b
            r0 = 0
            float r0 = r3.getLineWidth(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            int r1 = X.C679280Qkg.LIZIZ(r0)
            float r0 = r3.getLineWidth(r9)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            int r0 = X.C679280Qkg.LIZIZ(r0)
            int r0 = java.lang.Math.max(r1, r0)
            int r1 = r0 + 32
            r0 = 130(0x82, float:1.82E-43)
            int r0 = java.lang.Math.min(r0, r1)
            int r0 = X.C679280Qkg.LIZ(r0)
            r4.setWidth(r0)
        L8b:
            float r0 = (float) r2
            return r0
        L8d:
            int r2 = r2 + (-1)
            goto L7
        L91:
            r2 = 10
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1239420iMG.LIZ(com.bytedance.tux.input.TuxTextView):float");
    }
}
