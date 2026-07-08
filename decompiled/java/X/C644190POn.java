package X;

import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.tracker.LocationNetTracker;

/* JADX INFO: renamed from: X.0POn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C644190POn {
    public static LocationNetTracker.LocationNetRequestInfo LIZ(InterfaceC1201180hMa interfaceC1201180hMa) {
        RequestLog requestLog;
        RequestLog.Timing timing;
        if (interfaceC1201180hMa == null || interfaceC1201180hMa.getRequestInfo() == null || (requestLog = interfaceC1201180hMa.getRequestLog()) == null || (timing = requestLog.timing) == null || timing.detailedDuration == null) {
            return null;
        }
        return new LocationNetTracker.LocationNetRequestInfo(Long.valueOf(interfaceC1201180hMa.getRequestInfo().LJIILLIIL), Long.valueOf(interfaceC1201180hMa.getRequestInfo().LJ), Long.valueOf(interfaceC1201180hMa.getRequestInfo().LJFF), Long.valueOf(interfaceC1201180hMa.getRequestInfo().LJI), Long.valueOf(interfaceC1201180hMa.getRequestInfo().LJII), Long.valueOf(interfaceC1201180hMa.getRequestInfo().LJIIIZ), Long.valueOf(interfaceC1201180hMa.getRequestInfo().LJIILIIL), Long.valueOf(interfaceC1201180hMa.getRequestInfo().LJIILL), Long.valueOf(interfaceC1201180hMa.getRequestInfo().LJIJI), Long.valueOf(interfaceC1201180hMa.getRequestInfo().LJIJJ), interfaceC1201180hMa.getRequestLog().timing.detailedDuration.inner, interfaceC1201180hMa.getRequestLog().timing.detailedDuration.dns, interfaceC1201180hMa.getRequestLog().timing.detailedDuration.rtt, interfaceC1201180hMa.getRequestLog().timing.detailedDuration.send, interfaceC1201180hMa.getRequestLog().timing.detailedDuration.ssl, interfaceC1201180hMa.getRequestLog().timing.detailedDuration.tcp, interfaceC1201180hMa.getRequestLog().timing.detailedDuration.ttfb);
    }
}
