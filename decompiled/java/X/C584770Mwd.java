package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Mwd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C584770Mwd {
    public static final HashMap<String, Boolean> LIZ = new HashMap<>();

    public static boolean LIZ(Aweme aweme) {
        String aid;
        Boolean bool;
        if (aweme == null) {
            return false;
        }
        if (C729510SjV.LJJ(aweme)) {
            aid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            aid = aweme.getAid();
        }
        if (aid == null || (bool = LIZ.get(aid)) == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
