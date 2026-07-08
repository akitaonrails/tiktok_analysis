package X;

/* JADX INFO: renamed from: X.19kW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21627419kW {
    public static final byte[] LJ = new byte[1792];
    public final CharSequence LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public char LIZLLL;

    static {
        int i = 0;
        do {
            LJ[i] = Character.getDirectionality(i);
            i++;
        } while (i < 1792);
    }

    public final byte LIZ() {
        char cCharAt = this.LIZ.charAt(this.LIZJ - 1);
        this.LIZLLL = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(this.LIZ, this.LIZJ);
            this.LIZJ -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.LIZJ--;
        char c = this.LIZLLL;
        return c < 1792 ? LJ[c] : Character.getDirectionality(c);
    }

    public C21627419kW(CharSequence charSequence) {
        this.LIZ = charSequence;
        this.LIZIZ = charSequence.length();
    }
}
