package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0dUt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1052570dUt extends AbstractC1549150qPp<InterfaceC1052580dUu, Object> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "32736"));

    @InterfaceC1549730qQl(name = "x.openThirdWeb", params = {"url", "_jsb_secure_dataflow_id"})
    public final String name = "x.openThirdWeb";
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
