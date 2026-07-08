package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12bx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19790712bx extends AbstractC19899612tW<C19790712bx, C19790812by> implements InterfaceC19900412te {
    public static final C19790712bx zzc;
    public static volatile InterfaceC19816612g8<C19790712bx> zzd;
    public int zze;
    public String zzf = "";
    public long zzg;

    static {
        C19790712bx c19790712bx = new C19790712bx();
        zzc = c19790712bx;
        AbstractC19899612tW.LJIIZILJ(C19790712bx.class, c19790712bx);
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815412fw.LIZ[i - 1]) {
            case 1:
                return new C19790712bx();
            case 2:
                return new AbstractC19899712tX<C19790712bx, C19790812by>() { // from class: X.12by
                    {
                        C19790712bx c19790712bx = C19790712bx.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19790712bx> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19790712bx.class) {
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
