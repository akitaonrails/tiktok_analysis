package X;

import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06b8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.userservice.CommonFollowApi$follow$1", f = "CommonFollowApi.kt", l = {}, m = "invokeSuspend")
public final class C1637606b8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FollowStatus LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1637606b8(FollowStatus followStatus, InterfaceC1364105Vn<? super C1637606b8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = followStatus;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1637606b8(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommonFollowApi@6687.follow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1076010e6h.LIZJ.LIZIZ().LJFF().postValue(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommonFollowApi@6687.follow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
