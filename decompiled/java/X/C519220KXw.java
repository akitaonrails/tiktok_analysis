package X;

import com.bytedance.android.livesdk.performancetune.pipeline.biz.innerflowdowngrade.LiveInnerFlowDowngradeLoggerExp;
import java.security.SecureRandom;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KXw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C519220KXw extends C09AY implements Function0<Boolean> {
    public C519220KXw() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(new SecureRandom().nextFloat() <= LiveInnerFlowDowngradeLoggerExp.INSTANCE.getSampleRate());
    }
}
