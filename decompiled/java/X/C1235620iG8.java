package X;

import Y.AfS188S0100000_19;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.ui.SmsConsentPageActivity;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.serverpush.ISmsSettingService;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iG8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.ui.SmsConsentPageActivity$addSmsConsentPageFragment$fragment$1$onCancel$1", f = "SmsConsentPageActivity.kt", l = {}, m = "invokeSuspend")
public final class C1235620iG8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SmsConsentPageActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1235620iG8(SmsConsentPageActivity smsConsentPageActivity, InterfaceC1364105Vn<? super C1235620iG8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = smsConsentPageActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1235620iG8(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmsConsentPageActivity@3b83.addSmsConsentPageFragment$fragment$1$onCancel$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C11O8 c11o8LJJJLZIJ = ((ISmsSettingService) ServiceManager.get().getService(ISmsSettingService.class)).LIZIZ(0).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ());
            SmsConsentPageActivity smsConsentPageActivity = this.LL;
            c11o8LJJJLZIJ.LJJLL(new AfS188S0100000_19(smsConsentPageActivity, 75), new AfS188S0100000_19(smsConsentPageActivity, 76));
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("SMS_consent", "updateSmsConsentStatus(0) network error", e);
            C1235600iG6.LIZ(this.LL.LL, CardStruct.IStatusCode.DEFAULT, String.valueOf(e.getMessage()), false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmsConsentPageActivity@3b83.addSmsConsentPageFragment$fragment$1$onCancel$1");
        return unit;
    }
}
