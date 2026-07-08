package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0j1D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.following.ui.viewholder.IFollowItemCell$onBindUser$6$2", f = "IFollowItemCell.kt", l = {636}, m = "invokeSuspend")
public final class C1264810j1D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1264850j1H LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1264810j1D(InterfaceC1264850j1H interfaceC1264850j1H, InterfaceC1364105Vn<? super C1264810j1D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1264850j1H;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1264810j1D(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        User user;
        C1265490j2J c1265490j2J;
        C1C7U.LIZ("IFollowItemCell@2d08.onBindUser$6$2");
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
            C1265420j2C c1265420j2CZ0 = this.LLILLJJLI.Z0();
            if (c1265420j2CZ0 != null && (user = c1265420j2CZ0.LLILLJJLI) != null && C2277051EAt.LIZ() && ((Number) C2277051EAt.LIZLLL.getValue()).intValue() == 1 && (c1265490j2J = C1265490j2J.LIZ) != null) {
                this.LL = 1;
                if (c1265490j2J.LIZ(user, this) == objLJFF) {
                    C1C7U.LIZIZ("IFollowItemCell@2d08.onBindUser$6$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IFollowItemCell@2d08.onBindUser$6$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
