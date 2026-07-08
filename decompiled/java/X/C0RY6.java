package X;

import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RY6, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RY6 extends C09AY implements Function0<String> {
    public final /* synthetic */ C0RY5 LL;
    public final /* synthetic */ PriorityProtocol LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RY6(C0RY5 c0ry5, PriorityProtocol priorityProtocol, boolean z) {
        super(0);
        this.LL = c0ry5;
        this.LLILLJJLI = priorityProtocol;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MakerRuntime notifyPriority modify callback => rootKey: ");
        C700970ReZ c700970ReZIn = this.LL.LLILLJJLI.In();
        sbLIZ.append(c700970ReZIn != null ? c700970ReZIn.LIZJ : null);
        sbLIZ.append(", componentKey: ");
        sbLIZ.append(this.LLILLJJLI.zg());
        sbLIZ.append(", avoidState: ");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
