package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoEcCcdcBindPromoRetentionConfigModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;

/* JADX INFO: renamed from: X.03c0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C878603c0 {
    public static final C878603c0 LIZ = new C878603c0();
    public static final PipoEcCcdcBindPromoRetentionConfigModel LIZIZ = new PipoEcCcdcBindPromoRetentionConfigModel(false, 999999999, 999999999);

    public static boolean LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoEcCcdcBindPromoRetentionConfigModel pipoEcCcdcBindPromoRetentionConfigModel = LIZIZ;
        PipoEcCcdcBindPromoRetentionConfigModel pipoEcCcdcBindPromoRetentionConfigModel2 = (PipoEcCcdcBindPromoRetentionConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_ec_ccdc_bind_promo_retention_config", PipoEcCcdcBindPromoRetentionConfigModel.class, pipoEcCcdcBindPromoRetentionConfigModel);
        if (pipoEcCcdcBindPromoRetentionConfigModel2 != null) {
            pipoEcCcdcBindPromoRetentionConfigModel = pipoEcCcdcBindPromoRetentionConfigModel2;
        }
        Keva keva = C1257480ipO.LIZ;
        boolean z = false;
        int i = keva.getInt("ccdc_bind_promo_retention_count", 0);
        long jCurrentTimeMillis = keva.getLong("ccdc_bind_promo_last_retention_time", 0L);
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        if (pipoEcCcdcBindPromoRetentionConfigModel.isDialogEnabled && i == 0 && System.currentTimeMillis() - jCurrentTimeMillis >= pipoEcCcdcBindPromoRetentionConfigModel.freqInMins * ((long) 60) * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
            z = true;
        }
        try {
            keva.storeInt("ccdc_bind_promo_retention_count", (int) (((long) (i + 1)) % pipoEcCcdcBindPromoRetentionConfigModel.freqInOpenCounts));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (z) {
            C1257480ipO.LIZ.storeLong("ccdc_bind_promo_last_retention_time", System.currentTimeMillis());
        }
        return z;
    }
}
