package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0qXc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1553980qXc extends AbstractC1549150qPp<InterfaceC1554000qXe, InterfaceC1554020qXg> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "28417"));

    @InterfaceC1549730qQl(name = "x.startGyroscope", params = {"interval", "_jsb_secure_dataflow_id"})
    public final String name = "x.startGyroscope";
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
