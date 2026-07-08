package X;

/* JADX INFO: renamed from: X.1Ary, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2192841Ary {
    public final CharSequence LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean LIZ() {
        char cCharAt;
        CharSequence charSequence = this.LIZ;
        int i = this.LIZIZ;
        int i2 = this.LIZJ;
        return i2 == i + 1 && C2192861As0.LIZ(charSequence.charAt(i)) && (cCharAt = charSequence.charAt(i2)) >= '0' && cCharAt <= '9';
    }

    public final boolean LIZIZ() {
        CharSequence charSequence = this.LIZ;
        int i = this.LIZIZ;
        int i2 = this.LIZJ;
        if (i2 != i + 1) {
            return false;
        }
        char cCharAt = charSequence.charAt(i);
        return (C2192861As0.LIZ(cCharAt) || (cCharAt >= '0' && cCharAt <= '9')) && C2192861As0.LIZ(charSequence.charAt(i2));
    }

    public final boolean LIZJ() {
        CharSequence charSequence = this.LIZ;
        int i = this.LIZIZ;
        int i2 = this.LIZJ;
        return C2192861As0.LIZIZ(i, i2, charSequence, 2, 3) || C2192861As0.LIZIZ(i, i2, charSequence, 5, 8) || ((i2 - i) + 1 == 4 && charSequence.charAt(i) == 'r' && charSequence.charAt(i + 1) == 'o' && charSequence.charAt(i + 2) == 'o' && charSequence.charAt(i + 3) == 't');
    }

    public final String toString() {
        return this.LIZ.subSequence(this.LIZIZ, this.LIZJ + 1).toString();
    }

    public C2192841Ary(CharSequence charSequence, int i, int i2) {
        this.LIZ = "";
        this.LIZ = charSequence;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
