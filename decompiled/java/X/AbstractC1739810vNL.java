package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0vNL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1739810vNL extends AbstractC1549150qPp<InterfaceC1739820vNM, InterfaceC1739840vNO> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "37661"));

    @InterfaceC1549730qQl(name = "getNativePrefetchResult", params = {"prefetchKey", "apiPath", "timeout"}, results = {"state", "result"})
    public final String name = "getNativePrefetchResult";
    public final EnumC1063530dmZ LL = EnumC1063530dmZ.PRIVATE;

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final EnumC1063530dmZ getAccess() {
        return this.LL;
    }

    @Override // X.InterfaceC1063710dmr
    public final String getName() {
        return this.name;
    }
}
