package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoTtsPixViaGoogleConfigModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03ZX, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03ZX {
    public static final PipoTtsPixViaGoogleConfigModel LIZ = new PipoTtsPixViaGoogleConfigModel(true, true, Boolean.TRUE, Boolean.FALSE);

    public static boolean LIZ() {
        return LIZJ().enable;
    }

    public static boolean LIZIZ() {
        return LIZ() && Intrinsics.LJFF(LIZJ().fixOspPixDisplay, Boolean.TRUE);
    }

    public static final PipoTtsPixViaGoogleConfigModel LIZJ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoTtsPixViaGoogleConfigModel pipoTtsPixViaGoogleConfigModel = LIZ;
        PipoTtsPixViaGoogleConfigModel pipoTtsPixViaGoogleConfigModel2 = (PipoTtsPixViaGoogleConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_tts_pix_via_google_config", PipoTtsPixViaGoogleConfigModel.class, pipoTtsPixViaGoogleConfigModel);
        return pipoTtsPixViaGoogleConfigModel2 != null ? pipoTtsPixViaGoogleConfigModel2 : pipoTtsPixViaGoogleConfigModel;
    }

    public static boolean LIZLLL() {
        return LIZJ().hidePrePageLoading;
    }
}
