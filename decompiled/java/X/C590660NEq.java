package X;

import defpackage.x0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NEq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.controller.TTDataCenterBizWrapper$resetIdleTimer$1", f = "TTDataCenterBizWrapper.kt", l = {271}, m = "invokeSuspend")
public final class C590660NEq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C590660NEq(InterfaceC1364105Vn<? super C590660NEq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C590660NEq(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTDataCenterBizWrapper@875f.resetIdleTimer$1");
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
            long jLongValue = ((Number) C2281291ERb.LJIIL.getValue()).longValue();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                C1C7U.LIZIZ("TTDataCenterBizWrapper@875f.resetIdleTimer$1");
                return objLJFF;
            }
        }
        x0 x0Var = x0.LIZ;
        String strLJFF = C590440NDu.LJFF();
        x0Var.getClass();
        if (x0.LIZIZ(strLJFF) <= 3) {
            C590410NDr.LIZ.getClass();
            C590410NDr.LIZIZ = false;
            C0NET.LIZ.getClass();
            C0NET.LJIJI(false);
        }
        C582910Mtd.LJIIIZ = true;
        AnonymousClass0956 anonymousClass0956 = C582910Mtd.LJII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C582910Mtd.LJII = null;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTDataCenterBizWrapper@875f.resetIdleTimer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C590660NEq(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
