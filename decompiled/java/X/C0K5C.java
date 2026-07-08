package X;

import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0K5C, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment$observerDataChannel$3", f = "SubscriptionPrivilegeDetailFragment.kt", l = {}, m = "invokeSuspend")
public final class C0K5C extends C09AX implements Function2<C512080K6k, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SubscriptionPrivilegeDetailFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0K5C(SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment, InterfaceC1364105Vn<? super C0K5C> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = subscriptionPrivilegeDetailFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0K5C c0k5c = new C0K5C(this.LLILLJJLI, interfaceC1364105Vn);
        c0k5c.LL = obj;
        return c0k5c;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("SubscriptionPrivilegeDetailFragment@c114.observerDataChannel$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C512080K6k c512080K6k = (C512080K6k) this.LL;
        if (Intrinsics.LJFF(c512080K6k.LIZ, this.LLILLJJLI.LLJJIII)) {
            SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = this.LLILLJJLI;
            subscriptionPrivilegeDetailFragment.getClass();
            if (c512080K6k.LIZJ) {
                i = 2;
            } else {
                i = 1;
            }
            subscriptionPrivilegeDetailFragment.OR(Boolean.TRUE, Integer.valueOf(i));
            C1390410mHn c1390410mHnYS = subscriptionPrivilegeDetailFragment.yS();
            if (c1390410mHnYS != null) {
                C786410Ut5.LLLZZIL(c1390410mHnYS, 0);
                c1390410mHnYS.LIZJ();
            }
            PrivilegeDetailViewModel privilegeDetailViewModelZS = subscriptionPrivilegeDetailFragment.zS();
            if (privilegeDetailViewModelZS != null) {
                privilegeDetailViewModelZS.d();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubscriptionPrivilegeDetailFragment@c114.observerDataChannel$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C512080K6k c512080K6k, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c512080K6k, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
