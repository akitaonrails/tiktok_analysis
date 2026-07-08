package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0zET, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1888070zET extends AbstractC1549150qPp<InterfaceC1888080zEU, InterfaceC1888110zEX> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "33379"));

    @InterfaceC1549730qQl(name = "openOrganicLandPage", params = {"schema", "refer", "landingStyle", "_jsb_secure_dataflow_id"})
    public final String name = "openOrganicLandPage";
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
