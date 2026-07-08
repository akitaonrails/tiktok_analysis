package X;

/* JADX INFO: renamed from: X.12vh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19913112vh extends AbstractC19907912ur implements InterfaceC19900612tg {
    public static final C19913112vh zzb;
    public C19910512vH zzd = C19910512vH.zza();

    static {
        C19913112vh c19913112vh = new C19913112vh();
        zzb = c19913112vh;
        AbstractC19907912ur.LJI(C19913112vh.class, c19913112vh);
    }

    public static C19913212vi LJIJJ() {
        return (C19913212vi) zzb.LJIIJJI();
    }

    public static /* synthetic */ C19910512vH LJIL(C19913112vh c19913112vh) {
        if (!c19913112vh.zzd.zze()) {
            c19913112vh.zzd = c19913112vh.zzd.zzb();
        }
        return c19913112vh.zzd;
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
                    return new C19913212vi(i3);
                }
                return new C19913112vh();
            }
            return new C19911412vQ(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zzd", C19913012vg.LIZ});
        }
        return (byte) 1;
    }
}
