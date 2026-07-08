package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.poi.anchor.sensor.UserGlobalControl;
import java.util.Map;

/* JADX INFO: renamed from: X.1Ctk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244901Ctk implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        int iIntValue;
        Long l;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onClick data=");
        sbLIZ.append(videoItemParams);
        C2188811AlT.LIZIZ(sbLIZ);
        UserGlobalControl userGlobalControlLIZIZ = C2244891Ctj.LIZIZ();
        Integer num = userGlobalControlLIZIZ.consecutiveNoClickCount;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Long l2 = userGlobalControlLIZIZ.cacheLastNoClickTime;
        Long l3 = userGlobalControlLIZIZ.lastNoClickTime;
        int i = iIntValue - 1;
        if (i == C2244891Ctj.LIZJ - 1) {
            l = null;
        } else {
            l = l2;
            l2 = l3;
        }
        UserGlobalControl userGlobalControlLIZ = UserGlobalControl.LIZ(userGlobalControlLIZIZ, Integer.valueOf(i), l, l2, null, null, 24);
        Keva kevaLIZ = C2244891Ctj.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("encouraging_posting_user_guide_control_");
        sbLIZ2.append(C2244891Ctj.LJII);
        kevaLIZ.storeString(C2188811AlT.LIZIZ(sbLIZ2), userGlobalControlLIZ.LIZIZ());
        return new C1387205bq(null);
    }
}
