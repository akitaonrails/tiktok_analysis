package X;

import com.ss.android.ugc.aweme.account.login.googleonetap.GoogleOneTapService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.052E, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C052E extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ GoogleOneTapService LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C052E(GoogleOneTapService googleOneTapService) {
        super(0);
        this.LL = googleOneTapService;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        if (this.LL.LIZIZ().contains("is_new_user_key")) {
            return Boolean.valueOf(this.LL.LIZIZ().getBoolean("is_new_user_key", false));
        }
        Boolean boolLIZLLL = C1514430pVp.LIZLLL();
        this.LL.LIZIZ().storeBoolean("is_new_user_key", boolLIZLLL.booleanValue());
        return boolLIZLLL;
    }
}
