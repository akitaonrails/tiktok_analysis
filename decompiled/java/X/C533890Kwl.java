package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kwl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.api.util.addtostory.operation.ForwardOperationManager$startCoroutineJob$1", f = "ForwardOperationManager.kt", l = {91, 94}, m = "invokeSuspend")
public final class C533890Kwl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0MK9 LLILLJJLI;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super Unit>, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C533890Kwl(C0MK9 c0mk9, Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function1, InterfaceC1364105Vn<? super C533890Kwl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0mk9;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C533890Kwl(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ForwardOperationManager@7828.startCoroutineJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Exception in coroutine job: ");
            sbLIZ.append(e.getMessage());
            C201955140j.LIZIZ("ForwardOperationManager", C2188811AlT.LIZIZ(sbLIZ));
            this.LLILLJJLI.LIZ(e);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ForwardOperationManager@7828.startCoroutineJob$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLJJLI.LIZ.LIZIZ();
            C0MMB.LIZ(this.LLILLJJLI.LIZ.LIZ);
            C1DFB c1dfb = C0PEM.LIZJ;
            C533880Kwk c533880Kwk = new C533880Kwk(null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c533880Kwk) == objLJFF) {
                C1C7U.LIZIZ("ForwardOperationManager@7828.startCoroutineJob$1");
                return objLJFF;
            }
        }
        Function1<InterfaceC1364105Vn<? super Unit>, Object> function1 = this.LLILLL;
        this.LL = 2;
        if (function1.invoke(this) == objLJFF) {
            C1C7U.LIZIZ("ForwardOperationManager@7828.startCoroutineJob$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ForwardOperationManager@7828.startCoroutineJob$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
