package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06AK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.DmHelper$markLastPropertyRead$2$1", f = "DmHelper.kt", l = {}, m = "invokeSuspend")
public final class C06AK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0Y8T LL;
    public final /* synthetic */ Map<String, String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06AK(C0Y8T c0y8t, Map<String, String> map, InterfaceC1364105Vn<? super C06AK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0y8t;
        this.LLILLJJLI = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06AK(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DmHelper@d68.markLastPropertyRead$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0YNP.LIZIZ(this.LL.getConversationId()).LJJ(this.LLILLJJLI, new C1768906wJ(2));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DmHelper@d68.markLastPropertyRead$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
