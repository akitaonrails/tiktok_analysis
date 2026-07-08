package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0K2C, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment$observerDataChannel$1", f = "SubscriptionPrivilegeDetailFragment.kt", l = {}, m = "invokeSuspend")
public final class C0K2C extends C09AX implements Function2<C221700tL, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SubscriptionPrivilegeDetailFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0K2C(SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment, InterfaceC1364105Vn<? super C0K2C> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = subscriptionPrivilegeDetailFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0K2C c0k2c = new C0K2C(this.LLILLJJLI, interfaceC1364105Vn);
        c0k2c.LL = obj;
        return c0k2c;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        User user;
        C1C7U.LIZ("SubscriptionPrivilegeDetailFragment@c114.observerDataChannel$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C221700tL c221700tL = (C221700tL) this.LL;
        PGCGetSubPrivilegeDetailResponse.Data data = this.LLILLJJLI.LLILLL;
        if (data != null) {
            user = data.anchorDetail;
        } else {
            user = null;
        }
        String strLIZ = C0K7S.LIZ(user);
        String str = c221700tL.LIZ;
        if (!TextUtils.isEmpty(str)) {
            C0JCX.LIZLLL(str);
        } else if (!TextUtils.isEmpty(strLIZ)) {
            C0JCX.LIZLLL(C511520K4g.LJIIIIZZ(2131836582, strLIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubscriptionPrivilegeDetailFragment@c114.observerDataChannel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C221700tL c221700tL, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c221700tL, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
