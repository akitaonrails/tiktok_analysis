package X;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1DSZ, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DSZ {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.1DSX] */
    public static C1DSX LIZ() {
        C1DSX c1dsx = C1DSY.LJJIIJ;
        if (c1dsx != null) {
            return c1dsx;
        }
        final C1DSY c1dsy = new C1DSY();
        ?? r1 = new Object() { // from class: X.1DSX
            public final void LIZIZ() {
                C1DSY c1dsy2 = c1dsy;
                if (c1dsy2.LIZ == 0) {
                    C1DSY.LJJIIJ = null;
                    return;
                }
                c1dsy2.LJJII = System.currentTimeMillis();
                c1dsy.getClass();
                boolean z = C1DSY.LJJIIJZLJL;
                C1DSY.LJJIIJZLJL = false;
                Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("launcher_render_env_result", String.valueOf(c1dsy.LJIIIIZZ)), new Pair("main_fragment_add_time", LIZ(c1dsy.LIZIZ)), new Pair("ve_task_start_time", LIZ(c1dsy.LJIIIZ)), new Pair("bind_component_start_time", LIZ(c1dsy.LJI)), new Pair("bind_component_done_time", LIZ(c1dsy.LJII)), new Pair("ve_task_end_time", LIZ(c1dsy.LJIIJ)), new Pair("main_fragment_create_time", LIZ(c1dsy.LIZJ)), new Pair("main_fragment_on_create_view_time", LIZ(c1dsy.LIZLLL)), new Pair("main_fragment_inflate_view_done_time", LIZ(c1dsy.LJ)), new Pair("ee_task_start_time", LIZ(c1dsy.LJIIJJI)), new Pair("change_surface_time", LIZ(c1dsy.LJFF)), new Pair("ee_task_end_time", LIZ(c1dsy.LJIIL)), new Pair("start_camera_time", LIZ(c1dsy.LJIILIIL)), new Pair("camera_first_frame_time", LIZ(c1dsy.LJIILJJIL)), new Pair("prepare_project_time", LIZ(c1dsy.LJIILL)), new Pair("create_project_time", LIZ(c1dsy.LJIILLIIL)), new Pair("main_package_ready_time", LIZ(c1dsy.LJIIZILJ)), new Pair("apply_effect_start_time", LIZ(c1dsy.LJIJ)), new Pair("real_apply_effect_time", LIZ(c1dsy.LJIJI)), new Pair("apply_effect_msg_ready_time", LIZ(c1dsy.LJIJJ)), new Pair("apply_effect_ready_time", LIZ(c1dsy.LJIJJLI)), new Pair("upgrade_main_package_time", LIZ(c1dsy.LJIL)), new Pair("upgrade_main_package_end_time", LIZ(c1dsy.LJJIFFI)), new Pair("launcher_render_env_time", LIZ(c1dsy.LJJII)), new Pair("check_feature_update_time", LIZ(0L)), new Pair("upgrade_fetch_effects_done_time", LIZ(c1dsy.LJJ)), new Pair("upgrade_download_effects_done_time", LIZ(c1dsy.LJJI)), new Pair("launcher_camera_cold", String.valueOf(z ? 1 : 0)), new Pair("ame_enter_from", c1dsy.LJJIII));
                C00YL c00ylLIZ = C1706400uVS.LIZ();
                if (c00ylLIZ != null) {
                    c00ylLIZ.LIZ("ame_launch_progress_timestamp", mapLJIIIIZZ);
                }
                ArrayList<Pair> arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : mapLJIIIIZZ.entrySet()) {
                    String key = entry.getKey();
                    Integer numLJIIJJI = C2095008Iq.LJIIJJI(entry.getValue());
                    if (numLJIIJJI != null) {
                        arrayList.add(new Pair(key, numLJIIJJI));
                    }
                }
                if (arrayList.size() > 1) {
                    C08XD.LJJ(arrayList, new C512401z8(3));
                }
                StringBuilder sb = new StringBuilder("ame_launch_progress_timestamp:\n");
                for (Pair pair : arrayList) {
                    String str = (String) pair.getFirst();
                    int iIntValue = ((Number) pair.getSecond()).intValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(": ");
                    sbLIZ.append(iIntValue);
                    sbLIZ.append('\n');
                    sb.append(C2188811AlT.LIZIZ(sbLIZ));
                }
                C1706630uVp.LJFF("AmeLaunchTimePerformance", sb.toString());
                C1DSY.LJJIIJ = null;
            }

            public final String LIZ(long j) {
                long j2 = j - c1dsy.LIZ;
                if (j2 < 0) {
                    j2 = 0;
                }
                return String.valueOf(j2);
            }
        };
        C1DSY.LJJIIJ = r1;
        return r1;
    }
}
