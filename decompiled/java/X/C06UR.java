package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.06UR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06UR {
    public static final C06UR LIZ = new C06UR();
    public static String LIZIZ;

    public static int LIZ() {
        String uid = C10EU.LIZ().getUid();
        if (uid == null || uid.length() == 0) {
            return 9999;
        }
        Keva repo = Keva.getRepo("story_highlights_consume");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("last_others_consume_ts_");
        sbLIZ.append(uid);
        long j = repo.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
        if (j <= 0) {
            return 9999;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        return (int) ((jCurrentTimeMillis >= 0 ? jCurrentTimeMillis : 0L) / 86400000);
    }

    public static void LIZIZ() {
        String uid = C10EU.LIZ().getUid();
        if (uid == null || uid.length() == 0) {
            return;
        }
        Keva repo = Keva.getRepo("story_highlights_consume");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("last_others_consume_ts_");
        sbLIZ.append(uid);
        repo.storeLong(C2188811AlT.LIZIZ(sbLIZ), System.currentTimeMillis());
    }

    public static void LIZJ() {
        String uid = C10EU.LIZ().getUid();
        if (TextUtils.isEmpty(uid) || TextUtils.equals(LIZIZ, uid)) {
            return;
        }
        LIZIZ = uid;
        Keva.getRepo("story_highlights_consume").storeBoolean(String.valueOf(uid.hashCode()), true);
    }
}
