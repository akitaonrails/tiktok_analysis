package X;

import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleConfigSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleItemConfig;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleSetting;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;

/* JADX INFO: renamed from: X.0at3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C952230at3 {
    public static LiveCapsuleStyleItemConfig LIZ() {
        int i = C1112330f3H.LJJIZ;
        return LiveCapsuleStyleConfigSetting.INSTANCE.getValue().capsuleStyleItemConfig;
    }

    public static boolean LIZJ() {
        int i = C1112330f3H.LJJIZ;
        return LiveCapsuleStyleSetting.INSTANCE.getValue() > 0;
    }

    public static boolean LIZIZ(C1112330f3H c1112330f3H) {
        int i = C1112330f3H.LJJIZ;
        if (LiveCapsuleStyleSetting.INSTANCE.getValue() == 0 && ((CapsuleMessage) c1112330f3H.LJIL).style > 0) {
            return true;
        }
        return false;
    }
}
