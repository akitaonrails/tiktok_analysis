package Y;

import X.C09JN;
import X.C0KQH;
import X.C0TGS;
import X.C1338270kvh;
import X.C1C7U;
import X.C1CC2;
import X.C20441214yg;
import X.C2188811AlT;
import X.C784630UqD;
import X.C784650UqF;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.game.model.CreateHighLightResult;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public class AfS0S0100400_12 implements C09JN {
    public final int $t;
    public long j1;
    public long j2;
    public long j3;
    public long j4;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS0S0100400_12 afS0S0100400_12, Object obj) {
        boolean z;
        int i;
        String str;
        long jLongValue;
        C1C7U.LIZ("LiveGameMsgView2@4005.remoteCutHighlight$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && baseResponse.statusCode == 0) {
            z = true;
        } else {
            z = false;
        }
        Integer numValueOf = null;
        Long lValueOf = null;
        if (z) {
            AtomicInteger atomicInteger = ((C784630UqD) afS0S0100400_12.l0).LLJZ;
            atomicInteger.set(atomicInteger.get() + 1);
            CreateHighLightResult createHighLightResult = (CreateHighLightResult) baseResponse.data;
            Map<String, Object> map = C1338270kvh.LIZ;
            long j = afS0S0100400_12.j1;
            if (createHighLightResult == null || (str = createHighLightResult.fragmentIdStr) == null) {
                str = "";
            }
            C0TGS.LIZIZ(0, j, str, true);
            C784630UqD c784630UqD = (C784630UqD) afS0S0100400_12.l0;
            c784630UqD.LJJ(0, c784630UqD.getActivity().getString(2131841697));
            C784630UqD c784630UqD2 = (C784630UqD) afS0S0100400_12.l0;
            c784630UqD2.LLJZIJLIL = afS0S0100400_12.j1;
            c784630UqD2.LLL = createHighLightResult;
            if (createHighLightResult != null) {
                lValueOf = Long.valueOf(createHighLightResult.fragmentId);
            }
            long j2 = afS0S0100400_12.j1;
            long j3 = afS0S0100400_12.j2;
            long j4 = afS0S0100400_12.j3;
            long j5 = afS0S0100400_12.j4;
            long j6 = ((C784630UqD) afS0S0100400_12.l0).LLJLLL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            } else {
                jLongValue = 0;
            }
            linkedHashMap.put("fragmentId", Long.valueOf(jLongValue));
            linkedHashMap.put("room_id", Long.valueOf(j2));
            linkedHashMap.put("current_time", Long.valueOf(j3));
            linkedHashMap.put("start_live_time", Long.valueOf(j4));
            linkedHashMap.put("live_duration", Long.valueOf(j5));
            linkedHashMap.put("last_record_time", Long.valueOf(j6));
            C1CC2.LJII(0, C0KQH.LIZ("ttlive_highlight_button_click_result"), linkedHashMap);
            ((C784630UqD) afS0S0100400_12.l0).LLJLLL = afS0S0100400_12.j2;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("create highlight error. resCode=");
            if (baseResponse != null) {
                numValueOf = Integer.valueOf(baseResponse.statusCode);
            }
            sbLIZ.append(numValueOf);
            C20441214yg.LJ("LiveGameMsgView2", C2188811AlT.LIZIZ(sbLIZ));
            if (baseResponse != null) {
                i = baseResponse.statusCode;
            } else {
                i = -1;
            }
            C784650UqF.LIZ(i, "network response error", 1, afS0S0100400_12.j2, afS0S0100400_12.j3, afS0S0100400_12.j4, ((C784630UqD) afS0S0100400_12.l0).LLJLLL, afS0S0100400_12.j1);
        }
        C1C7U.LIZIZ("LiveGameMsgView2@4005.remoteCutHighlight$1");
    }

    public static final void accept$1(AfS0S0100400_12 afS0S0100400_12, Object obj) {
        C1C7U.LIZ("LiveGameMsgView2@4005.remoteCutHighlight$2");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create highlight error. throwable=");
        sbLIZ.append(th);
        C20441214yg.LJ("LiveGameMsgView2", C2188811AlT.LIZIZ(sbLIZ));
        C784650UqF.LIZ(2, th.getMessage(), 0, afS0S0100400_12.j1, afS0S0100400_12.j2, afS0S0100400_12.j3, ((C784630UqD) afS0S0100400_12.l0).LLJLLL, afS0S0100400_12.j4);
        C1C7U.LIZIZ("LiveGameMsgView2@4005.remoteCutHighlight$2");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS0S0100400_12(long r2, long r4, long r6, long r8, X.C784630UqD r10, int r11) {
        /*
            r1 = this;
            r1.$t = r11
            if (r11 == 0) goto L13
            r0 = r1
            r0.j1 = r2
            r0.j2 = r4
            r0.j3 = r6
            r0.l0 = r10
            r0.j4 = r8
        Lf:
            r0.<init>()
            return
        L13:
            r0 = r1
            r0.l0 = r10
            r0.j1 = r2
            r0.j2 = r4
            r0.j3 = r6
            r0.j4 = r8
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S0100400_12.<init>(long, long, long, long, X.0UqD, int):void");
    }
}
