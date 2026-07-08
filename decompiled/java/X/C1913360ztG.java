package X;

import com.ss.android.ugc.aweme.account.switchaccount.ProfileTabDoubleClickHandlerImpl;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ztG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1913360ztG extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ProfileTabDoubleClickHandlerImpl LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ SignificantUserInfo LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1913360ztG(ProfileTabDoubleClickHandlerImpl profileTabDoubleClickHandlerImpl, C19EG c19eg, SignificantUserInfo significantUserInfo, String str, String str2) {
        super(0);
        this.LL = profileTabDoubleClickHandlerImpl;
        this.LLILLJJLI = c19eg;
        this.LLILLL = significantUserInfo;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ProfileTabDoubleClickHandlerImpl profileTabDoubleClickHandlerImpl = this.LL;
        profileTabDoubleClickHandlerImpl.LIZLLL.removeCallbacks(profileTabDoubleClickHandlerImpl.LJ);
        this.LL.LIZIZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
        return Unit.LIZ;
    }
}
