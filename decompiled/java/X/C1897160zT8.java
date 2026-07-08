package X;

import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.api.model.Bubble;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.0zT8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1897160zT8 implements InterfaceC1896760zSU {
    public Bubble LIZ;
    public boolean LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(549));

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
        Bubble bubble = map.get(11);
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
                Keva keva = (Keva) this.LIZJ.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("_bubble_show_num_");
                sbLIZ.append(str2);
                if (keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0) >= bubble2.totalTimes) {
                    this.LIZIZ = false;
                    return;
                }
                int iLIZIZ = C1899200zWQ.LIZIZ();
                String str3 = bubble2.bubbleId;
                Keva keva2 = (Keva) this.LIZJ.getValue();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("_bubble_last_show_time_");
                sbLIZ2.append(str3);
                if (iLIZIZ - keva2.getInt(C2188811AlT.LIZIZ(sbLIZ2), 0) > TimeUnit.DAYS.toSeconds(bubble2.showAgainTime)) {
                    this.LIZIZ = true;
                    return;
                }
                return;
            }
            return;
        }
        this.LIZIZ = false;
    }

    @Override // X.InterfaceC1896760zSU
    public final boolean LIZ(InterfaceC1896860zSe interfaceC1896860zSe, int i) {
        Bubble bubble;
        if (!this.LIZIZ || (bubble = this.LIZ) == null) {
            return false;
        }
        String str = bubble.bubbleId;
        Keva keva = (Keva) this.LIZJ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("_bubble_show_num_");
        sbLIZ.append(str);
        int i2 = keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        Keva keva2 = (Keva) this.LIZJ.getValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("_bubble_show_num_");
        sbLIZ2.append(str);
        keva2.storeInt(C2188811AlT.LIZIZ(sbLIZ2), i2 + 1);
        Keva keva3 = (Keva) this.LIZJ.getValue();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("_bubble_last_show_time_");
        sbLIZ3.append(str);
        keva3.storeInt(C2188811AlT.LIZIZ(sbLIZ3), C1899200zWQ.LIZIZ());
        return true;
    }
}
