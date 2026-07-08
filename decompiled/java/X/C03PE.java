package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoTtsUsBnplFullReleaseConfigModel;

/* JADX INFO: renamed from: X.03PE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03PE {
    public static final PipoTtsUsBnplFullReleaseConfigModel LIZ = new PipoTtsUsBnplFullReleaseConfigModel(true, false, true, true);

    public static final PipoTtsUsBnplFullReleaseConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoTtsUsBnplFullReleaseConfigModel pipoTtsUsBnplFullReleaseConfigModel = LIZ;
        PipoTtsUsBnplFullReleaseConfigModel pipoTtsUsBnplFullReleaseConfigModel2 = (PipoTtsUsBnplFullReleaseConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_tts_us_bnpl_full_release_config", PipoTtsUsBnplFullReleaseConfigModel.class, pipoTtsUsBnplFullReleaseConfigModel);
        return pipoTtsUsBnplFullReleaseConfigModel2 != null ? pipoTtsUsBnplFullReleaseConfigModel2 : pipoTtsUsBnplFullReleaseConfigModel;
    }
}
