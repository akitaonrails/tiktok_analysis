package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cQq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.SearchAdStateBridge$subscribe$1$1", f = "SearchAdStateBridge.kt", l = {}, m = "invokeSuspend")
public final class C1011620cQq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1011580cQm LLILLJJLI;
    public final /* synthetic */ EnumC1011130cQ3 LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1011620cQq(C1011580cQm c1011580cQm, EnumC1011130cQ3 enumC1011130cQ3, Function0<Unit> function0, InterfaceC1364105Vn<? super C1011620cQq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1011580cQm;
        this.LLILLL = enumC1011130cQ3;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1011620cQq c1011620cQq = new C1011620cQq(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1011620cQq.LL = obj;
        return c1011620cQq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchAdStateBridge@1a5c.subscribe$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C23250099c.LIZLLL((InterfaceC497601wk) this.LL, null, null, new C1011630cQr(this.LLILLJJLI, this.LLILLL, this.LLILZ, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchAdStateBridge@1a5c.subscribe$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
