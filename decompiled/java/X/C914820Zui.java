package X;

import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestPhase2EventTrackingOpt;
import com.bytedance.android.livesdk.model.linksetting.CoHost;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import webcast.data.LinkmicGuestUser;

/* JADX INFO: renamed from: X.0Zui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C914820Zui {
    public static final Map<Long, C936770aU7> LIZ = new LinkedHashMap();
    public static final Map<Long, C936770aU7> LIZIZ = new LinkedHashMap();
    public static int LIZJ;

    public static void LIZ(Map map) {
        int i;
        Map linkedHashMap;
        CoHost coHost;
        if (C950220apo.LJI()) {
            return;
        }
        C20441214yg.LJIIIZ("HostWithGuestTracking", "overwriteDataWithRoomEnterForAudience");
        Room roomLIZJ = C950220apo.LIZJ();
        if (roomLIZJ != null) {
            RoomLinkInfo linkMicInfo = roomLIZJ.getLinkMicInfo();
            int i2 = 0;
            if (linkMicInfo != null) {
                i = linkMicInfo.linkerMode;
            } else {
                i = 0;
            }
            HashMap map2 = (HashMap) map;
            map2.put("linker_mode", String.valueOf(i));
            if (C948770anT.LJ()) {
                map2.put("current_connection_cnts", String.valueOf(C950220apo.LJIIIIZZ(roomLIZJ).size()));
                MultiLiveUserSettings multiLiveUserSettings = roomLIZJ.multiLiveUserSettings;
                if (multiLiveUserSettings == null || (coHost = multiLiveUserSettings.coHost) == null || (linkedHashMap = coHost.linkedGuestUsers) == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                map2.put("both_guest_cnt", String.valueOf(linkedHashMap.size()));
                if (i == 2 || i == 3) {
                    if (!linkedHashMap.isEmpty()) {
                        Iterator it2 = linkedHashMap.entrySet().iterator();
                        i2 = 0;
                        while (it2.hasNext()) {
                            if (((LinkmicGuestUser) ((Map.Entry) it2.next()).getValue()).roomId == roomLIZJ.getId()) {
                                i2++;
                            }
                        }
                    }
                    map2.put("guest_cnt", String.valueOf(i2));
                }
                if (CohostWithGuestPhase2EventTrackingOpt.INSTANCE.isEnabled()) {
                    Collection collectionValues = linkedHashMap.values();
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
                    Iterator it3 = collectionValues.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(Long.valueOf(((LinkmicGuestUser) it3.next()).userId));
                    }
                    String string = arrayList.toString();
                    map2.put("guest_id_list", string);
                    map2.put("accu_guest_id_list", string);
                }
            }
        }
    }
}
