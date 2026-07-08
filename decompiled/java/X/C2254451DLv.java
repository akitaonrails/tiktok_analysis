package X;

import com.ss.android.ttve.model.VETrackParams;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.1DLv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2254451DLv {
    public final VETrackParams LIZ = new VETrackParams();

    public final void LIZLLL() {
        VETrackParams vETrackParams = this.LIZ;
        if (vETrackParams.speeds == null) {
            vETrackParams.speeds = new ArrayList();
        }
        this.LIZ.speeds.add(Double.valueOf(1.0d));
    }

    public final void LIZ(String str) {
        VETrackParams vETrackParams = this.LIZ;
        if (vETrackParams.paths == null) {
            vETrackParams.paths = new ArrayList();
        }
        this.LIZ.paths.add(str);
    }

    public final void LIZIZ(int i) {
        VETrackParams vETrackParams = this.LIZ;
        if (vETrackParams.seqIns == null) {
            vETrackParams.seqIns = new ArrayList();
        }
        this.LIZ.seqIns.add(Integer.valueOf(i));
    }

    public final void LIZJ(int i) {
        VETrackParams vETrackParams = this.LIZ;
        if (vETrackParams.seqOuts == null) {
            vETrackParams.seqOuts = new ArrayList();
        }
        this.LIZ.seqOuts.add(Integer.valueOf(i));
    }

    public final void LJ(int i) {
        VETrackParams vETrackParams = this.LIZ;
        if (vETrackParams.trimIns == null) {
            vETrackParams.trimIns = new ArrayList();
        }
        this.LIZ.trimIns.add(Integer.valueOf(i));
    }

    public final void LJFF(int i) {
        VETrackParams vETrackParams = this.LIZ;
        if (vETrackParams.trimOuts == null) {
            vETrackParams.trimOuts = new ArrayList();
        }
        this.LIZ.trimOuts.add(Integer.valueOf(i));
    }
}
