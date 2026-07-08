package X;

import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13zU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20191413zU {
    public static volatile int LIZIZ;
    public static final C20191413zU LIZ = new C20191413zU();
    public static final List<C07X4> LIZJ = new ArrayList();

    static {
        IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (iPluginService != null) {
            iPluginService.LJJIJ(new C1BLD() { // from class: X.13zV
                @Override // X.C1BLD
                public final void LIZ() {
                }

                @Override // X.C1BLD
                public final void LIZLLL() {
                }

                @Override // X.C1BLD
                public final void LJFF(long j, long j2, String str, boolean z) {
                }

                @Override // X.C1BLD
                public final void LJI(String str, boolean z) {
                }

                @Override // X.C1BLD
                public final void LIZIZ(String str, boolean z) {
                    if (Intrinsics.LJFF(str, "com.ss.android.ugc.aweme.df_camera")) {
                        C20191413zU c20191413zU = C20191413zU.LIZ;
                        C20191413zU.LIZIZ = 2;
                    }
                }

                @Override // X.C1BLD
                public final void LJ(String str, boolean z) {
                    if (Intrinsics.LJFF(str, "com.ss.android.ugc.aweme.df_camera")) {
                        C20191413zU c20191413zU = C20191413zU.LIZ;
                        C20191413zU.LIZIZ = 1;
                        C201955140j.LJIILJJIL(C554740LpI.LIZIZ, "PluginInstallObserverManager: onInstallSuccess");
                        C20191413zU.LIZ.getClass();
                        C20191413zU.LIZ(true);
                    }
                }

                @Override // X.C1BLD
                public final void LIZJ(String str, boolean z, int i, Function0<Unit> function0) {
                    if (Intrinsics.LJFF(str, "com.ss.android.ugc.aweme.df_camera")) {
                        C20191413zU c20191413zU = C20191413zU.LIZ;
                        C20191413zU.LIZIZ = 0;
                        C554740LpI c554740LpI = C554740LpI.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PluginInstallObserverManager: onInstallFailed, reason: ");
                        sbLIZ.append(i);
                        C201955140j.LJII(c554740LpI, C2188811AlT.LIZIZ(sbLIZ));
                        C20191413zU.LIZ.getClass();
                        C20191413zU.LIZ(false);
                    }
                }
            });
        } else {
            C201955140j.LJII(C554740LpI.LIZIZ, "PluginInstallObserverManager: IPluginService not available");
        }
    }

    public static void LIZ(boolean z) {
        ArrayList<C07X4> arrayList;
        Function0<Unit> function0;
        List<C07X4> list = LIZJ;
        synchronized (list) {
            try {
                arrayList = new ArrayList(list);
                ((ArrayList) list).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        for (C07X4 c07x4 : arrayList) {
            if (z) {
                function0 = c07x4.LIZ;
            } else {
                function0 = c07x4.LIZIZ;
                if (function0 != null) {
                }
            }
            function0.invoke();
        }
    }
}
