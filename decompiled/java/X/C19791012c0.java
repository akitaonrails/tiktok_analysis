package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12c0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19791012c0 extends AbstractC19899612tW<C19791012c0, C19791212c2> implements InterfaceC19900412te {
    public static final C19791012c0 zzc;
    public static volatile InterfaceC19816612g8<C19791012c0> zzd;
    public int zze;
    public String zzf = "";
    public String zzg = "";
    public C19790912bz zzh;

    static {
        C19791012c0 c19791012c0 = new C19791012c0();
        zzc = c19791012c0;
        AbstractC19899612tW.LJIIZILJ(C19791012c0.class, c19791012c0);
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815412fw.LIZ[i - 1]) {
            case 1:
                return new C19791012c0();
            case 2:
                return new AbstractC19899712tX<C19791012c0, C19791212c2>() { // from class: X.12c2
                    {
                        C19791012c0 c19791012c0 = C19791012c0.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19791012c0> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19791012c0.class) {
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
