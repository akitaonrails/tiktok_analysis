package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0DP4, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public abstract class C0DP4 extends AbstractC1549150qPp<C0DP5, InterfaceC338540DOy> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "38845"));

    @InterfaceC1549730qQl(name = "syncDataWithInnerFeed", params = {"awemeList", "uniqueKey", "hasMore", "mode"})
    public final String name = "syncDataWithInnerFeed";
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
