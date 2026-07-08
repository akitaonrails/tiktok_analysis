package X;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01op, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.ies.cutsame.prepare.ReverseVideoHelper$startReverse$1", f = "ReverseVideoHelper.kt", l = {}, m = "invokeSuspend")
public final class C448501op extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<C0L8Q> LL;
    public final /* synthetic */ C0LDZ LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;
    public final /* synthetic */ Function1<Float, Unit> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C448501op(List<C0L8Q> list, C0LDZ c0ldz, Context context, Function1<? super Boolean, Unit> function1, Function1<? super Float, Unit> function12, Function0<Unit> function0, InterfaceC1364105Vn<? super C448501op> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c0ldz;
        this.LLILLL = context;
        this.LLILZ = function1;
        this.LLILZIL = function12;
        this.LLILZLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C448501op(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReverseVideoHelper@afe3.startReverse$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.isEmpty()) {
            this.LLILLJJLI.LIZ(0, this.LLILLL, this.LL, this.LLILZLL, this.LLILZ, this.LLILZIL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReverseVideoHelper@afe3.startReverse$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
