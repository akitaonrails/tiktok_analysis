package X;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: X.12mK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19855012mK extends AbstractC19855312mN {
    public final byte[] LLILLJJLI;

    public int LJIIIZ() {
        return 0;
    }

    @Override // X.AbstractC19854812mI
    public int zzb() {
        return this.LLILLJJLI.length;
    }

    public C19855012mK(byte[] bArr) {
        super(0);
        bArr.getClass();
        this.LLILLJJLI = bArr;
    }

    @Override // X.AbstractC19854812mI
    public final void LJ(AbstractC19855412mO abstractC19855412mO) {
        abstractC19855412mO.LIZ(LJIIIZ(), this.LLILLJJLI, zzb());
    }

    @Override // X.AbstractC19854812mI
    public byte LJFF(int i) {
        return this.LLILLJJLI[i];
    }

    @Override // X.AbstractC19854812mI
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC19854812mI) || zzb() != ((AbstractC19854812mI) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (obj instanceof C19855012mK) {
            C19855012mK c19855012mK = (C19855012mK) obj;
            int i = this.zzc;
            int i2 = c19855012mK.zzc;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            int iZzb = zzb();
            if (iZzb <= c19855012mK.zzb()) {
                if (iZzb <= c19855012mK.zzb()) {
                    byte[] bArr = this.LLILLJJLI;
                    byte[] bArr2 = c19855012mK.LLILLJJLI;
                    int iLJIIIZ = LJIIIZ() + iZzb;
                    int iLJIIIZ2 = LJIIIZ();
                    int iLJIIIZ3 = c19855012mK.LJIIIZ();
                    while (iLJIIIZ2 < iLJIIIZ) {
                        if (bArr[iLJIIIZ2] != bArr2[iLJIIIZ3]) {
                            return false;
                        }
                        iLJIIIZ2++;
                        iLJIIIZ3++;
                    }
                    return true;
                }
                throw new IllegalArgumentException("Ran off end of other: 0, " + iZzb + ", " + c19855012mK.zzb());
            }
            throw new IllegalArgumentException("Length too large: " + iZzb + zzb());
        }
        return obj.equals(this);
    }

    @Override // X.AbstractC19854812mI
    public byte zza(int i) {
        return this.LLILLJJLI[i];
    }

    @Override // X.AbstractC19854812mI
    public final int LJIIIIZZ(int i, int i2) {
        byte[] bArr = this.LLILLJJLI;
        int iLJIIIZ = LJIIIZ();
        Charset charset = C19856912md.LIZ;
        for (int i3 = iLJIIIZ; i3 < iLJIIIZ + i2; i3++) {
            i = (i * 31) + bArr[i3];
        }
        return i;
    }

    @Override // X.AbstractC19854812mI
    public final AbstractC19854812mI zza(int i, int i2) {
        final int iLIZJ = AbstractC19854812mI.LIZJ(0, i2, zzb());
        if (iLIZJ == 0) {
            return AbstractC19854812mI.zza;
        }
        final byte[] bArr = this.LLILLJJLI;
        final int iLJIIIZ = LJIIIZ();
        return new C19855012mK(bArr, iLJIIIZ, iLIZJ) { // from class: X.12mJ
            public final int LLILLL;
            public final int LLILZ;

            @Override // X.C19855012mK
            public final int LJIIIZ() {
                return this.LLILLL;
            }

            @Override // X.C19855012mK, X.AbstractC19854812mI
            public final int zzb() {
                return this.LLILZ;
            }

            @Override // X.C19855012mK, X.AbstractC19854812mI
            public final byte LJFF(int i3) {
                return this.LLILLJJLI[this.LLILLL + i3];
            }

            @Override // X.C19855012mK, X.AbstractC19854812mI
            public final byte zza(int i3) {
                int i4 = this.LLILZ;
                if (((i4 - (i3 + 1)) | i3) < 0) {
                    if (i3 < 0) {
                        throw new ArrayIndexOutOfBoundsException("Index < 0: " + i3);
                    }
                    throw new ArrayIndexOutOfBoundsException("Index > length: " + i3 + ", " + i4);
                }
                return this.LLILLJJLI[this.LLILLL + i3];
            }

            {
                super(bArr);
                AbstractC19854812mI.LIZJ(iLJIIIZ, iLJIIIZ + iLIZJ, bArr.length);
                this.LLILLL = iLJIIIZ;
                this.LLILZ = iLIZJ;
            }
        };
    }
}
