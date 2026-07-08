package X;

import com.ss.android.ugc.aweme.experiment.FollowRealTimeReadExp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1EM9, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EM9 extends C09AY implements Function0<Integer> {
    public C1EM9() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(FollowRealTimeReadExp.LIZIZ().readRecordLimit);
    }
}
