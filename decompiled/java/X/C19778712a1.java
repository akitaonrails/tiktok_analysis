package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12a1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19778712a1 extends AbstractC19899612tW<C19778712a1, C19783512an> implements InterfaceC19900412te {
    public static final C19778712a1 zzc;
    public static volatile InterfaceC19816612g8<C19778712a1> zzd;
    public int zze;
    public int zzf;
    public InterfaceC19785612b8 zzg = C19886512rP.LLILZ;

    static {
        C19778712a1 c19778712a1 = new C19778712a1();
        zzc = c19778712a1;
        AbstractC19899612tW.LJIIZILJ(C19778712a1.class, c19778712a1);
    }

    public static C19783512an LJJIFFI() {
        return zzc.LJIJI();
    }

    public final boolean LJJIII() {
        return (this.zze & 1) != 0;
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815412fw.LIZ[i - 1]) {
            case 1:
                return new C19778712a1();
            case 2:
                return new AbstractC19899712tX<C19778712a1, C19783512an>() { // from class: X.12an
                    {
                        C19778712a1 c19778712a1 = C19778712a1.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19778712a1> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19778712a1.class) {
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

    public static void LJJI(C19778712a1 c19778712a1, int i) {
        c19778712a1.zze |= 1;
        c19778712a1.zzf = i;
    }
}
