package X;

/* JADX INFO: renamed from: X.1BAz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2200671BAz extends AbstractC19907912ur implements InterfaceC19900612tg {
    public static final C2200671BAz zzb;
    public int zzd;
    public int zze;
    public Object zzf;
    public int zzg;
    public int zzh;

    public static /* synthetic */ void LJIJJ(C2200671BAz c2200671BAz, int i) {
        c2200671BAz.zzg = i - 1;
        c2200671BAz.zzd |= 1;
    }

    static {
        C2200671BAz c2200671BAz = new C2200671BAz();
        zzb = c2200671BAz;
        AbstractC19907912ur.LJI(C2200671BAz.class, c2200671BAz);
    }

    public static C1BBB LJIJJLI() {
        return (C1BBB) zzb.LJIIJJI();
    }

    public final C19914412vu LJJ() {
        return this.zze == 4 ? (C19914412vu) this.zzf : C19914412vu.LJIL();
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
                    return new C1BBB(i3);
                }
                return new C2200671BAz();
            }
            return new C19911412vQ(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", C1BBS.LIZ, C1BB5.class, C1BB2.class, C19914412vu.class, "zzh", C1BBI.LIZ});
        }
        return (byte) 1;
    }

    public static /* synthetic */ void LJJI(C2200671BAz c2200671BAz, EnumC2200651BAx enumC2200651BAx) {
        c2200671BAz.zzh = enumC2200651BAx.zza();
        c2200671BAz.zzd |= 2;
    }

    public static /* synthetic */ void LJJIFFI(C2200671BAz c2200671BAz, C1BB5 c1bb5) {
        c2200671BAz.zzf = c1bb5;
        c2200671BAz.zze = 2;
    }

    public static /* synthetic */ void LJJII(C2200671BAz c2200671BAz, C19914412vu c19914412vu) {
        c2200671BAz.zzf = c19914412vu;
        c2200671BAz.zze = 4;
    }

    public static /* synthetic */ void LJJIII(C2200671BAz c2200671BAz, C1BB2 c1bb2) {
        c2200671BAz.zzf = c1bb2;
        c2200671BAz.zze = 3;
    }
}
