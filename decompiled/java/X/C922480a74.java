package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.api.MultiGuestDismissManagerListDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.voiceonly.ui.MultiGuestCameraOffTipPanel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0a74, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C922480a74 {
    public static void LIZ(DataChannel dataChannel, Long l) {
        String strValueOf;
        if (C927560aFG.LIZIZ()) {
            Integer numValueOf = null;
            if (l != null) {
                MultiGuestDataHolder multiGuestDataHolderLJJIFFI = PlaybookUtilKt.LJJIFFI();
                if (multiGuestDataHolderLJJIFFI != null && multiGuestDataHolderLJJIFFI.LJJIFFI >= 1) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("not need to show tip, ");
                    MultiGuestDataHolder multiGuestDataHolderLJJIFFI2 = PlaybookUtilKt.LJJIFFI();
                    if (multiGuestDataHolderLJJIFFI2 != null) {
                        numValueOf = Integer.valueOf(multiGuestDataHolderLJJIFFI2.LJJIFFI);
                    }
                    sbLIZ.append(numValueOf);
                    C20441214yg.LIZIZ("MultiGuestAnchorVRDownGradeStrategy", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                C930480aJy.LIZ.getClass();
                sbLIZ2.append(C930480aJy.LJIIIZ());
                sbLIZ2.append(l);
                sbLIZ2.append("_m");
                strValueOf = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                C930480aJy.LIZ.getClass();
                strValueOf = String.valueOf(C930480aJy.LJIIIZ());
            }
            C20337914i1<HashSet<String>> c20337914i1 = InterfaceC934710aQn.Gb;
            HashSet<String> hashSetLIZIZ = c20337914i1.LIZIZ();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("call cameraOffHasShowed, kv = ");
            sbLIZ3.append(hashSetLIZIZ);
            C20441214yg.LIZIZ("MultiGuestAnchorVRDownGradeStrategy", C2188811AlT.LIZIZ(sbLIZ3));
            if (hashSetLIZIZ.contains(strValueOf)) {
                return;
            }
            strValueOf.toString();
            hashSetLIZIZ.add(strValueOf);
            c20337914i1.LJFF(hashSetLIZIZ);
            if (dataChannel == null) {
                return;
            }
            dataChannel.FQ2(MultiGuestDismissManagerListDialogEvent.class);
            FragmentManager fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
            if (fragmentManager == null) {
                return;
            }
            SheetOptions sheetOptions = new SheetOptions();
            sheetOptions.LIZ(0, null);
            sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
            C19322110iZ.LIZLLL(fragmentManager, MultiGuestCameraOffTipPanel.class, "multi_guest_camera_off_tip_sheet", sheetOptions, null);
        }
    }
}
