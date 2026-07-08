package X;

import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0mlU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel$processFavoritesClicked$2$1$1$1", f = "EffectInfoViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1408820mlU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1628970sUZ LL;
    public final /* synthetic */ Boolean LLILLJJLI;
    public final /* synthetic */ EffectInfoViewModel LLILLL;
    public final /* synthetic */ Effect LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408820mlU(EffectInfoViewModel effectInfoViewModel, InterfaceC1628970sUZ interfaceC1628970sUZ, Effect effect, Boolean bool, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1628970sUZ;
        this.LLILLJJLI = bool;
        this.LLILLL = effectInfoViewModel;
        this.LLILZ = effect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1408820mlU(this.LLILLL, this.LL, this.LLILZ, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectInfoViewModel@79fd.processFavoritesClicked$2$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1628970sUZ interfaceC1628970sUZ = this.LL;
        if (interfaceC1628970sUZ != null) {
            boolean z = false;
            if (this.LLILLJJLI != null && (!r0.booleanValue())) {
                z = true;
            }
            interfaceC1628970sUZ.LJIILJJIL(z);
        }
        this.LLILLL.yR2(this.LLILZ, Intrinsics.LJFF(this.LLILLJJLI, true));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectInfoViewModel@79fd.processFavoritesClicked$2$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
