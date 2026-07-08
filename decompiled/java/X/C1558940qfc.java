package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.setting.onboarding.LivePcsOptinPageUIStyleSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.assem.PcsOnboardingFrontAAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.assem.PcsOnboardingFrontBAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qfc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558940qfc extends C09AY implements Function1<C0SZ5, Unit> {
    public C1558940qfc() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0SZ5 c0sz5) {
        Class cls;
        C0SZ5 c0sz52 = c0sz5;
        if (LivePcsOptinPageUIStyleSetting.INSTANCE.getValue() == 1) {
            cls = PcsOnboardingFrontAAssem.class;
        } else {
            cls = PcsOnboardingFrontBAssem.class;
        }
        c0sz52.LL = C13LE.LIZ(cls);
        c0sz52.LLIZLLLIL = R.id.eul;
        return Unit.LIZ;
    }
}
