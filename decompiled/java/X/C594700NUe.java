package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NUe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationFragmentKt$Content$8$1", f = "MessageNotificationFragment.kt", l = {}, m = "invokeSuspend")
public final class C594700NUe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<Integer, Unit> LL;
    public final /* synthetic */ C05P1<Integer> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C594700NUe(Function1<? super Integer, Unit> function1, C05P1<Integer> c05p1, InterfaceC1364105Vn<? super C594700NUe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = c05p1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C594700NUe(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageNotificationFragmentKt@df82.Content$8$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(C2286608xc.LJ(this.LLILLJJLI.getValue().intValue()));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageNotificationFragmentKt@df82.Content$8$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
