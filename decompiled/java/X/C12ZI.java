package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12ZI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C12ZI extends AbstractC19899612tW<C12ZI, C12ZH> implements InterfaceC19900412te {
    public static final /* synthetic */ int LL = 0;
    public static final C12ZI zzc;
    public static volatile InterfaceC19816612g8<C12ZI> zzd;
    public int zze;
    public InterfaceC19875012pY<C19777712Zr> zzf = C19886312rN.LLILZ;
    public String zzg = "";
    public long zzh;
    public long zzi;
    public int zzj;

    static {
        C12ZI c12zi = new C12ZI();
        zzc = c12zi;
        AbstractC19899612tW.LJIIZILJ(C12ZI.class, c12zi);
    }

    public static C12ZH LJJIIJ() {
        return zzc.LJIJI();
    }

    public final boolean LJJIIZ() {
        return (this.zze & 8) != 0;
    }

    public final boolean LJJIIZI() {
        return (this.zze & 4) != 0;
    }

    public final boolean LJJIJ() {
        return (this.zze & 2) != 0;
    }

    public final void LJJIJIIJI() {
        InterfaceC19875012pY<C19777712Zr> interfaceC19875012pY = this.zzf;
        if (interfaceC19875012pY.LIZIZ()) {
            return;
        }
        this.zzf = AbstractC19899612tW.LJIILIIL(interfaceC19875012pY);
    }

    public final int LJJI() {
        return this.zzj;
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815412fw.LIZ[i - 1]) {
            case 1:
                return new C12ZI();
            case 2:
                return new C12ZH();
            case 3:
                return new C19902812u2(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C19777712Zr.class, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C12ZI> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C12ZI.class) {
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

    public static void LJJIFFI(long j, C12ZI c12zi) {
        c12zi.zze |= 2;
        c12zi.zzh = j;
    }

    public static void LJJII(C12ZI c12zi, String str) {
        c12zi.getClass();
        str.getClass();
        c12zi.zze |= 1;
        c12zi.zzg = str;
    }

    public static void LJJIII(long j, C12ZI c12zi) {
        c12zi.zze |= 4;
        c12zi.zzi = j;
    }
}
