package X;

import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0kI4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313700kI4 {
    public final WeakReference<AbstractC1313520kHm> LIZ;
    public C1313710kI5[] LIZIZ;
    public HashMap<String, C1313530kHn> LIZJ = new HashMap<>();

    public C1313700kI4(AbstractC1313520kHm abstractC1313520kHm) {
        this.LIZ = new WeakReference<>(abstractC1313520kHm);
    }

    public final void LIZ(Object obj, String str) {
        HashMap<String, C1313530kHn> map = this.LIZJ;
        if (map == null) {
            return;
        }
        for (C1313530kHn c1313530kHn : map.values()) {
            if (c1313530kHn.LIZLLL.containsKey(str)) {
                c1313530kHn.LIZLLL.put(str, obj);
            }
            if (str.equals("BackgroundColor") && c1313530kHn.LIZLLL.containsKey("Color")) {
                c1313530kHn.LIZLLL.put("Color", obj);
            }
        }
    }
}
