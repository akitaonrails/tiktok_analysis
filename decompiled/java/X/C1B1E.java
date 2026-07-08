package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1B1E, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1B1E extends AbstractC1549150qPp<C1B1H, C1B1D> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "35679"));

    @InterfaceC1549730qQl(name = "x.reportADLog", params = {"label", "tag", "refer", "groupID", "creativeID", "logExtra", "extraParams"}, results = {""})
    public final String name = "x.reportADLog";
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
