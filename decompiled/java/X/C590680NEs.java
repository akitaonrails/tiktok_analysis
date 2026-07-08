package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS195S0000000_9;
import njp.a;

/* JADX INFO: renamed from: X.0NEs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.utils.IntelligentPopupHelper$onGetResult$2", f = "IntelligentPopupHelper.kt", l = {}, m = "invokeSuspend")
public final class C590680NEs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<Boolean, Unit> LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C590680NEs(InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C590680NEs(interfaceC1364105Vn, this.LL, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IntelligentPopupHelper@68.onGetResult$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C609580NvY c609580NvY = C609580NvY.LIZ;
        AFwS195S0000000_9 aFwS195S0000000_9 = AFwS195S0000000_9.get$arr$(281);
        c609580NvY.getClass();
        C609580NvY.LIZLLL(aFwS195S0000000_9);
        this.LL.invoke(Boolean.valueOf(this.LLILLJJLI));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IntelligentPopupHelper@68.onGetResult$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
