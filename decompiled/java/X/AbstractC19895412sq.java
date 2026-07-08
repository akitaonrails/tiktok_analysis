package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.12sq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19895412sq implements InterfaceC1394580mOW<Character> {
    public abstract boolean LIZLLL(char c);

    public static AbstractC19895412sq LIZ(final CharSequence charSequence) {
        String str = (String) charSequence;
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                if (length != 2) {
                    return new AbstractC19895412sq(charSequence) { // from class: X.12su
                        public final char[] LL;

                        public final String toString() {
                            StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
                            for (char c : this.LL) {
                                sb.append(AbstractC19895412sq.LJIIIIZZ(c));
                            }
                            sb.append("\")");
                            return sb.toString();
                        }

                        {
                            String str2 = (String) charSequence;
                            str2.toString();
                            char[] charArray = str2.toCharArray();
                            this.LL = charArray;
                            Arrays.sort(charArray);
                        }

                        @Override // X.AbstractC19895412sq
                        public final boolean LIZLLL(char c) {
                            if (Arrays.binarySearch(this.LL, c) >= 0) {
                                return true;
                            }
                            return false;
                        }

                        @Override // X.InterfaceC1394580mOW
                        public final boolean apply(Character ch) {
                            return LIZLLL(ch.charValue());
                        }
                    };
                }
                final char cCharAt = str.charAt(0);
                final char cCharAt2 = str.charAt(1);
                return new AbstractC19896212sy(cCharAt, cCharAt2) { // from class: X.12sw
                    public final char LL;
                    public final char LLILLJJLI;

                    public final String toString() {
                        String strLJIIIIZZ = AbstractC19895412sq.LJIIIIZZ(this.LL);
                        String strLJIIIIZZ2 = AbstractC19895412sq.LJIIIIZZ(this.LLILLJJLI);
                        StringBuilder sb = new StringBuilder(String.valueOf(strLJIIIIZZ).length() + 21 + String.valueOf(strLJIIIIZZ2).length());
                        sb.append("CharMatcher.anyOf(\"");
                        sb.append(strLJIIIIZZ);
                        sb.append(strLJIIIIZZ2);
                        sb.append("\")");
                        return sb.toString();
                    }

                    @Override // X.AbstractC19895412sq
                    public final boolean LIZLLL(char c) {
                        if (c != this.LL && c != this.LLILLJJLI) {
                            return false;
                        }
                        return true;
                    }

                    {
                        this.LL = cCharAt;
                        this.LLILLJJLI = cCharAt2;
                    }
                };
            }
            return new C19895712st(str.charAt(0));
        }
        return C19896112sx.LLILLJJLI;
    }

    public static String LJIIIIZZ(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public int LIZJ(CharSequence charSequence) {
        return LIZIZ(0, charSequence);
    }

    public boolean LJ(CharSequence charSequence) {
        String str = (String) charSequence;
        for (int length = str.length() - 1; length >= 0; length--) {
            if (!LIZLLL(str.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean LJFF(CharSequence charSequence) {
        if (LIZJ(charSequence) == -1) {
            return true;
        }
        return false;
    }

    public String LJI(CharSequence charSequence) {
        String string = charSequence.toString();
        int iLIZJ = LIZJ(string);
        if (iLIZJ == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        int i = 1;
        while (true) {
            while (true) {
                iLIZJ++;
                if (iLIZJ == charArray.length) {
                    return new String(charArray, 0, iLIZJ - i);
                }
                if (LIZLLL(charArray[iLIZJ])) {
                    break;
                }
                charArray[iLIZJ - i] = charArray[iLIZJ];
            }
            i++;
        }
    }

    public String LJII(CharSequence charSequence) {
        String string = charSequence.toString();
        int iLIZJ = LIZJ(string);
        if (iLIZJ == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        charArray[iLIZJ] = '.';
        while (true) {
            iLIZJ++;
            if (iLIZJ < charArray.length) {
                if (LIZLLL(charArray[iLIZJ])) {
                    charArray[iLIZJ] = '.';
                }
            } else {
                return new String(charArray);
            }
        }
    }

    public int LIZIZ(int i, CharSequence charSequence) {
        int length = charSequence.length();
        C19864312np.LJIIIIZZ(i, length);
        while (i < length) {
            if (LIZLLL(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
