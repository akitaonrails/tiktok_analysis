package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dp6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1065100dp6 implements InterfaceC1392590mLJ {
    public final String LIZ;

    @Override // X.InterfaceC1392590mLJ
    public String LIZ() {
        return LJII(this.LIZ, "anchor_id");
    }

    @Override // X.InterfaceC1392590mLJ
    public String LIZIZ() {
        return LJII(this.LIZ, "anchor_name");
    }

    @Override // X.InterfaceC1392590mLJ
    public String LIZJ() {
        return LJII(this.LIZ, "anchor_type");
    }

    @Override // X.InterfaceC1392590mLJ
    public C2344009Gk LIZLLL() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (C123100dR.LIZ(this.LIZ)) {
            JSONObject jSONObject = new JSONObject(this.LIZ);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!next.equals("anchor_id") && !next.equals("anchor_type") && !next.equals("anchor_name")) {
                    c2344009Gk.LJFF(next, jSONObject.optString(next, ""));
                }
            }
        }
        return c2344009Gk;
    }

    @Override // X.InterfaceC1392590mLJ
    public String LJ() {
        return LJII(this.LIZ, "anchor_type");
    }

    @Override // X.InterfaceC1392590mLJ
    public final String LJFF() {
        return LJII(this.LIZ, "anchor_id");
    }

    @Override // X.InterfaceC1392590mLJ
    public String LJI() {
        return LJII(this.LIZ, "anchor_name");
    }

    public C1065100dp6(String str) {
        this.LIZ = str;
    }

    public final String LJIIIIZZ(String str) {
        return LJII(this.LIZ, str);
    }

    public static String LJII(String str, String str2) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String strOptString = "";
        if (z) {
            return "";
        }
        try {
            strOptString = new JSONObject(str).optString(str2, "");
            return strOptString;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strOptString;
        }
    }
}
