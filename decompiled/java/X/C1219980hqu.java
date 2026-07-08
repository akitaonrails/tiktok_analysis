package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0hqu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1219980hqu {
    public static final C1219980hqu LIZ = new C1219980hqu();

    public static void LIZ(int i, String str, String str2, String str3) {
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i));
        if (str == null) {
            str = "";
        }
        pairArr[1] = new Pair("enter_from", str);
        pairArr[2] = new Pair("story_type", str2);
        if (str3 == null) {
            str3 = "";
        }
        pairArr[3] = new Pair("enter_position", str3);
        C20684815ws.LJIILLIIL("click_cancel_upload_result", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
