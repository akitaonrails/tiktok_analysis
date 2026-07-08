package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05AT, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.tux.compose.internal.BackgroundDetect_androidKt$BackgroundDetect$2$1$1$1$onBackgroundStyleChanged$1", f = "BackgroundDetect.android.kt", l = {}, m = "invokeSuspend")
public final class C05AT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C05P0<Boolean> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05AT(boolean z, C05P0<Boolean> c05p0, InterfaceC1364105Vn<? super C05AT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05AT(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BackgroundDetect_androidKt@c0df.BackgroundDetect$2$1$1$1$onBackgroundStyleChanged$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.setValue(Boolean.valueOf(this.LL));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BackgroundDetect_androidKt@c0df.BackgroundDetect$2$1$1$1$onBackgroundStyleChanged$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
