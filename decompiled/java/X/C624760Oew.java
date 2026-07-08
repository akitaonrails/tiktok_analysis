package X;

import com.ss.android.ugc.aweme.offlinemode.ui.sheet.OfflineModeSheetPageAssem;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Oew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.ui.sheet.OfflineModeSheetPageAssem$switchDownloadStateManuallyWithMob$1$1", f = "OfflineModeSheetPageAssem.kt", l = {}, m = "invokeSuspend")
public final class C624760Oew extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EnumC624820Of2 LL;
    public final /* synthetic */ OfflineModeSheetPageAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C624760Oew(OfflineModeSheetPageAssem offlineModeSheetPageAssem, EnumC624820Of2 enumC624820Of2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = enumC624820Of2;
        this.LLILLJJLI = offlineModeSheetPageAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C624760Oew(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineModeSheetPageAssem@bce7.switchDownloadStateManuallyWithMob$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C625130OfX c625130OfX = C625130OfX.LIZ;
        String value = this.LL.getValue();
        int i = this.LLILLJJLI.Go().getState().LLILZIL;
        String enterFrom = this.LLILLJJLI.getEnterFrom();
        OfflineModeManagerVM offlineModeManagerVMGo = this.LLILLJJLI.Go();
        c625130OfX.getClass();
        String strLIZ = C625130OfX.LIZ(offlineModeManagerVMGo);
        String strLIZLLL = C625130OfX.LIZLLL(this.LLILLJJLI.Go());
        C625130OfX.LJ(c625130OfX, "click_download_offline_mode_video", enterFrom, value, C625130OfX.LIZJ(C724240Sb0.LIZ(this.LLILLJJLI)), C625130OfX.LIZIZ(), C2286608xc.LJ(i), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, strLIZLLL, strLIZ, null, null, null, null, null, null, null, null, null, null, null, null, null, C625420Og0.LJII(), null, null, 1073741760, 114687);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OfflineModeSheetPageAssem@bce7.switchDownloadStateManuallyWithMob$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
