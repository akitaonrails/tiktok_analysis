package X;

import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cu7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.api.ProfileFollowService$notifyFollowNetworkRequestSuccess$1", f = "ProfileFollowService.kt", l = {}, m = "invokeSuspend")
public final class C328410Cu7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FollowStatus LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C328410Cu7(FollowStatus followStatus, String str, String str2, InterfaceC1364105Vn<? super C328410Cu7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = followStatus;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C328410Cu7(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileFollowService@f9b9.notifyFollowNetworkRequestSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.getUserId() == null) {
            this.LL.setUserId(this.LLILLJJLI);
        }
        if (this.LL.getSecUserId() == null) {
            this.LL.setSecUserId(this.LLILLL);
        }
        C1076010e6h.LIZJ.LIZIZ().LJFF().postValue(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileFollowService@f9b9.notifyFollowNetworkRequestSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
