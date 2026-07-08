package X;

import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UTP, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UTP {
    public static final C0UTP LIZ = new C0UTP();

    public static long LIZ(long j, long j2, long j3) {
        return j2 > 0 ? j3 - j2 : j3 - j;
    }

    public static void LIZIZ(DataChannel dataChannel) {
        Object obj;
        C0UTQ c0utq = (C0UTQ) DataChannelGlobal.LLILZ.gg0(C931280aLG.class);
        if (c0utq != null && !c0utq.LIZLLL && !c0utq.LJJIJ) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_go_live_live_core_first_stream");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LJJII(c0utq.LIZIZ, "live_type");
            c474500IjALIZ.LJJII(String.valueOf(c0utq.LIZ()), "resume_scene");
            String str = "1";
            if (c0utq.LIZJ) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(obj, "is_try_mode");
            if (!c0utq.LJ) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str, "is_smooth_golive");
            c474500IjALIZ.LJJII(String.valueOf(c0utq.LIZ), "t_go_live_start");
            c474500IjALIZ.LJJII(Integer.valueOf(c0utq.LJJIIZI), "r_live_core_first_frame_error_code");
            if (c0utq.LJII.length() > 0) {
                c474500IjALIZ.LJJII(c0utq.LJII, "room_id");
            }
            if (c0utq.LJJIIZ == 0) {
                c0utq.LJJIIZ = System.currentTimeMillis();
            }
            long jLIZ = LIZ(c0utq.LIZ, c0utq.LJIIIIZZ, c0utq.LJJIIZ);
            if (c0utq.LJJIIZI == 0) {
                c474500IjALIZ.LJJII(Long.valueOf(jLIZ), "t_live_core_first_frame_success");
            } else {
                c474500IjALIZ.LJJII(Long.valueOf(jLIZ), "t_live_core_first_frame_fail");
            }
            c474500IjALIZ.LIZ();
            c0utq.LJJIJ = true;
        }
    }

    public static void LIZJ(DataChannel dataChannel, boolean z) {
        Object obj;
        C0UTQ c0utq = (C0UTQ) DataChannelGlobal.LLILZ.gg0(C931280aLG.class);
        if (c0utq == null) {
            return;
        }
        if (((c0utq.LJIJJ > 0 && c0utq.LJIJJLI > 0 && c0utq.LJIL > 0) || !z) && !c0utq.LIZLLL && !c0utq.LJJ) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_go_live_interaction_component");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LJJII(c0utq.LIZIZ, "live_type");
            c474500IjALIZ.LJJII(String.valueOf(c0utq.LIZ()), "resume_scene");
            String str = "1";
            if (c0utq.LIZJ) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(obj, "is_try_mode");
            if (!c0utq.LJ) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str, "is_smooth_golive");
            c474500IjALIZ.LJJII(String.valueOf(c0utq.LIZ), "t_go_live_start");
            c474500IjALIZ.LJJII(0, "r_interaction_layer_error_code");
            c474500IjALIZ.LJJII(0, "r_component_loading_error_code");
            if (c0utq.LJII.length() > 0) {
                c474500IjALIZ.LJJII(c0utq.LJII, "room_id");
            }
            long j = c0utq.LIZ;
            if (j > 0) {
                long j2 = c0utq.LJJI;
                if (j2 > 0) {
                    c474500IjALIZ.LJJII(Long.valueOf(Math.max(LIZ(j, c0utq.LJIIIIZZ, j2), 0L)), "t_root_fragment_on_create");
                }
            }
            long j3 = c0utq.LIZ;
            if (j3 > 0) {
                long j4 = c0utq.LJJIFFI;
                if (j4 > 0) {
                    c474500IjALIZ.LJJII(Long.valueOf(Math.max(LIZ(j3, c0utq.LJIIIIZZ, j4), 0L)), "t_root_fragment_on_resume");
                }
            }
            long j5 = c0utq.LIZ;
            if (j5 > 0) {
                long j6 = c0utq.LJJII;
                if (j6 > 0) {
                    c474500IjALIZ.LJJII(Long.valueOf(Math.max(LIZ(j5, c0utq.LJIIIIZZ, j6), 0L)), "t_live_broadcast_fragment_on_create");
                }
            }
            long j7 = c0utq.LIZ;
            if (j7 > 0) {
                long j8 = c0utq.LJJIII;
                if (j8 > 0) {
                    c474500IjALIZ.LJJII(Long.valueOf(Math.max(LIZ(j7, c0utq.LJIIIIZZ, j8), 0L)), "t_live_broadcast_fragment_on_resume");
                }
            }
            long j9 = c0utq.LIZ;
            if (j9 > 0) {
                long j10 = c0utq.LJJIIJ;
                if (j10 > 0) {
                    c474500IjALIZ.LJJII(Long.valueOf(Math.max(LIZ(j9, c0utq.LJIIIIZZ, j10), 0L)), "t_interaction_fragment_on_create");
                }
            }
            long j11 = c0utq.LIZ;
            if (j11 > 0) {
                long j12 = c0utq.LJJIIJZLJL;
                if (j12 > 0) {
                    c474500IjALIZ.LJJII(Long.valueOf(Math.max(LIZ(j11, c0utq.LJIIIIZZ, j12), 0L)), "t_interaction_fragment_on_resume");
                }
            }
            c474500IjALIZ.LJJII(Long.valueOf(LIZ(c0utq.LIZ, c0utq.LJIIIIZZ, c0utq.LJIJJ)), "t_interaction_layer_success");
            c474500IjALIZ.LJJII(Long.valueOf(LIZ(c0utq.LIZ, c0utq.LJIIIIZZ, c0utq.LJIJJLI)), "t_component_loading_success");
            c474500IjALIZ.LJJII(Long.valueOf(LIZ(c0utq.LIZ, c0utq.LJIIIIZZ, c0utq.LJIL)), "t_component_load_completed_success");
            c474500IjALIZ.LIZ();
            c0utq.LJJ = true;
        }
    }

    public final void LIZLLL(DataChannel dataChannel, int i) {
        C0UTQ c0utq = (C0UTQ) DataChannelGlobal.LLILZ.gg0(C931280aLG.class);
        if (c0utq != null && !c0utq.LIZLLL && !c0utq.LJIJI) {
            int i2 = 0;
            if (i == 31 && ((c0utq.LJIILJJIL <= 0 || c0utq.LJIILL != 0 || c0utq.LJIILLIIL <= 0 || c0utq.LJIIZILJ != 0) && c0utq.LJIILL == 0 && c0utq.LJIIZILJ == 0)) {
                return;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_go_live_push_stream");
            if (dataChannel != null) {
                c474500IjALIZ.LJIJJLI(dataChannel);
            } else {
                c474500IjALIZ.LJIL();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : C1697810uHb.LJIIJJI(new C772360URm(this), new C0UTR(this), new C0UTS(this), new C772380URo(this), new C0UTT(this))) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    Function1 function1 = (Function1) obj;
                    if (((1 << i2) & i) != 0) {
                        linkedHashMap.putAll((Map) function1.invoke(c0utq));
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (LiveMode.SCREEN_RECORD.logStreamingType.equals(c0utq.LIZIZ)) {
                linkedHashMap.put("is_dual_device", String.valueOf(((IGameService) C1161920gLG.LIZJ(IGameService.class)).dU()));
            }
            if (LiveMode.VIDEO.logStreamingType.equals(c0utq.LIZIZ)) {
                linkedHashMap.put("t_black_screen_before_first_frame", String.valueOf(c0utq.LJJIJIIJI));
            }
            linkedHashMap.put("interceptor_cost_time", c0utq.LJJIJIIJIL.toString());
            linkedHashMap.put("live_core_error_msg", c0utq.LJJIJIL);
            c474500IjALIZ.LJJIIZI(linkedHashMap);
            c474500IjALIZ.LJJIIZI(C771990UQb.LIZ);
            c474500IjALIZ.LIZ();
            if (i > 1) {
                c0utq.LJIJI = true;
            }
        }
    }
}
