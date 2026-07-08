package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05T0, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssemKt$TakoAIVideoChatListBox$1$1", f = "TakoAIVideoInputAssem.kt", l = {681}, m = "invokeSuspend")
public final class C05T0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLJJLI;
    public final /* synthetic */ C05P1<C05TC> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05T0(C1677480tko<Float, C1677280tkU> c1677480tko, C05P1<? extends C05TC> c05p1, InterfaceC1364105Vn<? super C05T0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1677480tko;
        this.LLILLL = c05p1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05T0(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoInputAssemKt@20a7.TakoAIVideoChatListBox$1$1");
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
            if (this.LLILLL.getValue() == C05TC.SHOW_AWEME_INSTANT) {
                C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILLJJLI;
                Float fLIZLLL = C2286608xc.LIZLLL(0.0f);
                this.LL = 1;
                if (c1677480tko.LJFF(fLIZLLL, this) == objLJFF) {
                    C1C7U.LIZIZ("TakoAIVideoInputAssemKt@20a7.TakoAIVideoChatListBox$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoAIVideoInputAssemKt@20a7.TakoAIVideoChatListBox$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
