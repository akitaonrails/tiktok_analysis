package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0hMw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC1201400hMw {
    public final Keva LIZ;

    public abstract long LIZJ();

    public abstract String LIZLLL();

    public abstract int LJ();

    public String LJFF() {
        return null;
    }

    public AbstractC1201400hMw() {
        C20489080x.LIZ.getClass();
        this.LIZ = C20489080x.LIZLLL();
    }

    public void LIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZLLL());
        sbLIZ.append("_count_");
        sbLIZ.append(curUserId);
        keva.storeInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        Keva keva2 = this.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        String strLJFF = LJFF();
        if (strLJFF == null) {
            strLJFF = LIZLLL();
        }
        sbLIZ2.append(strLJFF);
        sbLIZ2.append("_ts_");
        sbLIZ2.append(curUserId);
        keva2.storeLong(C2188811AlT.LIZIZ(sbLIZ2), -1L);
    }

    public boolean LIZIZ() {
        String curUserId = C0XQ7.LJFF().getCurUserId();
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZLLL());
        sbLIZ.append("_count_");
        sbLIZ.append(curUserId);
        int i = keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        Keva keva2 = this.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        String strLJFF = LJFF();
        if (strLJFF == null) {
            strLJFF = LIZLLL();
        }
        sbLIZ2.append(strLJFF);
        sbLIZ2.append("_ts_");
        sbLIZ2.append(curUserId);
        long j = keva2.getLong(C2188811AlT.LIZIZ(sbLIZ2), -1L);
        return i >= LJ() || (j > 0 && LIZJ() > System.currentTimeMillis() - j);
    }

    public final void LJI(boolean z) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZLLL());
        sbLIZ.append("_count_");
        sbLIZ.append(curUserId);
        int i = keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        Keva keva2 = this.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        String strLJFF = LJFF();
        if (strLJFF == null) {
            strLJFF = LIZLLL();
        }
        sbLIZ2.append(strLJFF);
        sbLIZ2.append("_ts_");
        sbLIZ2.append(curUserId);
        keva2.storeLong(C2188811AlT.LIZIZ(sbLIZ2), System.currentTimeMillis());
        if (z) {
            Keva keva3 = this.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(LIZLLL());
            sbLIZ3.append("_count_");
            sbLIZ3.append(curUserId);
            keva3.storeInt(C2188811AlT.LIZIZ(sbLIZ3), i + 1);
        }
    }
}
