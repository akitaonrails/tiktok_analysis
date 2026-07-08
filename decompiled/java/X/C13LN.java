package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: X.13LN, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C13LN extends C13LO {
    public static final CharSequence LJLJLLL(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        if (length < 0) {
            length = 0;
        }
        return LJZI(length, charSequence);
    }

    public static final char LJLLI(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(0);
    }

    public static final Character LJLLILLLL(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static final char LJLLL(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(charSequence.length() - 1);
    }

    public static final Character LJLLLL(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static final CharSequence LJLZ(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence);
        sb.reverse();
        return sb;
    }

    public static final char LJZ(CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            if (length == 1) {
                return charSequence.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final Set<Character> LLD(CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            if (length != 1) {
                int length2 = charSequence.length();
                if (length2 > 128) {
                    length2 = 128;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(C2097908Jt.LIZIZ(length2));
                for (int i = 0; i < charSequence.length(); i++) {
                    linkedHashSet.add(Character.valueOf(charSequence.charAt(i)));
                }
                return linkedHashSet;
            }
            return Collections.singleton(Character.valueOf(charSequence.charAt(0)));
        }
        return C08CX.INSTANCE;
    }

    public static final List LJLJL(int i, CharSequence charSequence) {
        int i2;
        int i3;
        C00Y9.LIZ(i, i);
        int length = charSequence.length();
        int i4 = length / i;
        if (length % i == 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        ArrayList arrayList = new ArrayList(i4 + i2);
        int i5 = 0;
        while (i5 < length) {
            int i6 = i5 + i;
            if (i6 >= 0 && i6 <= length) {
                i3 = i6;
            } else {
                i3 = length;
            }
            arrayList.add(charSequence.subSequence(i5, i3).toString());
            i5 = i6;
            if (i6 < 0) {
                break;
            }
        }
        return arrayList;
    }

    public static final String LJLJLJ(int i, String str) {
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            return str.substring(i);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Requested character count ");
        sbLIZ.append(i);
        sbLIZ.append(" is less than zero.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static final String LJLL(int i, String str) {
        int i2 = 0;
        if (i >= 0) {
            int length = str.length() - i;
            if (length >= 0) {
                i2 = length;
            }
            return LJZL(i2, str);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Requested character count ");
        sbLIZ.append(i);
        sbLIZ.append(" is less than zero.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static final Character LJLLJ(int i, CharSequence charSequence) {
        if (i >= 0 && i < charSequence.length()) {
            return Character.valueOf(charSequence.charAt(i));
        }
        return null;
    }

    public static final char LJLLLLLL(CharSequence charSequence, C19994913Lf c19994913Lf) {
        String str = (String) charSequence;
        if (str.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return str.charAt(c19994913Lf.nextInt(str.length()));
    }

    public static final CharSequence LJZI(int i, CharSequence charSequence) {
        if (i >= 0) {
            int length = charSequence.length();
            if (i > length) {
                i = length;
            }
            return charSequence.subSequence(0, i);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Requested character count ");
        sbLIZ.append(i);
        sbLIZ.append(" is less than zero.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static final String LJZL(int i, String str) {
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            return str.substring(0, i);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Requested character count ");
        sbLIZ.append(i);
        sbLIZ.append(" is less than zero.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static final String LL(int i, String str) {
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            return str.substring(length - i);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Requested character count ");
        sbLIZ.append(i);
        sbLIZ.append(" is less than zero.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }
}
