package X;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: X.12mS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19855812mS extends AbstractC19855912mT {
    public final byte[] LLILLJJLI;

    @Override // X.AbstractC19855612mQ
    public final int zze() {
        return this.LLILLJJLI.length;
    }

    public C19855812mS(byte[] bArr) {
        bArr.getClass();
        this.LLILLJJLI = bArr;
    }

    @Override // X.AbstractC19855612mQ
    public final byte LIZJ(int i) {
        return this.LLILLJJLI[i];
    }

    @Override // X.AbstractC19855612mQ
    public final void LJFF(C19856212mW c19856212mW) {
        byte[] bArr = this.LLILLJJLI;
        ((C19910212vE) c19856212mW).LJJIFFI(0, bArr, bArr.length);
    }

    @Override // X.AbstractC19855612mQ
    public final boolean LJIIIIZZ(AbstractC19855612mQ abstractC19855612mQ) {
        if (abstractC19855612mQ instanceof C19855812mS) {
            return Arrays.equals(this.LLILLJJLI, ((C19855812mS) abstractC19855612mQ).LLILLJJLI);
        }
        if (abstractC19855612mQ instanceof C19855712mR) {
            byte[] bArr = this.LLILLJJLI;
            int iZze = abstractC19855612mQ.zze();
            int length = bArr.length;
            if (length <= iZze) {
                if (length <= abstractC19855612mQ.zze()) {
                    C19855712mR c19855712mR = (C19855712mR) abstractC19855612mQ;
                    return AbstractC19855612mQ.LJIIJ(bArr, 0, c19855712mR.LLILLL, c19855712mR.LLILLJJLI, length);
                }
                throw new IllegalArgumentException("Ran off end of other: 0, " + length + ", " + abstractC19855612mQ.zze());
            }
            throw new IllegalArgumentException("Length too large: " + length + length);
        }
        return abstractC19855612mQ.LJIIIIZZ(this);
    }

    @Override // X.AbstractC19855612mQ
    public final byte zza(int i) {
        return this.LLILLJJLI[i];
    }

    @Override // X.AbstractC19855612mQ
    public final int LJ(int i, int i2) {
        byte[] bArr = this.LLILLJJLI;
        Charset charset = C19856312mX.LIZ;
        for (int i3 = 0; i3 < i2; i3++) {
            i = (i * 31) + bArr[i3];
        }
        return i;
    }

    @Override // X.AbstractC19855612mQ
    public final AbstractC19855612mQ zzf(int i, int i2) {
        byte[] bArr = this.LLILLJJLI;
        int iLJIIIZ = AbstractC19855612mQ.LJIIIZ(0, i2, bArr.length);
        if (iLJIIIZ == 0) {
            return AbstractC19855612mQ.zza;
        }
        return new C19855712mR(bArr, 0, iLJIIIZ);
    }
}
