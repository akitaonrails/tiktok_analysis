package X;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: X.12mR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19855712mR extends AbstractC19855912mT {
    public final byte[] LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;

    @Override // X.AbstractC19855612mQ
    public final int zze() {
        return this.LLILZ;
    }

    @Override // X.AbstractC19855612mQ
    public final byte LIZJ(int i) {
        return this.LLILLJJLI[this.LLILLL + i];
    }

    @Override // X.AbstractC19855612mQ
    public final void LJFF(C19856212mW c19856212mW) {
        ((C19910212vE) c19856212mW).LJJIFFI(this.LLILLL, this.LLILLJJLI, this.LLILZ);
    }

    @Override // X.AbstractC19855612mQ
    public final boolean LJIIIIZZ(AbstractC19855612mQ abstractC19855612mQ) {
        boolean z = abstractC19855612mQ instanceof C19855812mS;
        if (!z && !(abstractC19855612mQ instanceof C19855712mR)) {
            return abstractC19855612mQ.LJIIIIZZ(this);
        }
        int i = this.LLILZ;
        if (i <= abstractC19855612mQ.zze()) {
            if (i <= abstractC19855612mQ.zze()) {
                if (z) {
                    return AbstractC19855612mQ.LJIIJ(this.LLILLJJLI, this.LLILLL, 0, ((C19855812mS) abstractC19855612mQ).LLILLJJLI, i);
                }
                if (abstractC19855612mQ instanceof C19855712mR) {
                    C19855712mR c19855712mR = (C19855712mR) abstractC19855612mQ;
                    return AbstractC19855612mQ.LJIIJ(this.LLILLJJLI, this.LLILLL, c19855712mR.LLILLL, c19855712mR.LLILLJJLI, i);
                }
                AbstractC19855612mQ abstractC19855612mQZzf = abstractC19855612mQ.zzf(0, i);
                int i2 = this.LLILLL;
                return abstractC19855612mQZzf.equals(zzf(i2, i + i2));
            }
            throw new IllegalArgumentException("Ran off end of other: 0, " + i + ", " + abstractC19855612mQ.zze());
        }
        throw new IllegalArgumentException("Length too large: " + i + i);
    }

    @Override // X.AbstractC19855612mQ
    public final byte zza(int i) {
        int i2 = this.LLILZ;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
        return this.LLILLJJLI[this.LLILLL + i];
    }

    @Override // X.AbstractC19855612mQ
    public final int LJ(int i, int i2) {
        byte[] bArr = this.LLILLJJLI;
        int i3 = this.LLILLL;
        Charset charset = C19856312mX.LIZ;
        for (int i4 = i3; i4 < i3 + i2; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    @Override // X.AbstractC19855612mQ
    public final AbstractC19855612mQ zzf(int i, int i2) {
        int iLJIIIZ = AbstractC19855612mQ.LJIIIZ(i, i2, this.LLILZ);
        if (iLJIIIZ == 0) {
            return AbstractC19855612mQ.zza;
        }
        return new C19855712mR(this.LLILLJJLI, this.LLILLL + i, iLJIIIZ);
    }

    public C19855712mR(byte[] bArr, int i, int i2) {
        AbstractC19855612mQ.LJIIIZ(i, i + i2, bArr.length);
        this.LLILLJJLI = bArr;
        this.LLILLL = i;
        this.LLILZ = i2;
    }
}
