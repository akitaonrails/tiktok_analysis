package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDeviceIntroFragment;

/* JADX INFO: renamed from: X.0TDN, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TDN {
    public static GameDualDeviceIntroFragment LIZ(boolean z) {
        GameDualDeviceIntroFragment gameDualDeviceIntroFragment = new GameDualDeviceIntroFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_landscape", z);
        gameDualDeviceIntroFragment.setArguments(bundle);
        return gameDualDeviceIntroFragment;
    }
}
