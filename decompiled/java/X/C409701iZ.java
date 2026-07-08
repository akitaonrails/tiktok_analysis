package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01iZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM$callUpdateBtnLiveSubOnlyApi$1$1$1$3$2$1", f = "SubOnlyLiveSettingDialogVM.kt", l = {}, m = "invokeSuspend")
public final class C409701iZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C470590Icr<Object> LL;
    public final /* synthetic */ SubOnlyLiveSettingDialogVM LLILLJJLI;
    public final /* synthetic */ C291001Au<Boolean> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C409701iZ(C470590Icr<Object> c470590Icr, SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM, C291001Au<Boolean> c291001Au, InterfaceC1364105Vn<? super C409701iZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c470590Icr;
        this.LLILLJJLI = subOnlyLiveSettingDialogVM;
        this.LLILLL = c291001Au;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C409701iZ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        C1C7U.LIZ("SubOnlyLiveSettingDialogVM@b5ff.callUpdateBtnLiveSubOnlyApi$1$1$1$3$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C470590Icr<Object> c470590Icr = this.LL;
        if (c470590Icr != null && c470590Icr.statusCode == 0) {
            Boolean bool = null;
            if (1 != 0) {
                SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM = this.LLILLJJLI;
                C291001Au<Boolean> c291001Au = this.LLILLL;
                Room room = subOnlyLiveSettingDialogVM.vQ2().LLILLJJLI;
                if (room != null) {
                    if (c291001Au != null) {
                        bool = c291001Au.LIZ;
                    }
                    if (C500260Jjc.LJJJI(bool)) {
                        subOnlyLiveSettingDialogVM.setState(new C409901ib());
                        j = 1;
                    } else {
                        j = 0;
                    }
                    room.liveSubOnlyUseMusic = j;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubOnlyLiveSettingDialogVM@b5ff.callUpdateBtnLiveSubOnlyApi$1$1$1$3$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
