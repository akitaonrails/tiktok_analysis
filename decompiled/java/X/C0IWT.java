package X;

import com.bytedance.android.livesdkapi.depend.share.ShareFromInfo;
import java.util.Map;

/* JADX INFO: renamed from: X.0IWT, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IWT {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Map map, ShareFromInfo shareFromInfo) {
        if (shareFromInfo != null) {
            String str = shareFromInfo.shareFromUserId;
            if (str != null && str.length() > 0) {
                map.put("share_from_user_id", str);
            }
            String str2 = shareFromInfo.traceId;
            if (str2 != null && str2.length() > 0) {
                map.put("from_unique_share_id", str2);
            }
        }
    }
}
