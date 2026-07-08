package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: X.12mQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19855612mQ implements Iterable, Serializable {
    public static final AbstractC19855612mQ zza = new C19855812mS(C19856312mX.LIZIZ);
    public int LL;

    public abstract byte LIZJ(int i);

    public abstract int LJ(int i, int i2);

    public abstract void LJFF(C19856212mW c19856212mW);

    public abstract boolean LJIIIIZZ(AbstractC19855612mQ abstractC19855612mQ);

    public abstract byte zza(int i);

    public abstract int zze();

    public abstract AbstractC19855612mQ zzf(int i, int i2);

    public final int hashCode() {
        int iLJ = this.LL;
        if (iLJ == 0) {
            int iZze = zze();
            iLJ = LJ(iZze, iZze);
            if (iLJ == 0) {
                iLJ = 1;
            }
            this.LL = iLJ;
        }
        return iLJ;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C19856112mV(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zze());
        objArr[2] = zze() <= 50 ? C19853912m9.LIZ(this) : C19853912m9.LIZ(zzf(0, 47)).concat("...");
        return C786410Ut5.k4(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC19855612mQ)) {
            return false;
        }
        AbstractC19855612mQ abstractC19855612mQ = (AbstractC19855612mQ) obj;
        int iZze = zze();
        if (iZze != abstractC19855612mQ.zze()) {
            return false;
        }
        if (iZze == 0) {
            return true;
        }
        int i = this.LL;
        int i2 = abstractC19855612mQ.LL;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        return LJIIIIZZ(abstractC19855612mQ);
    }

    public static int LJIIIZ(int i, int i2, int i3) {
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

    public static AbstractC19855612mQ zzk(byte[] bArr, int i, int i2) {
        try {
            LJIIIZ(i, i + i2, bArr.length);
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return new C19855812mS(bArr2);
        } catch (C19857612mk e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static /* bridge */ /* synthetic */ boolean LJIIJ(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i + i3;
        LJIIIZ(i, i4, bArr.length);
        LJIIIZ(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }
}
