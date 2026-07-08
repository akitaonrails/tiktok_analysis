package X;

/* JADX INFO: renamed from: X.1BB6, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BB6 extends AbstractC19907912ur implements InterfaceC19900612tg {
    public static final C1BB6 zzb;
    public int zzd;
    public int zze;

    public static C1BB6 LJIJJLI() {
        return zzb;
    }

    static {
        C1BB6 c1bb6 = new C1BB6();
        zzb = c1bb6;
        AbstractC19907912ur.LJI(C1BB6.class, c1bb6);
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
                    return new C19908012us() { // from class: X.1BBG
                        {
                            C1BB6 c1bb6 = C1BB6.zzb;
                        }
                    };
                }
                return new C1BB6();
            }
            return new C19911412vQ(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", new InterfaceC19912612vc() { // from class: X.1BBQ
                @Override // X.InterfaceC19912612vc
                public final boolean LJII(int i3) {
                    return i3 == 0 || i3 == 1;
                }
            }});
        }
        return (byte) 1;
    }
}
