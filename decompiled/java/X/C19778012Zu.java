package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12Zu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19778012Zu extends AbstractC19899612tW<C19778012Zu, C19782812ag> implements InterfaceC19900412te {
    public static final /* synthetic */ int LL = 0;
    public static final C19778012Zu zzc;
    public static volatile InterfaceC19816612g8<C19778012Zu> zzd;
    public int zze;
    public int zzf;
    public String zzg = "";
    public InterfaceC19875012pY<C19778612a0> zzh = C19886312rN.LLILZ;
    public boolean zzi;
    public C19778312Zx zzj;
    public boolean zzk;
    public boolean zzl;
    public boolean zzm;

    static {
        C19778012Zu c19778012Zu = new C19778012Zu();
        zzc = c19778012Zu;
        AbstractC19899612tW.LJIIZILJ(C19778012Zu.class, c19778012Zu);
    }

    public static C19782812ag LJJIFFI() {
        return zzc.LJIJI();
    }

    public final C19778312Zx LJJIII() {
        C19778312Zx c19778312Zx = this.zzj;
        return c19778312Zx == null ? C19778312Zx.LJJII() : c19778312Zx;
    }

    public final boolean LJJIIJ() {
        return (this.zze & 8) != 0;
    }

    public final boolean LJJIIJZLJL() {
        return (this.zze & 1) != 0;
    }

    public final boolean LJJIIZ() {
        return (this.zze & 64) != 0;
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815512fx.LIZ[i - 1]) {
            case 1:
                return new C19778012Zu();
            case 2:
                return new AbstractC19899712tX<C19778012Zu, C19782812ag>() { // from class: X.12ag
                    {
                        C19778012Zu c19778012Zu = C19778012Zu.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", C19778612a0.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19778012Zu> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19778012Zu.class) {
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

    public static void LJJI(C19778012Zu c19778012Zu, String str) {
        c19778012Zu.getClass();
        c19778012Zu.zze |= 2;
        c19778012Zu.zzg = str;
    }
}
