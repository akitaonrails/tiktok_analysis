package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05AL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.main.ScrollableBarOverlayKt$ScrollableBarOverlay$3$1$1$1$1", f = "ScrollableBarOverlay.kt", l = {}, m = "invokeSuspend")
public final class C05AL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C05P0<Boolean> LL;
    public final /* synthetic */ C05P0<Boolean> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05AL(C05P0<Boolean> c05p0, C05P0<Boolean> c05p02, InterfaceC1364105Vn<? super C05AL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c05p0;
        this.LLILLJJLI = c05p02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05AL(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ScrollableBarOverlayKt@a305.ScrollableBarOverlay$3$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C05P0<Boolean> c05p0 = this.LL;
        Boolean bool = Boolean.TRUE;
        c05p0.setValue(bool);
        this.LLILLJJLI.setValue(bool);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ScrollableBarOverlayKt@a305.ScrollableBarOverlay$3$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
