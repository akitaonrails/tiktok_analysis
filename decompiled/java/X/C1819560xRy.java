package X;

import android.os.Bundle;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.MultiGuestLiveSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.uikit.setting.LiveSheetMigrationMultiWatchLinkedMicSetting;

/* JADX INFO: renamed from: X.0xRy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1819560xRy {
    public static MultiGuestLiveSettingDialog LIZ(C1819560xRy c1819560xRy, String str, boolean z, boolean z2, int i) {
        boolean z3;
        boolean z4 = true;
        if ((i & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i & 4) == 0) {
            z4 = false;
        }
        if ((i & 8) != 0) {
            z = LiveSheetMigrationMultiWatchLinkedMicSetting.INSTANCE.enable(C781520UlC.LJFF(PlaybookUtilKt.LJJIII()));
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        c1819560xRy.getClass();
        MultiGuestLiveSettingDialog multiGuestLiveSettingDialog = new MultiGuestLiveSettingDialog();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("request_page", str, bundle);
        bundle.putBoolean("show_back_icon", z3);
        bundle.putBoolean("is_cancelable", z4);
        bundle.putBoolean("use_sheet", z);
        bundle.putBoolean("is_contain_ear_feedback", z2);
        multiGuestLiveSettingDialog.setArguments(bundle);
        return multiGuestLiveSettingDialog;
    }
}
