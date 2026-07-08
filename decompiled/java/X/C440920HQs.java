package X;

import Y.AgS287S0100000_6;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.cells.ResultV2Cell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HQs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.cells.ResultV2Cell$onBindItemView$2", f = "ResultV2Cell.kt", l = {71}, m = "invokeSuspend")
public final class C440920HQs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0HQX LLILLJJLI;
    public final /* synthetic */ ResultV2Cell LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C440920HQs(C0HQX c0hqx, ResultV2Cell resultV2Cell, InterfaceC1364105Vn<? super C440920HQs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0hqx;
        this.LLILLL = resultV2Cell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C440920HQs(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ResultV2Cell@899f.onBindItemView$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC332260D0u<String> interfaceC332260D0u = this.LLILLJJLI.LLILLL;
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLL, 146);
            this.LL = 1;
            if (interfaceC332260D0u.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("ResultV2Cell@899f.onBindItemView$2");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
