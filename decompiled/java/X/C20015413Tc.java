package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: X.13Tc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20015413Tc<T> implements InterfaceC20015613Te<T> {
    public final InterfaceC20015813Tg<T> LIZ;
    public final InterfaceC20015913Th<T> LIZIZ;
    public final InterfaceC20015613Te<T> LIZJ;

    @Override // X.InterfaceC20015613Te
    public final T LIZIZ() {
        T tLIZIZ = this.LIZJ.LIZIZ();
        if (tLIZIZ == null) {
            this.LIZ.getClass();
            try {
                tLIZIZ = (T) new C20015313Tb(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        }
        if (tLIZIZ instanceof InterfaceC20016013Ti) {
            tLIZIZ.LIZ().getClass();
        }
        return (T) tLIZIZ;
    }

    @Override // X.InterfaceC20015613Te
    public final boolean LIZ(T t) {
        if (t instanceof InterfaceC20016013Ti) {
            ((InterfaceC20016013Ti) t).LIZ().getClass();
        }
        this.LIZIZ.getClass();
        return this.LIZJ.LIZ(t);
    }

    public C20015413Tc(C1085640eME c1085640eME, C20015213Ta c20015213Ta) {
        C20015713Tf c20015713Tf = C20015513Td.LIZ;
        this.LIZJ = c1085640eME;
        this.LIZ = c20015213Ta;
        this.LIZIZ = c20015713Tf;
    }
}
