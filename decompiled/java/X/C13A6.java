package X;

/* JADX INFO: renamed from: X.13A6, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13A6 extends AbstractC19907912ur implements InterfaceC19900612tg {
    public static final C13A6 zzb;
    public int zzd;
    public String zze = "";

    public static C13A6 LJIJJLI() {
        return zzb;
    }

    static {
        C13A6 c13a6 = new C13A6();
        zzb = c13a6;
        AbstractC19907912ur.LJI(C13A6.class, c13a6);
    }

    @Override // X.AbstractC19907912ur
    public final Object LJIIJ(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zzb;
                        }
                        throw null;
                    }
                    return new C19908012us() { // from class: X.13A7
                        {
                            C13A6 c13a6 = C13A6.zzb;
                        }
                    };
                }
                return new C13A6();
            }
            return new C19911412vQ(zzb, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
