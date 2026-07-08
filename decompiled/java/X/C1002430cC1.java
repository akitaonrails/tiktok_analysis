package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cC1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.feed.instantplay.flow.MinisInstantPlayLoadFlow$release$2", f = "MinisInstantPlayLoadFlow.kt", l = {}, m = "invokeSuspend")
public final class C1002430cC1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1006440cIU LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1002430cC1(C1006440cIU c1006440cIU, InterfaceC1364105Vn<? super C1002430cC1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1006440cIU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1002430cC1(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisInstantPlayLoadFlow@9679.release$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1440005kM.LIZ(new C1210880hcE("homepage_hot", "FUNCTION_FROM_CARD_BE_REMOVED", "diff_type_minis_instant_play_card_removed", this.LL.LIZJ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MinisInstantPlayLoadFlow@9679.release$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
