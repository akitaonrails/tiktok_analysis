package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cQo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.SearchAdStateBridge$sendState$1", f = "SearchAdStateBridge.kt", l = {51}, m = "invokeSuspend")
public final class C1011600cQo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1011580cQm LLILLJJLI;
    public final /* synthetic */ C1011570cQl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1011600cQo(C1011580cQm c1011580cQm, C1011570cQl c1011570cQl, InterfaceC1364105Vn<? super C1011600cQo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1011580cQm;
        this.LLILLL = c1011570cQl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1011600cQo(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchAdStateBridge@1a5c.sendState$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C2252321DDq c2252321DDq = this.LLILLJJLI.LIZJ;
            C1011570cQl c1011570cQl = this.LLILLL;
            this.LL = 1;
            c2252321DDq.setValue(c1011570cQl);
            if (Unit.LIZ == objLJFF) {
                C1C7U.LIZIZ("SearchAdStateBridge@1a5c.sendState$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchAdStateBridge@1a5c.sendState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
