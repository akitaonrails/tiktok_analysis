package X;

import com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushExperienceOptimize;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1EEC, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EEC extends C09AY implements Function0<Long> {
    public C1EEC() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(((long) InnerPushExperienceOptimize.LIZ().pullDelayByDm) * 1000);
    }
}
