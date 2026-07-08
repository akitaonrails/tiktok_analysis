package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ogc.news.sticker.common.ArticleStickerSettingsConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yjh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868990yjh extends C09AY implements Function0<ArticleStickerSettingsConfig.Config> {
    public C1868990yjh() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final ArticleStickerSettingsConfig.Config invoke() {
        ArticleStickerSettingsConfig.Config config;
        try {
            ArticleStickerSettingsConfig.Config config2 = (ArticleStickerSettingsConfig.Config) SettingsManager.LIZLLL().LJIIIIZZ("ogc_article_sticker_config", ArticleStickerSettingsConfig.Config.class, ArticleStickerSettingsConfig.LIZ);
            C189200o6.m2constructorimpl(config2);
            config = config2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            config = c098200Yq;
        }
        return (C189200o6.m7isFailureimpl(config) || config == 0) ? ArticleStickerSettingsConfig.LIZ : config;
    }
}
