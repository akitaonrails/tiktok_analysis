package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.game.GameDualDevicePadModeSetting;
import com.bytedance.android.livesdkapi.host.user.IHostPad;

/* JADX INFO: renamed from: X.0TEn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743510TEn {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Context context) {
        IHostPad iHostPad;
        if (context == null || !GameDualDevicePadModeSetting.INSTANCE.isEnabled() || (iHostPad = (IHostPad) C1161920gLG.LIZJ(IHostPad.class)) == null) {
            return false;
        }
        if (!iHostPad.isPad() && (!iHostPad.Yd2() || iHostPad.XM(context) != 1)) {
            return false;
        }
        return true;
    }
}
