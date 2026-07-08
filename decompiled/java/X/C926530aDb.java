package X;

import com.bytedance.android.live.liveinteract.platform.common.monitor.DeepLinkEnterMultiLiveRoomDataHandler;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aDb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926530aDb {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZIZ(boolean z) {
        String strLJII;
        InterfaceC925800aCQ interfaceC925800aCQLIZIZ = C925810aCR.LIZIZ();
        if (interfaceC925800aCQLIZIZ == null || (strLJII = interfaceC925800aCQLIZIZ.LJII()) == null) {
            strLJII = "";
        }
        if (strLJII.length() <= 0) {
            if (z) {
                strLJII = "interaction_entrance";
            } else {
                strLJII = "connection_button";
            }
        }
        C925600aC6.LIZ = strLJII;
        return strLJII;
    }

    public static boolean LIZ(boolean z, Room room) {
        if (room == null || room.getMosaicStatus() != 1) {
            return true;
        }
        if (z) {
            C766270U4b.LIZLLL(2131853480);
        }
        DeepLinkEnterMultiLiveRoomDataHandler deepLinkEnterMultiLiveRoomDataHandlerLIZIZ = C926520aDa.LIZIZ();
        if (deepLinkEnterMultiLiveRoomDataHandlerLIZIZ != null) {
            deepLinkEnterMultiLiveRoomDataHandlerLIZIZ.LIZ = null;
            deepLinkEnterMultiLiveRoomDataHandlerLIZIZ.LJFF = 0;
            deepLinkEnterMultiLiveRoomDataHandlerLIZIZ.LIZLLL = -1;
        }
        return false;
    }

    public static final void LIZJ(Room room, Function0<Unit> function0) {
        if (C926540aDc.LIZ() && LIZ(true, room)) {
            function0.invoke();
        }
    }
}
