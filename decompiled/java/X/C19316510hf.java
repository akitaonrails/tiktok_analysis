package X;

import com.ss.android.ugc.aweme.account.login.trustedfriends.RecoveryStatusPollingService;
import org.json.JSONException;

/* JADX INFO: renamed from: X.10hf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.trustedfriends.RecoveryStatusPollingService", f = "RecoveryStatusPollingService.kt", l = {193, 199}, m = "loginToRecoveredAccount")
public final class C19316510hf extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ RecoveryStatusPollingService LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19316510hf(RecoveryStatusPollingService recoveryStatusPollingService, InterfaceC1364105Vn<? super C19316510hf> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = recoveryStatusPollingService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("RecoveryStatusPollingService@7edd.loginToRecoveredAccount$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(null, this);
        C1C7U.LIZIZ("RecoveryStatusPollingService@7edd.loginToRecoveredAccount$1");
        return objLIZJ;
    }
}
