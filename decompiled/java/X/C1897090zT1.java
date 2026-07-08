package X;

import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.api.model.Bubble;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zT1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1897090zT1 implements InterfaceC1896760zSU {
    public Bubble LIZ;
    public boolean LIZIZ;
    public final Keva LIZJ = Keva.getRepo("specact.pendant.bubble.PendantClickTipBubble");

    @Override // X.InterfaceC1896760zSU
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.InterfaceC1896760zSU
    public final void LIZJ() {
        Bubble bubble;
        if (!Intrinsics.LJFF("CLICK_STATIC_PENDANT", "CLICK_STATIC_PENDANT") || (bubble = this.LIZ) == null) {
            return;
        }
        Keva keva = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(bubble.bubbleId);
        sbLIZ.append("_pendant_is_click");
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    public final long LJ() {
        Keva keva = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Bubble bubble = this.LIZ;
        sbLIZ.append(bubble != null ? bubble.bubbleId : null);
        sbLIZ.append("_bubble_first_show_time");
        return keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
    }

    public final int LJFF() {
        Keva keva = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Bubble bubble = this.LIZ;
        sbLIZ.append(bubble != null ? bubble.bubbleId : null);
        sbLIZ.append("_bubble_show_num");
        return keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    public final boolean LJI() {
        Keva keva = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Bubble bubble = this.LIZ;
        sbLIZ.append(bubble != null ? bubble.bubbleId : null);
        sbLIZ.append("_pendant_is_click");
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    @Override // X.InterfaceC1896760zSU
    public final void LIZIZ(HashMap<Integer, Bubble> map) {
        String str;
        Bubble bubble = map.get(4);
        this.LIZ = bubble;
        if (bubble != null) {
            str = bubble.shortContent;
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            if (this.LIZ != null) {
                int iLJFF = LJFF();
                boolean zLJI = LJI();
                if (iLJFF == 0) {
                    this.LIZIZ = true;
                    return;
                }
                if (zLJI) {
                    return;
                }
                if (iLJFF != 1) {
                    if (iLJFF != 2 || System.currentTimeMillis() - LJ() <= TimeUnit.DAYS.toMillis(r6.showAgainTimeY)) {
                        return;
                    }
                    this.LIZIZ = true;
                    return;
                }
                if (System.currentTimeMillis() - LJ() <= TimeUnit.DAYS.toMillis(r6.showAgainTimeX)) {
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
        String str;
        Bubble bubble = this.LIZ;
        if (bubble == null || !this.LIZIZ) {
            return false;
        }
        if (LJFF() != 0 && LJI()) {
            this.LIZIZ = false;
            return false;
        }
        if (i < bubble.showTimeVV) {
            return false;
        }
        if (interfaceC1896860zSe != null && interfaceC1896860zSe.normalPendantIsFold()) {
            return false;
        }
        String str2 = "";
        if (interfaceC1896860zSe != null) {
            String str3 = bubble.shortContent;
            if (str3 == null) {
                str3 = "";
            }
            interfaceC1896860zSe.showClickTipBubble(str3);
        }
        int iLJFF = LJFF();
        Keva keva = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Bubble bubble2 = this.LIZ;
        String str4 = null;
        if (bubble2 != null) {
            str = bubble2.bubbleId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append("_bubble_show_num");
        keva.storeInt(C2188811AlT.LIZIZ(sbLIZ), iLJFF + 1);
        if (LJ() == 0) {
            Keva keva2 = this.LIZJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            Bubble bubble3 = this.LIZ;
            if (bubble3 != null) {
                str4 = bubble3.bubbleId;
            }
            sbLIZ2.append(str4);
            sbLIZ2.append("_bubble_first_show_time");
            keva2.storeLong(C2188811AlT.LIZIZ(sbLIZ2), System.currentTimeMillis());
        }
        this.LIZIZ = false;
        String str5 = bubble.LIZIZ;
        if (str5 != null && str5.length() != 0) {
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            int i2 = bubble.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String strValueOf = String.valueOf(bubble.bubbleType);
            if (strValueOf != null) {
                str2 = strValueOf;
            }
            linkedHashMap.put("sub_type", str2);
            C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
            linkedHashMap.put("vv_cnt", String.valueOf(C1894330zOZ.LIZ().LJIILJJIL()));
            Integer num = bubble.LIZJ;
            c1894320zOY.getClass();
            C1894320zOY.LJIJJ(i2, linkedHashMap, num, null, null, "");
        }
        return true;
    }
}
