package X;

import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RbB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698870RbB extends C09AY implements Function0<String> {
    public final /* synthetic */ C699090RbX<ComponentPriorityProtocol> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C698870RbB(C699090RbX<ComponentPriorityProtocol> c699090RbX) {
        super(0);
        this.LL = c699090RbX;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComponentPriorityMaker --- execute pendingTrigger. ");
        sbLIZ.append(this.LL.LL.H3());
        sbLIZ.append(" =====================");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
