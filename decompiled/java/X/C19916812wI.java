package X;

/* JADX INFO: renamed from: X.12wI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19916812wI extends AbstractC19907912ur implements InterfaceC19900612tg {
    public static final C19916812wI zzb;
    public int zzd;
    public C19916612wG zze;
    public C19916612wG zzf;
    public int zzg;

    static {
        C19916812wI c19916812wI = new C19916812wI();
        zzb = c19916812wI;
        AbstractC19907912ur.LJI(C19916812wI.class, c19916812wI);
    }

    @Override // X.AbstractC19907912ur
    public final Object LJIIJ(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            final int i3 = 0;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zzb;
                        }
                        throw null;
                    }
                    return new C19908012us(i3) { // from class: X.12wJ
                        {
                            super(C19916812wI.zzb);
                        }
                    };
                }
                return new C19916812wI();
            }
            return new C19911412vQ(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", new InterfaceC19912612vc() { // from class: X.12wK
                @Override // X.InterfaceC19912612vc
                public final boolean LJII(int i4) {
                    switch (i4) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            return true;
                        default:
                            return false;
                    }
                }
            }});
        }
        return (byte) 1;
    }
}
