package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Wn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.live.leadgen.pincard.CountDownTextView$startCountDown$3", f = "CountDownTextView.kt", l = {}, m = "invokeSuspend")
public final class C347501Wn extends C09AX implements Function2<Long, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ long LL;
    public final /* synthetic */ C23237098p LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C347501Wn(C23237098p c23237098p, InterfaceC1364105Vn<? super C347501Wn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c23237098p;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C347501Wn c347501Wn = new C347501Wn(this.LLILLJJLI, interfaceC1364105Vn);
        c347501Wn.LL = ((Number) obj).longValue();
        return c347501Wn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CountDownTextView@8a2b.startCountDown$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.LJJJJJ(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CountDownTextView@8a2b.startCountDown$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Long l, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(Long.valueOf(l.longValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
