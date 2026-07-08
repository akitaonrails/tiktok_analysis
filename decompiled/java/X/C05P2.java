package X;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05P2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.view.compose.FisheyeUtilsKt$recordCenterTouchForwarder$1$2$1$1", f = "FisheyeUtils.kt", l = {76}, m = "invokeSuspend")
public final class C05P2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ Function1<MotionEvent, Unit> LLILLL;
    public final /* synthetic */ C05P0<MotionEvent> LLILZ;
    public final /* synthetic */ C05P1<Boolean> LLILZIL;
    public final /* synthetic */ C05P0<Boolean> LLILZLL;
    public final /* synthetic */ C05P0<C09AE> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05P2(long j, Function1<? super MotionEvent, Unit> function1, C05P0<MotionEvent> c05p0, C05P1<Boolean> c05p1, C05P0<Boolean> c05p02, C05P0<C09AE> c05p03, InterfaceC1364105Vn<? super C05P2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = function1;
        this.LLILZ = c05p0;
        this.LLILZIL = c05p1;
        this.LLILZLL = c05p02;
        this.LLIZ = c05p03;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05P2(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FisheyeUtilsKt@9a16.recordCenterTouchForwarder$1$2$1$1");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("FisheyeUtilsKt@9a16.recordCenterTouchForwarder$1$2$1$1");
                return objLJFF;
            }
        }
        MotionEvent value = this.LLILZ.getValue();
        if (!this.LLILZIL.getValue().booleanValue() && value != null) {
            this.LLILLL.invoke(value);
            this.LLILZLL.setValue(Boolean.TRUE);
        }
        this.LLIZ.setValue(null);
        this.LLILZ.setValue(null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FisheyeUtilsKt@9a16.recordCenterTouchForwarder$1$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
