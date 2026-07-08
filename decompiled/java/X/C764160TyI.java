package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TyI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.KaraokeManager$handleContinue$1", f = "KaraokeManager.kt", l = {}, m = "invokeSuspend")
public final class C764160TyI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0U1C LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C764160TyI(C0U1C c0u1c, InterfaceC1364105Vn<? super C764160TyI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0u1c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C764160TyI(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeManager@ffa8.handleContinue$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        KaraokeViewModel karaokeViewModel = this.LL.LIZJ;
        if (karaokeViewModel != null) {
            karaokeViewModel.cR2(new C0U0N() { // from class: X.0TyJ
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeManager@ffa8.handleContinue$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
