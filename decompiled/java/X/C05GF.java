package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05GF, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.preload.IMPreloadStrategyManager$3", f = "IMPreloadService.kt", l = {79}, m = "invokeSuspend")
public final class C05GF extends C09AX implements Function2<Object, InterfaceC1364105Vn<? super List<? extends InterfaceC1329505If>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C05GQ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05GF(C05GQ c05gq, InterfaceC1364105Vn<? super C05GF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c05gq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05GF c05gf = new C05GF(this.LLILLL, interfaceC1364105Vn);
        c05gf.LLILLJJLI = obj;
        return c05gf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMPreloadStrategyManager@518e.<init>$3");
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
            Object obj2 = this.LLILLJJLI;
            C05GQ c05gq = this.LLILLL;
            this.LL = 1;
            obj = c05gq.LIZLLL(obj2);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMPreloadStrategyManager@518e.<init>$3");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("IMPreloadStrategyManager@518e.<init>$3");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super List<? extends InterfaceC1329505If>> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
