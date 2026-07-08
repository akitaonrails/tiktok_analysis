package X;

import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS16S0001000_1;

/* JADX INFO: renamed from: X.03pi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C963603pi extends C2217421BqW implements Function1<Integer, Unit> {
    public C963603pi(DeliveryPanelViewModel deliveryPanelViewModel) {
        super(1, deliveryPanelViewModel, DeliveryPanelViewModel.class, "updateTab", "updateTab(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        JediViewModel jediViewModel = (JediViewModel) this.receiver;
        jediViewModel.getClass();
        jediViewModel.setState(new AwS16S0001000_1(iIntValue, 16));
        return Unit.LIZ;
    }
}
