package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;

/* JADX INFO: renamed from: X.0aCP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925790aCP {
    public static boolean LIZ() {
        if (C930540aK4.LIZJ()) {
            return LiveAbLabelSetting.INSTANCE.getBooleanValue("multi_guest_enable_guest_invite_friend");
        }
        Boolean boolLIZLLL = C931820aM8.LIZLLL("multi_guest_enable_guest_invite_friend");
        if (boolLIZLLL != null) {
            return boolLIZLLL.booleanValue();
        }
        return false;
    }
}
