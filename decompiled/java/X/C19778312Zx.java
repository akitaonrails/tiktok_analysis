package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12Zx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19778312Zx extends AbstractC19899612tW<C19778312Zx, C19783112aj> implements InterfaceC19900412te {
    public static final C19778312Zx zzc;
    public static volatile InterfaceC19816612g8<C19778312Zx> zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public String zzh = "";
    public String zzi = "";
    public String zzj = "";

    static {
        C19778312Zx c19778312Zx = new C19778312Zx();
        zzc = c19778312Zx;
        AbstractC19899612tW.LJIIZILJ(C19778312Zx.class, c19778312Zx);
    }

    public final EnumC19788212bY LJJI() {
        EnumC19788212bY enumC19788212bYZza = EnumC19788212bY.zza(this.zzf);
        return enumC19788212bYZza == null ? EnumC19788212bY.UNKNOWN_COMPARISON_TYPE : enumC19788212bYZza;
    }

    public final boolean LJJIII() {
        return (this.zze & 1) != 0;
    }

    public final boolean LJJIIJ() {
        return (this.zze & 4) != 0;
    }

    public final boolean LJJIIJZLJL() {
        return (this.zze & 2) != 0;
    }

    public final boolean LJJIIZ() {
        return (this.zze & 16) != 0;
    }

    public final boolean LJJIIZI() {
        return (this.zze & 8) != 0;
    }

    public static C19778312Zx LJJII() {
        return zzc;
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815512fx.LIZ[i - 1]) {
            case 1:
                return new C19778312Zx();
            case 2:
                return new AbstractC19899712tX<C19778312Zx, C19783112aj>() { // from class: X.12aj
                    {
                        C19778312Zx c19778312Zx = C19778312Zx.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", EnumC19788212bY.zzb(), "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19778312Zx> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19778312Zx.class) {
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
