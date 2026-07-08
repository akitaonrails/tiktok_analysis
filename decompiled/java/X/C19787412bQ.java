package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12bQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19787412bQ extends AbstractC19899612tW<C19787412bQ, C19787512bR> implements InterfaceC19900412te {
    public static final C19787412bQ zzc;
    public static volatile InterfaceC19816612g8<C19787412bQ> zzd;
    public int zze;
    public String zzf = "";
    public String zzg = "";

    static {
        C19787412bQ c19787412bQ = new C19787412bQ();
        zzc = c19787412bQ;
        AbstractC19899612tW.LJIIZILJ(C19787412bQ.class, c19787412bQ);
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815612fy.LIZ[i - 1]) {
            case 1:
                return new C19787412bQ();
            case 2:
                return new AbstractC19899712tX<C19787412bQ, C19787512bR>() { // from class: X.12bR
                    {
                        C19787412bQ c19787412bQ = C19787412bQ.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19787412bQ> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19787412bQ.class) {
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
