package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0Oln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C629010Oln {
    public static final void LIZ(C628830OlV c628830OlV, String str) {
        Map<String, C628830OlV> map;
        C628830OlV c628830OlV2 = c628830OlV.LLJILJIL.get(str);
        if (c628830OlV2 == null || (map = c628830OlV2.LLJILJIL) == null || map.isEmpty()) {
            c628830OlV.LLJILJIL.remove(str);
        }
    }
}
