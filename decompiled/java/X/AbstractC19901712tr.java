package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.12tr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19901712tr extends AbstractC19855412mO {
    public static final Logger LIZIZ = Logger.getLogger(AbstractC19901712tr.class.getName());
    public static final boolean LIZJ = C19906212ua.LIZLLL;
    public C19901812ts LIZ;

    public abstract void LJ(byte b);

    public abstract void LJFF(int i, InterfaceC19901112tl interfaceC19901112tl);

    public abstract void LJI(int i, String str);

    public abstract void LJII(int i, boolean z);

    public abstract void LJIIIIZZ(int i, AbstractC19854812mI abstractC19854812mI);

    public abstract void LJIIIZ(int i, InterfaceC19901112tl interfaceC19901112tl, InterfaceC19900112tb interfaceC19900112tb);

    public abstract void LJIIJ(int i, AbstractC19854812mI abstractC19854812mI);

    public abstract void LJIILJJIL(int i, long j);

    public abstract void LJIILL(long j);

    public abstract void LJIIZILJ(int i, int i2);

    public abstract void LJIJ(int i);

    public abstract void LJIJI(int i, int i2);

    public abstract void LJIJJ(int i, long j);

    public abstract void LJIJJLI(long j);

    public abstract void LJIL(int i);

    public abstract void LJJ(int i, int i2);

    public abstract void LJJI(int i);

    public abstract void LJJIFFI(int i, int i2);

    public static int LIZJ(C19901012tk c19901012tk) {
        int iLIZ = c19901012tk.LIZ();
        return LJIILLIIL(iLIZ) + iLIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public static int LIZLLL(String str) {
        int length;
        try {
            str = C1322810kWl.LIZIZ(str);
            length = str;
        } catch (C1318010kP1 e) {
            TryCatchGuardChecker.doCheck(e);
            length = str.getBytes(C19856912md.LIZ).length;
        }
        return LJIILLIIL(length) + length;
    }

    public static int LJIIJJI(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int LJIIL(int i) {
        return LJIILLIIL(i << 3);
    }

    public static int LJIILLIIL(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int LIZIZ(int i, AbstractC19854812mI abstractC19854812mI) {
        int iLJIILLIIL = LJIILLIIL(i << 3);
        int iZzb = abstractC19854812mI.zzb();
        return iLJIILLIIL + LJIILLIIL(iZzb) + iZzb;
    }

    public static int LJIILIIL(int i, int i2) {
        return LJIILLIIL(i << 3) + LJIILLIIL(i2);
    }
}
