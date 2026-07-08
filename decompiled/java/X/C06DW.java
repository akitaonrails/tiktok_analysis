package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06DW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public abstract class C06DW extends AbstractC1549150qPp<C06DX, C06DY> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "39020"));

    @InterfaceC1549730qQl(name = "open_sticker_panel", params = {"uuid", "conversationId", "conversationType"}, results = {"statusCode", "statusMsg"})
    public final String name = "open_sticker_panel";
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
