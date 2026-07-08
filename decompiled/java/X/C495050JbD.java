package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.spotlight.SubscriptionSpotlightFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JbD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C495050JbD extends C09AY implements Function1<InterfaceC495060JbE, Unit> {
    public final /* synthetic */ SubscriptionSpotlightFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C495050JbD(SubscriptionSpotlightFragment subscriptionSpotlightFragment) {
        super(1);
        this.LL = subscriptionSpotlightFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC495060JbE interfaceC495060JbE) {
        InterfaceC495060JbE interfaceC495060JbE2 = interfaceC495060JbE;
        C0K8F c0k8f = C0K8F.LIZ;
        List<C495170JbP> list = this.LL.LLJJJIL.LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        for (C495170JbP c495170JbP : list) {
            Integer num = c495170JbP.LIZIZ;
            if (num == null || num.intValue() != 3) {
                arrayList.add(c495170JbP);
            }
        }
        C495070JbF c495070JbF = new C495070JbF();
        c0k8f.getClass();
        interfaceC495060JbE2.xI(C0K8F.LIZLLL(arrayList, c495070JbF));
        return Unit.LIZ;
    }
}
