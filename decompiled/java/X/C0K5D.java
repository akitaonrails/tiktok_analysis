package X;

import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0K5D, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment$observerDataChannel$2", f = "SubscriptionPrivilegeDetailFragment.kt", l = {}, m = "invokeSuspend")
public final class C0K5D extends C09AX implements Function2<C512130K6p, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SubscriptionPrivilegeDetailFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0K5D(SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment, InterfaceC1364105Vn<? super C0K5D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = subscriptionPrivilegeDetailFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0K5D c0k5d = new C0K5D(this.LLILLJJLI, interfaceC1364105Vn);
        c0k5d.LL = obj;
        return c0k5d;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("SubscriptionPrivilegeDetailFragment@c114.observerDataChannel$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C512130K6p c512130K6p = (C512130K6p) this.LL;
        if (Intrinsics.LJFF(c512130K6p.LIZ, this.LLILLJJLI.LLJJIII)) {
            SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = this.LLILLJJLI;
            subscriptionPrivilegeDetailFragment.LLILZIL.invoke();
            if (c512130K6p.LIZIZ) {
                i = 2;
            } else {
                i = 1;
            }
            subscriptionPrivilegeDetailFragment.OR(Boolean.TRUE, Integer.valueOf(i));
            PrivilegeDetailViewModel privilegeDetailViewModelZS = subscriptionPrivilegeDetailFragment.zS();
            if (privilegeDetailViewModelZS != null) {
                privilegeDetailViewModelZS.d();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubscriptionPrivilegeDetailFragment@c114.observerDataChannel$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C512130K6p c512130K6p, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c512130K6p, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
