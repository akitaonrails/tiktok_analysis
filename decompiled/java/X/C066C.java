package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.066C, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.inline.StreakInlineMsgInsertHelper$onGroupUnlockStreak$1", f = "StreakInlineMsgInsertHelper.kt", l = {}, m = "invokeSuspend")
public final class C066C extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C066C(String str, InterfaceC1364105Vn<? super C066C> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C066C(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakInlineMsgInsertHelper@52a0.onGroupUnlockStreak$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1564306An c1564306An = C1564306An.LIZ;
        String str = this.LL;
        c1564306An.getClass();
        C1564306An.LIZIZ(0L, str, "");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakInlineMsgInsertHelper@52a0.onGroupUnlockStreak$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
