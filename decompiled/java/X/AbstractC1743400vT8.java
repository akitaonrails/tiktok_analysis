package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0vT8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1743400vT8 extends AbstractC1549150qPp<InterfaceC1743410vT9, InterfaceC1743430vTB> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "24171"));

    @InterfaceC1549730qQl(name = "ec_send_page_log", params = {"eventName", "params"})
    public final String name = "ec_send_page_log";
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
