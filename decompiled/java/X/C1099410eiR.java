package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LoginGuideConfigSetting;
import com.bytedance.android.livesdk.model.LoginGuideConfig;

/* JADX INFO: renamed from: X.0eiR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1099410eiR {
    public static String LIZ() {
        LoginGuideConfig value = LoginGuideConfigSetting.INSTANCE.getValue();
        if (value == null) {
            return null;
        }
        return value.getImageUrlFromFollow();
    }

    public static String LIZIZ() {
        LoginGuideConfig value = LoginGuideConfigSetting.INSTANCE.getValue();
        return (value == null || TextUtils.isEmpty(value.getFromFollow())) ? C497740JfY.LJIJI(2131851928) : value.getFromFollow();
    }
}
