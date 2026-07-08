package X;

import java.util.Map;

/* JADX INFO: renamed from: X.00cG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C115800cG {
    public static final int LIZ(int i, String str, Map map) {
        Integer numLJIIJJI;
        Object obj = map.get(str);
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (!(obj instanceof String) || (numLJIIJJI = C2095008Iq.LJIIJJI((String) obj)) == null) {
            return i;
        }
        return numLJIIJJI.intValue();
    }
}
