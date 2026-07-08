package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.12yF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19928912yF extends AbstractC19922712xF {
    public static final Logger LIZIZ = Logger.getLogger(AbstractC19928912yF.class.getName());
    public static final boolean LIZJ = C19917512wP.LJ;
    public C19929012yG LIZ;

    public abstract void LJIILLIIL(byte b);

    public abstract void LJIIZILJ(int i, boolean z);

    public abstract void LJIJ(byte[] bArr, int i);

    public abstract void LJIJI(int i, AbstractC19922812xG abstractC19922812xG);

    public abstract void LJIJJ(AbstractC19922812xG abstractC19922812xG);

    public abstract void LJIJJLI(int i, int i2);

    public abstract void LJIL(int i);

    public abstract void LJJ(int i, long j);

    public abstract void LJJI(long j);

    public abstract void LJJII(int i, int i2);

    public abstract void LJJIII(int i);

    public abstract void LJJIIJ(int i, InterfaceC19925612xi interfaceC19925612xi);

    public abstract void LJJIIJZLJL(InterfaceC19925612xi interfaceC19925612xi);

    public abstract void LJJIIZ(int i, InterfaceC19925612xi interfaceC19925612xi);

    public abstract void LJJIIZI(int i, AbstractC19922812xG abstractC19922812xG);

    public abstract void LJJIJ(int i, String str);

    public abstract void LJJIJIIJI(String str);

    public abstract void LJJIJIIJIL(int i, int i2);

    public abstract void LJJIJIL(int i, int i2);

    public abstract void LJJIJL(int i);

    public abstract void LJJIJLIJ(int i, long j);

    public abstract void LJJIL(long j);

    public static int LIZIZ(int i) {
        return LJIIL(i) + 1;
    }

    public static int LIZLLL(AbstractC19922812xG abstractC19922812xG) {
        int size = abstractC19922812xG.size();
        return LJIILIIL(size) + size;
    }

    public static int LJIIIIZZ(InterfaceC19925612xi interfaceC19925612xi) {
        int serializedSize = interfaceC19925612xi.getSerializedSize();
        return LJIILIIL(serializedSize) + serializedSize;
    }

    public static int LJIIIZ(int i) {
        return LJIILIIL((i >> 31) ^ (i << 1));
    }

    public static int LJIIJ(long j) {
        return LJIILJJIL((j >> 63) ^ (j << 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public static int LJIIJJI(String str) {
        int length;
        try {
            str = C19920112wp.LIZIZ(str);
            length = str;
        } catch (C19920312wr e) {
            TryCatchGuardChecker.doCheck(e);
            length = str.getBytes(C19922012x8.LIZ).length;
        }
        return LJIILIIL(length) + length;
    }

    public static int LJIIL(int i) {
        return LJIILIIL(i << 3);
    }

    public static int LJIILIIL(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int LJIILJJIL(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int LIZJ(int i, AbstractC19922812xG abstractC19922812xG) {
        int iLJIIL = LJIIL(i);
        int size = abstractC19922812xG.size();
        return iLJIIL + LJIILIIL(size) + size;
    }

    public static int LJ(int i, int i2) {
        return LJIIL(i) + LJIILJJIL(i2);
    }

    public static int LJFF(int i, int i2) {
        return LJIIL(i) + LJIILJJIL(i2);
    }

    public static int LJI(int i, InterfaceC19925612xi interfaceC19925612xi) {
        return (LJIIL(1) * 2) + LJIIL(2) + LJIILIIL(i) + LJII(3, interfaceC19925612xi);
    }

    public static int LJII(int i, InterfaceC19925612xi interfaceC19925612xi) {
        int iLJIIL = LJIIL(i);
        int serializedSize = interfaceC19925612xi.getSerializedSize();
        return iLJIIL + LJIILIIL(serializedSize) + serializedSize;
    }

    public final void LJIILL(String str, C19920312wr c19920312wr) throws C1318080kP8 {
        LIZIZ.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c19920312wr);
        byte[] bytes = str.getBytes(C19922012x8.LIZ);
        try {
            LJJIJL(bytes.length);
            LIZ(0, bytes, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C1318080kP8(e);
        }
    }

    public final void LJJIFFI(int i, InterfaceC19925612xi interfaceC19925612xi) {
        LJJIJIIJIL(i, 3);
        interfaceC19925612xi.writeTo(this);
        LJJIJIIJIL(i, 4);
    }
}
