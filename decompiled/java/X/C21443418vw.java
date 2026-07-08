package X;

/* JADX INFO: renamed from: X.18vw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21443418vw {
    /* JADX WARN: Code restructure failed: missing block: B:50:0x007b, code lost:
    
        return -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0050 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(int r7, java.lang.CharSequence r8) {
        /*
            int r0 = r8.length()
            r6 = -1
            if (r7 < r0) goto L8
            return r6
        L8:
            char r0 = r8.charAt(r7)
            r5 = 92
            r2 = 60
            if (r0 == r2) goto L56
            r4 = 0
            r3 = r7
        L14:
            int r0 = r8.length()
            if (r3 >= r0) goto L51
            char r2 = r8.charAt(r3)
            if (r2 == 0) goto L4d
            r1 = 32
            if (r2 == r1) goto L4d
            if (r2 == r5) goto L41
            r0 = 40
            if (r2 == r0) goto L3c
            r0 = 41
            if (r2 == r0) goto L37
            boolean r0 = java.lang.Character.isISOControl(r2)
            if (r0 == 0) goto L4a
            if (r3 == r7) goto L50
        L36:
            return r3
        L37:
            if (r4 == 0) goto L36
            int r4 = r4 + (-1)
            goto L4a
        L3c:
            int r4 = r4 + 1
            if (r4 <= r1) goto L4a
            return r6
        L41:
            int r1 = r3 + 1
            boolean r0 = X.C21439918vN.LIZ(r1, r8)
            if (r0 == 0) goto L4a
            r3 = r1
        L4a:
            int r3 = r3 + 1
            goto L14
        L4d:
            if (r3 == r7) goto L50
            return r3
        L50:
            return r6
        L51:
            int r6 = r8.length()
            return r6
        L56:
            int r7 = r7 + 1
            int r0 = r8.length()
            if (r7 >= r0) goto L7b
            char r1 = r8.charAt(r7)
            r0 = 10
            if (r1 == r0) goto L7b
            if (r1 == r2) goto L7b
            r0 = 62
            if (r1 == r0) goto L78
            if (r1 != r5) goto L56
            int r1 = r7 + 1
            boolean r0 = X.C21439918vN.LIZ(r1, r8)
            if (r0 == 0) goto L56
            r7 = r1
            goto L56
        L78:
            int r0 = r7 + 1
            return r0
        L7b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21443418vw.LIZ(int, java.lang.CharSequence):int");
    }

    public static int LIZIZ(int i, CharSequence charSequence) {
        while (i < charSequence.length()) {
            switch (charSequence.charAt(i)) {
                case '[':
                    return -1;
                case '\\':
                    int i2 = i + 1;
                    if (C21439918vN.LIZ(i2, charSequence)) {
                        i = i2;
                    }
                    break;
                case ']':
                    return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static int LIZJ(int i, CharSequence charSequence) {
        String str = (String) charSequence;
        if (i >= str.length()) {
            return -1;
        }
        char cCharAt = str.charAt(i);
        char c = '\"';
        if (cCharAt != '\"') {
            c = '\'';
            if (cCharAt != '\'') {
                if (cCharAt != '(') {
                    return -1;
                }
                c = ')';
            }
        }
        int iLIZLLL = LIZLLL(c, i + 1, str);
        if (iLIZLLL == -1 || iLIZLLL >= str.length() || str.charAt(iLIZLLL) != c) {
            return -1;
        }
        return iLIZLLL + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZLLL(char r3, int r4, java.lang.CharSequence r5) {
        /*
        L0:
            int r0 = r5.length()
            if (r4 >= r0) goto L27
            char r2 = r5.charAt(r4)
            r0 = 92
            if (r2 != r0) goto L1a
            int r1 = r4 + 1
            boolean r0 = X.C21439918vN.LIZ(r1, r5)
            if (r0 == 0) goto L1a
            r4 = r1
        L17:
            int r4 = r4 + 1
            goto L0
        L1a:
            if (r2 != r3) goto L1d
            return r4
        L1d:
            r0 = 41
            if (r3 != r0) goto L17
            r0 = 40
            if (r2 != r0) goto L17
            r0 = -1
            return r0
        L27:
            int r0 = r5.length()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21443418vw.LIZLLL(char, int, java.lang.CharSequence):int");
    }
}
