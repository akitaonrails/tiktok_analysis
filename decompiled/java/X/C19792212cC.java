package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12cC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19792212cC extends AbstractC19899612tW<C19792212cC, C19792412cE> implements InterfaceC19900412te {
    public static final C19792212cC zzc;
    public static volatile InterfaceC19816612g8<C19792212cC> zzd;
    public int zze;
    public String zzf = "";
    public InterfaceC19875012pY<C19792712cH> zzg = C19886312rN.LLILZ;

    static {
        C19792212cC c19792212cC = new C19792212cC();
        zzc = c19792212cC;
        AbstractC19899612tW.LJIIZILJ(C19792212cC.class, c19792212cC);
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815712fz.LIZ[i - 1]) {
            case 1:
                return new C19792212cC();
            case 2:
                return new AbstractC19899712tX<C19792212cC, C19792412cE>() { // from class: X.12cE
                    {
                        C19792212cC c19792212cC = C19792212cC.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", C19792712cH.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19792212cC> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19792212cC.class) {
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
