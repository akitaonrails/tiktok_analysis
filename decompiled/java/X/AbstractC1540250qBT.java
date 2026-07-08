package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0qBT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1540250qBT extends AbstractC1549150qPp<InterfaceC1540270qBV, InterfaceC1540280qBW> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "35142"));

    @InterfaceC1549730qQl(name = "ecSetPrefetchMergeData", params = {"channel", "data", "clear", "uniqueKey", "source"}, results = {FollowStatusChangeMethod.PARAM_FOLLOW_STATUS})
    public final String name = "ecSetPrefetchMergeData";
    public final EnumC1063530dmZ LL = EnumC1063530dmZ.PRIVATE;

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final EnumC1063530dmZ getAccess() {
        return this.LL;
    }

    @Override // X.InterfaceC1063710dmr
    public final String getName() {
        return this.name;
    }

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final Class<? extends InterfaceC1540270qBV> provideParamModel() {
        return InterfaceC1540270qBV.class;
    }

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final Class<? extends InterfaceC1540280qBW> provideResultModel() {
        return InterfaceC1540280qBW.class;
    }
}
