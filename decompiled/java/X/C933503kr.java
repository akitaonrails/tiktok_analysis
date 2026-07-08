package X;

import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService;

/* JADX INFO: renamed from: X.03kr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C933503kr {
    public static final C933503kr LIZ = new C933503kr();
    public static EnumC1712310uez LIZIZ = EnumC1712310uez.NOT_SUPPORT;

    public static boolean LIZIZ() {
        IPipoCcdcService iPipoCcdcService;
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("ecom_card_ocr", false) && (iPipoCcdcService = (IPipoCcdcService) PluggableExtentionKt.pluggableSpi$default(IPipoCcdcService.class, false, false, false, 14, null)) != null && iPipoCcdcService.LJIIIZ("tts");
    }

    public static boolean LIZ(Context context) {
        if (context == null) {
            return false;
        }
        return ((IPipoCcdcService) ServiceManager.get().getService(IPipoCcdcService.class)).LJIIIIZZ(context, "tts");
    }
}
