package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.ab.ConfigModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rmN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1601570rmN extends C09AY implements Function0<ConfigModel> {
    public C1601570rmN() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ConfigModel invoke() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            ConfigModel configModel = C1601560rmM.LIZ;
            ConfigModel configModel2 = (ConfigModel) c0c64LJIILLIIL.LJJIIJ(true, "feed_lynx_card_load_refactor", 31744, ConfigModel.class, configModel, 2);
            return configModel2 != null ? configModel2 : configModel;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C1601560rmM.LIZ;
        }
    }
}
