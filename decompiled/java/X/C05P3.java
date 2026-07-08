package X;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05P3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.view.compose.FisheyeUtilsKt$recordCenterTouchForwarder$1$1$1", f = "FisheyeUtils.kt", l = {}, m = "invokeSuspend")
public final class C05P3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C05P1<Boolean> LL;
    public final /* synthetic */ C05P0<C09AE> LLILLJJLI;
    public final /* synthetic */ C05P0<MotionEvent> LLILLL;
    public final /* synthetic */ C05P0<Boolean> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05P3(C05P1<Boolean> c05p1, C05P0<C09AE> c05p0, C05P0<MotionEvent> c05p02, C05P0<Boolean> c05p03, InterfaceC1364105Vn<? super C05P3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c05p1;
        this.LLILLJJLI = c05p0;
        this.LLILLL = c05p02;
        this.LLILZ = c05p03;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05P3(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FisheyeUtilsKt@9a16.recordCenterTouchForwarder$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.getValue().booleanValue()) {
            C09AE value = this.LLILLJJLI.getValue();
            if (value != null) {
                value.LIZIZ(null);
            }
            this.LLILLJJLI.setValue(null);
            MotionEvent value2 = this.LLILLL.getValue();
            if (value2 != null) {
                value2.recycle();
            }
            this.LLILLL.setValue(null);
            this.LLILZ.setValue(Boolean.FALSE);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FisheyeUtilsKt@9a16.recordCenterTouchForwarder$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
