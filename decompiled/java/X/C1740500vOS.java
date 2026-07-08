package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.libra.EcUgMallSchemaParamsConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.libra.EcUgMallSchemaParamsModel;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.libra.EcUgMallSchemaParamsOperateModel;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.libra.EcUgMallSchemaParamsQueryModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vOS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1740500vOS {
    public static final C1740500vOS LIZ = new C1740500vOS();

    public static Object LIZLLL(Object obj, String str, String str2) {
        boolean z;
        if (obj == null) {
            return null;
        }
        try {
            if (Intrinsics.LJFF(str, EnumC1740510vOT.INT.getType())) {
                return C2095008Iq.LJIIJJI(obj.toString());
            }
            if (Intrinsics.LJFF(str, EnumC1740510vOT.LONG.getType())) {
                return C2095008Iq.LJIILIIL(obj.toString());
            }
            if (Intrinsics.LJFF(str, EnumC1740510vOT.DOUBLE.getType())) {
                return C2327809Ae.LJII(obj.toString());
            }
            if (Intrinsics.LJFF(str, EnumC1740510vOT.STRING.getType())) {
                return obj.toString();
            }
            if (Intrinsics.LJFF(str, EnumC1740510vOT.BOOLEAN.getType())) {
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
            } else if (Intrinsics.LJFF(str, EnumC1740510vOT.ARRAY.getType())) {
                if (obj instanceof List) {
                    return (List) obj;
                }
            } else if (!Intrinsics.LJFF(str, EnumC1740510vOT.OBJECT.getType())) {
                if (Intrinsics.LJFF(str, EnumC1740510vOT.JSON.getType())) {
                    if (obj instanceof k) {
                        return (k) obj;
                    }
                } else if (Intrinsics.LJFF(str, EnumC1740510vOT.UUID.getType())) {
                    return str2;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static C1740270vO5 LIZ(Uri uri, Uri uri2, String str, String str2) {
        Object next;
        Uri uri3;
        Uri uriLIZ;
        Uri uriLIZ2;
        String string;
        String string2;
        String str3;
        Uri uri4 = uri;
        List list = (List) EcUgMallSchemaParamsConfigSettings.LIZIZ.getValue();
        int i = 1;
        n nVar = null;
        if (list != null) {
            Iterator it2 = list.iterator();
            loop0: while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    EcUgMallSchemaParamsModel ecUgMallSchemaParamsModel = (EcUgMallSchemaParamsModel) next;
                    if (Intrinsics.LJFF(uri2.getHost(), ecUgMallSchemaParamsModel.equalLandingPageHost) && ((str3 = ecUgMallSchemaParamsModel.equalLandingPagePath) == null || a0.LJJJIL(str3) || Intrinsics.LJFF(uri2.getPath(), ecUgMallSchemaParamsModel.equalLandingPagePath))) {
                        LIZ.getClass();
                        List<EcUgMallSchemaParamsQueryModel> list2 = ecUgMallSchemaParamsModel.equalLandingPageQuery;
                        if (list2 == null) {
                            break;
                        }
                        for (EcUgMallSchemaParamsQueryModel ecUgMallSchemaParamsQueryModel : list2) {
                            String str4 = ecUgMallSchemaParamsQueryModel.key;
                            if (str4 == null || !Intrinsics.LJFF(C1946007jm.LIZJ(uri2, str4), ecUgMallSchemaParamsQueryModel.value)) {
                                break;
                            }
                        }
                        break loop0;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            EcUgMallSchemaParamsModel ecUgMallSchemaParamsModel2 = (EcUgMallSchemaParamsModel) next;
            if (ecUgMallSchemaParamsModel2 != null) {
                ArrayList arrayList = new ArrayList();
                List<EcUgMallSchemaParamsOperateModel> list3 = ecUgMallSchemaParamsModel2.operateParamsFromMall;
                if (list3 != null) {
                    LIZ.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    ArrayList arrayList4 = new ArrayList();
                    for (EcUgMallSchemaParamsOperateModel ecUgMallSchemaParamsOperateModel : list3) {
                        List<String> list4 = ecUgMallSchemaParamsOperateModel.deepKeyChain;
                        if (list4 != null) {
                            if (Intrinsics.LJFF(C13LP.LJJJLL(list4), "ec_ug_landing_page_schema")) {
                                if (list4.size() > i) {
                                    String str5 = (String) C13LP.LJJJLZIJ(i, ecUgMallSchemaParamsOperateModel.deepKeyChain);
                                    if (str5 != null && !a0.LJJJIL(str5)) {
                                        try {
                                            nVar = C314470CUj.LIZJ(C1946007jm.LIZJ(uri2, str5));
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                        if (nVar == null) {
                                            if (!Intrinsics.LJFF(ecUgMallSchemaParamsOperateModel.ignoreDeepKeyNull, Boolean.TRUE)) {
                                                C1740320vOA c1740320vOA = C1740320vOA.LIZ;
                                                String string3 = uri2.toString();
                                                List listSingletonList = Collections.singletonList(str5);
                                                c1740320vOA.getClass();
                                                C1740320vOA.LIZIZ(string3, str2, "deep key null", listSingletonList);
                                            }
                                        }
                                        C1740500vOS c1740500vOS = LIZ;
                                        if (nVar == null) {
                                            nVar = new n();
                                        }
                                        List<String> list5 = ecUgMallSchemaParamsOperateModel.deepKeyChain;
                                        List<EcUgMallSchemaParamsQueryModel> list6 = ecUgMallSchemaParamsOperateModel.params;
                                        String string4 = uri2.toString();
                                        boolean zLJFF = Intrinsics.LJFF(ecUgMallSchemaParamsOperateModel.ignoreDeepKeyNull, Boolean.TRUE);
                                        c1740500vOS.getClass();
                                        LIZJ(nVar, list5, 1, list6, str, arrayList3, string4, str2, zLJFF);
                                        String strLIZLLL = C314470CUj.LIZLLL(nVar);
                                        if (strLIZLLL != null) {
                                            linkedHashMap.put(str5, strLIZLLL);
                                        }
                                    }
                                } else {
                                    List<EcUgMallSchemaParamsQueryModel> list7 = ecUgMallSchemaParamsOperateModel.params;
                                    if (list7 != null) {
                                        for (EcUgMallSchemaParamsQueryModel ecUgMallSchemaParamsQueryModel2 : list7) {
                                            String str6 = ecUgMallSchemaParamsQueryModel2.key;
                                            if (str6 != null) {
                                                C1740500vOS c1740500vOS2 = LIZ;
                                                String str7 = ecUgMallSchemaParamsQueryModel2.valueType;
                                                Object obj = ecUgMallSchemaParamsQueryModel2.value;
                                                c1740500vOS2.getClass();
                                                Object objLIZLLL = LIZLLL(obj, str7, str);
                                                if (objLIZLLL != null) {
                                                    string2 = objLIZLLL.toString();
                                                } else {
                                                    string2 = null;
                                                }
                                                LIZIZ(uri2, str6, string2, ecUgMallSchemaParamsQueryModel2.operateType, linkedHashMap, arrayList2);
                                            }
                                        }
                                    }
                                }
                                nVar = null;
                            }
                        } else {
                            List<EcUgMallSchemaParamsQueryModel> list8 = ecUgMallSchemaParamsOperateModel.params;
                            if (list8 != null) {
                                for (EcUgMallSchemaParamsQueryModel ecUgMallSchemaParamsQueryModel3 : list8) {
                                    String str8 = ecUgMallSchemaParamsQueryModel3.key;
                                    if (str8 != null) {
                                        C1740500vOS c1740500vOS3 = LIZ;
                                        String str9 = ecUgMallSchemaParamsQueryModel3.valueType;
                                        Object obj2 = ecUgMallSchemaParamsQueryModel3.value;
                                        c1740500vOS3.getClass();
                                        Object objLIZLLL2 = LIZLLL(obj2, str9, str);
                                        if (objLIZLLL2 != null) {
                                            string = objLIZLLL2.toString();
                                        } else {
                                            string = nVar;
                                        }
                                        LIZIZ(uri4, str8, string, ecUgMallSchemaParamsQueryModel3.operateType, linkedHashMap2, arrayList4);
                                    }
                                }
                            }
                        }
                        i = 1;
                    }
                    Uri uriLIZJ = AnonymousClass0185.LIZJ(uri2, linkedHashMap);
                    if (uriLIZJ == null || (uriLIZ = AnonymousClass0185.LIZ(uriLIZJ, arrayList2)) == null) {
                        uriLIZ = uri2;
                    }
                    Uri uriLIZJ2 = AnonymousClass0185.LIZJ(uri4, linkedHashMap2);
                    if (uriLIZJ2 == null || (uriLIZ2 = AnonymousClass0185.LIZ(uriLIZJ2, arrayList4)) == null) {
                        uriLIZ2 = uri4;
                    }
                    arrayList2.addAll(arrayList4);
                    arrayList2.addAll(arrayList3);
                    C443120HZe c443120HZe = new C443120HZe(uriLIZ2, uriLIZ, arrayList2);
                    uri4 = (Uri) c443120HZe.getFirst();
                    uri3 = (Uri) c443120HZe.getSecond();
                    arrayList.addAll((Collection) c443120HZe.getThird());
                } else {
                    uri3 = uri2;
                }
                if (!arrayList.isEmpty()) {
                    String string5 = uri2.toString();
                    C1740320vOA.LIZ.getClass();
                    C1740320vOA.LIZIZ(string5, str2, "unexpected keys", arrayList);
                }
                return new C1740270vO5(uri4, uri3);
            }
        }
        String string6 = uri2.toString();
        C1740320vOA.LIZ.getClass();
        C1740320vOA.LIZIZ(string6, str2, "no match config", null);
        return new C1740270vO5(uri4, uri2);
    }

    public static void LIZIZ(Uri uri, String str, String str2, Integer num, Map map, List list) {
        int value = C0NIU.REPLACE.getValue();
        if (num != null && num.intValue() == value) {
            if (str2 != null) {
                map.put(str, str2);
                return;
            }
            return;
        }
        int value2 = C0NIU.REMOVE.getValue();
        if (num != null && num.intValue() == value2) {
            if (C1976807ok.LIZLLL(uri, str) == null) {
                return;
            }
            ((ArrayList) list).add(str);
        } else {
            if (C1976807ok.LIZLLL(uri, str) != null || str2 == null) {
                return;
            }
            map.put(str, str2);
        }
    }

    public static n LIZJ(n nVar, List list, int i, List list2, String str, List list3, String str2, String str3, boolean z) {
        k kVarLJJIIZ;
        n nVar2;
        try {
            if (i == list.size() - 1) {
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        EcUgMallSchemaParamsQueryModel ecUgMallSchemaParamsQueryModel = (EcUgMallSchemaParamsQueryModel) it2.next();
                        String str4 = ecUgMallSchemaParamsQueryModel.key;
                        if (str4 != null) {
                            C1740500vOS c1740500vOS = LIZ;
                            String str5 = ecUgMallSchemaParamsQueryModel.valueType;
                            Object obj = ecUgMallSchemaParamsQueryModel.value;
                            c1740500vOS.getClass();
                            Object objLIZLLL = LIZLLL(obj, str5, str);
                            Integer num = ecUgMallSchemaParamsQueryModel.operateType;
                            int value = C0NIU.REPLACE.getValue();
                            if (num != null && num.intValue() == value) {
                                if (objLIZLLL != null) {
                                    C1227904rF.LIZ.getClass();
                                    nVar.LJJIFFI(str4, GsonProtectorUtils.toJsonTree(C1227904rF.LIZLLL(), objLIZLLL));
                                }
                            } else {
                                int value2 = C0NIU.REMOVE.getValue();
                                if (num != null && num.intValue() == value2) {
                                    if (nVar.LJJIJIIJIL(str4)) {
                                        ((ArrayList) list3).add(str4);
                                        nVar.LJJIJL(str4);
                                    }
                                } else if (!nVar.LJJIJIIJIL(str4) && objLIZLLL != null) {
                                    C1227904rF.LIZ.getClass();
                                    nVar.LJJIFFI(str4, GsonProtectorUtils.toJsonTree(C1227904rF.LIZLLL(), objLIZLLL));
                                }
                            }
                        }
                    }
                }
                return nVar;
            }
            boolean z2 = true;
            int i2 = i + 1;
            String str6 = (String) C13LP.LJJJLZIJ(i2, list);
            k kVar = null;
            if (str6 != null && (kVarLJJIIZ = nVar.LJJIIZ(str6)) != null) {
                if ((kVarLJJIIZ instanceof q) && (((q) kVarLJJIIZ).LL instanceof String)) {
                    kVarLJJIIZ = C314470CUj.LIZJ(((q) kVarLJJIIZ).LJIL());
                } else {
                    z2 = false;
                }
                if ((kVarLJJIIZ instanceof n) && (nVar2 = (n) kVarLJJIIZ) != null) {
                    LIZ.getClass();
                    kVar = nVar2;
                    LIZJ(nVar2, list, i2, list2, str, list3, str2, str3, z);
                }
                if (str6 != null) {
                    if (z2) {
                        nVar.LJJIIJ(str6, C314470CUj.LIZLLL(kVar));
                        return nVar;
                    }
                    nVar.LJJIFFI(str6, kVar);
                }
                return nVar;
            }
            if (!z) {
                C1740320vOA c1740320vOA = C1740320vOA.LIZ;
                if (str6 == null) {
                    str6 = "";
                }
                List listSingletonList = Collections.singletonList(str6);
                c1740320vOA.getClass();
                C1740320vOA.LIZIZ(str2, str3, "deep key null", listSingletonList);
            }
            return nVar;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return nVar;
        }
    }
}
