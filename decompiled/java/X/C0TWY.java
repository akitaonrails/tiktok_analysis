package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0TWY, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public abstract class C0TWY extends AbstractC1549150qPp<InterfaceC748060TWa, C0TWX> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "29706"));

    @InterfaceC1549730qQl(name = "x.copy", params = {"content", "_jsb_secure_dataflow_id"}, results = {"code", "msg"})
    public final String name = "x.copy";
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
