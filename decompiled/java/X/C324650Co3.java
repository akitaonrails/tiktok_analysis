package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Co3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C324650Co3 {
    public static final InterfaceC324640Co2 LIZ = (InterfaceC324640Co2) C09S2.LIZJ(InterfaceC324640Co2.class, C0CQT.LIZJ);

    public static String LIZ(Aweme aweme, String str, String str2) {
        String mid;
        HashMap map = new HashMap();
        map.put("dislike_reason_id", str);
        if (aweme.getMusic() != null) {
            mid = aweme.getMusic().getMid();
        } else {
            mid = "";
        }
        map.put("music_id", mid);
        map.put("author_id", AwemeExtKt.getAuthorUid(aweme));
        if (!TextUtils.isEmpty(str2)) {
            map.put("commit_type", str2);
        }
        LIZ.LIZ(aweme.getAid(), aweme.getRequestId(), map).execute();
        return str;
    }
}
