package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0fXp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131270fXp {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(long j) {
        HashMap map = new HashMap();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        User user = (User) UserService.getInstance().user().getCurrentUser();
        String strLIZ = C501590Jll.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        map.put("user_id", strLIZ);
        map.put("gift_id", Long.valueOf(j));
        if (room != null) {
            map.put("anchor_id", Long.valueOf(room.getOwnerUserId()));
            map.put("room_id", Long.valueOf(room.getId()));
        }
        C1CC2.LJII(1, C0KQH.LIZ("ttlive_fast_gift_send"), map);
        map.put("user_id", Long.valueOf(user.getId()));
        C466380IQq c466380IQqLIZIZ = C466380IQq.LIZIZ();
        String str = EnumC1143310frF.Gift.info;
        c466380IQqLIZIZ.getClass();
        C466380IQq.LIZLLL(str, "ttlive_fast_gift_send", map);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("ttlive_fast_gift_send");
        c474500IjALIZ.LJJII(Long.valueOf(user.getId()), "user_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "gift_id");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public static final void LIZJ(Throwable th) {
        HashMap map = new HashMap();
        map.put("user_id", Long.valueOf(((User) UserService.getInstance().user().getCurrentUser()).getId()));
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            map.put("anchor_id", Long.valueOf(room.getOwnerUserId()));
            map.put("room_id", Long.valueOf(room.getId()));
        }
        if (th != null) {
            if (th instanceof C501520Jle) {
                map.put("error_code", Integer.valueOf(((C501520Jle) th).getErrorCode()));
            } else {
                map.put("error_code", 0);
            }
            map.put("error_msg", th.getMessage());
        }
        if (room != null && room.getRoomAuthStatus() != null && !room.getRoomAuthStatus().isEnableGift()) {
            C1CC2.LJIIJJI(1, C0KQH.LIZ("ttlive_gift_disable_but_sent"), map, 0L);
            C1CC2.LJII(1, C0KQH.LIZIZ("ttlive_gift_disable_but_sent"), map);
            C466380IQq c466380IQqLIZIZ = C466380IQq.LIZIZ();
            String str = EnumC1143310frF.Gift.info;
            c466380IQqLIZIZ.getClass();
            C466380IQq.LIZLLL(str, "ttlive_gift_disable_but_sent", map);
        }
    }

    public static final void LJI(String str) {
        HashMap map = new HashMap();
        map.put("error_msg", str);
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar(C0KQH.LIZ("ttlive_gift_list_status"))) {
            C1CC2.LJIILIIL(1, 0L, C0KQH.LIZ("ttlive_gift_list_status"), map);
        }
        C1CC2.LJIILJJIL(1, 0, C0KQH.LIZIZ("ttlive_gift_list_status"), map);
        C466380IQq c466380IQqLIZIZ = C466380IQq.LIZIZ();
        String str2 = EnumC1143310frF.Gift.info;
        c466380IQqLIZIZ.getClass();
        C466380IQq.LIZLLL(str2, "ttlive_gift_list_status", map);
    }

    public static final void LJII(long j) {
        if (!LiveMonitorSampleSetting.INSTANCE.isReportSlardar(C0KQH.LIZ("ttlive_gift_list_status"))) {
            return;
        }
        String strLIZ = C0KQH.LIZ("ttlive_gift_list_status");
        C1CC3 c1cc3 = C1CC2.LIZ;
        if (c1cc3 != null) {
            c1cc3.LIZLLL(j, strLIZ);
        }
    }

    public static final void LJ(long j, String str) {
        HashMap map = new HashMap();
        map.put("gift_id", Long.valueOf(j));
        if (str == null) {
            str = "";
        }
        map.put("gift_icon_url", str);
        C1CC2.LJII(0, C0KQH.LIZ("ttlive_gift_icon_load_status"), map);
    }

    public static final void LIZLLL(long j, String str, String str2) {
        HashMap map = new HashMap();
        map.put("gift_id", Long.valueOf(j));
        map.put("gift_icon_url", str);
        map.put("error_msg", str2);
        C1CC2.LJII(1, C0KQH.LIZ("ttlive_gift_icon_load_status"), map);
        C1CC2.LJII(1, C0KQH.LIZIZ("ttlive_gift_icon_load_status"), map);
        C466380IQq c466380IQqLIZIZ = C466380IQq.LIZIZ();
        String str3 = EnumC1143310frF.Gift.info;
        c466380IQqLIZIZ.getClass();
        C466380IQq.LIZLLL(str3, "ttlive_gift_icon_load_status", map);
    }

    public static void LJFF(int i, int i2, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_list_cancel");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "disposable_map_size");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "disposable_size");
        c474500IjALIZ.LJJII(Boolean.valueOf(z), "cancelled_active_request");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(final int i, final long j, final long j2, final int i2, final String str) {
        C1138350fjF.LJI(new Runnable() { // from class: X.0fYJ
            public final void LIZ() {
                HashMap map = new HashMap();
                map.put("asset_id", Long.valueOf(j));
                map.put("asset_type", Integer.valueOf(i));
                map.put("download_assets_from", Long.valueOf(j2));
                C01GW c01gw = C1140890fnL.LIZ;
                map.put("render_sdk_version", 1);
                map.put("error_code", Integer.valueOf(i2));
                map.put("error_msg", str);
                C1CC2.LJII(1, C0KQH.LIZ("ttlive_gift_asset_download_status"), map);
                C1CC2.LJII(1, C0KQH.LIZIZ("ttlive_gift_asset_download_status"), map);
                C466380IQq c466380IQqLIZIZ = C466380IQq.LIZIZ();
                String str2 = EnumC1143310frF.Gift.info;
                c466380IQqLIZIZ.getClass();
                C466380IQq.LIZLLL(str2, "ttlive_gift_asset_download_status", map);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiveGiftMonitor@78db.onGiftAssetDownloadFail$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiveGiftMonitor@78db.onGiftAssetDownloadFail$1");
            }
        });
    }
}
