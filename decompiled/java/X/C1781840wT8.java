package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0wT8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781840wT8 {
    public final HashMap<Object, HashMap<String, float[]>> LIZ = new HashMap<>();

    public final float LIZ(Object obj, String str) {
        if (!this.LIZ.containsKey(obj)) {
            return Float.NaN;
        }
        HashMap<String, float[]> map = this.LIZ.get(obj);
        if (!map.containsKey(str)) {
            return Float.NaN;
        }
        float[] fArr = map.get(str);
        if (fArr.length <= 0) {
            return Float.NaN;
        }
        return fArr[0];
    }
}
