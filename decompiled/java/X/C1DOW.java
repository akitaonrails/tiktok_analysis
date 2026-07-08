package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.monitor.TEPerfStatsInvoker;
import com.ss.android.vesdk.VEEditor;

/* JADX INFO: renamed from: X.1DOW, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DOW extends AbstractC574600MgE {
    @Override // X.AbstractC574600MgE
    public final int LIZ(VEEditor vEEditor, boolean z) {
        synchronized (vEEditor) {
            try {
                TEPerfStatsInvoker.nativeReset(1);
                vEEditor.LLLFFI = System.currentTimeMillis();
                vEEditor.LLLFZ = System.currentTimeMillis();
                C2484209oO.LJI("VEEditor", "init with model...");
                vEEditor.LJJJ(1.0f, 1.0f, 0.0f, 0, 0);
                if (vEEditor.LLILZLL == null) {
                    C2484209oO.LIZJ("VEEditor", "init mResManager is null");
                } else {
                    vEEditor.LLLILZJ = true;
                    throw null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return -112;
    }
}
