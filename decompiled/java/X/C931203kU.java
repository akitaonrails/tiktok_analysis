package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03kU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C931203kU implements InterfaceC845903Sf {
    public final JSONArray LIZ;
    public final JSONObject LIZIZ;
    public final JSONArray LIZJ;
    public final JSONArray LIZLLL;
    public final JSONArray LJFF;
    public final InterfaceC932403kg LJIIIZ;
    public final List<C931503kX> LJ = new ArrayList();
    public final List<C931103kT> LJII = new ArrayList();
    public final Map<String, C931103kT> LJIIIIZZ = new HashMap();
    public final Map<String, C931403kW> LJIIJ = new HashMap();
    public final Map<String, C931403kW> LJIIJJI = new HashMap();
    public final Map<String, C931503kX> LJIIL = new HashMap();
    public final Map<String, C931503kX> LJIILIIL = new HashMap();
    public final Map<String, List<C931503kX>> LJIILJJIL = new HashMap();
    public final Map<String, String> LJIILL = new HashMap();
    public final List<C930403kM> LJI = new ArrayList();

    public final String LIZ(String str) {
        Map<String, String> mapLIZIZ;
        InterfaceC932403kg interfaceC932403kg = this.LJIIIZ;
        C1724150uy5 c1724150uy5 = C1724150uy5.LJIIL;
        String str2 = c1724150uy5.LIZ.LJIIL;
        C931303kV c931303kV = (C931303kV) interfaceC932403kg;
        c931303kV.getClass();
        try {
            if (TextUtils.equals(str2, c931303kV.LIZJ)) {
                if (!c931303kV.LIZIZ.containsKey(str)) {
                    c931303kV.LIZ("fail", str, "2", "1");
                    return "";
                }
                if (c931303kV.LIZIZ.get(str) != null && !c931303kV.LIZIZ.get(str).isEmpty()) {
                    c931303kV.LIZ("success", str, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT);
                    return c931303kV.LIZIZ.get(str);
                }
                c931303kV.LIZ("fail", str, "2", "2");
                return "";
            }
            try {
                mapLIZIZ = C116700cP.LIZIZ(new JSONObject(C08EO.LIZ(c1724150uy5.LIZ.LIZ)));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                mapLIZIZ = null;
            }
            c931303kV.LIZIZ(str2, null, null);
            if (mapLIZIZ != null) {
                HashMap map = (HashMap) mapLIZIZ;
                if (!map.containsKey(str)) {
                    c931303kV.LIZ("fail", str, "1", "1");
                    return "";
                }
                if (map.get(str) != null && !((String) map.get(str)).isEmpty()) {
                    c931303kV.LIZ("success", str, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT);
                    return (String) map.get(str);
                }
                c931303kV.LIZ("fail", str, "1", "2");
                return "";
            }
            return "";
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return "";
        }
    }

    public C931203kU(JSONArray jSONArray, JSONObject jSONObject, JSONArray jSONArray2, JSONArray jSONArray3, JSONArray jSONArray4, InterfaceC932403kg interfaceC932403kg) {
        this.LIZ = jSONArray;
        this.LIZIZ = jSONObject;
        this.LIZJ = jSONArray2;
        this.LIZLLL = jSONArray3;
        this.LJIIIZ = interfaceC932403kg;
        this.LJFF = jSONArray4;
        if (jSONArray != null) {
            for (int i = 0; i < this.LIZ.length(); i++) {
                try {
                    C931503kX c931503kX = new C931503kX((JSONObject) this.LIZ.get(i));
                    this.LJ.add(c931503kX);
                    this.LJIIL.put(c931503kX.LJI, c931503kX);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        JSONObject jSONObject2 = this.LIZIZ;
        if (jSONObject2 != null) {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                try {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = this.LIZIZ.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                        List<C931503kX> arrayList = this.LJIILJJIL.get(next);
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                            this.LJIILJJIL.put(next, arrayList);
                        }
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                            if (jSONObjectOptJSONObject != null) {
                                C931503kX c931503kX2 = new C931503kX(jSONObjectOptJSONObject);
                                arrayList.add(c931503kX2);
                                this.LJIILIIL.put(c931503kX2.LJI, c931503kX2);
                                String str = c931503kX2.LJI;
                                if (str != null && !str.isEmpty()) {
                                    this.LJIILL.put(c931503kX2.LJI, next);
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        }
        if (this.LIZJ != null) {
            for (int i3 = 0; i3 < this.LIZJ.length(); i3++) {
                try {
                    C931103kT c931103kT = new C931103kT((JSONObject) this.LIZJ.get(i3));
                    this.LJII.add(c931103kT);
                    this.LJIIIIZZ.put(c931103kT.LIZ, c931103kT);
                    for (C931103kT c931103kT2 : (ArrayList) c931103kT.LJIILJJIL) {
                        this.LJII.add(c931103kT2);
                        this.LJIIIIZZ.put(c931103kT2.LIZ, c931103kT2);
                    }
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
            }
        }
        if (this.LIZLLL != null) {
            for (int i4 = 0; i4 < this.LIZLLL.length(); i4++) {
                try {
                    C931403kW c931403kW = new C931403kW((JSONObject) this.LIZLLL.get(i4));
                    this.LJIIJ.put(c931403kW.LIZIZ, c931403kW);
                    this.LJIIJJI.put(c931403kW.LIZ, c931403kW);
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                }
            }
        }
        if (this.LJFF != null) {
            for (int i5 = 0; i5 < this.LJFF.length(); i5++) {
                try {
                    this.LJI.add(new C930403kM((JSONObject) this.LJFF.get(i5)));
                } catch (Throwable th5) {
                    TryCatchGuardChecker.doCheck(th5);
                }
            }
        }
    }
}
