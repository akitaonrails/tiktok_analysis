package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feed.ab.PromptConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14al, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20292914al extends C09AY implements Function0<PromptConfig> {
    public C20292914al() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.feed.ab.PromptConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final PromptConfig invoke() {
        return SettingsManager.LIZLLL().LJIIIIZZ("prompt", PromptConfig.class, null);
    }
}
