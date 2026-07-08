package X;

import com.ss.android.ugc.aweme.im.service.service.QuickDMEventParam;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S1M, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S1M {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, QuickDMEventParam quickDMEventParam) {
        String text;
        C0I0B.LJFF.LIZIZ();
        HashMap map = new HashMap();
        map.put("enter_position", quickDMEventParam.enterPosition);
        map.put("enter_from", quickDMEventParam.enterFrom);
        map.put("group_id", quickDMEventParam.groupId);
        map.put("author_id", quickDMEventParam.authorId);
        map.put("follow_status", quickDMEventParam.followStatus);
        map.put("show_with_emoji", quickDMEventParam.isShowWithEmoji);
        if (Intrinsics.LJFF(str, "click_story_dm_input_box")) {
            map.put("enter_method", quickDMEventParam.enterMethod);
        }
        if (Intrinsics.LJFF(str, "close_story_dm_float_page")) {
            C0S1J c0s1j = quickDMEventParam.showAction;
            if (c0s1j == null || (text = c0s1j.getText()) == null) {
                text = "click_input_box";
            }
            map.put("enter_method", text);
            map.put("exit_method", "click");
        }
        C20684815ws.LJIILLIIL(str, map);
    }
}
