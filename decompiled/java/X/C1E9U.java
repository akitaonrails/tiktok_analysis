package X;

import com.ss.android.ugc.aweme.innerpush.settings.InnerPushAIExp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1E9U, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E9U extends C09AY implements Function0<Boolean> {
    public C1E9U() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((InnerPushAIExp.AIConfig) InnerPushAIExp.LIZIZ.getValue()).lostFocusEnable);
    }
}
