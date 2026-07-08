package X;

/* JADX INFO: renamed from: X.12lf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19850912lf extends C19850712ld {
    public C19850912lf(C19507211Tq c19507211Tq, Character ch) {
        super(c19507211Tq, ch);
        if (c19507211Tq.LIZIZ.length == 64) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // X.C19850712ld
    public final AbstractC19850812le LIZJ(C19507211Tq c19507211Tq, Character ch) {
        return new C19850912lf(c19507211Tq, ch);
    }

    public C19850912lf(String str, String str2, Character ch) {
        this(new C19507211Tq(str, str2.toCharArray()), ch);
    }

    @Override // X.C19850712ld, X.AbstractC19850812le
    public final void LIZ(Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        C19862312nV.LIZIZ(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i2] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
            StringBuilder sb = (StringBuilder) appendable;
            sb.append(this.LIZIZ.LIZIZ[i6 >>> 18]);
            sb.append(this.LIZIZ.LIZIZ[(i6 >>> 12) & 63]);
            sb.append(this.LIZIZ.LIZIZ[(i6 >>> 6) & 63]);
            sb.append(this.LIZIZ.LIZIZ[i6 & 63]);
            i2 = i5 + 1;
        }
        if (i2 < i) {
            LIZLLL(appendable, bArr, i2, i - i2);
        }
    }
}
