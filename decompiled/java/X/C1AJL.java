package X;

import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.other.TtliveGameRewardsEnhanceSetting;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS57S0000100_33;
import kotlin.jvm.internal.AwS66S0001000_33;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.1AJL, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AJL {
    public static long LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static C2177381AJk LIZLLL;

    static {
        C1276840jKc c1276840jKc = C1276840jKc.LIZ;
        AFwS224S0000000_33 aFwS224S0000000_33 = AFwS224S0000000_33.get$arr$(644);
        c1276840jKc.getClass();
        C1276840jKc.LJJJI = aFwS224S0000000_33;
    }

    public static String LIZIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 4) {
                return "text";
            }
            if (num.intValue() == 5) {
                return "image";
            }
            if (num.intValue() == 6) {
                return "event";
            }
            return "unknow";
        }
        return "unknow";
    }

    public static boolean LIZ(RoomSticker roomSticker, DataChannel dataChannel) {
        Room room;
        if (roomSticker == null || dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null || !C01SL.LIZ(room)) {
            return false;
        }
        TtliveGameRewardsEnhanceSetting ttliveGameRewardsEnhanceSetting = TtliveGameRewardsEnhanceSetting.INSTANCE;
        if (ttliveGameRewardsEnhanceSetting.enableSticker()) {
            return false;
        }
        return Intrinsics.LJFF(ttliveGameRewardsEnhanceSetting.dropsStickerId(), String.valueOf(roomSticker.id));
    }

    public static void LIZJ(RoomSticker roomSticker, DataChannel dataChannel) {
        if (roomSticker == null) {
            return;
        }
        int i = roomSticker.type;
        if (i != 5) {
            if (i == 6) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_picture_prop_show");
                c474500IjALIZ.LJJII(Integer.valueOf(roomSticker.LIZLLL ? 1 : 0), "is_remember");
                c474500IjALIZ.LJJII("event", "tab");
                c474500IjALIZ.LJJII(String.valueOf(roomSticker.id), "prop_id");
                c474500IjALIZ.LJJII("video_live", "live_type");
                c474500IjALIZ.LJJII(roomSticker.name, "prop_name");
                c474500IjALIZ.LJJII(roomSticker.LIZ, "resource_id");
                c474500IjALIZ.LJIJJLI(dataChannel);
                c474500IjALIZ.LIZ();
            }
        } else {
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_picture_prop_show");
            c474500IjALIZ2.LJJII(Integer.valueOf(roomSticker.LIZLLL ? 1 : 0), "is_remember");
            c474500IjALIZ2.LJJII("image", "tab");
            c474500IjALIZ2.LJJII(String.valueOf(roomSticker.id), "prop_id");
            c474500IjALIZ2.LJJII("video_live", "live_type");
            c474500IjALIZ2.LJJII(roomSticker.name, "prop_name");
            c474500IjALIZ2.LJJII(roomSticker.LIZ, "resource_id");
            c474500IjALIZ2.LJIJJLI(dataChannel);
            c474500IjALIZ2.LIZ();
        }
        int i2 = roomSticker.type;
        if (i2 == 5 || i2 == 6) {
            LIZLLL = null;
        }
    }

    public static void LJ(RoomSticker roomSticker, DataChannel dataChannel) {
        if (roomSticker == null || LIZ(roomSticker, dataChannel)) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_audience_prop_show");
        c474500IjALIZ.LJJII("live_video", "live_type");
        c474500IjALIZ.LJJII(LIZIZ(Integer.valueOf(roomSticker.type)), "tab");
        c474500IjALIZ.LJJII(Long.valueOf(roomSticker.id), "prop_id");
        c474500IjALIZ.LJJII(roomSticker.name, "prop_name");
        c474500IjALIZ.LJJIIZ("character", "prop_type", new AwS577S0100000_33(roomSticker, 4164));
        c474500IjALIZ.LJJIIZ("picture", "prop_type", new AwS577S0100000_33(roomSticker, 4165));
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LJIJI(), "request_id");
        c474500IjALIZ.LJJII(roomSticker.LIZ, "resource_id");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }

    public static void LJI(DataChannel dataChannel, RoomSticker roomSticker, Boolean bool) {
        int i = roomSticker.type;
        if (i != 4) {
            if (i != 5) {
                if (i == 6) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_picture_prop_effective_use");
                    c474500IjALIZ.LJJII(Integer.valueOf(roomSticker.LIZLLL ? 1 : 0), "is_remember");
                    c474500IjALIZ.LJJII(String.valueOf(roomSticker.id), "prop_id");
                    c474500IjALIZ.LJJII(roomSticker.name, "prop_name");
                    c474500IjALIZ.LJJII("event", "tab");
                    c474500IjALIZ.LJJII(roomSticker.LIZ, "resource_id");
                    c474500IjALIZ.LJIILJJIL("live_take_detail");
                    c474500IjALIZ.LJIIJJI("live_take");
                    c474500IjALIZ.LJIJJLI(dataChannel);
                    c474500IjALIZ.LIZ();
                    return;
                }
                return;
            }
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_picture_prop_effective_use");
            c474500IjALIZ2.LJJII(Integer.valueOf(roomSticker.LIZLLL ? 1 : 0), "is_remember");
            c474500IjALIZ2.LJJII(String.valueOf(roomSticker.id), "prop_id");
            c474500IjALIZ2.LJJII(roomSticker.name, "prop_name");
            c474500IjALIZ2.LJJII("image", "tab");
            c474500IjALIZ2.LJJII(roomSticker.LIZ, "resource_id");
            c474500IjALIZ2.LJIILJJIL("live_take_detail");
            c474500IjALIZ2.LJIIJJI("live_take");
            c474500IjALIZ2.LJIJJLI(dataChannel);
            c474500IjALIZ2.LIZ();
            return;
        }
        C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_live_character_prop_effective_use");
        c474500IjALIZ3.LJJII(Integer.valueOf(roomSticker.LIZLLL ? 1 : 0), "is_remember");
        c474500IjALIZ3.LJJII(String.valueOf(roomSticker.id), "prop_id");
        c474500IjALIZ3.LJJII(roomSticker.name, "prop_name");
        c474500IjALIZ3.LJJII("text", "tab");
        c474500IjALIZ3.LJIILJJIL("live_take_detail");
        c474500IjALIZ3.LJIIJJI("live_take");
        c474500IjALIZ3.LJJII(Integer.valueOf(!Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0), "is_origin_words");
        c474500IjALIZ3.LJJII(roomSticker.LIZ, "resource_id");
        c474500IjALIZ3.LJIJJLI(dataChannel);
        c474500IjALIZ3.LIZ();
    }

    public static void LJII(DataChannel dataChannel, RoomSticker roomSticker, Boolean bool) {
        if (roomSticker != null && roomSticker.type == 4 && C500260Jjc.LJIIZILJ(dataChannel)) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_host_character_prop_show");
            c474500IjALIZ.LJJII(Integer.valueOf(roomSticker.LIZLLL ? 1 : 0), "is_remember");
            c474500IjALIZ.LJJII(String.valueOf(roomSticker.id), "prop_id");
            c474500IjALIZ.LJJII(roomSticker.name, "prop_name");
            c474500IjALIZ.LJJII(Integer.valueOf(!Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0), "is_origin_words");
            c474500IjALIZ.LJIILJJIL("live_take_detail");
            c474500IjALIZ.LJJII(roomSticker.LIZ, "resource_id");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LIZ();
            LIZLLL = new C2177381AJk(roomSticker, bool);
        }
    }

    public static void LJIIIIZZ(DataChannel dataChannel, RoomSticker roomSticker, Boolean bool) {
        long jElapsedRealtime;
        if (roomSticker != null && roomSticker.type == 4) {
            if (LIZJ > 0) {
                jElapsedRealtime = SystemClock.elapsedRealtime() - LIZJ;
            } else {
                jElapsedRealtime = 0;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_host_character_prop_use_time");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LJIILJJIL("live_take_detail");
            c474500IjALIZ.LJJII(Integer.valueOf(roomSticker.LIZLLL ? 1 : 0), "is_remember");
            c474500IjALIZ.LJJIIZ("character", "prop_type", new AwS556S0100000_12(roomSticker, 983));
            c474500IjALIZ.LJJIIZ("picture", "prop_type", new AwS556S0100000_12(roomSticker, 984));
            c474500IjALIZ.LJJII(LIZIZ(Integer.valueOf(roomSticker.type)), "tab");
            c474500IjALIZ.LJJII(Long.valueOf(roomSticker.id), "prop_id");
            c474500IjALIZ.LJJII(roomSticker.name, "prop_name");
            c474500IjALIZ.LJJII("video_live", "live_type");
            c474500IjALIZ.LJJII(Long.valueOf(jElapsedRealtime), "use_time");
            c474500IjALIZ.LJJII(roomSticker.LIZ, "resource_id");
            c474500IjALIZ.LJJII(Integer.valueOf(Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0), "is_origin_words");
            c474500IjALIZ.LIZ();
        }
        LIZJ = 0L;
        LIZLLL = null;
    }

    public static void LJIIIZ(DataChannel dataChannel, RoomSticker roomSticker, Boolean bool) {
        if (roomSticker != null) {
            if (roomSticker.type == 5 || roomSticker.type == 6) {
                long jElapsedRealtime = 0;
                if (LIZ > 0) {
                    jElapsedRealtime = SystemClock.elapsedRealtime() - LIZ;
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_picture_prop_use_time");
                c474500IjALIZ.LJIJJLI(dataChannel);
                c474500IjALIZ.LJIILJJIL("live_take_detail");
                c474500IjALIZ.LJJII(Integer.valueOf(roomSticker.LIZLLL ? 1 : 0), "is_remember");
                c474500IjALIZ.LJJIIZ("character", "prop_type", new AwS556S0100000_12(roomSticker, 985));
                c474500IjALIZ.LJJIIZ("picture", "prop_type", new AwS556S0100000_12(roomSticker, 986));
                c474500IjALIZ.LJJII(LIZIZ(Integer.valueOf(roomSticker.type)), "tab");
                c474500IjALIZ.LJJII(Long.valueOf(roomSticker.id), "prop_id");
                c474500IjALIZ.LJJII(roomSticker.name, "prop_name");
                c474500IjALIZ.LJJII("video_live", "live_type");
                c474500IjALIZ.LJJII(Long.valueOf(jElapsedRealtime), "use_time");
                c474500IjALIZ.LJJII(roomSticker.LIZ, "resource_id");
                c474500IjALIZ.LJJII(Integer.valueOf(Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0), "is_origin_words");
                c474500IjALIZ.LIZ();
            }
        }
    }

    public static void LJIIJ(DataChannel dataChannel, RoomSticker roomSticker, String str) {
        Room room;
        long id;
        User owner;
        Long lValueOf = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_character_submit_false");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (room != null && (owner = room.getOwner()) != null) {
            lValueOf = Long.valueOf(owner.getId());
        }
        c474500IjALIZ.LJJII(String.valueOf(lValueOf), "anchor_id");
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(id), "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(roomSticker.id), "prop_id");
        c474500IjALIZ.LJJII(str, "resource_id");
        c474500IjALIZ.LJJII(roomSticker.name, "prop_name");
        c474500IjALIZ.LJJII(roomSticker.source, "entrance");
        c474500IjALIZ.LJIILJJIL("live_take_detail");
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(DataChannel dataChannel, RoomSticker roomSticker, Boolean bool, int i, long j) {
        String str;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "unknow";
                } else {
                    str = "reject";
                }
            } else {
                str = "done";
            }
        } else {
            str = "under_review";
        }
        if (roomSticker.type == 4) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_character_prop_show");
            c474500IjALIZ.LJJII(Integer.valueOf(roomSticker.LIZLLL ? 1 : 0), "is_remember");
            c474500IjALIZ.LJJII("text", "tab");
            c474500IjALIZ.LJJII(String.valueOf(roomSticker.id), "prop_id");
            c474500IjALIZ.LJJII("video_live", "live_type");
            c474500IjALIZ.LJJII(roomSticker.name, "prop_name");
            c474500IjALIZ.LJJII(Integer.valueOf(!Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0), "is_origin_words");
            c474500IjALIZ.LJJIIZ(str, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, new AwS66S0001000_33(i, 14));
            c474500IjALIZ.LJJIIZ(String.valueOf(j), "use_time", new AwS57S0000100_33(j, 0));
            c474500IjALIZ.LJJII(roomSticker.LIZ, "resource_id");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LIZ();
        }
        C1276840jKc c1276840jKc = C1276840jKc.LIZ;
        String str2 = roomSticker.LIZ;
        if (str2 == null) {
            str2 = "";
        }
        c1276840jKc.getClass();
        C1276840jKc.LJJIZ(str2);
    }

    public static void LJFF(DataChannel dataChannel, RoomSticker roomSticker, Boolean bool, int i, String str) {
        String str2;
        if (roomSticker != null && 1 <= i && i < 4) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str2 = "unknow";
                    } else {
                        str2 = "reject";
                    }
                } else {
                    str2 = "done";
                }
            } else {
                str2 = "under_review";
            }
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            long jElapsedRealtime = 0;
            if (LIZIZ > 0) {
                jElapsedRealtime = SystemClock.elapsedRealtime() - LIZIZ;
            }
            if (roomSticker.type == 4) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_character_prop_audit_result");
                c474500IjALIZ.LJJII(Integer.valueOf(roomSticker.LIZLLL ? 1 : 0), "is_remember");
                c474500IjALIZ.LJJII(String.valueOf(roomSticker.id), "prop_id");
                c474500IjALIZ.LJJII(roomSticker.name, "prop_name");
                c474500IjALIZ.LJJII(Integer.valueOf(!Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0), "is_origin_words");
                c474500IjALIZ.LJJIIZ(strLIZIZ, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, new AwS66S0001000_33(i, 15));
                c474500IjALIZ.LJJIIZ(String.valueOf(jElapsedRealtime), "use_time", new AwS57S0000100_33(jElapsedRealtime, 1));
                c474500IjALIZ.LJIILJJIL("live_take_detail");
                c474500IjALIZ.LJJII(roomSticker.LIZ, "resource_id");
                c474500IjALIZ.LJIJJLI(dataChannel);
                c474500IjALIZ.LIZ();
            }
        }
    }
}
