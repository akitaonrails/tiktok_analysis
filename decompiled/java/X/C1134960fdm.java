package X;

import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.0fdm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134960fdm {
    public static final /* synthetic */ int LJIIL = 0;
    public int LIZ;
    public boolean LIZIZ = true;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;

    public final void LIZ(int i, boolean z) {
        if (z) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4 && i != 21 && i != 22) {
                        return;
                    }
                    this.LJIIIIZZ++;
                    return;
                }
                this.LJII++;
                return;
            }
            this.LJI++;
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 4 && i != 21 && i != 22) {
                    return;
                }
                this.LJIIJJI++;
                return;
            }
            this.LJIIJ++;
            return;
        }
        this.LJIIIZ++;
    }

    public final void LIZIZ(String str, boolean z) {
        int i;
        int i2;
        int i3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gift_queue_drop_msg");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            i = this.LJIIIZ;
            i2 = this.LJIIJ;
            i3 = this.LJIIJJI;
        } else {
            i = this.LJI;
            i2 = this.LJII;
            i3 = this.LJIIIIZZ;
        }
        if (i == 0 && i2 == 0 && i3 == 0) {
            return;
        }
        if (Intrinsics.LJFF(str, "_anchor")) {
            LinkedList<AbstractC1143340frI> linkedList = C1143330frH.LIZ;
            C1143330frH.LIZ(new C1143410frP(i + i2 + i3));
        } else if (Intrinsics.LJFF(str, "_self")) {
            LinkedList<AbstractC1143340frI> linkedList2 = C1143330frH.LIZ;
            C1143330frH.LIZ(new C1143480frW(i + i2 + i3));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(strLIZIZ);
        c474500IjALIZ.LJJII(Integer.valueOf(i), "small_gift_msg_total");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "big_gift_msg_total");
        c474500IjALIZ.LJJII(Integer.valueOf(i3), "sticker_gift_msg_total");
        c474500IjALIZ.LJJII("quit_room", "reason");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJL();
        }
    }

    public final void LIZJ(int i, boolean z) {
        Object obj;
        int i2;
        String str;
        Object obj2;
        if (this.LIZIZ) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_tray");
            long currentUserId = UserService.getInstance().user().getCurrentUserId();
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Map map = (Map) dataChannelGlobal.gg0(C1148040fys.class);
            if (map == null || (obj = (String) map.get("anchor_id")) == null) {
                obj = 0;
            }
            if ((obj instanceof Long) && currentUserId == ((Number) obj).longValue()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(i2), "is_anchor");
            c474500IjALIZ.LJJII(Integer.valueOf(this.LIZ), "gift_tray_show");
            c474500IjALIZ.LJJII(0, "gift_tray_not_show");
            c474500IjALIZ.LJJIFFI(Float.valueOf(0 / this.LIZ), "gift_tray_discard_rate");
            Object obj3 = CardStruct.IStatusCode.DEFAULT;
            if (z) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str, "is_anchor");
            Map map2 = (Map) dataChannelGlobal.gg0(C1148040fys.class);
            if (map2 != null && (obj2 = map2.get("anchor_id")) != null) {
                obj3 = obj2;
            }
            c474500IjALIZ.LJJII(obj3, "anchor_id");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "own_send_not_show");
            c474500IjALIZ.LJJII(Integer.valueOf(this.LIZLLL), "dropped_common_cnt");
            c474500IjALIZ.LJJII(Integer.valueOf(this.LJ), "dropped_effect_cnt");
            c474500IjALIZ.LJJII(0, "not_show_common_cnt");
            c474500IjALIZ.LJJII(0, "not_show_effect_cnt");
            c474500IjALIZ.LJJII(Integer.valueOf(this.LIZJ), "gift_tray_drop");
            c474500IjALIZ.LJJII(Integer.valueOf(this.LJFF), "own_send_drop");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LIZ();
            } else {
                c474500IjALIZ.LJJIJLIJ();
                c474500IjALIZ.LJIIIIZZ();
                w.LIZ.getClass();
                c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
                c474500IjALIZ.LJJII(w.LJIJI(), "request_id");
                c474500IjALIZ.LJJIJL();
            }
            this.LIZIZ = false;
        }
    }
}
