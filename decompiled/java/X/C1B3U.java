package X;

import com.ss.android.ugc.aweme.authorize.BaseI18nAuthorizedFragment;
import com.ss.android.ugc.aweme.openauthorize.entity.CheckResultInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS115S0201000_34;
import kotlin.jvm.internal.AwS148S1100000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1B3U, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B3U extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ BaseI18nAuthorizedFragment LL;
    public final /* synthetic */ Boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ CheckResultInfo LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1B3U(BaseI18nAuthorizedFragment baseI18nAuthorizedFragment, Boolean bool, int i, CheckResultInfo checkResultInfo, String str) {
        super(1);
        this.LL = baseI18nAuthorizedFragment;
        this.LLILLJJLI = bool;
        this.LLILLL = i;
        this.LLILZ = checkResultInfo;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        c1397620mTQ2.LIZJ(0, this.LL.getString(2131836829), new AwS115S0201000_34(this.LL, this.LLILLL, this.LLILZ, 1));
        if (Intrinsics.LJFF(this.LLILLJJLI, Boolean.TRUE)) {
            c1397620mTQ2.LIZJ(1, this.LL.getString(2131836830), new AwS148S1100000_34(this.LL, this.LLILZIL, 15));
        }
        return Unit.LIZ;
    }
}
