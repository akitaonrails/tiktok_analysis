package X;

import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.adminsetting.LiveMuteDurationSettingFragmentSheet;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tcm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.LiveMuteDurationSettingFragmentSheet$onViewCreated$1$1$1", f = "LiveMuteDurationSettingFragmentSheet.kt", l = {103}, m = "invokeSuspend")
public final class C750820Tcm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C745220TLc LLILLJJLI;
    public final /* synthetic */ LiveMuteDurationSettingFragmentSheet LLILLL;
    public final /* synthetic */ C745260TLg LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C750820Tcm(C745220TLc c745220TLc, LiveMuteDurationSettingFragmentSheet liveMuteDurationSettingFragmentSheet, C745260TLg c745260TLg, InterfaceC1364105Vn<? super C750820Tcm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c745220TLc;
        this.LLILLL = liveMuteDurationSettingFragmentSheet;
        this.LLILZ = c745260TLg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C750820Tcm(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveMuteDurationSettingFragmentSheet@942f.onViewCreated$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                IUserManageService iUserManageService = (IUserManageService) C1161920gLG.LIZJ(IUserManageService.class);
                C745220TLc c745220TLc = this.LLILLJJLI;
                DataChannel dataChannelLJ = C475510Ikn.LJ(this.LLILLL);
                this.LL = 1;
                if (iUserManageService.QX(c745220TLc, dataChannelLJ, this) == objLJFF) {
                    C1C7U.LIZIZ("LiveMuteDurationSettingFragmentSheet@942f.onViewCreated$1$1$1");
                    return objLJFF;
                }
            }
            LiveMuteDurationSettingFragmentSheet liveMuteDurationSettingFragmentSheet = this.LLILLL;
            C745220TLc c745220TLc2 = this.LLILLJJLI;
            liveMuteDurationSettingFragmentSheet.LLJZIJLIL = c745220TLc2;
            liveMuteDurationSettingFragmentSheet.LLL = c745220TLc2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C745220TLc c745220TLc3 = this.LLILLL.LLL;
            if (c745220TLc3 != null) {
                this.LLILZ.LLLI(c745220TLc3);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveMuteDurationSettingFragmentSheet@942f.onViewCreated$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
