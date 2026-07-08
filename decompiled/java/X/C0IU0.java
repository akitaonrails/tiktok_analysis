package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveRepetitionTtlSetting;
import com.bytedance.android.livesdk.model.LiveRepetitionTtlConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.Set;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IU0, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IU0 {
    public static int LIZJ;
    public static String LIZLLL;
    public static C0IU1 LJ;
    public static boolean LJFF;
    public static final HashMap<Long, Long> LIZ = new HashMap<>();
    public static final HashMap<Long, Long> LIZIZ = new HashMap<>();
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(215));

    public static final void LJFF() {
        int i;
        LiveRepetitionTtlSetting liveRepetitionTtlSetting = LiveRepetitionTtlSetting.INSTANCE;
        if (liveRepetitionTtlSetting.getValue().enableLivePetitionShow <= 0) {
            return;
        }
        String str = C0IUA.LJIIZILJ;
        String str2 = C0IUA.LJIILLIIL;
        if (liveRepetitionTtlSetting.getValue().enableLivePetitionShow <= 0 || (i = LIZJ) == 5 || i == 6) {
            return;
        }
        LIZJ = (Intrinsics.LJFF("homepage_hot", str2) && Intrinsics.LJFF("video_head", str)) ? 2 : (Intrinsics.LJFF("homepage_hot", str2) && Intrinsics.LJFF("live_cell", str)) ? 1 : (!Intrinsics.LJFF("live_merge", str2) || Intrinsics.LJFF("toplive_live_cover", str) || Intrinsics.LJFF("nearby_tab_toplive_live_cover", str) || Intrinsics.LJFF("watch_later", str)) ? (Intrinsics.LJFF("live_end", str2) && Intrinsics.LJFF("live_cover", str)) ? 4 : (Intrinsics.LJFF("homepage_bottom_live", str2) && Intrinsics.LJFF("live_cell", str)) ? 7 : 0 : 3;
    }

    public static final boolean LIZ(EnterRoomConfig enterRoomConfig) {
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        String str = roomsData.enterFromMerge;
        String str2 = roomsData.enterMethod;
        boolean z = enterRoomConfig.drawParams.openLiveFromDrawer;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        if (!((Set) LJI.getValue()).contains(C2188811AlT.LIZIZ(sbLIZ)) && !z) {
            return false;
        }
        return true;
    }

    public static final void LJ(Room room) {
        String str;
        String string;
        String string2;
        LiveRepetitionTtlSetting liveRepetitionTtlSetting = LiveRepetitionTtlSetting.INSTANCE;
        if (liveRepetitionTtlSetting.getValue().enableLivePetitionShow > 0 && room != null) {
            Long lValueOf = Long.valueOf(room.getOwnerUserId());
            Long lValueOf2 = Long.valueOf(room.getId());
            if (liveRepetitionTtlSetting.getValue().enableLivePetitionShow > 0) {
                int i = LIZJ;
                if (i != 5) {
                    if (i != 6) {
                        str = null;
                    } else {
                        str = "drawer_single";
                    }
                } else {
                    str = "drawer_double";
                }
                LIZLLL = str;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dup_live_delete");
                String str2 = "";
                if (lValueOf == null || (string = lValueOf.toString()) == null) {
                    string = "";
                }
                c474500IjALIZ.LJJII(string, "del_anchor_id");
                if (lValueOf2 != null && (string2 = lValueOf2.toString()) != null) {
                    str2 = string2;
                }
                c474500IjALIZ.LJJII(str2, "del_room_id");
                c474500IjALIZ.LJJII(LIZLLL, "drawer_mode");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LIZ();
            }
        }
    }

    public static final void LJI(int i) {
        if (LiveRepetitionTtlSetting.INSTANCE.getValue().enableLivePetitionShow <= 0) {
            return;
        }
        LIZJ = i;
    }

    public static final void LJII(C0IU1 c0iu1) {
        long j;
        LJFF = true;
        long j2 = c0iu1.LIZ;
        c0iu1.LIZJ = j2;
        C0IU1 c0iu12 = LJ;
        if (c0iu12 != null) {
            j = c0iu12.LIZJ;
        } else {
            j = -1;
        }
        if (j > j2) {
            c0iu1.LIZJ = j;
        }
        LJ = c0iu1;
    }

    public static final boolean LIZIZ(int i, Room room) {
        long jLongValue;
        Long l;
        long j;
        long jLongValue2;
        long id = room.getId();
        long jCurrentTimeMillis = System.currentTimeMillis();
        LiveRepetitionTtlSetting liveRepetitionTtlSetting = LiveRepetitionTtlSetting.INSTANCE;
        if (liveRepetitionTtlSetting.getValue().enableLivePetitionShow <= 0 || id <= 0) {
            return false;
        }
        Long lValueOf = Long.valueOf(id);
        if (i == 2) {
            HashMap<Long, Long> map = LIZIZ;
            if (lValueOf != null) {
                jLongValue2 = lValueOf.longValue();
            } else {
                jLongValue2 = 0;
            }
            l = map.get(Long.valueOf(jLongValue2));
        } else {
            HashMap<Long, Long> map2 = LIZ;
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            } else {
                jLongValue = 0;
            }
            l = map2.get(Long.valueOf(jLongValue));
        }
        if (l != null) {
            long jLongValue3 = l.longValue();
            if (jLongValue3 > 0) {
                switch (LIZJ) {
                    case 1:
                        long j2 = liveRepetitionTtlSetting.getValue().foruCardTtl;
                        LiveRepetitionTtlConfig value = liveRepetitionTtlSetting.getValue();
                        if (j2 > 0) {
                            j = value.foruCardTtl;
                        } else {
                            j = value.defaultTtl;
                        }
                        break;
                    case 2:
                        long j3 = liveRepetitionTtlSetting.getValue().foruHeadTtl;
                        LiveRepetitionTtlConfig value2 = liveRepetitionTtlSetting.getValue();
                        if (j3 > 0) {
                            j = value2.foruHeadTtl;
                        } else {
                            j = value2.defaultTtl;
                        }
                        break;
                    case 3:
                        long j4 = liveRepetitionTtlSetting.getValue().liveSquareTtl;
                        LiveRepetitionTtlConfig value3 = liveRepetitionTtlSetting.getValue();
                        if (j4 > 0) {
                            j = value3.liveSquareTtl;
                        } else {
                            j = value3.defaultTtl;
                        }
                        break;
                    case 4:
                        long j5 = liveRepetitionTtlSetting.getValue().closePage;
                        LiveRepetitionTtlConfig value4 = liveRepetitionTtlSetting.getValue();
                        if (j5 > 0) {
                            j = value4.closePage;
                        } else {
                            j = value4.defaultTtl;
                        }
                        break;
                    case 5:
                        long j6 = liveRepetitionTtlSetting.getValue().drawerTwoTtl;
                        LiveRepetitionTtlConfig value5 = liveRepetitionTtlSetting.getValue();
                        if (j6 > 0) {
                            j = value5.drawerTwoTtl;
                        } else {
                            j = value5.defaultTtl;
                        }
                        break;
                    case 6:
                        long j7 = liveRepetitionTtlSetting.getValue().drawerOneTtl;
                        LiveRepetitionTtlConfig value6 = liveRepetitionTtlSetting.getValue();
                        if (j7 > 0) {
                            j = value6.drawerOneTtl;
                        } else {
                            j = value6.defaultTtl;
                        }
                        break;
                    case 7:
                        long j8 = liveRepetitionTtlSetting.getValue().liveBottomTabTtl;
                        LiveRepetitionTtlConfig value7 = liveRepetitionTtlSetting.getValue();
                        if (j8 > 0) {
                            j = value7.liveBottomTabTtl;
                        } else {
                            j = value7.defaultTtl;
                        }
                        break;
                    default:
                        j = -1;
                        break;
                }
                long j9 = j * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                if (j9 > 0 && jCurrentTimeMillis - jLongValue3 <= j9) {
                    return true;
                }
                LIZLLL(i, id, jCurrentTimeMillis);
                return false;
            }
        }
        LIZLLL(i, id, jCurrentTimeMillis);
        return false;
    }

    public static final void LIZJ(int i, long j) {
        LIZLLL(i, j, System.currentTimeMillis());
    }

    public static final void LIZLLL(int i, long j, long j2) {
        if (LiveRepetitionTtlSetting.INSTANCE.getValue().enableLivePetitionShow > 0 && j > 0) {
            if (i == 2) {
                LIZIZ.put(Long.valueOf(j), Long.valueOf(j2));
            } else {
                LIZ.put(Long.valueOf(j), Long.valueOf(j2));
            }
        }
    }
}
