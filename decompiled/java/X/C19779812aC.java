package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12aC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19779812aC extends AbstractC19899612tW<C19779812aC, C19783712ap> implements InterfaceC19900412te {
    public static final C19779812aC zzc;
    public static volatile InterfaceC19816612g8<C19779812aC> zzd;
    public int zze;
    public InterfaceC19875012pY<C19789212bi> zzf;
    public InterfaceC19875012pY<C19789112bh> zzg;
    public InterfaceC19875012pY<C19787312bP> zzh;
    public boolean zzi;
    public InterfaceC19875012pY<C19789212bi> zzj;

    static {
        C19779812aC c19779812aC = new C19779812aC();
        zzc = c19779812aC;
        AbstractC19899612tW.LJIIZILJ(C19779812aC.class, c19779812aC);
    }

    public final boolean LJJII() {
        return (this.zze & 1) != 0;
    }

    public C19779812aC() {
        C19886312rN<Object> c19886312rN = C19886312rN.LLILZ;
        this.zzf = c19886312rN;
        this.zzg = c19886312rN;
        this.zzh = c19886312rN;
        this.zzj = c19886312rN;
    }

    public static C19779812aC LJJIFFI() {
        return zzc;
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815612fy.LIZ[i - 1]) {
            case 1:
                return new C19779812aC();
            case 2:
                return new AbstractC19899712tX<C19779812aC, C19783712ap>() { // from class: X.12ap
                    {
                        C19779812aC c19779812aC = C19779812aC.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", C19789212bi.class, "zzg", C19789112bh.class, "zzh", C19787312bP.class, "zzi", "zzj", C19789212bi.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19779812aC> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19779812aC.class) {
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
