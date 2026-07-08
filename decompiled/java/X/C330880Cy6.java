package X;

import com.ss.android.ugc.aweme.model.AMEPublishCampaignItem;
import com.ss.android.ugc.aweme.publish.EffectMobilePublishVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS583S0100000_4;
import njp.a;

/* JADX INFO: renamed from: X.0Cy6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.publish.EffectMobilePublishVM$fetchPublishCampaignList$1$1$1", f = "EffectMobilePublishVM.kt", l = {}, m = "invokeSuspend")
public final class C330880Cy6 extends C09AX implements Function2<AbstractC1623806Xk<? extends List<? extends AMEPublishCampaignItem>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ EffectMobilePublishVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330880Cy6(EffectMobilePublishVM effectMobilePublishVM, InterfaceC1364105Vn<? super C330880Cy6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effectMobilePublishVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C330880Cy6 c330880Cy6 = new C330880Cy6(this.LLILLJJLI, interfaceC1364105Vn);
        c330880Cy6.LL = obj;
        return c330880Cy6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectMobilePublishVM@cb08.fetchPublishCampaignList$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.setState(new AwS583S0100000_4((AbstractC1623806Xk) this.LL, (AbstractC1623806Xk<? extends List<AMEPublishCampaignItem>>) 218));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectMobilePublishVM@cb08.fetchPublishCampaignList$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC1623806Xk<? extends List<? extends AMEPublishCampaignItem>> abstractC1623806Xk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(abstractC1623806Xk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
