package X;

import Y.AgS305S0100000_25;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS153S0400000_25;
import njp.a;

/* JADX INFO: renamed from: X.0tnx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.customize.ui.CustomizePromptInputKt$CustomizePromptInput$3$1", f = "CustomizePromptInput.kt", l = {155}, m = "invokeSuspend")
public final class C1679430tnx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05P0<Boolean> LLILLJJLI;
    public final /* synthetic */ C1689390u41 LLILLL;
    public final /* synthetic */ C05P0<C1686970u07> LLILZ;
    public final /* synthetic */ C05P0<C1692150u8T> LLILZIL;
    public final /* synthetic */ C05P0<Integer> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1679430tnx(C05P0<Boolean> c05p0, C1689390u41 c1689390u41, C05P0<C1686970u07> c05p02, C05P0<C1692150u8T> c05p03, C05P0<Integer> c05p04, InterfaceC1364105Vn<? super C1679430tnx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05p0;
        this.LLILLL = c1689390u41;
        this.LLILZ = c05p02;
        this.LLILZIL = c05p03;
        this.LLILZLL = c05p04;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1679430tnx(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CustomizePromptInputKt@e97e.CustomizePromptInput$3$1");
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
            if (!this.LLILLJJLI.getValue().booleanValue()) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CustomizePromptInputKt@e97e.CustomizePromptInput$3$1");
                return unit;
            }
            C095D c095dLJIIIZ = C20028913Yh.LJIIIZ(new AwS153S0400000_25(this.LLILLL, (C1689390u41) this.LLILZ, (C05P0<C1686970u07>) this.LLILZIL, (C05P0<C1692150u8T>) this.LLILZLL, (C05P0<Integer>) 17));
            AgS305S0100000_25 agS305S0100000_25 = new AgS305S0100000_25(this.LLILLL, 43);
            this.LL = 1;
            if (c095dLJIIIZ.collect(agS305S0100000_25, this) == objLJFF) {
                C1C7U.LIZIZ("CustomizePromptInputKt@e97e.CustomizePromptInput$3$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CustomizePromptInputKt@e97e.CustomizePromptInput$3$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
