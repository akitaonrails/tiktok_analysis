package X;

/* JADX INFO: renamed from: X.1BB2, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BB2 extends AbstractC19907912ur implements InterfaceC19900612tg {
    public static final C1BB2 zzb;
    public int zzd;
    public int zze;
    public boolean zzf;
    public long zzg;
    public boolean zzh;
    public int zzi;
    public int zzj;

    public static /* synthetic */ void LJIL(C1BB2 c1bb2, boolean z) {
        c1bb2.zzd |= 8;
        c1bb2.zzh = z;
    }

    public static /* synthetic */ void LJJ(C1BB2 c1bb2, int i) {
        c1bb2.zzd |= 16;
        c1bb2.zzi = i;
    }

    public static /* synthetic */ void LJJI(C1BB2 c1bb2, long j) {
        c1bb2.zzd |= 4;
        c1bb2.zzg = j;
    }

    public static /* synthetic */ void LJJIFFI(C1BB2 c1bb2) {
        c1bb2.zzd |= 32;
        c1bb2.zzj = 0;
    }

    public static /* synthetic */ void LJJII(C1BB2 c1bb2) {
        c1bb2.zzd |= 2;
        c1bb2.zzf = true;
    }

    static {
        C1BB2 c1bb2 = new C1BB2();
        zzb = c1bb2;
        AbstractC19907912ur.LJI(C1BB2.class, c1bb2);
    }

    public static C1BB8 LJIJJ() {
        return (C1BB8) zzb.LJIIJJI();
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
                    return new C1BB8(i3);
                }
                return new C1BB2();
            }
            return new C19911412vQ(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
