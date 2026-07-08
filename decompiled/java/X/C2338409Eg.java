package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.09Eg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2338409Eg {
    public static final C2338409Eg LJ = new C2338409Eg(0, "VZCBSIFJD", 0, 1);
    public static final C2338409Eg LJFF = new C2338409Eg(1, "VZCBSIFJD", 1, 2);
    public static final C2338409Eg LJI = new C2338409Eg(2, "VZCBSIFJD", 2, 3);
    public static final C2338409Eg LJII = new C2338409Eg(3, "VZCBSIFJD", 3, 4);
    public static final C2338409Eg LJIIIIZZ = new C2338409Eg(4, "VZCBSIFJD", 4, 5);
    public static final C2338409Eg LJIIIZ = new C2338409Eg(5, "VZCBSIFJD", 5, 6);
    public static final C2338409Eg LJIIJ = new C2338409Eg(6, "VZCBSIFJD", 6, 7);
    public static final C2338409Eg LJIIJJI = new C2338409Eg(7, "VZCBSIFJD", 7, 8);
    public static final C2338409Eg LJIIL = new C2338409Eg(8, "VZCBSIFJD", 8, 9);
    public final int LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final String LIZ() {
        switch (this.LIZ) {
            case 0:
                return "void";
            case 1:
                return "boolean";
            case 2:
                return "char";
            case 3:
                return "byte";
            case 4:
                return "short";
            case 5:
                return "int";
            case 6:
                return "float";
            case 7:
                return "long";
            case 8:
                return "double";
            case BdTuring.TYPE_ECAF /* 9 */:
                int i = 1;
                int i2 = 1;
                while (this.LIZIZ.charAt(this.LIZJ + i2) == '[') {
                    i2++;
                }
                StringBuilder sb = new StringBuilder(LIZIZ(this.LIZJ + i2, this.LIZLLL, this.LIZIZ).LIZ());
                while (this.LIZIZ.charAt(this.LIZJ + i) == '[') {
                    i++;
                }
                while (i > 0) {
                    sb.append("[]");
                    i--;
                }
                return sb.toString();
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return this.LIZIZ.substring(this.LIZJ, this.LIZLLL).replace('/', '.');
            case BdTuring.TYPE_EMAIL /* 11 */:
            default:
                throw new AssertionError();
        }
    }

    public final int hashCode() {
        int i = this.LIZ;
        int iCharAt = (i == 12 ? 10 : i) * 13;
        if (i >= 9) {
            int i2 = this.LIZLLL;
            for (int i3 = this.LIZJ; i3 < i2; i3++) {
                iCharAt = (iCharAt + this.LIZIZ.charAt(i3)) * 17;
            }
        }
        return iCharAt;
    }

    public final String toString() {
        int i = this.LIZ;
        if (i == 10) {
            return this.LIZIZ.substring(this.LIZJ - 1, this.LIZLLL + 1);
        }
        if (i != 12) {
            return this.LIZIZ.substring(this.LIZJ, this.LIZLLL);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('L');
        sbLIZ.append(this.LIZIZ.substring(this.LIZJ, this.LIZLLL));
        sbLIZ.append(';');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2338409Eg)) {
            return false;
        }
        C2338409Eg c2338409Eg = (C2338409Eg) obj;
        int i = this.LIZ;
        int i2 = 10;
        if (i == 12) {
            i = 10;
        }
        int i3 = c2338409Eg.LIZ;
        if (i3 != 12) {
            i2 = i3;
        }
        if (i != i2) {
            return false;
        }
        int i4 = this.LIZJ;
        int i5 = this.LIZLLL;
        int i6 = c2338409Eg.LIZJ;
        if (i5 - i4 != c2338409Eg.LIZLLL - i6) {
            return false;
        }
        while (i4 < i5) {
            if (this.LIZIZ.charAt(i4) != c2338409Eg.LIZIZ.charAt(i6)) {
                return false;
            }
            i4++;
            i6++;
        }
        return true;
    }

    public static C2338409Eg LIZIZ(int i, int i2, String str) {
        char cCharAt = str.charAt(i);
        if (cCharAt != '(') {
            if (cCharAt != 'F') {
                if (cCharAt != 'L') {
                    if (cCharAt != 'S') {
                        if (cCharAt != 'V') {
                            if (cCharAt != 'I') {
                                if (cCharAt != 'J') {
                                    if (cCharAt != 'Z') {
                                        if (cCharAt != '[') {
                                            switch (cCharAt) {
                                                case 'B':
                                                    return LJII;
                                                case 'C':
                                                    return LJI;
                                                case 'D':
                                                    return LJIIL;
                                                default:
                                                    throw new IllegalArgumentException();
                                            }
                                        }
                                        return new C2338409Eg(9, str, i, i2);
                                    }
                                    return LJFF;
                                }
                                return LJIIJJI;
                            }
                            return LJIIIZ;
                        }
                        return LJ;
                    }
                    return LJIIIIZZ;
                }
                return new C2338409Eg(10, str, i + 1, i2 - 1);
            }
            return LJIIJ;
        }
        return new C2338409Eg(11, str, i, i2);
    }

    public C2338409Eg(int i, String str, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = i2;
        this.LIZLLL = i3;
    }
}
