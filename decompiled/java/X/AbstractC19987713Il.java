package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Il, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19987713Il {
    public int LIZ;
    public String LIZJ;
    public final C19988513It LIZIZ = new C19988513It();
    public final StringBuilder LIZLLL = new StringBuilder();

    public static boolean LJIJI(char c) {
        return (c == ',' || c == ':' || c == ']' || c == '}') ? false : true;
    }

    public abstract boolean LIZJ();

    public abstract String LJ();

    public abstract byte LJFF();

    public abstract void LJII(char c);

    public void LJIILIIL() {
    }

    public abstract CharSequence LJIJ();

    public abstract String LJIJJ(String str, boolean z);

    public abstract int LJJ(int i);

    public abstract int LJJI();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final long LJIIIIZZ() {
        boolean z;
        int iLJJ = LJJ(LJJI());
        ?? r7 = 0;
        if (iLJJ >= LJIJ().length() || iLJJ == -1) {
            LJIILLIIL(this, "EOF", 0, null, 6);
            throw null;
        }
        if (LJIJ().charAt(iLJJ) == '\"') {
            iLJJ++;
            if (iLJJ == LJIJ().length()) {
                LJIILLIIL(this, "EOF", 0, null, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i = iLJJ;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        long j = 0;
        long j2 = 0;
        while (i != LJIJ().length()) {
            char cCharAt = LJIJ().charAt(i);
            if ((cCharAt == 'e' || cCharAt == 'E') && !z2) {
                if (i == iLJJ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unexpected symbol ");
                    sbLIZ.append(cCharAt);
                    sbLIZ.append(" in numeric literal");
                    LJIILLIIL(this, C2188811AlT.LIZIZ(sbLIZ), 0, r7, 6);
                    throw r7;
                }
                i++;
                z2 = true;
                r7 = r7;
            } else if (cCharAt != '-' || !z2) {
                r7 = 0;
                r7 = 0;
                if (cCharAt != '+' || !z2) {
                    if (cCharAt != '-') {
                        if (C13JC.LIZ(cCharAt) != 0) {
                            break;
                        }
                        i++;
                        int i2 = cCharAt - '0';
                        if (i2 < 0 || i2 >= 10) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Unexpected symbol '");
                            sbLIZ2.append(cCharAt);
                            sbLIZ2.append("' in numeric literal");
                            LJIILLIIL(this, C2188811AlT.LIZIZ(sbLIZ2), 0, null, 6);
                            throw null;
                        }
                        if (z2) {
                            j2 = (j2 * ((long) 10)) + ((long) i2);
                        } else {
                            j = (j * ((long) 10)) - ((long) i2);
                            if (j > 0) {
                                LJIILLIIL(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                        }
                        r7 = 0;
                    } else {
                        if (i != iLJJ) {
                            LJIILLIIL(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        i++;
                        z3 = true;
                    }
                } else {
                    if (i == iLJJ) {
                        LJIILLIIL(this, "Unexpected symbol '+' in numeric literal", 0, null, 6);
                        throw null;
                    }
                    i++;
                }
            } else {
                if (i == iLJJ) {
                    LJIILLIIL(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                    throw null;
                }
                i++;
                r7 = 0;
                z4 = false;
            }
            z4 = true;
        }
        boolean z5 = i != iLJJ;
        if (iLJJ == i || (z3 && iLJJ == i - 1)) {
            LJIILLIIL(this, "Expected numeric literal", 0, null, 6);
            throw null;
        }
        if (z) {
            if (!z5) {
                LJIILLIIL(this, "EOF", 0, null, 6);
                throw null;
            }
            if (LJIJ().charAt(i) != '\"') {
                LJIILLIIL(this, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            i++;
        }
        this.LIZ = i;
        if (z2) {
            double dPow = j * (!z4 ? Math.pow(10.0d, -j2) : Math.pow(10.0d, j2));
            if (dPow > 9.223372036854776E18d || dPow < -9.223372036854776E18d) {
                LJIILLIIL(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(dPow) != dPow) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Can't convert ");
                sbLIZ3.append(dPow);
                sbLIZ3.append(" to Long");
                LJIILLIIL(this, C2188811AlT.LIZIZ(sbLIZ3), 0, null, 6);
                throw null;
            }
            j = (long) dPow;
        }
        if (z3) {
            return j;
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        LJIILLIIL(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public final String LJIIIZ() {
        String str = this.LIZJ;
        if (str == null) {
            return LJ();
        }
        this.LIZJ = null;
        return str;
    }

    public final String LJIIJJI() {
        String string;
        String str = this.LIZJ;
        if (str != null) {
            this.LIZJ = null;
            return str;
        }
        int iLJJI = LJJI();
        if (iLJJI >= LJIJ().length() || iLJJI == -1) {
            LJIILLIIL(this, "EOF", iLJJI, null, 4);
            throw null;
        }
        byte bLIZ = C13JC.LIZ(LJIJ().charAt(iLJJI));
        if (bLIZ == 1) {
            return LJIIIZ();
        }
        if (bLIZ != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected beginning of the string, but got ");
            sbLIZ.append(LJIJ().charAt(iLJJI));
            LJIILLIIL(this, C2188811AlT.LIZIZ(sbLIZ), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (C13JC.LIZ(LJIJ().charAt(iLJJI)) == 0) {
            iLJJI++;
            if (iLJJI >= LJIJ().length()) {
                LIZIZ(this.LIZ, iLJJI);
                int iLJJ = LJJ(iLJJI);
                if (iLJJ == -1) {
                    this.LIZ = iLJJI;
                    LIZIZ(0, 0);
                    String string2 = this.LIZLLL.toString();
                    this.LIZLLL.setLength(0);
                    return string2;
                }
                iLJJI = iLJJ;
                z = true;
            }
        }
        if (z) {
            LIZIZ(this.LIZ, iLJJI);
            string = this.LIZLLL.toString();
            this.LIZLLL.setLength(0);
        } else {
            string = LJJIFFI(this.LIZ, iLJJI);
        }
        this.LIZ = iLJJI;
        return string;
    }

    public final String LJIIL() {
        String strLJIIJJI = LJIIJJI();
        if (!Intrinsics.LJFF(strLJIIJJI, "null") || LJIJ().charAt(this.LIZ - 1) == '\"') {
            return strLJIIJJI;
        }
        LJIILLIIL(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public final void LJIILJJIL() {
        if (LJFF() == 10) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected EOF after parsing, but had ");
        sbLIZ.append(LJIJ().charAt(this.LIZ - 1));
        sbLIZ.append(" instead");
        LJIILLIIL(this, C2188811AlT.LIZIZ(sbLIZ), 0, null, 6);
        throw null;
    }

    public byte LJIJJLI() {
        CharSequence charSequenceLJIJ = LJIJ();
        int i = this.LIZ;
        while (true) {
            int iLJJ = LJJ(i);
            if (iLJJ == -1) {
                this.LIZ = iLJJ;
                return (byte) 10;
            }
            char cCharAt = charSequenceLJIJ.charAt(iLJJ);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.LIZ = iLJJ;
                return C13JC.LIZ(cCharAt);
            }
            i = iLJJ + 1;
        }
    }

    public final boolean LJJII() {
        int iLJJI = LJJI();
        CharSequence charSequenceLJIJ = LJIJ();
        if (iLJJI >= charSequenceLJIJ.length() || iLJJI == -1 || charSequenceLJIJ.charAt(iLJJI) != ',') {
            return false;
        }
        this.LIZ++;
        return true;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JsonReader(source='");
        sbLIZ.append((Object) LJIJ());
        sbLIZ.append("', currentPosition=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final byte LJI(byte b) {
        String strValueOf;
        byte bLJFF = LJFF();
        if (bLJFF != b) {
            String strLIZIZ = C13JC.LIZIZ(b);
            int i = this.LIZ;
            int i2 = i - 1;
            if (i != LJIJ().length() && i2 >= 0) {
                strValueOf = String.valueOf(LJIJ().charAt(i2));
            } else {
                strValueOf = "EOF";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected ");
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(", but had '");
            sbLIZ.append(strValueOf);
            sbLIZ.append("' instead");
            LJIILLIIL(this, C2188811AlT.LIZIZ(sbLIZ), i2, null, 4);
            throw null;
        }
        return bLJFF;
    }

    public final String LJIL(boolean z) {
        String strLJIIIZ;
        byte bLJIJJLI = LJIJJLI();
        if (z) {
            if (bLJIJJLI != 1 && bLJIJJLI != 0) {
                return null;
            }
            strLJIIIZ = LJIIJJI();
        } else {
            if (bLJIJJLI != 1) {
                return null;
            }
            strLJIIIZ = LJIIIZ();
        }
        this.LIZJ = strLJIIIZ;
        return strLJIIIZ;
    }

    public final boolean LJJIII(boolean z) {
        int iLJJ = LJJ(LJJI());
        int length = LJIJ().length() - iLJJ;
        if (length < 4 || iLJJ == -1) {
            return false;
        }
        int i = 0;
        while ("null".charAt(i) == LJIJ().charAt(iLJJ + i)) {
            i++;
            if (i >= 4) {
                if (length > 4 && C13JC.LIZ(LJIJ().charAt(iLJJ + 4)) == 0) {
                    return false;
                }
                if (z) {
                    this.LIZ = iLJJ + 4;
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    public final void LJJIIJ(char c) {
        String strValueOf;
        int i = this.LIZ;
        if (i > 0 && c == '\"') {
            try {
                this.LIZ = i - 1;
                String strLJIIJJI = LJIIJJI();
                this.LIZ = i;
                if (Intrinsics.LJFF(strLJIIJJI, "null")) {
                    LJIILL(this.LIZ - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZ = i;
                throw th;
            }
        }
        String strLIZIZ = C13JC.LIZIZ(C13JC.LIZ(c));
        int i2 = this.LIZ;
        int i3 = i2 - 1;
        if (i2 != LJIJ().length() && i3 >= 0) {
            strValueOf = String.valueOf(LJIJ().charAt(i3));
        } else {
            strValueOf = "EOF";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected ");
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(", but had '");
        sbLIZ.append(strValueOf);
        sbLIZ.append("' instead");
        LJIILLIIL(this, C2188811AlT.LIZIZ(sbLIZ), i3, null, 4);
        throw null;
    }

    public final int LIZ(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 >= charSequence.length()) {
            this.LIZ = i;
            LJIILIIL();
            if (this.LIZ + 4 < charSequence.length()) {
                return LIZ(this.LIZ, charSequence);
            }
            LJIILLIIL(this, "Unexpected EOF during unicode escape", 0, null, 6);
            throw null;
        }
        this.LIZLLL.append((char) ((LJIIZILJ(i, charSequence) << 12) + (LJIIZILJ(i + 1, charSequence) << 8) + (LJIIZILJ(i + 2, charSequence) << 4) + LJIIZILJ(i + 3, charSequence)));
        return i2;
    }

    public void LIZIZ(int i, int i2) {
        this.LIZLLL.append(LJIJ(), i, i2);
    }

    public final void LIZLLL(int i, String str) {
        if (LJIJ().length() - i >= str.length()) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (str.charAt(i2) != (LJIJ().charAt(i + i2) | ' ')) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Expected valid boolean literal prefix, but had '");
                    sbLIZ.append(LJIIJJI());
                    sbLIZ.append('\'');
                    LJIILLIIL(this, C2188811AlT.LIZIZ(sbLIZ), 0, null, 6);
                    throw null;
                }
            }
            this.LIZ = i + str.length();
            return;
        }
        LJIILLIIL(this, "Unexpected end of boolean literal", 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        if (r2 < 'g') goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        return (r2 - r1) + 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0021, code lost:
    
        if (r2 < 'G') goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIIZILJ(int r5, java.lang.CharSequence r6) {
        /*
            r4 = this;
            char r2 = r6.charAt(r5)
            r3 = 0
            r1 = 48
            if (r1 > r2) goto L24
            r0 = 58
            if (r2 >= r0) goto Lf
            int r2 = r2 - r1
            return r2
        Lf:
            r1 = 97
            if (r1 > r2) goto L1b
            r0 = 103(0x67, float:1.44E-43)
            if (r2 >= r0) goto L24
        L17:
            int r2 = r2 - r1
            int r2 = r2 + 10
            return r2
        L1b:
            r1 = 65
            if (r1 > r2) goto L24
            r0 = 71
            if (r2 >= r0) goto L24
            goto L17
        L24:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Invalid toHexChar char '"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "' in unicode escape"
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            r1 = 6
            r0 = 0
            LJIILLIIL(r4, r2, r3, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC19987713Il.LJIIZILJ(int, java.lang.CharSequence):int");
    }

    public String LJJIFFI(int i, int i2) {
        return LJIJ().subSequence(i, i2).toString();
    }

    public final String LJIIJ(int i, int i2, CharSequence charSequence) {
        String string;
        char c;
        char cCharAt = charSequence.charAt(i2);
        boolean z = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                LIZIZ(i, i2);
                int iLJJ = LJJ(i2 + 1);
                if (iLJJ != -1) {
                    int iLIZ = iLJJ + 1;
                    char cCharAt2 = LJIJ().charAt(iLJJ);
                    if (cCharAt2 == 'u') {
                        iLIZ = LIZ(iLIZ, LJIJ());
                    } else if (cCharAt2 < 'u' && (c = C13JH.LIZ[cCharAt2]) != 0) {
                        this.LIZLLL.append(c);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Invalid escaped char '");
                        sbLIZ.append(cCharAt2);
                        sbLIZ.append('\'');
                        LJIILLIIL(this, C2188811AlT.LIZIZ(sbLIZ), 0, null, 6);
                        throw null;
                    }
                    i = LJJ(iLIZ);
                    if (i == -1) {
                        LJIILLIIL(this, "Unexpected EOF", i, null, 4);
                        throw null;
                    }
                } else {
                    LJIILLIIL(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
            } else {
                i2++;
                if (i2 >= charSequence.length()) {
                    LIZIZ(i, i2);
                    i = LJJ(i2);
                    if (i == -1) {
                        LJIILLIIL(this, "Unexpected EOF", i, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                    cCharAt = charSequence.charAt(i2);
                }
            }
            i2 = i;
            z = true;
            cCharAt = charSequence.charAt(i2);
        }
        if (!z) {
            string = LJJIFFI(i, i2);
        } else {
            LIZIZ(i, i2);
            string = this.LIZLLL.toString();
            this.LIZLLL.setLength(0);
        }
        this.LIZ = i2 + 1;
        return string;
    }

    public final void LJIILL(int i, String str, String str2) {
        String strLIZIZ;
        if (str2.length() == 0) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('\n');
            sbLIZ.append(str2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(" at path: ");
        sbLIZ2.append(this.LIZIZ.LIZ());
        sbLIZ2.append(strLIZIZ);
        throw C19988213Iq.LJ(C2188811AlT.LIZIZ(sbLIZ2), LJIJ(), i);
    }

    public static /* synthetic */ void LJIILLIIL(AbstractC19987713Il abstractC19987713Il, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = abstractC19987713Il.LIZ;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        abstractC19987713Il.LJIILL(i, str, str2);
        throw null;
    }
}
