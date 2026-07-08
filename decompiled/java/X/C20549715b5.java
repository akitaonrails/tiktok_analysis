package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.poi.experiment.LSFeedCardInsetConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15b5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20549715b5 extends C09AY implements Function0<LSFeedCardInsetConfig.Config> {
    public C20549715b5() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.poi.experiment.LSFeedCardInsetConfig$Config, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final LSFeedCardInsetConfig.Config invoke() {
        return SettingsManager.LIZLLL().LJIIIIZZ("ttls_fyp_shaped_card_config", LSFeedCardInsetConfig.Config.class, LSFeedCardInsetConfig.LIZ);
    }
}
