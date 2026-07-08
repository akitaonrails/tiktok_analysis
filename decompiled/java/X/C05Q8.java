package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.offlinemode.ui.sheet.OfflineModeSheetPageAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Q8, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.ui.sheet.OfflineModeSheetPageAssem$switchDownloadStateManuallyWithMob$1", f = "OfflineModeSheetPageAssem.kt", l = {536}, m = "invokeSuspend")
public final class C05Q8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OfflineModeSheetPageAssem LLILLJJLI;
    public final /* synthetic */ EnumC624820Of2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05Q8(OfflineModeSheetPageAssem offlineModeSheetPageAssem, EnumC624820Of2 enumC624820Of2, InterfaceC1364105Vn<? super C05Q8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = offlineModeSheetPageAssem;
        this.LLILLL = enumC624820Of2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05Q8(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineModeSheetPageAssem@bce7.switchDownloadStateManuallyWithMob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(300L, this) == objLJFF) {
                C1C7U.LIZIZ("OfflineModeSheetPageAssem@bce7.switchDownloadStateManuallyWithMob$1");
                return objLJFF;
            }
        }
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this.LLILLJJLI.Go());
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C624760Oew(this.LLILLJJLI, this.LLILLL, null), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OfflineModeSheetPageAssem@bce7.switchDownloadStateManuallyWithMob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
