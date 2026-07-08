package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0T0Y, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T0Y {
    public static final HashMap<String, Boolean> LIZ = new HashMap<>();
    public static final HashMap<String, Boolean> LIZIZ = new HashMap<>();

    public static String LIZ(Aweme aweme) {
        String aid;
        if (aweme == null) {
            return null;
        }
        if (C729510SjV.LJJ(aweme)) {
            aid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            aid = aweme.getAid();
        }
        if (aid == null) {
            return null;
        }
        return aid;
    }

    public static boolean LIZIZ(Aweme aweme) {
        Boolean bool;
        String strLIZ = LIZ(aweme);
        if (strLIZ == null || (bool = LIZ.get(strLIZ)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static void LIZJ(Aweme aweme, boolean z) {
        String strLIZ = LIZ(aweme);
        if (strLIZ == null) {
            return;
        }
        LIZIZ.put(strLIZ, Boolean.valueOf(z));
    }
}
