package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.12lp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19851912lp extends AbstractC19851812lo {
    public final byte[] LL;

    public int LJIIIZ() {
        return 0;
    }

    @Override // X.AbstractC19851412lk
    public int zzd() {
        return this.LL.length;
    }

    @Override // X.AbstractC19851412lk
    public final InputStream zzh() {
        return new ByteArrayInputStream(this.LL, LJIIIZ(), zzd());
    }

    @Override // X.AbstractC19851412lk
    public final ByteBuffer zzi() {
        return ByteBuffer.wrap(this.LL, LJIIIZ(), zzd()).asReadOnlyBuffer();
    }

    public C19851912lp(byte[] bArr) {
        bArr.getClass();
        this.LL = bArr;
    }

    @Override // X.AbstractC19851412lk
    public byte LIZJ(int i) {
        return this.LL[i];
    }

    @Override // X.AbstractC19851412lk
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC19851412lk) || zzd() != ((AbstractC19851412lk) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (obj instanceof C19851912lp) {
            C19851912lp c19851912lp = (C19851912lp) obj;
            int i = this.zzc;
            int i2 = c19851912lp.zzc;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            int iZzd = zzd();
            if (iZzd <= c19851912lp.zzd()) {
                if (iZzd <= c19851912lp.zzd()) {
                    byte[] bArr = this.LL;
                    byte[] bArr2 = c19851912lp.LL;
                    int iLJIIIZ = LJIIIZ() + iZzd;
                    int iLJIIIZ2 = LJIIIZ();
                    int iLJIIIZ3 = c19851912lp.LJIIIZ();
                    while (iLJIIIZ2 < iLJIIIZ) {
                        if (bArr[iLJIIIZ2] != bArr2[iLJIIIZ3]) {
                            return false;
                        }
                        iLJIIIZ2++;
                        iLJIIIZ3++;
                    }
                    return true;
                }
                throw new IllegalArgumentException("Ran off end of other: 0, " + iZzd + ", " + c19851912lp.zzd());
            }
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        return obj.equals(this);
    }

    @Override // X.AbstractC19851412lk
    public byte zza(int i) {
        return this.LL[i];
    }

    @Override // X.AbstractC19851412lk
    public void LJ(byte[] bArr, int i) {
        System.arraycopy(this.LL, 0, bArr, 0, i);
    }

    @Override // X.AbstractC19851412lk
    public final int LJFF(int i, int i2) {
        byte[] bArr = this.LL;
        int iLJIIIZ = LJIIIZ();
        byte[] bArr2 = C19856612ma.LIZ;
        for (int i3 = iLJIIIZ; i3 < iLJIIIZ + i2; i3++) {
            i = (i * 31) + bArr[i3];
        }
        return i;
    }

    @Override // X.AbstractC19851412lk
    public final AbstractC19851412lk zzg(int i, int i2) {
        final int iLJIIIIZZ = AbstractC19851412lk.LJIIIIZZ(i, i2, zzd());
        if (iLJIIIIZZ == 0) {
            return AbstractC19851412lk.zzb;
        }
        final byte[] bArr = this.LL;
        final int iLJIIIZ = LJIIIZ() + i;
        return new C19851912lp(bArr, iLJIIIZ, iLJIIIIZZ) { // from class: X.12lq
            public final int LLILLJJLI;
            public final int LLILLL;

            @Override // X.C19851912lp
            public final int LJIIIZ() {
                return this.LLILLJJLI;
            }

            @Override // X.C19851912lp, X.AbstractC19851412lk
            public final int zzd() {
                return this.LLILLL;
            }

            @Override // X.C19851912lp, X.AbstractC19851412lk
            public final byte LIZJ(int i3) {
                return this.LL[this.LLILLJJLI + i3];
            }

            @Override // X.C19851912lp, X.AbstractC19851412lk
            public final byte zza(int i3) {
                int i4 = this.LLILLL;
                if (((i4 - (i3 + 1)) | i3) < 0) {
                    if (i3 < 0) {
                        throw new ArrayIndexOutOfBoundsException("Index < 0: " + i3);
                    }
                    throw new ArrayIndexOutOfBoundsException("Index > length: " + i3 + ", " + i4);
                }
                return this.LL[this.LLILLJJLI + i3];
            }

            @Override // X.C19851912lp, X.AbstractC19851412lk
            public final void LJ(byte[] bArr2, int i3) {
                System.arraycopy(this.LL, this.LLILLJJLI, bArr2, 0, i3);
            }

            {
                super(bArr);
                AbstractC19851412lk.LJIIIIZZ(iLJIIIZ, iLJIIIZ + iLJIIIIZZ, bArr.length);
                this.LLILLJJLI = iLJIIIZ;
                this.LLILLL = iLJIIIIZZ;
            }
        };
    }
}
