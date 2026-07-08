package X;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Y5W, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.metric.InitMetricsHelper$trackGetByUserInitRequestEnd$1", f = "InitMetricsHelper.kt", l = {}, m = "invokeSuspend")
public final class C0Y5W extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0YCR LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y5W(C0YCR c0ycr, int i, InterfaceC1364105Vn<? super C0Y5W> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0ycr;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Y5W(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int length;
        C1C7U.LIZ("InitMetricsHelper@8acf.trackGetByUserInitRequestEnd$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIILL.add(C2286608xc.LJ(this.LLILLJJLI));
        int size = this.LL.LJIILL.size();
        C870830YEf c870830YEfLJIIIZ = this.LL.LIZ.LJIIIZ();
        int[] iArr = c870830YEfLJIIIZ.LJIIJJI;
        if (iArr == null && (iArr = c870830YEfLJIIIZ.LJIIJ) == null) {
            length = 0;
        } else {
            length = iArr.length;
        }
        if (size == length) {
            this.LL.LJIIIZ = SystemClock.uptimeMillis();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InitMetricsHelper@8acf.trackGetByUserInitRequestEnd$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
