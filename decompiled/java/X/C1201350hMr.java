package X;

/* JADX INFO: renamed from: X.0hMr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201350hMr extends AbstractC1201290hMl {
    public static final C1201350hMr LIZIZ = new C1201350hMr();
    public static final C1201390hMv LIZJ = C1201370hMt.LIZ();

    @Override // X.AbstractC1201400hMw
    public final String LIZLLL() {
        return "poi_float_notice_promote_precise_permission_frequency_info";
    }

    @Override // X.AbstractC1201400hMw
    public final long LIZJ() {
        Integer num = LIZJ.LIZIZ;
        return ((long) ((num != null ? num.intValue() : 0) * 24 * 60 * 60)) * 1000;
    }

    @Override // X.AbstractC1201400hMw
    public final int LJ() {
        Integer num = LIZJ.LIZJ;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // X.AbstractC1201290hMl
    public final long LJII() {
        Integer num = LIZJ.LIZ;
        return ((long) ((num != null ? num.intValue() : 0) * 24 * 60 * 60)) * 1000;
    }
}
