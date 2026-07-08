package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1BVG, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BVG extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C1BVI LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1BVG(C19EG c19eg, String str, int i, C1BVI c1bvi) {
        super(1);
        this.LL = c19eg;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = c1bvi;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        String str;
        c1397660mTU.LIZJ = true;
        C1BVD c1bvd = C1BVD.LIZ;
        C19EG c19eg = this.LL;
        String str2 = this.LLILLJJLI;
        int i = this.LLILLL;
        C1BVI c1bvi = this.LLILZ;
        c1bvd.getClass();
        int i2 = C1BVH.LIZ[c1bvi.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                str = "phone";
            } else {
                throw new C1954807lC();
            }
        } else {
            str = "email";
        }
        C20684815ws.LJIILLIIL("verify_pii_page_click", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str2), new Pair("enter_method", "normal"), new Pair("show_index", String.valueOf(i)), new Pair("click", "update"), new Pair("verify_type", str), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "1")));
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C06MM.LIZ(c19eg), "//account/setting/self");
        smartRouteBuildRoute.withParam("IS_ACCOUNT_INFO", true);
        smartRouteBuildRoute.withParam("enter_method", "normal");
        smartRouteBuildRoute.withParam("enter_from", str2);
        smartRouteBuildRoute.withParam("is_from_prompt", true);
        smartRouteBuildRoute.open();
        C1BVD.LIZJ(c1bvi);
        C849850XVn.LIZIZ.LIZJ().LJIJI("94", "negative", false);
        return Unit.LIZ;
    }
}
