package X;

import com.ss.android.ugc.aweme.im.service.impl.AwemeFetchManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import njp.a;

/* JADX INFO: renamed from: X.0CmH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.AwemeFetchManager$getBatchAwemeCacheItem$3$fetchJob$1", f = "AwemeFetchManager.kt", l = {134}, m = "invokeSuspend")
public final class C323550CmH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ AbstractC2252651DEx LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323550CmH(List<String> list, AbstractC2252651DEx abstractC2252651DEx, InterfaceC1364105Vn<? super C323550CmH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = abstractC2252651DEx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C323550CmH(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJI;
        C1C7U.LIZ("AwemeFetchManager@5bcc.getBatchAwemeCacheItem$3$fetchJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AwemeFetchManager awemeFetchManager = AwemeFetchManager.LIZIZ;
            List<String> list = this.LLILLJJLI;
            AbstractC2252651DEx abstractC2252651DEx = this.LLILLL;
            this.LL = 1;
            awemeFetchManager.getClass();
            if (list.isEmpty() || (objLJI = C23250099c.LJI(this, abstractC2252651DEx.plus(new C346550DiH(CoroutineExceptionHandler.LJJLIL, list, 1)), new C327150Cs5(list, null))) != C099R.LJFF()) {
                objLJI = Unit.LIZ;
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("AwemeFetchManager@5bcc.getBatchAwemeCacheItem$3$fetchJob$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AwemeFetchManager@5bcc.getBatchAwemeCacheItem$3$fetchJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
