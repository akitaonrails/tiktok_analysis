package X;

import Y.AfS149S0200000_13;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.setting.serverpush.ISmsSettingService;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XYi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.v2.network.errorhandler.AccountPassportResultHandler$tryUploadSmsConsentAfterLogin$1", f = "AccountPassportResultHandler.kt", l = {}, m = "invokeSuspend")
public final class C850580XYi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ EnumC852910Xd3 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C850580XYi(Fragment fragment, EnumC852910Xd3 enumC852910Xd3, InterfaceC1364105Vn<? super C850580XYi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = fragment;
        this.LLILLJJLI = enumC852910Xd3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C850580XYi(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("AccountPassportResultHandler@2671.tryUploadSmsConsentAfterLogin$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            Bundle arguments = this.LL.getArguments();
            if (arguments != null) {
                int i = 1;
                if (arguments.getBoolean("sms_checkbox_checked")) {
                    z = true;
                } else {
                    z = false;
                }
                EnumC852910Xd3 enumC852910Xd3 = this.LLILLJJLI;
                Fragment fragment = this.LL;
                ISmsSettingService iSmsSettingService = (ISmsSettingService) PluggableExtentionKt.pluggableSpi$default(ISmsSettingService.class, false, false, false, 14, null);
                if (iSmsSettingService != null) {
                    if (!z) {
                        i = 0;
                    }
                    C19476611Hw c19476611HwLIZIZ = iSmsSettingService.LIZIZ(i);
                    if (c19476611HwLIZIZ != null) {
                        c19476611HwLIZIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS149S0200000_13(fragment, enumC852910Xd3, 0), new AfS149S0200000_13(fragment, enumC852910Xd3, 1));
                    }
                }
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("SMS_consent", "updateSmsConsentStatus() network error", e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AccountPassportResultHandler@2671.tryUploadSmsConsentAfterLogin$1");
        return unit;
    }
}
