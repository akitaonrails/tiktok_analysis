package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05GG, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.preload.IMPreloadStrategyManager$4", f = "IMPreloadService.kt", l = {82}, m = "invokeSuspend")
public final class C05GG extends C09AX implements Function2<Object, InterfaceC1364105Vn<? super List<? extends InterfaceC1329505If>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C05KX LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05GG(C05KX c05kx, InterfaceC1364105Vn<? super C05GG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c05kx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05GG c05gg = new C05GG(this.LLILLL, interfaceC1364105Vn);
        c05gg.LLILLJJLI = obj;
        return c05gg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMPreloadStrategyManager@518e.<init>$4");
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
            C05KX c05kx = this.LLILLL;
            this.LL = 1;
            obj = c05kx.LIZLLL(obj2);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMPreloadStrategyManager@518e.<init>$4");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("IMPreloadStrategyManager@518e.<init>$4");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super List<? extends InterfaceC1329505If>> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
