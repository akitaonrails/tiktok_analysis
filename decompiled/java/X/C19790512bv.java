package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12bv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19790512bv extends AbstractC19899612tW<C19790512bv, C19790612bw> implements InterfaceC19900412te {
    public static final C19790512bv zzc;
    public static volatile InterfaceC19816612g8<C19790512bv> zzd;
    public int zze;
    public int zzf = 1;
    public InterfaceC19875012pY<C19790712bx> zzg = C19886312rN.LLILZ;

    static {
        C19790512bv c19790512bv = new C19790512bv();
        zzc = c19790512bv;
        AbstractC19899612tW.LJIIZILJ(C19790512bv.class, c19790512bv);
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815412fw.LIZ[i - 1]) {
            case 1:
                return new C19790512bv();
            case 2:
                return new AbstractC19899712tX<C19790512bv, C19790612bw>() { // from class: X.12bw
                    {
                        C19790512bv c19790512bv = C19790512bv.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", EnumC19790312bt.zzb(), "zzg", C19790712bx.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19790512bv> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19790512bv.class) {
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
