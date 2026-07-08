package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.SubscriptionTrialLiveCardWidget;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0K9B, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.SubscriptionTrialLiveCardWidget$updateStatusToNonSubscriberForbiddenLive$1", f = "SubscriptionTrialLiveCardWidget.kt", l = {656}, m = "invokeSuspend")
public final class C0K9B extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SubscriptionTrialLiveCardWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0K9B(SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget, InterfaceC1364105Vn<? super C0K9B> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = subscriptionTrialLiveCardWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0K9B(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubscriptionTrialLiveCardWidget@31af.updateStatusToNonSubscriberForbiddenLive$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget = this.LLILLJJLI;
            final C2252321DDq c2252321DDq = subscriptionTrialLiveCardWidget.LLJJIII;
            InterfaceC346201Wa<Boolean> interfaceC346201Wa = new InterfaceC346201Wa<Boolean>() { // from class: X.0K9D
                @Override // X.InterfaceC346201Wa
                public final Object collect(InterfaceC346701Wf<? super Boolean> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Object objCollect = c2252321DDq.collect(new C0K9E(interfaceC346701Wf), interfaceC1364105Vn);
                    if (objCollect == C099R.LJFF()) {
                        return objCollect;
                    }
                    return Unit.LIZ;
                }
            };
            InterfaceC346701Wf<? super Boolean> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0K9C
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    ((Boolean) obj2).booleanValue();
                    subscriptionTrialLiveCardWidget.dataChannel.zW(SubOnlyLiveAudienceStatusChannel.class, C0II9.NON_SUBSCRIBER_FORBIDDEN_LIVE);
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (interfaceC346201Wa.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("SubscriptionTrialLiveCardWidget@31af.updateStatusToNonSubscriberForbiddenLive$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubscriptionTrialLiveCardWidget@31af.updateStatusToNonSubscriberForbiddenLive$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
