package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0KVV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0KVV extends AbstractC1549150qPp<C0KVW, C0KVX> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "23122"));

    @InterfaceC1549730qQl(name = "ec_common_dialog", params = {"title", "content"})
    public final String name = "ec_common_dialog";
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
