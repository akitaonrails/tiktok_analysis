package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.image.experiment.HeifUrlReplaceConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kjU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1330700kjU extends C09AY implements Function0<HeifUrlReplaceConfig> {
    public C1330700kjU() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final HeifUrlReplaceConfig invoke() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            HeifUrlReplaceConfig heifUrlReplaceConfig = C1330690kjT.LIZ;
            HeifUrlReplaceConfig heifUrlReplaceConfig2 = (HeifUrlReplaceConfig) c0c64LJIILLIIL.LJJII(HeifUrlReplaceConfig.class, heifUrlReplaceConfig, "fresco_heif_uri_replace", true);
            return heifUrlReplaceConfig2 != null ? heifUrlReplaceConfig2 : heifUrlReplaceConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C1330690kjT.LIZ;
        }
    }
}
