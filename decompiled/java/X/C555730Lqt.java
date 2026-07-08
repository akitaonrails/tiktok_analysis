package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lqt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.persistence.PersistenceWorkflowCenter$getWorkflowsByBusinessSource$2$1", f = "PersistenceWorkflowCenter.kt", l = {218}, m = "invokeSuspend")
public final class C555730Lqt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C552940LmO>>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C555730Lqt(String str, InterfaceC1364105Vn<? super C555730Lqt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C555730Lqt(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJII;
        Object arrayList;
        C1C7U.LIZ("PersistenceWorkflowCenter@73ad.getWorkflowsByBusinessSource$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJII = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C2267651DpL c2267651DpL = C2267651DpL.LIZ;
            C806320Vk6 c806320Vk6LJ = C2267651DpL.LJ();
            String str = this.LLILLJJLI;
            this.LL = 1;
            objLJII = c806320Vk6LJ.LJII(str, this);
            if (objLJII == objLJFF) {
                C1C7U.LIZIZ("PersistenceWorkflowCenter@73ad.getWorkflowsByBusinessSource$2$1");
                return objLJFF;
            }
        }
        if (C189200o6.m7isFailureimpl(objLJII)) {
            objLJII = null;
        }
        List<C555820Lr2> list = (List) objLJII;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (C555820Lr2 c555820Lr2 : list) {
                C555800Lr0.LIZ.getClass();
                arrayList.add(C555800Lr0.LIZJ(c555820Lr2));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        C1C7U.LIZIZ("PersistenceWorkflowCenter@73ad.getWorkflowsByBusinessSource$2$1");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C552940LmO>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
