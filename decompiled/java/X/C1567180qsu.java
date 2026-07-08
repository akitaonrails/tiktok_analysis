package X;

/* JADX INFO: renamed from: X.0qsu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1567180qsu {
    public static final /* synthetic */ int LIZ = 0;

    public static C1567190qsv LIZ(C1567170qst c1567170qst) {
        long j = c1567170qst.LIZIZ;
        if (j <= 0) {
            return new C1567190qsv(true, 2);
        }
        if (c1567170qst.LIZ >= j) {
            return new C1567190qsv(false, EnumC587590N2v.COUNT_LIMIT);
        }
        if ((System.currentTimeMillis() - c1567170qst.LIZJ) / 86400000 < c1567170qst.LIZLLL) {
            return new C1567190qsv(false, EnumC587590N2v.DAY_LIMIT);
        }
        return new C1567190qsv(true, 2);
    }
}
