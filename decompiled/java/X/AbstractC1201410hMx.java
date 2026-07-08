package X;

/* JADX INFO: renamed from: X.0hMx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC1201410hMx extends AbstractC1201400hMw {
    @Override // X.AbstractC1201400hMw
    public final long LIZJ() {
        return 0L;
    }

    public abstract int LJII();

    @Override // X.AbstractC1201400hMw
    public final boolean LIZIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZLLL());
        sbLIZ.append("_count_");
        sbLIZ.append(curUserId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(LIZLLL());
        sbLIZ2.append("_ts_");
        sbLIZ2.append(curUserId);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        int i = this.LIZ.getInt(strLIZIZ, 0);
        long j = this.LIZ.getLong(strLIZIZ2, -1L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i < LJ()) {
            return false;
        }
        if (jCurrentTimeMillis - j < ((long) (LJII() * 24 * 60 * 60)) * 1000) {
            return true;
        }
        LIZ();
        return false;
    }
}
