package X;

import com.bytedance.helios.network.api.config.FuseConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wyr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840950Wyr extends C09AY implements Function0<String> {
    public final /* synthetic */ InterfaceC823460WSa LL;
    public final /* synthetic */ FuseConfig LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C840950Wyr(InterfaceC823460WSa interfaceC823460WSa, FuseConfig fuseConfig) {
        super(0);
        this.LL = interfaceC823460WSa;
        this.LLILLJJLI = fuseConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShutdownManager id:");
        sbLIZ.append(this.LL.LIZ().LIZ.LIZ);
        sbLIZ.append(" uuid:");
        sbLIZ.append(this.LL.LIZ().LJJIII);
        sbLIZ.append(" \nhandleResult:");
        sbLIZ.append(this.LL.LIZ().LJJIFFI);
        sbLIZ.append(" fuseConfig:");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
