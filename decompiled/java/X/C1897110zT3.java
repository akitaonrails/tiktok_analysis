package X;

import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.api.model.Bubble;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zT3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1897110zT3 implements InterfaceC1896760zSU {
    public Bubble LIZ;
    public boolean LIZIZ;
    public final Keva LIZJ = Keva.getRepo("specact.pendant.bubble.StaticPendantLongBubble");

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
        sbLIZ.append("_pendant_is_click_");
        sbLIZ.append(bubble.bubbleId);
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    @Override // X.InterfaceC1896760zSU
    public final void LIZIZ(HashMap<Integer, Bubble> map) {
        String str;
        Bubble bubble = map.get(2);
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
                if (z || i != 1) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                String str4 = bubble2.bubbleId;
                Keva keva3 = this.LIZJ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("_bubble_first_show_time_");
                sbLIZ3.append(str4);
                if (jCurrentTimeMillis - keva3.getLong(C2188811AlT.LIZIZ(sbLIZ3), 0L) <= TimeUnit.DAYS.toMillis(bubble2.showAgainTime)) {
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
        if (bubble == null) {
            return false;
        }
        if (!C1897170zT9.LIZIZ(bubble)) {
            this.LIZIZ = false;
            return false;
        }
        if (!this.LIZIZ || i < bubble.showTimeVV) {
            return false;
        }
        if (interfaceC1896860zSe != null && interfaceC1896860zSe.normalPendantIsFold()) {
            return false;
        }
        String str = "";
        if (interfaceC1896860zSe != null) {
            String str2 = bubble.longContent;
            if (str2 == null) {
                str2 = "";
            }
            interfaceC1896860zSe.showNormalLongBubble(str2, "warmup_long_inform", bubble);
        }
        C1897170zT9.LIZ(bubble);
        this.LIZIZ = false;
        String str3 = bubble.LIZIZ;
        if (str3 != null && str3.length() != 0) {
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            int i2 = bubble.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String strValueOf = String.valueOf(bubble.bubbleType);
            if (strValueOf != null) {
                str = strValueOf;
            }
            linkedHashMap.put("sub_type", str);
            C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
            linkedHashMap.put("vv_cnt", String.valueOf(C1894330zOZ.LIZ().LJIILJJIL()));
            Integer num = bubble.LIZJ;
            c1894320zOY.getClass();
            C1894320zOY.LJIJJ(i2, linkedHashMap, num, null, null, "");
        }
        return true;
    }
}
