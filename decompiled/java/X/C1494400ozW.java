package X;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;

/* JADX INFO: renamed from: X.0ozW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1494400ozW {
    public final Hashtable LIZ = new Hashtable();

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.ensureCapacity(this.LIZ.size() * 16);
        Enumeration enumerationKeys = this.LIZ.keys();
        while (enumerationKeys.hasMoreElements()) {
            String str = (String) enumerationKeys.nextElement();
            stringBuffer.append("; ");
            stringBuffer.append(str);
            stringBuffer.append('=');
            String string = (String) this.LIZ.get(str);
            int length = string.length();
            int i = 0;
            boolean z = false;
            while (true) {
                if (i >= length) {
                    if (z) {
                        break;
                    }
                } else {
                    if (z) {
                        break;
                    }
                    z = !LIZ(string.charAt(i));
                    i++;
                }
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.ensureCapacity((int) (((double) length) * 1.5d));
            stringBuffer2.append('\"');
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = string.charAt(i2);
                if (cCharAt == '\\' || cCharAt == '\"') {
                    stringBuffer2.append('\\');
                }
                stringBuffer2.append(cCharAt);
            }
            stringBuffer2.append('\"');
            string = stringBuffer2.toString();
            stringBuffer.append(string);
        }
        return stringBuffer.toString();
    }

    public C1494400ozW() {
    }

    public C1494400ozW(String str) throws C1494410ozX {
        int length;
        int i;
        String strSubstring;
        if (str != null && (length = str.length()) > 0) {
            int iLIZIZ = LIZIZ(0, str);
            while (iLIZIZ < length && str.charAt(iLIZIZ) == ';') {
                int iLIZIZ2 = LIZIZ(iLIZIZ + 1, str);
                if (iLIZIZ2 < length) {
                    int i2 = iLIZIZ2;
                    while (i2 < length && LIZ(str.charAt(i2))) {
                        i2++;
                    }
                    String lowerCase = str.substring(iLIZIZ2, i2).toLowerCase(Locale.ENGLISH);
                    int iLIZIZ3 = LIZIZ(i2, str);
                    if (iLIZIZ3 < length && str.charAt(iLIZIZ3) == '=') {
                        int iLIZIZ4 = LIZIZ(iLIZIZ3 + 1, str);
                        if (iLIZIZ4 < length) {
                            char cCharAt = str.charAt(iLIZIZ4);
                            if (cCharAt == '\"') {
                                int i3 = iLIZIZ4 + 1;
                                if (i3 < length) {
                                    int i4 = i3;
                                    while (true) {
                                        if (i4 < length) {
                                            cCharAt = str.charAt(i4);
                                            if (cCharAt == '\"') {
                                                break;
                                            }
                                            if (cCharAt == '\\') {
                                                i4++;
                                            }
                                            i4++;
                                        } else if (cCharAt != '\"') {
                                            throw new C1494410ozX("Encountered unterminated quoted parameter value.");
                                        }
                                    }
                                    String strSubstring2 = str.substring(i3, i4);
                                    int length2 = strSubstring2.length();
                                    StringBuffer stringBuffer = new StringBuffer();
                                    stringBuffer.ensureCapacity(length2);
                                    boolean z = false;
                                    for (int i5 = 0; i5 < length2; i5++) {
                                        char cCharAt2 = strSubstring2.charAt(i5);
                                        if (!z) {
                                            if (cCharAt2 != '\\') {
                                                stringBuffer.append(cCharAt2);
                                            } else {
                                                z = true;
                                            }
                                        } else {
                                            stringBuffer.append(cCharAt2);
                                            z = false;
                                        }
                                    }
                                    strSubstring = stringBuffer.toString();
                                    i = i4 + 1;
                                } else {
                                    throw new C1494410ozX("Encountered unterminated quoted parameter value.");
                                }
                            } else if (LIZ(cCharAt)) {
                                i = iLIZIZ4;
                                while (i < length && LIZ(str.charAt(i))) {
                                    i++;
                                }
                                strSubstring = str.substring(iLIZIZ4, i);
                            } else {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Unexpected character encountered at index ");
                                sbLIZ.append(iLIZIZ4);
                                throw new C1494410ozX(C2188811AlT.LIZIZ(sbLIZ));
                            }
                            this.LIZ.put(lowerCase, strSubstring);
                            iLIZIZ = LIZIZ(i, str);
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Couldn't find a value for parameter named ");
                            sbLIZ2.append(lowerCase);
                            throw new C1494410ozX(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    } else {
                        throw new C1494410ozX("Couldn't find the '=' that separates a parameter name from its value.");
                    }
                } else {
                    return;
                }
            }
            if (iLIZIZ < length) {
                throw new C1494410ozX("More characters encountered in input than expected.");
            }
        }
    }

    public static boolean LIZ(char c) {
        if (c > ' ' && c < 127 && "()<>@,;:/[]?=\\\"".indexOf(c) < 0) {
            return true;
        }
        return false;
    }

    public static int LIZIZ(int i, String str) {
        int length = str.length();
        while (i < length && Character.isWhitespace(str.charAt(i))) {
            i++;
        }
        return i;
    }
}
