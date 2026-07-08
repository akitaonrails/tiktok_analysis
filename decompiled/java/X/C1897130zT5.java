package X;

import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.api.model.Bubble;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0zT5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1897130zT5 implements InterfaceC1896760zSU {
    public Bubble LIZ;
    public boolean LIZIZ;
    public final Keva LIZJ = Keva.getRepo("specact.pendant.bubble.ClaimRewardsTimerLongBubble");

    @Override // X.InterfaceC1896760zSU
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1896760zSU
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.InterfaceC1896760zSU
    public final void LIZIZ(HashMap<Integer, Bubble> map) {
        String str;
        Bubble bubble = map.get(10);
        this.LIZ = bubble;
        if (bubble != null) {
            str = bubble.longContent;
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            Bubble bubble2 = this.LIZ;
            if (bubble2 != null) {
                String str2 = bubble2.bubbleId;
                Keva keva = this.LIZJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("_bubble_show_num_");
                sbLIZ.append(str2);
                int i = keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
                String str3 = bubble2.bubbleId;
                Keva keva2 = this.LIZJ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("_pendant_is_click_");
                sbLIZ2.append(str3);
                boolean z = keva2.getBoolean(C2188811AlT.LIZIZ(sbLIZ2), false);
                if (i == 0) {
                    this.LIZIZ = true;
                    return;
                }
                if (z || i >= bubble2.totalTimes) {
                    return;
                }
                int iLIZIZ = C1899200zWQ.LIZIZ();
                String str4 = bubble2.bubbleId;
                Keva keva3 = this.LIZJ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("_bubble_last_show_time_");
                sbLIZ3.append(str4);
                if ((iLIZIZ - keva3.getInt(C2188811AlT.LIZIZ(sbLIZ3), 0)) * LSPassThroughRecordSizeConfig.DEFAULT <= TimeUnit.DAYS.toMillis(bubble2.showAgainTime)) {
                    return;
                }
                this.LIZIZ = true;
                return;
            }
            return;
        }
        this.LIZIZ = false;
    }

    @Override // X.InterfaceC1896760zSU
    public final boolean LIZ(InterfaceC1896860zSe interfaceC1896860zSe, int i) {
        Bubble bubble = this.LIZ;
        if (bubble == null || !this.LIZIZ) {
            return false;
        }
        String str = bubble.bubbleId;
        Keva keva = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("_bubble_show_num_");
        sbLIZ.append(str);
        int i2 = keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        Keva keva2 = this.LIZJ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("_bubble_show_num_");
        sbLIZ2.append(str);
        keva2.storeInt(C2188811AlT.LIZIZ(sbLIZ2), i2 + 1);
        Keva keva3 = this.LIZJ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("_bubble_last_show_time_");
        sbLIZ3.append(str);
        keva3.storeInt(C2188811AlT.LIZIZ(sbLIZ3), C1899200zWQ.LIZIZ());
        this.LIZIZ = false;
        String str2 = bubble.LIZIZ;
        if (str2 != null && str2.length() != 0) {
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            int i3 = bubble.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String strValueOf = String.valueOf(bubble.bubbleType);
            if (strValueOf == null) {
                strValueOf = "";
            }
            linkedHashMap.put("sub_type", strValueOf);
            C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
            linkedHashMap.put("vv_cnt", String.valueOf(C1894330zOZ.LIZ().LJIILJJIL()));
            Integer num = bubble.LIZJ;
            c1894320zOY.getClass();
            C1894320zOY.LJIJJ(i3, linkedHashMap, num, null, null, "");
        }
        return true;
    }
}
