package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDConfig;
import com.bytedance.pumbaa.utility.service.AutoDFIDConfig;
import com.bytedance.pumbaa.utility.service.BPEATransmitConfig;
import com.bytedance.pumbaa.utility.service.CrossStackConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WvY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838900WvY extends C09AY implements Function0<String> {
    public final /* synthetic */ BPEATransmitConfig LL;
    public final /* synthetic */ CrossStackConfig LLILLJJLI;
    public final /* synthetic */ MethodIDConfig LLILLL;
    public final /* synthetic */ AutoDFIDConfig LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C838900WvY(BPEATransmitConfig bPEATransmitConfig, CrossStackConfig crossStackConfig, MethodIDConfig methodIDConfig, AutoDFIDConfig autoDFIDConfig) {
        super(0);
        this.LL = bPEATransmitConfig;
        this.LLILLJJLI = crossStackConfig;
        this.LLILLL = methodIDConfig;
        this.LLILZ = autoDFIDConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init success , bpea_transmit_config:");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pns_cross_stack_config:");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", pns_methodID_config:");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", pns_dfid_config:");
        sbLIZ.append(this.LLILZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
