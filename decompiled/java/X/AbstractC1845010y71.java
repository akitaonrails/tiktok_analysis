package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0y71, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1845010y71 extends AbstractC1549150qPp<InterfaceC1845000y70, InterfaceC1845030y73> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "20901"));

    @InterfaceC1549730qQl(name = "ec_product_save_more_action", params = {"items"}, results = {"click_event_params"})
    public final String name = "ec_product_save_more_action";
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
