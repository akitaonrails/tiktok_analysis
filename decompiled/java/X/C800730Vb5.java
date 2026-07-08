package X;

import Y.ARunnableS4S0001000_13;
import android.os.Process;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.CpusetManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0Vb5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C800730Vb5 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(long j) {
        boolean z;
        boolean z2;
        C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Jato start: duration: ");
        sbLIZ.append(j);
        C201955140j.LIZJ(c20102213l6, C2188811AlT.LIZIZ(sbLIZ));
        if (!JatoXL.isInited()) {
            return;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tool_jato_gc_settings", true) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long jLJIJ = ((long) C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tool_jato_gc_settings", true)) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            if (j > 0) {
                jLJIJ = j;
            }
            JatoXL.requestBlockGc(jLJIJ);
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tool_jato_jit_settings", true) > 0) {
            C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tool_jato_jit_settings", true);
            int i = C2187451AjH.LIZ;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tool_jato_cpu_boost_settings", true) > 0) {
            long jLJIJ2 = ((long) C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tool_jato_cpu_boost_settings", true)) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            if (j > 0) {
                jLJIJ2 = j;
            }
            JatoXL.tryCpuBoost(jLJIJ2);
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tool_jato_bind_core_settings", true) > 0) {
            CpusetManager.bindBigCore();
            RunnableC800720Vb4 runnableC800720Vb4 = new Runnable() { // from class: X.0Vb4
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CreativeToolsJatoHelper@e7e0.onEnterNewPage$1");
                    try {
                        CpusetManager.resetCoreBind();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CreativeToolsJatoHelper@e7e0.onEnterNewPage$1");
                }
            };
            long jLJIJ3 = ((long) C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tool_jato_bind_core_settings", true)) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            if (j > 0) {
                jLJIJ3 = j;
            }
            C2487409ou.LIZLLL(jLJIJ3, runnableC800720Vb4);
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tool_jato_render_thread_settings", true) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            JatoXL.boostRenderThread(C1BWL.LIZ(), -20);
            RunnableC800670Vaz runnableC800670Vaz = new Runnable() { // from class: X.0Vaz
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CreativeToolsJatoHelper@e7e0.onEnterNewPage$2");
                    try {
                        JatoXL.resetRenderThread();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CreativeToolsJatoHelper@e7e0.onEnterNewPage$2");
                }
            };
            long jLJIJ4 = ((long) C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tool_jato_render_thread_settings", true)) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            if (j > 0) {
                jLJIJ4 = j;
            }
            C2487409ou.LIZLLL(jLJIJ4, runnableC800670Vaz);
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tool_jato_thread_settings", true) > 0) {
            int iMyTid = Process.myTid();
            JatoXL.setPriority(iMyTid, -20);
            ARunnableS4S0001000_13 aRunnableS4S0001000_13 = new ARunnableS4S0001000_13(iMyTid, 0);
            long jLJIJ5 = ((long) C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tool_jato_thread_settings", true)) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            if (j <= 0) {
                j = jLJIJ5;
            }
            C2487409ou.LIZLLL(j, aRunnableS4S0001000_13);
        }
    }
}
