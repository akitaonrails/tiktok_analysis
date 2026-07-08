package X;

import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.browser.IHybridStorageService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAboutMeMergeSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Jf2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497420Jf2 {
    public static void LIZ(C19EG c19eg, boolean z, boolean z2) {
        String strUrlUpgradePopup;
        String str;
        if (Intrinsics.LJFF(((IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class)).Pp2(c19eg, "aboutme-upgrade-show", null), "1")) {
            if (z2) {
                strUrlUpgradePopup = LiveAboutMeMergeSetting.urlPopupLiveSheet();
            } else {
                strUrlUpgradePopup = LiveAboutMeMergeSetting.urlPopup();
            }
        } else if (z2) {
            strUrlUpgradePopup = LiveAboutMeMergeSetting.urlUpgradePopupLiveSheet();
        } else {
            strUrlUpgradePopup = LiveAboutMeMergeSetting.urlUpgradePopup();
        }
        C495520Jby c495520Jby = new C495520Jby(strUrlUpgradePopup);
        if (z) {
            str = "live_take_page";
        } else {
            str = "live_take_detail";
        }
        c495520Jby.LIZJ("enter_from", str);
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(c19eg, UriProtector.parse(c495520Jby.LIZLLL()));
    }
}
