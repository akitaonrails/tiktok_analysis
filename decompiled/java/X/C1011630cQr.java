package X;

import Y.AgS204S0200000_16;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.SearchAdStateBridge$subscribe$1$1$1", f = "SearchAdStateBridge.kt", l = {69}, m = "invokeSuspend")
public final class C1011630cQr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1011580cQm LLILLJJLI;
    public final /* synthetic */ EnumC1011130cQ3 LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1011630cQr(C1011580cQm c1011580cQm, EnumC1011130cQ3 enumC1011130cQ3, Function0<Unit> function0, InterfaceC1364105Vn<? super C1011630cQr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1011580cQm;
        this.LLILLL = enumC1011130cQ3;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1011630cQr(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchAdStateBridge@1a5c.subscribe$1$1$1");
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
            final C2252331DDr c2252331DDr = this.LLILLJJLI.LIZIZ;
            final EnumC1011130cQ3 enumC1011130cQ3 = this.LLILLL;
            InterfaceC346201Wa<EnumC1011130cQ3> interfaceC346201Wa = new InterfaceC346201Wa<EnumC1011130cQ3>() { // from class: X.0cQs
                @Override // X.InterfaceC346201Wa
                public final Object collect(InterfaceC346701Wf<? super EnumC1011130cQ3> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Object objCollect = c2252331DDr.collect(new AgS204S0200000_16(interfaceC346701Wf, enumC1011130cQ3, 5), interfaceC1364105Vn);
                    if (objCollect == C099R.LJFF()) {
                        return objCollect;
                    }
                    return Unit.LIZ;
                }
            };
            AgS204S0200000_16 agS204S0200000_16 = new AgS204S0200000_16(enumC1011130cQ3, this.LLILZ, 4);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS204S0200000_16, this) == objLJFF) {
                C1C7U.LIZIZ("SearchAdStateBridge@1a5c.subscribe$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchAdStateBridge@1a5c.subscribe$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
