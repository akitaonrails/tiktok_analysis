package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12cB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19792112cB extends AbstractC19899612tW<C19792112cB, C19792512cF> implements InterfaceC19900412te {
    public static final C19792112cB zzc;
    public static volatile InterfaceC19816612g8<C19792112cB> zzd;
    public int zze;
    public InterfaceC19875012pY<C19792712cH> zzf = C19886312rN.LLILZ;
    public C19792012cA zzg;

    static {
        C19792112cB c19792112cB = new C19792112cB();
        zzc = c19792112cB;
        AbstractC19899612tW.LJIIZILJ(C19792112cB.class, c19792112cB);
    }

    public final C19792012cA LJJI() {
        C19792012cA c19792012cA = this.zzg;
        return c19792012cA == null ? C19792012cA.LJJIFFI() : c19792012cA;
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815712fz.LIZ[i - 1]) {
            case 1:
                return new C19792112cB();
            case 2:
                return new AbstractC19899712tX<C19792112cB, C19792512cF>() { // from class: X.12cF
                    {
                        C19792112cB c19792112cB = C19792112cB.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", C19792712cH.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19792112cB> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19792112cB.class) {
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
