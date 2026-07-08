package X;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08Lh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2101908Lh {
    public static final char[] LIZ = "0123456789ABCDEF".toCharArray();
    public static final boolean[] LIZIZ;

    static {
        boolean[] zArr = new boolean[123];
        zArr[45] = true;
        zArr[46] = true;
        zArr[95] = true;
        char c = '0';
        do {
            zArr[c] = true;
            c = (char) (c + 1);
        } while (c < ':');
        char c2 = 'A';
        do {
            zArr[c2] = true;
            c2 = (char) (c2 + 1);
        } while (c2 < '[');
        char c3 = 'a';
        do {
            zArr[c3] = true;
            c3 = (char) (c3 + 1);
        } while (c3 < '{');
        LIZIZ = zArr;
    }

    public static String LIZ(String str) {
        String string;
        if (str.length() != 0) {
            StringBuilder sb = null;
            int i = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                if ((Intrinsics.LJI(cCharAt, 122) <= 0 && LIZIZ[cCharAt]) || a0.LJJIJ("", cCharAt)) {
                    if (sb != null) {
                        sb.append(cCharAt);
                    }
                    i++;
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(str.length());
                        sb.append((CharSequence) str, 0, i);
                    }
                    if (i >= 0 && i < str.length()) {
                        char cCharAt2 = str.charAt(i);
                        boolean zIsHighSurrogate = Character.isHighSurrogate(cCharAt2);
                        int iCharValue = cCharAt2;
                        if (zIsHighSurrogate) {
                            Character chLJLLJ = C13LN.LJLLJ(i + 1, str);
                            iCharValue = cCharAt2;
                            if (chLJLLJ != null) {
                                iCharValue = cCharAt2;
                                if (Character.isLowSurrogate(chLJLLJ.charValue())) {
                                    iCharValue = ((cCharAt2 << '\n') + chLJLLJ.charValue()) - 56613888;
                                }
                            }
                        }
                        if (iCharValue < 128) {
                            sb.append("%");
                            char[] cArr = LIZ;
                            sb.append(cArr[(iCharValue >> 4) & 15]);
                            sb.append(cArr[iCharValue & 15]);
                        } else if ((iCharValue >>> 16) == 0) {
                            byte[] bArrLJIILLIIL = u.LJIILLIIL(String.valueOf(cCharAt));
                            for (byte b : bArrLJIILLIIL) {
                                sb.append("%");
                                char[] cArr2 = LIZ;
                                sb.append(cArr2[(b >> 4) & 15]);
                                sb.append(cArr2[b & 15]);
                            }
                        } else if (65536 <= iCharValue && iCharValue < 1114112) {
                            for (byte b2 : u.LJIILLIIL(new String(new char[]{(char) ((iCharValue >>> 10) + 55232), (char) ((iCharValue & 1023) + 56320)}))) {
                                sb.append("%");
                                char[] cArr3 = LIZ;
                                sb.append(cArr3[(b2 >> 4) & 15]);
                                sb.append(cArr3[b2 & 15]);
                            }
                            i += 2;
                        }
                        i++;
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("index ");
                        sbLIZ.append(i);
                        sbLIZ.append(" was not in range ");
                        sbLIZ.append(new IntRange(0, str.length() - 1));
                        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }
            if (sb != null && (string = sb.toString()) != null) {
                return string;
            }
        }
        return str;
    }
}
