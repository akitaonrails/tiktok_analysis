package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0yp1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1872290yp1 extends AbstractC1549150qPp<InterfaceC1872270yoz, InterfaceC1872280yp0> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "29591"));

    @InterfaceC1549730qQl(name = "x.requestForThird", params = {"url", "method", "body", "bodyType", "params", "header", "disableRedirect", "jsonFormatOption", "_jsb_secure_dataflow_id"}, results = {"httpCode", "clientCode", "header", "response", "responseType", "rawResponse"})
    public final String name = "x.requestForThird";
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
