package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.07lz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1959707lz {
    public static final Keva LIZ = Keva.getRepo("search_suggestion_keva_storage");

    static {
        C1959707lz.class.toString();
    }

    public static boolean LIZ(Aweme aweme, String str) {
        if (TextUtils.isEmpty(aweme.getAid()) || TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(aweme.getAid());
        return LIZ.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }
}
