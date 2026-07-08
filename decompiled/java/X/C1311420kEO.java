package X;

import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0kEO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1311420kEO {
    public final int LIZ;
    public final int LIZIZ;
    public final List<String> LIZJ;
    public final Map<String, List<Integer>> LIZLLL;
    public final ReadableMap LJ;

    public static Map<Integer, C1311420kEO> LIZ(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map2 = readableArray.getMap(i);
            int i2 = map2.getInt(FollowStatusChangeMethod.PARAM_UID);
            int i3 = map2.getInt("type");
            ReadableArray array = map2.getArray("callbackNames");
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                for (int i4 = 0; i4 < array.size(); i4++) {
                    arrayList.add(array.getString(i4));
                }
            }
            HashMap map3 = new HashMap();
            ReadableMap map4 = map2.getMap("relationMap");
            if (map4 != null) {
                ReadableArray array2 = map4.getArray("simultaneous");
                if (array2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i5 = 0; i5 < array2.size(); i5++) {
                        arrayList2.add(Integer.valueOf(array2.getInt(i5)));
                    }
                    map3.put("simultaneous", arrayList2);
                }
                ReadableArray array3 = map4.getArray("waitFor");
                if (array3 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (int i6 = 0; i6 < array3.size(); i6++) {
                        arrayList3.add(Integer.valueOf(array3.getInt(i6)));
                    }
                    map3.put("waitFor", arrayList3);
                }
                ReadableArray array4 = map4.getArray("continueWith");
                if (array4 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (int i7 = 0; i7 < array4.size(); i7++) {
                        arrayList4.add(Integer.valueOf(array4.getInt(i7)));
                    }
                    map3.put("continueWith", arrayList4);
                }
            }
            map.put(Integer.valueOf(i2), new C1311420kEO(i2, i3, arrayList, map3, map2.getMap("configMap")));
        }
        return map;
    }

    public C1311420kEO(int i, int i2, List<String> list, Map<String, List<Integer>> map, ReadableMap readableMap) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = new ArrayList(list);
        this.LIZLLL = new HashMap(map);
        this.LJ = readableMap;
    }
}
