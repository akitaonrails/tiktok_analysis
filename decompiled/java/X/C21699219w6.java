package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* JADX INFO: renamed from: X.19w6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21699219w6 {
    public final C21698919w3 LIZ;
    public long LIZIZ;

    public C21699219w6(C21698919w3 c21698919w3) {
        this.LIZ = c21698919w3;
    }

    public final void LIZ(C2344009Gk c2344009Gk) {
        Map mapLJ;
        String str;
        C21698919w3 c21698919w3 = this.LIZ;
        if (c21698919w3 == null || (str = c21698919w3.bizParams) == null || str.length() == 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            try {
                mapLJ = (Map) C309390CAv.LIZ(str, new TypeToken<Map<String, ? extends String>>() { // from class: X.04YS
                }.getType());
                if (mapLJ == null) {
                    mapLJ = C2097608Jq.LJ();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                mapLJ = C2097608Jq.LJ();
            }
        }
        c2344009Gk.LJII(mapLJ);
    }

    public final void LIZIZ(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        Integer num;
        String str7;
        C2344009Gk c2344009Gk = new C2344009Gk();
        LIZ(c2344009Gk);
        C21698919w3 c21698919w3 = this.LIZ;
        String str8 = null;
        if (c21698919w3 != null) {
            str3 = c21698919w3.enterFrom;
        } else {
            str3 = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        C21698919w3 c21698919w32 = this.LIZ;
        if (c21698919w32 != null) {
            str4 = c21698919w32.groupId;
        } else {
            str4 = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", str4);
        C21698919w3 c21698919w33 = this.LIZ;
        if (c21698919w33 != null) {
            str5 = c21698919w33.authorId;
        } else {
            str5 = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", str5);
        C21698919w3 c21698919w34 = this.LIZ;
        if (c21698919w34 != null) {
            str6 = c21698919w34.componentKey;
        } else {
            str6 = null;
        }
        c2344009Gk.LJIIIIZZ("component_key", str6);
        C21698919w3 c21698919w35 = this.LIZ;
        if (c21698919w35 != null) {
            num = c21698919w35.awemeType;
        } else {
            num = null;
        }
        c2344009Gk.LJ(num, "aweme_type");
        C21698919w3 c21698919w36 = this.LIZ;
        if (c21698919w36 != null) {
            str7 = c21698919w36.componentType;
        } else {
            str7 = null;
        }
        c2344009Gk.LJIIIIZZ("component_type", str7);
        C21698919w3 c21698919w37 = this.LIZ;
        if (c21698919w37 != null) {
            str8 = c21698919w37.enterMethod;
        }
        c2344009Gk.LJIIIIZZ("enter_method", str8);
        c2344009Gk.LJIIIIZZ("enter_type", str);
        c2344009Gk.LJIIIIZZ("exit_method", str2);
        c2344009Gk.LIZLLL(System.currentTimeMillis() - this.LIZIZ, "duration");
        C20684815ws.LJIILLIIL("core_fdmt_landing_page_stay_time", c2344009Gk.LIZ);
    }
}
