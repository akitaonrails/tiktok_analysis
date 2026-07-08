package X;

import Y.ARunnableS132S0100000_32;
import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.ur.camera.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.19Hs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21514619Hs {
    public final Context LIZ;
    public final DataChannel LIZIZ;
    public Camera LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public boolean LJI;
    public int LJIIIIZZ;
    public EnumC21514519Hr LJFF = EnumC21514519Hr.OFF;
    public final C01GW LJII = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(308));
    public boolean LJIIIZ = true;
    public final C01GW LJIIJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(307));

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
            LIZIZ().LIZLLL("LiveCoverCameraProxy", e);
        }
        return parameters;
    }

    public final C1910890zpH LIZIZ() {
        return (C1910890zpH) this.LJIIJ.getValue();
    }

    public final void LIZLLL() {
        Camera camera = this.LIZJ;
        if (camera != null) {
            camera.setPreviewCallback(null);
            C2204961BRm.LJJJZ(camera, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDnewuxPUCCa6JqknrXKmM2CRm4SJqgSPD3f6e/Ci75sJypw==", null));
            C746740TQy.LIZIZ(camera, CertProviderManagerKt.findCert("bpea-live_cover_camera_release", 1476788484));
        }
        this.LIZJ = null;
        this.LJ = false;
    }

    public final void LJ() {
        if (this.LJIIIIZZ >= 20 || !this.LJIIIZ) {
            return;
        }
        C786410Ut5.LJLIIL(((long) this.LJIIIIZZ) * 10, (Handler) this.LJII.getValue(), new ARunnableS132S0100000_32(this, 102));
        this.LJIIIIZZ++;
    }

    public final EnumC21514519Hr LIZJ() {
        List<String> supportedFlashModes;
        EnumC21514519Hr enumC21514519Hr = EnumC21514519Hr.values()[(this.LJFF.ordinal() + 1) % EnumC21514519Hr.values().length];
        this.LJFF = enumC21514519Hr;
        Camera.Parameters parametersLIZ = LIZ();
        return ((parametersLIZ == null || (supportedFlashModes = parametersLIZ.getSupportedFlashModes()) == null || !supportedFlashModes.contains(enumC21514519Hr.getMode())) && enumC21514519Hr != EnumC21514519Hr.OFF) ? LIZJ() : enumC21514519Hr;
    }

    public final void LJFF(Camera.Parameters parameters) {
        try {
            Camera camera = this.LIZJ;
            if (camera != null) {
                camera.setParameters(parameters);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZIZ().LIZLLL("LiveCoverCameraProxy", e);
        }
    }

    public final void LJI(EnumC21514519Hr enumC21514519Hr) {
        List<String> supportedFlashModes;
        Camera.Parameters parameters;
        Camera.Parameters parametersLIZ = LIZ();
        if (parametersLIZ != null && (supportedFlashModes = parametersLIZ.getSupportedFlashModes()) != null && supportedFlashModes.contains(enumC21514519Hr.getMode())) {
            Camera camera = this.LIZJ;
            if (camera != null) {
                parameters = camera.getParameters();
                if (parameters != null) {
                    parameters.setFlashMode(enumC21514519Hr.getMode());
                }
            } else {
                parameters = null;
            }
            LJFF(parameters);
        }
    }

    public C21514619Hs(Context context, DataChannel dataChannel) {
        this.LIZ = context;
        this.LIZIZ = dataChannel;
    }
}
