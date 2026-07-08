package X;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BjG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212921BjG implements InterfaceC2213271Bjp {
    public final InterfaceC2213131Bjb LIZ;
    public volatile boolean LIZIZ;
    public long LIZJ;
    public final View LIZLLL;

    public final void LIZIZ() {
        this.LIZIZ = true;
        C2212191Bi5.LIZJ().getClass();
    }

    public final void LIZJ() {
        if (this.LIZIZ) {
            return;
        }
        LIZIZ();
        C2212441BiU.LIZ().LIZIZ();
        InterfaceC2213131Bjb interfaceC2213131Bjb = this.LIZ;
        C2213201Bji c2213201Bji = new C2213201Bji();
        c2213201Bji.LIZ = 0;
        interfaceC2213131Bjb.LIZLLL(c2213201Bji);
    }

    public final void LJ() {
        this.LIZ.LIZJ();
    }

    public final void LJFF(C2212201Bi6 c2212201Bi6) {
        if (this.LIZIZ) {
            return;
        }
        int i = c2212201Bi6.LLJL;
        int i2 = 1;
        if (i == 0 || i == 1) {
            HashMap<String, Object> map = new HashMap<>();
            HashMap<String, Object> map2 = new HashMap<>();
            int i3 = C2212231Bi9.LJJIJIIJI;
            if (i3 != -1) {
                if (i3 != 1) {
                    i2 = 2;
                }
                map2.put("awemelaunch", Integer.valueOf(i2));
            }
            map2.put("show_type", "not_real_time");
            map.put("duration", Long.valueOf(System.currentTimeMillis() - this.LIZJ));
            map.put("is_ad_event", "1");
            if (!TextUtils.isEmpty(c2212201Bi6.LLJJIJI)) {
                map.put("log_extra", c2212201Bi6.LLJJIJI);
            }
            map.put("ad_fetch_time", Long.valueOf(c2212201Bi6.LLILLJJLI));
            C2212051Bhr.LIZJ().LJIIIIZZ(c2212201Bi6, 0L, "show_over", map, map2);
        }
        LIZIZ();
        C2212441BiU.LIZ().LIZIZ();
        InterfaceC2213131Bjb interfaceC2213131Bjb = this.LIZ;
        C2213201Bji c2213201Bji = new C2213201Bji();
        c2213201Bji.LIZ = 2;
        interfaceC2213131Bjb.LIZLLL(c2213201Bji);
    }

    public C2212921BjG(C2212931BjH c2212931BjH, InterfaceC2213131Bjb interfaceC2213131Bjb) {
        this.LIZLLL = c2212931BjH;
        this.LIZ = interfaceC2213131Bjb;
    }

    public final boolean LIZLLL(C2212201Bi6 c2212201Bi6, C2213051BjT c2213051BjT) {
        String str;
        int i;
        if (c2212201Bi6.LLJJJJ == 3 && c2213051BjT.LIZ < 0 && C2212161Bi2.LIZIZ(c2212201Bi6.LLJILLL)) {
            str = c2212201Bi6.LLJILLL;
            new Object() { // from class: X.1Bjg
            };
        } else {
            str = c2212201Bi6.LLJILJILJ;
        }
        String str2 = c2212201Bi6.LLJJIJIIJIL;
        if (c2213051BjT.LJ) {
            String str3 = c2213051BjT.LIZLLL;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("ad_fetch_time", c2212201Bi6.LLILLJJLI);
                if (!C2211541Bh2.LIZ(c2212201Bi6.LLJJIJI)) {
                    jSONObject.put("log_extra", c2212201Bi6.LLJJIJI);
                }
                jSONObject.put("is_ad_event", "1");
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                jSONObject = null;
            }
            C2212051Bhr.LIZJ().LJFF("splash_ad", str3, jSONObject, c2212201Bi6.LLJI);
        }
        List<C1031010cw7> listLIZ = LIZ(str, c2212201Bi6.LLJJ, str2);
        if (C2212081Bhu.LIZIZ(listLIZ)) {
            C1031000cw6 c1031000cw6LJ = c2212201Bi6.LJ();
            c1031000cw6LJ.LIZLLL = listLIZ;
            if (c2213051BjT.LIZ > 0) {
                c1031000cw6LJ.LJ.getClass();
            }
            this.LIZ.LIZIZ(c1031000cw6LJ);
            JSONObject jSONObject2 = new JSONObject();
            try {
                Point point = c2213051BjT.LIZJ;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.putOpt("click_x", Integer.valueOf(point.x));
                jSONObject3.putOpt("click_y", Integer.valueOf(point.y));
                jSONObject2.putOpt("ad_extra_data", jSONObject3);
                if (c2213051BjT.LIZ >= 0) {
                    i = 0;
                } else {
                    i = 1;
                }
                jSONObject2.putOpt("area", Integer.valueOf(i));
                jSONObject2.putOpt("log_extra", c2212201Bi6.LLJJIJI);
                jSONObject2.putOpt("is_ad_event", "1");
                jSONObject2.putOpt("show_time", Long.valueOf(System.currentTimeMillis() - this.LIZJ));
                jSONObject2.put("ad_fetch_time", c2212201Bi6.LLILLJJLI);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C2212051Bhr.LIZJ().LJFF("splash_ad", "click", jSONObject2, c2212201Bi6.LLJI);
            C2213281Bjq.LIZJ.getValue().LIZJ(null, c2212201Bi6.LLJI, c2212201Bi6.LLJLLIL, c2212201Bi6.LLJJIJI, true, -1L, null);
            LIZIZ();
            return true;
        }
        return false;
    }

    public static List<C1031010cw7> LIZ(String str, String str2, String str3) {
        int iLJIILJJIL;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && C2212161Bi2.LIZIZ(str) && (iLJIILJJIL = C2212161Bi2.LJIILJJIL(str)) != 0) {
            if (iLJIILJJIL == 5) {
                String str4 = C2212231Bi9.LIZ;
            } else {
                arrayList.add(new C1031010cw7(str, iLJIILJJIL));
            }
        }
        if (C1059910dgj.LIZ(str2)) {
            String str5 = C2212231Bi9.LIZ;
        }
        if (!TextUtils.isEmpty(str3) && (str3.startsWith("http://") || str3.startsWith("https://"))) {
            arrayList.add(new C1031010cw7(str3, 2));
        }
        return arrayList;
    }
}
