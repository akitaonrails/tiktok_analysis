package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDeviceQRCodeFragment;

/* JADX INFO: renamed from: X.0TDV, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TDV {
    public static int LIZIZ() {
        return GameDualDeviceQRCodeFragment.LLJ.getValue().intValue();
    }

    public static GameDualDeviceQRCodeFragment LIZ(String str, boolean z) {
        GameDualDeviceQRCodeFragment gameDualDeviceQRCodeFragment = new GameDualDeviceQRCodeFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_landscape", z);
        if (str != null) {
            C786410Ut5.LJJJI("event_page", str, bundle);
        }
        gameDualDeviceQRCodeFragment.setArguments(bundle);
        return gameDualDeviceQRCodeFragment;
    }
}
