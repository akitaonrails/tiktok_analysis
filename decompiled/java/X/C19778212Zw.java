package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12Zw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19778212Zw extends AbstractC19899612tW<C19778212Zw, C19783412am> implements InterfaceC19900412te {
    public static final /* synthetic */ int LL = 0;
    public static final C19778212Zw zzc;
    public static volatile InterfaceC19816612g8<C19778212Zw> zzd;
    public InterfaceC19785612b8 zze;
    public InterfaceC19785612b8 zzf;
    public InterfaceC19875012pY<C19778812a2> zzg;
    public InterfaceC19875012pY<C19778712a1> zzh;

    static {
        C19778212Zw c19778212Zw = new C19778212Zw();
        zzc = c19778212Zw;
        AbstractC19899612tW.LJIIZILJ(C19778212Zw.class, c19778212Zw);
    }

    public static C19783412am LJJI() {
        return zzc.LJIJI();
    }

    public C19778212Zw() {
        C19886512rP c19886512rP = C19886512rP.LLILZ;
        this.zze = c19886512rP;
        this.zzf = c19886512rP;
        C19886312rN<Object> c19886312rN = C19886312rN.LLILZ;
        this.zzg = c19886312rN;
        this.zzh = c19886312rN;
    }

    public static C19778212Zw LJJII() {
        return zzc;
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815412fw.LIZ[i - 1]) {
            case 1:
                return new C19778212Zw();
            case 2:
                return new AbstractC19899712tX<C19778212Zw, C19783412am>() { // from class: X.12am
                    {
                        C19778212Zw c19778212Zw = C19778212Zw.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", C19778812a2.class, "zzh", C19778712a1.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19778212Zw> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19778212Zw.class) {
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
