package X;

import Y.ARunnableS0S2100100_13;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V8N, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V8N implements C0V8P {
    public boolean LIZ;
    public boolean LIZIZ;
    public Map<String, C0V83> LIZJ;
    public Map<String, C0V83> LIZLLL;
    public Map<String, C0V83> LJ;
    public Map<String, C0V83> LJFF;
    public Map<String, C0V83> LJI;
    public Map<String, C0V83> LJII;
    public C823150WQv<C0V88> LJIIIIZZ;
    public volatile long LJIIIZ;
    public Map<String, Map<String, C0V83>> LJIIJ;
    public double LJIIJJI = 102400.0d;
    public double LJIIL = 102400.0d;
    public final C0V8Q LJIILIIL = new InterfaceC792740V7w() { // from class: X.0V8Q
        @Override // X.InterfaceC792740V7w
        public final void LIZ(String str, JSONObject jSONObject) {
            if (!this.LIZ.LIZ) {
                return;
            }
            if (C792400V6o.LJIIIIZZ()) {
                C786410Ut5.J3(jSONObject);
            }
            this.LIZ.LJ(str, jSONObject);
        }
    };

    @Override // X.C0V8P
    public final void LJI(JSONObject jSONObject) {
    }

    @Override // X.C0V8P
    public final void start() {
        this.LIZ = true;
        this.LIZIZ = true;
        C0V5B.LIZ = true;
        C787960Uva.LIZ.LJIIIZ(this.LJIILIIL);
        C792310V6f.LJIIIZ().LLJ = new InterfaceC792330V6h() { // from class: X.0V8R
            @Override // X.InterfaceC792330V6h
            public final void LIZ(String str, JSONObject jSONObject) {
                if (this.LIZ.LIZ && "image_monitor_v2".equals(str)) {
                    this.LIZ.getClass();
                }
            }
        };
    }

    @Override // X.C0V8P
    public final void clear() {
        Map<String, C0V83> map = this.LIZJ;
        if (map != null) {
            ((HashMap) map).clear();
        }
        Map<String, C0V83> map2 = this.LJ;
        if (map2 != null) {
            ((HashMap) map2).clear();
        }
        Map<String, C0V83> map3 = this.LJFF;
        if (map3 != null) {
            ((HashMap) map3).clear();
        }
        Map<String, C0V83> map4 = this.LJI;
        if (map4 != null) {
            ((HashMap) map4).clear();
        }
        Map<String, C0V83> map5 = this.LJII;
        if (map5 != null) {
            ((HashMap) map5).clear();
        }
        C823150WQv<C0V88> c823150WQv = this.LJIIIIZZ;
        if (c823150WQv != null) {
            c823150WQv.LIZ.clear();
        }
        this.LJIIIZ = 0L;
    }

    @Override // X.C0V8P
    public final C823150WQv<C0V88> LIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.C0V8P
    public final Map<String, C0V83> LIZIZ() {
        return this.LJ;
    }

    @Override // X.C0V8P
    public final Map<String, C0V83> LIZJ() {
        return this.LJII;
    }

    @Override // X.C0V8P
    public final Map<String, C0V83> LJIIIIZZ() {
        return this.LIZJ;
    }

    @Override // X.C0V8P
    public final long LJIIJ() {
        return this.LJIIIZ;
    }

    @Override // X.C0V8P
    public final Map<String, C0V83> LJIIL() {
        return this.LJFF;
    }

    @Override // X.C0V8P
    public final Map<String, C0V83> LJIILIIL() {
        return this.LJI;
    }

    @Override // X.C0V8P
    public final Map<String, C0V83> LJIILJJIL() {
        return this.LIZLLL;
    }

    @Override // X.C0V8P
    public final void LIZLLL(double d) {
        this.LJIIL = d;
    }

    @Override // X.C0V8P
    public final void LJII(double d) {
        this.LJIIJJI = d;
    }

    @Override // X.C0V8P
    public final Map<String, C0V83> LJIIIZ(String str) {
        if (this.LJIIJ != null && !TextUtils.isEmpty(str)) {
            return (Map) ((HashMap) this.LJIIJ).get(str);
        }
        return null;
    }

    @Override // X.C0V8P
    public final void LJIIJJI(String str) {
        Map<String, Map<String, C0V83>> map = this.LJIIJ;
        if (map == null) {
            return;
        }
        ((HashMap) map).remove(str);
    }

    @Override // X.C0V8P
    public final void LJJLIIIJ(String str) {
        if (this.LJIIJ == null) {
            this.LJIIJ = new HashMap();
        }
        this.LJIIJ.put(str, new HashMap());
    }

    @Override // X.C0V8P
    public final void LJ(String str, JSONObject jSONObject) {
        long jOptLong;
        if (this.LIZ && !TextUtils.isEmpty(str) && jSONObject != null && jSONObject.length() != 0) {
            try {
                String path = new URL(str).getPath();
                if (TextUtils.isEmpty(path)) {
                    return;
                }
                String strOptString = jSONObject.optString("net_consume_type", "ttnet");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("request_log");
                if (jSONObjectOptJSONObject == null) {
                    String strOptString2 = jSONObject.optString("request_log");
                    if (!TextUtils.isEmpty(strOptString2)) {
                        jSONObjectOptJSONObject = new JSONObject(strOptString2);
                    }
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("response");
                if (jSONObjectOptJSONObject2 != null) {
                    jOptLong = jSONObjectOptJSONObject2.optLong("received_bytes") + jSONObjectOptJSONObject2.optLong("sent_bytes");
                } else {
                    jOptLong = 0;
                }
                this.LJIIIZ += jOptLong;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        str = UriProtector.parse(str).buildUpon().clearQuery().build().toString();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                LJIILL(jOptLong, strOptString, str);
                C0V8A.LIZ.LIZ(jOptLong, path, strOptString);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LJIILL(long j, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean zLIZIZ = C786970Utz.LIZIZ(C792400V6o.LIZ);
        boolean zIsForeground = ActivityLifeObserver.getInstance().isForeground();
        if (this.LIZIZ && j > this.LJIIL) {
            C0V5B.LIZ("APM-TrafficInfo", C786410Ut5.j4("trafficBytes: %d, sourceId: %s, business: %s, isWifi: %b, isFront: %b", new Object[]{Long.valueOf(j), str2, str, Boolean.valueOf(zLIZIZ), Boolean.valueOf(zIsForeground)}));
        }
        if (C792400V6o.LJIIIIZZ()) {
            C786410Ut5.j4("recordTrafficBytes: %d, sourceId: %s, business: %s, isWifi: %b, isFront: %b", new Object[]{Long.valueOf(j), str2, str, Boolean.valueOf(zLIZIZ), Boolean.valueOf(zIsForeground)});
            boolean zStartsWith = str.startsWith("sk__");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("bytes", j);
                jSONObject.put("sourceId", str2);
                jSONObject.put("isSocket", zStartsWith);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (this.LIZJ == null) {
            this.LIZJ = new HashMap();
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = new HashMap();
        }
        if (this.LJ == null) {
            this.LJ = new HashMap();
        }
        if (this.LJFF == null) {
            this.LJFF = new HashMap();
        }
        if (this.LJI == null) {
            this.LJI = new HashMap();
        }
        if (this.LJII == null) {
            this.LJII = new HashMap();
        }
        LJIILLIIL(j, str, this.LIZJ, str2);
        LJIILLIIL(j, str, this.LIZLLL, str2);
        if (zLIZIZ) {
            if (!zIsForeground) {
                LJIILLIIL(j, str, this.LJ, str2);
            } else {
                LJIILLIIL(j, str, this.LJFF, str2);
            }
        } else if (!zIsForeground) {
            LJIILLIIL(j, str, this.LJI, str2);
        } else {
            LJIILLIIL(j, str, this.LJII, str2);
        }
        Map<String, Map<String, C0V83>> map = this.LJIIJ;
        if (map != null) {
            Iterator it2 = ((HashMap) map).entrySet().iterator();
            while (it2.hasNext()) {
                LJIILLIIL(j, str, (Map) ((Map.Entry) it2.next()).getValue(), str2);
            }
        }
        if (j > this.LJIIJJI) {
            if (this.LJIIIIZZ == null) {
                this.LJIIIIZZ = new C823150WQv<>(30);
            }
            Uri uri = UriProtector.parse(str2);
            if (uri.getScheme() != null) {
                str2 = uri.getPath();
            }
            if (C792400V6o.LJIIIIZZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("record topPathTraffic(path:");
                sbLIZ.append(str2);
                sbLIZ.append(", bytes:");
                sbLIZ.append(j);
                sbLIZ.append(", biz:");
                sbLIZ.append(str);
                sbLIZ.append(")");
                C2188811AlT.LIZIZ(sbLIZ);
            }
            this.LJIIIIZZ.LIZ(new C0V88(str2, j, str));
        }
    }

    public static void LJIILLIIL(long j, String str, Map map, String str2) {
        C0V83 c0v83 = (C0V83) map.get(str);
        if (c0v83 == null) {
            c0v83 = new C0V83(str);
            map.put(str, c0v83);
        }
        if (((HashMap) c0v83.LIZIZ).containsKey(str2)) {
            HashMap map2 = (HashMap) c0v83.LIZIZ;
            map2.put(str2, Long.valueOf(((Long) map2.get(str2)).longValue() + j));
        } else {
            ((HashMap) c0v83.LIZIZ).put(str2, Long.valueOf(j));
        }
        c0v83.LIZJ += j;
    }

    @Override // X.C0V8P
    public final void LJFF(long j, String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2) {
        String strJ3;
        String str4;
        String strJ32;
        String strJ33;
        if (!this.LIZ) {
            return;
        }
        C787900UvU.LIZ.LIZJ(new ARunnableS0S2100100_13(this, str2, j, str, 2));
        boolean zLIZIZ = C786970Utz.LIZIZ(C792400V6o.LIZ);
        boolean zIsForeground = ActivityLifeObserver.getInstance().isForeground();
        String strJ34 = "";
        if (this.LIZIZ && j > this.LJIIL) {
            Object[] objArr = new Object[8];
            objArr[0] = Long.valueOf(j);
            objArr[1] = str;
            objArr[2] = str2;
            if (str3 == null) {
                str4 = "";
            } else {
                str4 = str3;
            }
            objArr[3] = str4;
            if (jSONObject == null) {
                strJ32 = "";
            } else {
                strJ32 = C786410Ut5.J3(jSONObject);
            }
            objArr[4] = strJ32;
            if (jSONObject2 == null) {
                strJ33 = "";
            } else {
                strJ33 = C786410Ut5.J3(jSONObject2);
            }
            objArr[5] = strJ33;
            objArr[6] = Boolean.valueOf(zLIZIZ);
            objArr[7] = Boolean.valueOf(zIsForeground);
            C0V5B.LIZ("APM-TrafficInfo", C786410Ut5.j4("trafficBytes: %d, sourceId: %s, business: %s, scene: %s, extraStatus: %s, extraLog: %s, isWifi: %b, isFront: %b", objArr));
        }
        if (C792400V6o.LJIIIIZZ()) {
            Object[] objArr2 = new Object[8];
            objArr2[0] = Long.valueOf(j);
            objArr2[1] = str;
            objArr2[2] = str2;
            if (str3 == null) {
                str3 = "";
            }
            objArr2[3] = str3;
            if (jSONObject == null) {
                strJ3 = "";
            } else {
                strJ3 = C786410Ut5.J3(jSONObject);
            }
            objArr2[4] = strJ3;
            if (jSONObject2 != null) {
                strJ34 = C786410Ut5.J3(jSONObject2);
            }
            objArr2[5] = strJ34;
            objArr2[6] = Boolean.valueOf(zLIZIZ);
            objArr2[7] = Boolean.valueOf(zIsForeground);
            C786410Ut5.j4("trafficBytes: %d, sourceId: %s, business: %s, scene: %s, extraStatus: %s, extraLog: %s, isWifi: %b, isFront: %b", objArr2);
        }
        this.LJIIIZ += j;
    }
}
