package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0UOM, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UOM {
    public static void LIZ(DataChannel dataChannel) {
        C0UOP c0uop = (C0UOP) dataChannel.gg0(C758410Tp1.class);
        if (c0uop != null && c0uop.LJFF.length() == 0) {
            c0uop.LJFF = "close";
            LIZIZ(c0uop, dataChannel);
        }
    }

    public static void LIZIZ(C0UOP c0uop, DataChannel dataChannel) {
        String strValueOf;
        Object obj;
        Object obj2;
        String string;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jCurrentTimeMillis = System.currentTimeMillis() - c0uop.LJ;
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (jCurrentTimeMillis > 0) {
            strValueOf = String.valueOf(jCurrentTimeMillis);
        } else {
            strValueOf = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("stay_duration", strValueOf);
        linkedHashMap.put("quit_type", c0uop.LJFF);
        linkedHashMap.put("preview_load_widget", String.valueOf(c0uop.LIZLLL));
        linkedHashMap.put("preview_didLoad_to_apear", String.valueOf(c0uop.LIZIZ));
        if (c0uop.LJII) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_smooth_golive", obj);
        linkedHashMap.put("smooth_check_permission", String.valueOf(c0uop.LJIIIIZZ));
        linkedHashMap.put("smooth_add_preview_fragment", String.valueOf(c0uop.LJIIIZ));
        if (c0uop.LJIIL) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_preview_page_recreated", obj2);
        linkedHashMap.put("t_go_live_tab", String.valueOf(c0uop.LJIILIIL));
        if (c0uop.LJIIJ) {
            linkedHashMap.put("clickable", "1");
        } else {
            linkedHashMap.put("clickable", CardStruct.IStatusCode.DEFAULT);
            Integer num = c0uop.LJIIJJI;
            if (num != null && (string = num.toString()) != null) {
                str2 = string;
            }
            linkedHashMap.put("reason", str2);
        }
        Long l = c0uop.LJI;
        if (l != null) {
            linkedHashMap.put("room_id", String.valueOf(l.longValue()));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_golive_page_duration");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LiveMode liveModeLIZJ = C751980Tee.LIZJ(dataChannel);
        if (liveModeLIZJ == null || (str = liveModeLIZJ.logStreamingType) == null) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "live_type");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LJJIIZI(C771990UQb.LIZ);
        C0UQX.LIZ(c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }
}
