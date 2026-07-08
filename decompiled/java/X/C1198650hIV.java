package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0hIV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1198650hIV extends AbstractC1201400hMw {
    public static final C1198650hIV LIZIZ = new C1198650hIV();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(693));

    @Override // X.AbstractC1201400hMw
    public final long LIZJ() {
        return 0L;
    }

    @Override // X.AbstractC1201400hMw
    public final String LIZLLL() {
        return "poi_search_precise_gps_banner_show_index";
    }

    @Override // X.AbstractC1201400hMw
    public final int LJ() {
        return Integer.MAX_VALUE;
    }

    public final void LJII() {
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("poi_search_precise_gps_banner_show_index");
        sbLIZ.append('_');
        sbLIZ.append((String) LIZJ.getValue());
        keva.storeInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    public final void LJIIIIZZ() {
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("poi_search_precise_gps_banner_show_index");
        sbLIZ.append('_');
        C01GW c01gw = LIZJ;
        sbLIZ.append((String) c01gw.getValue());
        int i = keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        Keva keva2 = this.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("poi_search_precise_gps_banner_show_index");
        sbLIZ2.append('_');
        sbLIZ2.append((String) c01gw.getValue());
        keva2.storeInt(C2188811AlT.LIZIZ(sbLIZ2), i + 1);
    }
}
