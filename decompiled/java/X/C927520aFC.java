package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;

/* JADX INFO: renamed from: X.0aFC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C927520aFC {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        C924810aAp c924810aApLJ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        Boolean boolLIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        MultiGuestDataHolder multiGuestDataHolderLJJIFFI = PlaybookUtilKt.LJJIFFI();
        if ((multiGuestDataHolderLJJIFFI == null || (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLJJIFFI.LIZIZ()) == null || (boolLIZ = LIZ(Integer.valueOf(multiLiveAnchorPanelSettingsLIZIZ.disableVideoLinkmic))) == null) && ((c924810aApLJ = C924810aAp.LJ()) == null || (multiLiveAnchorPanelSettings = c924810aApLJ.LJJIII) == null || (boolLIZ = LIZ(Integer.valueOf(multiLiveAnchorPanelSettings.disableVideoLinkmic))) == null)) {
            return false;
        }
        return boolLIZ.booleanValue();
    }

    public static Boolean LIZ(Integer num) {
        if (num != null && num.intValue() != 0) {
            boolean z = true;
            if (num.intValue() != 3 && num.intValue() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return null;
    }

    public static Boolean LIZJ(Integer num) {
        boolean z;
        if (num != null && num.intValue() != 0) {
            if (num.intValue() == 3) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return null;
    }
}
