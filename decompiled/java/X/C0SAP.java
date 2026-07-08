package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.settings.PinchToClearModeSettings;

/* JADX INFO: renamed from: X.0SAP, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SAP {
    public static final void LIZ(int i, String str, String str2, boolean z) {
        C1440005kM.LIZ(new C714060Rzg(z, i, str2, str));
        Keva keva = C0C2Y.LIZ;
        if (!keva.getBoolean("already_shown_pinch_clear_guide", false)) {
            keva.storeBoolean("already_shown_pinch_clear_guide", true);
        }
    }

    public static final void LIZIZ(float f, Aweme aweme, String str, String str2) {
        if (C716990SAn.LIZ() && aweme != null && !((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LJIIJ(aweme) && !AwemeSaaSExtKt.isLive(aweme)) {
            boolean zLJIIJ = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJLIIIJ().LJIIJ();
            C01GW<C0RGG> c01gw = C0RGG.LJ;
            boolean zLIZJ = C586380MzE.LIZ().LIZJ(str);
            String str3 = "pinch";
            if ((f >= PinchToClearModeSettings.LIZ().enterScale || zLJIIJ) && !zLIZJ) {
                int type = EnumC1616310sA9.PINCH_ZOOM.getType();
                if (f < 1.0f) {
                    str3 = "pinch_out";
                }
                LIZ(type, str, str3, true);
                return;
            }
            if (f <= PinchToClearModeSettings.LIZ().exitScale && zLIZJ) {
                int type2 = EnumC1616310sA9.PINCH_ZOOM.getType();
                if (str2 == null) {
                    str2 = "pinch";
                }
                LIZ(type2, str, str2, false);
                return;
            }
            if (f >= PinchToClearModeSettings.LIZ().enterScale) {
                if (!zLIZJ) {
                    return;
                }
                LIZ(EnumC1616310sA9.RESUME.getType(), str, "pinch", true);
            } else {
                if (!zLIZJ) {
                    return;
                }
                LIZ(EnumC1616310sA9.RESUME.getType(), str, "pinch", true);
            }
        }
    }
}
