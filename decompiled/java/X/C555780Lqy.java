package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lqy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.persistence.PersistenceWorkflowCenter$getRegistryFromPersistence$2$1", f = "PersistenceWorkflowCenter.kt", l = {264, 265}, m = "invokeSuspend")
public final class C555780Lqy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C555910LrB>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C555780Lqy(String str, InterfaceC1364105Vn<? super C555780Lqy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C555780Lqy(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJFF;
        C1C7U.LIZ("PersistenceWorkflowCenter@73ad.getRegistryFromPersistence$2$1");
        Object objLJFF2 = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("PersistenceWorkflowCenter@73ad.getRegistryFromPersistence$2$1");
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            objLJFF = ((C189200o6) obj).m10unboximpl();
        } else {
            C155000ia.LIZIZ(obj);
            C2267651DpL c2267651DpL = C2267651DpL.LIZ;
            C806320Vk6 c806320Vk6LJ = C2267651DpL.LJ();
            String str = this.LLILLJJLI;
            this.LL = 1;
            objLJFF = c806320Vk6LJ.LJFF(str, this);
            if (objLJFF == objLJFF2) {
                C1C7U.LIZIZ("PersistenceWorkflowCenter@73ad.getRegistryFromPersistence$2$1");
                return objLJFF2;
            }
        }
        if (C189200o6.m7isFailureimpl(objLJFF)) {
            objLJFF = null;
        }
        C555820Lr2 c555820Lr2 = (C555820Lr2) objLJFF;
        if (c555820Lr2 == null) {
            C1C7U.LIZIZ("PersistenceWorkflowCenter@73ad.getRegistryFromPersistence$2$1");
            return null;
        }
        C555800Lr0 c555800Lr0 = C555800Lr0.LIZ;
        String str2 = c555820Lr2.LJFF;
        String str3 = c555820Lr2.LJI;
        this.LL = 2;
        obj = c555800Lr0.LIZ(str2, str3, this);
        if (obj == objLJFF2) {
            C1C7U.LIZIZ("PersistenceWorkflowCenter@73ad.getRegistryFromPersistence$2$1");
            return objLJFF2;
        }
        C1C7U.LIZIZ("PersistenceWorkflowCenter@73ad.getRegistryFromPersistence$2$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C555910LrB> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
