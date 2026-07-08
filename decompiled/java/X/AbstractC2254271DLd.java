package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEAudioCapture;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEDuetSettings;
import com.ss.android.vesdk.VERecordMode;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEVolumeParam;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.ss.android.vesdk.lens.VEBaseRecorderLensParams;
import java.util.ArrayList;
import java.util.HashMap;
import lro.b;

/* JADX INFO: renamed from: X.1DLd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2254271DLd {
    public VEAudioCapture LIZ;
    public AbstractC2239611ClD LIZIZ;
    public final ArrayList<InterfaceC2254511DMb> LIZJ = new ArrayList<>();
    public final Object LIZLLL = new Object();
    public VERecorder.OnFrameAvailableListenerExt LJ;
    public final HashMap<Integer, Object> LJFF;
    public final Object LJI;
    public VECameraSettings LJII;
    public VEVideoEncodeSettings LJIIIIZZ;
    public VEAudioEncodeSettings LJIIIZ;
    public VEDuetSettings LJIIJ;
    public VERecordMode LJIIJJI;
    public String LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public float LJIJ;
    public float LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public int LJJ;
    public int LJJI;
    public int LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public float LJJIIZ;
    public float LJJIIZI;
    public float LJJIJ;
    public float LJJIJIIJI;
    public final boolean LJJIJIIJIL;
    public boolean LJJIJIL;
    public C1DIT LJJIJL;
    public b LJJIJLIJ;
    public VECameraSettings.CAMERA_FACING_ID LJJIL;

    public abstract void LIZIZ(boolean z, C448700Hie c448700Hie);

    public abstract void LJ(VEBaseRecorderLensParams vEBaseRecorderLensParams, InterfaceC2219671Bu9 interfaceC2219671Bu9);

    public void LIZJ() {
        synchronized (this.LIZLLL) {
            try {
                this.LIZJ.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LJ = null;
        this.LJJIJLIJ = null;
        this.LJFF.clear();
    }

    public AbstractC2254271DLd(AbstractC2239611ClD abstractC2239611ClD) {
        new C1664350tPd();
        this.LJFF = new HashMap<>();
        this.LJI = new Object();
        this.LJIIJJI = VERecordMode.DEFAULT;
        C1DIV.RADIO_FULL.ordinal();
        new VEEffectFilterParam();
        new VEVolumeParam();
        new VESize(0, 0);
        this.LJIILIIL = 0;
        this.LJIILJJIL = 0;
        this.LJIILL = 0;
        this.LJIILLIIL = 0;
        this.LJIIZILJ = 0;
        this.LJIJ = 0.0f;
        this.LJIJI = 0.0f;
        this.LJIJJ = 0;
        this.LJIJJLI = 0;
        this.LJIL = 0;
        this.LJJ = 0;
        this.LJJI = 0;
        this.LJJIFFI = 0;
        this.LJJII = 0;
        this.LJJIII = 0;
        this.LJJIIJ = 0;
        this.LJJIIJZLJL = 0;
        this.LJJIIZ = 0.0f;
        this.LJJIIZI = -1.0f;
        this.LJJIJ = -1.0f;
        this.LJJIJIIJI = -1.0f;
        this.LJJIJIIJIL = false;
        this.LJJIJIL = false;
        this.LJJIJL = C1DIT.NONE;
        this.LJJIJLIJ = new b(this);
        this.LIZIZ = abstractC2239611ClD;
    }

    public final void LIZ(InterfaceC2254511DMb interfaceC2254511DMb) {
        synchronized (this.LIZLLL) {
            try {
                this.LIZJ.add(interfaceC2254511DMb);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZLLL(InterfaceC2254511DMb interfaceC2254511DMb) {
        synchronized (this.LIZLLL) {
            try {
                this.LIZJ.remove(interfaceC2254511DMb);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
