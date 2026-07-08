package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z5I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882380z5I {
    public static final Map<String, Object> LIZ(C1882420z5M c1882420z5M) {
        if (c1882420z5M == null) {
            return C2097608Jq.LJ();
        }
        InterfaceC1881340z3c interfaceC1881340z3c = c1882420z5M.LIZ;
        String str = c1882420z5M.LIZIZ;
        Object obj = null;
        if (interfaceC1881340z3c != null) {
            Object objLIZ = interfaceC1881340z3c.LJJIIZI().LIZ(str);
            if (objLIZ instanceof ConcurrentHashMap) {
                obj = objLIZ;
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj;
            if (concurrentHashMap != null) {
                return concurrentHashMap;
            }
        }
        return C2097608Jq.LJ();
    }

    public static final C1882410z5L LIZIZ(InterfaceC1883030z6L interfaceC1883030z6L) {
        String strLIZIZ;
        if (interfaceC1883030z6L == null) {
            return null;
        }
        InterfaceC1881340z3c interfaceC1881340z3cLIZJ = interfaceC1883030z6L.LIZJ();
        String strLJLI = interfaceC1883030z6L.LJLI();
        if (strLJLI != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJLI);
            sbLIZ.append("_card_tracking_params");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = null;
        }
        if (interfaceC1881340z3cLIZJ == null || strLIZIZ == null || strLIZIZ.length() == 0) {
            return null;
        }
        return new C1882410z5L(interfaceC1881340z3cLIZJ, strLIZIZ);
    }

    public static final C1882420z5M LIZJ(InterfaceC1881340z3c interfaceC1881340z3c) {
        if (interfaceC1881340z3c == null) {
            return null;
        }
        return new C1882420z5M(interfaceC1881340z3c, "__mix_base_common_data");
    }

    public static final C1882420z5M LIZLLL(InterfaceC1881340z3c interfaceC1881340z3c) {
        if (interfaceC1881340z3c == null) {
            return null;
        }
        return new C1882420z5M(interfaceC1881340z3c, "__mix_base_common_tracking_params");
    }

    public static final C1882410z5L LJIIIIZZ(InterfaceC1881340z3c interfaceC1881340z3c) {
        if (interfaceC1881340z3c == null) {
            return null;
        }
        return new C1882410z5L(interfaceC1881340z3c, "__mix_base_share_data");
    }

    public static final JSONObject LJ(InterfaceC1881340z3c interfaceC1881340z3c, List<String> list) {
        if (interfaceC1881340z3c != null) {
            Object objLIZ = interfaceC1881340z3c.LJJIIZI().LIZ("__mix_base_raw_data");
            if (!(objLIZ instanceof JSONObject)) {
                objLIZ = null;
            }
            JSONObject jSONObject = (JSONObject) objLIZ;
            if (jSONObject != null) {
                if (list.isEmpty()) {
                    return jSONObject;
                }
                return C115600cE.LIZ(list, jSONObject);
            }
        }
        return new JSONObject();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJFF(X.C1882420z5M r3, java.lang.String r4) {
        /*
            int r0 = r4.length()
            if (r0 != 0) goto L56
            r0 = 1
        L7:
            r2 = 0
            if (r0 == 0) goto L2a
            if (r3 == 0) goto L53
            X.0z3c r0 = r3.LIZ
            java.lang.String r1 = r3.LIZIZ
            if (r0 == 0) goto L25
            X.0z5U r0 = r0.LJJIIZI()
            java.lang.Object r1 = r0.LIZ(r1)
            boolean r0 = r1 instanceof java.util.concurrent.ConcurrentHashMap
            if (r0 == 0) goto L25
            if (r1 == 0) goto L25
        L20:
            java.lang.String r0 = X.C476770Imp.LJ(r1)
        L24:
            return r0
        L25:
            java.util.Map r1 = X.C2097608Jq.LJ()
            goto L20
        L2a:
            if (r3 == 0) goto L53
            X.0z3c r0 = r3.LIZ
            java.lang.String r1 = r3.LIZIZ
            if (r0 == 0) goto L47
            X.0z5U r0 = r0.LJJIIZI()
            java.lang.Object r1 = r0.LIZ(r1)
            boolean r0 = r1 instanceof java.util.concurrent.ConcurrentHashMap
            if (r0 != 0) goto L3f
            r1 = r2
        L3f:
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            if (r1 == 0) goto L47
            java.lang.Object r2 = r1.get(r4)
        L47:
            boolean r0 = r2 instanceof java.lang.Object
            if (r0 == 0) goto L53
            if (r2 == 0) goto L53
            java.lang.String r0 = r2.toString()
            if (r0 != 0) goto L24
        L53:
            java.lang.String r0 = ""
            return r0
        L56:
            r0 = 0
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1882380z5I.LJFF(X.0z5M, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJII(X.C1882410z5L r5, java.util.Map<java.lang.String, ? extends java.lang.Object> r6) {
        /*
            if (r5 != 0) goto L3
            return
        L3:
            X.0z3c r0 = r5.LIZ
            java.lang.String r1 = r5.LIZIZ
            r4 = 0
            if (r0 == 0) goto L1b
            X.0z5U r0 = r0.LJJIIZI()
            java.lang.Object r3 = r0.LIZ(r1)
            boolean r0 = r3 instanceof java.util.concurrent.ConcurrentHashMap
            if (r0 != 0) goto L17
            r3 = r4
        L17:
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            if (r3 != 0) goto L38
        L1b:
            X.0z3c r0 = r5.LIZ
            java.lang.String r2 = r5.LIZIZ
            X.0z3T r1 = new X.0z3T
            r1.<init>()
            if (r0 == 0) goto L5e
            X.0z5U r0 = r0.LJJIIZI()
            java.lang.Object r1 = r0.LIZIZ(r2, r1)
            boolean r0 = r1 instanceof java.util.concurrent.ConcurrentHashMap
            if (r0 == 0) goto L33
            r4 = r1
        L33:
            r3 = r4
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            if (r3 == 0) goto L5e
        L38:
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L40:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L5a
            r3.remove(r1)
            goto L40
        L5a:
            r3.put(r1, r0)
            goto L40
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1882380z5I.LJII(X.0z5L, java.util.Map):void");
    }

    public static final void LJI(C1882410z5L c1882410z5L, String str, Object obj) {
        if (c1882410z5L == null) {
            return;
        }
        LJII(c1882410z5L, C2097908Jt.LIZJ(new Pair(str, obj)));
    }

    public static final void LJIIIZ(InterfaceC1881340z3c interfaceC1881340z3c, String str, Object obj) throws JSONException {
        List listLIZIZ;
        if (interfaceC1881340z3c != null) {
            Object objLIZ = interfaceC1881340z3c.LJJIIZI().LIZ("__mix_base_raw_data");
            Object objOpt = null;
            if (!(objLIZ instanceof JSONObject)) {
                objLIZ = null;
            }
            Object objOpt2 = (JSONObject) objLIZ;
            if (objOpt2 != null && (listLIZIZ = C115600cE.LIZIZ(str)) != null && !listLIZIZ.isEmpty()) {
                Iterator it2 = C13LP.LJJJJJ(1, listLIZIZ).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        if (objOpt2 instanceof JSONObject) {
                            objOpt2 = ((JSONObject) objOpt2).opt(str2);
                        } else if (objOpt2 instanceof JSONArray) {
                            Integer numLJIIJJI = C2095008Iq.LJIIJJI(str2);
                            if (numLJIIJJI != null) {
                                objOpt = ((JSONArray) objOpt2).opt(numLJIIJJI.intValue());
                            }
                        } else {
                            objOpt2 = null;
                        }
                    } else {
                        objOpt = objOpt2;
                        break;
                    }
                }
                String str3 = (String) C13LP.LJJLIIIJJI(listLIZIZ);
                if (objOpt instanceof JSONObject) {
                    ((JSONObject) objOpt).put(str3, obj);
                    return;
                }
                if (objOpt instanceof JSONArray) {
                    Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(str3);
                    if (numLJIIJJI2 != null) {
                        JSONArray jSONArray = (JSONArray) objOpt;
                        if (C13LZ.LJIILJJIL(0, jSONArray.length()).LJLJL(numLJIIJJI2.intValue())) {
                            jSONArray.put(numLJIIJJI2.intValue(), obj);
                            return;
                        }
                    }
                    Map<String, Object> map = C1338270kvh.LIZ;
                    return;
                }
                Map<String, Object> map2 = C1338270kvh.LIZ;
            }
        }
    }
}
