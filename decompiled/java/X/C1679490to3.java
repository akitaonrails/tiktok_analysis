package X;

import Y.AgS76S0400000_25;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;
import njp.a;

/* JADX INFO: renamed from: X.0to3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.view.TakoAIVideoInputKt$ImeHideAutoBackToText$2$1", f = "TakoAIVideoInput.kt", l = {184, 188}, m = "invokeSuspend")
public final class C1679490to3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1679620toG LLILLJJLI;
    public final /* synthetic */ InterfaceC1679450tnz LLILLL;
    public final /* synthetic */ InterfaceC1686540tzQ LLILZ;
    public final /* synthetic */ Function1<EnumC1679580toC, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1679490to3(C1679620toG c1679620toG, InterfaceC1679450tnz interfaceC1679450tnz, InterfaceC1686540tzQ interfaceC1686540tzQ, Function1<? super EnumC1679580toC, Unit> function1, InterfaceC1364105Vn<? super C1679490to3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1679620toG;
        this.LLILLL = interfaceC1679450tnz;
        this.LLILZ = interfaceC1686540tzQ;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1679490to3(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoInputKt@4105.ImeHideAutoBackToText$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoAIVideoInputKt@4105.ImeHideAutoBackToText$2$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("TakoAIVideoInputKt@4105.ImeHideAutoBackToText$2$1");
                return objLJFF;
            }
        }
        C013C c013c = new C013C();
        C095D c095dLJIIIZ = C20028913Yh.LJIIIZ(new AwS569S0100000_25(this.LLILLJJLI, 776));
        AgS76S0400000_25 agS76S0400000_25 = new AgS76S0400000_25(c013c, this.LLILLL, this.LLILZ, this.LLILZIL, 1);
        this.LL = 2;
        if (c095dLJIIIZ.collect(agS76S0400000_25, this) == objLJFF) {
            C1C7U.LIZIZ("TakoAIVideoInputKt@4105.ImeHideAutoBackToText$2$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoAIVideoInputKt@4105.ImeHideAutoBackToText$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
