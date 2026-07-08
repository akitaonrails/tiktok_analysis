package X;

import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14Cm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20227014Cm {
    public static final Set<String> LIZ = C13LQ.LJLIIL(new String[]{"click_visual_search_ask_tab", "click_visual_search_ask_button", "click_visual_search_info_card"});

    public static boolean LIZ(TakoEnterParams takoEnterParams) {
        if (takoEnterParams == null || !Intrinsics.LJFF(takoEnterParams.enterFrom, "visual_search_tikbot") || !LIZ.contains(takoEnterParams.enterMethod)) {
            return false;
        }
        return true;
    }
}
