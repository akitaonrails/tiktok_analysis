package X;

import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0mB8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386280mB8 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(SmartRoute smartRoute, Aweme aweme) {
        String str;
        String strLIZJ = C1212100heC.LIZJ(aweme, null);
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLIZJ, new String[]{","}, 0, 6);
        if (listLJJLIIIJILLIZJL == null || (str = (String) C13LP.LJJJLL(listLJJLIIIJILLIZJL)) == null || str.length() <= 0) {
            str = null;
        }
        smartRoute.withParam("prop_list", strLIZJ);
        smartRoute.withParam("prop_resource_list", C1212100heC.LJFF(aweme, null));
        if (str != null) {
            smartRoute.withParam("prop_resource_id", C1212100heC.LJ(aweme, str));
        }
    }
}
