package X;

import com.bytedance.android.livesdk.dataChannel.PaidEventStatusChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.PaidEventPreview;

/* JADX INFO: renamed from: X.0IXv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C468250IXv {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(DataChannel dataChannel) {
        Object objGg0;
        if (dataChannel == null || (objGg0 = dataChannel.gg0(PaidEventStatusChannel.class)) == null) {
            objGg0 = EnumC464630IJx.NORMAL;
        }
        if (objGg0 == EnumC464630IJx.MASK) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(DataChannel dataChannel) {
        Object objGg0;
        if (dataChannel == null || (objGg0 = dataChannel.gg0(PaidEventStatusChannel.class)) == null) {
            objGg0 = EnumC464630IJx.NORMAL;
        }
        if (objGg0 != EnumC464630IJx.NORMAL && objGg0 != EnumC464630IJx.PAY_SUCCESS) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(DataChannel dataChannel, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_paid_event_stop_page_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LJJII(str, "button_name");
        c474500IjALIZ.LIZ();
    }

    public static EnumC464630IJx LIZLLL(Room room, Long l) {
        if (room != null && room.liveEventInfo != null) {
            if (!room.liveEventInfo.subscribed.booleanValue() && Intrinsics.LJFF(room.liveEventInfo.isPaidEvent, Boolean.TRUE)) {
                PaidEventPreview paidEventPreview = room.liveEventInfo.paidEventPreview;
                if (paidEventPreview != null && paidEventPreview.allowPreview == 1) {
                    if (l != null && l.longValue() >= 0) {
                        paidEventPreview.allowPreviewTime = l.longValue();
                    }
                    if (paidEventPreview.allowPreviewTime > 0) {
                        return EnumC464630IJx.PREVIEW;
                    }
                    return EnumC464630IJx.MASK;
                }
                return EnumC464630IJx.MASK;
            }
            return EnumC464630IJx.NORMAL;
        }
        return EnumC464630IJx.NORMAL;
    }

    public static void LJ(DataChannel dataChannel, String str) {
        String str2;
        C766270U4b.LIZLLL(2131852272);
        boolean zLIZ = LIZ(dataChannel);
        if (zLIZ) {
            str2 = "preview_end";
        } else {
            str2 = "in_preview";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_paid_event_preview_toast");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LJJII(str2, "preview_status");
        c474500IjALIZ.LJJII(str, "click_type");
        c474500IjALIZ.LIZ();
        if (zLIZ) {
            LIZIZ(dataChannel, str);
        }
    }
}
