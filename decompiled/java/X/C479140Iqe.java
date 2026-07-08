package X;

import com.bytedance.android.livesdk.livesetting.linkmic.HangoutRoomFeedEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.HangoutTopliveNewUserGuideEnableSetting;
import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0Iqe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C479140Iqe {
    public static boolean LIZ() {
        return C479760Ire.LJIJI || LIZIZ();
    }

    public static boolean LIZIZ() {
        if (HangoutTopliveNewUserGuideEnableSetting.INSTANCE.enable() && HangoutRoomFeedEnableSetting.INSTANCE.isEnable()) {
            return !Keva.getRepo("top_live_tab").getBoolean("hangout_new_user_guide_shown", false);
        }
        return false;
    }
}
