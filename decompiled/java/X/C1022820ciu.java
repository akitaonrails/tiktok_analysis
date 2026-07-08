package X;

import Y.ACallableS422S0100000_16;
import android.text.TextUtils;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ciu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022820ciu {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final CommonAdData LJFF;
    public final Map<String, Object> LJI = new LinkedHashMap();
    public final Map<String, Object> LJII = new LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LJ() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1022820ciu.LJ():org.json.JSONObject");
    }

    public final boolean LJI() {
        return (TextUtils.isEmpty(this.LIZ) || TextUtils.isEmpty(this.LIZIZ) || TextUtils.isEmpty(this.LIZJ)) ? false : true;
    }

    public final void LJII() {
        if (LJI()) {
            C1022670cif.LIZ.getClass();
            ((C1022840ciw) C1022670cif.LIZIZ()).LIZ(new C1074600e4Q(this.LIZ, this.LIZIZ, this.LJFF, this));
            ACallableS422S0100000_16 aCallableS422S0100000_16 = new ACallableS422S0100000_16(this, 6);
            IAppLogDepend iAppLogDependLIZ = C2214471Bll.LIZ();
            C15O7.LIZIZ(aCallableS422S0100000_16, iAppLogDependLIZ != null ? iAppLogDependLIZ.getLogThreadPool() : null, null);
        }
    }

    public final void LJIIIIZZ() {
        if (LJI()) {
            C1022670cif.LIZ.getClass();
            ((C1022840ciw) C1022670cif.LIZIZ()).LIZ(new C1074600e4Q(this.LIZ, this.LIZIZ, this.LJFF, this));
            Callable callable = new Callable() { // from class: X.0civ
                @Override // java.util.concurrent.Callable
                public final Object call() throws JSONException {
                    IAppLogDepend iAppLogDependLIZ;
                    InterfaceC1022880cj0 interfaceC1022880cj0;
                    C1022820ciu c1022820ciu;
                    C1C7U.LIZ("AdLogHelper$InnerAdLog@62d1.sendV3FromOldV1$1");
                    if (!TextUtils.equals(this.LL.LIZIZ, "click")) {
                        JSONObject jSONObjectLJ = this.LL.LJ();
                        jSONObjectLJ.put("tag", this.LL.LIZ);
                        jSONObjectLJ.put("value", this.LL.LIZJ);
                        jSONObjectLJ.put("group_id", this.LL.LIZLLL);
                        jSONObjectLJ.put("category", "event_v3");
                        try {
                            C1019240cd8 c1019240cd8 = C1019240cd8.LIZ;
                            C1022820ciu c1022820ciu2 = this.LL;
                            c1019240cd8.LIZ(c1022820ciu2.LIZ, c1022820ciu2.LIZIZ, c1022820ciu2.LIZJ, jSONObjectLJ);
                            C1022670cif.LIZ.getClass();
                            InterfaceC1022870ciz interfaceC1022870ciz = (InterfaceC1022870ciz) C1022670cif.LJIIJ.getValue();
                            C1022820ciu c1022820ciu3 = this.LL;
                            interfaceC1022870ciz.LIZ(new C1074600e4Q(c1022820ciu3.LJFF, jSONObjectLJ, c1022820ciu3.LIZIZ, c1022820ciu3.LIZJ));
                            interfaceC1022880cj0 = (InterfaceC1022880cj0) C1022670cif.LJIIJJI.getValue();
                            c1022820ciu = this.LL;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C1AF0.LJ(e);
                        }
                        if (!interfaceC1022880cj0.LIZ(new C1074600e4Q(c1022820ciu.LJFF, jSONObjectLJ, c1022820ciu.LIZIZ, c1022820ciu.LIZJ))) {
                            C1022820ciu c1022820ciu4 = this.LL;
                            C2184171Adz.LIZ(c1022820ciu4.LIZ, c1022820ciu4.LIZIZ, c1022820ciu4.LIZJ, jSONObjectLJ);
                            String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "enable_send_staging_adlog", "v3", true);
                            if (strLJJ != null) {
                                int iHashCode = strLJJ.hashCode();
                                if (iHashCode == 3707) {
                                    strLJJ.equals("v1");
                                } else if (iHashCode != 3709) {
                                    if (iHashCode == 96673 && strLJJ.equals("all")) {
                                        jSONObjectLJ.put("_ad_staging_flag", "3");
                                        IAppLogDepend iAppLogDependLIZ2 = C2214471Bll.LIZ();
                                        if (iAppLogDependLIZ2 != null) {
                                            iAppLogDependLIZ2.onEventV3Json(this.LL.LIZIZ, jSONObjectLJ);
                                        }
                                    }
                                } else if (strLJJ.equals("v3") && (iAppLogDependLIZ = C2214471Bll.LIZ()) != null) {
                                    iAppLogDependLIZ.onEventV3Json(this.LL.LIZIZ, jSONObjectLJ);
                                }
                            }
                        }
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AdLogHelper$InnerAdLog@62d1.sendV3FromOldV1$1");
                    return unit;
                }
            };
            IAppLogDepend iAppLogDependLIZ = C2214471Bll.LIZ();
            C15O7.LIZIZ(callable, iAppLogDependLIZ != null ? iAppLogDependLIZ.getLogThreadPool() : null, null);
        }
    }

    public final void LIZ(Map map) {
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    this.LJII.put((String) entry.getKey(), value);
                }
            }
        }
    }

    public final void LIZLLL(Map map) {
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    this.LJI.put((String) entry.getKey(), value);
                }
            }
        }
    }

    public final Object LJFF(String str) {
        if (str != null && str.length() != 0) {
            return ((LinkedHashMap) this.LJI).get(str);
        }
        return null;
    }

    public final void LIZIZ(Object obj, String str) {
        if (str != null && str.length() != 0 && obj != null) {
            if ((obj instanceof String) && ((CharSequence) obj).length() == 0) {
                return;
            }
            this.LJII.put(str, obj);
        }
    }

    public final void LIZJ(Object obj, String str) {
        if (str != null && str.length() != 0 && obj != null) {
            if ((obj instanceof String) && ((CharSequence) obj).length() == 0) {
                return;
            }
            this.LJI.put(str, obj);
        }
    }

    public C1022820ciu(String str, String str2, String str3, String str4, String str5, CommonAdData commonAdData) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = commonAdData;
    }
}
