package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0pJP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1506730pJP extends AbstractC1549150qPp<InterfaceC1506720pJO, InterfaceC1506740pJQ> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "40888"));

    @InterfaceC1549730qQl(name = "pipo.isCCTAvailable", params = {"url"}, results = {"result"})
    public final String name = "pipo.isCCTAvailable";
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
