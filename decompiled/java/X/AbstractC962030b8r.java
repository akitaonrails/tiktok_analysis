package X;

import android.os.SystemClock;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostDataHolderRefactorSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0b8r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC962030b8r extends C0K04 {
    public static final /* synthetic */ int LJFF = 0;
    public final long LIZ = SystemClock.uptimeMillis();
    public JSONObject LIZIZ = new JSONObject();
    public JSONObject LIZJ = new JSONObject();
    public JSONObject LIZLLL = new JSONObject();
    public final String LJ = "";

    public void LJIILLIIL() {
    }

    public int LJIJ() {
        return 0;
    }

    public abstract boolean LJIJJ();

    public final void LJIIZILJ() {
        this.LIZIZ = new JSONObject();
        this.LIZJ = new JSONObject();
        this.LIZLLL = new JSONObject();
    }

    public final void LJIILIIL() {
        LJIIJ(this.LIZJ, "cost", Long.valueOf(SystemClock.uptimeMillis() - this.LIZ), true);
    }

    public String LJIJI() {
        return this.LJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[PHI: r0 r2
      0x007a: PHI (r0v13 java.lang.String) = (r0v10 java.lang.String), (r0v12 java.lang.String), (r0v15 java.lang.String) binds: [B:31:0x00a3, B:26:0x008e, B:21:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x007a: PHI (r2v4 long) = (r2v2 long), (r2v3 long), (r2v5 long) binds: [B:31:0x00a3, B:26:0x008e, B:21:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(java.lang.Throwable r9) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC962030b8r.LJIIJJI(java.lang.Throwable):void");
    }

    public final void LJIILL(AbstractC1136060ffY abstractC1136060ffY) {
        if (abstractC1136060ffY != null) {
            LJIIJ(this.LIZLLL, "message_id", Long.valueOf(abstractC1136060ffY.baseMessage.messageId), true);
            LJIIJ(this.LIZLLL, "message_fetch_time", Long.valueOf(abstractC1136060ffY.timestamp), true);
            LJIIJ(this.LIZLLL, "message_receive_time", Long.valueOf(abstractC1136060ffY.receiveTime), true);
            LJIIJ(this.LIZLLL, "message_create_time", Long.valueOf(abstractC1136060ffY.baseMessage.createTime), true);
        }
    }

    public void LJIJJLI(String str) {
        String idStr;
        long ownerUserId;
        LJIIL(str, "event_id", true);
        LJIIJ(this.LIZLLL, "event_id", str, true);
        LJIIJ(this.LIZLLL, "network_type", Long.valueOf(TTNetInit.getEffectiveConnectionType()), true);
        LJIIJ(this.LIZLLL, "server_timestamp", Long.valueOf(C158B.LIZ()), true);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (!Room.isValid(room) || room == null || (idStr = room.getIdStr()) == null) {
            idStr = CardStruct.IStatusCode.DEFAULT;
        }
        LJIIJ(this.LIZLLL, "room_id", idStr, true);
        LJIIJ(this.LIZLLL, "channel_id", String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()), false);
        LJIIJ(this.LIZLLL, "device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()), true);
        LJIIJ(this.LIZLLL, "user_id", C501590Jll.LIZ(), true);
        Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room2 != null) {
            ownerUserId = room2.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        LJIIJ(this.LIZLLL, "anchor_id", Long.valueOf(ownerUserId), true);
        C915980Zwa.LJII().jn1();
        LJIIL(1, "is_cross_arc_active", false);
        LJIIL(Integer.valueOf(MultiHostCrossAdapterImpl.LLLIIIL ? 1 : 0), "is_cross_arc_enable", true);
        LJIIL(Integer.valueOf(MultiHostCrossAdapterImpl.LLLIIL ? 1 : 0), "is_cross_arc_sdk_enable", true);
        if (MultiHostCrossAdapterImpl.LLLIIIL && MultiHostCrossAdapterImpl.LLLIIL) {
            LJIIL(Long.valueOf(C915980Zwa.LJII().getInnerChannelId()), "inner_channel_id", true);
            C915980Zwa.LJII().jn1();
            LJIIL(Long.valueOf(C915980Zwa.LJII().getChannelId()), "group_channel_id", false);
        }
        LJIIL(Integer.valueOf(LiveCoHostDataHolderRefactorSetting.INSTANCE.getValue()), "data_holder_refactor", true);
        C985690bl1.LIZ.getClass();
        LJIIJ(this.LIZLLL, "game_resource_status", Integer.valueOf(C985690bl1.LJ), true);
        LJIILLIIL();
        JSONObject jSONObject = this.LIZIZ;
        JSONObject jSONObject2 = this.LIZJ;
        JSONObject jSONObject3 = this.LIZLLL;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObject3.put(next, jSONObject.opt(next));
        }
        Iterator<String> itKeys2 = jSONObject2.keys();
        while (itKeys2.hasNext()) {
            String next2 = itKeys2.next();
            jSONObject3.put(next2, jSONObject2.opt(next2));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("eventId:");
        sbLIZ.append(str);
        sbLIZ.append(" , extra:");
        sbLIZ.append(jSONObject3);
        sbLIZ.append(" , category:");
        sbLIZ.append(jSONObject);
        C944240agA.LJFF("ttlive_cohost", C2188811AlT.LIZIZ(sbLIZ));
        if (C1078990eBV.LIZ(LJIJI(), str)) {
            C962910bAH.LIZJ(str, jSONObject3, jSONObject, jSONObject2, false, LJIJ(), LJIJJ());
            C501590Jll.LJFF(jSONObject3);
            C1CC2.LJFF(LJIJI(), jSONObject, jSONObject2, jSONObject3);
        }
    }

    public static void LJIILJJIL(AbstractC962030b8r abstractC962030b8r, String str, Object obj) {
        LJIIJ(abstractC962030b8r.LIZLLL, str, obj, true);
    }

    public final void LJIIL(Object obj, String str, boolean z) {
        LJIIJ(this.LIZIZ, str, obj, z);
    }

    public static final void LJIIJ(JSONObject jSONObject, String str, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (jSONObject.has(str) && !z) {
            return;
        }
        if (obj instanceof Integer) {
            C0K04.LIZLLL(((Number) obj).intValue(), str, jSONObject);
            return;
        }
        if (obj instanceof Long) {
            C0K04.LJ(str, ((Number) obj).longValue(), jSONObject);
            return;
        }
        if (obj instanceof Float) {
            C0K04.LJIIIIZZ(jSONObject, str, ((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            C0K04.LIZJ(((Number) obj).doubleValue(), str, jSONObject);
            return;
        }
        if (obj instanceof String) {
            C0K04.LJFF(str, (String) obj, jSONObject);
            return;
        }
        if (obj instanceof Boolean) {
            C0K04.LJIIIZ(jSONObject, str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof JSONObject) {
            C0K04.LJII(str, jSONObject, (JSONObject) obj);
        } else if (obj instanceof JSONArray) {
            C0K04.LJI(str, (JSONArray) obj, jSONObject);
        } else {
            C0K04.LJFF(str, obj.toString(), jSONObject);
        }
    }
}
