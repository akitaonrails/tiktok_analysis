package X;

import Y.ARunnableS131S0100000_31;
import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.19I2, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19I2 {
    public final Context LIZ;
    public final DataChannel LIZIZ;
    public Camera LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public C19I4 LJFF;
    public boolean LJI;
    public final C01GW LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;

    public final Camera.Parameters LIZ() {
        Camera.Parameters parameters = null;
        try {
            Camera camera = this.LIZJ;
            if (camera != null) {
                parameters = camera.getParameters();
                return parameters;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("LiveCoverCameraProxy", e);
        }
        return parameters;
    }

    public final void LIZJ() {
        Camera camera = this.LIZJ;
        if (camera != null) {
            camera.setPreviewCallback(null);
            C2204961BRm.LJJJZ(camera, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl/CNi0OYKqO8JqPWz2oGQaQ14R7xkAgiHYOOk", null));
            C746740TQy.LIZIZ(camera, CertProviderManagerKt.findCert("bpea-live_cover_camera_release", 1476788484));
        }
        this.LIZJ = null;
        this.LJ = false;
    }

    public final void LIZLLL() {
        if (this.LJIIIIZZ >= 20 || !this.LJIIIZ) {
            return;
        }
        C786410Ut5.LJLIIL(((long) this.LJIIIIZZ) * 10, (Handler) this.LJII.getValue(), new ARunnableS131S0100000_31(this, 110));
        this.LJIIIIZZ++;
    }

    public final C19I4 LIZIZ() {
        List<String> supportedFlashModes;
        C19I4 c19i4 = C19I4.values()[(this.LJFF.ordinal() + 1) % C19I4.values().length];
        this.LJFF = c19i4;
        Camera.Parameters parametersLIZ = LIZ();
        return ((parametersLIZ == null || (supportedFlashModes = parametersLIZ.getSupportedFlashModes()) == null || !supportedFlashModes.contains(c19i4.getMode())) && c19i4 != C19I4.OFF) ? LIZIZ() : c19i4;
    }

    public final void LJ(Camera.Parameters parameters) {
        try {
            Camera camera = this.LIZJ;
            if (camera != null) {
                camera.setParameters(parameters);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("LiveCoverCameraProxy", e);
        }
    }

    public final void LJFF(C19I4 c19i4) {
        List<String> supportedFlashModes;
        Camera.Parameters parameters;
        Camera.Parameters parametersLIZ = LIZ();
        if (parametersLIZ != null && (supportedFlashModes = parametersLIZ.getSupportedFlashModes()) != null && supportedFlashModes.contains(c19i4.getMode())) {
            Camera camera = this.LIZJ;
            if (camera != null) {
                parameters = camera.getParameters();
                if (parameters != null) {
                    parameters.setFlashMode(c19i4.getMode());
                }
            } else {
                parameters = null;
            }
            LJ(parameters);
        }
    }

    public C19I2(Context context, DataChannel dataChannel, boolean z, boolean z2) {
        int iIntValue;
        this.LIZ = context;
        this.LIZIZ = dataChannel;
        if (!z && !z2) {
            iIntValue = 0;
        } else {
            iIntValue = InterfaceC772190UQv.c3.LIZ().intValue();
        }
        this.LIZLLL = iIntValue;
        this.LJFF = C19I4.OFF;
        this.LJII = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(335));
        this.LJIIIZ = true;
    }
}
