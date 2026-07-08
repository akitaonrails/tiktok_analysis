package X;

import Y.ARunnableS113S0100000_13;
import android.os.Bundle;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.account.login.trustedfriends.RecoveryStatusPollingService;
import com.ss.android.ugc.aweme.account.login.v2.network.LoginResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10hb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.trustedfriends.RecoveryStatusPollingService$loginToRecoveredAccount$2", f = "RecoveryStatusPollingService.kt", l = {}, m = "invokeSuspend")
public final class C19316110hb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LoginResponse LL;
    public final /* synthetic */ RecoveryStatusPollingService LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19316110hb(LoginResponse loginResponse, RecoveryStatusPollingService recoveryStatusPollingService, String str, InterfaceC1364105Vn<? super C19316110hb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = loginResponse;
        this.LLILLJJLI = recoveryStatusPollingService;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19316110hb(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("RecoveryStatusPollingService@7edd.loginToRecoveredAccount$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0XO3 c0xo3LIZIZ = C19316410he.LIZIZ(this.LL, "trusted_friends_recovery");
        if (c0xo3LIZIZ != null) {
            RecoveryStatusPollingService recoveryStatusPollingService = this.LLILLJJLI;
            String str = this.LLILLL;
            C0XYO.LIZLLL(C0XYO.LIZ, null, null, c0xo3LIZIZ, false, null, false, 112);
            recoveryStatusPollingService.getClass();
            C852170Xbr c852170Xbr = C852170Xbr.LIZ;
            C1BV9 c1bv9 = new C1BV9("trusted_muf", str, "trusted_muf", "trusted_muf", "trusted_muf", null);
            c852170Xbr.getClass();
            C852170Xbr.LJIIL(false, "trusted_muf", c1bv9, c0xo3LIZIZ, null);
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_start_by_switch_account", C848230XPh.LL.LJI());
            bundle.putBoolean("is_login_from_client_side_recovery", true);
            C1C7U.LIZ("AfterLoginActions@2557.getRestartAction$1L");
            C786410Ut5.LJLIIL(500L, new BPEAHandler(), new ARunnableS113S0100000_13(bundle, 116));
            C1C7U.LIZIZ("AfterLoginActions@2557.getRestartAction$1L");
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("RecoveryStatusPollingService@7edd.loginToRecoveredAccount$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
