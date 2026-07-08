package X;

import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: X.12lk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19851412lk implements Iterable, Serializable {
    public static final AbstractC19851412lk zzb = new C19851912lp(C19856612ma.LIZ);
    public int zzc;

    public abstract byte LIZJ(int i);

    public abstract void LJ(byte[] bArr, int i);

    public abstract int LJFF(int i, int i2);

    public abstract boolean equals(Object obj);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C19851512ll(this);
    }

    public abstract byte zza(int i);

    public abstract int zzd();

    public abstract AbstractC19851412lk zzg(int i, int i2);

    public abstract InputStream zzh();

    public abstract ByteBuffer zzi();

    public final int hashCode() {
        int iLJFF = this.zzc;
        if (iLJFF == 0) {
            int iZzd = zzd();
            iLJFF = LJFF(iZzd, iZzd);
            if (iLJFF == 0) {
                iLJFF = 1;
            }
            this.zzc = iLJFF;
        }
        return iLJFF;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? C19853812m8.LIZ(this) : C19853812m8.LIZ(zzg(0, 47)).concat("...");
        return C786410Ut5.k4(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final byte[] zzm() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return C19856612ma.LIZ;
        }
        byte[] bArr = new byte[iZzd];
        LJ(bArr, iZzd);
        return bArr;
    }

    public static int LJIIIIZZ(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
                }
                throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
            }
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        return i4;
    }

    public static AbstractC19851412lk zzl(byte[] bArr, int i, int i2) {
        LJIIIIZZ(0, i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        return new C19851912lp(bArr2);
    }
}
