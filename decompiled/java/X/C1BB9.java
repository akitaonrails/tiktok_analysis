package X;

/* JADX INFO: renamed from: X.1BB9, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BB9 extends AbstractC19907912ur implements InterfaceC19900612tg {
    public static final C1BB9 zzb;

    public static C1BB9 LJIJJLI() {
        return zzb;
    }

    static {
        C1BB9 c1bb9 = new C1BB9();
        zzb = c1bb9;
        AbstractC19907912ur.LJI(C1BB9.class, c1bb9);
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
                    return new C19908012us() { // from class: X.1BBF
                        {
                            C1BB9 c1bb9 = C1BB9.zzb;
                        }
                    };
                }
                return new C1BB9();
            }
            return new C19911412vQ(zzb, "\u0004\u0000", null);
        }
        return (byte) 1;
    }
}
