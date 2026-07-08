package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lqx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.persistence.PersistenceWorkflowCenter$getWorkflowFromPersistence$2$1", f = "PersistenceWorkflowCenter.kt", l = {249}, m = "invokeSuspend")
public final class C555770Lqx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C552940LmO>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C555770Lqx(String str, InterfaceC1364105Vn<? super C555770Lqx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C555770Lqx(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJFF;
        C1C7U.LIZ("PersistenceWorkflowCenter@73ad.getWorkflowFromPersistence$2$1");
        Object objLJFF2 = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJFF = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C2267651DpL c2267651DpL = C2267651DpL.LIZ;
            C806320Vk6 c806320Vk6LJ = C2267651DpL.LJ();
            String str = this.LLILLJJLI;
            this.LL = 1;
            objLJFF = c806320Vk6LJ.LJFF(str, this);
            if (objLJFF == objLJFF2) {
                C1C7U.LIZIZ("PersistenceWorkflowCenter@73ad.getWorkflowFromPersistence$2$1");
                return objLJFF2;
            }
        }
        if (C189200o6.m7isFailureimpl(objLJFF)) {
            objLJFF = null;
        }
        C555820Lr2 c555820Lr2 = (C555820Lr2) objLJFF;
        if (c555820Lr2 == null) {
            C1C7U.LIZIZ("PersistenceWorkflowCenter@73ad.getWorkflowFromPersistence$2$1");
            return null;
        }
        C555800Lr0.LIZ.getClass();
        C552940LmO c552940LmOLIZJ = C555800Lr0.LIZJ(c555820Lr2);
        C1C7U.LIZIZ("PersistenceWorkflowCenter@73ad.getWorkflowFromPersistence$2$1");
        return c552940LmOLIZJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C552940LmO> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
