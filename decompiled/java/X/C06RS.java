package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06RS, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.share.ShareStreakUtil$showLoading$2$2", f = "StreakShareUtil.kt", l = {}, m = "invokeSuspend")
public final class C06RS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C06RP LL;
    public final /* synthetic */ Function1<Pair<Integer, C1371590lnR>, Unit> LLILLJJLI;
    public final /* synthetic */ Pair<Integer, C1371590lnR> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C06RS(C06RP c06rp, Function1<? super Pair<Integer, C1371590lnR>, Unit> function1, Pair<Integer, C1371590lnR> pair, InterfaceC1364105Vn<? super C06RS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c06rp;
        this.LLILLJJLI = function1;
        this.LLILLL = pair;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06RS(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareStreakUtil@bf84.showLoading$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0FNV.LIZ(this.LL.LIZ);
        this.LLILLJJLI.invoke(this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShareStreakUtil@bf84.showLoading$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
