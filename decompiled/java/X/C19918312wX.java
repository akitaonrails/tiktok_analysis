package X;

/* JADX INFO: renamed from: X.12wX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19918312wX extends AbstractC19907912ur implements InterfaceC19900612tg {
    public static final C19918312wX zzb;
    public int zzd;
    public int zze;
    public String zzf = "";

    static {
        C19918312wX c19918312wX = new C19918312wX();
        zzb = c19918312wX;
        AbstractC19907912ur.LJI(C19918312wX.class, c19918312wX);
    }

    public static C19918312wX LJIJJLI(byte[] bArr) {
        return (C19918312wX) AbstractC19907912ur.LJIJ(zzb, bArr);
    }

    @Override // X.AbstractC19907912ur
    public final Object LJIIJ(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zzb;
                        }
                        throw null;
                    }
                    return new C19908012us() { // from class: X.12wY
                        {
                            C19918312wX c19918312wX = C19918312wX.zzb;
                        }
                    };
                }
                return new C19918312wX();
            }
            return new C19911412vQ(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
