package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01iR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM$callUpdateBtnLiveSubOnlyApi$1$1$1$2$2$1", f = "SubOnlyLiveSettingDialogVM.kt", l = {}, m = "invokeSuspend")
public final class C408901iR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C470590Icr<Object> LL;
    public final /* synthetic */ Room LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C408901iR(C470590Icr<Object> c470590Icr, Room room, InterfaceC1364105Vn<? super C408901iR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c470590Icr;
        this.LLILLJJLI = room;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C408901iR(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubOnlyLiveSettingDialogVM@b5ff.callUpdateBtnLiveSubOnlyApi$1$1$1$2$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C470590Icr<Object> c470590Icr = this.LL;
        if (c470590Icr != null && c470590Icr.statusCode == 0) {
            this.LLILLJJLI.disablePreviewSubOnly = 1L;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubOnlyLiveSettingDialogVM@b5ff.callUpdateBtnLiveSubOnlyApi$1$1$1$2$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
