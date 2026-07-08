package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12Zv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19778112Zv extends AbstractC19899612tW<C19778112Zv, C19782512ad> implements InterfaceC19900412te {
    public static final C19778112Zv zzc;
    public static volatile InterfaceC19816612g8<C19778112Zv> zzd;
    public int zze;
    public int zzf;
    public C19778212Zw zzg;
    public C19778212Zw zzh;
    public boolean zzi;

    static {
        C19778112Zv c19778112Zv = new C19778112Zv();
        zzc = c19778112Zv;
        AbstractC19899612tW.LJIIZILJ(C19778112Zv.class, c19778112Zv);
    }

    public static C19782512ad LJJIIJ() {
        return zzc.LJIJI();
    }

    public final C19778212Zw LJJIIZI() {
        C19778212Zw c19778212Zw = this.zzg;
        return c19778212Zw == null ? C19778212Zw.LJJII() : c19778212Zw;
    }

    public final C19778212Zw LJJIJ() {
        C19778212Zw c19778212Zw = this.zzh;
        return c19778212Zw == null ? C19778212Zw.LJJII() : c19778212Zw;
    }

    public final boolean LJJIJIIJI() {
        return (this.zze & 1) != 0;
    }

    public final boolean LJJIJIIJIL() {
        return (this.zze & 8) != 0;
    }

    public final boolean LJJIJIL() {
        return (this.zze & 4) != 0;
    }

    public final int LJJI() {
        return this.zzf;
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815412fw.LIZ[i - 1]) {
            case 1:
                return new C19778112Zv();
            case 2:
                return new AbstractC19899712tX<C19778112Zv, C19782512ad>() { // from class: X.12ad
                    {
                        C19778112Zv c19778112Zv = C19778112Zv.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19778112Zv> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19778112Zv.class) {
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

    public static void LJJIFFI(C19778112Zv c19778112Zv, int i) {
        c19778112Zv.zze |= 1;
        c19778112Zv.zzf = i;
    }

    public static void LJJII(C19778112Zv c19778112Zv, C19778212Zw c19778212Zw) {
        c19778112Zv.getClass();
        c19778112Zv.zzg = c19778212Zw;
        c19778112Zv.zze |= 2;
    }

    public static void LJJIII(C19778112Zv c19778112Zv, boolean z) {
        c19778112Zv.zze |= 8;
        c19778112Zv.zzi = z;
    }

    public static void LJJIIJZLJL(C19778112Zv c19778112Zv, C19778212Zw c19778212Zw) {
        c19778112Zv.getClass();
        c19778212Zw.getClass();
        c19778112Zv.zzh = c19778212Zw;
        c19778112Zv.zze |= 4;
    }
}
