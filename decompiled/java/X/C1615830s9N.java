package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS568S0100000_24;
import njp.a;

/* JADX INFO: renamed from: X.0s9N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multimatch.business.dialog.onlygiftselect.MatchOnlyGiftSelectUIKt$MatchOnlyGiftSelectUI$1$1", f = "MatchOnlyGiftSelectUI.kt", l = {74}, m = "invokeSuspend")
public final class C1615830s9N extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1615840s9O LLILLJJLI;
    public final /* synthetic */ C1690080u58 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1615830s9N(C1615840s9O c1615840s9O, C1690080u58 c1690080u58, InterfaceC1364105Vn<? super C1615830s9N> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1615840s9O;
        this.LLILLL = c1690080u58;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1615830s9N(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MatchOnlyGiftSelectUIKt@9454.MatchOnlyGiftSelectUI$1$1");
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
            C095D c095dLJIIIZ = C20028913Yh.LJIIIZ(new AwS568S0100000_24(this.LLILLL, 20));
            C1615840s9O c1615840s9O = this.LLILLJJLI;
            this.LL = 1;
            if (c095dLJIIIZ.collect(c1615840s9O, this) == objLJFF) {
                C1C7U.LIZIZ("MatchOnlyGiftSelectUIKt@9454.MatchOnlyGiftSelectUI$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MatchOnlyGiftSelectUIKt@9454.MatchOnlyGiftSelectUI$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
