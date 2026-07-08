package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12cA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19792012cA extends AbstractC19899612tW<C19792012cA, C19792312cD> implements InterfaceC19900412te {
    public static final C19792012cA zzc;
    public static volatile InterfaceC19816612g8<C19792012cA> zzd;
    public InterfaceC19875012pY<C19792212cC> zze = C19886312rN.LLILZ;

    static {
        C19792012cA c19792012cA = new C19792012cA();
        zzc = c19792012cA;
        AbstractC19899612tW.LJIIZILJ(C19792012cA.class, c19792012cA);
    }

    public static C19792012cA LJJIFFI() {
        return zzc;
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815712fz.LIZ[i - 1]) {
            case 1:
                return new C19792012cA();
            case 2:
                return new AbstractC19899712tX<C19792012cA, C19792312cD>() { // from class: X.12cD
                    {
                        C19792012cA c19792012cA = C19792012cA.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C19792212cC.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19792012cA> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19792012cA.class) {
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
