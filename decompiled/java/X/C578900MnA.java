package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEEditor;

/* JADX INFO: renamed from: X.0MnA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C578900MnA extends AbstractC574600MgE {
    @Override // X.AbstractC574600MgE
    public final int LIZ(VEEditor vEEditor, boolean z) {
        synchronized (vEEditor) {
            try {
                C2484209oO.LIZJ("VEEditor", "initWithCanvas invalid canvasFilterParam!");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return -100;
    }
}
