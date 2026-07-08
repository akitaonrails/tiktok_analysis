package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.playerkit.configpickerimpl.data.ConditionConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0ojB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1484270ojB {
    public Map<String, String> LIZ;
    public Map<String, String> LIZIZ;
    public final C1484320ojG LIZJ = new C1484320ojG();
    public final C1484300ojE LIZLLL = new C1484300ojE();
    public final C1484280ojC LJ;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0ojD] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0ojC] */
    public C1484270ojB() {
        final ?? r0 = new AbstractC1484310ojF() { // from class: X.0ojD
            @Override // X.AbstractC1484310ojF
            public final boolean LIZ(String str, List<String> list) {
                if (list != null && list.size() != 0 && !TextUtils.isEmpty(str)) {
                    return list.contains(str);
                }
                return false;
            }
        };
        this.LJ = new AbstractC1484310ojF(r0) { // from class: X.0ojC
            {
                this.LIZ = r0;
            }

            @Override // X.AbstractC1484310ojF
            public final boolean LIZ(String str, List<String> list) {
                if (list == null || list.size() == 0 || TextUtils.isEmpty(str)) {
                    return false;
                }
                if (list.size() != 2) {
                    return this.LIZ.LIZ(str, list);
                }
                try {
                    float f = CastFloatProtector.parseFloat(str);
                    float f2 = CastFloatProtector.parseFloat(list.get(0));
                    float f3 = CastFloatProtector.parseFloat(list.get(1));
                    if (f2 < f3 && (Math.abs(f2 % 1.0f) - 0.0f > 1.0E-4f || Math.abs(f3 % 1.0f) - 0.0f > 1.0E-4f)) {
                        if (f < f2 || f > f3) {
                            return false;
                        }
                        return true;
                    }
                    return this.LIZ.LIZ(str, list);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return this.LIZ.LIZ(str, list);
                }
            }
        };
    }

    public final List<ConditionConfig> LIZIZ(List<ConditionConfig> list) {
        ArrayList arrayList = new ArrayList();
        for (ConditionConfig conditionConfig : list) {
            Map<String, List<String>> map = conditionConfig.clientFilterRequirement;
            Map<String, List<String>> map2 = conditionConfig.serverFilterRequirement;
            if (LIZ(this.LIZIZ, map) && LIZ(this.LIZ, map2)) {
                arrayList.add(conditionConfig);
            }
        }
        return arrayList;
    }

    public final void LIZJ(C1484380ojM c1484380ojM) {
        C1484380ojM c1484380ojM2;
        Map<String, String> map;
        this.LIZJ.LIZ = c1484380ojM;
        C1484300ojE c1484300ojE = this.LIZLLL;
        c1484300ojE.getClass();
        c1484300ojE.LIZJ = c1484380ojM.LJFF;
        ((CopyOnWriteArrayList) c1484300ojE.LIZIZ).clear();
        List<InterfaceC1474770oTr> list = c1484380ojM.LJ;
        if (list != null && list.size() > 0) {
            ((CopyOnWriteArrayList) c1484300ojE.LIZIZ).addAll(list);
        }
        C1484320ojG c1484320ojG = this.LIZJ;
        if (c1484320ojG.LIZIZ == null && (c1484380ojM2 = c1484320ojG.LIZ) != null && (map = c1484380ojM2.LIZJ) != null) {
            c1484320ojG.LIZIZ = map;
        }
        this.LIZ = c1484320ojG.LIZIZ;
        final C1484300ojE c1484300ojE2 = this.LIZLLL;
        c1484300ojE2.getClass();
        final HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c1484300ojE2.LIZ);
        arrayList.addAll(c1484300ojE2.LIZIZ);
        ArrayList<InterfaceC1474770oTr> arrayList2 = new ArrayList();
        if (arrayList.size() == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("portraitParsers filter: null parsers：");
            sbLIZ.append(arrayList);
            C2188811AlT.LIZIZ(sbLIZ);
        } else {
            for (Object obj : arrayList) {
                if (obj != null) {
                    arrayList2.add(obj);
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            hashSet.add(((InterfaceC1474770oTr) it2.next()).key());
        }
        for (final InterfaceC1474770oTr interfaceC1474770oTr : arrayList2) {
            C1475720oVO.LIZ(interfaceC1474770oTr.key(), new InterfaceC1475730oVP() { // from class: X.0oVQ
                @Override // X.InterfaceC1475730oVP
                public final Object execute() {
                    C1484300ojE c1484300ojE3 = c1484300ojE2;
                    Map map3 = map2;
                    InterfaceC1474770oTr interfaceC1474770oTr2 = interfaceC1474770oTr;
                    c1484300ojE3.getClass();
                    return map3.put(interfaceC1474770oTr2.key(), interfaceC1474770oTr2.LIZ(c1484300ojE3.LIZJ));
                }
            });
        }
        this.LIZIZ = map2;
        C786410Ut5.j4("ConditionMatcher update portraits: server:%s, client:%s", new Object[]{this.LIZ, map2});
    }

    public final boolean LIZ(Map<String, String> map, Map<String, List<String>> map2) {
        if (map2 == null || map2.size() == 0) {
            return true;
        }
        if (map == null || map.size() == 0) {
            return false;
        }
        for (Map.Entry<String, List<String>> entry : map2.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (!map.containsKey(key)) {
                return false;
            }
            if (!LIZ(map.get(key), value)) {
                return false;
            }
        }
        return true;
    }
}
