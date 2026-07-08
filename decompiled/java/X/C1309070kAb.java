package X;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kAb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1309070kAb implements InterfaceC1308990kAT {
    public final WeakReference<C1309090kAd> LIZ;
    public final /* synthetic */ C1309090kAd LIZIZ;

    public C1309070kAb(C1309090kAd c1309090kAd, C1309090kAd c1309090kAd2) {
        this.LIZIZ = c1309090kAd;
        this.LIZ = new WeakReference<>(c1309090kAd2);
    }

    public final void LIZ(int i, String str) {
        LIZIZ(i, str, null, null, null, null);
    }

    public final void LIZIZ(int i, String str, JSONObject jSONObject, JSONObject jSONObject2, String str2, String str3) {
        C1309090kAd c1309090kAd = this.LIZ.get();
        if (c1309090kAd == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refresh settings: code ");
        sbLIZ.append(i);
        sbLIZ.append(", message = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (i != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("refresh data fail. code = ");
            sbLIZ2.append(i);
            C2188811AlT.LIZIZ(sbLIZ2);
            return;
        }
        if (jSONObject2 != null) {
            long jOptLong = jSONObject2.optLong("config_version");
            c1309090kAd.LIZLLL.setConfigVersion(jOptLong);
            C1309060kAa c1309060kAa = this.LIZIZ.LJ.get("common");
            c1309060kAa.LJ("config_version", jOptLong);
            int iOptInt = jSONObject2.optInt("max_fetch_times", -1);
            if (iOptInt > 0) {
                c1309060kAa.LIZLLL("max_fetch_times", iOptInt);
                c1309090kAd.LIZLLL.setMaxFetchTimes(iOptInt);
            }
            int iOptInt2 = jSONObject2.optInt("fetch_interval");
            if (iOptInt2 > 0 && iOptInt2 != c1309060kAa.LIZ("fetch_interval", -1)) {
                c1309060kAa.LIZLLL("fetch_interval", iOptInt2);
                c1309090kAd.LIZLLL.setFetchInterval(iOptInt2);
                this.LIZIZ.LIZJ(iOptInt2);
            }
            long jOptLong2 = jSONObject2.optLong("local_cache_expire");
            if (jOptLong2 > 0) {
                c1309060kAa.LJ("local_cache_expire", System.currentTimeMillis() + (jOptLong2 * 1000));
            }
            boolean zOptBoolean = jSONObject2.optBoolean("use_local_cache");
            c1309060kAa.LIZLLL("use_local_cache", zOptBoolean ? 1 : 0);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("useLocalCache = ");
            sbLIZ3.append(zOptBoolean);
            C2188811AlT.LIZIZ(sbLIZ3);
            if (!zOptBoolean) {
                this.LIZIZ.LJ.get("portrait").LJFF();
                this.LIZIZ.LJ.get("vod").LJFF();
            }
        }
        if (jSONObject != null) {
            if (str2 != null && !str2.equals("all")) {
                this.LIZIZ.LJ(str2, str3, jSONObject.optJSONObject(str2));
                return;
            }
            this.LIZIZ.LJ("portrait", str3, jSONObject.optJSONObject("portrait"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("vod");
            if (jSONObjectOptJSONObject == null) {
                return;
            }
            this.LIZIZ.LJ("vod", str3, jSONObjectOptJSONObject);
        }
    }
}
