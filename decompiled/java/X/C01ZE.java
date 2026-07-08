package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.01ZE, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01ZE {
    public static boolean LIZ() {
        if (C930540aK4.LJIJJ(UserService.getInstance().user().LJIJJLI())) {
            return LiveAbLabelSetting.INSTANCE.getIntValue("multi_guest_fan_ticket_component_optimization") == 1;
        }
        Integer numLJ = C931820aM8.LJ("multi_guest_fan_ticket_component_optimization");
        return numLJ != null && numLJ.intValue() == 1;
    }
}
