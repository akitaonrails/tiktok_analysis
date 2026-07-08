package X;

import java.util.Map;

/* JADX INFO: renamed from: X.15V6, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15V6 {
    public static final int LIZ(Map<String, String> map) {
        Integer numLJIIJJI;
        String str = map.get("card_index");
        if (str != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
            return numLJIIJJI.intValue();
        }
        return -1;
    }

    public static final String LIZIZ(Map<String, String> map) {
        String str = map.get("card_position");
        if (str == null) {
            return "";
        }
        return str;
    }
}
