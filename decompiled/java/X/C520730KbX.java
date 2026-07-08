package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveSparkGlobalPropsFilterSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxEnv;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0KbX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520730KbX {
    public static final C520730KbX LIZ = new C520730KbX();
    public static volatile boolean LIZIZ;
    public static volatile Map<String, Object> LIZJ;

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0193, code lost:
    
        if (((com.bytedance.android.livesdkapi.host.IHostBridge) X.C1161920gLG.LIZJ(com.bytedance.android.livesdkapi.host.IHostBridge.class)).currentPageIsLiveHost() != false) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZ() {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C520730KbX.LIZ():java.util.Map");
    }

    public final Map<String, Object> LIZIZ() {
        Map<String, Object> mapLIZIZ;
        Map mapLIZIZ2;
        String string;
        String string2;
        String strLIZJ;
        C843920X8s c843920X8sJe0;
        User owner;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (LIZIZ) {
            Map<String, Object> map = LIZJ;
            boolean z = true;
            if (map == null || ((HashMap) map).isEmpty()) {
                synchronized (this) {
                    try {
                        Map<String, Object> map2 = LIZJ;
                        if (map2 != null && !((HashMap) map2).isEmpty()) {
                            z = false;
                        }
                        if (z && C1515210pX5.LIZLLL() != null && (mapLIZIZ2 = C1515210pX5.LIZIZ()) != null) {
                            LIZJ = new HashMap(mapLIZIZ2);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            mapLIZIZ = LIZJ;
        } else {
            mapLIZIZ = null;
        }
        if (mapLIZIZ == null) {
            mapLIZIZ = C1515210pX5.LIZLLL() != null ? C1515210pX5.LIZIZ() : null;
        }
        if (mapLIZIZ != null) {
            linkedHashMap.putAll(mapLIZIZ);
        }
        Object obj = linkedHashMap.get("device_id");
        if (obj != null) {
            linkedHashMap.put("deviceId", obj);
        }
        Object obj2 = linkedHashMap.get("version_name");
        if (obj2 != null) {
            linkedHashMap.put("appVersion", obj2);
        }
        Object obj3 = linkedHashMap.get("aid");
        if (obj3 != null) {
            linkedHashMap.put("appId", obj3);
        }
        Room room = C500260Jjc.LJJIJLIJ() ? null : (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        linkedHashMap.put("lynx_version", LynxEnv.inst().getLynxVersion());
        if (room == null || (string = Long.valueOf(room.getId()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("room_id", string);
        linkedHashMap.put("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        if (room == null || (owner = room.getOwner()) == null || (string2 = Long.valueOf(owner.getId()).toString()) == null) {
            string2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("anchor_id", string2);
        linkedHashMap.put("initTimestamp", String.valueOf(System.currentTimeMillis()));
        for (String str : LiveSparkGlobalPropsFilterSetting.INSTANCE.getValue()) {
            linkedHashMap.remove(str);
        }
        IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class);
        if (iGamePartnershipService == null || (c843920X8sJe0 = iGamePartnershipService.Je0()) == null || (strLIZJ = c843920X8sJe0.LIZJ()) == null) {
            strLIZJ = "";
        }
        linkedHashMap.put("adid", strLIZJ);
        return linkedHashMap;
    }

    public final void LIZJ(boolean z) {
        if (z == LIZIZ) {
            return;
        }
        synchronized (this) {
            try {
                if (z) {
                    LIZIZ = true;
                } else {
                    LIZIZ = false;
                    Map<String, Object> map = LIZJ;
                    if (map != null) {
                        map.clear();
                    }
                    LIZJ = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
