package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0phN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521590phN {
    public static final WeakHashMap<AbstractC1514820pWS<?>, Map<String, InterfaceC1521900phs>> LIZ = new WeakHashMap<>();
    public static final C1521780phg LIZIZ = new AbstractC1521830phl() { // from class: X.0phg
        @Override // X.AbstractC1521830phl
        public final void LIZ() {
        }

        @Override // X.AbstractC1521830phl
        public final void LIZIZ() {
        }
    };

    public static void LIZ(final AbstractC1514820pWS abstractC1514820pWS) {
        WeakHashMap<AbstractC1514820pWS<?>, Map<String, InterfaceC1521900phs>> weakHashMap = LIZ;
        if (weakHashMap.get(abstractC1514820pWS) != null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        final boolean z = false;
        linkedHashMap.put("timing.mark", new InterfaceC1521900phs(abstractC1514820pWS, z) { // from class: X.0phO
            public final AbstractC1514820pWS<?> LIZ;
            public final boolean LIZIZ;

            {
                this.LIZ = abstractC1514820pWS;
                this.LIZIZ = z;
            }

            @Override // X.InterfaceC1521900phs
            public final void LIZ(Object obj, AbstractC1521830phl abstractC1521830phl) {
                if (obj != null && (obj instanceof JSONObject)) {
                    String str = this.LIZ.LLILZIL;
                    if (!this.LIZIZ) {
                        JSONObject jSONObject = (JSONObject) obj;
                        String strOptString = jSONObject.optString("key");
                        if ((true ^ a0.LJJJIL(strOptString)) && strOptString != null) {
                            long jOptLong = jSONObject.optLong("value", -1L);
                            if (jOptLong < 0) {
                                jOptLong = jSONObject.optLong("name", -1L);
                            }
                            if (jOptLong > 0) {
                                C1491570oux c1491570oux = C1491570oux.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("user");
                                sbLIZ.append('_');
                                sbLIZ.append(strOptString);
                                C1491570oux.LJIJI(c1491570oux, str, C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(jOptLong));
                                return;
                            }
                            C1491570oux c1491570oux2 = C1491570oux.LIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("user");
                            sbLIZ2.append('_');
                            sbLIZ2.append(strOptString);
                            C1491570oux.LJIJI(c1491570oux2, str, C2188811AlT.LIZIZ(sbLIZ2), Long.valueOf(System.currentTimeMillis()));
                            return;
                        }
                        abstractC1521830phl.LIZ();
                        return;
                    }
                    JSONObject jSONObject2 = (JSONObject) obj;
                    String strOptString2 = jSONObject2.optString("qualifiedName");
                    if ((!a0.LJJJIL(strOptString2)) && strOptString2 != null) {
                        if (!jSONObject2.has("value")) {
                            C1491570oux.LJIJI(C1491570oux.LIZ, str, strOptString2, Long.valueOf(System.currentTimeMillis()));
                            return;
                        }
                        C1491570oux c1491570oux3 = C1491570oux.LIZ;
                        Long lValueOf = Long.valueOf(jSONObject2.optLong("value", -1L));
                        if (lValueOf.longValue() >= 0) {
                            C1491570oux.LJIJI(c1491570oux3, str, strOptString2, Long.valueOf(lValueOf.longValue()));
                            return;
                        } else {
                            abstractC1521830phl.LIZ();
                            return;
                        }
                    }
                    abstractC1521830phl.LIZ();
                    return;
                }
                abstractC1521830phl.LIZ();
            }
        });
        linkedHashMap.put("timing.setAttribute", new C1521610phP(abstractC1514820pWS, false));
        linkedHashMap.put("timing.setMetric", new C1521620phQ(abstractC1514820pWS, false));
        final boolean z2 = true;
        linkedHashMap.put("timing._mark", new InterfaceC1521900phs(abstractC1514820pWS, z2) { // from class: X.0phO
            public final AbstractC1514820pWS<?> LIZ;
            public final boolean LIZIZ;

            {
                this.LIZ = abstractC1514820pWS;
                this.LIZIZ = z2;
            }

            @Override // X.InterfaceC1521900phs
            public final void LIZ(Object obj, AbstractC1521830phl abstractC1521830phl) {
                if (obj != null && (obj instanceof JSONObject)) {
                    String str = this.LIZ.LLILZIL;
                    if (!this.LIZIZ) {
                        JSONObject jSONObject = (JSONObject) obj;
                        String strOptString = jSONObject.optString("key");
                        if ((true ^ a0.LJJJIL(strOptString)) && strOptString != null) {
                            long jOptLong = jSONObject.optLong("value", -1L);
                            if (jOptLong < 0) {
                                jOptLong = jSONObject.optLong("name", -1L);
                            }
                            if (jOptLong > 0) {
                                C1491570oux c1491570oux = C1491570oux.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("user");
                                sbLIZ.append('_');
                                sbLIZ.append(strOptString);
                                C1491570oux.LJIJI(c1491570oux, str, C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(jOptLong));
                                return;
                            }
                            C1491570oux c1491570oux2 = C1491570oux.LIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("user");
                            sbLIZ2.append('_');
                            sbLIZ2.append(strOptString);
                            C1491570oux.LJIJI(c1491570oux2, str, C2188811AlT.LIZIZ(sbLIZ2), Long.valueOf(System.currentTimeMillis()));
                            return;
                        }
                        abstractC1521830phl.LIZ();
                        return;
                    }
                    JSONObject jSONObject2 = (JSONObject) obj;
                    String strOptString2 = jSONObject2.optString("qualifiedName");
                    if ((!a0.LJJJIL(strOptString2)) && strOptString2 != null) {
                        if (!jSONObject2.has("value")) {
                            C1491570oux.LJIJI(C1491570oux.LIZ, str, strOptString2, Long.valueOf(System.currentTimeMillis()));
                            return;
                        }
                        C1491570oux c1491570oux3 = C1491570oux.LIZ;
                        Long lValueOf = Long.valueOf(jSONObject2.optLong("value", -1L));
                        if (lValueOf.longValue() >= 0) {
                            C1491570oux.LJIJI(c1491570oux3, str, strOptString2, Long.valueOf(lValueOf.longValue()));
                            return;
                        } else {
                            abstractC1521830phl.LIZ();
                            return;
                        }
                    }
                    abstractC1521830phl.LIZ();
                    return;
                }
                abstractC1521830phl.LIZ();
            }
        });
        linkedHashMap.put("timing._setAttributes", new C1521610phP(abstractC1514820pWS, true));
        linkedHashMap.put("timing._setMetric", new C1521620phQ(abstractC1514820pWS, true));
        if (EnumC1520990pgP.SparkTracing.isEnabled()) {
            linkedHashMap.put("timing.setJSBInfos", new InterfaceC1521900phs(abstractC1514820pWS) { // from class: X.0phM
                public final AbstractC1514820pWS<?> LIZ;

                {
                    this.LIZ = abstractC1514820pWS;
                }

                @Override // X.InterfaceC1521900phs
                public final void LIZ(Object obj, AbstractC1521830phl abstractC1521830phl) {
                    T t;
                    if (obj instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) obj;
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                            if (jSONObjectOptJSONObject != null && (t = this.LIZ.LLJIJIL) != 0) {
                                t.LJIILIIL(jSONObjectOptJSONObject.optInt("stage"), jSONObjectOptJSONObject.optString("jsbId"), jSONObjectOptJSONObject.optJSONObject("infos"));
                            }
                        }
                    }
                    abstractC1521830phl.LIZIZ();
                }
            });
        }
        weakHashMap.put((AbstractC1514820pWS<?>) abstractC1514820pWS, linkedHashMap);
    }

    public static final void LIZIZ(AbstractC1514820pWS abstractC1514820pWS, JSONObject jSONObject, C1521570phL c1521570phL) {
        InterfaceC1521900phs interfaceC1521900phs;
        try {
            if (!EnumC1520990pgP.SparkTracing.isEnabled()) {
                return;
            }
            String strOptString = jSONObject.optString("method");
            if (strOptString.length() == 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Invalid method or value, ");
                sbLIZ.append(strOptString);
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            Map<String, InterfaceC1521900phs> map = LIZ.get(abstractC1514820pWS);
            if (map != null && (interfaceC1521900phs = map.get(strOptString)) != null) {
                Object objOpt = jSONObject.opt("params");
                AbstractC1521830phl abstractC1521830phl = c1521570phL;
                if (c1521570phL == null) {
                    abstractC1521830phl = LIZIZ;
                }
                interfaceC1521900phs.LIZ(objOpt, abstractC1521830phl);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("native error: ");
            sbLIZ2.append(th.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }
}
