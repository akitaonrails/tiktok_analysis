package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.MultGuestDowngradeDisableAavatarSetting;

/* JADX INFO: renamed from: X.0aFG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C927560aFG {
    public static boolean LIZ() {
        return (LIZIZ() && MultGuestDowngradeDisableAavatarSetting.INSTANCE.enable()) ? false : true;
    }

    public static boolean LIZIZ() {
        C924810aAp c924810aApLJ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        Boolean boolLIZJ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        MultiGuestDataHolder multiGuestDataHolderLJJIFFI = PlaybookUtilKt.LJJIFFI();
        if ((multiGuestDataHolderLJJIFFI == null || (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLJJIFFI.LIZIZ()) == null || (boolLIZJ = C927520aFC.LIZJ(Integer.valueOf(multiLiveAnchorPanelSettingsLIZIZ.disableVideoLinkmic))) == null) && ((c924810aApLJ = C924810aAp.LJ()) == null || (multiLiveAnchorPanelSettings = c924810aApLJ.LJJIII) == null || (boolLIZJ = C927520aFC.LIZJ(Integer.valueOf(multiLiveAnchorPanelSettings.disableVideoLinkmic))) == null)) {
            return false;
        }
        return boolLIZJ.booleanValue();
    }

    public static boolean LIZJ() {
        MultiGuestDataHolder multiGuestDataHolderLJJIFFI;
        return LIZIZ() && (multiGuestDataHolderLJJIFFI = PlaybookUtilKt.LJJIFFI()) != null && multiGuestDataHolderLJJIFFI.LJJIFFI >= 1;
    }
}
