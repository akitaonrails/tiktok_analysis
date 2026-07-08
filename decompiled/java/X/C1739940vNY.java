package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vNY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.prefetch.manager.NativePerfetchManager$startPrefetch$job$1$1$3$1", f = "NativePerfetchManager.kt", l = {200}, m = "invokeSuspend")
public final class C1739940vNY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1739980vNc LLILLL;
    public final /* synthetic */ C1739860vNQ LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Function1<C1739860vNQ, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1739940vNY(String str, C1739980vNc c1739980vNc, C1739860vNQ c1739860vNQ, int i, Function1<? super C1739860vNQ, Unit> function1, InterfaceC1364105Vn<? super C1739940vNY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c1739980vNc;
        this.LLILZ = c1739860vNQ;
        this.LLILZIL = i;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1739940vNY(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NativePerfetchManager@9cd3.startPrefetch$job$1$1$3$1");
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
            C1739950vNZ c1739950vNZ = C1739950vNZ.LIZ;
            String str = this.LLILLJJLI;
            C1739980vNc c1739980vNc = this.LLILLL;
            C1739950vNZ.LIZIZ(c1739950vNZ, "request_start", "success", str, c1739980vNc.LIZ, null, null, null, null, null, null, c1739980vNc.LJFF, 1008);
            C1739930vNX c1739930vNX = C1739930vNX.LIZ;
            C1739980vNc c1739980vNc2 = this.LLILLL;
            C1739860vNQ c1739860vNQ = this.LLILZ;
            int i2 = this.LLILZIL;
            Function1<C1739860vNQ, Unit> function1 = this.LLILZLL;
            this.LL = 1;
            if (c1739930vNX.LIZ(c1739980vNc2, c1739860vNQ, i2, function1, this) == objLJFF) {
                C1C7U.LIZIZ("NativePerfetchManager@9cd3.startPrefetch$job$1$1$3$1");
                return objLJFF;
            }
        }
        C1740030vNh.LIZ.getClass();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NativePerfetchManager@9cd3.startPrefetch$job$1$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
