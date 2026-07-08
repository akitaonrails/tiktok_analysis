package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.098l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.ui.CountDownTextView$startCountDown$3", f = "CountDownTextView.kt", l = {}, m = "invokeSuspend")
public final class C23233098l extends C09AX implements Function2<Long, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ long LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C23236098o LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23233098l(boolean z, C23236098o c23236098o, InterfaceC1364105Vn<? super C23233098l> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c23236098o;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C23233098l c23233098l = new C23233098l(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c23233098l.LL = ((Number) obj).longValue();
        return c23233098l;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CountDownTextView@eb04.startCountDown$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long j = this.LL;
        if (this.LLILLJJLI) {
            C23236098o c23236098o = this.LLILLL;
            c23236098o.getClass();
            c23236098o.setText(C497740JfY.LJIJJ(2131853598, Long.valueOf(C19990113Jj.LJIIJJI(C19990313Jl.LJIIIIZZ(j, EnumC19990213Jk.MILLISECONDS)))));
        } else {
            this.LLILLL.LJJJJIZL(j);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CountDownTextView@eb04.startCountDown$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Long l, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(Long.valueOf(l.longValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
