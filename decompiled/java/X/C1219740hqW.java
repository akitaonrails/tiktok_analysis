package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hqW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.pipeline.handler.PPSingleProcessHandler$doProcess$2$1$asyncTask$1", f = "PPSingleProcessHandler.kt", l = {29}, m = "invokeSuspend")
public final class C1219740hqW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC1219760hqY LLILLJJLI;
    public final /* synthetic */ InterfaceC19526511aR LLILLL;
    public final /* synthetic */ InterfaceC19526611aS LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219740hqW(AbstractC1219760hqY abstractC1219760hqY, InterfaceC19526511aR interfaceC19526511aR, InterfaceC19526611aS interfaceC19526611aS, InterfaceC1364105Vn<? super C1219740hqW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1219760hqY;
        this.LLILLL = interfaceC19526511aR;
        this.LLILZ = interfaceC19526611aS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1219740hqW(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PPSingleProcessHandler@7710.doProcess$2$1$asyncTask$1");
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
            AbstractC1219760hqY abstractC1219760hqY = this.LLILLJJLI;
            InterfaceC19526511aR interfaceC19526511aR = this.LLILLL;
            InterfaceC19526611aS interfaceC19526611aS = this.LLILZ;
            this.LL = 1;
            if (abstractC1219760hqY.LJJIJIL(interfaceC19526511aR, interfaceC19526611aS, this) == objLJFF) {
                C1C7U.LIZIZ("PPSingleProcessHandler@7710.doProcess$2$1$asyncTask$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PPSingleProcessHandler@7710.doProcess$2$1$asyncTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
