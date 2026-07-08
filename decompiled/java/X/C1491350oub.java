package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1491350oub {
    public String LIZ = "";
    public final C1491360ouc LIZIZ = new C1491360ouc();
    public final Map<String, AbstractC1491380oue> LIZJ = new LinkedHashMap();
    public final Map<String, String> LIZLLL = new LinkedHashMap();
    public final Set<String> LJ = new LinkedHashSet();
    public C1491330ouZ LJFF = new C1491330ouZ(null);

    public final JSONObject LIZ(List<C1491350oub> list, JSONObject jSONObject, boolean z) throws JSONException {
        Object next;
        Long lLIZ;
        JSONObject jSONObjectPutOpt;
        Object obj;
        String type;
        JSONObject jSONObject2 = new JSONObject();
        Iterator it2 = ((LinkedHashMap) this.LIZJ).keySet().iterator();
        while (true) {
            Map<String, Object> map = null;
            if (!it2.hasNext()) {
                break;
            }
            String str = (String) it2.next();
            try {
                AbstractC1491380oue abstractC1491380oue = (AbstractC1491380oue) ((LinkedHashMap) this.LIZJ).get(str);
                if (abstractC1491380oue != null) {
                    lLIZ = abstractC1491380oue.LIZ(jSONObject);
                } else {
                    lLIZ = null;
                }
                if (z) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.putOpt("_ret", lLIZ);
                    AbstractC1491380oue abstractC1491380oue2 = (AbstractC1491380oue) ((LinkedHashMap) this.LIZJ).get(str);
                    if (abstractC1491380oue2 == null) {
                        obj = null;
                    } else {
                        obj = abstractC1491380oue2.LIZ;
                    }
                    jSONObject3.putOpt("_eval", obj);
                    AbstractC1491380oue abstractC1491380oue3 = (AbstractC1491380oue) ((LinkedHashMap) this.LIZJ).get(str);
                    if (abstractC1491380oue3 == null) {
                        type = null;
                    } else {
                        type = abstractC1491380oue3.getType();
                    }
                    jSONObject3.putOpt("_type", type);
                    AbstractC1491380oue abstractC1491380oue4 = (AbstractC1491380oue) ((LinkedHashMap) this.LIZJ).get(str);
                    if (abstractC1491380oue4 != null) {
                        map = abstractC1491380oue4.LIZIZ;
                    }
                    jSONObject3.putOpt("_paramValues", map);
                    jSONObjectPutOpt = jSONObject2.putOpt(str, jSONObject3);
                } else {
                    jSONObjectPutOpt = jSONObject2.putOpt(str, lLIZ);
                }
                C189200o6.m2constructorimpl(jSONObjectPutOpt);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        for (Map.Entry entry : ((LinkedHashMap) this.LIZLLL).entrySet()) {
            try {
                C189200o6.m2constructorimpl(jSONObject2.putOpt((String) entry.getValue(), jSONObject.opt((String) entry.getKey())));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
        if (!this.LJ.isEmpty()) {
            for (String str2 : this.LJ) {
                if (!Intrinsics.LJFF(str2, this.LIZ)) {
                    ArrayList arrayList = (ArrayList) list;
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (Intrinsics.LJFF(((C1491350oub) next).LIZ, str2)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C1491350oub c1491350oub = (C1491350oub) next;
                    if (c1491350oub != null) {
                        JSONObject jSONObjectLIZ = c1491350oub.LIZ(arrayList, jSONObject, z);
                        Iterator<String> itKeys = jSONObjectLIZ.keys();
                        while (itKeys.hasNext()) {
                            String next2 = itKeys.next();
                            jSONObject2.putOpt(next2, jSONObjectLIZ.opt(next2));
                        }
                    }
                }
            }
        }
        return jSONObject2;
    }
}
