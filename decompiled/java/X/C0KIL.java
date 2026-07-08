package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.assem.BottomSubscribeComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KIL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KIL extends C09AY implements Function0<Unit> {
    public final /* synthetic */ BottomSubscribeComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KIL(BottomSubscribeComponent bottomSubscribeComponent) {
        super(0);
        this.LL = bottomSubscribeComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0HZQ c0hzq = this.LL.LLJJIJIL;
        if (c0hzq != null) {
            c0hzq.performClick();
        }
        return Unit.LIZ;
    }
}
