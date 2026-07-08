package X;

/* JADX INFO: renamed from: X.1BB4, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BB4 extends AbstractC19907912ur implements InterfaceC19900612tg {
    public static final C1BB4 zzb;
    public int zzd;
    public int zze;
    public String zzf = "";

    public static /* synthetic */ void LJIL(C1BB4 c1bb4, String str) {
        c1bb4.zzd |= 2;
        c1bb4.zzf = str;
    }

    public static /* synthetic */ void LJJI(C1BB4 c1bb4, int i) {
        c1bb4.zze = i - 1;
        c1bb4.zzd |= 1;
    }

    public final int LJJ() {
        int iLIZ = C1BBT.LIZ(this.zze);
        if (iLIZ == 0) {
            return 1;
        }
        return iLIZ;
    }

    static {
        C1BB4 c1bb4 = new C1BB4();
        zzb = c1bb4;
        AbstractC19907912ur.LJI(C1BB4.class, c1bb4);
    }

    public static C1BBC LJIJJ() {
        return (C1BBC) zzb.LJIIJJI();
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
                    return new C1BBC(i3);
                }
                return new C1BB4();
            }
            return new C19911412vQ(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", new InterfaceC19912612vc() { // from class: X.1BBM
                @Override // X.InterfaceC19912612vc
                public final boolean LJII(int i4) {
                    return C1BBT.LIZ(i4) != 0;
                }
            }, "zzf"});
        }
        return (byte) 1;
    }
}
