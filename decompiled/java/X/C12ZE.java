package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12ZE, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C12ZE extends AbstractC19899612tW<C12ZE, C19783612ao> implements InterfaceC19900412te {
    public static final C12ZE zzc;
    public static volatile InterfaceC19816612g8<C12ZE> zzd;
    public int zze;
    public long zzf;
    public String zzg = "";
    public String zzh = "";
    public long zzi;
    public float zzj;
    public double zzk;

    static {
        C12ZE c12ze = new C12ZE();
        zzc = c12ze;
        AbstractC19899612tW.LJIIZILJ(C12ZE.class, c12ze);
    }

    public static C19783612ao LJJIJ() {
        return zzc.LJIJI();
    }

    public final boolean LJJIJIIJIL() {
        return (this.zze & 32) != 0;
    }

    public final boolean LJJIJIL() {
        return (this.zze & 16) != 0;
    }

    public final boolean LJJIJL() {
        return (this.zze & 8) != 0;
    }

    public final boolean LJJIJLIJ() {
        return (this.zze & 1) != 0;
    }

    public final boolean LJJIL() {
        return (this.zze & 4) != 0;
    }

    public static void LJJIII(C12ZE c12ze) {
        c12ze.zze &= -5;
        c12ze.zzh = zzc.zzh;
    }

    public static void LJJIIJ(C12ZE c12ze) {
        c12ze.zze &= -9;
        c12ze.zzi = 0L;
    }

    public static void LJJIIZI(C12ZE c12ze) {
        c12ze.zze &= -33;
        c12ze.zzk = 0.0d;
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815412fw.LIZ[i - 1]) {
            case 1:
                return new C12ZE();
            case 2:
                return new AbstractC19899712tX<C12ZE, C19783612ao>() { // from class: X.12ao
                    {
                        C12ZE c12ze = C12ZE.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C12ZE> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C12ZE.class) {
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

    public static void LJJI(C12ZE c12ze, double d) {
        c12ze.zze |= 32;
        c12ze.zzk = d;
    }

    public static void LJJIFFI(C12ZE c12ze, long j) {
        c12ze.zze |= 1;
        c12ze.zzf = j;
    }

    public static void LJJII(C12ZE c12ze, String str) {
        c12ze.getClass();
        str.getClass();
        c12ze.zze |= 2;
        c12ze.zzg = str;
    }

    public static void LJJIIJZLJL(C12ZE c12ze, long j) {
        c12ze.zze |= 8;
        c12ze.zzi = j;
    }

    public static void LJJIIZ(C12ZE c12ze, String str) {
        c12ze.getClass();
        str.getClass();
        c12ze.zze |= 4;
        c12ze.zzh = str;
    }
}
