package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.serverpush.service.SmsSettingServiceImpl;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01J0, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.serverpush.service.SmsSettingServiceImpl$getNeedShowSmsConsentAsync$1", f = "SmsSettingServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C01J0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SmsSettingServiceImpl LL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01J0(SmsSettingServiceImpl smsSettingServiceImpl, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C01J0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = smsSettingServiceImpl;
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01J0(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmsSettingServiceImpl@4945.getNeedShowSmsConsentAsync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            this.LL.LIZ().LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new C516201zk(this.LLILLJJLI, 102), new C09JN() { // from class: X.00rU
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    C1C7U.LIZ("SmsSettingServiceImpl@4945.getNeedShowSmsConsentAsync$1$2");
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getNeedShowSmsConsentAsync() - error: ");
                    sbLIZ.append(obj2);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C1C7U.LIZIZ("SmsSettingServiceImpl@4945.getNeedShowSmsConsentAsync$1$2");
                }
            });
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("SMS_consent", "getNeedShowSmsConsentAsync() network error", e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmsSettingServiceImpl@4945.getNeedShowSmsConsentAsync$1");
        return unit;
    }
}
