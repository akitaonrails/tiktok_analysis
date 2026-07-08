package X;

import Y.AgS169S0300000_18;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS78S0500000_18;
import njp.a;

/* JADX INFO: renamed from: X.0gQX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.customize.ui.CustomizeImeStateKt$rememberComposeImeState$1$1", f = "CustomizeImeState.kt", l = {135}, m = "invokeSuspend")
public final class C1165190gQX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1672820tdI LLILLJJLI;
    public final /* synthetic */ InterfaceC1690500u5o LLILLL;
    public final /* synthetic */ InterfaceC1672820tdI LLILZ;
    public final /* synthetic */ InterfaceC1672820tdI LLILZIL;
    public final /* synthetic */ InterfaceC1672820tdI LLILZLL;
    public final /* synthetic */ C05P0<Boolean> LLIZ;
    public final /* synthetic */ InterfaceC1676320tiw LLIZLLLIL;
    public final /* synthetic */ InterfaceC1676320tiw LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165190gQX(InterfaceC1672820tdI interfaceC1672820tdI, InterfaceC1690500u5o interfaceC1690500u5o, InterfaceC1672820tdI interfaceC1672820tdI2, InterfaceC1672820tdI interfaceC1672820tdI3, InterfaceC1672820tdI interfaceC1672820tdI4, C05P0<Boolean> c05p0, InterfaceC1676320tiw interfaceC1676320tiw, InterfaceC1676320tiw interfaceC1676320tiw2, InterfaceC1364105Vn<? super C1165190gQX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1672820tdI;
        this.LLILLL = interfaceC1690500u5o;
        this.LLILZ = interfaceC1672820tdI2;
        this.LLILZIL = interfaceC1672820tdI3;
        this.LLILZLL = interfaceC1672820tdI4;
        this.LLIZ = c05p0;
        this.LLIZLLLIL = interfaceC1676320tiw;
        this.LLJ = interfaceC1676320tiw2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1165190gQX(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CustomizeImeStateKt@733f.rememberComposeImeState$1$1");
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
            C095D c095dLJIIIZ = C20028913Yh.LJIIIZ(new AwS78S0500000_18(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, 4));
            AgS169S0300000_18 agS169S0300000_18 = new AgS169S0300000_18(this.LLIZ, this.LLIZLLLIL, this.LLJ, 1);
            this.LL = 1;
            if (c095dLJIIIZ.collect(agS169S0300000_18, this) == objLJFF) {
                C1C7U.LIZIZ("CustomizeImeStateKt@733f.rememberComposeImeState$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CustomizeImeStateKt@733f.rememberComposeImeState$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
