package X;

/* JADX INFO: renamed from: X.0GuW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430580GuW {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:36:0x0072 A[PHI: r1
      0x0072: PHI (r1v2 java.lang.Integer) = (r1v1 java.lang.Integer), (r1v1 java.lang.Integer), (r1v8 java.lang.Integer) binds: [B:31:0x005f, B:33:0x0062, B:35:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(android.widget.TextView r13, float r14, float r15) {
        /*
            java.lang.CharSequence r7 = r13.getText()
            r6 = 0
            r9 = 1
            if (r7 == 0) goto L13
            int r0 = r7.length()
            if (r0 == 0) goto L13
            r0 = 0
        Lf:
            r5 = -1
            if (r0 == 0) goto L15
            return r5
        L13:
            r0 = 1
            goto Lf
        L15:
            android.text.Layout r4 = r13.getLayout()
            if (r4 != 0) goto L1c
            return r5
        L1c:
            int r0 = (int) r15
            int r1 = r4.getLineForVertical(r0)
            int r0 = r4.getParagraphDirection(r1)
            if (r0 != r5) goto Lbb
            r8 = 1
        L28:
            int r3 = r4.getLineStart(r1)
            int r2 = r4.getLineEnd(r1)
            int r2 = r2 - r9
            if (r3 > r2) goto Lbe
        L33:
            boolean r9 = r4.isRtlCharAt(r2)
            if (r8 != r9) goto Lb6
            float r12 = r4.getPrimaryHorizontal(r2)
        L3d:
            if (r9 == 0) goto L48
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 <= 0) goto L4d
        L43:
            if (r2 == r3) goto Lbe
            int r2 = r2 + (-1)
            goto L33
        L48:
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L4d
            goto L43
        L4d:
            int r0 = r2 + 1
            java.lang.CharSequence r11 = r7.subSequence(r2, r0)
            int r0 = r4.getWidth()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 > 0) goto L72
            r0 = 0
            if (r0 != 0) goto L72
            int r0 = r13.getWidth()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 <= 0) goto L43
        L72:
            int r10 = r1.intValue()
            int r1 = r11.length()
            android.text.TextPaint r0 = r13.getPaint()
            android.text.StaticLayout$Builder r1 = android.text.StaticLayout.Builder.obtain(r11, r6, r1, r0, r10)
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            android.text.StaticLayout$Builder r10 = r1.setAlignment(r0)
            float r1 = r13.getLineSpacingExtra()
            float r0 = r13.getLineSpacingMultiplier()
            android.text.StaticLayout$Builder r1 = r10.setLineSpacing(r1, r0)
            boolean r0 = r13.getIncludeFontPadding()
            android.text.StaticLayout$Builder r0 = r1.setIncludePad(r0)
            android.text.StaticLayout r0 = r0.build()
            if (r0 == 0) goto L43
            float r1 = r0.getLineWidth(r6)
            if (r9 == 0) goto Lb3
            float r0 = r12 - r1
        Laa:
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 < 0) goto L43
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L43
            return r2
        Lb3:
            r0 = r12
            float r12 = r12 + r1
            goto Laa
        Lb6:
            float r12 = r4.getSecondaryHorizontal(r2)
            goto L3d
        Lbb:
            r8 = 0
            goto L28
        Lbe:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C430580GuW.LIZ(android.widget.TextView, float, float):int");
    }
}
