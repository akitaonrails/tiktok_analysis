package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C7f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308450C7f extends C09AY implements Function0<String> {
    public C308450C7f() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String str;
        try {
            String strLJIL = C0C64.LJIILLIIL().LJIL(31744, 2, "downgrade_ability_config_string", "{\"enable_strategy\":true,\"first_video_trigger_timeout\":15000,\"ui_first_frame_trigger_timeout\":200,\"scroll_end_trigger_timeout\":3000,\"normal_work_thread_interval\":16,\"normal_main_thread_interval\":8,\"enable_after_destroy\":false,\"enable_slide_scene\":true,\"enable_all_log\":false,\"disable_activity_api_call\":true,\"avoid_trigger_in_slide\":false,\"high_main_thread_segmentation_time\":0,\"enable_separate_timeout\":true,\"fix_timeout_bug\":true}", true);
            C189200o6.m2constructorimpl(strLJIL);
            str = strLJIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            str = c098200Yq;
        }
        return C189200o6.m5exceptionOrNullimpl(str) != null ? "{\"enable_strategy\":true,\"first_video_trigger_timeout\":15000,\"ui_first_frame_trigger_timeout\":200,\"scroll_end_trigger_timeout\":3000,\"normal_work_thread_interval\":16,\"normal_main_thread_interval\":8,\"enable_after_destroy\":false,\"enable_slide_scene\":true,\"enable_all_log\":false,\"disable_activity_api_call\":true,\"avoid_trigger_in_slide\":false,\"high_main_thread_segmentation_time\":0,\"enable_separate_timeout\":true,\"fix_timeout_bug\":true}" : str;
    }
}
