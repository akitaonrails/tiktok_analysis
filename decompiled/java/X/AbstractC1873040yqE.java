package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0yqE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1873040yqE extends AbstractC1549150qPp<InterfaceC1873050yqF, InterfaceC1873060yqG> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "41123"));

    @InterfaceC1549730qQl(name = "x.getSettings", params = {"keys"}, results = {"settings"})
    public final String name = "x.getSettings";
    public final EnumC1063530dmZ LL = EnumC1063530dmZ.PROTECT;

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final EnumC1063530dmZ getAccess() {
        return this.LL;
    }

    @Override // X.InterfaceC1063710dmr
    public final String getName() {
        return this.name;
    }
}
