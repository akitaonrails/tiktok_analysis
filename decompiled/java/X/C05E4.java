package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05E4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.resourcemanage.DMResourceManagementManager$receiveIntention$1$1", f = "DMResourceManagementServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C05E4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C05E5 LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05E4(C05E5 c05e5, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super C05E4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c05e5;
        this.LLILLJJLI = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05E4(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMResourceManagementManager@bbbe.receiveIntention$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZJ.invoke(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMResourceManagementManager@bbbe.receiveIntention$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
