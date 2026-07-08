package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.typed.TypedFrequencySceneConfig;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.typed.TypedFrequencyUnit;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.config.model.ImFrequencyTriggerEnum;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.056h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12985056h {
    public static final Object LIZ = new Object();
    public static volatile Map<String, ? extends InterfaceC12999056v> LIZIZ = C2097608Jq.LJ();

    public static void LIZJ() {
        synchronized (LIZ) {
            try {
                if (LIZIZ.isEmpty()) {
                    return;
                }
                LIZIZ = C2097608Jq.LJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x035c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0421 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0419  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C12996056s LIZIZ(java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 1581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12985056h.LIZIZ(java.lang.String):X.056s");
    }

    public static Map LIZLLL(TypedFrequencySceneConfig typedFrequencySceneConfig) {
        List<TypedFrequencyUnit> list = typedFrequencySceneConfig.units;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        if (list.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (TypedFrequencyUnit typedFrequencyUnit : list) {
            ImFrequencyTriggerEnum imFrequencyTriggerEnum = typedFrequencyUnit.trigger;
            if (imFrequencyTriggerEnum == null) {
                return null;
            }
            C12994056q c12994056q = EnumC12995056r.Companion;
            Integer numValueOf = Integer.valueOf(imFrequencyTriggerEnum.getValue());
            c12994056q.getClass();
            EnumC12995056r enumC12995056rLIZ = C12994056q.LIZ(numValueOf);
            if (enumC12995056rLIZ == null) {
                return null;
            }
            List list2 = typedFrequencyUnit.rules;
            if (list2 == null) {
                list2 = C13BV.INSTANCE;
            }
            if (list2.isEmpty() || linkedHashMap.containsKey(enumC12995056rLIZ)) {
                return null;
            }
            linkedHashMap.put(enumC12995056rLIZ, list2);
        }
        return linkedHashMap;
    }

    public static InterfaceC12999056v LJ(String str) {
        if (str.length() == 0) {
            return null;
        }
        Map<String, ? extends InterfaceC12999056v> map = LIZIZ;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        synchronized (LIZ) {
            try {
                Map<String, ? extends InterfaceC12999056v> map2 = LIZIZ;
                if (map2.containsKey(str)) {
                    return map2.get(str);
                }
                C12996056s c12996056sLIZIZ = LIZIZ(str);
                LIZIZ = C2097608Jq.LJIILIIL(map2, new Pair(str, c12996056sLIZIZ));
                return c12996056sLIZIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static C12996056s LIZ(EnumC12986056i enumC12986056i, TypedFrequencySceneConfig typedFrequencySceneConfig) {
        int iIntValue;
        Map mapLIZLLL = LIZLLL(typedFrequencySceneConfig);
        if (mapLIZLLL == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLIZLLL.size()));
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) mapLIZLLL;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            linkedHashMap.put(entry.getKey(), new C053K(enumC12986056i.getSceneName(), (EnumC12995056r) entry.getKey(), (List) entry.getValue()));
        }
        Gson gson = C12990056m.LIZ;
        String sceneName = enumC12986056i.getSceneName();
        Integer num = typedFrequencySceneConfig.version;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C12992056o c12992056oLIZIZ = C12990056m.LIZIZ(sceneName, iIntValue, typedFrequencySceneConfig.reportInterval, 0L, false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("buildFromFallback: scene=");
        sbLIZ.append(enumC12986056i);
        sbLIZ.append(" actions=");
        sbLIZ.append(linkedHashMap2.keySet());
        sbLIZ.append(" enable=false");
        C2188811AlT.LIZIZ(sbLIZ);
        return new C12996056s(enumC12986056i.getSceneName(), c12992056oLIZIZ, linkedHashMap);
    }
}
