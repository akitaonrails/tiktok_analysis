package X;

import com.bytedance.android.livesdk.sei.LiveSeiStruct;
import com.bytedance.android.livesdk.sei.TicketInfo;
import com.bytedance.android.livesdk.sei.TicketInfoExtra;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0aWs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C938480aWs implements InterfaceC938500aWu {
    @Override // X.InterfaceC938500aWu
    public final void LIZ(C945320ahu c945320ahu, Function1<? super TicketInfoExtra, Unit> function1) {
        TicketInfoExtra ticketInfoExtra;
        TicketInfoExtra ticketInfoExtra2;
        if (c945320ahu != null) {
            try {
                LiveSeiStruct liveSeiStruct = c945320ahu.LIZ;
                if (liveSeiStruct != null && (ticketInfoExtra2 = liveSeiStruct.ticketSeiData) != null) {
                    LIZIZ(ticketInfoExtra2, "onReceiveLiveStreamSei", function1);
                    return;
                }
                String str = c945320ahu.LIZIZ;
                if (str != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onReceiveLiveStreamSei seiOrigin:");
                    sbLIZ.append(str);
                    C20441214yg.LJ("TicketReaderHelper", C2188811AlT.LIZIZ(sbLIZ));
                    JSONObject jSONObject = new JSONObject(str);
                    try {
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    if (jSONObject.optJSONObject("mg_t") != null) {
                        ticketInfoExtra = (TicketInfoExtra) C19748512Ol.LIZIZ.LJII(JSONObjectProtectorUtils.getString(jSONObject, "mg_t"), TicketInfoExtra.class);
                    } else {
                        ticketInfoExtra = null;
                    }
                    LIZIZ(ticketInfoExtra, "onReceiveLiveStreamSeiFromSeiOrigin", function1);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onReceiveLiveStreamSei e:");
                sbLIZ2.append(th2.getMessage());
                C20441214yg.LJ("TicketReaderHelper", C2188811AlT.LIZIZ(sbLIZ2));
                LIZIZ(null, "onLiveStreamSeiUpdateError", function1);
            }
        }
    }

    public static void LIZIZ(TicketInfoExtra ticketInfoExtra, String str, Function1 function1) {
        Integer numValueOf;
        Map<String, TicketInfo> map;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTicketsExtra:");
        if (ticketInfoExtra != null && (map = ticketInfoExtra.map) != null) {
            numValueOf = Integer.valueOf(map.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", source:");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("TicketReaderHelper", C2188811AlT.LIZIZ(sbLIZ));
        function1.invoke(ticketInfoExtra);
    }
}
