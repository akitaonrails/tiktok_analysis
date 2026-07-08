package X;

import com.ss.android.ugc.aweme.experiment.FollowRealTimeReadExp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1EM7, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EM7 extends C09AY implements Function0<Boolean> {
    public C1EM7() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(FollowRealTimeReadExp.LIZIZ().enable && FollowRealTimeReadExp.LIZIZ().enableRealTimeRead);
    }
}
