package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0qIM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544520qIM {
    public static void LIZIZ(Object obj, String str) {
        C1543850qHH.LJIILL.put(str, obj);
    }

    public static void LIZ(String str, String str2, JSONArray jSONArray) {
        ArrayList<C1544540qIO> arrayList = new ArrayList<>();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            C1544540qIO c1544540qIO = new C1544540qIO();
            c1544540qIO.LIZIZ = JSONObjectProtectorUtils.getString(jSONArray.optJSONObject(i), "package_version");
            c1544540qIO.LIZ = JSONObjectProtectorUtils.getString(jSONArray.optJSONObject(i), "channel");
            arrayList.add(c1544540qIO);
        }
        ConcurrentHashMap<String, C1544530qIN> concurrentHashMap = C1543850qHH.LJIILJJIL;
        C1544530qIN c1544530qIN = new C1544530qIN();
        c1544530qIN.LIZ = str2;
        c1544530qIN.LIZIZ = arrayList;
        concurrentHashMap.put(str, c1544530qIN);
    }
}
