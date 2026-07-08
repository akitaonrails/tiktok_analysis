package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M5o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ugc.DraftBoxTidyViewHolder$1$1", f = "DraftBoxTidyViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C562820M5o extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C562830M5p LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C562820M5o(C562830M5p c562830M5p, InterfaceC1364105Vn<? super C562820M5o> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c562830M5p;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C562820M5o(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftBoxTidyViewHolder@e9d6.<init>$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC562800M5m interfaceC562800M5mLIZIZ = this.LL.P5().LIZIZ();
        if (interfaceC562800M5mLIZIZ != null) {
            interfaceC562800M5mLIZIZ.LJFF();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxTidyViewHolder@e9d6.<init>$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
