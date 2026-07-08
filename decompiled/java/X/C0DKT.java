package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.commonhost.CommonMixPageActivity;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.commonhost.CommonMixPageFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0DKT, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DKT extends C09AY implements Function0<Unit> {
    public final /* synthetic */ CommonMixPageFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DKT(CommonMixPageFragment commonMixPageFragment) {
        super(0);
        this.LL = commonMixPageFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C19EG activity = this.LL.getActivity();
        if (activity instanceof CommonMixPageActivity) {
            activity.finish();
            try {
                C1389600mGU.LIZIZ(activity);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            activity.overridePendingTransition(0, 0);
        }
        return Unit.LIZ;
    }
}
