package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0hMy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201420hMy extends AbstractC1201400hMw {
    public static final C1201420hMy LIZIZ = new C1201420hMy();

    @Override // X.AbstractC1201400hMw
    public final boolean LIZIZ() {
        try {
            String string = this.LIZ.getString("poi_detail_location_permission_frequency_info", "");
            if (string == null || string.length() == 0) {
                return false;
            }
            C1201460hN2 c1201460hN2 = (C1201460hN2) C1058250de3.LIZ(string, C1201460hN2.class);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (C1201430hMz.LIZLLL().LIZ) {
                return c1201460hN2.LIZ >= LJ();
            }
            if (c1201460hN2.LIZIZ == -1) {
                return false;
            }
            return c1201460hN2.LIZ >= LJ() || jCurrentTimeMillis - c1201460hN2.LIZIZ < LIZJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            C1EMR c1emr = C1EMR.POI_DETAIL_LOCATION;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(c1emr, "popup_hit_frequency", null, e);
            return true;
        }
    }

    @Override // X.AbstractC1201400hMw
    public final String LIZLLL() {
        return "poi_detail_location_permission_frequency_info";
    }

    @Override // X.AbstractC1201400hMw
    public final void LIZ() {
        try {
            String string = this.LIZ.getString("poi_detail_location_permission_frequency_info", "");
            if (string == null || string.length() == 0) {
                return;
            }
            this.LIZ.erase("poi_detail_location_permission_frequency_info");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            C1EMR c1emr = C1EMR.POI_DETAIL_LOCATION;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(c1emr, "popup_clear_frequency", null, e);
        }
    }

    public final void LJII() {
        C1201460hN2 c1201460hN2;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String string = this.LIZ.getString("poi_detail_location_permission_frequency_info", "");
            if (string == null || string.length() == 0) {
                c1201460hN2 = new C1201460hN2(1, jCurrentTimeMillis);
            } else {
                Object objLIZ = C1058250de3.LIZ(string, C1201460hN2.class);
                C1201460hN2 c1201460hN22 = (C1201460hN2) objLIZ;
                c1201460hN22.LIZIZ = jCurrentTimeMillis;
                c1201460hN22.LIZ++;
                c1201460hN2 = (C1201460hN2) objLIZ;
            }
            this.LIZ.storeString("poi_detail_location_permission_frequency_info", C1058250de3.LIZLLL(c1201460hN2));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            C1EMR c1emr = C1EMR.POI_DETAIL_LOCATION;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(c1emr, "popup_store_frequency", null, e);
        }
    }

    @Override // X.AbstractC1201400hMw
    public final long LIZJ() {
        return ((long) (C1201430hMz.LIZLLL().LIZIZ * 24 * 60 * 60)) * 1000;
    }

    @Override // X.AbstractC1201400hMw
    public final int LJ() {
        return C1201430hMz.LIZLLL().LIZJ;
    }
}
