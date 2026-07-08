package X;

import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.adminsetting.LiveMuteDurationSettingFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tcl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.LiveMuteDurationSettingFragment$onViewCreated$2$1", f = "LiveMuteDurationSettingFragment.kt", l = {91}, m = "invokeSuspend")
public final class C750810Tcl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C745220TLc LLILLJJLI;
    public final /* synthetic */ LiveMuteDurationSettingFragment LLILLL;
    public final /* synthetic */ C745260TLg LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C750810Tcl(C745220TLc c745220TLc, LiveMuteDurationSettingFragment liveMuteDurationSettingFragment, C745260TLg c745260TLg, InterfaceC1364105Vn<? super C750810Tcl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c745220TLc;
        this.LLILLL = liveMuteDurationSettingFragment;
        this.LLILZ = c745260TLg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C750810Tcl(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveMuteDurationSettingFragment@1717.onViewCreated$2$1");
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
                    C1C7U.LIZIZ("LiveMuteDurationSettingFragment@1717.onViewCreated$2$1");
                    return objLJFF;
                }
            }
            LiveMuteDurationSettingFragment liveMuteDurationSettingFragment = this.LLILLL;
            C745220TLc c745220TLc2 = this.LLILLJJLI;
            liveMuteDurationSettingFragment.LLILZ = c745220TLc2;
            liveMuteDurationSettingFragment.LLILZIL = c745220TLc2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C745220TLc c745220TLc3 = this.LLILLL.LLILZIL;
            if (c745220TLc3 != null) {
                this.LLILZ.LLLI(c745220TLc3);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveMuteDurationSettingFragment@1717.onViewCreated$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
