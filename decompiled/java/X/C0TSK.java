package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;

/* JADX INFO: renamed from: X.0TSK, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TSK {
    public static void LIZ(String str) {
        C844470XAv.LIZ.getClass();
        KevaImpl.getRepoFromSp(C844470XAv.LIZ(), "comment_sp", 0).erase(str);
    }

    public static boolean LIZIZ(String str) {
        Boolean bool = Boolean.FALSE;
        C844470XAv.LIZ.getClass();
        return KevaImpl.getRepoFromSp(C844470XAv.LIZ(), "comment_sp", 0).getBoolean(str, bool.booleanValue());
    }

    public static long LIZLLL(String str) {
        Long l = 0L;
        C844470XAv.LIZ.getClass();
        return KevaImpl.getRepoFromSp(C844470XAv.LIZ(), "comment_sp", 0).getLong(str, l.longValue());
    }

    public static String LJ(String str) {
        C844470XAv.LIZ.getClass();
        return KevaImpl.getRepoFromSp(C844470XAv.LIZ(), "comment_sp", 0).getString(str, "");
    }

    public static void LJFF(String str, Object obj) {
        C844470XAv.LIZ.getClass();
        Keva repoFromSp = KevaImpl.getRepoFromSp(C844470XAv.LIZ(), "comment_sp", 0);
        if (obj instanceof String) {
            repoFromSp.storeString(str, (String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            repoFromSp.storeBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Long) {
            repoFromSp.storeLong(str, ((Number) obj).longValue());
        } else if (obj instanceof Integer) {
            repoFromSp.storeInt(str, ((Number) obj).intValue());
        } else {
            repoFromSp.storeString(str, JsonParseUtils.LJ(obj));
        }
    }

    public static int LIZJ(int i, String str, Integer num) {
        String str2;
        int iIntValue = 0;
        if ((i & 2) != 0) {
            num = 0;
        }
        if ((i & 4) != 0) {
            str2 = "comment_sp";
        } else {
            str2 = null;
        }
        C844470XAv.LIZ.getClass();
        Keva repoFromSp = KevaImpl.getRepoFromSp(C844470XAv.LIZ(), str2, 0);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return repoFromSp.getInt(str, iIntValue);
    }
}
