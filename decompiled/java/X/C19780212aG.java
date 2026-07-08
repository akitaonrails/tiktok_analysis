package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12aG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19780212aG extends AbstractC19899612tW<C19780212aG, C19782412ac> implements InterfaceC19900412te {
    public static final C19780212aG zzc;
    public static volatile InterfaceC19816612g8<C19780212aG> zzd;
    public int zze;
    public String zzf = "";
    public String zzg = "";
    public String zzh = "";
    public int zzi;

    static {
        C19780212aG c19780212aG = new C19780212aG();
        zzc = c19780212aG;
        AbstractC19899612tW.LJIIZILJ(C19780212aG.class, c19780212aG);
    }

    public static C19780212aG LJJII() {
        return zzc;
    }

    public final int LJJI() {
        return this.zzi;
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815612fy.LIZ[i - 1]) {
            case 1:
                return new C19780212aG();
            case 2:
                return new AbstractC19899712tX<C19780212aG, C19782412ac>() { // from class: X.12ac
                    {
                        C19780212aG c19780212aG = C19780212aG.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19780212aG> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19780212aG.class) {
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
