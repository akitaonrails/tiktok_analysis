package X;

import com.ss.android.ugc.aweme.innerpush.settings.InnerPushAIExp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1E9T, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E9T extends C09AY implements Function0<Integer> {
    public C1E9T() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(((InnerPushAIExp.AIConfig) InnerPushAIExp.LIZIZ.getValue()).expVal);
    }
}
