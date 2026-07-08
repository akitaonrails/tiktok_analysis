package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0TWd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC748090TWd extends AbstractC1549150qPp<InterfaceC844050X9f, InterfaceC748080TWc> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "29957"));

    @InterfaceC1549730qQl(name = "x.openApp", params = {"action", "schema", "packageName", "_jsb_secure_dataflow_id"}, results = {"code", "msg"})
    public final String name = "x.openApp";
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
