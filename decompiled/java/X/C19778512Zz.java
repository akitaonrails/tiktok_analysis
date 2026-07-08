package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12Zz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19778512Zz extends AbstractC19899612tW<C19778512Zz, C19783312al> implements InterfaceC19900412te {
    public static final C19778512Zz zzc;
    public static volatile InterfaceC19816612g8<C19778512Zz> zzd;
    public int zze;
    public int zzf;
    public boolean zzh;
    public String zzg = "";
    public InterfaceC19875012pY<String> zzi = C19886312rN.LLILZ;

    static {
        C19778512Zz c19778512Zz = new C19778512Zz();
        zzc = c19778512Zz;
        AbstractC19899612tW.LJIIZILJ(C19778512Zz.class, c19778512Zz);
    }

    public final EnumC19788112bX LJJI() {
        EnumC19788112bX enumC19788112bXZza = EnumC19788112bX.zza(this.zzf);
        return enumC19788112bXZza == null ? EnumC19788112bX.UNKNOWN_MATCH_TYPE : enumC19788112bXZza;
    }

    public final boolean LJJIII() {
        return (this.zze & 4) != 0;
    }

    public final boolean LJJIIJ() {
        return (this.zze & 2) != 0;
    }

    public final boolean LJJIIJZLJL() {
        return (this.zze & 1) != 0;
    }

    public static C19778512Zz LJJII() {
        return zzc;
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815512fx.LIZ[i - 1]) {
            case 1:
                return new C19778512Zz();
            case 2:
                return new AbstractC19899712tX<C19778512Zz, C19783312al>() { // from class: X.12al
                    {
                        C19778512Zz c19778512Zz = C19778512Zz.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", EnumC19788112bX.zzb(), "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19778512Zz> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19778512Zz.class) {
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
