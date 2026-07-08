package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS546S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05PB, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.main.ScrollableBarOverlayKt$ScrollableBarOverlay$1$1", f = "ScrollableBarOverlay.kt", l = {124}, m = "invokeSuspend")
public final class C05PB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1690050u55 LLILLJJLI;
    public final /* synthetic */ InterfaceC497601wk LLILLL;
    public final /* synthetic */ C05P0<C09AE> LLILZ;
    public final /* synthetic */ C05P0<Boolean> LLILZIL;
    public final /* synthetic */ C05P1<Float> LLILZLL;
    public final /* synthetic */ C05P0<Boolean> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05PB(C1690050u55 c1690050u55, InterfaceC497601wk interfaceC497601wk, C05P0<C09AE> c05p0, C05P0<Boolean> c05p02, C05P1<Float> c05p1, C05P0<Boolean> c05p03, InterfaceC1364105Vn<? super C05PB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1690050u55;
        this.LLILLL = interfaceC497601wk;
        this.LLILZ = c05p0;
        this.LLILZIL = c05p02;
        this.LLILZLL = c05p1;
        this.LLIZ = c05p03;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05PB(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ScrollableBarOverlayKt@a305.ScrollableBarOverlay$1$1");
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
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(C20028913Yh.LJIIIZ(new AwS546S0100000_2(this.LLILLJJLI, 810)));
            final InterfaceC497601wk interfaceC497601wk = this.LLILLL;
            final C05P0<C09AE> c05p0 = this.LLILZ;
            final C05P0<Boolean> c05p02 = this.LLILZIL;
            final C05P1<Float> c05p1 = this.LLILZLL;
            final C05P0<Boolean> c05p03 = this.LLIZ;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.05P6
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    C09AE value = c05p0.getValue();
                    if (value != null) {
                        value.LIZIZ(null);
                    }
                    c05p0.setValue(C23250099c.LIZLLL(interfaceC497601wk, null, null, new C05P5(zBooleanValue, c05p02, c05p1, c05p03, null), 3));
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("ScrollableBarOverlayKt@a305.ScrollableBarOverlay$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ScrollableBarOverlayKt@a305.ScrollableBarOverlay$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
