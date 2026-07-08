package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01iX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM$callUpdateBtnLiveSubOnlyApi$1$1$1$1$3$1", f = "SubOnlyLiveSettingDialogVM.kt", l = {}, m = "invokeSuspend")
public final class C409501iX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SubOnlyLiveSettingDialogVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C409501iX(SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM, InterfaceC1364105Vn<? super C409501iX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = subOnlyLiveSettingDialogVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C409501iX(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubOnlyLiveSettingDialogVM@b5ff.callUpdateBtnLiveSubOnlyApi$1$1$1$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(new C409801ia());
        C766270U4b.LIZLLL(2131842705);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubOnlyLiveSettingDialogVM@b5ff.callUpdateBtnLiveSubOnlyApi$1$1$1$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
