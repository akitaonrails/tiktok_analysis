package X;

import com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushExperienceOptimize;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1EEA, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EEA extends C09AY implements Function0<Boolean> {
    public C1EEA() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(InnerPushExperienceOptimize.LIZIZ() && InnerPushExperienceOptimize.LIZ().dedupForStoryPost);
    }
}
