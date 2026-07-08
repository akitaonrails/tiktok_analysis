package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.app.api.RequestLog;

/* JADX INFO: renamed from: X.0hMb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class C1201190hMb {
    public static RequestLog LIZ(InterfaceC1201180hMa interfaceC1201180hMa) {
        C1494600ozq requestInfo = interfaceC1201180hMa.getRequestInfo();
        if (requestInfo == null) {
            return null;
        }
        return (RequestLog) GsonProtectorUtils.fromJson(InterfaceC1201180hMa.LJLLLL, requestInfo.LJJIIJ, RequestLog.class);
    }
}
