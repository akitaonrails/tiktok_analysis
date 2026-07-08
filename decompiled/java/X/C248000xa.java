package X;

import java.util.Map;

/* JADX INFO: renamed from: X.00xa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C248000xa {
    public static final void LIZ(int i, String str, String str2, Map map) {
        map.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        map.put("session_id", str);
        map.put("manager_id", str2);
        map.put("type", "manual");
        C1CC2.LJII(i, C0KQH.LIZ("ttlive_speed_detection_full_chain_service"), map);
    }
}
