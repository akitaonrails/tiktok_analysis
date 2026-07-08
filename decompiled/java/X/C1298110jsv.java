package X;

import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0jsv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1298110jsv extends C1289960jfm {
    public final void LJ(JavaOnlyArray javaOnlyArray) {
        if (javaOnlyArray == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < javaOnlyArray.size(); i++) {
            JavaOnlyMap map = javaOnlyArray.getMap(i);
            if (map != null && !map.isEmpty()) {
                arrayList.add(map);
            }
        }
        LIZIZ(arrayList, "attachedCells");
    }

    public C1298110jsv(int i, String str) {
        super(i, str);
    }
}
