package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.broadcast.preview.nopermission.PreviewNoPermissionFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.sheet.intro.TuxPanel;
import kotlin.jvm.internal.AwS123S1200000_7;
import webcast.api.room.EntranceConditionsPopup;

/* JADX INFO: renamed from: X.0Jj3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C499910Jj3 {
    public static TuxPanel LIZ;

    public static void LIZ(DataChannel dataChannel, EntranceConditionsPopup entranceConditionsPopup, String str) {
        FragmentManager fragmentManager;
        if (dataChannel != null) {
            fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
        } else {
            fragmentManager = null;
        }
        AwS123S1200000_7 awS123S1200000_7 = new AwS123S1200000_7(dataChannel, entranceConditionsPopup, str, 0);
        PreviewNoPermissionFragment previewNoPermissionFragment = new PreviewNoPermissionFragment();
        previewNoPermissionFragment.LL = entranceConditionsPopup;
        previewNoPermissionFragment.LLILLL = awS123S1200000_7;
        TuxPanel tuxPanel = new C439850HMp().LIZ;
        tuxPanel.LLILLJJLI = previewNoPermissionFragment;
        tuxPanel.LLIZLLLIL = false;
        tuxPanel.LLJ = false;
        tuxPanel.LLJI = true;
        tuxPanel.LLJIJIL = true;
        tuxPanel.LLILZIL = new DialogInterface.OnDismissListener() { // from class: X.0Jj4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C499910Jj3.LIZ = null;
            }
        };
        LIZ = tuxPanel;
        if (fragmentManager != null) {
            C0UQX.LJJII(dataChannel, entranceConditionsPopup, "show", null, str);
            TuxPanel tuxPanel2 = LIZ;
            if (tuxPanel2 != null) {
                tuxPanel2.showNow(fragmentManager, null);
            }
        }
    }
}
