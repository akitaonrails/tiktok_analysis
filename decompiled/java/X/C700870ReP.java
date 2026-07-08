package X;

import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ReP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700870ReP extends C09AY implements Function0<String> {
    public final /* synthetic */ FcpNodeProtocol LL;
    public final /* synthetic */ C700970ReZ LLILLJJLI;
    public final /* synthetic */ C699980Rcy LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C700870ReP(FcpNodeProtocol fcpNodeProtocol, C700970ReZ c700970ReZ, C699980Rcy c699980Rcy) {
        super(0);
        this.LL = fcpNodeProtocol;
        this.LLILLJJLI = c700970ReZ;
        this.LLILLL = c699980Rcy;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(" --- ");
        sbLIZ.append(this.LL.LLLII());
        sbLIZ.append(" --- doExecuteModifyFcpNodeInternal --- NeedContentionState: ");
        sbLIZ.append(this.LLILLJJLI.LJII);
        sbLIZ.append(", NodeState: ");
        sbLIZ.append(this.LLILLJJLI.LJ);
        sbLIZ.append(", ModifyState: ");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
