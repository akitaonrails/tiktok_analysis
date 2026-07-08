package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0v0Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1725690v0Z extends AbstractC1549150qPp<InterfaceC1725710v0b, InterfaceC1725700v0a> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "40889"));

    @InterfaceC1549730qQl(name = "pipo.selectContact", params = {""}, results = {"contactName", "phoneNumber"})
    public final String name = "pipo.selectContact";
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
