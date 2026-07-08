package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QIt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668170QIt {
    public long LIZ;
    public boolean LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public InterfaceC1201180hMa LJ;
    public int LJFF;
    public long LJI;
    public String LJII;
    public int LJIIIIZZ = -1;
    public boolean LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public boolean LJIIL;
    public Long LJIILIIL;
    public long LJIILJJIL;
    public boolean LJIILL;

    public final void LIZIZ() {
        if (Intrinsics.LJFF(this, C668180QIu.LIZ) || this.LIZ == 0) {
            return;
        }
        this.LJI = System.currentTimeMillis();
        if (C1839207Ig.LIZ()) {
            C01V1.LIZIZ(new AwS554S0100000_10(this, 942));
        } else {
            LIZJ();
        }
        C0VWW.LIZIZ("latency_search_sug");
    }

    public final void LIZJ() {
        int i;
        RequestLog.DetailedDuration detailedDuration;
        String str;
        RequestLog.DetailedDuration detailedDuration2;
        String str2;
        RequestLog.DetailedDuration detailedDuration3;
        String str3;
        RequestLog.DetailedDuration detailedDuration4;
        String str4;
        RequestLog.DetailedDuration detailedDuration5;
        String str5;
        RequestLog.DetailedDuration detailedDuration6;
        String str6;
        RequestLog.DetailedDuration detailedDuration7;
        String str7;
        this.LJFF = (int) (this.LJI - this.LIZ);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", this.LJFF);
        int i2 = this.LJFF;
        if (i2 > 100000 || i2 < 0) {
            return;
        }
        InterfaceC1201180hMa interfaceC1201180hMa = this.LJ;
        if (interfaceC1201180hMa != null) {
            RequestLog requestLog = interfaceC1201180hMa.getRequestLog();
            if (requestLog != null) {
                RequestLog.Other other = requestLog.other;
                Integer numValueOf = null;
                jSONObject.put("libcore", other != null ? other.libcore : null);
                RequestLog.Timing timing = requestLog.timing;
                jSONObject.put("body_recv", (timing == null || (detailedDuration7 = timing.detailedDuration) == null || (str7 = detailedDuration7.bodyRecv) == null) ? null : Integer.valueOf(CastIntegerProtector.parseInt(str7)));
                RequestLog.Timing timing2 = requestLog.timing;
                jSONObject.put("dns", (timing2 == null || (detailedDuration6 = timing2.detailedDuration) == null || (str6 = detailedDuration6.dns) == null) ? null : Integer.valueOf(CastIntegerProtector.parseInt(str6)));
                RequestLog.Timing timing3 = requestLog.timing;
                jSONObject.put("inner", (timing3 == null || (detailedDuration5 = timing3.detailedDuration) == null || (str5 = detailedDuration5.inner) == null) ? null : Integer.valueOf(CastIntegerProtector.parseInt(str5)));
                RequestLog.Timing timing4 = requestLog.timing;
                jSONObject.put("rtt", (timing4 == null || (detailedDuration4 = timing4.detailedDuration) == null || (str4 = detailedDuration4.rtt) == null) ? null : Integer.valueOf(CastIntegerProtector.parseInt(str4)));
                RequestLog.Timing timing5 = requestLog.timing;
                jSONObject.put("send", (timing5 == null || (detailedDuration3 = timing5.detailedDuration) == null || (str3 = detailedDuration3.send) == null) ? null : Integer.valueOf(CastIntegerProtector.parseInt(str3)));
                RequestLog.Timing timing6 = requestLog.timing;
                jSONObject.put("tcp", (timing6 == null || (detailedDuration2 = timing6.detailedDuration) == null || (str2 = detailedDuration2.tcp) == null) ? null : Integer.valueOf(CastIntegerProtector.parseInt(str2)));
                RequestLog.Timing timing7 = requestLog.timing;
                if (timing7 != null && (detailedDuration = timing7.detailedDuration) != null && (str = detailedDuration.ttfb) != null) {
                    numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str));
                }
                jSONObject.put("ttfb", numValueOf);
            }
            C1494600ozq requestInfo = this.LJ.getRequestInfo();
            if (requestInfo != null) {
                long j = this.LIZLLL - this.LIZJ;
                jSONObject.put("timing_total", j);
                Long l = this.LJIILIIL;
                if (l != null) {
                    long jLongValue = l.longValue();
                    if (jLongValue > 0) {
                        jSONObject.put("timing_net", j - jLongValue);
                    }
                }
                long j2 = this.LIZJ - this.LIZ;
                jSONObject.put("triggerNetCost", j2);
                jSONObject.put("timing_gap_start", requestInfo.LJI - this.LIZJ);
                jSONObject.put("timing_gap_end", 0);
                long j3 = this.LJI - this.LJIILJJIL;
                jSONObject.put("view_draw_cost", j3);
                jSONObject.put("client_cost", j2 + j3);
                if (this.LJIILL) {
                    jSONObject.put("cost", (int) (this.LIZJ - this.LIZ));
                    jSONObject.put("view_draw_cost", 0);
                    jSONObject.put("client_cost", 0);
                }
            }
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            Object obj = jSONObject.get(itKeys.next());
            if (((obj instanceof Integer) && ((Number) obj).intValue() < 0) || ((obj instanceof Long) && ((Number) obj).longValue() < 0)) {
                itKeys.remove();
            }
        }
        jSONObject.put("is_first_sug", this.LIZIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
        jSONObject.put("enter_from", this.LJII);
        jSONObject.put("is_ec", CardStruct.IStatusCode.DEFAULT);
        jSONObject.put("tab_name", this.LJIIJ);
        jSONObject.put("search_position", this.LJIIJJI);
        jSONObject.put("cache_type", this.LJIIIIZZ);
        jSONObject.put("has_tako_sug", this.LJIIIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
        jSONObject.put("is_predict", this.LJIIL);
        jSONObject.put("is_stable", this.LJIILL);
        C667590QGn.LIZ.getClass();
        String str8 = C667590QGn.LIZIZ;
        if (str8 == null) {
            str8 = "";
        }
        jSONObject.put("blankpage_id", str8);
        C0Q8Q.LIZ.getClass();
        C0Q8Q.LIZ("sug", jSONObject);
        AppLogNewUtils.onEventV3("search_trigger_sug_monitor", jSONObject);
        C794240VDq.LIZJ("search_trigger_sug_monitor", jSONObject);
        int i3 = this.LJFF;
        if (C0POO.LIZ() && i3 >= (i = C644150POj.LIZ().sugDurationMs)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sug request duration takes too long and exceeds the threshold: ");
            sbLIZ.append(i);
            C666110QAv c666110QAv = new C666110QAv(602, C2188811AlT.LIZIZ(sbLIZ));
            c666110QAv.LIZIZ(Integer.valueOf(i3), "duration");
            C0QO8.LIZ.LJII(c666110QAv);
        }
        this.LIZ = 0L;
    }

    public final void LIZLLL() {
        if (Intrinsics.LJFF(this, C668180QIu.LIZ)) {
            return;
        }
        this.LIZLLL = System.currentTimeMillis();
    }

    public final void LIZ(Long l) {
        if (Intrinsics.LJFF(this, C668180QIu.LIZ)) {
            return;
        }
        this.LJIILIIL = l;
    }
}
