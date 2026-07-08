package X;

/* JADX INFO: renamed from: X.0kOT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1317670kOT {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0051 A[PHI: r4
      0x0051: PHI (r4v1 boolean) = 
      (r4v0 boolean)
      (r4v0 boolean)
      (r4v0 boolean)
      (r4v0 boolean)
      (r4v0 boolean)
      (r4v0 boolean)
      (r4v0 boolean)
      (r4v2 boolean)
     binds: [B:15:0x0032, B:17:0x0036, B:19:0x003a, B:21:0x003e, B:23:0x0042, B:25:0x0046, B:27:0x004a, B:29:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.StringBuilder r7, int r8) {
        /*
            r6 = this;
            int r0 = r7.length()
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r7.length()
            r4 = 1
            int r0 = r0 - r4
            char r0 = r7.charAt(r0)
            boolean r0 = java.lang.Character.isHighSurrogate(r0)
            if (r0 == 0) goto L1a
            r6.LIZJ = r4
            return
        L1a:
            int r3 = r7.length()
            boolean r0 = r6.LIZJ
            r5 = 2
            if (r0 == 0) goto Lad
            r0 = 2
        L24:
            int r3 = r3 - r0
            int r2 = r7.codePointAt(r3)
            r1 = 0
            if (r8 != r4) goto L65
            java.lang.Character$UnicodeBlock r5 = java.lang.Character.UnicodeBlock.of(r2)
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.BASIC_LATIN
            if (r5 == r0) goto L51
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.LATIN_1_SUPPLEMENT
            if (r5 == r0) goto L51
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.LATIN_EXTENDED_A
            if (r5 == r0) goto L51
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.LATIN_EXTENDED_B
            if (r5 == r0) goto L51
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.GENERAL_PUNCTUATION
            if (r5 == r0) goto L51
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.CURRENCY_SYMBOLS
            if (r5 == r0) goto L51
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.MATHEMATICAL_OPERATORS
            if (r5 == r0) goto L51
            r4 = 0
            boolean r0 = r6.LIZIZ
            if (r0 == 0) goto L62
        L51:
            int r0 = r7.length()
            r7.delete(r3, r0)
            r0 = 8203(0x200b, float:1.1495E-41)
            r7.append(r0)
            r7.appendCodePoint(r2)
            r6.LIZIZ = r4
        L62:
            r6.LIZJ = r1
            return
        L65:
            if (r8 != r5) goto L62
            java.lang.Character$UnicodeBlock r5 = java.lang.Character.UnicodeBlock.of(r2)
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
            if (r5 == r0) goto L96
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
            if (r5 == r0) goto L96
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B
            if (r5 == r0) goto L96
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.CJK_RADICALS_SUPPLEMENT
            if (r5 == r0) goto L96
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
            if (r5 == r0) goto L96
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.KATAKANA
            if (r5 == r0) goto L96
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.HIRAGANA
            if (r5 == r0) goto L96
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS
            if (r5 == r0) goto L96
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.HANGUL_JAMO
            if (r5 == r0) goto L96
            java.lang.Character$UnicodeBlock r0 = java.lang.Character.UnicodeBlock.HANGUL_SYLLABLES
            if (r5 == r0) goto L96
            r6.LIZ = r1
            goto L62
        L96:
            boolean r0 = r6.LIZ
            if (r0 == 0) goto Laa
            int r0 = r7.length()
            r7.delete(r3, r0)
            r0 = 8288(0x2060, float:1.1614E-41)
            r7.append(r0)
            r7.appendCodePoint(r2)
            goto L62
        Laa:
            r6.LIZ = r4
            goto L62
        Lad:
            r0 = 1
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1317670kOT.LIZ(java.lang.StringBuilder, int):void");
    }
}
