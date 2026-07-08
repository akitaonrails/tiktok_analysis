package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0hMl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC1201290hMl extends AbstractC1201400hMw {
    @Override // X.AbstractC1201400hMw
    public final boolean LIZIZ() {
        try {
            String string = this.LIZ.getString(LIZLLL(), "");
            if (string == null || string.length() == 0) {
                return false;
            }
            C1201380hMu c1201380hMu = (C1201380hMu) C1058250de3.LIZ(string, C1201380hMu.class);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = c1201380hMu.LIZ;
            if (j == -1) {
                return false;
            }
            int i = c1201380hMu.LIZIZ;
            return i == 0 ? jCurrentTimeMillis - j < LJII() : i >= LJ() || jCurrentTimeMillis - c1201380hMu.LIZ < LIZJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            C1EMR c1emr = C1EMR.POI_DETAIL_LOCATION;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(c1emr, "float_notice_hit_frequency", null, e);
            return true;
        }
    }

    public abstract long LJII();

    @Override // X.AbstractC1201400hMw
    public final void LIZ() {
        try {
            String string = this.LIZ.getString(LIZLLL(), "");
            if (string == null || string.length() == 0) {
                return;
            }
            Object objLIZ = C1058250de3.LIZ(string, C1201380hMu.class);
            C1201380hMu c1201380hMu = (C1201380hMu) objLIZ;
            c1201380hMu.LIZ = -1L;
            c1201380hMu.LIZJ = 0;
            c1201380hMu.LIZIZ = 0;
            this.LIZ.storeString(LIZLLL(), C1058250de3.LIZLLL((C1201380hMu) objLIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            C1EMR c1emr = C1EMR.POI_DETAIL_LOCATION;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(c1emr, "float_notice_clear_frequency", null, e);
        }
    }
}
