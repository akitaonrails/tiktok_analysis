package X;

import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.api.model.Bubble;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zT4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1897120zT4 implements InterfaceC1896760zSU {
    public Bubble LIZ;
    public boolean LIZIZ;
    public final Keva LIZJ = Keva.getRepo("specact.pendant.bubble.PendantDynamicTipBubble");

    @Override // X.InterfaceC1896760zSU
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.InterfaceC1896760zSU
    public final void LIZJ() {
        Bubble bubble;
        if (!Intrinsics.LJFF("CLICK_STATIC_PENDANT", "CLICK_DYNAMIC_PENDANT") || (bubble = this.LIZ) == null) {
            return;
        }
        Keva keva = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("_pendant_is_click_");
        sbLIZ.append(bubble.bubbleId);
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    @Override // X.InterfaceC1896760zSU
    public final void LIZIZ(HashMap<Integer, Bubble> map) {
        String str;
        Bubble bubble = map.get(3);
        this.LIZ = bubble;
        if (bubble != null) {
            str = bubble.shortContent;
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            Bubble bubble2 = this.LIZ;
            if (bubble2 != null) {
                int iLJFF = LJFF(bubble2.bubbleId);
                String str2 = bubble2.bubbleId;
                Keva keva = this.LIZJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("_pendant_is_click_");
                sbLIZ.append(str2);
                boolean z = keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
                if (iLJFF == 0) {
                    this.LIZIZ = true;
                    return;
                }
                if (z) {
                    return;
                }
                if (iLJFF != 1) {
                    if (iLJFF != 2 || System.currentTimeMillis() - LJ(bubble2.bubbleId) <= TimeUnit.DAYS.toMillis(bubble2.showAgainTimeY)) {
                        return;
                    }
                    this.LIZIZ = true;
                    return;
                }
                if (System.currentTimeMillis() - LJ(bubble2.bubbleId) <= TimeUnit.DAYS.toMillis(bubble2.showAgainTimeX)) {
                    return;
                }
                this.LIZIZ = true;
                return;
            }
            return;
        }
        this.LIZIZ = false;
    }

    public final long LJ(String str) {
        Keva keva = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("_bubble_first_show_time_");
        sbLIZ.append(str);
        return keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
    }

    public final int LJFF(String str) {
        Keva keva = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("_bubble_show_num_");
        sbLIZ.append(str);
        return keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    @Override // X.InterfaceC1896760zSU
    public final boolean LIZ(InterfaceC1896860zSe interfaceC1896860zSe, int i) {
        Bubble bubble = this.LIZ;
        if (bubble == null || !this.LIZIZ) {
            return false;
        }
        if (LJFF(bubble.bubbleId) != 0) {
            String str = bubble.bubbleId;
            Keva keva = this.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("_pendant_is_click_");
            sbLIZ.append(str);
            if (keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
                this.LIZIZ = false;
                return false;
            }
        }
        if (i < bubble.showTimeVV) {
            return false;
        }
        String str2 = bubble.bubbleId;
        int iLJFF = LJFF(str2);
        Keva keva2 = this.LIZJ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("_bubble_show_num_");
        sbLIZ2.append(str2);
        keva2.storeInt(C2188811AlT.LIZIZ(sbLIZ2), iLJFF + 1);
        if (LJ(str2) == 0) {
            Keva keva3 = this.LIZJ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("_bubble_first_show_time_");
            sbLIZ3.append(str2);
            keva3.storeLong(C2188811AlT.LIZIZ(sbLIZ3), System.currentTimeMillis());
        }
        this.LIZIZ = false;
        String str3 = bubble.LIZIZ;
        if (str3 != null && str3.length() != 0) {
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            int i2 = bubble.LIZ;
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
            C1894320zOY.LJIJJ(i2, linkedHashMap, num, null, null, "");
        }
        return true;
    }
}
