package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IAE, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SendMessageViewModel$sendMessage$6$result$1", f = "SendMessageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0IAE extends C09AX implements Function2<C0IAH<? extends Object>, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C0IAE(InterfaceC1364105Vn<? super C0IAE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0IAE c0iae = new C0IAE(interfaceC1364105Vn);
        c0iae.LL = obj;
        return c0iae;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SendMessageViewModel@52c6.sendMessage$6$result$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(!(this.LL instanceof C0IAD));
        C1C7U.LIZIZ("SendMessageViewModel@52c6.sendMessage$6$result$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0IAH<? extends Object> c0iah, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c0iah, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
