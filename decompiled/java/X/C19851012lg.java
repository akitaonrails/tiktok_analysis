package X;

/* JADX INFO: renamed from: X.12lg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19851012lg extends C19850712ld {
    public final char[] LJ;

    public C19851012lg(C19507211Tq c19507211Tq) {
        super(c19507211Tq, null);
        this.LJ = new char[512];
        int i = 0;
        if (c19507211Tq.LIZIZ.length != 16) {
            throw new IllegalArgumentException();
        }
        do {
            char[] cArr = this.LJ;
            char[] cArr2 = c19507211Tq.LIZIZ;
            cArr[i] = cArr2[i >>> 4];
            cArr[i | 256] = cArr2[i & 15];
            i++;
        } while (i < 256);
    }

    @Override // X.C19850712ld
    public final AbstractC19850812le LIZJ(C19507211Tq c19507211Tq, Character ch) {
        return new C19851012lg(c19507211Tq);
    }

    @Override // X.C19850712ld, X.AbstractC19850812le
    public final void LIZ(Appendable appendable, byte[] bArr, int i) {
        C19862312nV.LIZIZ(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            StringBuilder sb = (StringBuilder) appendable;
            sb.append(this.LJ[i3]);
            sb.append(this.LJ[i3 | 256]);
        }
    }
}
