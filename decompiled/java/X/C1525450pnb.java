package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0pnb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1525450pnb {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final float LIZ = 1.0f;
    public final float LIZIZ = 0.5f;
    public final int LIZJ = LSPassThroughRecordSizeConfig.DEFAULT;
    public final float LIZLLL = 0.5f;
    public final short LJ = 4;
    public final short LJFF = 32;
    public final Pattern LJI = PatternProtector.compile("\\n\\r?\\n\\Z", 32);
    public final Pattern LJII = PatternProtector.compile("\\A\\r?\\n\\r?\\n", 32);

    /* JADX WARN: Removed duplicated region for block: B:52:0x015b A[LOOP:0: B:3:0x001d->B:52:0x015b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0212 A[LOOP:3: B:65:0x019d->B:78:0x0212, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0163 A[EDGE_INSN: B:94:0x0163->B:53:0x0163 BREAK  A[LOOP:0: B:3:0x001d->B:52:0x015b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0275 A[EDGE_INSN: B:98:0x0275->B:90:0x0275 BREAK  A[LOOP:3: B:65:0x019d->B:78:0x0212], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.util.LinkedList r13) {
        /*
            Method dump skipped, instruction units count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1525450pnb.LIZJ(java.util.LinkedList):void");
    }

    public static String LJIIIZ(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1525440pna c1525440pna = (C1525440pna) it2.next();
            if (c1525440pna.LIZ != EnumC1525460pnc.INSERT) {
                sb.append(c1525440pna.LIZIZ);
            }
        }
        return sb.toString();
    }

    public static String LJIIJ(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1525440pna c1525440pna = (C1525440pna) it2.next();
            if (c1525440pna.LIZ != EnumC1525460pnc.DELETE) {
                sb.append(c1525440pna.LIZIZ);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.util.LinkedList<X.C1525440pna> r16) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1525450pnb.LIZLLL(java.util.LinkedList):void");
    }

    public static int LJFF(String str, String str2) {
        int iMin = Math.min(str.length(), str2.length());
        for (int i = 0; i < iMin; i++) {
            if (str.charAt(i) != str2.charAt(i)) {
                return i;
            }
        }
        return iMin;
    }

    public static int LJI(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        int iMin = Math.min(length, length2);
        for (int i = 1; i <= iMin; i++) {
            if (str.charAt(length - i) != str2.charAt(length2 - i)) {
                return i - 1;
            }
        }
        return iMin;
    }

    public static int LJIIJJI(int i, List list) {
        int length;
        int length2;
        Iterator it2 = list.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C1525440pna c1525440pna = (C1525440pna) it2.next();
            if (c1525440pna.LIZ != EnumC1525460pnc.INSERT) {
                length = c1525440pna.LIZIZ.length() + i2;
            } else {
                length = i2;
            }
            if (c1525440pna.LIZ != EnumC1525460pnc.DELETE) {
                length2 = c1525440pna.LIZIZ.length() + i3;
            } else {
                length2 = i3;
            }
            if (length > i) {
                if (c1525440pna.LIZ == EnumC1525460pnc.DELETE) {
                    return i3;
                }
            } else {
                i2 = length;
                i3 = length2;
            }
        }
        return i3 + (i - i2);
    }

    public final int LJ(String str, String str2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (str.length() != 0 && str2.length() != 0) {
            char cCharAt = str.charAt(str.length() - 1);
            char cCharAt2 = str2.charAt(0);
            boolean z7 = !Character.isLetterOrDigit(cCharAt);
            boolean z8 = !Character.isLetterOrDigit(cCharAt2);
            if (z7 && Character.isWhitespace(cCharAt)) {
                z = true;
            } else {
                z = false;
            }
            if (z8 && Character.isWhitespace(cCharAt2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && Character.getType(cCharAt) == 15) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && Character.getType(cCharAt2) == 15) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z3 && this.LJI.matcher(str).find()) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z4 && this.LJII.matcher(str2).find()) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!z5 && !z6) {
                if (!z3 && !z4) {
                    if (z7) {
                        if (!z) {
                            if (z2) {
                                return 3;
                            }
                        } else {
                            return 2;
                        }
                    } else if (!z && !z2) {
                        if (!z7 && !z8) {
                            return 0;
                        }
                    } else {
                        return 2;
                    }
                    return 1;
                }
                return 4;
            }
            return 5;
        }
        return 6;
    }

    public static String[] LJII(int i, String str, String str2) {
        String strSubstring = str.substring(i, (str.length() / 4) + i);
        int i2 = -1;
        String strLIZIZ = "";
        int iIndexOf = -1;
        String strSubstring2 = "";
        String strSubstring3 = "";
        String strSubstring4 = "";
        String strSubstring5 = "";
        while (true) {
            iIndexOf = str2.indexOf(strSubstring, iIndexOf + 1);
            if (iIndexOf == i2) {
                break;
            }
            int iLJFF = LJFF(str.substring(i), str2.substring(iIndexOf));
            int iLJI = LJI(str.substring(0, i), str2.substring(0, iIndexOf));
            if (strLIZIZ.length() < iLJI + iLJFF) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                int i3 = iIndexOf - iLJI;
                sbLIZ.append(str2.substring(i3, iIndexOf));
                int i4 = iIndexOf + iLJFF;
                sbLIZ.append(str2.substring(iIndexOf, i4));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strSubstring2 = str.substring(0, i - iLJI);
                strSubstring3 = str.substring(i + iLJFF);
                strSubstring4 = str2.substring(0, i3);
                strSubstring5 = str2.substring(i4);
            }
            i2 = -1;
        }
        if (strLIZIZ.length() * 2 >= str.length()) {
            return new String[]{strSubstring2, strSubstring3, strSubstring4, strSubstring5, strLIZIZ};
        }
        return null;
    }

    public final LinkedList LIZ(long j, String str, String str2) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int length = str.length();
        int length2 = str2.length();
        int i7 = ((length + length2) + 1) / 2;
        int i8 = i7 * 2;
        int[] iArr = new int[i8];
        int[] iArr2 = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            iArr[i9] = -1;
            iArr2[i9] = -1;
        }
        int i10 = i7 + 1;
        iArr[i10] = 0;
        iArr2[i10] = 0;
        int i11 = length - length2;
        if (i11 % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < i7 && System.currentTimeMillis() <= j; i16++) {
            int i17 = -i16;
            for (int i18 = i17 + i12; i18 <= i16 - i14; i18 += 2) {
                int i19 = i7 + i18;
                if (i18 == i17 || (i18 != i16 && iArr[i19 - 1] < iArr[i19 + 1])) {
                    i4 = iArr[i19 + 1];
                } else {
                    i4 = iArr[i19 - 1] + 1;
                }
                int i20 = i4 - i18;
                while (i4 < length && i20 < length2 && str.charAt(i4) == str2.charAt(i20)) {
                    i4++;
                    i20++;
                }
                iArr[i19] = i4;
                if (i4 > length) {
                    i14 += 2;
                } else if (i20 > length2) {
                    i12 += 2;
                } else if (z && (i5 = (i7 + i11) - i18) >= 0 && i5 < i8 && (i6 = iArr2[i5]) != -1 && i4 >= length - i6) {
                    return LIZIZ(i4, j, i20, str, str2);
                }
            }
            for (int i21 = i17 + i13; i21 <= i16 - i15; i21 += 2) {
                int i22 = i7 + i21;
                if (i21 == i17 || (i21 != i16 && iArr2[i22 - 1] < iArr2[i22 + 1])) {
                    i = iArr2[i22 + 1];
                } else {
                    i = iArr2[i22 - 1] + 1;
                }
                int i23 = i - i21;
                while (i < length && i23 < length2 && str.charAt((length - i) - 1) == str2.charAt((length2 - i23) - 1)) {
                    i++;
                    i23++;
                }
                iArr2[i22] = i;
                if (i > length) {
                    i15 += 2;
                } else if (i23 > length2) {
                    i13 += 2;
                } else if (!z && (i2 = (i7 + i11) - i21) >= 0 && i2 < i8 && (i3 = iArr[i2]) != -1) {
                    int i24 = (i7 + i3) - i2;
                    if (i3 >= length - i) {
                        return LIZIZ(i3, j, i24, str, str2);
                    }
                }
            }
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(new C1525440pna(EnumC1525460pnc.DELETE, str));
        linkedList.add(new C1525440pna(EnumC1525460pnc.INSERT, str2));
        return linkedList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x015e, code lost:
    
        if (r9 == null) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedList LJIIIIZZ(long r14, java.lang.String r16, java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1525450pnb.LJIIIIZZ(long, java.lang.String, java.lang.String):java.util.LinkedList");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIILIIL(int r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1525450pnb.LJIILIIL(int, java.lang.String, java.lang.String):int");
    }

    public final double LJIIL(int i, int i2, int i3, String str) {
        float length = i / str.length();
        int iAbs = Math.abs(i3 - i2);
        if (this.LIZJ == 0) {
            if (iAbs == 0) {
                return length;
            }
            return 1.0d;
        }
        return length + (iAbs / r0);
    }

    public final LinkedList LIZIZ(int i, long j, int i2, String str, String str2) {
        String strSubstring = str.substring(0, i);
        String strSubstring2 = str2.substring(0, i2);
        String strSubstring3 = str.substring(i);
        String strSubstring4 = str2.substring(i2);
        LinkedList linkedListLJIIIIZZ = LJIIIIZZ(j, strSubstring, strSubstring2);
        linkedListLJIIIIZZ.addAll(LJIIIIZZ(j, strSubstring3, strSubstring4));
        return linkedListLJIIIIZZ;
    }
}
