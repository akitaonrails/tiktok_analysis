package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.game.broadcast.fragment.dualdevice3.GameDualDeviceDialogV3;

/* JADX INFO: renamed from: X.0Jgb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C498390Jgb {
    public static void LIZ(int i, FragmentManager fragmentManager, String str, boolean z) {
        if (fragmentManager.LJJJJZI(GameDualDeviceDialogV3.class.getCanonicalName()) != null) {
            return;
        }
        String string = GameDualDeviceDialogV3.class.toString();
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(26.0f);
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_landscape", z);
        C786410Ut5.LJJJI("event_page", str, bundle);
        bundle.putInt("current_page", i);
        C19322110iZ.LIZLLL(fragmentManager, GameDualDeviceDialogV3.class, string, sheetOptions, bundle);
    }
}
