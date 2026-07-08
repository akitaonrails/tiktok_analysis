package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Pdo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C649540Pdo {
    public static final Map<String, Object> LIZIZ(Map<?, ?> map, Map<String, ? extends Object> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            String strValueOf = String.valueOf(entry.getKey());
            List list = (List) entry.getValue();
            Object obj = map2.get(strValueOf);
            if (obj instanceof List) {
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(iterable, 10));
                for (Object objLIZJ : iterable) {
                    if (objLIZJ instanceof Map) {
                        objLIZJ = LIZJ(list, (Map) objLIZJ);
                    }
                    arrayList.add(objLIZJ);
                }
                linkedHashMap.put(strValueOf, arrayList);
            } else if (obj instanceof Map) {
                linkedHashMap.put(strValueOf, LIZJ(list, linkedHashMap));
            }
        }
        return linkedHashMap;
    }

    public static final Map LIZJ(List list, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            if (obj instanceof String) {
                Object obj2 = map.get(obj);
                if (obj2 != null) {
                    linkedHashMap.put(obj, obj2);
                }
            } else if (obj instanceof Map) {
                Map map2 = (Map) obj;
                Object objLJJJJZ = C13LP.LJJJJZ(map2.keySet());
                List list2 = (List) C13LP.LJJJJZ(map2.values());
                Object obj3 = map.get(objLJJJJZ);
                Map mapLJ = C2097608Jq.LJ();
                if (obj3 instanceof Map) {
                    mapLJ = (Map) map.get(objLJJJJZ);
                }
                if (!mapLJ.isEmpty()) {
                    linkedHashMap.put(objLJJJJZ, LIZJ(list2, mapLJ));
                } else {
                    linkedHashMap.put(objLJJJJZ, obj3);
                }
            }
        }
        return linkedHashMap;
    }

    public static final void LIZLLL(C1537830q7Z c1537830q7Z, String str) {
        Integer numValueOf;
        C649560Pdq c649560Pdq = new C649560Pdq();
        if (C649470Pdh.LJIILJJIL(str)) {
            numValueOf = Integer.valueOf(EnumC665490Q8l.MULTI_THREADS.id());
        } else {
            numValueOf = Integer.valueOf(EnumC665490Q8l.PART_ON_LAYOUT.id());
        }
        c649560Pdq.LIZIZ = numValueOf;
        c649560Pdq.LIZ = Boolean.TRUE;
        c1537830q7Z.LJJJJJ = c649560Pdq;
    }

    public static void LJ(C1537830q7Z c1537830q7Z, Context context) {
        c1537830q7Z.LJIJ = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(C12ES.LJIIJ(context), 1073741824));
        c1537830q7Z.LJIIZILJ = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public static final void LIZ(final C1537830q7Z c1537830q7Z, final C1537480q70 c1537480q70, final Map map, final Function1 function1) {
        final String strValueOf = String.valueOf(c1537830q7Z.LJJJJL);
        HybridSchemaParam hybridSchemaParam = c1537830q7Z.LJJIIJ;
        if (hybridSchemaParam != null && hybridSchemaParam.getEnableExtraInfo() == 1) {
            c1537830q7Z.LJIJJLI = new C1537260q6e() { // from class: X.0Pac
                @Override // X.C1537260q6e
                public final void LIZ(Map<String, ? extends Object> map2) {
                    Map map3;
                    Map<String, ? extends Object> mapLIZIZ;
                    List list;
                    List list2;
                    c1537830q7Z.LJIJJLI = null;
                    Object obj = map2.get("clippedData");
                    if (obj instanceof Map) {
                        map3 = (Map) obj;
                    } else {
                        map3 = null;
                    }
                    C647380PaK c647380PaK = C647380PaK.LJIIIIZZ;
                    String str = strValueOf;
                    c647380PaK.getClass();
                    if (C647380PaK.LJIIJJI(str) && map3 != null) {
                        Map<String, Object> mapLJ = map;
                        if (mapLJ == null) {
                            mapLJ = C2097608Jq.LJ();
                        }
                        mapLIZIZ = C649540Pdo.LIZIZ(map3, mapLJ);
                    } else {
                        mapLIZIZ = map;
                    }
                    Object obj2 = map2.get("dependentKeys");
                    if (obj2 instanceof List) {
                        list = (List) obj2;
                    } else {
                        list = null;
                    }
                    Uri uriLIZ = c1537830q7Z.LIZ();
                    if (uriLIZ != null) {
                        try {
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZ, "enable_dependent_key");
                            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                                if (CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) == 1) {
                                    c1537480q70.LJJ(C647180Pa0.class, new C647180Pa0(list));
                                }
                            }
                        } catch (NullPointerException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    if (C20039613b0.LIZ(strValueOf)) {
                        Object obj3 = map2.get("awemeDependentKeys");
                        if ((obj3 instanceof List) && (list2 = (List) obj3) != null) {
                            c1537480q70.LJJ(C647430PaP.class, new C647430PaP(list2));
                        }
                    }
                    function1.invoke(mapLIZIZ);
                }
            };
        } else {
            function1.invoke(map);
        }
    }
}
