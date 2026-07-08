package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.PiperData;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wIJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1775130wIJ implements InterfaceC21176417ty {
    public final String LIZ;
    public final InterfaceC634840OvC LIZIZ;
    public final InterfaceC606370NqN LIZJ;
    public final InterfaceC1775150wIL LIZLLL;
    public final long LJ;

    @Override // X.InterfaceC21176417ty
    public final boolean LIZ() {
        return this.LIZLLL != null;
    }

    @Override // X.InterfaceC21176417ty
    public final boolean LJ() {
        return this.LIZIZ != null;
    }

    @Override // X.InterfaceC21176417ty
    public final String getName() {
        return this.LIZ;
    }

    public static boolean LJFF(Object obj) {
        if (!(obj instanceof PiperData)) {
            if (obj instanceof Map) {
                Collection collectionValues = ((Map) obj).values();
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    Iterator it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        if (LJFF(it2.next())) {
                            return true;
                        }
                    }
                }
            } else if (obj instanceof List) {
                Iterable iterable = (Iterable) obj;
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    return false;
                }
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    if (LJFF(it3.next())) {
                        return true;
                    }
                }
            } else if (obj instanceof Object[]) {
                for (Object obj2 : (Object[]) obj) {
                    if (LJFF(obj2)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC21176417ty
    public final boolean LIZJ(InterfaceC634840OvC interfaceC634840OvC) {
        return Intrinsics.LJFF(this.LIZIZ, interfaceC634840OvC);
    }

    public final Object LJI(Object obj) {
        boolean z;
        if (obj == null) {
            return null;
        }
        try {
            boolean zLJFF = false;
            if (C1773900wGK.LIZ() && C1773900wGK.LIZLLL().getEnableShopMallHomepageApiPiperData()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                zLJFF = LJFF(obj);
            }
            if (zLJFF) {
                return LJII(obj);
            }
            if (obj instanceof List) {
                return new JSONArray((Collection) obj);
            }
            if (obj instanceof Object[]) {
                return new JSONArray(obj);
            }
            if (obj instanceof Map) {
                return new JSONObject((Map) obj);
            }
            return obj;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("wrapDataAsJSON, exception=");
            sbLIZ.append(e.getMessage());
            sbLIZ.append(", data=");
            sbLIZ.append(obj);
            C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZIZ();
            return null;
        }
    }

    public final Object LJII(Object obj) throws JSONException {
        String string;
        if (obj instanceof List) {
            return LJIIIIZZ((List) obj);
        }
        if (obj instanceof Object[]) {
            return LJIIIIZZ(C13LQ.LJJLL((Object[]) obj));
        }
        if (!(obj instanceof Map)) {
            return obj;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && (string = key.toString()) != null) {
                Object objLJI = LJI(value);
                if (objLJI == null) {
                    objLJI = JSONObject.NULL;
                }
                jSONObject.put(string, objLJI);
            }
        }
        return jSONObject;
    }

    public final JSONArray LJIIIIZZ(List<?> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it2 = list.iterator();
        while (it2.hasNext()) {
            Object objLJI = LJI(it2.next());
            if (objLJI == null) {
                objLJI = JSONObject.NULL;
            }
            jSONArray.put(objLJI);
        }
        return jSONArray;
    }

    public C1775130wIJ(InterfaceC634840OvC interfaceC634840OvC, String str) {
        this.LIZ = str;
        this.LIZJ = null;
        this.LIZIZ = interfaceC634840OvC;
        this.LIZLLL = null;
        this.LJ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC21176417ty
    public final void LIZLLL(C1775140wIK c1775140wIK, Map<String, ? extends Object> map) throws JSONException {
        if (this.LIZIZ != null) {
            JSONObject jSONObject = new JSONObject();
            Object obj = map.get("dynamic_params_monitor_bean");
            if (obj instanceof C1775160wIM) {
                if (obj != null) {
                    System.currentTimeMillis();
                }
            } else {
                obj = null;
            }
            if (!c1775140wIK.LIZJ.isEmpty()) {
                for (Map.Entry<String, Object> entry : c1775140wIK.LIZJ.entrySet()) {
                    jSONObject.put(entry.getKey(), LJI(entry.getValue()));
                }
            }
            jSONObject.put("data", LJI(c1775140wIK.LIZIZ));
            if (obj != null) {
                System.currentTimeMillis();
            }
            this.LIZIZ.sendEvent(c1775140wIK.LIZ, jSONObject);
            return;
        }
        InterfaceC606370NqN interfaceC606370NqN = this.LIZJ;
        if (interfaceC606370NqN != null) {
            interfaceC606370NqN.LIZ(c1775140wIK.LIZIZ, map);
        }
    }

    public C1775130wIJ(String str, InterfaceC606370NqN interfaceC606370NqN) {
        this.LIZ = str;
        this.LIZJ = interfaceC606370NqN;
        this.LIZIZ = null;
        this.LIZLLL = null;
        this.LJ = System.currentTimeMillis();
    }

    public C1775130wIJ(String str, InterfaceC1775150wIL interfaceC1775150wIL) {
        this.LIZ = str;
        this.LIZJ = null;
        this.LIZIZ = null;
        this.LIZLLL = interfaceC1775150wIL;
        this.LJ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC21176417ty
    public final void LIZIZ(C1775140wIK c1775140wIK, Map map, C21175917tt c21175917tt) {
        InterfaceC1775150wIL interfaceC1775150wIL = this.LIZLLL;
        if (interfaceC1775150wIL == null) {
            c21175917tt.LIZ(0, "subscriber native method callback not implemented", null);
        } else {
            interfaceC1775150wIL.LIZ(c1775140wIK.LIZIZ, map, c21175917tt);
        }
    }
}
