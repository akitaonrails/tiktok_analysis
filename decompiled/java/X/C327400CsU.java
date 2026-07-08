package X;

import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CsU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.link.ReflowSideProcessor$init$1$1$1", f = "ReflowSideProcessor.kt", l = {89}, m = "invokeSuspend")
public final class C327400CsU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1234160iDm LLILLJJLI;
    public final /* synthetic */ FollowStatus LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327400CsU(C1234160iDm c1234160iDm, FollowStatus followStatus, InterfaceC1364105Vn<? super C327400CsU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1234160iDm;
        this.LLILLL = followStatus;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327400CsU(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReflowSideProcessor@9181.init$1$1$1");
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
            C1234160iDm c1234160iDm = this.LLILLJJLI;
            String userId = this.LLILLL.getUserId();
            int followStatus = this.LLILLL.getFollowStatus();
            this.LL = 1;
            if (c1234160iDm.LJIIIIZZ(followStatus, userId, this) == objLJFF) {
                C1C7U.LIZIZ("ReflowSideProcessor@9181.init$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReflowSideProcessor@9181.init$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
