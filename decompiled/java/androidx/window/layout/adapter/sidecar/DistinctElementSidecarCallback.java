package androidx.window.layout.adapter.sidecar;

import X.C12LR;
import X.C12LS;
import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {
    public SidecarDeviceState LIZIZ;
    public final C12LR LIZLLL;
    public final SidecarInterface.SidecarCallback LJ;
    public final Object LIZ = new Object();
    public final Map<IBinder, SidecarWindowLayoutInfo> LIZJ = new WeakHashMap();

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.LIZ) {
            try {
                C12LR c12lr = this.LIZLLL;
                SidecarDeviceState sidecarDeviceState2 = this.LIZIZ;
                c12lr.getClass();
                if (!Intrinsics.LJFF(sidecarDeviceState2, sidecarDeviceState)) {
                    if (sidecarDeviceState2 != null) {
                        int iLIZ = C12LS.LIZ(sidecarDeviceState2);
                        if (iLIZ < 0 || iLIZ > 4) {
                            iLIZ = 0;
                        }
                        int iLIZ2 = C12LS.LIZ(sidecarDeviceState);
                        if (iLIZ2 < 0 || iLIZ2 > 4) {
                            iLIZ2 = 0;
                        }
                        if (iLIZ == iLIZ2) {
                        }
                    }
                    this.LIZIZ = sidecarDeviceState;
                    this.LJ.onDeviceStateChanged(sidecarDeviceState);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public DistinctElementSidecarCallback(C12LR c12lr, SidecarInterface.SidecarCallback sidecarCallback) {
        this.LIZLLL = c12lr;
        this.LJ = sidecarCallback;
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.LIZ) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) ((WeakHashMap) this.LIZJ).get(iBinder);
                this.LIZLLL.getClass();
                if (Intrinsics.LJFF(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo) || (sidecarWindowLayoutInfo2 != null && sidecarWindowLayoutInfo != null && C12LR.LIZIZ(C12LS.LIZIZ(sidecarWindowLayoutInfo2), C12LS.LIZIZ(sidecarWindowLayoutInfo)))) {
                    return;
                }
                ((WeakHashMap) this.LIZJ).put(iBinder, sidecarWindowLayoutInfo);
                this.LJ.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
