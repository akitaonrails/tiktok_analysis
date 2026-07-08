package X;

import java.util.Locale;

/* JADX INFO: renamed from: X.0VKj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795990VKj {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final int LJI;

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZJ) * 31) + (this.LIZLLL ? 1231 : 1237)) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Column{name='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", type='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", affinity='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", notNull=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", primaryKeyPosition=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", defaultValue='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C795990VKj)) {
            return false;
        }
        C795990VKj c795990VKj = (C795990VKj) obj;
        if (this.LJ != c795990VKj.LJ || !this.LIZ.equals(c795990VKj.LIZ) || this.LIZLLL != c795990VKj.LIZLLL) {
            return false;
        }
        if (this.LJI == 1 && c795990VKj.LJI == 2 && (str2 = this.LJFF) != null && !LIZ(str2, c795990VKj.LJFF)) {
            return false;
        }
        if (this.LJI == 2 && c795990VKj.LJI == 1 && (str = c795990VKj.LJFF) != null && !LIZ(str, this.LJFF)) {
            return false;
        }
        int i = this.LJI;
        if (i != 0 && i == c795990VKj.LJI) {
            String str3 = this.LJFF;
            if (str3 != null) {
                if (!LIZ(str3, c795990VKj.LJFF)) {
                    return false;
                }
            } else if (c795990VKj.LJFF != null) {
                return false;
            }
        }
        if (this.LIZJ == c795990VKj.LIZJ) {
            return true;
        }
        return false;
    }

    public static boolean LIZ(String str, String str2) {
        if (str2 == null) {
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    if (i == 0) {
                        if (cCharAt != '(') {
                            break;
                        }
                    } else {
                        if (cCharAt != '(') {
                            if (cCharAt == ')' && i2 - 1 == 0 && i != str.length() - 1) {
                                return false;
                            }
                        }
                        i++;
                    }
                    i2++;
                    i++;
                } else if (i2 == 0) {
                    return str.substring(1, str.length() - 1).trim().equals(str2);
                }
            }
        }
        return false;
    }

    public C795990VKj(int i, int i2, String str, String str2, String str3, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZLLL = z;
        this.LJ = i;
        int i3 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i3 = 3;
            } else if (!upperCase.contains("CHAR") && !upperCase.contains("CLOB") && !upperCase.contains("TEXT")) {
                if (!upperCase.contains("BLOB")) {
                    i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            } else {
                i3 = 2;
            }
        }
        this.LIZJ = i3;
        this.LJFF = str3;
        this.LJI = i2;
    }
}
