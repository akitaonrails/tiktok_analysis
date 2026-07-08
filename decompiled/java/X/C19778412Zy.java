package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12Zy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19778412Zy extends AbstractC19899612tW<C19778412Zy, C19783212ak> implements InterfaceC19900412te {
    public static final C19778412Zy zzc;
    public static volatile InterfaceC19816612g8<C19778412Zy> zzd;
    public int zze;
    public int zzf;
    public String zzg = "";
    public C19778612a0 zzh;
    public boolean zzi;
    public boolean zzj;
    public boolean zzk;

    static {
        C19778412Zy c19778412Zy = new C19778412Zy();
        zzc = c19778412Zy;
        AbstractC19899612tW.LJIIZILJ(C19778412Zy.class, c19778412Zy);
    }

    public static C19783212ak LJJIII() {
        return zzc.LJIJI();
    }

    public final C19778612a0 LJJII() {
        C19778612a0 c19778612a0 = this.zzh;
        return c19778612a0 == null ? C19778612a0.LJJII() : c19778612a0;
    }

    public final boolean LJJIIJZLJL() {
        return (this.zze & 1) != 0;
    }

    public final boolean LJJIIZ() {
        return (this.zze & 32) != 0;
    }

    public final int LJJI() {
        return this.zzf;
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815512fx.LIZ[i - 1]) {
            case 1:
                return new C19778412Zy();
            case 2:
                return new AbstractC19899712tX<C19778412Zy, C19783212ak>() { // from class: X.12ak
                    {
                        C19778412Zy c19778412Zy = C19778412Zy.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19778412Zy> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19778412Zy.class) {
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

    public static void LJJIFFI(C19778412Zy c19778412Zy, String str) {
        c19778412Zy.getClass();
        c19778412Zy.zze |= 2;
        c19778412Zy.zzg = str;
    }
}
