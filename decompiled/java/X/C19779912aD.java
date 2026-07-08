package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12aD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19779912aD extends AbstractC19899612tW<C19779912aD, C19782712af> implements InterfaceC19900412te {
    public static final /* synthetic */ int LL = 0;
    public static final C19779912aD zzc;
    public static volatile InterfaceC19816612g8<C19779912aD> zzd;
    public int zze;
    public int zzf;
    public InterfaceC19875012pY<C19778412Zy> zzg;
    public InterfaceC19875012pY<C19778012Zu> zzh;
    public boolean zzi;
    public boolean zzj;

    static {
        C19779912aD c19779912aD = new C19779912aD();
        zzc = c19779912aD;
        AbstractC19899612tW.LJIIZILJ(C19779912aD.class, c19779912aD);
    }

    public final boolean LJJII() {
        return (this.zze & 1) != 0;
    }

    public C19779912aD() {
        C19886312rN<Object> c19886312rN = C19886312rN.LLILZ;
        this.zzg = c19886312rN;
        this.zzh = c19886312rN;
    }

    public final int LJJI() {
        return this.zzf;
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815512fx.LIZ[i - 1]) {
            case 1:
                return new C19779912aD();
            case 2:
                return new AbstractC19899712tX<C19779912aD, C19782712af>() { // from class: X.12af
                    {
                        C19779912aD c19779912aD = C19779912aD.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", C19778412Zy.class, "zzh", C19778012Zu.class, "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19779912aD> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19779912aD.class) {
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
