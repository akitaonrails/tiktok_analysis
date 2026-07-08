package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenModel;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0LIw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C540800LIw {
    public static final C540800LIw LIZ = new C540800LIw();

    public static Bundle LIZ(String str, int i, boolean z, int i2, String str2, String str3, AIChatGenModel aIChatGenModel) {
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
        CreativeInfo creativeInfo = new CreativeInfo(str, 0, null, 6, null);
        shortVideoContext.cameraComponentModel.mWorkspace = C14D2.LIZ(creativeInfo);
        shortVideoContext.creativeInfo = creativeInfo;
        shortVideoContext.shootWay = str2;
        shortVideoContext.enterMethod = str3;
        shortVideoContext.creativeModel.aiChatGenModel = aIChatGenModel;
        Bundle bundle = new Bundle();
        C537520L6g.LJFF(bundle, creativeInfo);
        C786410Ut5.LJJIJL(bundle, "key_short_video_context", shortVideoContext);
        bundle.putInt("key_photo_select_max_count", i);
        int i3 = 1;
        bundle.putInt("key_photo_select_min_count", 1);
        bundle.putInt("key_video_select_max_count", i);
        bundle.putInt("key_video_select_min_count", 1);
        bundle.putInt("key_set_column_count", 3);
        if (!z) {
            C786410Ut5.LJJJI("key_mv_hint_text", C21291518Tx.LJ(EnumC21291418Tw.ALBUM_HINT_TEXT_MULTI, new Object[0]), bundle);
            i3 = 2;
        }
        bundle.putInt("key_support_flag", i3);
        bundle.putLong("invoke_uploadpage_time", System.currentTimeMillis());
        bundle.putBoolean("Key_enable_single_select_mode", z);
        C786410Ut5.LJJIIZI(bundle, new Bundle(), "key_pass_through_extra_info");
        bundle.putInt("key_choose_scene", i2);
        bundle.putInt("key_choose_request_code", 1028);
        return bundle;
    }
}
