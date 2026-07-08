package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12bi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19789212bi extends AbstractC19899612tW<C19789212bi, C19789612bm> implements InterfaceC19900412te {
    public static final C19789212bi zzc;
    public static volatile InterfaceC19816612g8<C19789212bi> zzd;
    public int zze;
    public int zzf;
    public int zzg;

    static {
        C19789212bi c19789212bi = new C19789212bi();
        zzc = c19789212bi;
        AbstractC19899612tW.LJIIZILJ(C19789212bi.class, c19789212bi);
    }

    public final EnumC19789412bk LJJIFFI() {
        EnumC19789412bk enumC19789412bkZza = EnumC19789412bk.zza(this.zzg);
        return enumC19789412bkZza == null ? EnumC19789412bk.CONSENT_STATUS_UNSPECIFIED : enumC19789412bkZza;
    }

    public final EnumC19789312bj LJJII() {
        EnumC19789312bj enumC19789312bjZza = EnumC19789312bj.zza(this.zzf);
        return enumC19789312bjZza == null ? EnumC19789312bj.CONSENT_TYPE_UNSPECIFIED : enumC19789312bjZza;
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815612fy.LIZ[i - 1]) {
            case 1:
                return new C19789212bi();
            case 2:
                return new AbstractC19899712tX<C19789212bi, C19789612bm>() { // from class: X.12bm
                    {
                        C19789212bi c19789212bi = C19789212bi.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", EnumC19789312bj.zzb(), "zzg", EnumC19789412bk.zzb()});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19789212bi> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19789212bi.class) {
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
