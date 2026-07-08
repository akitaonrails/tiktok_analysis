package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0qXd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1553990qXd extends AbstractC1549150qPp<InterfaceC1554010qXf, InterfaceC1554030qXh> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "28418"));

    @InterfaceC1549730qQl(name = "x.stopGyroscope", params = {"_jsb_secure_dataflow_id"})
    public final String name = "x.stopGyroscope";
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
