package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Rkp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704850Rkp {
    public static final Map<Long, String> LIZ = C2097608Jq.LJIIJ(new Pair(1L, "Plain_Button"), new Pair(2L, "Tip_Card"), new Pair(101L, "Plain_Tag"), new Pair(102L, "Avatar_Tag"), new Pair(201L, "Plain_InfoBar"), new Pair(301L, "Cta_Anchor"), new Pair(401L, "Plain_Bottom_Tag"));

    public static final String LIZ(Long l) {
        if (l != null) {
            l.longValue();
            return (String) ((LinkedHashMap) LIZ).get(l);
        }
        return null;
    }
}
