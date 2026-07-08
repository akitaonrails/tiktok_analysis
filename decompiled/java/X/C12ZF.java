package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12ZF, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C12ZF extends AbstractC19899612tW<C12ZF, C19783012ai> implements InterfaceC19900412te {
    public static final /* synthetic */ int LL = 0;
    public static final C12ZF zzc;
    public static volatile InterfaceC19816612g8<C12ZF> zzd;
    public int zze;
    public InterfaceC19875012pY<C12ZD> zzf = C19886312rN.LLILZ;
    public String zzg = "";
    public String zzh = "";
    public int zzi;

    static {
        C12ZF c12zf = new C12ZF();
        zzc = c12zf;
        AbstractC19899612tW.LJIIZILJ(C12ZF.class, c12zf);
    }

    public static C19783012ai LJJIFFI() {
        return zzc.LJIJI();
    }

    public final boolean LJJIII() {
        return (this.zze & 2) != 0;
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815412fw.LIZ[i - 1]) {
            case 1:
                return new C12ZF();
            case 2:
                return new AbstractC19899712tX<C12ZF, C19783012ai>() { // from class: X.12ai
                    {
                        C12ZF c12zf = C12ZF.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zze", "zzf", C12ZD.class, "zzg", "zzh", "zzi", EnumC19788312bZ.zzb()});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C12ZF> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C12ZF.class) {
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

    public static void LJJI(C12ZF c12zf, String str) {
        c12zf.getClass();
        str.getClass();
        c12zf.zze |= 2;
        c12zf.zzh = str;
    }
}
