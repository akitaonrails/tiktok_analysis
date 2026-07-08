package X;

/* JADX INFO: renamed from: X.12ld, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19850712ld extends AbstractC19850812le {
    public final C19507211Tq LIZIZ;
    public final Character LIZJ;
    public volatile AbstractC19850812le LIZLLL;

    public final int hashCode() {
        int iHashCode = this.LIZIZ.hashCode();
        Character ch = this.LIZJ;
        return iHashCode ^ (ch == null ? 0 : ch.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.LIZIZ);
        if (8 % this.LIZIZ.LIZLLL != 0) {
            if (this.LIZJ == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.LIZJ);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C19850712ld) {
            C19850712ld c19850712ld = (C19850712ld) obj;
            if (this.LIZIZ.equals(c19850712ld.LIZIZ)) {
                Character ch = this.LIZJ;
                Character ch2 = c19850712ld.LIZJ;
                if (ch != ch2) {
                    if (ch != null && ch.equals(ch2)) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public C19850712ld(C19507211Tq c19507211Tq, Character ch) {
        this.LIZIZ = c19507211Tq;
        if (ch != null) {
            ch.charValue();
            byte[] bArr = c19507211Tq.LJI;
            if (bArr.length > 61 && bArr[61] != -1) {
                throw new IllegalArgumentException(C08KQ.LIZ("Padding character %s was already in alphabet", ch));
            }
        }
        this.LIZJ = ch;
    }

    public AbstractC19850812le LIZJ(C19507211Tq c19507211Tq, Character ch) {
        return new C19850712ld(c19507211Tq, ch);
    }

    public C19850712ld(String str, String str2, Character ch) {
        this(new C19507211Tq(str, str2.toCharArray()), ch);
    }

    @Override // X.AbstractC19850812le
    public void LIZ(Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        C19862312nV.LIZIZ(0, i, bArr.length);
        while (i2 < i) {
            LIZLLL(appendable, bArr, i2, Math.min(this.LIZIZ.LJFF, i - i2));
            i2 += this.LIZIZ.LJFF;
        }
    }

    public final void LIZLLL(Appendable appendable, byte[] bArr, int i, int i2) {
        C19862312nV.LIZIZ(i, i + i2, bArr.length);
        int i3 = 0;
        if (i2 <= this.LIZIZ.LJFF) {
            long j = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                j = (j | ((long) (bArr[i + i4] & 255))) << 8;
            }
            int i5 = ((i2 + 1) * 8) - this.LIZIZ.LIZLLL;
            while (i3 < i2 * 8) {
                C19507211Tq c19507211Tq = this.LIZIZ;
                ((StringBuilder) appendable).append(c19507211Tq.LIZIZ[c19507211Tq.LIZJ & ((int) (j >>> (i5 - i3)))]);
                i3 += this.LIZIZ.LIZLLL;
            }
            if (this.LIZJ != null) {
                while (i3 < this.LIZIZ.LJFF * 8) {
                    this.LIZJ.charValue();
                    ((StringBuilder) appendable).append('=');
                    i3 += this.LIZIZ.LIZLLL;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}
