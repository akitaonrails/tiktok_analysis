package X;

/* JADX INFO: renamed from: X.1BB3, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BB3 extends AbstractC19907912ur implements InterfaceC19900612tg {
    public static final C1BB3 zzb;
    public int zzd;
    public C1BB1 zze;
    public long zzf;

    public static /* synthetic */ void LJJ(C1BB3 c1bb3, long j) {
        c1bb3.zzd |= 2;
        c1bb3.zzf = j;
    }

    static {
        C1BB3 c1bb3 = new C1BB3();
        zzb = c1bb3;
        AbstractC19907912ur.LJI(C1BB3.class, c1bb3);
    }

    public static C1BBE LJIJJ() {
        return (C1BBE) zzb.LJIIJJI();
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
                    return new C1BBE(i3);
                }
                return new C1BB3();
            }
            return new C19911412vQ(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public static /* synthetic */ void LJIL(C1BB3 c1bb3, C1BB1 c1bb1) {
        c1bb3.zze = c1bb1;
        c1bb3.zzd |= 1;
    }
}
