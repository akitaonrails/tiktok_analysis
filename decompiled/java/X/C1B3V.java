package X;

import com.ss.android.ugc.aweme.authorize.BaseI18nAuthorizedFragment;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedCheckResult;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedPage;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedPageDetail;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AwS115S0201000_34;

/* JADX INFO: renamed from: X.1B3V, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B3V extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ BaseI18nAuthorizedFragment LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ AuthorizedPage LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ AuthorizedCheckResult LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1B3V(BaseI18nAuthorizedFragment baseI18nAuthorizedFragment, boolean z, AuthorizedPage authorizedPage, int i, AuthorizedCheckResult authorizedCheckResult) {
        super(1);
        this.LL = baseI18nAuthorizedFragment;
        this.LLILLJJLI = z;
        this.LLILLL = authorizedPage;
        this.LLILZ = i;
        this.LLILZIL = authorizedCheckResult;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        AuthorizedPageDetail authorizedPageDetail;
        String strTextValueByKey;
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        c1397620mTQ2.LIZJ(0, this.LL.getString(2131836829), new AwS115S0201000_34(this.LL, this.LLILZ, this.LLILZIL, 0));
        if (this.LLILLJJLI && (authorizedPageDetail = this.LLILLL.pageDetail) != null && (strTextValueByKey = authorizedPageDetail.textValueByKey("key_switch_account_button")) != null) {
            c1397620mTQ2.LIZJ(1, strTextValueByKey, AFwS281S0000000_34.get$arr$(2));
        }
        return Unit.LIZ;
    }
}
