package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lqp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.persistence.PersistenceWorkflowCenter$incrementGradeDownCount$2$1", f = "PersistenceWorkflowCenter.kt", l = {143}, m = "invokeSuspend")
public final class C555690Lqp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C555690Lqp(String str, InterfaceC1364105Vn<? super C555690Lqp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C555690Lqp(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJIIIZ;
        C1C7U.LIZ("PersistenceWorkflowCenter@73ad.incrementGradeDownCount$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJIIIZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C2267651DpL c2267651DpL = C2267651DpL.LIZ;
            C806320Vk6 c806320Vk6LJ = C2267651DpL.LJ();
            String str = this.LLILLJJLI;
            this.LL = 1;
            objLJIIIZ = c806320Vk6LJ.LJIIIZ(str, this);
            if (objLJIIIZ == objLJFF) {
                C1C7U.LIZIZ("PersistenceWorkflowCenter@73ad.incrementGradeDownCount$2$1");
                return objLJFF;
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJIIIZ);
        C1C7U.LIZIZ("PersistenceWorkflowCenter@73ad.incrementGradeDownCount$2$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
