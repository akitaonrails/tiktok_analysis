package X;

/* JADX INFO: renamed from: X.1BB1, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BB1 extends AbstractC19907912ur implements InterfaceC19900612tg {
    public static final C1BB1 zzb;
    public int zzd;
    public int zze;
    public int zzg;
    public int zzi;
    public int zzj;
    public String zzf = "";
    public String zzh = "";

    public static /* synthetic */ void LJIJJ(C1BB1 c1bb1, int i) {
        c1bb1.zzd |= 1;
        c1bb1.zze = i;
    }

    public static /* synthetic */ void LJJ(C1BB1 c1bb1, String str) {
        c1bb1.zzd |= 8;
        c1bb1.zzh = str;
    }

    public static /* synthetic */ void LJJIFFI(C1BB1 c1bb1) {
        c1bb1.zzd |= 32;
        c1bb1.zzj = 0;
    }

    public static /* synthetic */ void LJJII(C1BB1 c1bb1, int i) {
        c1bb1.zzd |= 16;
        c1bb1.zzi = i;
    }

    static {
        C1BB1 c1bb1 = new C1BB1();
        zzb = c1bb1;
        AbstractC19907912ur.LJI(C1BB1.class, c1bb1);
    }

    public static C1BB7 LJIJJLI() {
        return (C1BB7) zzb.LJIIJJI();
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
                    return new C1BB7(i3);
                }
                return new C1BB1();
            }
            return new C19911412vQ(zzb, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004\bင\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", new InterfaceC19912612vc() { // from class: X.1BBL
                @Override // X.InterfaceC19912612vc
                public final boolean LJII(int i4) {
                    return C1BAX.zzb(i4) != null;
                }
            }, "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public static /* synthetic */ void LJJI(C1BB1 c1bb1, String str) {
        str.getClass();
        c1bb1.zzd |= 2;
        c1bb1.zzf = str;
    }

    public static /* synthetic */ void LJJIII(C1BB1 c1bb1, C1BAX c1bax) {
        c1bb1.zzg = c1bax.zza();
        c1bb1.zzd |= 4;
    }
}
