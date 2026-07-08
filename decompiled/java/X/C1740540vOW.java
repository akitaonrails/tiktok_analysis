package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.ss.android.ugc.aweme.ecommerce.ug.prefetch.bean.BodyParams;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vOW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1740540vOW {
    public static final C1740540vOW LIZ = new C1740540vOW();

    public static Object LIZJ(Object obj, String str) {
        List list;
        Integer numLJIIJJI;
        String string;
        boolean z;
        if (obj == null) {
            return null;
        }
        try {
            if (Intrinsics.LJFF(str, EnumC1740530vOV.INT.getType())) {
                return C2095008Iq.LJIIJJI(obj.toString());
            }
            if (Intrinsics.LJFF(str, EnumC1740530vOV.LONG.getType())) {
                return C2095008Iq.LJIILIIL(obj.toString());
            }
            if (Intrinsics.LJFF(str, EnumC1740530vOV.DOUBLE.getType())) {
                return C2327809Ae.LJII(obj.toString());
            }
            if (Intrinsics.LJFF(str, EnumC1740530vOV.STRING.getType())) {
                return obj.toString();
            }
            if (Intrinsics.LJFF(str, EnumC1740530vOV.BOOLEAN.getType())) {
                if (obj instanceof String) {
                    if (!Intrinsics.LJFF(obj, "1") && !Intrinsics.LJFF(obj, "true")) {
                        z = false;
                    } else {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
            } else if (Intrinsics.LJFF(str, EnumC1740530vOV.ARRAY.getType())) {
                if (obj instanceof List) {
                    return (List) obj;
                }
            } else if (Intrinsics.LJFF(str, EnumC1740530vOV.INT_ARRAY.getType())) {
                if (obj instanceof List) {
                    list = (List) obj;
                } else {
                    list = null;
                }
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 != null && (string = obj2.toString()) != null) {
                            numLJIIJJI = C2095008Iq.LJIIJJI(string);
                        } else {
                            numLJIIJJI = null;
                        }
                        if (numLJIIJJI != null) {
                            arrayList.add(numLJIIJJI);
                        }
                    }
                    return arrayList;
                }
            } else if (!Intrinsics.LJFF(str, EnumC1740530vOV.OBJECT.getType())) {
                if (Intrinsics.LJFF(str, EnumC1740530vOV.JSON.getType()) && (obj instanceof k)) {
                    return (k) obj;
                }
            } else {
                return obj;
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LIZ(java.lang.String r7, java.util.Map r8, com.ss.android.ugc.aweme.ecommerce.ug.prefetch.bean.BodyParams r9) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1740540vOW.LIZ(java.lang.String, java.util.Map, com.ss.android.ugc.aweme.ecommerce.ug.prefetch.bean.BodyParams):java.lang.Object");
    }

    public static Map LIZIZ(String str, List list, Map map, boolean z) {
        if (list == null) {
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<BodyParams> arrayList = new ArrayList();
        for (Object obj : list) {
            String str2 = ((BodyParams) obj).key;
            if (str2 != null && !a0.LJJJIL(str2)) {
                arrayList.add(obj);
            }
        }
        for (BodyParams bodyParams : arrayList) {
            if (bodyParams.key != null) {
                LIZ.getClass();
                Object objLIZJ = LIZJ(LIZ(str, map, bodyParams), bodyParams.dataType);
                if (objLIZJ != null) {
                    linkedHashMap.put(bodyParams.key, objLIZJ);
                }
            }
        }
        if (z) {
            linkedHashMap.put("is_ug_native_prefetch", "1");
        }
        return linkedHashMap;
    }
}
