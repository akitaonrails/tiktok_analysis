package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0srL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel$updateGreenScreenSelection$1$1", f = "OptionCategoryViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1643090srL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ OptionCategoryViewModel LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1643090srL(OptionCategoryViewModel optionCategoryViewModel, String str, InterfaceC1364105Vn<? super C1643090srL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = optionCategoryViewModel;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1643090srL(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OptionCategoryViewModel@f2b8.updateGreenScreenSelection$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            OptionCategoryViewModel optionCategoryViewModel = this.LL;
            C1643220srY c1643220srY = new C1643220srY("Environment", 0, "Green Screen", 0, new C1643300srg(null, null, this.LLILLJJLI, null, null, null, 0, 0, 0, null, false, null, 4091));
            optionCategoryViewModel.LLILLL.LIZ(c1643220srY, new C1643170srT(optionCategoryViewModel, c1643220srY));
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unable to get bitmap: ");
            sbLIZ.append(e);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("OptionCategoryPanelViewModel", C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OptionCategoryViewModel@f2b8.updateGreenScreenSelection$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
