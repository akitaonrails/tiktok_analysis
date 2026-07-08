package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12bz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19790912bz extends AbstractC19899612tW<C19790912bz, C19791112c1> implements InterfaceC19900412te {
    public static final C19790912bz zzc;
    public static volatile InterfaceC19816612g8<C19790912bz> zzd;
    public int zze;
    public String zzf = "";
    public String zzg = "";
    public String zzh = "";
    public String zzi = "";
    public String zzj = "";
    public String zzk = "";
    public String zzl = "";

    static {
        C19790912bz c19790912bz = new C19790912bz();
        zzc = c19790912bz;
        AbstractC19899612tW.LJIIZILJ(C19790912bz.class, c19790912bz);
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815412fw.LIZ[i - 1]) {
            case 1:
                return new C19790912bz();
            case 2:
                return new AbstractC19899712tX<C19790912bz, C19791112c1>() { // from class: X.12c1
                    {
                        C19790912bz c19790912bz = C19790912bz.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19790912bz> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19790912bz.class) {
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
