package X;

import com.bytedance.android.livesdk.livesetting.linkmic.EnableChannelBasedTrackSupportGroupChannelIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.FirstFrameFilterSeiSwitch;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFirstFrameSuccessRateOpt;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0IWX, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IWX implements InterfaceC951900asW {
    public Function0<String> LIZIZ;
    public volatile long LIZJ;
    public volatile int LIZLLL;
    public volatile boolean LJ;
    public volatile boolean LJFF;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public long LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public long LJIJJ;
    public long LJIJJLI;
    public long LJIL;
    public long LJJ;
    public long LJJI;
    public long LJJIFFI;
    public long LJJII;
    public long LJJIII;
    public long LJJIIJ;
    public long LJJIIJZLJL;
    public long LJJIIZ;
    public long LJJIIZI;
    public long LJJIJ;
    public long LJJIJIIJI;
    public long LJJIJIIJIL;
    public long LJJIJIL;
    public long LJJIJL;
    public long LJJIJLIJ;
    public boolean LJJIL;
    public boolean LJJIZ;
    public boolean LJJJ;
    public boolean LJJJI;
    public final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();
    public String LJI = "";

    @Override // X.InterfaceC951900asW
    public final void LIZ() {
        this.LJJJI = true;
    }

    @Override // X.InterfaceC951900asW
    public final void LJIILL() {
        this.LJJJ = true;
    }

    @Override // X.InterfaceC951900asW
    public final void LJIJ() {
        this.LJJIZ = true;
    }

    @Override // X.InterfaceC951900asW
    public final void LJJIJIIJIL() {
        this.LJJIL = true;
    }

    @Override // X.InterfaceC951900asW
    public final void LIZIZ() {
        this.LJJIJLIJ = LJJIJLIJ(this.LJJIJLIJ);
    }

    @Override // X.InterfaceC951900asW
    public final void LIZJ() {
        this.LJIJI = LJJIJLIJ(this.LJIJI);
    }

    @Override // X.InterfaceC951900asW
    public final void LIZLLL() {
        this.LJIIJ = LJJIJLIJ(this.LJIIJ);
    }

    @Override // X.InterfaceC951900asW
    public final void LJ() {
        this.LJIILJJIL = LJJIJLIJ(this.LJIILJJIL);
    }

    @Override // X.InterfaceC951900asW
    public final void LJFF() {
        this.LJJIIJ = LJJIJLIJ(this.LJJIIJ);
    }

    @Override // X.InterfaceC951900asW
    public final void LJI() {
        this.LJJIIZ = LJJIJLIJ(this.LJJIIZ);
    }

    @Override // X.InterfaceC951900asW
    public final void LJII() {
        this.LJJI = LJJIJLIJ(this.LJJI);
    }

    @Override // X.InterfaceC951900asW
    public final void LJIIIIZZ() {
        this.LJIL = LJJIJLIJ(this.LJIL);
    }

    @Override // X.InterfaceC951900asW
    public final void LJIIIZ() {
        this.LJIJJ = LJJIJLIJ(this.LJIJJ);
    }

    @Override // X.InterfaceC951900asW
    public final void LJIIJ() {
        this.LJJIIJZLJL = LJJIJLIJ(this.LJJIIJZLJL);
    }

    @Override // X.InterfaceC951900asW
    public final void LJIIJJI() {
        if (this.LJIILJJIL <= 0) {
            return;
        }
        this.LJIILL = LJJIJLIJ(this.LJIILL);
    }

    @Override // X.InterfaceC951900asW
    public final void LJIILIIL() {
        if (this.LJIILJJIL <= 0) {
            return;
        }
        this.LJIILLIIL = LJJIJLIJ(this.LJIILLIIL);
    }

    @Override // X.InterfaceC951900asW
    public final void LJIILJJIL() {
        this.LJIIJJI = LJJIJLIJ(this.LJIIJJI);
    }

    @Override // X.InterfaceC951900asW
    public final void LJIILLIIL() {
        this.LJJIFFI = LJJIJLIJ(this.LJJIFFI);
    }

    @Override // X.InterfaceC951900asW
    public final void LJIIZILJ() {
        this.LJIIIIZZ = LJJIJLIJ(this.LJIIIIZZ);
        if (this.LJII == 0) {
            C0IWY.LIZ = false;
        }
    }

    @Override // X.InterfaceC951900asW
    public final void LJIJI() {
        this.LJJIJ = LJJIJLIJ(this.LJJIJ);
    }

    @Override // X.InterfaceC951900asW
    public final void LJIJJ() {
        this.LJIJJLI = LJJIJLIJ(this.LJIJJLI);
    }

    @Override // X.InterfaceC951900asW
    public final void LJIJJLI() {
        this.LJJIII = LJJIJLIJ(this.LJJIII);
    }

    @Override // X.InterfaceC951900asW
    public final void LJIL() {
        if (this.LJIILJJIL <= 0) {
            return;
        }
        this.LJIIZILJ = LJJIJLIJ(this.LJIIZILJ);
    }

    @Override // X.InterfaceC951900asW
    public final void LJJ() {
        this.LJIIIZ = LJJIJLIJ(this.LJIIIZ);
    }

    @Override // X.InterfaceC951900asW
    public final void LJJI() {
        this.LJJ = LJJIJLIJ(this.LJJ);
    }

    @Override // X.InterfaceC951900asW
    public final void LJJIFFI() {
        this.LJJIJIIJI = LJJIJLIJ(this.LJJIJIIJI);
    }

    @Override // X.InterfaceC951900asW
    public final void LJJII() {
        this.LJJII = LJJIJLIJ(this.LJJII);
    }

    @Override // X.InterfaceC951900asW
    public final void LJJIIJ() {
        this.LJIIL = LJJIJLIJ(this.LJIIL);
    }

    @Override // X.InterfaceC951900asW
    public final void LJJIIJZLJL() {
        this.LJIILIIL = LJJIJLIJ(this.LJIILIIL);
    }

    @Override // X.InterfaceC951900asW
    public final void LJJIIZ() {
        this.LJJIIZI = LJJIJLIJ(this.LJJIIZI);
    }

    @Override // X.InterfaceC951900asW
    public final void LJJIIZI() {
        this.LJJIJIL = LJJIJLIJ(this.LJJIJIL);
    }

    @Override // X.InterfaceC951900asW
    public final void LJJIJ() {
        this.LJJIJL = LJJIJLIJ(this.LJJIJL);
    }

    public final void LJJJIL() {
        if (this.LIZJ <= 0 || !(!this.LJFF)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pullStreamSuccessLog, ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", ");
        sbLIZ.append(C786410Ut5.u3().getName());
        C20441214yg.LJIIIZ("LiveInteractMonitor", C2188811AlT.LIZIZ(sbLIZ));
        LJJJJJL();
    }

    public final void LJJJJIZL() {
        this.LIZJ = 0L;
        this.LIZLLL = 0;
        this.LJ = false;
        this.LJI = "";
        this.LJII = 0L;
        this.LJIIIIZZ = 0L;
        this.LJIIIZ = 0L;
        this.LJIJI = 0L;
        this.LJIJJ = 0L;
        this.LJIL = 0L;
        this.LJJ = 0L;
        this.LJIIJ = 0L;
        this.LJIIJJI = 0L;
        this.LJIIL = 0L;
        this.LJIILIIL = 0L;
        this.LJIILJJIL = 0L;
        this.LJIILL = 0L;
        this.LJIILLIIL = 0L;
        this.LJIIZILJ = 0L;
        this.LJIJ = 0L;
        this.LJIJJLI = 0L;
        this.LJJI = 0L;
        this.LIZ.clear();
    }

    public final void LJJJJJL() {
        if (!this.LJFF) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryCommit, ");
            sbLIZ.append(hashCode());
            C20441214yg.LJIIIZ("LiveInteractMonitor", C2188811AlT.LIZIZ(sbLIZ));
            if (this.LIZ.keySet().contains("duration_start_to_success")) {
                this.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "success");
                if (this.LIZ.keySet().contains("duration_layout_first_frame")) {
                    this.LJFF = true;
                    LJJJJJ(this.LIZ);
                    return;
                }
                return;
            }
            if (!this.LIZ.keySet().contains("duration_start_to_failure")) {
                LJJJJI(Boolean.TRUE);
                return;
            }
            this.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "failure");
            this.LIZ.put("duration_layout_first_frame", "-1");
            this.LJFF = true;
            LJJJJJ(this.LIZ);
        }
    }

    @Override // X.InterfaceC951900asW
    public final void LJIIL(long j) {
        if (!(!this.LJFF)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("allWindowRender, ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", timeMs:");
        sbLIZ.append(j);
        C20441214yg.LJIIIZ("LiveInteractMonitor", C2188811AlT.LIZIZ(sbLIZ));
        this.LJIJ = j;
        this.LIZ.put("duration_layout_first_frame", String.valueOf(j - this.LIZJ));
        if (C500260Jjc.LJJIIZ(this.LIZ.get("duration_start_to_player_render"))) {
            try {
                String str = this.LIZ.get("duration_start_to_player_render");
                if (str != null) {
                    if (CastLongProtector.parseLong(str) > 0) {
                        this.LJFF = true;
                        LJJJJJ(this.LIZ);
                    }
                }
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("allWindowRender, parse error:");
                sbLIZ2.append(e);
                C20441214yg.LJ("LiveInteractMonitor", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    @Override // X.InterfaceC951900asW
    public final void LJJIII(int i) {
        long jLJJIJLIJ;
        if (i == 0) {
            jLJJIJLIJ = LJJIJLIJ(this.LJJIJIIJIL);
        } else {
            jLJJIJLIJ = i;
        }
        this.LJJIJIIJIL = jLJJIJLIJ;
    }

    @Override // X.InterfaceC951900asW
    public final void LJJIJIIJI(Function0<String> function0) {
        this.LIZIZ = function0;
    }

    public final long LJJIJLIJ(long j) {
        if ((!this.LJFF) && j <= 0) {
            return System.currentTimeMillis();
        }
        return j;
    }

    public final void LJJJJI(Boolean bool) {
        if (!(!this.LJFF)) {
            return;
        }
        C20441214yg.LIZIZ("LiveInteractMonitor", "reportStatusCancel");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZ.put("event_end_ts", String.valueOf(jCurrentTimeMillis));
        this.LIZ.put("duration_start_to_end", String.valueOf(jCurrentTimeMillis - this.LIZJ));
        this.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "cancel");
        if (this.LIZ.keySet().contains("duration_start_to_player_render")) {
            this.LIZ.put("duration_layout_first_frame", "-2");
        } else {
            this.LIZ.put("duration_layout_first_frame", "-1");
        }
        this.LJFF = true;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            LJJJJJ(this.LIZ);
        } else {
            LJJJJIZL();
        }
    }

    public final void LJJJJJ(ConcurrentHashMap concurrentHashMap) {
        JSONObject jSONObjectLJI;
        String strOptString;
        String str;
        String strOptString2;
        if (Intrinsics.LJFF(this.LJI, "5")) {
            LJJIJIL(concurrentHashMap, "duration_get_sei_to_interaction_create", this.LJIIIIZZ, this.LJII);
            LJJIJIL(concurrentHashMap, "duration_interaction_create_to_lcw_create", this.LJIIIZ, this.LJIIIIZZ);
            LJJIJIL(concurrentHashMap, "duration_lcw_create_to_mgw_create", this.LJIJI, this.LJIIIZ);
            LJJIJIL(concurrentHashMap, "duration_mgw_create_to_view_start", this.LJIJJLI, this.LJIJI);
            LJJIJIL(concurrentHashMap, "duration_get_sei_to_analyze_sei_start", this.LJIIJ, this.LJIJJ);
            LJJIJIL(concurrentHashMap, "duration_analyze_sei", this.LJIIJJI, this.LJIIJ);
            LJJIJIL(concurrentHashMap, "duration_analyze_sei_end_to_get_dsl_start", this.LJIIL, this.LJIIJJI);
            LJJIJIL(concurrentHashMap, "duration_get_dsl", this.LJIILIIL, this.LJIIL);
            LJJIJIL(concurrentHashMap, "duration_get_dsl_end_to_measure_end", this.LJIILJJIL, this.LJIILIIL);
            LJJIJIL(concurrentHashMap, "duration_layout_draw", this.LJIILLIIL, this.LJIILJJIL);
            LJJIJIL(concurrentHashMap, "duration_layout_draw_end_to_first_mask_drawed", this.LJIIZILJ, this.LJIILL);
            LJJIJIL(concurrentHashMap, "duration_draw_start_to_all_mask_end", this.LJIJ, this.LJIILJJIL);
            LJJIJIL(concurrentHashMap, "duration_set_up_rust_layout", this.LJJIIJ, this.LJJIII);
            LJJIJIL(concurrentHashMap, "duration_inner_set_up_rust_layout", this.LJJIIZ, this.LJJIIJZLJL);
            LJJIJIL(concurrentHashMap, "duration_create_rust_layout", this.LJJIJ, this.LJJIIZI);
            LJJIJIL(concurrentHashMap, "duration_set_up_to_inner", this.LJJIIJZLJL, this.LJJIII);
            LJJIJIL(concurrentHashMap, "duration_inner_to_create", this.LJJIIZI, this.LJJIIJZLJL);
            LJJIJIL(concurrentHashMap, "duration_set_up_to_create_end", this.LJJIJ, this.LJJIII);
            LJJIJIL(concurrentHashMap, "duration_create_to_handle_sei_start", this.LJJIJIIJI, this.LJJIJ);
            long j = this.LJJIJIIJIL;
            long j2 = this.LJJIJIIJI;
            if (j < 0) {
                concurrentHashMap.put("duration_handle_sei", String.valueOf(j));
            } else if (j > 0 && j2 > 0) {
                concurrentHashMap.put("duration_handle_sei", String.valueOf(j - j2));
            }
            LJJIJIL(concurrentHashMap, "duration_create_to_layout_begin", this.LJJIJIL, this.LJJIII);
            LJJIJIL(concurrentHashMap, "duration_create_to_layout_start", this.LJJIJL, this.LJJIII);
            LJJIJIL(concurrentHashMap, "duration_create_to_layout_end", this.LJJIJLIJ, this.LJJIII);
            LJJIJIL(concurrentHashMap, "duration_multi_guest_render_attach", this.LJJII, this.LJJIFFI);
            LJJIJL(concurrentHashMap, "stage_set_up_before_linker_create", this.LJJIL ? 1 : 0);
            LJJIJL(concurrentHashMap, "stage_set_up_on_destroy", this.LJJIZ ? 1 : 0);
            LJJIJL(concurrentHashMap, "stage_set_up_on_error", this.LJJJ ? 1 : 0);
            LJJIJL(concurrentHashMap, "stage_multi_guest_render_attach_error", this.LJJJI ? 1 : 0);
        } else if (Intrinsics.LJFF(this.LJI, "2")) {
            LJJIJIL(concurrentHashMap, "duration_get_sei_to_interaction_create", this.LJIIIIZZ, this.LJII);
            LJJIJIL(concurrentHashMap, "duration_interaction_create_to_lcw_create", this.LJIIIZ, this.LJIIIIZZ);
            LJJIJIL(concurrentHashMap, "duration_lcw_create_to_mcw_create", this.LJIL, this.LJIIIZ);
            LJJIJIL(concurrentHashMap, "duration_mcw_create_to_view_start", this.LJJI, this.LJIL);
            LJJIJIL(concurrentHashMap, "duration_get_sei_to_analyze_sei_start", this.LJIIJ, this.LJJ);
            LJJIJIL(concurrentHashMap, "duration_analyze_sei", this.LJIIJJI, this.LJIIJ);
            LJJIJIL(concurrentHashMap, "duration_analyze_sei_end_to_get_dsl_start", this.LJIIL, this.LJIIJJI);
            LJJIJIL(concurrentHashMap, "duration_get_dsl", this.LJIILIIL, this.LJIIL);
            LJJIJIL(concurrentHashMap, "duration_get_dsl_end_to_measure_end", this.LJIILJJIL, this.LJIILIIL);
            LJJIJIL(concurrentHashMap, "duration_layout_draw", this.LJIILLIIL, this.LJIILJJIL);
            LJJIJIL(concurrentHashMap, "duration_layout_draw_end_to_first_mask_drawed", this.LJIIZILJ, this.LJIILL);
            LJJIJIL(concurrentHashMap, "duration_draw_start_to_all_mask_end", this.LJIJ, this.LJIILJJIL);
        }
        w.LIZ.getClass();
        concurrentHashMap.put("enter_method", w.LJIIL());
        concurrentHashMap.put("enter_from_merge", w.LJIIIZ());
        concurrentHashMap.put("action_type", w.LIZLLL());
        InterfaceC469080IaQ interfaceC469080IaQ = (InterfaceC469080IaQ) DataChannelGlobal.LLILZ.gg0(C1148390fzR.class);
        if (interfaceC469080IaQ != null) {
            jSONObjectLJI = interfaceC469080IaQ.LJI();
        } else {
            jSONObjectLJI = null;
        }
        String str2 = "";
        if (jSONObjectLJI == null || (strOptString = jSONObjectLJI.optString("cdn_ip:")) == null) {
            strOptString = "";
        }
        concurrentHashMap.put("cdn_ip", strOptString);
        if (jSONObjectLJI != null && (strOptString2 = jSONObjectLJI.optString("resolution:")) != null) {
            str2 = strOptString2;
        }
        concurrentHashMap.put("resolution_type", str2);
        if (C931790aM5.LIZIZ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        concurrentHashMap.put("layout_version", str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_first_frame_success_rate");
        c474500IjALIZ.LJJIIZI(concurrentHashMap);
        if (Intrinsics.LJFF("livesdk_first_frame_success_rate", "livesdk_first_frame_success_rate") && BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJL();
        } else {
            c474500IjALIZ.LIZ();
        }
        LJJJJIZL();
    }

    public final void LJJIZ(Boolean bool, String str) {
        if (this.LIZJ > 0 && (!this.LJFF)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pullStreamEndLog, source:");
            sbLIZ.append(str);
            sbLIZ.append(", ");
            sbLIZ.append(hashCode());
            sbLIZ.append(", ");
            sbLIZ.append(C786410Ut5.u3().getName());
            C20441214yg.LJIIIZ("LiveInteractMonitor", C2188811AlT.LIZIZ(sbLIZ));
            this.LIZ.put("event_end_source", str);
            if (!C504670Jqj.LIZ(str, "release_for_next") && !C504670Jqj.LIZ(str, "destroy")) {
                if (C504670Jqj.LIZ(str, "sei_normal")) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.LIZ.put("event_success_ts", String.valueOf(jCurrentTimeMillis));
                    this.LIZ.put("duration_start_to_success", String.valueOf(jCurrentTimeMillis - this.LIZJ));
                    this.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "success");
                    if (FirstFrameFilterSeiSwitch.INSTANCE.getValue() && (Intrinsics.LJFF(this.LIZ.get(Scene.SCENE_SERVICE), "multi_host") || Intrinsics.LJFF(this.LIZ.get(Scene.SCENE_SERVICE), "multi_guest"))) {
                        this.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "false");
                        this.LIZ.put("duration_layout_first_frame", "-3");
                    }
                    this.LJFF = true;
                    LJJJJJ(this.LIZ);
                    return;
                }
                LJJJJJL();
                return;
            }
            LJJJJI(bool);
        }
    }

    public static void LJJIJL(ConcurrentHashMap concurrentHashMap, String str, int i) {
        if (str.length() > 0) {
            concurrentHashMap.put(str, String.valueOf(i));
        }
    }

    public final void LJJIL(long j, long j2, long j3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pullStreamDisplayLog, ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", ");
        sbLIZ.append(C786410Ut5.u3().getName());
        C20441214yg.LJIIIZ("LiveInteractMonitor", C2188811AlT.LIZIZ(sbLIZ));
        if (!(!this.LJFF)) {
            return;
        }
        if (j3 == -1) {
            j3 = System.currentTimeMillis();
        }
        if (LinkMicFirstFrameSuccessRateOpt.getValue()) {
            long j4 = 0;
            if (j <= 0) {
                j = this.LIZJ;
            }
            if (j2 <= 0) {
                j2 = j3;
            }
            String str = this.LIZ.get("event_player_render_ts");
            if (str == null || str.length() == 0) {
                this.LIZ.put("event_player_render_ts", String.valueOf(j2));
            }
            String str2 = this.LIZ.get("duration_start_to_player_render");
            if (str2 == null || str2.length() == 0) {
                long j5 = j2 - j;
                if (j5 > 0) {
                    j4 = j5;
                }
                this.LIZ.put("duration_start_to_player_render", String.valueOf(j4));
            }
        } else {
            this.LIZ.put("event_player_render_ts", String.valueOf(j3));
            this.LIZ.put("duration_start_to_player_render", String.valueOf(j3 - this.LIZJ));
        }
        if (this.LIZ.keySet().contains("duration_start_to_success")) {
            LJJJIL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0079 A[PHI: r6
      0x0079: PHI (r6v2 int) = (r6v1 int), (r6v6 int), (r6v6 int) binds: [B:51:0x0076, B:25:0x0040, B:27:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007c A[PHI: r6 r10
      0x007c: PHI (r6v3 int) = (r6v2 int), (r6v5 int) binds: [B:53:0x0079, B:30:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x007c: PHI (r10v2 java.lang.String) = (r10v0 java.lang.String), (r10v4 java.lang.String) binds: [B:53:0x0079, B:30:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJ(X.C945320ahu r13, org.json.JSONObject r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IWX.LJJJ(X.0ahu, org.json.JSONObject, java.lang.String):void");
    }

    public final void LJJJI(long j, long j2, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pullStreamStartLog, ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", ");
        sbLIZ.append(j);
        sbLIZ.append(", ");
        sbLIZ.append(C786410Ut5.u3().getName());
        C20441214yg.LJIIIZ("LiveInteractMonitor", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZJ > 0 && !z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("already init, ");
            sbLIZ2.append(hashCode());
            sbLIZ2.append(", ");
            sbLIZ2.append(j);
            sbLIZ2.append(", ");
            sbLIZ2.append(C786410Ut5.u3().getName());
            C20441214yg.LJIIIZ("LiveInteractMonitor", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        this.LIZJ = j2;
        this.LJFF = false;
        this.LIZ.put("room_id", String.valueOf(j));
        this.LIZ.put("event_start_ts", String.valueOf(this.LIZJ));
    }

    public static void LJJIJIL(ConcurrentHashMap concurrentHashMap, String str, long j, long j2) {
        if (str.length() > 0 && j > 0 && j2 > 0) {
            concurrentHashMap.put(str, String.valueOf(j - j2));
        }
    }

    public final void LJJJJ(int i, long j, int i2, String str, String str2) {
        String strInvoke;
        if (this.LJIIIIZZ == 0) {
            C0IWY.LIZ = true;
        }
        this.LJI = String.valueOf(i);
        if (i == 2) {
            if (str.length() > 0) {
                this.LIZ.put(Scene.SCENE_SERVICE, "multi_host");
                this.LIZ.put("arch_type", str2);
                this.LIZ.put("channel_id", str);
                if (EnableChannelBasedTrackSupportGroupChannelIdSetting.INSTANCE.isEnable()) {
                    ConcurrentHashMap<String, String> concurrentHashMap = this.LIZ;
                    Function0<String> function0 = this.LIZIZ;
                    if (function0 == null || (strInvoke = function0.invoke()) == null) {
                        strInvoke = "";
                    }
                    concurrentHashMap.put("channel_id", strInvoke);
                }
                if (j > 0) {
                    this.LIZ.put("connection_type", "manual_pk");
                } else {
                    this.LIZ.put("connection_type", "");
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (!this.LIZ.keySet().contains("duration_start_to_success")) {
                    this.LIZ.put("event_success_ts", String.valueOf(jCurrentTimeMillis));
                    this.LIZ.put("duration_start_to_success", String.valueOf(jCurrentTimeMillis - this.LIZJ));
                    this.LJII = jCurrentTimeMillis;
                }
                if (this.LIZ.keySet().contains("duration_start_to_player_render")) {
                    LJJJIL();
                    return;
                }
                return;
            }
        } else if (i == 5 && i2 > 1 && str.length() > 0) {
            this.LIZ.put(Scene.SCENE_SERVICE, "multi_guest");
            this.LIZ.put("channel_id", str);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (!this.LIZ.keySet().contains("duration_start_to_success")) {
                this.LIZ.put("event_success_ts", String.valueOf(jCurrentTimeMillis2));
                this.LIZ.put("duration_start_to_success", String.valueOf(jCurrentTimeMillis2 - this.LIZJ));
                this.LJII = jCurrentTimeMillis2;
            }
            if (!this.LIZ.keySet().contains("duration_start_to_player_render")) {
                return;
            }
            LJJJIL();
            return;
        }
        LJJIZ(Boolean.TRUE, "sei_other");
    }
}
