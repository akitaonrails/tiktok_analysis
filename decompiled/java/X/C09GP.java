package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandResponse;
import java.util.Iterator;

/* JADX INFO: renamed from: X.09GP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09GP {
    public static AgentCommandResponse.ResultStatus LIZ(int i) {
        AgentCommandResponse.ResultStatus next;
        Iterator<AgentCommandResponse.ResultStatus> it2 = AgentCommandResponse.ResultStatus.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getValue() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }
}
