package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0910, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.utils.GlobalAsyncTaskHandler$processQueue$1", f = "GlobalAsyncTaskHandler.kt", l = {58}, m = "invokeSuspend")
public final class AnonymousClass0910 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0910(String str, InterfaceC1364105Vn<? super AnonymousClass0910> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0910(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        C1C7U.LIZ("GlobalAsyncTaskHandler@3a85.processQueue$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                AnonymousClass0913.LJFF.acquire();
                String str = this.LLILLJJLI;
                this.LL = 1;
                Object objLJJZ = C23250099c.LIZLLL((InterfaceC497601wk) AnonymousClass0913.LIZIZ.getValue(), null, null, new AnonymousClass0911(str, null), 3).LJJZ(this);
                if (objLJJZ != C099R.LJFF()) {
                    objLJJZ = Unit.LIZ;
                }
                if (objLJJZ == objLJFF) {
                    C1C7U.LIZIZ("GlobalAsyncTaskHandler@3a85.processQueue$1");
                    return objLJFF;
                }
            }
            AnonymousClass0913.LJFF.release();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("GlobalAsyncTaskHandler@3a85.processQueue$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AnonymousClass0913.LJFF.release();
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
