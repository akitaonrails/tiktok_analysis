package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS50S0010000_4;
import njp.a;

/* JADX INFO: renamed from: X.0ChZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.handlers.MessageOperatorHandler$waitReply$3", f = "MessageOperatorHandler.kt", l = {}, m = "invokeSuspend")
public final class C320630ChZ extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ boolean LL;

    public C320630ChZ(InterfaceC1364105Vn<? super C320630ChZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C320630ChZ c320630ChZ = new C320630ChZ(interfaceC1364105Vn);
        c320630ChZ.LL = ((Boolean) obj).booleanValue();
        return c320630ChZ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageOperatorHandler@3dad.waitReply$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LL;
        C320870Chx.LIZ(new AwS50S0010000_4(z, 0), false);
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("MessageOperatorHandler@3dad.waitReply$3");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
