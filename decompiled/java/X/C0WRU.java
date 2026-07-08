package X;

import com.bytedance.pumbaa.pipeline.PrivacyEvent;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0WRU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WRU {
    public static final List<String> LIZ = Collections.singletonList("domain");

    public static final void LIZ(InterfaceC825580Wa4 interfaceC825580Wa4, String str, String str2) {
        PrivacyEvent privacyEvent;
        if (interfaceC825580Wa4 != null && C823240WRe.LIZ().enableDecisionTraceLog) {
            if ((interfaceC825580Wa4 instanceof PrivacyEvent) && (privacyEvent = (PrivacyEvent) interfaceC825580Wa4) != null) {
                privacyEvent.appendDecisionTrace$pipeline_release(str, str2);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(str);
            sbLIZ.append("] ");
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
