package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0j1E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.following.ui.viewholder.IFollowItemCell$onBindUser$6$3$onSuccess$1", f = "IFollowItemCell.kt", l = {657}, m = "invokeSuspend")
public final class C1264820j1E extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1264850j1H LL;
    public int LLILLJJLI;
    public final /* synthetic */ InterfaceC1264850j1H LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1264820j1E(InterfaceC1264850j1H interfaceC1264850j1H, InterfaceC1364105Vn<? super C1264820j1E> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1264850j1H;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1264820j1E(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1264850j1H interfaceC1264850j1H;
        C1C7U.LIZ("IFollowItemCell@2d08.onBindUser$6$3$onSuccess$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                interfaceC1264850j1H = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (C2277051EAt.LIZ() && ((Number) C2277051EAt.LIZLLL.getValue()).intValue() == 1 && C1265490j2J.LIZ != null) {
                interfaceC1264850j1H = this.LLILLL;
                this.LL = interfaceC1264850j1H;
                this.LLILLJJLI = 1;
                if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                    C1C7U.LIZIZ("IFollowItemCell@2d08.onBindUser$6$3$onSuccess$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IFollowItemCell@2d08.onBindUser$6$3$onSuccess$1");
            return unit;
        }
        interfaceC1264850j1H.R5().wQ2();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IFollowItemCell@2d08.onBindUser$6$3$onSuccess$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
