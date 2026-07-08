package X;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: renamed from: X.08u9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2265108u9 {
    public static final SparseArray<HashMap<String, Object>> LIZ = new SparseArray<>();

    public static void LIZIZ() {
        HashMap<String, Object> map = LIZ.get(1);
        if (map != null) {
            map.clear();
        }
    }

    public static void LIZJ() {
        HashMap<String, Object> map = LIZ.get(1);
        if (map != null) {
            map.remove("extracting_frame");
        }
    }

    public static void LIZ(Object obj, String str) {
        SparseArray<HashMap<String, Object>> sparseArray = LIZ;
        if (sparseArray.get(1) == null) {
            sparseArray.put(1, new HashMap<>());
        }
        sparseArray.get(1).put(str, obj);
    }
}
