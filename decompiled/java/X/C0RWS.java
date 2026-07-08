package X;

import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RWS, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RWS extends C09AY implements Function0<String> {
    public final /* synthetic */ PriorityProtocol LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RWS(PriorityProtocol priorityProtocol) {
        super(0);
        this.LL = priorityProtocol;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostTag VideoTagContainerV2 winner is ");
        PriorityProtocol priorityProtocol = this.LL;
        sbLIZ.append(priorityProtocol != null ? priorityProtocol.zg() : null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
