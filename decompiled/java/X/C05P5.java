package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05P5, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.main.ScrollableBarOverlayKt$ScrollableBarOverlay$1$1$2$1", f = "ScrollableBarOverlay.kt", l = {131}, m = "invokeSuspend")
public final class C05P5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C05P0<Boolean> LLILLL;
    public final /* synthetic */ C05P1<Float> LLILZ;
    public final /* synthetic */ C05P0<Boolean> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05P5(boolean z, C05P0<Boolean> c05p0, C05P1<Float> c05p1, C05P0<Boolean> c05p02, InterfaceC1364105Vn<? super C05P5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c05p0;
        this.LLILZ = c05p1;
        this.LLILZIL = c05p02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05P5(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ScrollableBarOverlayKt@a305.ScrollableBarOverlay$1$1$2$1");
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
            if (this.LLILLJJLI) {
                this.LLILLL.setValue(Boolean.TRUE);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ScrollableBarOverlayKt@a305.ScrollableBarOverlay$1$1$2$1");
                return unit;
            }
            if (this.LLILZ.getValue().floatValue() == 1.0f) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(3000L, this) == objLJFF) {
                    C1C7U.LIZIZ("ScrollableBarOverlayKt@a305.ScrollableBarOverlay$1$1$2$1");
                    return objLJFF;
                }
            }
        }
        if (!C1668980tX6.LIZIZ(this.LLILZIL)) {
            this.LLILLL.setValue(Boolean.FALSE);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ScrollableBarOverlayKt@a305.ScrollableBarOverlay$1$1$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
