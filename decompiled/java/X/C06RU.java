package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06RU, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.share.ShareStreakUtil$showLoading$2$1", f = "StreakShareUtil.kt", l = {}, m = "invokeSuspend")
public final class C06RU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C06RP LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06RU(C06RP c06rp, InterfaceC1364105Vn<? super C06RU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c06rp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06RU(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareStreakUtil@bf84.showLoading$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0FNV.LIZJ(this.LL.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShareStreakUtil@bf84.showLoading$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
