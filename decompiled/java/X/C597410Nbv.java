package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nbv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.repo.OfflineModeManager$tryCancelUpdate$1", f = "OfflineModeManager.kt", l = {}, m = "invokeSuspend")
public final class C597410Nbv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597410Nbv(int i, InterfaceC1364105Vn<? super C597410Nbv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C597410Nbv(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineModeManager@8800.tryCancelUpdate$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C625130OfX.LJ(C625130OfX.LIZ, "offline_mode_replace_update_end", null, null, null, null, null, null, null, C2286608xc.LJ(this.LL), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, String.valueOf(C625470Og5.LLJJJ), null, null, null, null, null, null, null, null, null, null, null, null, null, null, -258, 131069);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OfflineModeManager@8800.tryCancelUpdate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
