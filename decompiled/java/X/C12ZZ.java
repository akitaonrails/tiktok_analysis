package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12ZZ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C12ZZ extends AbstractC19899612tW<C12ZZ, C12ZY> implements InterfaceC19900412te {
    public static final C12ZZ zzc;
    public static volatile InterfaceC19816612g8<C12ZZ> zzd;
    public int zze;
    public boolean zzf;
    public boolean zzg;
    public boolean zzh;
    public boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public boolean zzl;

    static {
        C12ZZ c12zz = new C12ZZ();
        zzc = c12zz;
        AbstractC19899612tW.LJIIZILJ(C12ZZ.class, c12zz);
    }

    public static C12ZY LJJI() {
        return zzc.LJIJI();
    }

    public static C12ZZ LJJIIJ() {
        return zzc;
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815412fw.LIZ[i - 1]) {
            case 1:
                return new C12ZZ();
            case 2:
                return new C12ZY();
            case 3:
                return new C19902812u2(zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C12ZZ> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C12ZZ.class) {
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

    public static void LJJIFFI(C12ZZ c12zz, boolean z) {
        c12zz.zze |= 1;
        c12zz.zzf = z;
    }

    public static void LJJIII(C12ZZ c12zz, boolean z) {
        c12zz.zze |= 2;
        c12zz.zzg = z;
    }

    public static void LJJIIJZLJL(C12ZZ c12zz, boolean z) {
        c12zz.zze |= 4;
        c12zz.zzh = z;
    }

    public static void LJJIIZ(C12ZZ c12zz, boolean z) {
        c12zz.zze |= 8;
        c12zz.zzi = z;
    }

    public static void LJJIIZI(C12ZZ c12zz, boolean z) {
        c12zz.zze |= 16;
        c12zz.zzj = z;
    }

    public static void LJJIJ(C12ZZ c12zz, boolean z) {
        c12zz.zze |= 32;
        c12zz.zzk = z;
    }

    public static void LJJIJIIJI(C12ZZ c12zz, boolean z) {
        c12zz.zze |= 64;
        c12zz.zzl = z;
    }
}
