package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05o5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.ies.im.core.client.ConversationModelImpl$updateLocalExtNoInfoCallback$2", f = "ConversationModelImpl.kt", l = {}, m = "invokeSuspend")
public final class C1463105o5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C866530Xz1 LL;
    public final /* synthetic */ Map<String, String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1463105o5(C866530Xz1 c866530Xz1, Map<String, String> map, InterfaceC1364105Vn<? super C1463105o5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c866530Xz1;
        this.LLILLJJLI = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1463105o5(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ConversationModelImpl@4b41.updateLocalExtNoInfoCallback$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIJI().LJZL(this.LL.LIZIZ, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ConversationModelImpl@4b41.updateLocalExtNoInfoCallback$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
