package X;

import com.ss.android.ugc.aweme.series.voucher.utils.SeriesCountDownTimer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05Fc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.voucher.utils.SeriesCountDownTimer$startUpdatingExpiry$1", f = "SeriesCountDownTimer.kt", l = {47}, m = "invokeSuspend")
public final class C1321405Fc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ SeriesCountDownTimer LLILLL;
    public final /* synthetic */ Function1<C1613590s5l, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1321405Fc(long j, SeriesCountDownTimer seriesCountDownTimer, Function1<? super C1613590s5l, Unit> function1, InterfaceC1364105Vn<? super C1321405Fc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = seriesCountDownTimer;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1321405Fc(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeriesCountDownTimer@7a99.startUpdatingExpiry$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C155000ia.LIZIZ(obj);
        do {
            C1613590s5l c1613590s5l = new C1613590s5l(this.LLILLJJLI - System.currentTimeMillis());
            if (!Intrinsics.LJFF(this.LLILLL.LLILLJJLI, c1613590s5l)) {
                SeriesCountDownTimer seriesCountDownTimer = this.LLILLL;
                Function1<C1613590s5l, Unit> function1 = this.LLILZ;
                seriesCountDownTimer.LLILLJJLI = c1613590s5l;
                function1.invoke(c1613590s5l);
            }
            this.LL = 1;
        } while (AnonymousClass0958.LIZIZ(100L, this) != objLJFF);
        C1C7U.LIZIZ("SeriesCountDownTimer@7a99.startUpdatingExpiry$1");
        return objLJFF;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
