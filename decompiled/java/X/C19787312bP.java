package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12bP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19787312bP extends AbstractC19899612tW<C19787312bP, C19787612bS> implements InterfaceC19900412te {
    public static final C19787312bP zzc;
    public static volatile InterfaceC19816612g8<C19787312bP> zzd;
    public int zze;
    public String zzf = "";
    public String zzg = "";

    static {
        C19787312bP c19787312bP = new C19787312bP();
        zzc = c19787312bP;
        AbstractC19899612tW.LJIIZILJ(C19787312bP.class, c19787312bP);
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815612fy.LIZ[i - 1]) {
            case 1:
                return new C19787312bP();
            case 2:
                return new AbstractC19899712tX<C19787312bP, C19787612bS>() { // from class: X.12bS
                    {
                        C19787312bP c19787312bP = C19787312bP.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19787312bP> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19787312bP.class) {
                        try {
                            c19834512j1 = zzd;
                            if (c19834512j1 == null) {
                                c19834512j1 = new C19834512j1();
                                zzd = c19834512j1;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                        break;
                    }
                    return c19834512j1;
                }
                return interfaceC19816612g8;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
