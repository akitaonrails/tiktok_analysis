package X;

import android.app.Activity;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.experiments.DigitalWellbeingEntranceSettings;
import com.ss.android.ugc.aweme.compliance.protection.perception.PerceptionPopup;
import com.ss.android.ugc.aweme.compliance.protection.perception.UserPerceptionApiManager;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00xR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C247100xR {
    public static void LIZ() {
        UserPerceptionApiManager.LIZ.getClass();
        C632140Oqq.LIZLLL(UserPerceptionApiManager.LIZIZ.LIZ(), "tiktok/v1/user_perception/popup/", null).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0mXM
            @Override // X.C09JN
            public final void accept(Object obj) {
                List<PerceptionPopup> list;
                PerceptionPopup perceptionPopup;
                String str;
                C1C7U.LIZ("PerceptionPopupManager@7045.checkPerceptionPopup$1");
                UserPerceptionApiManager.UserPerceptionPopupResponse userPerceptionPopupResponse = (UserPerceptionApiManager.UserPerceptionPopupResponse) obj;
                if (userPerceptionPopupResponse != null && (list = userPerceptionPopupResponse.popupList) != null && (perceptionPopup = (PerceptionPopup) C13LP.LJJJLL(list)) != null && (str = perceptionPopup.popupUrl) != null) {
                    String strLIZ = DigitalWellbeingEntranceSettings.LIZ(str);
                    Activity validTopActivity = ActivityStack.getValidTopActivity();
                    if ((validTopActivity instanceof InterfaceC1603190roz) && Intrinsics.LJFF(C343710Ddh.LIZ((C19EG) validTopActivity).CQ2(), "HOME")) {
                        SmartRouter.buildRoute(validTopActivity, strLIZ).open();
                    }
                }
                C1C7U.LIZIZ("PerceptionPopupManager@7045.checkPerceptionPopup$1");
            }
        }, new C09JN() { // from class: X.00xS
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("PerceptionPopupManager@7045.checkPerceptionPopup$2");
                C1C7U.LIZIZ("PerceptionPopupManager@7045.checkPerceptionPopup$2");
            }
        });
    }
}
