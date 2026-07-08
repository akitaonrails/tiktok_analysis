package X;

import android.os.Build;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.CaptionLanguageChannel;
import com.bytedance.android.livesdk.dataChannel.CaptionStartShowEvent;
import com.bytedance.android.livesdk.dataChannel.CaptionStateChangeEvent;
import com.bytedance.android.livesdk.dataChannel.CaptionStateEvent;
import com.bytedance.android.livesdk.dataChannel.CaptionTypeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.CaptionInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0DT5, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DT5 implements C1AKH {
    public DataChannel LIZ;
    public final String LIZIZ = C786410Ut5.t2(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale());

    @Override // X.InterfaceC1210380hbQ
    public final int LIZ() {
        return InterfaceC1106030et7.r6.LIZIZ().booleanValue() ? 2131842694 : 2131842695;
    }

    @Override // X.InterfaceC1210380hbQ
    public final boolean LIZIZ() {
        return !InterfaceC1106030et7.u6.LIZIZ().booleanValue();
    }

    @Override // X.InterfaceC1210380hbQ
    public final boolean LIZJ() {
        C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.r6;
        LJI("show", c20337914i1.LIZIZ().booleanValue() ? "on" : "off");
        return c20337914i1.LIZIZ().booleanValue();
    }

    @Override // X.InterfaceC1210380hbQ
    public final boolean LIZLLL() {
        Room roomLJJLIIIIJ;
        CaptionInfo captionInfo;
        User owner;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel == null || (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel)) == null || (captionInfo = roomLJJLIIIIJ.captionInfo) == null || !captionInfo.open) {
            return false;
        }
        Room roomLJJLIIIIJ2 = C500260Jjc.LJJLIIIIJ(this.LIZ);
        return roomLJJLIIIIJ2 == null || (owner = roomLJJLIIIIJ2.getOwner()) == null || owner.getSecret() == 0;
    }

    @Override // X.InterfaceC1210380hbQ
    public final void LJ() {
        DataChannel dataChannel;
        Long l;
        if (InterfaceC1106030et7.u6.LIZIZ().booleanValue()) {
            C766270U4b.LIZLLL(2131840985);
            return;
        }
        C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.r6;
        c20337914i1.LJFF(Boolean.valueOf(!c20337914i1.LIZIZ().booleanValue()));
        LJI("click", c20337914i1.LIZIZ().booleanValue() ? "on" : "off");
        if (!c20337914i1.LIZIZ().booleanValue() && (dataChannel = this.LIZ) != null && (l = (Long) dataChannel.gg0(CaptionStartShowEvent.class)) != null) {
            long jLongValue = l.longValue();
            if (jLongValue != 0) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_audience_caption_duration");
                c474500IjALIZ.LJIJJLI(this.LIZ);
                Map<String, String> mapLJFF = LJFF();
                HashMap map = (HashMap) mapLJFF;
                map.put("reason", "off");
                map.put("duration", String.valueOf((SystemClock.elapsedRealtime() - jLongValue) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                c474500IjALIZ.LJJIIZI(mapLJFF);
                c474500IjALIZ.LIZ();
                dataChannel.zW(CaptionStartShowEvent.class, 0L);
            }
        }
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 != null) {
            dataChannel2.zW(CaptionStateChangeEvent.class, c20337914i1.LIZIZ());
        }
        DataChannel dataChannel3 = this.LIZ;
        if (dataChannel3 != null) {
            dataChannel3.LC0(CaptionStateEvent.class, c20337914i1.LIZIZ());
        }
        if (!c20337914i1.LIZIZ().booleanValue()) {
            C766270U4b.LIZLLL(2131842686);
        }
        InterfaceC1106030et7.t6.LJFF(Boolean.TRUE);
    }

    public final Map<String, String> LJFF() {
        String requestId;
        Object objGg0;
        Object objGg02;
        Room room;
        Room room2;
        Room room3;
        User owner;
        HashMap map = new HashMap();
        DataChannel dataChannel = this.LIZ;
        long id = 0;
        map.put("anchor_id", String.valueOf((dataChannel == null || (room3 = (Room) dataChannel.gg0(RoomChannel.class)) == null || (owner = room3.getOwner()) == null) ? 0L : owner.getId()));
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 != null && (room2 = (Room) dataChannel2.gg0(RoomChannel.class)) != null) {
            id = room2.getId();
        }
        map.put("room_id", String.valueOf(id));
        DataChannel dataChannel3 = this.LIZ;
        Object obj = "";
        if (dataChannel3 == null || (room = (Room) dataChannel3.gg0(RoomChannel.class)) == null || (requestId = room.getRequestId()) == null) {
            requestId = "";
        }
        map.put("request_id", requestId);
        map.put("app_language", this.LIZIZ);
        DataChannel dataChannel4 = this.LIZ;
        if (dataChannel4 == null || (objGg0 = dataChannel4.gg0(CaptionLanguageChannel.class)) == null) {
            objGg0 = "";
        }
        map.put("caption_language", objGg0);
        DataChannel dataChannel5 = this.LIZ;
        if (dataChannel5 != null && (objGg02 = dataChannel5.gg0(CaptionTypeChannel.class)) != null) {
            obj = objGg02;
        }
        map.put("caption_type", obj);
        map.put("device_model", Build.MODEL);
        return map;
    }

    public final void LJI(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_audience_caption_icon_show");
        c474500IjALIZ.LJIJJLI(this.LIZ);
        Map<String, String> mapLJFF = LJFF();
        HashMap map = (HashMap) mapLJFF;
        map.put("operation_type", str);
        map.put("caption_status", str2);
        c474500IjALIZ.LJJIIZI(mapLJFF);
        c474500IjALIZ.LIZ();
    }
}
