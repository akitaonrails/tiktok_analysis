package X;

import Y.ARunnableS0S0001000_3;
import android.os.Process;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.CpusetManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.08Zr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2139308Zr {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ() {
        C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Jato start: duration: ");
        sbLIZ.append(0L);
        C201955140j.LIZJ(c20102213l6, C2188811AlT.LIZIZ(sbLIZ));
        if (JatoXL.isInited()) {
            if (((long) C0C64.LJIILLIIL().LJIJ(31744, 0, "story_creative_tool_jato_gc_settings", true)) > 0) {
                JatoXL.requestBlockGc(((long) C0C64.LJIILLIIL().LJIJ(31744, 0, "story_creative_tool_jato_gc_settings", true)) * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            }
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "story_creative_tool_jato_jit_settings", true) > 0) {
                C0C64.LJIILLIIL().LJIJ(31744, 0, "story_creative_tool_jato_jit_settings", true);
                int i = C2187451AjH.LIZ;
            }
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "story_creative_tool_jato_cpu_boost_settings", true) > 0) {
                JatoXL.tryCpuBoost(((long) C0C64.LJIILLIIL().LJIJ(31744, 0, "story_creative_tool_jato_cpu_boost_settings", true)) * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            }
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "story_creative_tool_jato_bind_core_settings", true) > 0) {
                CpusetManager.bindBigCore();
                C2487409ou.LIZLLL(((long) C0C64.LJIILLIIL().LJIJ(31744, 0, "story_creative_tool_jato_bind_core_settings", true)) * ((long) LSPassThroughRecordSizeConfig.DEFAULT), new Runnable() { // from class: X.08Ri
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("StoryCreativeToolsJatoHelper@ab7b.onEnterNewPage$1");
                        try {
                            CpusetManager.resetCoreBind();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("StoryCreativeToolsJatoHelper@ab7b.onEnterNewPage$1");
                    }
                });
            }
            if (((long) C0C64.LJIILLIIL().LJIJ(31744, 0, "story_creative_tool_jato_render_thread_settings", true)) > 0) {
                JatoXL.boostRenderThread(C1BWL.LIZ(), -20);
                C2487409ou.LIZLLL(((long) C0C64.LJIILLIIL().LJIJ(31744, 0, "story_creative_tool_jato_render_thread_settings", true)) * ((long) LSPassThroughRecordSizeConfig.DEFAULT), new Runnable() { // from class: X.08X6
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("StoryCreativeToolsJatoHelper@ab7b.onEnterNewPage$2");
                        try {
                            JatoXL.resetRenderThread();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("StoryCreativeToolsJatoHelper@ab7b.onEnterNewPage$2");
                    }
                });
            }
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "story_creative_tool_jato_thread_settings", true) > 0) {
                int iMyTid = Process.myTid();
                JatoXL.setPriority(iMyTid, -20);
                C2487409ou.LIZLLL(((long) C0C64.LJIILLIIL().LJIJ(31744, 0, "story_creative_tool_jato_thread_settings", true)) * ((long) LSPassThroughRecordSizeConfig.DEFAULT), new ARunnableS0S0001000_3(iMyTid, 3));
            }
        }
    }
}
