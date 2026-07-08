package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vY4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746460vY4 {
    public static final C1746460vY4 LIZ = new C1746460vY4();
    public static final HashSet<String> LIZIZ = new HashSet<>();
    public static final HashSet<String> LIZJ = new HashSet<>();
    public static final HashMap<String, C1747000vYw> LIZLLL = new HashMap<>();
    public static final Set<String> LJ = C093Y.LJ("name", "first_name", "last_name", "phone", "plain_phone", "alternate_phone", "plain_alternate_phone", "email", "tax_id");

    public static boolean LIZIZ(String str) {
        return C19719512Dh.LIZ(LIZJ).remove(str);
    }

    public static boolean LIZJ(String str) {
        return C19719512Dh.LIZ(LIZIZ).remove(str);
    }

    public static Map LIZLLL(String str) {
        Object obj;
        C1747000vYw c1747000vYw = LIZLLL.get(str);
        if (c1747000vYw == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1747000vYw c1747000vYw2 = c1747000vYw.LJ;
        if (c1747000vYw2 != null) {
            Object objLJJLIIIJ = c1747000vYw2.LIZ;
            if (objLJJLIIIJ != null) {
                LIZ.getClass();
                if (!(objLJJLIIIJ instanceof List) || (objLJJLIIIJ = C13LP.LJJLIIIJ((Iterable) objLJJLIIIJ, null, null, null, 0, null, AFwS268S0000000_26.get$arr$(502), 31)) != null) {
                    linkedHashMap.put("input_box_detail", objLJJLIIIJ);
                }
            }
            String str2 = c1747000vYw2.LIZIZ;
            if (str2 != null) {
                linkedHashMap.put("latitude_longitude", str2);
            }
            Map<String, ? extends Object> map = c1747000vYw2.LIZJ;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            String str3 = c1747000vYw2.LIZLLL;
            if (str3 != null) {
                linkedHashMap.put("sug_address_detail", str3);
            }
        }
        Object objLJJLIIIJ2 = c1747000vYw.LIZ;
        if (objLJJLIIIJ2 != null) {
            LIZ.getClass();
            if (!(objLJJLIIIJ2 instanceof List) || (objLJJLIIIJ2 = C13LP.LJJLIIIJ((Iterable) objLJJLIIIJ2, null, null, null, 0, null, AFwS268S0000000_26.get$arr$(502), 31)) != null) {
                linkedHashMap.put("final_input_box_detail", objLJJLIIIJ2);
            }
        }
        String str4 = c1747000vYw.LIZIZ;
        if (str4 != null) {
            linkedHashMap.put("final_latitude_longitude", str4);
        }
        Map<String, ? extends Object> map2 = c1747000vYw.LIZJ;
        if (map2 != null && (obj = map2.get("sug_address_id")) != null) {
            linkedHashMap.put("final_sug_address_id", obj);
        }
        String str5 = c1747000vYw.LIZLLL;
        if (str5 != null) {
            linkedHashMap.put("final_sug_address_detail", str5);
        }
        String str6 = c1747000vYw.LJFF;
        if (str6 != null) {
            linkedHashMap.put("sug_type", str6);
        }
        return linkedHashMap;
    }

    public static Map LJ(CandInputData candInputData, boolean z) {
        String strLIZIZ;
        String str;
        HashMap<String, Object> mapLJIIJ;
        List<AddressItem> list;
        String strLJIIIIZZ;
        Address address;
        if (candInputData != null && (address = candInputData.address) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(address.latitude);
            sbLIZ.append(',');
            sbLIZ.append(address.longitude);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            str = "with_address_authorization";
        } else {
            str = "without_address_authorization";
        }
        linkedHashMap.put("module_type", str);
        if (strLIZIZ != null) {
            linkedHashMap.put("latitude_longitude", strLIZIZ);
        }
        if (candInputData != null) {
            Address address2 = candInputData.address;
            if (address2 != null && (list = address2.items) != null && (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(list)) != null) {
                linkedHashMap.put("sug_address_detail", strLJIIIIZZ);
            }
            String str2 = candInputData.daInfo;
            if (str2 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str2)) != null) {
                linkedHashMap.putAll(mapLJIIJ);
            }
            String str3 = candInputData.LIZ;
            if (str3 != null) {
                linkedHashMap.put("log_id", str3);
            }
        }
        return linkedHashMap;
    }

    public static Map LJFF(CandInputData candInputData, boolean z) {
        String str;
        int i;
        String str2;
        HashMap<String, Object> mapLJIIJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            str = "with_address_authorization";
        } else {
            str = "without_address_authorization";
        }
        linkedHashMap.put("module_type", str);
        if (z) {
            if (C1745180vW0.LJ()) {
                i = 1;
            } else {
                i = 2;
            }
        } else {
            i = 0;
        }
        linkedHashMap.put("gps_accuracy_level", Integer.valueOf(i));
        if (candInputData != null && (str2 = candInputData.daInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str2)) != null) {
            linkedHashMap.putAll(mapLJIIJ);
        }
        return linkedHashMap;
    }

    public static void LJI(C1746460vY4 c1746460vY4, String str) {
        c1746460vY4.getClass();
        if (str != null) {
            LIZJ.add(str);
        }
    }

    public static void LJII(C1746460vY4 c1746460vY4, String str) {
        c1746460vY4.getClass();
        if (str != null) {
            LIZIZ.add(str);
            LIZJ.add(str);
        }
    }

    public static C1747000vYw LIZ(Address address, String str, Map map) {
        String strLIZIZ = null;
        C1747000vYw c1747000vYw = new C1747000vYw(null, 63);
        if (Intrinsics.LJFF(str, "latitude_longitude") || Intrinsics.LJFF(str, "map_pin")) {
            if (address != null && address.latitude != null && address.longitude != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(address.latitude);
                sbLIZ.append(',');
                sbLIZ.append(address.longitude);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            c1747000vYw.LIZIZ = strLIZIZ;
            c1747000vYw.LIZJ = map;
            c1747000vYw.LIZLLL = C1746680vYQ.LIZ(address);
        }
        c1747000vYw.LJFF = str;
        return c1747000vYw;
    }

    public static void LJIIIIZZ(Address address, List list, InterfaceC1631620sYq interfaceC1631620sYq) {
        Integer num;
        List list2;
        if (address == null) {
            return;
        }
        AwS392S0200000_26 awS392S0200000_26 = new AwS392S0200000_26(address, (Address) interfaceC1631620sYq, (InterfaceC1631620sYq<? super String, Object, Object, Unit>) 93);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C1745680vWo c1745680vWo = (C1745680vWo) it2.next();
                Object obj = c1745680vWo.LIZIZ;
                Integer num2 = c1745680vWo.LIZ.type;
                if ((num2 != null && num2.intValue() == -100) || ((num = c1745680vWo.LIZ.type) != null && num.intValue() == -101)) {
                    if ((obj instanceof List) && (list2 = (List) obj) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list2) {
                            if (obj2 instanceof C1745680vWo) {
                                arrayList.add(obj2);
                            }
                        }
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            awS392S0200000_26.invoke(C1745680vWo.LIZ((C1745680vWo) it3.next(), null, null, false, null, null, null, 16383));
                        }
                    }
                } else {
                    awS392S0200000_26.invoke(C1745680vWo.LIZ(c1745680vWo, null, null, false, null, null, null, 16383));
                }
            }
        }
    }

    public static void LJIIIZ(String str, Object obj, C1747000vYw c1747000vYw, boolean z) {
        if (str != null && obj != null) {
            HashMap<String, C1747000vYw> map = LIZLLL;
            C1747000vYw c1747000vYw2 = map.get(str);
            if (z) {
                C1747000vYw c1747000vYw3 = c1747000vYw2;
                if (c1747000vYw3 != null) {
                    c1747000vYw3.LJ = null;
                }
                c1747000vYw2 = new C1747000vYw(c1747000vYw3, 47);
            } else if (c1747000vYw2 == null) {
                c1747000vYw2 = new C1747000vYw(null, 63);
            }
            if (c1747000vYw != null) {
                C1747000vYw c1747000vYw4 = c1747000vYw2;
                c1747000vYw4.LIZIZ = c1747000vYw.LIZIZ;
                c1747000vYw4.LIZJ = c1747000vYw.LIZJ;
                c1747000vYw4.LIZLLL = c1747000vYw.LIZLLL;
                c1747000vYw4.LJFF = c1747000vYw.LJFF;
            }
            map.put(str, c1747000vYw2);
            if (LJ.contains(str)) {
                c1747000vYw2.LIZ = null;
            } else {
                c1747000vYw2.LIZ = obj;
            }
        }
    }
}
