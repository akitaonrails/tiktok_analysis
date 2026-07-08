package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CVC, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.multiconversation.TakoSubConversationDrawerView$bindDrawerNetworkRecoveryIfNeeded$1$1", f = "TakoSubConversationDrawerView.kt", l = {}, m = "invokeSuspend")
public final class C0CVC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1863240yaQ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CVC(C1863240yaQ c1863240yaQ, InterfaceC1364105Vn<? super C0CVC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1863240yaQ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CVC(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoSubConversationDrawerView@c860.bindDrawerNetworkRecoveryIfNeeded$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJJII();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoSubConversationDrawerView@c860.bindDrawerNetworkRecoveryIfNeeded$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
