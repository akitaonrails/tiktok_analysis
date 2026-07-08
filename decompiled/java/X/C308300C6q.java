package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.s;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0C6q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308300C6q {
    public static final Map<String, Integer> LIZ = new LinkedHashMap();
    public static final Gson LIZIZ;

    static {
        String[] strArrLJFF = C0C5I.LIZ.LJFF("CDN_CONFIG_NAMESPACE_SET___");
        if (strArrLJFF != null) {
            for (String str : strArrLJFF) {
                C307870C4z c307870C4z = C0C5I.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("_CDN_CONFIG_VERSION_ID_LIST___");
                String[] strArrLJFF2 = c307870C4z.LJFF(C2188811AlT.LIZIZ(sbLIZ));
                if (strArrLJFF2 != null) {
                    for (String str2 : strArrLJFF2) {
                        if (str2 != null) {
                            LinkedHashMap linkedHashMap = (LinkedHashMap) LIZ;
                            Integer num = (Integer) linkedHashMap.get(str2);
                            linkedHashMap.put(str2, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                        }
                    }
                }
            }
        }
        LIZIZ = new Gson();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String LIZ(k kVar) {
        if (kVar == 0) {
            return "";
        }
        if (kVar instanceof String) {
            try {
                GsonProtectorUtils.fromJson(LIZIZ, (String) kVar, n.class);
                return (String) kVar;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                return GsonProtectorUtils.toJson(LIZIZ, (Object) kVar);
            }
        }
        return kVar.toString();
    }

    public static void LIZJ(n nVar) {
        String[] strArrLJFF = C307870C4z.LIZJ.LJFF("CDN_CONFIG_KEY_SET___");
        Iterator<T> it2 = nVar.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            C307870C4z.LIZJ.LJIIIIZZ().LJIIIIZZ((String) entry.getKey(), CastLongProtector.parseLong(((k) entry.getValue()).LJIL()));
        }
        String[] strArr = (String[]) nVar.LJJIJIL().toArray(new String[0]);
        if (strArrLJFF != null) {
            for (String str : strArrLJFF) {
                if (C13LQ.LJJIJIIJI(str, strArr) < 0) {
                    C307870C4z.LIZJ.LJIIIIZZ().LIZ(str);
                }
            }
        }
        C307870C4z.LIZJ.LJIIIIZZ().LJII("CDN_CONFIG_KEY_SET___", strArr);
    }

    public static void LIZLLL(n nVar, Set set) {
        Set linkedHashSet;
        String[] strArrLJFF = C307870C4z.LIZJ.LJFF("CDN_CONFIG_KEY_SET___");
        if (strArrLJFF == null || (linkedHashSet = C13LQ.LJLIIIL(strArrLJFF)) == null) {
            linkedHashSet = new LinkedHashSet();
        }
        Iterator<T> it2 = nVar.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            C307870C4z.LIZJ.LJIIIIZZ().LJIIIIZZ((String) entry.getKey(), CastLongProtector.parseLong(((k) entry.getValue()).LJIL()));
            linkedHashSet.add(entry.getKey());
        }
        Set<String> setLJJIJIL = nVar.LJJIJIL();
        Iterator it3 = set.iterator();
        while (it3.hasNext()) {
            String str = (String) it3.next();
            if (!setLJJIJIL.contains(str)) {
                C307870C4z.LIZJ.LJIIIIZZ().LIZ(str);
            }
        }
        C307870C4z.LIZJ.LJIIIIZZ().LJII("CDN_CONFIG_KEY_SET___", (String[]) C13LP.LLIIJLIL(linkedHashSet, C13LP.LLIIJI(linkedHashSet)).toArray(new String[0]));
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [T, java.util.ArrayList, java.util.Collection] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:70:0x0179
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LIZIZ(java.io.InputStream r8, java.lang.String r9, java.lang.String r10, java.util.Set r11, java.util.Set r12) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308300C6q.LIZIZ(java.io.InputStream, java.lang.String, java.lang.String, java.util.Set, java.util.Set):void");
    }
}
