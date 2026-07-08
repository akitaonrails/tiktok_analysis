package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.tiktok.myna.render.render.MynaElement;
import com.tiktok.myna.render.render.bindinfo.MynaBindForConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.18di, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21330418di {
    public static final Map<String, Object> LIZJ(Map<String, ? extends Object> map, MynaBindForConfig mynaBindForConfig, C21330518dj c21330518dj) {
        if (c21330518dj == null) {
            C1325860kbg.LIZIZ(null, AFwS223S0000000_32.get$arr$(224), C2097608Jq.LJ());
            return map;
        }
        HashMap map2 = new HashMap((int) (((map.size() + 2) / 0.75f) + 1.0f));
        map2.putAll(map);
        map2.put(mynaBindForConfig.indexKey, Integer.valueOf(c21330518dj.LIZ));
        map2.put(mynaBindForConfig.itemKey, c21330518dj.LIZIZ);
        return map2;
    }

    public static final List<MynaElement> LIZIZ(List<MynaElement> list, C21325918cz c21325918cz, Map<String, ? extends Object> map, boolean z) {
        MynaBindForConfig mynaBindForConfig;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                MynaElement mynaElement = (MynaElement) ListProtector.get(list, i);
                C21329618da c21329618da = mynaElement.bindInfo;
                if (c21329618da != null && (mynaBindForConfig = c21329618da.LJ) != null) {
                    arrayList.addAll(LIZ(mynaElement, c21325918cz, mynaBindForConfig, map, z));
                } else {
                    arrayList.add(mynaElement);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.tiktok.myna.render.render.MynaElement> LIZ(com.tiktok.myna.render.render.MynaElement r15, X.C21325918cz r16, com.tiktok.myna.render.render.bindinfo.MynaBindForConfig r17, java.util.Map<java.lang.String, ? extends java.lang.Object> r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21330418di.LIZ(com.tiktok.myna.render.render.MynaElement, X.18cz, com.tiktok.myna.render.render.bindinfo.MynaBindForConfig, java.util.Map, boolean):java.util.List");
    }
}
