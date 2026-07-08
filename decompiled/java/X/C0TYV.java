package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.adminsetting.LiveAdminSettingDialog;

/* JADX INFO: renamed from: X.0TYV, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TYV {
    public static LiveAdminSettingDialog LIZ(EnumC748580TYa enumC748580TYa, String str, boolean z) {
        LiveAdminSettingDialog liveAdminSettingDialog = new LiveAdminSettingDialog();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "argument_initial_page", enumC748580TYa);
        C786410Ut5.LJJIZ(bundle, "argument_dim", Boolean.valueOf(z));
        if (str != null) {
            C786410Ut5.LJJJI("argument_entrance", str, bundle);
        }
        liveAdminSettingDialog.setArguments(bundle);
        return liveAdminSettingDialog;
    }
}
