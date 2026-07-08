package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.myna.render.render.MynaTemplateProtocol;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AwS389S0200000_23;
import kotlin.jvm.internal.AwS73S1000000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0qJE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1545060qJE implements InterfaceC21326118d1 {
    public static final ConcurrentHashMap<String, InterfaceC1170200gYc> LJIIJJI = new ConcurrentHashMap<>();
    public final View LIZIZ;
    public final Context LIZJ;
    public final C21326518d5 LIZLLL;
    public final ConcurrentHashMap<String, InterfaceC1545100qJI> LJ = new ConcurrentHashMap<>();
    public final String LJFF;
    public final C1543410qGZ LJI;
    public final AtomicBoolean LJII;
    public C1543900qHM LJIIIIZZ;
    public final C1545070qJF LJIIIZ;
    public C1059860dge LJIIJ;

    @Override // X.InterfaceC21326118d1
    public final void release() {
        if (this.LJII.compareAndSet(false, true)) {
            try {
                this.LJI.LJII();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            this.LJIIIIZZ = null;
            this.LJ.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r6v1, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r6v2, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r6v4, types: [org.json.JSONArray] */
    public static Object LIZ(Object obj) throws JSONException {
        Object jSONObject;
        if (obj != null && !(obj instanceof String) && !(obj instanceof Number) && !(obj instanceof Boolean)) {
            if (obj instanceof Iterable) {
                jSONObject = new JSONArray();
                Iterator it2 = ((Iterable) obj).iterator();
                while (it2.hasNext()) {
                    jSONObject.put(LIZ(it2.next()));
                }
            } else {
                if (obj instanceof Object[]) {
                    jSONObject = new JSONArray();
                    for (Object obj2 : (Object[]) obj) {
                        jSONObject.put(LIZ(obj2));
                    }
                } else if (obj instanceof Map) {
                    jSONObject = new JSONObject();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        jSONObject.put(String.valueOf(entry.getKey()), LIZ(entry.getValue()));
                    }
                } else if (!(obj instanceof JSONObject) && !(obj instanceof JSONArray)) {
                    jSONObject = new JSONObject();
                    for (Class<?> superclass = obj.getClass(); superclass != null && !Intrinsics.LJFF(superclass, Object.class); superclass = superclass.getSuperclass()) {
                        C089E c089e = new C089E(superclass.getDeclaredFields());
                        while (c089e.hasNext()) {
                            Field field = (Field) c089e.next();
                            if (!Modifier.isStatic(field.getModifiers()) && !u.LJJIIJZLJL(field.getName(), e3.c, false)) {
                                field.setAccessible(true);
                                try {
                                    jSONObject.put(field.getName(), LIZ(field.get(obj)));
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        }
                    }
                }
            }
            return jSONObject;
        }
        return obj;
    }

    public final Map<String, Object> LIZIZ(Map<String, ? extends Object> map) {
        ConcurrentHashMap<String, Object> concurrentHashMap;
        AbstractC21333318eB<?> abstractC21333318eB = this.LIZLLL.LIZ.LJIIIZ;
        if (abstractC21333318eB != null) {
            Map<String, Object> mapLIZJ = abstractC21333318eB.LIZJ();
            C21325918cz c21325918cz = this.LIZLLL.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(mapLIZJ);
            C1162800gMg c1162800gMgLJIILIIL = this.LIZLLL.LIZ.LJIILIIL();
            ConcurrentHashMap<String, Object> concurrentHashMap2 = null;
            if (c1162800gMgLJIILIIL != null) {
                concurrentHashMap = c1162800gMgLJIILIIL.LIZIZ;
            } else {
                concurrentHashMap = null;
            }
            linkedHashMap.put("__action_result", concurrentHashMap);
            C1162800gMg c1162800gMgLJIILIIL2 = this.LIZLLL.LIZ.LJIILIIL();
            if (c1162800gMgLJIILIIL2 != null) {
                concurrentHashMap2 = c1162800gMgLJIILIIL2.LIZ;
            }
            linkedHashMap.put("__variables", concurrentHashMap2);
            Map<String, Object> mapLJI = c21325918cz.LJI(map, linkedHashMap);
            if (mapLJI == null) {
                mapLJI = map;
                if (map == null) {
                }
            }
            return mapLJI;
        }
        return map;
    }

    public final Object LIZLLL(String str) {
        ConcurrentHashMap<String, Object> concurrentHashMap;
        AbstractC21333318eB<?> abstractC21333318eB = this.LIZLLL.LIZ.LJIIIZ;
        ConcurrentHashMap<String, Object> concurrentHashMap2 = null;
        if (abstractC21333318eB == null) {
            return null;
        }
        Map<String, Object> mapLIZJ = abstractC21333318eB.LIZJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(mapLIZJ);
        C1162800gMg c1162800gMgLJIILIIL = this.LIZLLL.LIZ.LJIILIIL();
        if (c1162800gMgLJIILIIL != null) {
            concurrentHashMap = c1162800gMgLJIILIIL.LIZIZ;
        } else {
            concurrentHashMap = null;
        }
        linkedHashMap.put("__action_result", concurrentHashMap);
        C1162800gMg c1162800gMgLJIILIIL2 = this.LIZLLL.LIZ.LJIILIIL();
        if (c1162800gMgLJIILIIL2 != null) {
            concurrentHashMap2 = c1162800gMgLJIILIIL2.LIZ;
        }
        linkedHashMap.put("__variables", concurrentHashMap2);
        C21325918cz c21325918cz = this.LIZLLL.LIZ;
        return c21325918cz.LIZ.LIZJ.LIZ(str, linkedHashMap, c21325918cz, c21325918cz.LJJIII);
    }

    public final C1547320qMs LJIIIZ(InterfaceC1547330qMt interfaceC1547330qMt) {
        LinkedHashMap linkedHashMap;
        String str;
        Map<String, ? extends Object> map;
        String str2;
        String string;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        if (!(interfaceC1547330qMt instanceof C1547320qMs)) {
            return null;
        }
        C1547320qMs c1547320qMs = (C1547320qMs) interfaceC1547330qMt;
        Object obj = c1547320qMs.getData().get(":params");
        if (obj != null) {
            c1547320qMs.getData().remove(":params");
            Map<String, Object> params = c1547320qMs.getParams();
            if (obj instanceof String) {
                Object objLIZLLL = LIZLLL((String) obj);
                if (objLIZLLL instanceof Map) {
                    Map map2 = (Map) objLIZLLL;
                    if (map2 != null) {
                        linkedHashMap3 = new LinkedHashMap(map2);
                    } else {
                        linkedHashMap3 = new LinkedHashMap();
                    }
                    if (params != null) {
                        linkedHashMap3.putAll(params);
                    }
                    c1547320qMs.getData().put("params", linkedHashMap3);
                } else if (params == null) {
                    c1547320qMs.getData().put("params", objLIZLLL);
                }
            } else if (obj instanceof Map) {
                Map<String, Object> mapLIZIZ = LIZIZ((Map) obj);
                if (mapLIZIZ != null) {
                    linkedHashMap2 = new LinkedHashMap(mapLIZIZ);
                } else {
                    linkedHashMap2 = new LinkedHashMap();
                }
                if (params != null) {
                    linkedHashMap2.putAll(params);
                }
                c1547320qMs.getData().put("params", linkedHashMap2);
            }
        }
        Map<String, Object> params2 = c1547320qMs.getParams();
        if (params2 != null) {
            linkedHashMap = new LinkedHashMap(params2);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        C1168400gVi.LIZ(new AwS389S0200000_23(interfaceC1547330qMt, this, 12));
        c1547320qMs.getData().put("params", LIZIZ(linkedHashMap));
        Object obj2 = c1547320qMs.getData().get(":next");
        if ((obj2 instanceof String) && (str2 = (String) obj2) != null) {
            Map<String, Object> data = c1547320qMs.getData();
            Object objLIZLLL2 = LIZLLL(str2);
            if (objLIZLLL2 != null) {
                string = objLIZLLL2.toString();
            } else {
                string = null;
            }
            data.put("next", string);
            c1547320qMs.getData().remove(":next");
        }
        Object obj3 = c1547320qMs.getData().get(":callback");
        if (obj3 instanceof String) {
            str = (String) obj3;
        } else {
            str = null;
        }
        if (str != null) {
            c1547320qMs.getData().put("callback", LIZLLL(str));
            c1547320qMs.getData().remove(":callback");
        }
        Object obj4 = c1547320qMs.getData().get("callback");
        if ((obj4 instanceof Map) && (map = (Map) obj4) != null) {
            c1547320qMs.getData().put("callback", LIZIZ(map));
        }
        return c1547320qMs;
    }

    public final void LJII(String str, InterfaceC1545100qJI interfaceC1545100qJI) {
        this.LJ.put(str, interfaceC1545100qJI);
        C1168400gVi.LIZ(new AwS73S1000000_23(str, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x018d A[LOOP:1: B:24:0x018d->B:54:?, LOOP_START, PHI: r1
      0x018d: PHI (r1v20 android.content.Context) = (r1v19 android.content.Context), (r1v23 android.content.Context) binds: [B:23:0x018b, B:54:?] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1545060qJE(android.view.View r8, android.content.Context r9, X.C21326518d5 r10) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1545060qJE.<init>(android.view.View, android.content.Context, X.18d5):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x021b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c A[PHI: r0
      0x008c: PHI (r0v65 java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>) = 
      (r0v13 java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>)
      (r0v74 java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>)
     binds: [B:85:0x01c1, B:31:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r11v17, types: [X.0qIB, X.0qJX] */
    @Override // X.InterfaceC21326118d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(final X.C21326518d5 r23, final X.InterfaceC1547330qMt r24, final android.view.View r25) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1545060qJE.LIZJ(X.18d5, X.0qMt, android.view.View):void");
    }

    public final void LJFF(C21326518d5 c21326518d5, C1547320qMs c1547320qMs, View view) {
        String str;
        if (c1547320qMs.getParams() == null) {
            return;
        }
        Object obj = c1547320qMs.getData().get("next");
        if ((obj instanceof String) && (str = (String) obj) != null && str.length() != 0) {
            LJI(c21326518d5, c1547320qMs, view, str);
        }
    }

    public final void LJI(C21326518d5 c21326518d5, C1547320qMs c1547320qMs, View view, String str) {
        MynaTemplateProtocol mynaTemplateProtocol;
        Map<String, Object> actionChains;
        Map map;
        String type;
        if (str != null && str.length() != 0) {
            Map<String, Object> map2 = null;
            if (c21326518d5 != null && (mynaTemplateProtocol = c21326518d5.LIZ.LJII) != null && (actionChains = mynaTemplateProtocol.getActionChains()) != null) {
                Iterator<T> it2 = actionChains.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if ((value instanceof Map) && (map = (Map) value) != null) {
                        InterfaceC1547330qMt interfaceC1547330qMtRoot = c1547320qMs.root();
                        if (interfaceC1547330qMtRoot != null) {
                            type = interfaceC1547330qMtRoot.getType();
                        } else {
                            type = null;
                        }
                        if (Intrinsics.LJFF(key, type) && map.containsKey(str)) {
                            Object obj = map.get(str);
                            if ((obj instanceof Map) && obj != null) {
                                if (!(obj instanceof Map)) {
                                    obj = null;
                                }
                                C1547340qMu c1547340qMu = C1547320qMs.Companion;
                                Map<String, Object> mapLJIIIZ = C1337850kv1.LJIIIZ(obj);
                                if (mapLJIIIZ != null) {
                                    mapLJIIIZ.put("node_name", str);
                                    map2 = mapLJIIIZ;
                                }
                                c1547340qMu.getClass();
                                C1547320qMs c1547320qMsLIZIZ = C1547340qMu.LIZIZ(map2);
                                if (c1547320qMsLIZIZ != null) {
                                    c1547320qMsLIZIZ.setParentNode(c1547320qMs);
                                    LIZJ(c21326518d5, c1547320qMsLIZIZ, view);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void LJ(C21326518d5 c21326518d5, C1547320qMs c1547320qMs, View view, String str, Object obj) {
        Map map;
        C1162800gMg c1162800gMgLJIILIIL;
        if (c1547320qMs.getParams() == null) {
            return;
        }
        Object obj2 = c1547320qMs.getData().get("callback");
        String string = null;
        if (obj2 instanceof Map) {
            map = (Map) obj2;
        } else {
            map = null;
        }
        if (obj != null && (c1162800gMgLJIILIIL = this.LIZLLL.LIZ.LJIILIIL()) != null) {
            c1162800gMgLJIILIIL.LIZIZ.put(c1547320qMs.getNodeName(), obj);
        }
        if (map != null && map.containsKey(str)) {
            Object obj3 = map.get(str);
            if (obj3 != null) {
                string = obj3.toString();
            }
            C1168400gVi.LIZ(new AwS73S1000000_23(string, 7));
            LJI(c21326518d5, c1547320qMs, view, string);
        }
    }

    public final void LJIIIIZZ(final int i, final String str, final EnumC1986007qE enumC1986007qE, final String str2, String str3) {
        final String str4 = str3;
        C21325918cz c21325918cz = this.LIZLLL.LIZ;
        final String strLJIIL = c21325918cz.LJIIL();
        final String strLJIIJJI = c21325918cz.LJIIJJI();
        if (str4 == null) {
            str4 = "";
        }
        new AbstractC1163040gN4(strLJIIL, enumC1986007qE, i, str, strLJIIJJI, str2, str4) { // from class: X.0pdq
            public final String LIZ;
            public final EnumC1986007qE LIZIZ;
            public final int LIZJ;
            public final String LIZLLL;
            public final String LJ;
            public final String LJFF;
            public final String LJI;

            @Override // X.AbstractC1163040gN4
            public final String LIZ() {
                return "myna_action_handler";
            }

            @Override // X.AbstractC1163040gN4
            public final Map<String, Object> LIZIZ(Map<String, ? extends Object> map) {
                HashMap map2 = new HashMap();
                map2.put("url", this.LIZ);
                map2.put("runtime", this.LIZIZ.getRuntime());
                map2.put("code", Integer.valueOf(this.LIZJ));
                map2.put("msg", this.LIZLLL);
                map2.put("templateId", this.LJ);
                map2.put("chainId", this.LJFF);
                map2.put("type", this.LJI);
                if (map != null) {
                    map2.putAll(map);
                }
                return map2;
            }

            {
                this.LIZ = strLJIIL;
                this.LIZIZ = enumC1986007qE;
                this.LIZJ = i;
                this.LIZLLL = str;
                this.LJ = strLJIIJJI;
                this.LJFF = str2;
                this.LJI = str4;
            }
        }.LIZJ(C21323718cd.LIZ(c21325918cz));
    }
}
