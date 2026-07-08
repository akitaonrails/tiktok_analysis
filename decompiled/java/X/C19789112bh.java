package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12bh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19789112bh extends AbstractC19899612tW<C19789112bh, C19789712bn> implements InterfaceC19900412te {
    public static final C19789112bh zzc;
    public static volatile InterfaceC19816612g8<C19789112bh> zzd;
    public int zze;
    public int zzf;
    public int zzg;

    static {
        C19789112bh c19789112bh = new C19789112bh();
        zzc = c19789112bh;
        AbstractC19899612tW.LJIIZILJ(C19789112bh.class, c19789112bh);
    }

    public final EnumC19789312bj LJJIFFI() {
        EnumC19789312bj enumC19789312bjZza = EnumC19789312bj.zza(this.zzg);
        return enumC19789312bjZza == null ? EnumC19789312bj.CONSENT_TYPE_UNSPECIFIED : enumC19789312bjZza;
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
                return new C19789112bh();
            case 2:
                return new AbstractC19899712tX<C19789112bh, C19789712bn>() { // from class: X.12bn
                    {
                        C19789112bh c19789112bh = C19789112bh.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", EnumC19789312bj.zzb(), "zzg", EnumC19789312bj.zzb()});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19789112bh> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19789112bh.class) {
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
