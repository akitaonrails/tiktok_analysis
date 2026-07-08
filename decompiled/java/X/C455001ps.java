package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.common.platform_misc.StorageKevaService$ensureInitedAsync$1", f = "StorageKevaService.kt", l = {94}, m = "invokeSuspend")
public final class C455001ps extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1849210yDn LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C455001ps(C1849210yDn c1849210yDn, InterfaceC1364105Vn<? super C455001ps> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1849210yDn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C455001ps c455001ps = new C455001ps(this.LLILLL, interfaceC1364105Vn);
        c455001ps.LLILLJJLI = obj;
        return c455001ps;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StorageKevaService@753b.ensureInitedAsync$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1849210yDn c1849210yDn = this.LLILLL;
                this.LL = 1;
                if (c1849210yDn.LJ(this) == objLJFF) {
                    C1C7U.LIZIZ("StorageKevaService@753b.ensureInitedAsync$1");
                    return objLJFF;
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StorageKevaService@753b.ensureInitedAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
