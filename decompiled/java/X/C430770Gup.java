package X;

/* JADX INFO: renamed from: X.0Gup, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430770Gup {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannableString LIZ(int r12, java.lang.CharSequence r13) {
        /*
            android.text.SpannableString r5 = new android.text.SpannableString
            r5.<init>(r13)
            java.lang.String r7 = r13.toString()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.text.BreakIterator r3 = java.text.BreakIterator.getCharacterInstance()
            r3.setText(r7)
            int r11 = r3.first()
            int r8 = r3.next()
        L1d:
            r1 = r11
            r11 = r8
            r0 = -1
            r6 = 0
            if (r8 == r0) goto L76
            java.lang.String r6 = r7.substring(r1, r8)
            r2 = 0
        L28:
            int r0 = r6.length()
            if (r2 >= r0) goto L53
            int r9 = java.lang.Character.codePointAt(r6, r2)
            int r10 = java.lang.Character.getType(r9)
            r0 = 28
            if (r10 == r0) goto L43
            r0 = 128512(0x1f600, float:1.80084E-40)
            if (r0 > r9) goto L58
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r9 >= r0) goto L70
        L43:
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r2.<init>(r1, r0)
            r4.add(r2)
        L53:
            int r8 = r3.next()
            goto L1d
        L58:
            r0 = 9728(0x2600, float:1.3632E-41)
            if (r0 > r9) goto L6b
            r0 = 10176(0x27c0, float:1.426E-41)
            if (r9 < r0) goto L43
            r0 = 65024(0xfe00, float:9.1118E-41)
            if (r0 > r9) goto L6b
            r0 = 65040(0xfe10, float:9.114E-41)
            if (r9 >= r0) goto L70
            goto L43
        L6b:
            r0 = 8205(0x200d, float:1.1498E-41)
            if (r9 != r0) goto L70
            goto L43
        L70:
            int r0 = java.lang.Character.charCount(r9)
            int r2 = r2 + r0
            goto L28
        L76:
            java.util.Iterator r4 = r4.iterator()
        L7a:
            boolean r0 = r4.hasNext()
            r3 = 33
            if (r0 == 0) goto La8
            java.lang.Object r1 = r4.next()
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r0 = r1.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.lang.Object r0 = r1.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            if (r6 >= r2) goto La6
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r12)
            X.C786410Ut5.p2(r5, r0, r6, r2, r3)
        La6:
            r6 = r1
            goto L7a
        La8:
            int r0 = r5.length()
            if (r6 >= r0) goto Lba
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r12)
            int r0 = r5.length()
            X.C786410Ut5.p2(r5, r1, r6, r0, r3)
        Lba:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C430770Gup.LIZ(int, java.lang.CharSequence):android.text.SpannableString");
    }
}
