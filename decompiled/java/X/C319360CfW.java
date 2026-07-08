package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CfW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.banner.common.DMCommonBannerUtil$sendDMAck$1", f = "DMCommonBannerUtil.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C319360CfW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1890930zJ5 LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C319360CfW(C1890930zJ5 c1890930zJ5, int i, InterfaceC1364105Vn<? super C319360CfW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1890930zJ5;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C319360CfW(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMCommonBannerUtil@3233.sendDMAck$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC315700CZc imPopupService = C1336205Ku.LIZ(false).getImPopupService();
                String str = this.LLILLJJLI.LL;
                int i2 = this.LLILLL;
                this.LL = 1;
                if (imPopupService.LIZIZ(i2, str, "inbox", null, this) == objLJFF) {
                    C1C7U.LIZIZ("DMCommonBannerUtil@3233.sendDMAck$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i3 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("MultiViewModel", "sendNoticeAckService onError called", e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMCommonBannerUtil@3233.sendDMAck$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
