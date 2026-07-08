package X;

/* JADX INFO: renamed from: X.13A8, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13A8 extends AbstractC19907912ur implements InterfaceC19900612tg {
    public static final C13A8 zzb;
    public int zzd;
    public Object zze;

    static {
        C13A8 c13a8 = new C13A8();
        zzb = c13a8;
        AbstractC19907912ur.LJI(C13A8.class, c13a8);
    }

    public final C13A6 LJIL() {
        return this.zzd == 2 ? (C13A6) this.zze : C13A6.LJIJJLI();
    }

    public static C13A8 LJIJJLI(byte[] bArr) {
        return (C13A8) AbstractC19907912ur.LJIJ(zzb, bArr);
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
                    return new C19908012us() { // from class: X.13A9
                        {
                            C13A8 c13a8 = C13A8.zzb;
                        }
                    };
                }
                return new C13A8();
            }
            return new C19911412vQ(zzb, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002<\u0000", new Object[]{"zze", "zzd", C13A6.class});
        }
        return (byte) 1;
    }
}
