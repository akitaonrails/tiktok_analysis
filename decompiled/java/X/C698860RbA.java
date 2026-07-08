package X;

import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RbA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698860RbA extends C09AY implements Function0<String> {
    public final /* synthetic */ C699060RbU LL;
    public final /* synthetic */ C699090RbX<ComponentPriorityProtocol> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C698860RbA(C699060RbU c699060RbU, C699090RbX<ComponentPriorityProtocol> c699090RbX) {
        super(0);
        this.LL = c699060RbU;
        this.LLILLJJLI = c699090RbX;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComponentPriorityMaker --- try execute pendingTrigger. triggerState: ");
        sbLIZ.append(this.LL.LLJILJIL);
        sbLIZ.append(". component_tag: ");
        sbLIZ.append(this.LLILLJJLI.LL.H3());
        sbLIZ.append("=====================");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
