package X;

import com.ss.android.ugc.aweme.experiment.NUJAutoRefreshConfigExp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1E2P, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E2P extends C09AY implements Function0<Boolean> {
    public C1E2P() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(NUJAutoRefreshConfigExp.INSTANCE.getConfig().isEnabled);
    }
}
