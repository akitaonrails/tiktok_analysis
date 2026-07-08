package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10M6, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.innerpush.utils.InnerPushSmartRouterHandler$jumpWithRouter$1$7", f = "InnerPushSmartRouterHandler.kt", l = {}, m = "invokeSuspend")
public final class C10M6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InnerPushMessage LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10M6(InnerPushMessage innerPushMessage, int i, InterfaceC1364105Vn<? super C10M6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = innerPushMessage;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C10M6(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InnerPushSmartRouterHandler@97a7.jumpWithRouter$1$7");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InnerPushMessage innerPushMessage = this.LL;
        if (innerPushMessage != null) {
            int i = this.LLILLJJLI;
            C10M5.LIZ.getClass();
            C19331210k2.LIZ.getClass();
            C19331210k2.LJIILJJIL(i, innerPushMessage, "click");
            C19290510dT.LIZIZ("InnerPushPopupCommonView", "mobInnerPushClick... ");
            C19329510jl c19329510jl = C19329510jl.LIZ;
            EnumC19330310jt enumC19330310jt = EnumC19330310jt.CLICK;
            c19329510jl.getClass();
            C19329510jl.LIZIZ(innerPushMessage, enumC19330310jt);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InnerPushSmartRouterHandler@97a7.jumpWithRouter$1$7");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
