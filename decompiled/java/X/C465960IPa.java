package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.spotlight.SubscriptionSpotlightFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IPa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.spotlight.SubscriptionSpotlightFragment$processSpotlitItems$2", f = "SubscriptionSpotlightFragment.kt", l = {310}, m = "invokeSuspend")
public final class C465960IPa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SubscriptionSpotlightFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C465960IPa(SubscriptionSpotlightFragment subscriptionSpotlightFragment, InterfaceC1364105Vn<? super C465960IPa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = subscriptionSpotlightFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C465960IPa c465960IPa = new C465960IPa(this.LLILLL, interfaceC1364105Vn);
        c465960IPa.LLILLJJLI = obj;
        return c465960IPa;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubscriptionSpotlightFragment@e756.processSpotlitItems$2");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            SubscriptionSpotlightFragment subscriptionSpotlightFragment = this.LLILLL;
            this.LL = 1;
            if (subscriptionSpotlightFragment.NR(interfaceC497601wk, this) == objLJFF) {
                C1C7U.LIZIZ("SubscriptionSpotlightFragment@e756.processSpotlitItems$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubscriptionSpotlightFragment@e756.processSpotlitItems$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
