package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0xyk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1839880xyk extends AbstractC1549150qPp<InterfaceC1839910xyn, InterfaceC1839920xyo> {
    public static final Map<String, Object> LLILLJJLI = C2097908Jt.LIZJ(new Pair("TicketID", "32694"));

    @InterfaceC1549730qQl(name = "downloadFileWithLoadingView", params = {"url", "extension"}, results = {"path"})
    public final String name = "downloadFileWithLoadingView";
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
    public final Class<? extends InterfaceC1839910xyn> provideParamModel() {
        return InterfaceC1839910xyn.class;
    }

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final Class<? extends InterfaceC1839920xyo> provideResultModel() {
        return InterfaceC1839920xyo.class;
    }
}
