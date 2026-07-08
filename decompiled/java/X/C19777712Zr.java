package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12Zr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19777712Zr extends AbstractC19899612tW<C19777712Zr, C19778912a3> implements InterfaceC19900412te {
    public static final /* synthetic */ int LL = 0;
    public static final C19777712Zr zzc;
    public static volatile InterfaceC19816612g8<C19777712Zr> zzd;
    public int zze;
    public long zzh;
    public float zzi;
    public double zzj;
    public String zzf = "";
    public String zzg = "";
    public InterfaceC19875012pY<C19777712Zr> zzk = C19886312rN.LLILZ;

    static {
        C19777712Zr c19777712Zr = new C19777712Zr();
        zzc = c19777712Zr;
        AbstractC19899612tW.LJIIZILJ(C19777712Zr.class, c19777712Zr);
    }

    public static C19778912a3 LJJIIZI() {
        return zzc.LJIJI();
    }

    public final boolean LJJIJIIJI() {
        return (this.zze & 16) != 0;
    }

    public final boolean LJJIJIIJIL() {
        return (this.zze & 8) != 0;
    }

    public final boolean LJJIJIL() {
        return (this.zze & 4) != 0;
    }

    public final boolean LJJIJL() {
        return (this.zze & 1) != 0;
    }

    public final boolean LJJIJLIJ() {
        return (this.zze & 2) != 0;
    }

    public static void LJJIII(C19777712Zr c19777712Zr) {
        c19777712Zr.zze &= -3;
        c19777712Zr.zzg = zzc.zzg;
    }

    public static void LJJIIJ(C19777712Zr c19777712Zr) {
        c19777712Zr.zze &= -5;
        c19777712Zr.zzh = 0L;
    }

    public static void LJJIIZ(C19777712Zr c19777712Zr) {
        c19777712Zr.zze &= -17;
        c19777712Zr.zzj = 0.0d;
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815412fw.LIZ[i - 1]) {
            case 1:
                return new C19777712Zr();
            case 2:
                return new C19778912a3();
            case 3:
                return new C19902812u2(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C19777712Zr.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19777712Zr> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19777712Zr.class) {
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

    public static void LJJI(C19777712Zr c19777712Zr, double d) {
        c19777712Zr.zze |= 16;
        c19777712Zr.zzj = d;
    }

    public static void LJJIFFI(C19777712Zr c19777712Zr, long j) {
        c19777712Zr.zze |= 4;
        c19777712Zr.zzh = j;
    }

    public static void LJJII(C19777712Zr c19777712Zr, String str) {
        c19777712Zr.getClass();
        str.getClass();
        c19777712Zr.zze |= 1;
        c19777712Zr.zzf = str;
    }

    public static void LJJIIJZLJL(C19777712Zr c19777712Zr, String str) {
        c19777712Zr.getClass();
        str.getClass();
        c19777712Zr.zze |= 2;
        c19777712Zr.zzg = str;
    }
}
