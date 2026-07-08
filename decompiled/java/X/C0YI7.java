package X;

import android.os.SystemClock;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.Response;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0YI7, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YI7 {
    public final C0YEM LIZ;
    public final C0YIE LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1505));

    public final void LIZJ(C0YCX c0ycx) {
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch ws error:");
        sbLIZ.append(c0ycx.LIZ.cmd);
        sbLIZ.append(" and seq:");
        sbLIZ.append(c0ycx.LIZ.sequence_id);
        sbLIZ.append(" reason:");
        sbLIZ.append("ws unknown error");
        c868780Y6iLIZLLL.LJIIIIZZ("RemoteFetcherLogger", C2188811AlT.LIZIZ(sbLIZ), null);
    }

    public C0YI7(C0YEM c0yem, C0YE2 c0ye2) {
        this.LIZ = c0yem;
        this.LIZIZ = c0ye2;
    }

    public final void LIZIZ(C0YCX c0ycx, Response response) {
        String strLIZ;
        long jUptimeMillis = SystemClock.uptimeMillis() - c0ycx.LJFF;
        try {
            strLIZ = C0YMS.LIZ(response.cmd.intValue());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strLIZ = "";
        }
        C0YQL.LJ(this.LIZ, response.cmd.intValue(), "On Get Response By Http : cmd: " + response.cmd + " sequence_id= " + response.sequence_id, response);
        C0YJ9 c0yj9 = new C0YJ9(this.LIZ);
        c0yj9.LIZJ("imsdk_network_request");
        c0yj9.LIZ(response.cmd, "imsdk_cmd");
        c0yj9.LIZ(strLIZ, "url_path");
        c0yj9.LIZ(response.inbox_type, "inbox_type");
        c0yj9.LIZ(1, "imsdk_result");
        c0yj9.LIZ(response.sequence_id, "seq_id");
        c0yj9.LIZ(Long.valueOf(jUptimeMillis), "duration");
        c0yj9.LIZ("http", "net_type");
        c0yj9.LIZ(response.log_id, "log_id");
        c0yj9.LIZ(response.status_code, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0yj9.LIZ(Integer.valueOf(c0ycx.LIZLLL + c0ycx.LJ), "retry_times");
        c0yj9.LIZ(Integer.valueOf(this.LIZIZ.LJFF()), "ws_request_queue_length");
        c0yj9.LIZ(Integer.valueOf(this.LIZIZ.LIZLLL()), "http_request_queue_length");
        c0yj9.LIZ(Integer.valueOf(this.LIZIZ.LJ()), "total_request_queue_length");
        c0yj9.LIZLLL();
    }

    public final void LJ(C0YCX c0ycx, String str) {
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch switch to http:");
        sbLIZ.append(c0ycx.LIZ.cmd);
        sbLIZ.append(" and seq:");
        sbLIZ.append(c0ycx.LIZ.sequence_id);
        sbLIZ.append(" reason:");
        sbLIZ.append(str);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "RemoteFetcherLogger", C2188811AlT.LIZIZ(sbLIZ), 4);
    }

    public final void LIZLLL(C0YCX c0ycx, Response response, int i) {
        String strLIZ;
        long jUptimeMillis = SystemClock.uptimeMillis() - c0ycx.LJFF;
        try {
            strLIZ = C0YMS.LIZ(response.cmd.intValue());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strLIZ = "";
        }
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "RemoteFetcherLogger", "fetch ws success:" + c0ycx.LIZ.cmd + " and seq:" + c0ycx.LIZ.sequence_id, 4);
        C0YQL.LJ(this.LIZ, response.cmd.intValue(), "On Get Response By WS : cmd: " + response.cmd + " sequence_id= " + response.sequence_id, response);
        C0YJ9 c0yj9 = new C0YJ9(this.LIZ);
        c0yj9.LIZJ("imsdk_network_request");
        c0yj9.LIZ(response.cmd, "imsdk_cmd");
        c0yj9.LIZ(strLIZ, "url_path");
        c0yj9.LIZ(response.inbox_type, "inbox_type");
        c0yj9.LIZ(1, "imsdk_result");
        c0yj9.LIZ(response.sequence_id, "seq_id");
        c0yj9.LIZ(Long.valueOf(jUptimeMillis), "duration");
        c0yj9.LIZ("ws", "net_type");
        c0yj9.LIZ(response.log_id, "log_id");
        c0yj9.LIZ(response.status_code, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0yj9.LIZ(Integer.valueOf(c0ycx.LIZLLL), "retry_times");
        c0yj9.LIZ(Integer.valueOf(this.LIZIZ.LJFF()), "ws_request_queue_length");
        c0yj9.LIZ(Integer.valueOf(this.LIZIZ.LIZLLL()), "http_request_queue_length");
        c0yj9.LIZ(Integer.valueOf(this.LIZIZ.LJ()), "total_request_queue_length");
        c0yj9.LIZ(Integer.valueOf(i), "request_body_size");
        c0yj9.LIZLLL();
    }

    public final void LIZ(C0YCX c0ycx, C0YIS c0yis, int i, Exception exc) {
        Integer num;
        Integer num2;
        Integer num3;
        long jUptimeMillis = SystemClock.uptimeMillis() - c0ycx.LJFF;
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendByHttp cmd: ");
        Request request = c0yis.LJ;
        Long l = null;
        if (request != null) {
            num = request.cmd;
        } else {
            num = null;
        }
        sbLIZ.append(num);
        sbLIZ.append(" url: ");
        sbLIZ.append(c0yis.LIZ);
        c868780Y6iLIZLLL.LJIIIIZZ("RemoteFetcherLogger", C2188811AlT.LIZIZ(sbLIZ), exc);
        C0YJ9 c0yj9 = new C0YJ9(this.LIZ);
        c0yj9.LIZJ("imsdk_network_request");
        Request request2 = c0yis.LJ;
        if (request2 != null) {
            num2 = request2.cmd;
        } else {
            num2 = null;
        }
        c0yj9.LIZ(num2, "imsdk_cmd");
        c0yj9.LIZ(c0yis.LIZ, "url_path");
        Request request3 = c0yis.LJ;
        if (request3 != null) {
            num3 = request3.inbox_type;
        } else {
            num3 = null;
        }
        c0yj9.LIZ(num3, "inbox_type");
        c0yj9.LIZ(0, "imsdk_result");
        Request request4 = c0yis.LJ;
        if (request4 != null) {
            l = request4.sequence_id;
        }
        c0yj9.LIZ(l, "seq_id");
        c0yj9.LIZ(Long.valueOf(jUptimeMillis), "duration");
        String message = exc.getMessage();
        if (message == null) {
            message = "net_request_failed_fetcher";
        }
        c0yj9.LIZ(message, "error_msg");
        c0yj9.LIZ(Integer.valueOf(i), "error_code");
        this.LIZ.LJIIZILJ().LJFF().getEventTracker().getClass();
        c0yj9.LIZ(C0YLL.LIZIZ(exc), "error_stack");
        this.LIZ.LJIIZILJ().LJFF().getEventTracker().getClass();
        c0yj9.LIZ(C0YLL.LIZ(exc), "error_name");
        c0yj9.LIZ("http", "net_type");
        c0yj9.LIZ(Integer.valueOf(c0ycx.LIZLLL + c0ycx.LJ), "retry_times");
        c0yj9.LIZ(Integer.valueOf(this.LIZIZ.LJFF()), "ws_request_queue_length");
        c0yj9.LIZ(Integer.valueOf(this.LIZIZ.LIZLLL()), "http_request_queue_length");
        c0yj9.LIZ(Integer.valueOf(this.LIZIZ.LJ()), "total_request_queue_length");
        c0yj9.LIZLLL();
    }
}
