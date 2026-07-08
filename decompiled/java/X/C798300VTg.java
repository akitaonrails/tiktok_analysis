package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VTg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798300VTg {
    public static final C798300VTg LIZ = new C798300VTg();
    public static final List<C798320VTi> LIZIZ = new ArrayList();

    public static void LIZ() {
        ArrayList<C798320VTi> arrayList = (ArrayList) LIZIZ;
        if (arrayList.size() == 0) {
            return;
        }
        for (C798320VTi c798320VTi : arrayList) {
            LIZ.getClass();
            C736480Suk c736480Suk = new C736480Suk();
            c736480Suk.LIZ(Scene.SCENE_SERVICE, c798320VTi.LIZ);
            String str = "1";
            c736480Suk.LIZ("is_background", Intrinsics.LJFF("background", c798320VTi.LIZ) ? "1" : CardStruct.IStatusCode.DEFAULT);
            c736480Suk.LIZ("activity", c798320VTi.LIZIZ);
            c736480Suk.LIZ("fragment", c798320VTi.LJJJJ);
            c736480Suk.LIZ("in_core_scene", String.valueOf(c798320VTi.LJJJI));
            c736480Suk.LIZ("in_5vv_scene", String.valueOf(c798320VTi.LJJJIL));
            c736480Suk.LIZ("report_index", String.valueOf(c798320VTi.LIZLLL));
            if (!c798320VTi.LJ) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c736480Suk.LIZ("is_low_power_mode", str);
            c736480Suk.LIZ("current", String.valueOf(c798320VTi.LIZJ));
            c736480Suk.LIZ("battery_state", String.valueOf(c798320VTi.LJFF));
            c736480Suk.LIZ("start_battery_level", String.valueOf(c798320VTi.LJI));
            c736480Suk.LIZ("end_battery_level", String.valueOf(c798320VTi.LJII));
            c736480Suk.LIZ("battery_temperature", String.valueOf(c798320VTi.LJIIIIZZ));
            c736480Suk.LIZ("thermal_state", String.valueOf(c798320VTi.LJIIIZ));
            c736480Suk.LIZ("extra_thermal_status", String.valueOf(-1));
            c736480Suk.LIZ("system_cpu_usage", String.valueOf(c798320VTi.LJIIJ));
            c736480Suk.LIZ("main_t_cpu_usage", String.valueOf(c798320VTi.LJIIJJI));
            c736480Suk.LIZ("render_t_cpu_usage", String.valueOf(c798320VTi.LJIIL));
            c736480Suk.LIZ("cpu_usage", String.valueOf(c798320VTi.LJIILIIL));
            c736480Suk.LIZ("cpu_speed", String.valueOf(c798320VTi.LJIILJJIL));
            c736480Suk.LIZ("gpu_usage", String.valueOf(c798320VTi.LJIILLIIL));
            c736480Suk.LIZ("cpu_core_num", String.valueOf(c798320VTi.LJIILL));
            c736480Suk.LIZ("thread_count", String.valueOf(c798320VTi.LJIIZILJ));
            c736480Suk.LIZ("vss", String.valueOf(c798320VTi.LJIJ));
            c736480Suk.LIZ("pss", String.valueOf(c798320VTi.LJJIFFI));
            c736480Suk.LIZ("pss_memory_used_rate", String.valueOf(c798320VTi.LJJII));
            c736480Suk.LIZ("native_heap_size", String.valueOf(c798320VTi.LJIJI));
            c736480Suk.LIZ("native_heap_allocated_size", String.valueOf(c798320VTi.LJIJJ));
            c736480Suk.LIZ("native_heap_free_size", String.valueOf(c798320VTi.LJIJJLI));
            c736480Suk.LIZ("free_java_memory", String.valueOf(c798320VTi.LJJ));
            c736480Suk.LIZ("java_used_memory", String.valueOf(c798320VTi.LJIL));
            c736480Suk.LIZ("java_used_rate", String.valueOf(c798320VTi.LJJI));
            c736480Suk.LIZ("max_java_memory", String.valueOf(c798320VTi.LJJIIJ));
            c736480Suk.LIZ("available_physical_memory", String.valueOf(c798320VTi.LJJIIJZLJL));
            c736480Suk.LIZ("max_physical_memory", String.valueOf(c798320VTi.LJJIIZ));
            c736480Suk.LIZ("physical_memory_used_rate", String.valueOf(c798320VTi.LJJIIZI));
            c736480Suk.LIZ("live_time", String.valueOf(c798320VTi.LJJIII));
            c736480Suk.LIZ("pss_code", String.valueOf(c798320VTi.LJJIJ));
            c736480Suk.LIZ("pss_graphics", String.valueOf(c798320VTi.LJJIJIIJI));
            c736480Suk.LIZ("pss_other", String.valueOf(c798320VTi.LJJIJIIJIL));
            c736480Suk.LIZ("pss_system", String.valueOf(c798320VTi.LJJIJIL));
            c736480Suk.LIZ("pss_swap", String.valueOf(c798320VTi.LJJIJL));
            c736480Suk.LIZ("minor_fault", String.valueOf(c798320VTi.LJJIJLIJ));
            c736480Suk.LIZ("major_fault", String.valueOf(c798320VTi.LJJIL));
            c736480Suk.LIZ("pminor_fault", String.valueOf(c798320VTi.LJJIZ));
            c736480Suk.LIZ("pmajor_fault", String.valueOf(c798320VTi.LJJJ));
            C20684815ws.LJIJ("prf_power_sample_report", c736480Suk.LIZIZ());
        }
        ((ArrayList) LIZIZ).clear();
    }
}
