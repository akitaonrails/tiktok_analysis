package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12cH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19792712cH extends AbstractC19899612tW<C19792712cH, C19792612cG> implements InterfaceC19900412te {
    public static final C19792712cH zzc;
    public static volatile InterfaceC19816612g8<C19792712cH> zzd;
    public int zze;
    public int zzf;
    public InterfaceC19875012pY<C19792712cH> zzg = C19886312rN.LLILZ;
    public String zzh = "";
    public String zzi = "";
    public boolean zzj;
    public double zzk;

    static {
        C19792712cH c19792712cH = new C19792712cH();
        zzc = c19792712cH;
        AbstractC19899612tW.LJIIZILJ(C19792712cH.class, c19792712cH);
    }

    public final EnumC19792912cJ LJJI() {
        EnumC19792912cJ enumC19792912cJZza = EnumC19792912cJ.zza(this.zzf);
        return enumC19792912cJZza == null ? EnumC19792912cJ.UNKNOWN : enumC19792912cJZza;
    }

    public final boolean LJJII() {
        return (this.zze & 8) != 0;
    }

    public final boolean LJJIII() {
        return (this.zze & 16) != 0;
    }

    public final boolean LJJIIJ() {
        return (this.zze & 4) != 0;
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815712fz.LIZ[i - 1]) {
            case 1:
                return new C19792712cH();
            case 2:
                return new AbstractC19899712tX<C19792712cH, C19792612cG>() { // from class: X.12cG
                    {
                        C19792712cH c19792712cH = C19792712cH.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", EnumC19792912cJ.zzb(), "zzg", C19792712cH.class, "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19792712cH> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19792712cH.class) {
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
