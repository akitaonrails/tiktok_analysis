package X;

import com.ss.android.ugc.aweme.aigc.migration.model.OldFrameworkInputModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lqz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.persistence.PersistenceWorkflowCenter$serializeWorkflow$2$1", f = "PersistenceWorkflowCenter.kt", l = {42, 46}, m = "invokeSuspend")
public final class C555790Lqz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public C555820Lr2 LL;
    public int LLILLJJLI;
    public final /* synthetic */ C552940LmO LLILLL;
    public final /* synthetic */ OldFrameworkInputModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C555790Lqz(C552940LmO c552940LmO, OldFrameworkInputModel oldFrameworkInputModel, InterfaceC1364105Vn<? super C555790Lqz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c552940LmO;
        this.LLILZ = oldFrameworkInputModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C555790Lqz(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C555820Lr2 c555820Lr2;
        C1C7U.LIZ("PersistenceWorkflowCenter@73ad.serializeWorkflow$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    c555820Lr2 = this.LL;
                    C155000ia.LIZIZ(obj);
                    ((C189200o6) obj).m10unboximpl();
                    String str = c555820Lr2.LIZ;
                    C1C7U.LIZIZ("PersistenceWorkflowCenter@73ad.serializeWorkflow$2$1");
                    return str;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C555800Lr0 c555800Lr0 = C555800Lr0.LIZ;
            C552940LmO c552940LmO = this.LLILLL;
            OldFrameworkInputModel oldFrameworkInputModel = this.LLILZ;
            this.LLILLJJLI = 1;
            obj = c555800Lr0.LJI(c552940LmO, oldFrameworkInputModel, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PersistenceWorkflowCenter@73ad.serializeWorkflow$2$1");
                return objLJFF;
            }
        }
        C555820Lr2 c555820Lr22 = (C555820Lr2) obj;
        C2267651DpL c2267651DpL = C2267651DpL.LIZ;
        C806320Vk6 c806320Vk6LJ = C2267651DpL.LJ();
        this.LL = c555820Lr22;
        this.LLILLJJLI = 2;
        if (c806320Vk6LJ.LIZ(c555820Lr22, this) == objLJFF) {
            C1C7U.LIZIZ("PersistenceWorkflowCenter@73ad.serializeWorkflow$2$1");
            return objLJFF;
        }
        c555820Lr2 = c555820Lr22;
        String str2 = c555820Lr2.LIZ;
        C1C7U.LIZIZ("PersistenceWorkflowCenter@73ad.serializeWorkflow$2$1");
        return str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
