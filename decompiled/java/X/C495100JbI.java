package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.spotlight.SubscriptionSpotlightFragment;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JbI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.spotlight.SubscriptionSpotlightFragment$onViewCreated$2", f = "SubscriptionSpotlightFragment.kt", l = {232}, m = "invokeSuspend")
public final class C495100JbI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SubscriptionSpotlightFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C495100JbI(SubscriptionSpotlightFragment subscriptionSpotlightFragment, InterfaceC1364105Vn<? super C495100JbI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = subscriptionSpotlightFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C495100JbI(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubscriptionSpotlightFragment@e756.onViewCreated$2");
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
            DialogC1389620mGW dialogC1389620mGW = this.LLILLJJLI.LLJJ;
            if (dialogC1389620mGW != null) {
                C786410Ut5.J4(dialogC1389620mGW);
            }
            SubscriptionSpotlightFragment subscriptionSpotlightFragment = this.LLILLJJLI;
            View view = subscriptionSpotlightFragment.getView();
            if (view != null) {
                Iterator<Integer> it2 = subscriptionSpotlightFragment.LLJJJJJIL.iterator();
                while (it2.hasNext()) {
                    C786410Ut5.LJLLLLLL(8, view.findViewById(it2.next().intValue()));
                }
                Iterator<Integer> it3 = subscriptionSpotlightFragment.LLJJJJ.iterator();
                while (it3.hasNext()) {
                    C786410Ut5.LJLLLLLL(8, view.findViewById(it3.next().intValue()));
                }
            }
            SubscriptionSpotlightFragment subscriptionSpotlightFragment2 = this.LLILLJJLI;
            C495110JbJ c495110JbJ = new C495110JbJ(subscriptionSpotlightFragment2);
            this.LL = 1;
            subscriptionSpotlightFragment2.getClass();
            if (C2296808zG.LJ(new C495080JbG(subscriptionSpotlightFragment2, c495110JbJ, null), this) == objLJFF) {
                C1C7U.LIZIZ("SubscriptionSpotlightFragment@e756.onViewCreated$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubscriptionSpotlightFragment@e756.onViewCreated$2");
        return unit;
    }
}
