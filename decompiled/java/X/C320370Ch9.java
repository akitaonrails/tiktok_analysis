package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS50S0010000_4;
import njp.a;

/* JADX INFO: renamed from: X.0Ch9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler$waitReply$3", f = "MessageOperatorHandler.kt", l = {}, m = "invokeSuspend")
public final class C320370Ch9 extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ boolean LL;

    public C320370Ch9(InterfaceC1364105Vn<? super C320370Ch9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C320370Ch9 c320370Ch9 = new C320370Ch9(interfaceC1364105Vn);
        c320370Ch9.LL = ((Boolean) obj).booleanValue();
        return c320370Ch9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageOperatorHandler@b589.waitReply$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LL;
        String str = C1863280yaU.LJIILLIIL;
        C1870240yli.LIZ(new AwS50S0010000_4(z, 1), false);
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("MessageOperatorHandler@b589.waitReply$3");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
