package X;

/* JADX INFO: renamed from: X.12vu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19914412vu extends AbstractC19907912ur implements InterfaceC19900612tg {
    public static final C19914412vu zzb;
    public int zzd;
    public InterfaceC19911812vU zze = C19887812rc.LLILZIL;
    public String zzf = "";
    public boolean zzg;

    public static C19914412vu LJIL() {
        return zzb;
    }

    public static /* synthetic */ void LJJIFFI(C19914412vu c19914412vu, boolean z) {
        c19914412vu.zzd |= 2;
        c19914412vu.zzg = z;
    }

    static {
        C19914412vu c19914412vu = new C19914412vu();
        zzb = c19914412vu;
        AbstractC19907912ur.LJI(C19914412vu.class, c19914412vu);
    }

    public static C19914512vv LJIJJ() {
        return (C19914512vv) zzb.LJIIJJI();
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
                    return new C19914512vv(i3);
                }
                return new C19914412vu();
            }
            return new C19911412vQ(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", C1BB4.class, "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public static void LJJ(C19914412vu c19914412vu, Iterable iterable) {
        InterfaceC19911812vU interfaceC19911812vU = c19914412vu.zze;
        if (!interfaceC19911812vU.LIZIZ()) {
            int size = interfaceC19911812vU.size();
            c19914412vu.zze = interfaceC19911812vU.LJIJJ(size + size);
        }
        AbstractC19900712th.LIZLLL(iterable, c19914412vu.zze);
    }

    public static /* synthetic */ void LJJI(C19914412vu c19914412vu, String str) {
        str.getClass();
        c19914412vu.zzd |= 1;
        c19914412vu.zzf = str;
    }
}
