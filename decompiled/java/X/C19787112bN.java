package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12bN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19787112bN extends AbstractC19899612tW<C19787112bN, C19787212bO> implements InterfaceC19900412te {
    public static final C19787112bN zzc;
    public static volatile InterfaceC19816612g8<C19787112bN> zzd;
    public int zze;
    public String zzf = "";
    public InterfaceC19875012pY<C19787412bQ> zzg = C19886312rN.LLILZ;
    public boolean zzh;

    static {
        C19787112bN c19787112bN = new C19787112bN();
        zzc = c19787112bN;
        AbstractC19899612tW.LJIIZILJ(C19787112bN.class, c19787112bN);
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815612fy.LIZ[i - 1]) {
            case 1:
                return new C19787112bN();
            case 2:
                return new AbstractC19899712tX<C19787112bN, C19787212bO>() { // from class: X.12bO
                    {
                        C19787112bN c19787112bN = C19787112bN.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", C19787412bQ.class, "zzh"});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19787112bN> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19787112bN.class) {
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
