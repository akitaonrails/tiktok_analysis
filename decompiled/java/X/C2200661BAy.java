package X;

/* JADX INFO: renamed from: X.1BAy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2200661BAy extends AbstractC19907912ur implements InterfaceC19900612tg {
    public static final C2200661BAy zzb;
    public int zzd;
    public int zze;
    public Object zzf;
    public int zzg;
    public C1BB1 zzh;
    public int zzi;

    public static /* synthetic */ void LJIL(C2200661BAy c2200661BAy, int i) {
        c2200661BAy.zzg = i - 1;
        c2200661BAy.zzd |= 1;
    }

    static {
        C2200661BAy c2200661BAy = new C2200661BAy();
        zzb = c2200661BAy;
        AbstractC19907912ur.LJI(C2200661BAy.class, c2200661BAy);
    }

    public static C2200641BAw LJJ() {
        return (C2200641BAw) zzb.LJIIJJI();
    }

    public final C19914412vu LJJII() {
        return this.zze == 7 ? (C19914412vu) this.zzf : C19914412vu.LJIL();
    }

    public static C2200661BAy LJJIFFI(byte[] bArr) {
        return (C2200661BAy) AbstractC19907912ur.LJIJ(zzb, bArr);
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
                    return new C2200641BAw(i3);
                }
                return new C2200661BAy();
            }
            return new C19911412vQ(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C1BBS.LIZ, "zzh", C1BB5.class, "zzi", C1BBI.LIZ, C1BB2.class, C19914412vu.class});
        }
        return (byte) 1;
    }

    public static /* synthetic */ void LJIJJ(C2200661BAy c2200661BAy, C19914412vu c19914412vu) {
        c2200661BAy.zzf = c19914412vu;
        c2200661BAy.zze = 7;
    }

    public static /* synthetic */ void LJIJJLI(C2200661BAy c2200661BAy, C1BB2 c1bb2) {
        c2200661BAy.zzf = c1bb2;
        c2200661BAy.zze = 6;
    }

    public static /* synthetic */ void LJJIII(C2200661BAy c2200661BAy, EnumC2200651BAx enumC2200651BAx) {
        c2200661BAy.zzi = enumC2200651BAx.zza();
        c2200661BAy.zzd |= 4;
    }

    public static /* synthetic */ void LJJIIJ(C2200661BAy c2200661BAy, C1BB1 c1bb1) {
        c2200661BAy.zzh = c1bb1;
        c2200661BAy.zzd |= 2;
    }

    public static /* synthetic */ void LJJIIJZLJL(C2200661BAy c2200661BAy, C1BB5 c1bb5) {
        c2200661BAy.zzf = c1bb5;
        c2200661BAy.zze = 4;
    }
}
