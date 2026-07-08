package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12aF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19780112aF extends AbstractC19899612tW<C19780112aF, C19781012aO> implements InterfaceC19900412te {
    public static final C19780112aF zzc;
    public static volatile InterfaceC19816612g8<C19780112aF> zzd;
    public int zze;
    public String zzf = "";
    public boolean zzg;
    public boolean zzh;
    public int zzi;

    static {
        C19780112aF c19780112aF = new C19780112aF();
        zzc = c19780112aF;
        AbstractC19899612tW.LJIIZILJ(C19780112aF.class, c19780112aF);
    }

    public final boolean LJJIII() {
        return (this.zze & 2) != 0;
    }

    public final boolean LJJIIJ() {
        return (this.zze & 4) != 0;
    }

    public final boolean LJJIIJZLJL() {
        return (this.zze & 8) != 0;
    }

    public final int LJJI() {
        return this.zzi;
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815612fy.LIZ[i - 1]) {
            case 1:
                return new C19780112aF();
            case 2:
                return new C19781012aO();
            case 3:
                return new C19902812u2(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19780112aF> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19780112aF.class) {
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

    public static void LJJIFFI(C19780112aF c19780112aF, String str) {
        c19780112aF.getClass();
        str.getClass();
        c19780112aF.zze |= 1;
        c19780112aF.zzf = str;
    }
}
