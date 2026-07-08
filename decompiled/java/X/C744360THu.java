package X;

import android.app.ActivityManager;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0THu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C744360THu {
    public final Fragment LIZ;
    public int LIZIZ;
    public long LIZJ;
    public C11JF LIZLLL;

    public C744360THu(LiveBroadcastFragment liveBroadcastFragment) {
        this.LIZ = liveBroadcastFragment;
    }

    public final void LIZ(Context context, String str) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> listLJII;
        String idStr;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        String string;
        C19EG activity = this.LIZ.getActivity();
        if (activity == null || str.length() == 0) {
            return;
        }
        Object objH2 = C786410Ut5.H2(context, "activity");
        if (!(objH2 instanceof ActivityManager) || (activityManager = (ActivityManager) objH2) == null || (listLJII = C2204961BRm.LJII(activityManager, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD/IJh/lucBOiiryHprqpoKMsnyWBaYiYs3TXRND4ffRr42t92vOQ", null))) == null) {
            return;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : listLJII) {
            if (Intrinsics.LJFF(str, runningAppProcessInfo.processName)) {
                this.LIZIZ++;
                if (runningAppProcessInfo.importance > 125) {
                    C1ASM.LIZIZ(this.LIZ, activity, true, false, false, false);
                    int i = runningAppProcessInfo.importance;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("importance", String.valueOf(i));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("poll_times", String.valueOf(this.LIZIZ));
                    linkedHashMap2.put("poll_duration", String.valueOf(System.currentTimeMillis() - this.LIZJ));
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                    String str2 = "";
                    if (room == null || (idStr = room.getIdStr()) == null) {
                        idStr = "";
                    }
                    linkedHashMap3.put("room_id", idStr);
                    if ((room != null && (string = Long.valueOf(room.getOwnerUserId()).toString()) != null) || ((interfaceC500940JkiUser = UserService.getInstance().user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null && (string = Long.valueOf(currentUser.getId()).toString()) != null)) {
                        str2 = string;
                    }
                    linkedHashMap3.put("anchor_id", str2);
                    C1CC2.LJIILLIIL("foundation_broadcast", "live_anchor_importance_poll", C2348509Id.LIZLLL(linkedHashMap), C2348509Id.LIZLLL(linkedHashMap2), C2348509Id.LIZLLL(linkedHashMap3));
                    return;
                }
                return;
            }
        }
    }
}
