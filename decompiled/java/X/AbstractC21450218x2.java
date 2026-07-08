package X;

import java.util.Locale;

/* JADX INFO: renamed from: X.18x2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21450218x2 extends AbstractC21450518x5 {
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public final StringBuilder LJ;
    public String LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public C21449918wz LJIIIZ;

    public AbstractC21450218x2 LJIIIZ() {
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        AbstractC21450518x5.LIZIZ(this.LJ);
        this.LJFF = null;
        this.LJI = false;
        this.LJII = false;
        this.LJIIIIZZ = false;
        this.LJIIIZ = null;
        return this;
    }

    public final String LJII() {
        String str = this.LIZIZ;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must be false");
        }
        return this.LIZIZ;
    }

    public final void LJIIIIZZ() {
        if (this.LJIIIZ == null) {
            this.LJIIIZ = new C21449918wz();
        }
        String str = this.LIZLLL;
        if (str != null) {
            String strTrim = str.trim();
            this.LIZLLL = strTrim;
            if (strTrim.length() > 0) {
                String string = this.LJII ? this.LJ.length() > 0 ? this.LJ.toString() : this.LJFF : this.LJI ? "" : null;
                C21449918wz c21449918wz = this.LJIIIZ;
                String str2 = this.LIZLLL;
                int iLIZJ = c21449918wz.LIZJ(str2);
                if (iLIZJ != -1) {
                    c21449918wz.LLILLL[iLIZJ] = string;
                } else {
                    int i = c21449918wz.LL;
                    int i2 = i + 1;
                    if (i2 < i) {
                        throw new IllegalArgumentException("Must be true");
                    }
                    String[] strArr = c21449918wz.LLILLJJLI;
                    int length = strArr.length;
                    if (length < i2) {
                        int i3 = length >= 4 ? i * 2 : 4;
                        if (i2 <= i3) {
                            i2 = i3;
                        }
                        String[] strArr2 = new String[i2];
                        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i2));
                        c21449918wz.LLILLJJLI = strArr2;
                        String[] strArr3 = c21449918wz.LLILLL;
                        String[] strArr4 = new String[i2];
                        System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i2));
                        c21449918wz.LLILLL = strArr4;
                    }
                    String[] strArr5 = c21449918wz.LLILLJJLI;
                    int i4 = c21449918wz.LL;
                    strArr5[i4] = str2;
                    c21449918wz.LLILLL[i4] = string;
                    c21449918wz.LL = i4 + 1;
                }
            }
        }
        this.LIZLLL = null;
        this.LJI = false;
        this.LJII = false;
        AbstractC21450518x5.LIZIZ(this.LJ);
        this.LJFF = null;
    }

    @Override // X.AbstractC21450518x5
    public /* bridge */ /* synthetic */ AbstractC21450518x5 LIZ() {
        LJIIIZ();
        return this;
    }

    public AbstractC21450218x2(EnumC21448718wn enumC21448718wn) {
        super(enumC21448718wn);
        this.LJ = new StringBuilder();
        this.LJI = false;
        this.LJII = false;
        this.LJIIIIZZ = false;
    }

    public final void LIZJ(char c) {
        String strValueOf = String.valueOf(c);
        String str = this.LIZLLL;
        if (str != null) {
            strValueOf = str.concat(strValueOf);
        }
        this.LIZLLL = strValueOf;
    }

    public final void LIZLLL(char c) {
        this.LJII = true;
        String str = this.LJFF;
        if (str != null) {
            this.LJ.append(str);
            this.LJFF = null;
        }
        this.LJ.append(c);
    }

    public final void LJ(String str) {
        this.LJII = true;
        String str2 = this.LJFF;
        if (str2 != null) {
            this.LJ.append(str2);
            this.LJFF = null;
        }
        if (this.LJ.length() == 0) {
            this.LJFF = str;
        } else {
            this.LJ.append(str);
        }
    }

    public final void LJFF(int[] iArr) {
        this.LJII = true;
        String str = this.LJFF;
        if (str != null) {
            this.LJ.append(str);
            this.LJFF = null;
        }
        for (int i : iArr) {
            this.LJ.appendCodePoint(i);
        }
    }

    public final void LJI(String str) {
        String lowerCase;
        String str2 = this.LIZIZ;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.LIZIZ = str;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ENGLISH);
        } else {
            lowerCase = "";
        }
        this.LIZJ = lowerCase;
    }
}
