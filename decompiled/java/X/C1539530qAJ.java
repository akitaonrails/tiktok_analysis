package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qAJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1539530qAJ {
    public static final C1539530qAJ LIZ = new C1539530qAJ();

    public static JSONObject LIZIZ(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            C1539530qAJ c1539530qAJ = LIZ;
            Object value = entry.getValue();
            c1539530qAJ.getClass();
            linkedHashMap.put(key, LJFF(value));
        }
        return new JSONObject(linkedHashMap);
    }

    public static Map LIZLLL(String str) {
        List listLJJLIIIJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null && (listLJJLIIIJ = a0.LJJLIIIJ(str, new char[]{','}, false, 0, 6)) != null) {
            Iterator it2 = listLJJLIIIJ.iterator();
            while (it2.hasNext()) {
                List listLJJLIIIJ2 = a0.LJJLIIIJ(a0.LJLIIIL((String) it2.next()).toString(), new char[]{';'}, false, 0, 6);
                if (!listLJJLIIIJ2.isEmpty()) {
                    String string = a0.LJLIIIL((String) ListProtector.get(listLJJLIIIJ2, 0)).toString();
                    Iterator it3 = C13LP.LJJJJIZL(listLJJLIIIJ2, 1).iterator();
                    Double dLJII = null;
                    while (it3.hasNext()) {
                        List listLJJLIIIJ3 = a0.LJJLIIIJ(a0.LJLIIIL((String) it3.next()).toString(), new char[]{'='}, false, 0, 6);
                        if (listLJJLIIIJ3.size() == 2) {
                            String lowerCase = a0.LJLIIIL((String) ListProtector.get(listLJJLIIIJ3, 0)).toString().toLowerCase(Locale.ROOT);
                            if (Intrinsics.LJFF(lowerCase, "dur")) {
                                dLJII = C2327809Ae.LJII(a0.LJLIIIL((String) ListProtector.get(listLJJLIIIJ3, 1)).toString());
                            } else if (Intrinsics.LJFF(lowerCase, "desc")) {
                                a0.LJJJLZIJ("\"", "\"", a0.LJLIIIL((String) ListProtector.get(listLJJLIIIJ3, 1)).toString());
                            }
                        }
                    }
                    linkedHashMap.put(string, new C1539570qAN(dLJII));
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJFF(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1539530qAJ.LJFF(java.lang.Object):java.lang.Object");
    }

    public static void LIZJ(C1537480q70 c1537480q70, EnumC1537220q6a enumC1537220q6a, Map map) {
        C1530570pvr.LIZJ(c1537480q70, new EnumC1537220q6a[]{enumC1537220q6a}, null);
        map.put(enumC1537220q6a.getKey(), Long.valueOf(System.currentTimeMillis()));
    }

    public static void LIZ(C0X52 c0x52, C1537480q70 c1537480q70, Map map, Function2 function2) {
        C080U next;
        String str;
        InputStream inputStreamIn;
        LIZJ(c1537480q70, EnumC1537220q6a.SLSR_RECEIVE_HEADER, map);
        try {
            Iterator<C080U> it2 = c0x52.LIZ.LIZLLL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    C080U c080u = next;
                    if (Intrinsics.LJFF(c080u.LIZ.toLowerCase(Locale.ROOT), "server-timing") && a0.LJJIIZI(c080u.LIZIZ, "bd-spark", false)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C080U c080u2 = next;
            if (c080u2 != null) {
                str = c080u2.LIZIZ;
            } else {
                str = null;
            }
            for (Map.Entry entry : ((LinkedHashMap) LIZLLL(str)).entrySet()) {
                String str2 = (String) entry.getKey();
                C1539570qAN c1539570qAN = (C1539570qAN) entry.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("slsr_");
                sbLIZ.append(u.LJJIFFI(str2, "-", "_", false));
                c1537480q70.LJIIIZ().LIZJ(C2188811AlT.LIZIZ(sbLIZ), c1539570qAN.LIZ);
            }
            TypedInput typedInput = (TypedInput) c0x52.LIZIZ;
            if (typedInput != null && (inputStreamIn = typedInput.in()) != null) {
                try {
                    byte[] bArrLIZIZ = C2106208My.LIZIZ(inputStreamIn);
                    C1539530qAJ c1539530qAJ = LIZ;
                    EnumC1537220q6a enumC1537220q6a = EnumC1537220q6a.SLSR_REQUEST_END;
                    c1539530qAJ.getClass();
                    LIZJ(c1537480q70, enumC1537220q6a, map);
                    C1539810qAl c1539810qAlLIZ = C1539720qAc.LIZ(bArrLIZIZ, c1537480q70);
                    Pair[] pairArr = new Pair[1];
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (C080U c080u3 : c0x52.LIZ.LIZLLL) {
                        linkedHashMap.put(c080u3.LIZ, c080u3.LIZIZ);
                    }
                    pairArr[0] = new Pair("headers", linkedHashMap);
                    function2.invoke(new C1539820qAm(c1539810qAlLIZ, C2097608Jq.LJIIJ(pairArr), map), null);
                    C2107108Nh.LIZ(inputStreamIn, null);
                } catch (Throwable th) {
                    th = th;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    C2107108Nh.LIZ(inputStreamIn, th);
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th = null;
                    }
                }
            }
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
            function2.invoke(null, th5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1154850g9r LJ(final android.content.Context r22, java.lang.String r23, java.util.Map r24, java.lang.String r25, boolean r26, X.C1537480q70 r27, com.bytedance.lynx.hybrid.param.HybridSchemaParam r28, java.lang.String r29, final kotlin.jvm.functions.Function2 r30) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1539530qAJ.LJ(android.content.Context, java.lang.String, java.util.Map, java.lang.String, boolean, X.0q70, com.bytedance.lynx.hybrid.param.HybridSchemaParam, java.lang.String, kotlin.jvm.functions.Function2):X.0g9r");
    }
}
