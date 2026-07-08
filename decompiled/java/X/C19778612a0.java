package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12a0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19778612a0 extends AbstractC19899612tW<C19778612a0, C19782912ah> implements InterfaceC19900412te {
    public static final C19778612a0 zzc;
    public static volatile InterfaceC19816612g8<C19778612a0> zzd;
    public int zze;
    public C19778512Zz zzf;
    public C19778312Zx zzg;
    public boolean zzh;
    public String zzi = "";

    static {
        C19778612a0 c19778612a0 = new C19778612a0();
        zzc = c19778612a0;
        AbstractC19899612tW.LJIIZILJ(C19778612a0.class, c19778612a0);
    }

    public final C19778312Zx LJJIII() {
        C19778312Zx c19778312Zx = this.zzg;
        return c19778312Zx == null ? C19778312Zx.LJJII() : c19778312Zx;
    }

    public final C19778512Zz LJJIIJ() {
        C19778512Zz c19778512Zz = this.zzf;
        return c19778512Zz == null ? C19778512Zz.LJJII() : c19778512Zz;
    }

    public final boolean LJJIIJZLJL() {
        return (this.zze & 4) != 0;
    }

    public final boolean LJJIIZ() {
        return (this.zze & 2) != 0;
    }

    public final boolean LJJIIZI() {
        return (this.zze & 8) != 0;
    }

    public final boolean LJJIJ() {
        return (this.zze & 1) != 0;
    }

    public static C19778612a0 LJJII() {
        return zzc;
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815512fx.LIZ[i - 1]) {
            case 1:
                return new C19778612a0();
            case 2:
                return new AbstractC19899712tX<C19778612a0, C19782912ah>() { // from class: X.12ah
                    {
                        C19778612a0 c19778612a0 = C19778612a0.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19778612a0> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19778612a0.class) {
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

    public static void LJJI(C19778612a0 c19778612a0, String str) {
        c19778612a0.getClass();
        c19778612a0.zze |= 8;
        c19778612a0.zzi = str;
    }
}
