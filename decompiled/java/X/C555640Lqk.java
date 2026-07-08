package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lqk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.persistence.PersistenceWorkflowCenter$updateCentralRegistry$2$1", f = "PersistenceWorkflowCenter.kt", l = {93}, m = "invokeSuspend")
public final class C555640Lqk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C555910LrB LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C555640Lqk(String str, C555910LrB c555910LrB, InterfaceC1364105Vn<? super C555640Lqk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c555910LrB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C555640Lqk(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Integer numLJ;
        Object objLJIIL;
        Map<String, C2339209Eo> map;
        C1C7U.LIZ("PersistenceWorkflowCenter@73ad.updateCentralRegistry$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJIIL = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0LX3 c0lx3 = C0LX3.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("workflowId : ");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append("  : updateCentralRegistry: size=");
            C555910LrB c555910LrB = this.LLILLL;
            if (c555910LrB != null && (map = c555910LrB.LIZ) != null) {
                numLJ = C2286608xc.LJ(map.size());
            } else {
                numLJ = null;
            }
            sbLIZ.append(numLJ);
            C201955140j.LIZLLL(c0lx3, "PersistenceWorkflowCenter", C2188811AlT.LIZIZ(sbLIZ));
            C2267651DpL c2267651DpL = C2267651DpL.LIZ;
            C806320Vk6 c806320Vk6LJ = C2267651DpL.LJ();
            String str = this.LLILLJJLI;
            C555910LrB c555910LrB2 = this.LLILLL;
            this.LL = 1;
            objLJIIL = c806320Vk6LJ.LJIIL(str, c555910LrB2, this);
            if (objLJIIL == objLJFF) {
                C1C7U.LIZIZ("PersistenceWorkflowCenter@73ad.updateCentralRegistry$2$1");
                return objLJFF;
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJIIL);
        C1C7U.LIZIZ("PersistenceWorkflowCenter@73ad.updateCentralRegistry$2$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
