package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zj0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.data.searchcontent.CombinedSearchContentEngine$deleteMessageFromConversation$1", f = "SupervisorSearchContentUpdateEngine.kt", l = {}, m = "invokeSuspend")
public final class C907560Zj0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C907600Zj4 LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C907560Zj0(C907600Zj4 c907600Zj4, String str, InterfaceC1364105Vn<? super C907560Zj0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c907600Zj4;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C907560Zj0(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CombinedSearchContentEngine@35ee.deleteMessageFromConversation$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C907310Zib c907310ZibLIZ = this.LL.LIZ();
        if (c907310ZibLIZ != null) {
            c907310ZibLIZ.LIZ.LIZIZ(this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CombinedSearchContentEngine@35ee.deleteMessageFromConversation$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
