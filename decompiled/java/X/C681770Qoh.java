package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;

/* JADX INFO: renamed from: X.0Qoh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C681770Qoh {
    public static void LIZ(Object obj, String str) {
        C844470XAv.LIZ.getClass();
        Keva repoFromSp = KevaImpl.getRepoFromSp(C844470XAv.LIZ(), "music_sp", 0);
        if (obj instanceof String) {
            repoFromSp.storeString(str, (String) obj);
        } else if (obj instanceof Boolean) {
            repoFromSp.storeBoolean(str, ((Boolean) obj).booleanValue());
        } else {
            repoFromSp.storeString(str, JsonParseUtils.LJ(obj));
        }
    }
}
