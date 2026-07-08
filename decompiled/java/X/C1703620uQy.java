package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0uQy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1703620uQy implements InterfaceC1703600uQw {
    public static final C1703620uQy LIZ = new C1703620uQy();

    @Override // X.InterfaceC1703600uQw
    public final void LIZ(C1703630uQz c1703630uQz) {
        String str;
        int i = C1703610uQx.LIZ[c1703630uQz.LIZIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str = "tm_heartbeat_stay_duration_v2";
            } else {
                throw new C1954807lC();
            }
        } else {
            str = "tm_heartbeat_stay_duration";
        }
        HashMap map = new HashMap(c1703630uQz.LIZ.LJI);
        map.put("stay_duration", Long.valueOf(c1703630uQz.LIZJ));
        map.put("time_window", Integer.valueOf(c1703630uQz.LIZLLL));
        map.put("game_name", c1703630uQz.LIZ.LIZIZ);
        C08S3.LIZLLL(str, map, null, null);
    }
}
