package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.game.broadcast.dialog.GameDualDeviceDialog;
import com.bytedance.android.livesdk.game.broadcast.fragment.dualdevice2.GameDualDeviceDialogV2;

/* JADX INFO: renamed from: X.0TEg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743440TEg {
    public static void LIZ(int i, FragmentManager fragmentManager, String str, boolean z) {
        if (fragmentManager.LJJJJZI(GameDualDeviceDialog.class.getCanonicalName()) != null) {
            return;
        }
        GameDualDeviceDialogV2 gameDualDeviceDialogV2 = new GameDualDeviceDialogV2();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_landscape", z);
        C786410Ut5.LJJJI("event_page", str, bundle);
        bundle.putInt("current_page", i);
        gameDualDeviceDialogV2.setArguments(bundle);
        gameDualDeviceDialogV2.show(fragmentManager, GameDualDeviceDialogV2.class.getCanonicalName());
    }
}
