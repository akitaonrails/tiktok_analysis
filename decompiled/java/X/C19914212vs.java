package X;

/* JADX INFO: renamed from: X.12vs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19914212vs extends AbstractC19907912ur implements InterfaceC19900612tg {
    public static final C19914212vs zzb;
    public InterfaceC19911812vU zzd = C19887812rc.LLILZIL;

    static {
        C19914212vs c19914212vs = new C19914212vs();
        zzb = c19914212vs;
        AbstractC19907912ur.LJI(C19914212vs.class, c19914212vs);
    }

    public static C19914312vt LJIJJ() {
        return (C19914312vt) zzb.LJIIJJI();
    }

    @Override // X.AbstractC19907912ur
    public final Object LJIIJ(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            int i3 = 0;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zzb;
                        }
                        throw null;
                    }
                    return new C19914312vt(i3);
                }
                return new C19914212vs();
            }
            return new C19911412vQ(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C19916812wI.class});
        }
        return (byte) 1;
    }

    public static void LJIL(C19914212vs c19914212vs, Iterable iterable) {
        InterfaceC19911812vU interfaceC19911812vU = c19914212vs.zzd;
        if (!interfaceC19911812vU.LIZIZ()) {
            int size = interfaceC19911812vU.size();
            c19914212vs.zzd = interfaceC19911812vU.LJIJJ(size + size);
        }
        AbstractC19900712th.LIZLLL(iterable, c19914212vs.zzd);
    }
}
