package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0TVk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC747900TVk extends AbstractC1549150qPp<InterfaceC747910TVl, InterfaceC747880TVi> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "29986"));

    @InterfaceC1549730qQl(name = "openBAConversionToolsWithType", params = {"type", "content", "uid", "extra", "_jsb_secure_dataflow_id"}, results = {"code", "msg"})
    public final String name = "openBAConversionToolsWithType";
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
