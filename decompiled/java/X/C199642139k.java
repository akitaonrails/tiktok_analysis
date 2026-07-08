package X;

/* JADX INFO: renamed from: X.139k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199642139k extends AbstractC19907912ur implements InterfaceC19900612tg {
    public static final C199642139k zzb;
    public int zzd;
    public int zze;
    public int zzf;
    public String zzg = "";
    public String zzh = "";
    public String zzi = "";
    public String zzj = "";

    public static /* synthetic */ void LJIL(C199642139k c199642139k, String str) {
        c199642139k.zzd |= 4;
        c199642139k.zzg = str;
    }

    public static /* synthetic */ void LJJII(C199642139k c199642139k) {
        c199642139k.zzd |= 1;
        c199642139k.zze = 24;
    }

    static {
        C199642139k c199642139k = new C199642139k();
        zzb = c199642139k;
        AbstractC19907912ur.LJI(C199642139k.class, c199642139k);
    }

    public static C199644139m LJIJJ() {
        return (C199644139m) zzb.LJIIJJI();
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
                    return new C199644139m(i3);
                }
                return new C199642139k();
            }
            return new C19911412vQ(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public static /* synthetic */ void LJJ(C199642139k c199642139k, String str) {
        str.getClass();
        c199642139k.zzd |= 16;
        c199642139k.zzi = str;
    }

    public static /* synthetic */ void LJJI(C199642139k c199642139k, String str) {
        c199642139k.zzd |= 32;
        c199642139k.zzj = str;
    }

    public static /* synthetic */ void LJJIFFI(C199642139k c199642139k, String str) {
        str.getClass();
        c199642139k.zzd |= 8;
        c199642139k.zzh = str;
    }
}
