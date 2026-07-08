package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BEX, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BEX implements InterfaceC2201591BEn {
    public final List<InterfaceC2201661BEu> LIZ;

    @Override // X.InterfaceC2201591BEn
    public final C1BEZ getRequest() {
        throw new UnsupportedOperationException("do not call");
    }

    @Override // X.InterfaceC2201591BEn
    public final C1BEW LIZ(C1BEZ c1bez) {
        final List<InterfaceC2201661BEu> list = this.LIZ;
        return new InterfaceC2201591BEn(list) { // from class: X.1BEY
            public C1BEZ LIZ;
            public int LIZIZ = 0;
            public final List<InterfaceC2201661BEu> LIZJ;

            @Override // X.InterfaceC2201591BEn
            public final C1BEZ getRequest() {
                return this.LIZ;
            }

            {
                this.LIZJ = list;
            }

            @Override // X.InterfaceC2201591BEn
            public final C1BEW LIZ(C1BEZ c1bez2) {
                if (c1bez2 == null) {
                    return C1BEW.LIZ(new IllegalArgumentException("null request"), null);
                }
                List<InterfaceC2201661BEu> list2 = this.LIZJ;
                if (list2 != null && !list2.isEmpty()) {
                    if (this.LIZIZ >= this.LIZJ.size()) {
                        return C1BEW.LIZ(new IllegalArgumentException("interceptors index out of bound"), c1bez2);
                    }
                    InterfaceC2201661BEu interfaceC2201661BEu = (InterfaceC2201661BEu) ListProtector.get(this.LIZJ, this.LIZIZ);
                    if (interfaceC2201661BEu == null) {
                        return C1BEW.LIZ(new IllegalArgumentException("null interceptor"), c1bez2);
                    }
                    this.LIZ = c1bez2;
                    this.LIZIZ++;
                    return interfaceC2201661BEu.LIZ(this);
                }
                return C1BEW.LIZ(new IllegalArgumentException("no interceptor in the chain"), null);
            }
        }.LIZ(c1bez);
    }

    public C1BEX(final C1BEN c1ben, C1BEP c1bep) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AbstractC2201481BEc(c1ben) { // from class: X.1BEM
            @Override // X.AbstractC2201481BEc, X.InterfaceC2201661BEu
            public final C1BEW LIZ(InterfaceC2201591BEn interfaceC2201591BEn) {
                JSONObject jSONObject;
                long j;
                String str;
                Map<String, List<String>> map;
                List<String> list;
                C1BEK c1bek;
                long jUptimeMillis = SystemClock.uptimeMillis();
                C1BEW c1bewLIZ = super.LIZ(interfaceC2201591BEn);
                C1BEB c1bebLIZIZ = C1BEB.LIZIZ();
                long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                c1bebLIZIZ.getClass();
                if (c1bewLIZ != null) {
                    int i = c1bewLIZ.LIZ;
                    try {
                        new JSONObject().put("cost", jUptimeMillis2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    C1BEZ c1bez = c1bewLIZ.LJ;
                    if (c1bez != null && (c1bek = c1bez.LJ) != null) {
                        if (c1bek.LIZLLL) {
                            j = c1bek.LIZJ;
                        } else {
                            j = c1bek.LJ;
                        }
                        jSONObject = c1bek.LJII;
                        str = c1bek.LJI;
                    } else {
                        jSONObject = null;
                        j = -1;
                        str = null;
                    }
                    try {
                        jSONObject2.put("cid", j);
                        jSONObject2.putOpt("ad_extra_data", jSONObject);
                        jSONObject2.putOpt("log_extra", str);
                        C1474450oTL.LIZ(c1bewLIZ.LJFF, jSONObject2);
                        if (c1bez != null) {
                            jSONObject2.put("method", c1bez.LIZJ);
                        }
                        int i2 = c1bewLIZ.LIZ;
                        if (i2 < 200 || i2 >= 300) {
                            if (c1bez != null) {
                                jSONObject2.put("url", c1bez.LIZIZ);
                            }
                            if (i == 302 && (map = c1bewLIZ.LIZJ) != null && map.containsKey("Location") && (list = map.get("Location")) != null && !list.isEmpty()) {
                                jSONObject2.putOpt("url_302", list.get(0));
                            }
                        }
                        if (c1bez != null) {
                            jSONObject2.put("host", UriProtector.parse(c1bez.LIZIZ).getHost());
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                    C1BEE.LIZ();
                }
                return c1bewLIZ;
            }

            @Override // X.AbstractC2201481BEc
            public final C1BEZ LIZIZ(C1BEZ c1bez) {
                String strLIZ;
                C1BEK c1bek = c1bez.LJ;
                String strReplace = c1bez.LIZIZ;
                try {
                    Map<String, String> mapLIZ = C1BEO.LIZ(strReplace, c1bek.LIZLLL);
                    if (mapLIZ != null) {
                        String strValueOf = String.valueOf(c1bek.LJIIIIZZ);
                        if (mapLIZ.containsKey("__TS__")) {
                            mapLIZ.put("__TS__", strValueOf);
                        }
                        if (mapLIZ.containsKey("{TS}")) {
                            mapLIZ.put("{TS}", strValueOf);
                        }
                    }
                    for (String str : mapLIZ.keySet()) {
                        String str2 = mapLIZ.get(str);
                        if (!TextUtils.isEmpty(str2)) {
                            strReplace = strReplace.replace(str, str2);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    th.getMessage();
                }
                AbstractC2201671BEv abstractC2201671BEv = C1BE8.LIZIZ().LJII;
                C2201471BEb c2201471BEb = c1bez.LIZ;
                if (abstractC2201671BEv != null) {
                    strLIZ = abstractC2201671BEv.LIZ();
                } else {
                    strLIZ = "";
                }
                String strLIZ2 = C08F0.LIZ(strLIZ);
                if (!TextUtils.isEmpty(strLIZ2)) {
                    StringBuilder sb = new StringBuilder();
                    for (char c : strLIZ2.toCharArray()) {
                        if (c >= ' ' && c != 127) {
                            sb.append(c);
                        }
                    }
                    strLIZ2 = sb.toString();
                }
                c2201471BEb.getClass();
                if (!TextUtils.isEmpty("User-Agent") && !TextUtils.isEmpty(strLIZ2)) {
                    if (c2201471BEb.LIZJ == null) {
                        c2201471BEb.LIZJ = new HashMap();
                    }
                    List listSingletonList = Collections.singletonList(strLIZ2);
                    if (!TextUtils.isEmpty("User-Agent") && listSingletonList != null && !listSingletonList.isEmpty()) {
                        if (c2201471BEb.LIZJ == null) {
                            c2201471BEb.LIZJ = new HashMap();
                        }
                        ((HashMap) c2201471BEb.LIZJ).put("User-Agent", listSingletonList);
                    }
                }
                c2201471BEb.LIZ = strReplace;
                return new C1BEZ(c2201471BEb);
            }

            @Override // X.AbstractC2201481BEc
            public final C1BEW LIZJ(C1BEW c1bew) {
                C1BEZ c1bez;
                if (c1bew != null && (c1bez = c1bew.LJ) != null) {
                    C1BEK c1bek = c1bez.LJ;
                    int i = c1bew.LIZ;
                    String str = c1bez.LIZIZ;
                    long j = c1bew.LIZLLL;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.putOpt("http_msg", c1bew.LIZIZ);
                        Throwable th = c1bew.LJFF;
                        if (th != null) {
                            jSONObject.putOpt("http_err_class", th.getClass().getCanonicalName());
                        }
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("track_url_list", str).put("track_status", i).put("local_time_ms", j).put("is_retry", c1bek.LJIIIZ).putOpt("ad_extra_data", jSONObject);
                    } catch (JSONException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    C1BEJ.LIZ("track_url", c1bek, jSONObject2);
                }
                return c1bew;
            }
        });
        arrayList.add(new AbstractC2201481BEc(c1ben) { // from class: X.1BES
            @Override // X.AbstractC2201481BEc
            public final C1BEZ LIZIZ(C1BEZ c1bez) {
                String strReplace = c1bez.LIZIZ;
                Map<String, String> map = c1bez.LJ.LJIIJJI;
                if (map == null) {
                    return c1bez;
                }
                try {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (strReplace.contains(entry.getKey())) {
                            String value = entry.getValue();
                            if (!TextUtils.isEmpty(value)) {
                                try {
                                    value = URLEncoder.encode(value, "UTF-8");
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                            if (!TextUtils.isEmpty(value)) {
                                strReplace = strReplace.replace(entry.getKey(), value);
                            }
                        }
                    }
                    C2201471BEb c2201471BEb = c1bez.LIZ;
                    c2201471BEb.LIZ = strReplace;
                    return new C1BEZ(c2201471BEb);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    return c1bez;
                }
            }
        });
        this.LIZ = arrayList;
        arrayList.add(c1bep);
    }
}
