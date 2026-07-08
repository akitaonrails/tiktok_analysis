package X;

import com.bytedance.android.livesdk.model.message.DispersionInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.hotroom.HotRoomInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0NdX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C598410NdX {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(42));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(41));

    public static Map LIZLLL() {
        return (Map) LIZ.getValue();
    }

    public static String LIZ(String str) {
        return a0.LJJJJZ("/", LJ(str, "aweme/v1/oec/content/creator/live/pin_card"));
    }

    public static HotRoomInfo LIZJ(String str) {
        if (str != null) {
            return (HotRoomInfo) LIZLLL().get(str);
        }
        return null;
    }

    public static String LJFF(String str) {
        return a0.LJJJJZ("/", LJ(str, "/aweme/v1/oec/live/product/pop"));
    }

    public static DispersionInfo LIZIZ(int i, String str) {
        DispersionInfo dispersionInfo;
        Map map = (Map) ((Map) LIZIZ.getValue()).get(str);
        if (map != null) {
            dispersionInfo = (DispersionInfo) map.remove(Integer.valueOf(i));
        } else {
            dispersionInfo = null;
        }
        C598360NdS.LIZIZ(i, str);
        return dispersionInfo;
    }

    public static String LJ(String str, String str2) {
        HotRoomInfo hotRoomInfo;
        Map<String, String> map;
        HotRoomInfo hotRoomInfo2;
        String str3;
        if (LIZLLL().containsKey(str) && (hotRoomInfo = (HotRoomInfo) LIZLLL().get(str)) != null && (map = hotRoomInfo.pathMap) != null && map.containsKey(str2) && (hotRoomInfo2 = (HotRoomInfo) LIZLLL().get(str)) != null) {
            if (System.currentTimeMillis() - hotRoomInfo2.receiveTime <= hotRoomInfo2.expireAt) {
                Map<String, String> map2 = hotRoomInfo2.pathMap;
                if (map2 != null) {
                    str3 = map2.get(str2);
                }
            } else {
                str3 = str2;
            }
            if (str3 != null) {
                return str3;
            }
        }
        return str2;
    }

    public static void LJI(String str, List list) {
        if (list != null && !list.isEmpty()) {
            C01GW c01gw = LIZIZ;
            if (!((Map) c01gw.getValue()).containsKey(str)) {
                ((Map) c01gw.getValue()).put(str, new LinkedHashMap());
            }
            Map map = (Map) ((Map) c01gw.getValue()).get(str);
            if (map != null) {
                Set setKeySet = map.keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : setKeySet) {
                    int iIntValue = ((Number) obj).intValue();
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((DispersionInfo) it2.next()).dispersionPath == iIntValue) {
                                    arrayList.add(obj);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    C598360NdS.LIZIZ(((Number) it3.next()).intValue(), str);
                }
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    DispersionInfo dispersionInfo = (DispersionInfo) it4.next();
                    map.put(Integer.valueOf(dispersionInfo.dispersionPath), dispersionInfo);
                }
            }
        }
    }
}
