package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDevicePositionSelectFragment;

/* JADX INFO: renamed from: X.0TDQ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TDQ {
    public static GameDualDevicePositionSelectFragment LIZ(String str, boolean z, boolean z2) {
        GameDualDevicePositionSelectFragment gameDualDevicePositionSelectFragment = new GameDualDevicePositionSelectFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_landscape", z);
        C786410Ut5.LJJJI("event_page", str, bundle);
        bundle.putBoolean("is_preview_page", z2);
        gameDualDevicePositionSelectFragment.setArguments(bundle);
        return gameDualDevicePositionSelectFragment;
    }
}
