package X;

import Y.AgS305S0100000_25;
import com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;
import njp.a;

/* JADX INFO: renamed from: X.0u0Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem$Input$1$1", f = "TakoAIVideoInputAssem.kt", l = {338}, m = "invokeSuspend")
public final class C1687240u0Y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05P1<C1687320u0g> LLILLJJLI;
    public final /* synthetic */ TakoAIVideoInputAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1687240u0Y(C05P1<C1687320u0g> c05p1, TakoAIVideoInputAssem takoAIVideoInputAssem, InterfaceC1364105Vn<? super C1687240u0Y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05p1;
        this.LLILLL = takoAIVideoInputAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1687240u0Y(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoInputAssem@6324.Input$1$1");
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
            C1629806Zs c1629806Zs = new C1629806Zs(C20028913Yh.LJIIIZ(new AwS569S0100000_25(this.LLILLJJLI, (C05P1<C1687320u0g>) 437)));
            AgS305S0100000_25 agS305S0100000_25 = new AgS305S0100000_25(this.LLILLL, 15);
            this.LL = 1;
            if (c1629806Zs.collect(agS305S0100000_25, this) == objLJFF) {
                C1C7U.LIZIZ("TakoAIVideoInputAssem@6324.Input$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoAIVideoInputAssem@6324.Input$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
