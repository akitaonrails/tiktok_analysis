package X;

import android.os.Looper;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS31S2000000_12;
import kotlin.jvm.internal.AwS413S0200000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0U17, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U17 {
    public static boolean LIZJ;
    public static final C0U17 LIZ = new C0U17();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public static long LIZLLL = -1;
    public static final IInteractService LJ = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
    public static final Map<String, String> LJFF = C2097608Jq.LJIIIIZZ(new Pair("window_setting", "not_existed"), new Pair("layout_setting", "normal_floating"), new Pair("guest_cnt", CardStruct.IStatusCode.DEFAULT));
    public static final C01GW LJI = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(386));

    public static String LJIJ(boolean z) {
        return z ? "anchor" : "guest";
    }

    public final void LIZLLL() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("link_page", "karaoke");
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_click_apply");
        c474500IjALIZ.LJIL();
        LIZ(this, c474500IjALIZ);
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
    }

    public static String LIZJ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "anchor";
            }
            if (num.intValue() == 3) {
                return "guest";
            }
            return "audience";
        }
        return "audience";
    }

    public static EnumC764770TzH LJIIZILJ(long j) {
        if (j != -997 && j != -996) {
            if (j != -998 && j != -994) {
                if (j == -999) {
                    return EnumC764770TzH.QUEUE;
                }
                return EnumC764770TzH.NORMAL;
            }
            return EnumC764770TzH.REQUESTS;
        }
        return EnumC764770TzH.SEARCH;
    }

    public static void LIZ(C0U17 c0u17, C474500IjA c474500IjA) {
        c0u17.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJ.RA0(linkedHashMap);
        c474500IjA.LJJIIZI(linkedHashMap);
    }

    public static String LIZIZ(long j, Integer num) {
        if (j == -998) {
            return EnumC764770TzH.CREATOR_SINGS.getValue();
        }
        if (j == -994) {
            return EnumC764770TzH.VIEWER_SINGS.getValue();
        }
        if (num != null) {
            if (num.intValue() == 1) {
                return "panel_to_listen";
            }
            if (num.intValue() == 2) {
                return "panel_to_sing";
            }
            return "none";
        }
        return "none";
    }

    public static void LJI(long j, DataChannel dataChannel) {
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_karaoke_panel_use_time");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LJJII(Long.valueOf(j / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "use_time");
            c474500IjALIZ.LIZ();
        }
    }

    public final void LJIILJJIL(Integer num, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_karaoke_setting_playlist_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "click_type");
        LIZ(this, c474500IjALIZ);
        c474500IjALIZ.LJJII(LIZJ(num), "user_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJII(DataChannel dataChannel, String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_karaoke_quit");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "button_type");
        c474500IjALIZ.LJJIIZ(str2, "force_close_reason", new AwS31S2000000_12(str2, str, 0));
        c474500IjALIZ.LIZ();
    }

    public final void LJIIIIZZ(C0U0Q c0u0q, long j, Long l, Integer num) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_karaoke_position_button_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(c0u0q.getValue(), "click_type");
        c474500IjALIZ.LJJII(Long.valueOf(j), "music_id");
        c474500IjALIZ.LJJII(LIZJ(num), "user_type");
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(num, 848);
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        if (l != null && l.longValue() == currentUserId) {
            str = "anchor";
        } else {
            str = "guest";
        }
        c474500IjALIZ.LJJIIZ(str, "singer_type", awS556S0100000_12);
        LIZ(this, c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }

    public final void LJIIJJI(C0U0Q c0u0q, long j, EnumC764770TzH enumC764770TzH, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_karaoke_play_relate_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(c0u0q.getValue(), "click_type");
        c474500IjALIZ.LJJII(Long.valueOf(j), "music_id");
        c474500IjALIZ.LJJII(enumC764770TzH.getValue(), "panel");
        c474500IjALIZ.LJJII(LJIJ(z), "user_type");
        LIZ(this, c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }

    public final void LJIILIIL(DataChannel dataChannel, String str, boolean z, boolean z2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_karaoke_setting_button_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_open");
        c474500IjALIZ.LJJII(str, "click_type");
        c474500IjALIZ.LJJII(LJIJ(z2), "user_type");
        LIZ(this, c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }

    public final void LJIILL(DataChannel dataChannel, String str, float f, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_karaoke_tune_volume_adjust");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJIFFI(Float.valueOf(f), "adjusted_value");
        c474500IjALIZ.LJJII(str, "click_type");
        c474500IjALIZ.LJJII(LJIJ(z), "user_type");
        LIZ(this, c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }

    public final void LJ(long j, EnumC764770TzH enumC764770TzH, long j2, Integer num, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_karaoke_add_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(j), "music_id");
        c474500IjALIZ.LJJII(enumC764770TzH.getValue(), "panel");
        c474500IjALIZ.LJJIIZ(Long.valueOf(j2), "collection_id", new AwS556S0100000_12(enumC764770TzH, 847));
        LIZ(this, c474500IjALIZ);
        c474500IjALIZ.LJJII(LIZJ(num), "user_type");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_favorite");
        c474500IjALIZ.LIZ();
    }

    public final void LJIIIZ(DataChannel dataChannel, EnumC764770TzH enumC764770TzH, Integer num, EnumC764770TzH enumC764770TzH2, int i) {
        String value;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_live_karaoke_queue_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(enumC764770TzH.getValue(), "queue");
        if (enumC764770TzH2 != null) {
            value = enumC764770TzH2.getValue();
        } else {
            value = null;
        }
        c474500IjALIZ.LJJII(value, "queue_second_list");
        LIZ(this, c474500IjALIZ);
        c474500IjALIZ.LJJII(LIZJ(num), "user_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "song_num");
        c474500IjALIZ.LIZ();
    }

    public final void LJIIJ(DataChannel dataChannel, EnumC764770TzH enumC764770TzH, boolean z, Integer num, EnumC764770TzH enumC764770TzH2) {
        String value;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_karaoke_queue_change");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel))) ? 1 : 0), "is_anchor");
        c474500IjALIZ.LJJIIZ(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_red_dot", new AwS413S0200000_12(enumC764770TzH, dataChannel, 53));
        c474500IjALIZ.LJJII(enumC764770TzH.getValue(), "queue");
        if (enumC764770TzH2 != null) {
            value = enumC764770TzH2.getValue();
        } else {
            value = null;
        }
        c474500IjALIZ.LJJII(value, "queue_second_list");
        LIZ(this, c474500IjALIZ);
        c474500IjALIZ.LJJII(LIZJ(num), "user_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJFF(C0U0I c0u0i, long j, EnumC764770TzH enumC764770TzH, long j2, Integer num, Integer num2) {
        C0U0K c0u0k;
        if (c0u0i == C0U0I.ADD_FAV) {
            c0u0k = C0U0K.ADD_FAV;
        } else if (c0u0i != C0U0I.REMOVE_FAV) {
            return;
        } else {
            c0u0k = C0U0K.REMOVE_FAV;
        }
        if (c0u0k != null) {
            C0U17 c0u17 = LIZ;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_karaoke_favorite_click");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(c0u0k.getValue(), "click_type");
            c474500IjALIZ.LJJII(Long.valueOf(j), "music_id");
            c474500IjALIZ.LJJII(enumC764770TzH.getValue(), "panel");
            LIZ(c0u17, c474500IjALIZ);
            c474500IjALIZ.LJJII(LIZIZ(j2, num), "panel_second_list");
            c474500IjALIZ.LJJII(LIZJ(num2), "user_type");
            c474500IjALIZ.LIZ();
        }
    }

    public final void LJIILLIIL(long j, boolean z, long j2, boolean z2, boolean z3, boolean z4) {
        String str;
        Long lValueOf;
        String str2;
        Long lValueOf2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_karaoke_play_duration");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(j), "music_id");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_vocal");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "use_time");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z2)) ? 1 : 0), "is_finish");
        c474500IjALIZ.LJJII(LJIJ(z3), "user_type");
        c474500IjALIZ.LJJII(C0IUA.LJIJI, "enter_from");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z4)) ? 1 : 0), "is_h5_entry");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(LIZJ)) ? 1 : 0), "is_remembered");
        LIZ(this, c474500IjALIZ);
        c474500IjALIZ.LIZ();
        if (z2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("finish: ");
            C0U22 c0u22 = C0U1G.LIZ;
            if (c0u22 != null) {
                str2 = c0u22.LIZJ;
            } else {
                str2 = null;
            }
            sbLIZ.append(str2);
            C20441214yg.LIZIZ("karaokeLog", C2188811AlT.LIZIZ(sbLIZ));
            C0U1G.LIZLLL(1L, System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), z3, z);
            Map<Long, String> map = C0U1G.LJI;
            C0U22 c0u222 = C0U1G.LIZ;
            if (c0u222 != null) {
                lValueOf2 = Long.valueOf(c0u222.LIZ);
            } else {
                lValueOf2 = null;
            }
            C19719512Dh.LIZJ(map).remove(lValueOf2);
            C0U1G.LIZ = null;
            C0U1G.LIZJ = null;
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("cutoff: ");
        C0U22 c0u223 = C0U1G.LIZ;
        if (c0u223 != null) {
            str = c0u223.LIZJ;
        } else {
            str = null;
        }
        sbLIZ2.append(str);
        C20441214yg.LIZIZ("karaokeLog", C2188811AlT.LIZIZ(sbLIZ2));
        C0U1G.LIZLLL(2L, System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), z3, z);
        Map<Long, String> map2 = C0U1G.LJI;
        C0U22 c0u224 = C0U1G.LIZ;
        if (c0u224 != null) {
            lValueOf = Long.valueOf(c0u224.LIZ);
        } else {
            lValueOf = null;
        }
        C19719512Dh.LIZJ(map2).remove(lValueOf);
        C0U1G.LIZ = null;
        C0U1G.LIZJ = null;
    }

    public final void LJIIL(long j, EnumC764770TzH enumC764770TzH, long j2, int i, Integer num, Integer num2, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_karaoke_audience_request_button_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(j), "music_id");
        c474500IjALIZ.LJJII(enumC764770TzH.getValue(), "panel");
        c474500IjALIZ.LJJIIZ(Long.valueOf(j2), "collection_id", new AwS556S0100000_12(enumC764770TzH, 849));
        c474500IjALIZ.LJJIIZ(Integer.valueOf(i), "request_times", new AwS556S0100000_12(enumC764770TzH, 850));
        LIZ(this, c474500IjALIZ);
        c474500IjALIZ.LJJII(LIZIZ(j2, num), "panel_second_list");
        c474500IjALIZ.LJJII(LIZJ(num2), "user_type");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_favorite");
        Pair[] pairArr = {new Pair("KalaPageAlert", "applyBtn")};
        C945340ahw c945340ahw = new C945340ahw(c474500IjALIZ);
        c945340ahw.LIZ((Pair[]) Arrays.copyOf(pairArr, 1));
        c945340ahw.LIZIZ();
    }
}
