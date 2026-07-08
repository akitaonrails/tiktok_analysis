package X;

import com.bytedance.android.livesdk.livesetting.level.LiveFansClubJoinPanelAdaptPadSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.user.IHostPad;

/* JADX INFO: renamed from: X.0eey, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1097260eey {
    public static final String[] LIZ = {"en", "en-GB"};

    public static boolean LIZ() {
        return C13LQ.LJJIJIIJI(C2273311DyT.LIZ(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale()), LIZ) >= 0;
    }

    public static boolean LIZIZ() {
        return LiveFansClubJoinPanelAdaptPadSetting.INSTANCE.getValue() && ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad();
    }
}
