package X;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CSd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.ies.cutsame.prepare.ResizeMediaHelper$startResize$1", f = "ResizeMediaHelper.kt", l = {}, m = "invokeSuspend")
public final class C313890CSd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0L8Y LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ List<C0L8Q> LLILLL;
    public final /* synthetic */ Function1<Float, Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C313890CSd(C0L8Y c0l8y, Context context, List<C0L8Q> list, Function1<? super Float, Unit> function1, Function0<Unit> function0, Function1<? super Boolean, Unit> function12, InterfaceC1364105Vn<? super C313890CSd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0l8y;
        this.LLILLJJLI = context;
        this.LLILLL = list;
        this.LLILZ = function1;
        this.LLILZIL = function0;
        this.LLILZLL = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C313890CSd(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("ResizeMediaHelper@43e6.startResize$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZJ(0, this.LLILLJJLI, this.LLILLL, this.LLILZIL, this.LLILZ, this.LLILZLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ResizeMediaHelper@43e6.startResize$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
