package X;

import com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushColdStartExp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1E9P, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E9P extends C09AY implements Function0<Long> {
    public C1E9P() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(((InnerPushColdStartExp.Config) InnerPushColdStartExp.LIZIZ.getValue()).coldStartDelaySeconds);
    }
}
