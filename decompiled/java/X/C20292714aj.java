package X;

import com.ss.android.ugc.aweme.feed.ab.PromptConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14aj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20292714aj extends C09AY implements Function0<Integer> {
    public C20292714aj() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        PromptConfig promptConfigLIZ = C20292414ag.LIZ();
        return Integer.valueOf(promptConfigLIZ != null ? promptConfigLIZ.uiOptimize : 0);
    }
}
