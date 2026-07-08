package X;

import com.bytedance.lynx.hybrid.ssp.RecordingTopDomainRequestResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS31S0000100_16;

/* JADX INFO: renamed from: X.0dF9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042810dF9 extends C09AY implements Function1<RecordingTopDomainRequestResult, Unit> {
    public final /* synthetic */ Function1<RecordingTopDomainRequestResult, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1042810dF9(AwS31S0000100_16 awS31S0000100_16) {
        super(1);
        this.LL = awS31S0000100_16;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RecordingTopDomainRequestResult recordingTopDomainRequestResult) {
        this.LL.invoke(recordingTopDomainRequestResult);
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" update Top Domain Rule List finish, result: ");
        sbLIZ.append(recordingTopDomainRequestResult);
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "SSPBase_", 2);
        return Unit.LIZ;
    }
}
