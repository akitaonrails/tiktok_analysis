package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12br, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19790112br extends AbstractC19899612tW<C19790112br, C19790212bs> implements InterfaceC19900412te {
    public static final C19790112br zzc;
    public static volatile InterfaceC19816612g8<C19790112br> zzd;
    public int zze;
    public int zzf = 14;
    public int zzg = 11;
    public int zzh = 60;

    static {
        C19790112br c19790112br = new C19790112br();
        zzc = c19790112br;
        AbstractC19899612tW.LJIIZILJ(C19790112br.class, c19790112br);
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815612fy.LIZ[i - 1]) {
            case 1:
                return new C19790112br();
            case 2:
                return new AbstractC19899712tX<C19790112br, C19790212bs>() { // from class: X.12bs
                    {
                        C19790112br c19790112br = C19790112br.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19790112br> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19790112br.class) {
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
