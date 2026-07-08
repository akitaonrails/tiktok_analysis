package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05GD, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.preload.IMPreloadStrategyManager$1", f = "IMPreloadService.kt", l = {74}, m = "invokeSuspend")
public final class C05GD extends C09AX implements Function2<Object, InterfaceC1364105Vn<? super List<? extends InterfaceC1329505If>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C06TA LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05GD(C06TA c06ta, InterfaceC1364105Vn<? super C05GD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c06ta;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05GD c05gd = new C05GD(this.LLILLL, interfaceC1364105Vn);
        c05gd.LLILLJJLI = obj;
        return c05gd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMPreloadStrategyManager@518e.<init>$1");
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
            C06TA c06ta = this.LLILLL;
            this.LL = 1;
            obj = c06ta.LIZLLL(obj2);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMPreloadStrategyManager@518e.<init>$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("IMPreloadStrategyManager@518e.<init>$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super List<? extends InterfaceC1329505If>> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
