package X;

/* JADX INFO: renamed from: X.12vj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19913312vj extends AbstractC19907912ur implements InterfaceC19900612tg {
    public static final C19913312vj zzb;
    public int zzd;
    public int zzf;
    public C1BB1 zzi;
    public boolean zzj;
    public boolean zzk;
    public String zze = "";
    public InterfaceC19887912rd zzg = C19887712rb.LLILZIL;
    public InterfaceC19911812vU zzh = C19887812rc.LLILZIL;

    static {
        C19913312vj c19913312vj = new C19913312vj();
        zzb = c19913312vj;
        AbstractC19907912ur.LJI(C19913312vj.class, c19913312vj);
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
                    return new C19908012us() { // from class: X.12vk
                        {
                            C19913312vj c19913312vj = C19913312vj.zzb;
                        }
                    };
                }
                return new C19913312vj();
            }
            return new C19911412vQ(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", new InterfaceC19912612vc() { // from class: X.12vl
                @Override // X.InterfaceC19912612vc
                public final boolean LJII(int i3) {
                    return i3 == 0 || i3 == 1 || i3 == 2 || i3 == 3;
                }
            }, "zzg", C1BBI.LIZ, "zzh", C19913612vm.class, "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
