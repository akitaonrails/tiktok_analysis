package X;

import Y.AgS193S0200000_2;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS546S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05UA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.main.ScrollableBarOverlayKt$ScrollableBarOverlay$2$1", f = "ScrollableBarOverlay.kt", l = {177}, m = "invokeSuspend")
public final class C05UA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1690050u55 LLILLJJLI;
    public final /* synthetic */ InterfaceC1690500u5o LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Function1<Integer, String> LLILZIL;
    public final /* synthetic */ float LLILZLL;
    public final /* synthetic */ C05P0<Boolean> LLIZ;
    public final /* synthetic */ C05P0<String> LLIZLLLIL;
    public final /* synthetic */ C05P0<Float> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05UA(C1690050u55 c1690050u55, InterfaceC1690500u5o interfaceC1690500u5o, int i, Function1<? super Integer, String> function1, float f, C05P0<Boolean> c05p0, C05P0<String> c05p02, C05P0<Float> c05p03, InterfaceC1364105Vn<? super C05UA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1690050u55;
        this.LLILLL = interfaceC1690500u5o;
        this.LLILZ = i;
        this.LLILZIL = function1;
        this.LLILZLL = f;
        this.LLIZ = c05p0;
        this.LLIZLLLIL = c05p02;
        this.LLJ = c05p03;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05UA(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ScrollableBarOverlayKt@a305.ScrollableBarOverlay$2$1");
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
            final InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(C20028913Yh.LJIIIZ(new AwS546S0100000_2(this.LLILLJJLI, 811)));
            final InterfaceC1690500u5o interfaceC1690500u5o = this.LLILLL;
            final int i2 = this.LLILZ;
            final Function1<Integer, String> function1 = this.LLILZIL;
            final C1690050u55 c1690050u55 = this.LLILLJJLI;
            final float f = this.LLILZLL;
            final C05P0<Boolean> c05p0 = this.LLIZ;
            InterfaceC346201Wa<Pair<? extends Float, ? extends String>> interfaceC346201Wa = new InterfaceC346201Wa<Pair<? extends Float, ? extends String>>() { // from class: X.05UB
                @Override // X.InterfaceC346201Wa
                public final Object collect(InterfaceC346701Wf<? super Pair<? extends Float, ? extends String>> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Object objCollect = interfaceC346201WaLJIILL.collect(new C05UD(interfaceC346701Wf, interfaceC1690500u5o, i2, function1, c1690050u55, f, c05p0), interfaceC1364105Vn);
                    if (objCollect == C099R.LJFF()) {
                        return objCollect;
                    }
                    return Unit.LIZ;
                }
            };
            AgS193S0200000_2 agS193S0200000_2 = new AgS193S0200000_2(this.LLIZLLLIL, this.LLJ, 12);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS193S0200000_2, this) == objLJFF) {
                C1C7U.LIZIZ("ScrollableBarOverlayKt@a305.ScrollableBarOverlay$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ScrollableBarOverlayKt@a305.ScrollableBarOverlay$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
