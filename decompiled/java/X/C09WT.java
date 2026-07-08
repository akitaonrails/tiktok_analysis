package X;

import com.google.gson.Gson;
import com.google.gson.n;
import com.ss.bduploader.BDImageXUploader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09WT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09WT {
    public static final C09WT LIZ = new C09WT();
    public static final C054G LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public static final ConcurrentHashMap<String, ConcurrentHashMap<String, C05XL<C09WU>>> LIZJ = new ConcurrentHashMap<>();
    public static final Set<BDImageXUploader> LIZLLL = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final ConcurrentHashMap<String, Set<BDImageXUploader>> LJ = new ConcurrentHashMap<>();
    public static final Set<String> LJFF = Collections.newSetFromMap(new ConcurrentHashMap());

    public static void LIZIZ(String str) {
        LIZJ.remove(str);
        LJ.remove(str);
        LJFF.remove(str);
    }

    public static Map LJI(n nVar) {
        Gson gson = C2348609Ie.LIZ;
        Map mapLIZIZ = C2348609Ie.LIZIZ(new JSONObject(nVar.toString()));
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLIZIZ.size()));
        for (Map.Entry entry : ((LinkedHashMap) mapLIZIZ).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                value = "";
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }

    public static Map LIZ(C09WU c09wu, int i) {
        HashMap map = new HashMap();
        String str = c09wu.LIZIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        map.put("uri", str);
        Number number = c09wu.LIZJ;
        if (number != null) {
            map.put("width", number);
        }
        Number number2 = c09wu.LIZLLL;
        if (number2 != null) {
            map.put("height", number2);
        }
        String str3 = c09wu.LJ;
        if (str3 == null) {
            str3 = "";
        }
        map.put("md5", str3);
        String str4 = c09wu.LJFF;
        if (str4 != null) {
            str2 = str4;
        }
        map.put("file_cs", str2);
        map.put("seq", Integer.valueOf(i));
        return map;
    }

    public static C05XL LIZJ(String str, String str2) {
        C05XL<C09WU> c05xlPutIfAbsent;
        ConcurrentHashMap<String, C05XL<C09WU>> concurrentHashMapPutIfAbsent;
        ConcurrentHashMap<String, ConcurrentHashMap<String, C05XL<C09WU>>> concurrentHashMap = LIZJ;
        ConcurrentHashMap<String, C05XL<C09WU>> concurrentHashMap2 = concurrentHashMap.get(str);
        if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(str, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap2 = concurrentHashMapPutIfAbsent;
        }
        ConcurrentHashMap<String, C05XL<C09WU>> concurrentHashMap3 = concurrentHashMap2;
        String strLJJJJZ = a0.LJJJJZ("file://", str2);
        C05XL<C09WU> c05xlLIZIZ = concurrentHashMap3.get(strLJJJJZ);
        if (c05xlLIZIZ == null && (c05xlPutIfAbsent = concurrentHashMap3.putIfAbsent(strLJJJJZ, (c05xlLIZIZ = C090F.LIZIZ()))) != null) {
            c05xlLIZIZ = c05xlPutIfAbsent;
        }
        return c05xlLIZIZ;
    }

    public static void LJ(String str, String str2, C09WU c09wu) {
        if (str.length() != 0 && str2 != null && str2.length() != 0) {
            C05XL c05xlLIZJ = LIZJ(str, str2);
            if (!c05xlLIZJ.isCompleted()) {
                c05xlLIZJ.LJIIZILJ(c09wu);
            }
        }
    }

    public static void LIZLLL(String str, List list, Number number, String str2) {
        C09WU c09wu = new C09WU(false, null, null, null, null, null, number, str2, 62);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str3 = (String) it2.next();
            LIZ.getClass();
            LJ(str, str3, c09wu);
        }
    }

    /* JADX WARN: Path cross not found for [B:32:0x00a0, B:35:0x00a7], limit reached: 77 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065 A[Catch: all -> 0x0116, TryCatch #0 {all -> 0x0116, blocks: (B:18:0x005e, B:20:0x0065, B:22:0x006d, B:50:0x00dc, B:51:0x00df, B:52:0x00e0), top: B:72:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac A[Catch: all -> 0x00da, TryCatch #2 {all -> 0x00da, blocks: (B:25:0x0091, B:26:0x0094, B:28:0x0098, B:30:0x009c, B:32:0x00a0, B:38:0x00ac, B:40:0x00bb, B:42:0x00bf, B:45:0x00d3, B:44:0x00c3), top: B:75:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e0 A[Catch: all -> 0x0116, TryCatch #0 {all -> 0x0116, blocks: (B:18:0x005e, B:20:0x0065, B:22:0x006d, B:50:0x00dc, B:51:0x00df, B:52:0x00e0), top: B:72:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0124  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008e -> B:26:0x0094). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r13, java.util.List r14, java.util.Map r15, X.InterfaceC1364105Vn r16) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09WT.LJFF(java.lang.String, java.util.List, java.util.Map, X.05Vn):java.lang.Object");
    }
}
