package X;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: X.12mI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19854812mI implements Serializable, Iterable<Byte> {
    public int zzc;
    public static final AbstractC19854812mI zza = new C19855012mK(C19856912md.LIZIZ);
    public static final C19855512mP LL = new Object() { // from class: X.12mP
    };

    public abstract void LJ(AbstractC19855412mO abstractC19855412mO);

    public abstract byte LJFF(int i);

    public abstract int LJIIIIZZ(int i, int i2);

    public abstract boolean equals(Object obj);

    public abstract byte zza(int i);

    public abstract AbstractC19854812mI zza(int i, int i2);

    public abstract int zzb();

    public final int hashCode() {
        int iLJIIIIZZ = this.zzc;
        if (iLJIIIIZZ == 0) {
            int iZzb = zzb();
            iLJIIIIZZ = LJIIIIZZ(iZzb, iZzb);
            if (iLJIIIIZZ == 0) {
                iLJIIIIZZ = 1;
            }
            this.zzc = iLJIIIIZZ;
        }
        return iLJIIIIZZ;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new C19855112mL(this);
    }

    public final String toString() {
        String strLIZIZ;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzb());
        if (zzb() <= 50) {
            strLIZIZ = C19854012mA.LIZ(this);
        } else {
            String strLIZ = C19854012mA.LIZ(zza(0, 47));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZ);
            sbLIZ.append("...");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        objArr[2] = strLIZIZ;
        return C786410Ut5.k4(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public static AbstractC19854812mI zza(String str) {
        return new C19855012mK(str.getBytes(C19856912md.LIZ));
    }

    public static AbstractC19854812mI zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static int LIZJ(int i, int i2, int i3) {
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

    public static AbstractC19854812mI zza(byte[] bArr, int i, int i2) {
        LIZJ(i, i + i2, bArr.length);
        LL.getClass();
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C19855012mK(bArr2);
    }
}
