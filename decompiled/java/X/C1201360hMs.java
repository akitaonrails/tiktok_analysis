package X;

/* JADX INFO: renamed from: X.0hMs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201360hMs extends AbstractC1201290hMl {
    public static final C1201360hMs LIZIZ = new C1201360hMs();
    public static final C1201390hMv LIZJ;

    @Override // X.AbstractC1201400hMw
    public final String LIZLLL() {
        return "poi_float_notice_permission_frequency_info";
    }

    static {
        C1201390hMv c1201390hMv = new C1201390hMv();
        c1201390hMv.LIZ = C1201430hMz.LIZIZ().frequency.floatNoticeNoCloseFrequencyDays;
        c1201390hMv.LIZIZ = C1201430hMz.LIZIZ().frequency.floatNoticeFrequencyDays;
        c1201390hMv.LIZJ = C1201430hMz.LIZIZ().frequency.floatNoticeMaxCloseCount;
        LIZJ = c1201390hMv;
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
