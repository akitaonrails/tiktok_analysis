package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ypw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1872860ypw extends AbstractC1549150qPp<InterfaceC1872890ypz, InterfaceC1872910yq1> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "35601"));

    @InterfaceC1549730qQl(name = "x.getStorageItem", params = {"key", "biz"}, results = {"data"})
    public final String name = "x.getStorageItem";
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
