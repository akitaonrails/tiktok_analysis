package X;

import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fgB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136450fgB {
    public static final C1136450fgB LIZ = new C1136450fgB();

    public static Map LIZ(C1136560fgM c1136560fgM) {
        Long lValueOf;
        Long lValueOf2;
        boolean z;
        Object obj;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sticker_scene", C1128450fTH.LJIIJ().getDesc());
        Integer numValueOf = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        linkedHashMap.put("room_id", String.valueOf(lValueOf));
        if (room != null) {
            lValueOf2 = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf2 = null;
        }
        linkedHashMap.put("anchor_id", String.valueOf(lValueOf2));
        if (room != null && currentUserId == room.getOwnerUserId()) {
            z = true;
        } else {
            z = false;
        }
        String str = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_anchor", obj);
        C01GW c01gw = C1140890fnL.LIZ;
        linkedHashMap.put("render_sdk_version", String.valueOf(1));
        if (c1136560fgM != null) {
            C0T6Z c0t6z = c1136560fgM.LJIIZILJ;
            if (c0t6z != null) {
                linkedHashMap.putAll(c0t6z);
            }
            Gift giftFindGiftById = GiftManager.inst().findGiftById(c1136560fgM.LJIIL);
            if (giftFindGiftById != null) {
                numValueOf = Integer.valueOf(giftFindGiftById.type);
            }
            linkedHashMap.put("gift_id", String.valueOf(c1136560fgM.LJIIL));
            linkedHashMap.put("gift_type", String.valueOf(numValueOf));
            linkedHashMap.put("effect_id", String.valueOf(c1136560fgM.LJFF));
            if (c1136560fgM.LJJIIJZLJL == 0) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_cross_screen_gift", str);
            linkedHashMap.put("cross_screen_role", String.valueOf(c1136560fgM.LJJIIJZLJL));
            linkedHashMap.put("is_single_action", String.valueOf(c1136560fgM.LJJIIJ));
            linkedHashMap.put("cross_screen_order_id", String.valueOf(c1136560fgM.LJJIIZ));
            linkedHashMap.put("gift_recipient_team_id", String.valueOf(c1136560fgM.LJJIJIIJIL));
            linkedHashMap.put("current_user_team_id", String.valueOf(C1128450fTH.LJIILIIL()));
            String str2 = c1136560fgM.LJJJIL;
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("gift_channel", str2);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public static void LIZIZ(String str, JSONObject jSONObject, C1136560fgM c1136560fgM) {
        ?? LJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ.getClass();
        linkedHashMap.putAll(LIZ(c1136560fgM));
        try {
            Map<String, Object> map = JsonExtKt.toMap(jSONObject);
            LJ = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            for (Object obj : map.entrySet()) {
                LJ.put(((Map.Entry) obj).getKey(), ((Map.Entry) obj).getValue().toString());
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            LJ = C2097608Jq.LJ();
        }
        linkedHashMap.putAll(LJ);
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
        try {
            C1CC2.LIZJ(u.LJJIII(str, "livesdk_", "ttlive_", false), new JSONObject(linkedHashMap), new JSONObject(), new JSONObject());
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }
}
