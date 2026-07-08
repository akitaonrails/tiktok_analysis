package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* JADX INFO: renamed from: X.0oZE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class C1478100oZE {
    public static void LIZ(SimVideoUrlModel simVideoUrlModel, final Aweme aweme, final InterfaceC1478130oZH interfaceC1478130oZH) {
        InterfaceC1478130oZH.LIZ.getClass();
        if (simVideoUrlModel != null && interfaceC1478130oZH != null) {
            if (simVideoUrlModel.getPreloadTaskInfo() == null) {
                simVideoUrlModel.setPreloadTaskInfo(new C0NI4(0, EnumC591520NHy.PRELOAD_TASK_PRIORITY_DEFAULT, null, new InterfaceC1475420oUu() { // from class: X.0oZF
                    @Override // X.InterfaceC1475420oUu
                    public final /* synthetic */ void LIZIZ(int i, long j, String str, String str2) {
                    }

                    @Override // X.InterfaceC1475420oUu
                    public final void LIZ(int i, long j, long j2, String str) {
                        interfaceC1478130oZH.LIZ(i, aweme);
                    }
                }));
                return;
            }
            C0NI4 preloadTaskInfo = simVideoUrlModel.getPreloadTaskInfo();
            if (preloadTaskInfo == null || preloadTaskInfo.LIZLLL != null) {
                return;
            }
            preloadTaskInfo.LIZLLL = new InterfaceC1475420oUu() { // from class: X.0oZG
                @Override // X.InterfaceC1475420oUu
                public final /* synthetic */ void LIZIZ(int i, long j, String str, String str2) {
                }

                @Override // X.InterfaceC1475420oUu
                public final void LIZ(int i, long j, long j2, String str) {
                    interfaceC1478130oZH.LIZ(i, aweme);
                }
            };
        }
    }
}
