package X;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.level.FansClubPanelV2Settings;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Map;

/* JADX INFO: renamed from: X.0eby, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1095400eby {
    public static final C1095400eby LIZ = new C1095400eby();

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(Context context, DataChannel dataChannel, int i, Map map) {
        String str;
        FragmentManager fragmentManager;
        if (i == 16) {
            str = "back_pack_gift_panel";
        } else {
            str = "fans_club_gift";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://webcast_fans_club_guide?enter_from=");
        sbLIZ.append(str);
        Uri uri = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ));
        if (context != null) {
            C1126800fQc.LIZ.Wy0();
            if (C1143980fsK.LJII(context, uri)) {
                return;
            }
        }
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            Fragment fragmentQn0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Qn0(str);
            if (FansClubPanelV2Settings.INSTANCE.isLynxFansClubJoinDialogEnable()) {
                if (context != null) {
                    ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).VN2(context, new C1094590eaf("fans_club_gift", false, false, null, i, null, null, null, null, 480));
                    return;
                }
                return;
            }
            if (!(fragmentQn0 instanceof InterfaceC1095170ebb) || fragmentQn0.isAdded()) {
                return;
            }
            if (fragmentQn0 instanceof LiveDialogFragment) {
                LiveDialogFragment liveDialogFragment = (LiveDialogFragment) fragmentQn0;
                if (!liveDialogFragment.isShowing()) {
                    InterfaceC1095170ebb interfaceC1095170ebb = (InterfaceC1095170ebb) fragmentQn0;
                    interfaceC1095170ebb.LP(i);
                    interfaceC1095170ebb.Rv(map);
                    liveDialogFragment.showNow(fragmentManager, "fans_dialog");
                    return;
                }
            }
            if (!(fragmentQn0 instanceof LiveSheetFragment)) {
                return;
            }
            InterfaceC1095170ebb interfaceC1095170ebb2 = (InterfaceC1095170ebb) fragmentQn0;
            interfaceC1095170ebb2.LP(i);
            interfaceC1095170ebb2.Rv(map);
            C19322110iZ.LJFF(fragmentManager, (InterfaceC20484815Dq) fragmentQn0, "fans_dialog", null, 0);
        }
    }
}
