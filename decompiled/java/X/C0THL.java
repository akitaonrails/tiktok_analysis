package X;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.view.Surface;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0THL, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0THL {
    public VirtualDisplay LIZ;
    public MediaProjection LIZLLL;
    public final MediaProjectionManager LJ;
    public Surface LJFF;
    public int LIZIZ = 1920;
    public int LIZJ = 1080;
    public final C0THM LJI = new VirtualDisplay.Callback() { // from class: X.0THM
        @Override // android.hardware.display.VirtualDisplay.Callback
        public final void onPaused() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("virtualDisplay onPaused, virtualDisplay =");
            sbLIZ.append(this.LIZ.LIZ);
            C20441214yg.LJIIIZ("VirtualDisplayManager", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // android.hardware.display.VirtualDisplay.Callback
        public final void onResumed() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("virtualDisplay onResumed, virtualDisplay =");
            sbLIZ.append(this.LIZ.LIZ);
            C20441214yg.LJIIIZ("VirtualDisplayManager", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // android.hardware.display.VirtualDisplay.Callback
        public final void onStopped() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("virtualDisplay onStopped, virtualDisplay =");
            sbLIZ.append(this.LIZ.LIZ);
            C20441214yg.LJIIIZ("VirtualDisplayManager", C2188811AlT.LIZIZ(sbLIZ));
        }
    };
    public final C0THN LJII = new MediaProjection.Callback() { // from class: X.0THN
        @Override // android.media.projection.MediaProjection.Callback
        public final void onStop() {
            super.onStop();
            this.LIZ.LIZIZ();
        }
    };

    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerVirtualDisplay with MediaProjection, width{");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("} height{");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("} name{");
        sbLIZ.append("xxx-v-display");
        sbLIZ.append("}, mediaProjection:");
        sbLIZ.append(this.LIZLLL);
        C20441214yg.LIZIZ("VirtualDisplayManager", C2188811AlT.LIZIZ(sbLIZ));
        try {
            MediaProjection mediaProjection = this.LIZLLL;
            if (mediaProjection != null) {
                mediaProjection.registerCallback(this.LJII, null);
            }
            MediaProjection mediaProjection2 = this.LIZLLL;
            this.LIZ = mediaProjection2 != null ? C0TPY.LIZ(mediaProjection2, "xxx-v-display", this.LIZIZ, this.LIZJ, 1, this.LJFF, this.LJI, CertProviderManagerKt.findCert("bpea-game_live_cast_create_virtual_display", 1476411394)) : null;
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("VirtualDisplayManager", e);
        }
    }

    public final void LIZIZ() {
        C20441214yg.LIZIZ("VirtualDisplayManager", "release ");
        VirtualDisplay virtualDisplay = this.LIZ;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.LIZ = null;
        }
        C20441214yg.LIZIZ("VirtualDisplayManager", "tearDownMediaProjection ");
        try {
            MediaProjection mediaProjection = this.LIZLLL;
            if (mediaProjection != null) {
                C2204961BRm.LJLJJL(mediaProjection, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MyFf9A4/HWWwV5JdF18j+J2so47s3jpThJswoe3MviGgIBOLVumg==", null));
                this.LIZLLL = null;
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        MediaProjection mediaProjection2 = this.LIZLLL;
        if (mediaProjection2 != null) {
            mediaProjection2.unregisterCallback(this.LJII);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0THM] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0THN] */
    public C0THL(Context context) {
        this.LJ = (MediaProjectionManager) C786410Ut5.H2(context, "media_projection");
    }

    public final void LJ(Surface surface) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSurface, Surface:");
        sbLIZ.append(surface);
        C20441214yg.LJIIIZ("VirtualDisplayManager", C2188811AlT.LIZIZ(sbLIZ));
        this.LJFF = surface;
    }

    public final void LIZJ(int i, Fragment fragment) {
        Intent intentLIZJ;
        C20441214yg.LJIIIZ("VirtualDisplayManager", "requestRecordFromMediaProjection");
        if (fragment.isAdded() && fragment.getActivity() != null) {
            try {
                MediaProjectionManager mediaProjectionManager = this.LJ;
                if (mediaProjectionManager != null && (intentLIZJ = C0TPX.LIZJ(mediaProjectionManager, CertProviderManagerKt.findCert("bpea-game_live_cast_create_capture_intent", 1476411394))) != null) {
                    C1701330uNH.LIZ(intentLIZJ, fragment);
                    C2204961BRm.LLJL(fragment, intentLIZJ, i, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MyFf9A4/HWWwV5JdF18j+J2so47s3jpThJswoe3MviGgIBOLVumg==", null));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("VirtualDisplayManager", e);
            }
        }
    }

    public final void LIZLLL(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setResolution, w:");
        sbLIZ.append(i);
        sbLIZ.append(", h:");
        sbLIZ.append(i2);
        C20441214yg.LJIIIZ("VirtualDisplayManager", C2188811AlT.LIZIZ(sbLIZ));
        if (1 <= i && i < 4097) {
            this.LIZIZ = i;
        }
        if (1 <= i2 && i2 < 4097) {
            this.LIZJ = i2;
        }
    }

    public final void LJFF(int i, Intent intent) {
        Object c098200Yq;
        MediaProjection mediaProjectionLIZLLL;
        C20441214yg.LJIIIZ("VirtualDisplayManager", "setupMediaProjection");
        try {
            MediaProjectionManager mediaProjectionManager = this.LJ;
            if (mediaProjectionManager != null) {
                mediaProjectionLIZLLL = C0TPX.LIZLLL(mediaProjectionManager, i, intent, CertProviderManagerKt.findCert("bpea-game_live_cast_get_media_projection", 1476411394));
            } else {
                mediaProjectionLIZLLL = null;
            }
            this.LIZLLL = mediaProjectionLIZLLL;
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJI("VirtualDisplayManager", thM5exceptionOrNullimpl);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setupMediaProjection, mediaProjection:");
        sbLIZ.append(this.LIZLLL);
        C20441214yg.LJIIIZ("VirtualDisplayManager", C2188811AlT.LIZIZ(sbLIZ));
    }
}
