package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cQn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.SearchAdStateBridge$sendEvent$1", f = "SearchAdStateBridge.kt", l = {44}, m = "invokeSuspend")
public final class C1011590cQn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EnumC1011130cQ3 LLILLJJLI;
    public final /* synthetic */ C1011580cQm LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1011590cQn(EnumC1011130cQ3 enumC1011130cQ3, C1011580cQm c1011580cQm, InterfaceC1364105Vn<? super C1011590cQn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enumC1011130cQ3;
        this.LLILLL = c1011580cQm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1011590cQn(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchAdStateBridge@1a5c.sendEvent$1");
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
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sendEvent : ");
            sbLIZ.append(this.LLILLJJLI.name());
            C2188811AlT.LIZIZ(sbLIZ);
            int i2 = C2510609se.LIZ;
            C2252331DDr c2252331DDr = this.LLILLL.LIZIZ;
            EnumC1011130cQ3 enumC1011130cQ3 = this.LLILLJJLI;
            this.LL = 1;
            if (c2252331DDr.emit(enumC1011130cQ3, this) == objLJFF) {
                C1C7U.LIZIZ("SearchAdStateBridge@1a5c.sendEvent$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchAdStateBridge@1a5c.sendEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
