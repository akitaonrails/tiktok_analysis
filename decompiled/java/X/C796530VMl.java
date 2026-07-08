package X;

import java.util.HashMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.0VMl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C796530VMl {
    public final HashMap<Integer, TreeMap<Integer, AbstractC796510VMj>> LIZ = new HashMap<>();

    public final void LIZ(AbstractC796510VMj... abstractC796510VMjArr) {
        for (AbstractC796510VMj abstractC796510VMj : abstractC796510VMjArr) {
            int i = abstractC796510VMj.startVersion;
            int i2 = abstractC796510VMj.endVersion;
            TreeMap<Integer, AbstractC796510VMj> treeMap = this.LIZ.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.LIZ.put(Integer.valueOf(i), treeMap);
            }
            treeMap.get(Integer.valueOf(i2));
            treeMap.put(Integer.valueOf(i2), abstractC796510VMj);
        }
    }
}
