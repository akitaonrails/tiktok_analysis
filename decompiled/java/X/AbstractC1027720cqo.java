package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0cqo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1027720cqo extends AbstractC1549150qPp<InterfaceC1027710cqn, InterfaceC1027940crA> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "41244"));

    @InterfaceC1549730qQl(name = "openAdLandPage", params = {"title", "url", "refer", "cid", "adClickFrom", "landingStyle", "landingAccessStyle", "landingExitStyle", "useSystemBrowserInApp", "checkCache", "nativeSiteCustomData", "lynxShowType", "lynxPresentationStyle", "shouldUseActivity", "extra", "reportAdExtraData", "jumpData", "showType", "openCommentPanel", "_jsb_secure_dataflow_id"}, results = {"code", "msg"})
    public final String name = "openAdLandPage";
    public final EnumC1063530dmZ LL = EnumC1063530dmZ.SECURE;

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final EnumC1063530dmZ getAccess() {
        return this.LL;
    }

    @Override // X.InterfaceC1063710dmr
    public final String getName() {
        return this.name;
    }
}
