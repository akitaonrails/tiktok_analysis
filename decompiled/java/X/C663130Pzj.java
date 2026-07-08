package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Pzj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C663130Pzj {
    public static final HashMap<String, String> LIZ = new HashMap<>();

    public static void LIZ(Aweme aweme) {
        String aid;
        if (aweme != null && (aid = aweme.getAid()) != null && aid.length() > 0) {
            LIZ.remove(aid);
        }
    }
}
