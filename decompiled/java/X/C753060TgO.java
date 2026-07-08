package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelPadSetting;
import com.bytedance.android.livesdkapi.host.user.IHostPad;

/* JADX INFO: renamed from: X.0TgO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C753060TgO {
    public static boolean LIZ() {
        return ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).rB() ? ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).XM(null) == 1 : (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() || ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).XM(null) == 1) && LiveGiftPanelPadSetting.isEnabled() && ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx();
    }
}
