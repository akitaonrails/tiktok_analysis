package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06DS, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public abstract class C06DS extends AbstractC1549150qPp<C06DR, C06DT> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "39011"));

    @InterfaceC1549730qQl(name = "update_streak_pet_info", params = {"sceneId", "sceneRequestBody", "conversationId", "conversationType"}, results = {"statusCode", "statusMsg", "sceneResponseBody", "petValue"})
    public final String name = "update_streak_pet_info";
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
