package X;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nd8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.follow.logic.RelationViewVM$followWithOfflineWrite$1$1$1", f = "RelationViewVM.kt", l = {}, m = "invokeSuspend")
public final class C598160Nd8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0O7A<C613150O3d> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598160Nd8(C0O7A<C613150O3d> c0o7a, InterfaceC1364105Vn<? super C598160Nd8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0o7a;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598160Nd8(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        C1C7U.LIZ("RelationViewVM@8ffd.followWithOfflineWrite$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            C0O3Q.LIZ(activityLIZ, ((C0O7B) this.LL).LIZLLL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RelationViewVM@8ffd.followWithOfflineWrite$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
