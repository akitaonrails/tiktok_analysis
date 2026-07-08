package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;

/* JADX INFO: renamed from: X.0IUA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IUA {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static int LIZJ;
    public static long LIZLLL;
    public static String LJ;
    public static long LJFF;
    public static long LJI;
    public static long LJII;
    public static boolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static boolean LJIIJ;
    public static boolean LJIIJJI;
    public static boolean LJIIL;
    public static boolean LJIILIIL;
    public static boolean LJIILJJIL;
    public static boolean LJIILL;
    public static Map<String, String> LJIJ;
    public static int LJIJJ;
    public static String LJIJJLI;
    public static boolean LJIL;
    public static String LJJI;
    public static String LJJIIZI;
    public static String LJIILLIIL = "";
    public static String LJIIZILJ = "";
    public static String LJIJI = "";
    public static String LJJ = "";
    public static String LJJIFFI = "";
    public static int LJJII = -1;
    public static String LJJIII = "";
    public static String LJJIIJ = "";
    public static String LJJIIJZLJL = "";
    public static String LJJIIZ = "";

    public static void LIZLLL() {
        LIZLLL = 0L;
        LJFF = 0L;
        LJI = 0L;
        LJII = 0L;
        LIZJ = 0;
        LJIIIIZZ = false;
        LJIIJ = false;
        LJIIJJI = false;
        LJIIL = false;
        LJIILIIL = false;
        LIZ = false;
        LIZIZ = false;
        LJIJJ = 0;
    }

    public static Map LIZ() {
        return LJIJ;
    }

    public static void LIZJ(Map map) {
        map.put("lineup_anchor_type", CardStruct.IStatusCode.DEFAULT);
        int i = 2;
        if (LJIILJJIL) {
            map.put("live_lineup_type", "normal");
            if (LIZ) {
                if (!LIZIZ) {
                    i = 1;
                }
                map.put("lineup_anchor_type", String.valueOf(i));
                map.put("live_lineup_type", "live_house");
                return;
            }
            return;
        }
        if (LJIIIIZZ) {
            if (!LJIIIZ) {
                i = 1;
            }
            map.put("lineup_anchor_type", String.valueOf(i));
        }
        if (LJIIIIZZ && LJIIJ) {
            long j = LIZLLL;
            if (j != 0) {
                map.put("room_id", String.valueOf(j));
            }
            long j2 = LJFF;
            if (j2 != 0) {
                map.put("anchor_id", String.valueOf(j2));
            }
        }
    }

    public static void LJII(String str) {
        LJIJI = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x0263  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(java.util.List r8, java.util.Map r9) {
        /*
            Method dump skipped, instruction units count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IUA.LIZIZ(java.util.List, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(java.lang.String r6, java.lang.String r7) {
        /*
            com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerFollowSetting r0 = com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerFollowSetting.INSTANCE
            boolean r0 = r0.isFollowExp()
            if (r0 != 0) goto L9
            return
        L9:
            X.C0IUA.LJJI = r7
            X.C0IUA.LJJIIJZLJL = r7
            X.C0IUA.LJJ = r7
            X.C0IUA.LJJIIZ = r6
            r3 = 0
            r2 = 1
            if (r6 == 0) goto La4
            java.lang.String r0 = "tiktok_message"
            boolean r0 = kotlin.text.a0.LJJIIZI(r6, r0, r3)
            if (r0 != r2) goto La4
            r0 = 1
        L1e:
            java.lang.String r5 = "foru"
            java.lang.String r1 = "vertical_base_no_more"
            java.lang.String r4 = "following"
            if (r0 == 0) goto L66
            java.lang.String r0 = "56"
            X.C0IUA.LJJIIJ = r0
            java.lang.String r0 = "message_live_cell"
            X.C0IUA.LJJIII = r0
            X.C0IUA.LJJIIJZLJL = r4
        L30:
            java.lang.String r0 = "game"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r7)
            if (r0 == 0) goto L45
            if (r6 == 0) goto L45
            java.lang.String r0 = "vertical_game_no_more"
            boolean r0 = kotlin.text.a0.LJJIIZI(r6, r0, r3)
            if (r0 != r2) goto L45
        L42:
            X.C0IUA.LJJIIJZLJL = r5
        L44:
            return
        L45:
            java.lang.String r0 = "outdoor"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r7)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "fashion"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r7)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "mix_talent"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r7)
            if (r0 == 0) goto L44
        L5d:
            if (r6 == 0) goto L44
            boolean r0 = kotlin.text.a0.LJJIIZI(r6, r1, r3)
            if (r0 != r2) goto L44
            goto L42
        L66:
            if (r6 == 0) goto L98
            java.lang.String r0 = "tikcast_taxonomy_drawer_enter_feed"
            boolean r0 = kotlin.text.a0.LJJIIZI(r6, r0, r3)
            if (r0 == r2) goto L8f
            java.lang.String r0 = "tikcast_taxonomy_drawer_feed_refresh"
            boolean r0 = kotlin.text.a0.LJJIIZI(r6, r0, r3)
            if (r0 == r2) goto L8f
            java.lang.String r0 = "tikcast_taxonomy_drawer_feed_loadmore"
            boolean r0 = kotlin.text.a0.LJJIIZI(r6, r0, r3)
            if (r0 == r2) goto L8f
            boolean r0 = kotlin.text.a0.LJJIIZI(r6, r1, r3)
            if (r0 != r2) goto L98
            java.lang.String r0 = "97"
            X.C0IUA.LJJIIJ = r0
            java.lang.String r0 = "vertical_base_draw_no_more"
            X.C0IUA.LJJIII = r0
            goto L30
        L8f:
            java.lang.String r0 = "1222001"
            X.C0IUA.LJJIIJ = r0
            java.lang.String r0 = "tikcast_taxonomy_drawer_inner_feed"
            X.C0IUA.LJJIII = r0
            goto L30
        L98:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r7)
            if (r0 == 0) goto La2
            r0 = r5
        L9f:
            X.C0IUA.LJJIIJZLJL = r0
            goto L30
        La2:
            r0 = r7
            goto L9f
        La4:
            r0 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IUA.LJ(java.lang.String, java.lang.String):void");
    }

    public static void LJFF(String str, String str2) {
        if (str == null) {
            str = "";
        }
        LJIIZILJ = str;
        if (str2 == null) {
            str2 = "";
        }
        LJIILLIIL = str2;
    }

    public static void LJI(boolean z, boolean z2, Room room) {
        User user;
        if (z && z2) {
            OfficialChannelInfo officialChannelInfo = room.officialChannelInfo;
            if (officialChannelInfo != null && (user = officialChannelInfo.channelUser) != null) {
                LIZLLL = officialChannelInfo.backupRoomId;
                LJFF = user.getId();
            }
        } else {
            LIZLLL = room.getId();
            LJFF = room.getOwnerUserId();
        }
        LJI = room.getId();
        LJII = room.getOwnerUserId();
    }
}
