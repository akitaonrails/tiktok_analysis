package X;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0OTv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C620090OTv {
    public static final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();

    public static void LIZ() {
        List<String> list = C0OUA.LIZ.lynxShortLinkList;
        if (list != null) {
            for (String str : list) {
                if (str != null) {
                    LIZ.put(str, C1545590qK5.LIZIZ.LIZIZ(str, C2097608Jq.LJ()));
                }
            }
        }
    }
}
