package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lqw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.persistence.PersistenceWorkflowCenter$getWorkflowByServerTaskId$2$1", f = "PersistenceWorkflowCenter.kt", l = {233}, m = "invokeSuspend")
public final class C555760Lqw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C552940LmO>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C555760Lqw(String str, InterfaceC1364105Vn<? super C555760Lqw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C555760Lqw(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJI;
        C1C7U.LIZ("PersistenceWorkflowCenter@73ad.getWorkflowByServerTaskId$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJI = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C2267651DpL c2267651DpL = C2267651DpL.LIZ;
            C806320Vk6 c806320Vk6LJ = C2267651DpL.LJ();
            String str = this.LLILLJJLI;
            this.LL = 1;
            objLJI = c806320Vk6LJ.LJI(str, this);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("PersistenceWorkflowCenter@73ad.getWorkflowByServerTaskId$2$1");
                return objLJFF;
            }
        }
        if (C189200o6.m7isFailureimpl(objLJI)) {
            objLJI = null;
        }
        C555820Lr2 c555820Lr2 = (C555820Lr2) objLJI;
        if (c555820Lr2 == null) {
            C1C7U.LIZIZ("PersistenceWorkflowCenter@73ad.getWorkflowByServerTaskId$2$1");
            return null;
        }
        C555800Lr0.LIZ.getClass();
        C552940LmO c552940LmOLIZJ = C555800Lr0.LIZJ(c555820Lr2);
        C1C7U.LIZIZ("PersistenceWorkflowCenter@73ad.getWorkflowByServerTaskId$2$1");
        return c552940LmOLIZJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C552940LmO> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
