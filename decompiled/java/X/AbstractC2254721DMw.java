package X;

import Y.ARunnableS120S0100000_20;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Range;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmInterface;
import com.ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmParam;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1DMw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2254721DMw implements C1DJK {
    public boolean LIZ;
    public C1DJ6 LIZIZ;
    public boolean LIZJ;
    public final InterfaceC2254691DMt LIZLLL;
    public final Handler LJ;
    public final Context LJFF;
    public C1DNM LJI;
    public int LJII;
    public int LJIIIIZZ;
    public float LJIIJJI;
    public int LJIIL;
    public final InterfaceC2186371AhX LJIILIIL;
    public InterfaceC1305790k5J LJIILJJIL;
    public C1DJW LJIILL;
    public InterfaceC2253721DJa LJIILLIIL;
    public InterfaceC2186151AhB LJIIZILJ;
    public C20188413z0 LJIJ;
    public int LJIJI;
    public Cert LJIL;
    public final JSONObject LJJ;
    public boolean LJJI;
    public TECameraAlgorithmInterface LJJIFFI;
    public long LJJII;
    public int LJJIII;
    public long LJJIIJ;
    public boolean LJJIIJZLJL;
    public int LJJIIZ;
    public volatile boolean LJJIIZI;
    public final Object LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public boolean LJJIJIL;
    public long LJJIJL;
    public final C1305750k5F LJJIJLIJ;
    public HashMap<EnumC1270990jBB, Cert> LJJIL;
    public boolean LJJIZ;
    public final Object LJJJ;
    public boolean LJJJI;
    public boolean LJJJIL;
    public Range<Integer> LJJJJ;
    public int LJJJJI;
    public int LJJJJIZL;
    public int LJJJJJ;
    public int LJJJJJL;
    public volatile boolean LJJJJL;
    public final ARunnableS120S0100000_20 LJJJJLI;
    public int LJIIIZ = -1;
    public int LJIIJ = -1;
    public final AtomicBoolean LJIJJ = new AtomicBoolean(false);
    public final Map<String, Bundle> LJIJJLI = new HashMap();

    @Override // X.C1DJK
    public abstract void LIZ(int i);

    @Override // X.C1DJK
    public int LIZJ() {
        this.LJJJJL = false;
        return -1;
    }

    @Override // X.C1DJK
    public int[] LJ() {
        TEFrameSizei tEFrameSizei = this.LIZIZ.LLJJJJJIL;
        return new int[]{tEFrameSizei.width, tEFrameSizei.height};
    }

    @Override // X.C1DJK
    public int[] LJII() {
        return null;
    }

    @Override // X.C1DJK
    public final void LJIIL() {
    }

    @Override // X.C1DJK
    public abstract void LJIILL(C1DJG c1djg);

    @Override // X.C1DJK
    public final void LJIILLIIL() {
        this.LJIILL = null;
    }

    @Override // X.C1DJK
    public void LJIJI(int i) {
    }

    @Override // X.C1DJK
    public int LJIJJ() {
        this.LJJJJL = true;
        return -1;
    }

    @Override // X.C1DJK
    public void LJJ(Bundle bundle) {
    }

    @Override // X.C1DJK
    public abstract void LJJI(InterfaceC2254701DMu interfaceC2254701DMu, boolean z);

    @Override // X.C1DJK
    public void LJJII(int i, int i2) {
    }

    @Override // X.C1DJK
    public void LJJIIJ(boolean z) {
    }

    @Override // X.C1DJK
    public void LJJIIJZLJL(float f) {
    }

    @Override // X.C1DJK
    public JSONObject LJJIJ() {
        return null;
    }

    @Override // X.C1DJK
    public void LJJIJIIJIL(float f) {
    }

    @Override // X.C1DJK
    public float LJJIJIL() {
        return -1.0f;
    }

    @Override // X.C1DJK
    public int LJJJJJ() {
        return -1;
    }

    @Override // X.C1DJK
    public final void LJJJJL(int i) {
    }

    @Override // X.C1DJK
    public float[] LJJJJZ() {
        return new float[]{-1.0f, -1.0f};
    }

    @Override // X.C1DJK
    public void LJJJLIIL() {
    }

    @Override // X.C1DJK
    public int[] LJJJZ() {
        return new int[]{-1, -1};
    }

    @Override // X.C1DJK
    public void LJJLI() {
    }

    @Override // X.C1DJK
    public void LJJLIIIIJ() {
    }

    @Override // X.C1DJK
    public void LJJLIIIJ(boolean z) {
    }

    @Override // X.C1DJK
    public void LJJLIIIJJI(Cert cert) {
    }

    @Override // X.C1DJK
    public boolean LJJLIIIJJIZ() {
        return this instanceof C2254731DMx;
    }

    @Override // X.C1DJK
    public abstract void LJJLIIIJL(int i, int i2);

    @Override // X.C1DJK
    public void LJJLIIIJLJLI() {
        this.LJJIJIIJI = false;
        this.LJJIJIIJIL = false;
        this.LJJIJIL = false;
        this.LJJIJL = System.currentTimeMillis();
        this.LJJIZ = false;
    }

    @Override // X.C1DJK
    public void LJJLIIIJLLLLLLLZ() {
    }

    @Override // X.C1DJK
    public void LJJLIL(boolean z) {
    }

    @Override // X.C1DJK
    public abstract void LJJLJ();

    @Override // X.C1DJK
    public void LJJLL(TEFrameRateRange tEFrameRateRange) {
    }

    @Override // X.C1DJK
    public void LJJZ() {
    }

    @Override // X.C1DJK
    public final void LJJZZIII() {
    }

    @Override // X.C1DJK
    public long[] LJLIIL() {
        return new long[]{-1, -1};
    }

    @Override // X.C1DJK
    public abstract void LJLJI(float f, InterfaceC2254701DMu interfaceC2254701DMu);

    @Override // X.C1DJK
    public int[] LJLJJI() {
        return null;
    }

    @Override // X.C1DJK
    public void LJLJJL(long j) {
    }

    @Override // X.C1DJK
    public final void LJLJJLL() {
    }

    public abstract int LJZI();

    public abstract int LJZL();

    public abstract int LL();

    public abstract int LLD();

    @Override // X.C1DJK
    public int getFlashMode() {
        return -1;
    }

    @Override // X.C1DJK
    public abstract void stopCapture();

    @Override // X.C1DJK
    public final float L4() {
        return this.LJJIJLIJ.LIZ.LIZIZ;
    }

    @Override // X.C1DJK
    public final int LJIIIZ() {
        C1286570jaJ c1286570jaJ = this.LIZIZ.LLLFZ;
        if (c1286570jaJ != null) {
            return c1286570jaJ.LIZIZ;
        }
        return 0;
    }

    @Override // X.C1DJK
    public final int LJIIZILJ() {
        if (this.LJIJJ.getAndSet(false)) {
            LJZL();
        }
        return this.LJIIIZ;
    }

    @Override // X.C1DJK
    public void LJJJIL() {
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraBase", "updateSurface");
        C1DNM c1dnm = this.LJI;
        if (c1dnm == null || c1dnm.LIZIZ() == null) {
            C2183341Ace.LIZIZ("TECameraBase", "can not update provider");
        } else if (C2186191AhF.LIZ[this.LJI.LIZIZ().LJFF().ordinal()] != 1) {
            C2183341Ace.LJ("TECameraBase", "not support!");
        } else {
            this.LJI.LIZIZ().LJIJI();
        }
    }

    @Override // X.C1DJK
    public List<TEFrameSizei> LJJJJI() {
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZIZ("TECameraBase", "getSupportedPictureSizes error");
        return null;
    }

    @Override // X.C1DJK
    public void LJJJJLI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unsupport capture burst, camera type:");
        sbLIZ.append(LJZI());
        new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
        throw null;
    }

    @Override // X.C1DJK
    public final void LJJJLZIJ() {
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraBase", "releaseSurfaceTexture");
        synchronized (this.LJJIJ) {
            try {
                if (this.LJJIIZI) {
                    C2183341Ace.LIZ("TECameraBase", "need releaseSurfaceTexture");
                    this.LJJIIZI = false;
                    this.LJI.LIZ.LJIILLIIL();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C1DJK
    public final void LJJLIIIJILLIZJL() {
        int i = this.LJIIL;
        if (i > 0) {
            this.LJIIL = i - 1;
        }
    }

    @Override // X.C1DJK
    public List<TEFrameSizei> LJJLIIJ() {
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZIZ("TECameraBase", "getSupportedPreviewSizes error");
        return null;
    }

    @Override // X.C1DJK
    public final void LJLLL() {
        TECameraAlgorithmInterface tECameraAlgorithmInterface = this.LJJIFFI;
        if (tECameraAlgorithmInterface != null) {
            tECameraAlgorithmInterface.setLensCallback(null);
        }
    }

    @Override // X.C1DJK
    public void destroy() {
        TECameraAlgorithmInterface tECameraAlgorithmInterface = this.LJJIFFI;
        if (tECameraAlgorithmInterface != null) {
            tECameraAlgorithmInterface.destroy();
        }
        C1DNM c1dnm = this.LJI;
        if (c1dnm != null) {
            c1dnm.LIZ.LJIIZILJ();
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZLLL("TECameraBase", "release provider");
        }
    }

    @Override // X.C1DJK
    public final C1286570jaJ getCameraECInfo() {
        return this.LIZIZ.LLLFZ;
    }

    @Override // X.C1DJK
    public boolean isSupportedExposureCompensation() {
        C1286570jaJ c1286570jaJ = this.LIZIZ.LLLFZ;
        return c1286570jaJ != null && c1286570jaJ.LIZ();
    }

    public Bundle LJZ() {
        Bundle bundle;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ.LLILLJJLI);
        sbLIZ.append("_");
        sbLIZ.append(this.LIZIZ.LLILZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("fillFeatures key = ");
        sbLIZ2.append(strLIZIZ);
        C2183341Ace.LIZ("TECameraBase", C2188811AlT.LIZIZ(sbLIZ2));
        if (((HashMap) this.LJIJJLI).containsKey(strLIZIZ)) {
            bundle = (Bundle) ((HashMap) this.LJIJJLI).get(strLIZIZ);
            if (bundle != null) {
            }
            return bundle;
        }
        bundle = new Bundle();
        ((HashMap) this.LJIJJLI).put(strLIZIZ, bundle);
        bundle.putInt("facing", this.LIZIZ.LLILZ);
        return bundle;
    }

    @Override // X.C1DJK
    public final C1DJ6 LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.C1DJK
    public final float LJFF() {
        return this.LJIIJJI;
    }

    @Override // X.C1DJK
    public final int LJIILIIL() {
        return this.LJJJJJ;
    }

    @Override // X.C1DJK
    public final int LJJIII() {
        return this.LJJJJI;
    }

    @Override // X.C1DJK
    public final int LJJIJL() {
        return this.LJJJJJL;
    }

    @Override // X.C1DJK
    public final C1DNM LJJIJLIJ() {
        return this.LJI;
    }

    @Override // X.C1DJK
    public final int LJJJ() {
        return this.LJJJJIZL;
    }

    @Override // X.C1DJK
    public final int LJJJJ() {
        return this.LJIIL;
    }

    @Override // X.C1DJK
    public final int LJL() {
        return this.LJII;
    }

    @Override // X.C1DJK
    public final Handler getHandler() {
        return this.LJ;
    }

    @Override // X.C1DJK
    public final float J4(boolean z) {
        C2254941DNs c2254941DNs;
        if (z) {
            c2254941DNs = this.LJJIJLIJ.LIZJ;
        } else {
            c2254941DNs = this.LJJIJLIJ.LIZIZ;
        }
        return c2254941DNs.LIZ;
    }

    @Override // X.C1DJK
    public int LJI(Cert cert) {
        System.currentTimeMillis();
        this.LJJJJI = 0;
        this.LJJJJIZL = 0;
        this.LJJJJJ = 0;
        this.LJJJJJL = 0;
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZ("TECameraBase", "close...");
        return 0;
    }

    @Override // X.C1DJK
    public final Bundle LJIIJJI(String str) {
        return (Bundle) ((HashMap) this.LJIJJLI).get(str);
    }

    @Override // X.C1DJK
    public final void LJIJ(TECameraAlgorithmParam tECameraAlgorithmParam) {
        if (this.LJJIFFI == null) {
            TECameraAlgorithmInterface tECameraAlgorithmInterface = new TECameraAlgorithmInterface(this);
            this.LJJIFFI = tECameraAlgorithmInterface;
            tECameraAlgorithmInterface.init();
        }
        this.LJJIFFI.addCameraAlgorithm(tECameraAlgorithmParam);
    }

    @Override // X.C1DJK
    public final int LJIL(int i) {
        return LJIIZILJ();
    }

    @Override // X.C1DJK
    public final TECameraFrame LJJIIZ(TECameraFrame tECameraFrame) {
        TECameraAlgorithmInterface tECameraAlgorithmInterface = this.LJJIFFI;
        if (tECameraAlgorithmInterface != null) {
            return tECameraAlgorithmInterface.processAlgorithm(tECameraFrame);
        }
        return null;
    }

    @Override // X.C1DJK
    public final void LJJIJIIJI(C1305780k5I c1305780k5I) {
        this.LJIILJJIL = c1305780k5I;
    }

    @Override // X.C1DJK
    public final void LJJJJLL(int i) {
        TECameraAlgorithmInterface tECameraAlgorithmInterface = this.LJJIFFI;
        if (tECameraAlgorithmInterface != null) {
            tECameraAlgorithmInterface.removeCameraAlgorithm(i);
        }
    }

    @Override // X.C1DJK
    public final void LJJJJZI(boolean z) {
        synchronized (this.LJJIJ) {
            try {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("needRelease is ");
                sbLIZ.append(z);
                C2183341Ace.LIZLLL("TECameraBase", C2188811AlT.LIZIZ(sbLIZ));
                this.LJJIIZI = z;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C1DJK
    public final Cert LJJJLL(EnumC1270990jBB enumC1270990jBB) {
        HashMap<EnumC1270990jBB, Cert> map = this.LJJIL;
        if (map != null && !map.isEmpty() && this.LJJIL.containsKey(enumC1270990jBB)) {
            return this.LJJIL.get(enumC1270990jBB);
        }
        return null;
    }

    @Override // X.C1DJK
    public final void LJJL(int i) {
        int i2 = this.LIZIZ.LLILZ;
        if (i2 != 7) {
            this.LJJIIZ++;
        }
        if (i2 != 7) {
            if (!this.LJJIJIIJI) {
                this.LJJIJIIJI = true;
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LJJIJL;
                InterfaceC2254691DMt interfaceC2254691DMt = this.LIZLLL;
                if (interfaceC2254691DMt != null) {
                    interfaceC2254691DMt.LJ(3, (int) jCurrentTimeMillis, "Camera first frame captured");
                }
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Camera first frame captured，single camera, start preview cost time = ");
                sbLIZ.append(jCurrentTimeMillis);
                C2183341Ace.LIZLLL("TECameraBase", C2188811AlT.LIZIZ(sbLIZ));
                C1305710k5B.LIZ(jCurrentTimeMillis, "te_record_camera_preview_first_frame_cost");
                return;
            }
            if (i2 != 7) {
                return;
            }
        }
        if (i == 0) {
            if (this.LJJIJIIJIL) {
                return;
            } else {
                this.LJJIJIIJIL = true;
            }
        } else if (i != 1 || this.LJJIJIL) {
            return;
        } else {
            this.LJJIJIL = true;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - this.LJJIJL;
        InterfaceC2254691DMt interfaceC2254691DMt2 = this.LIZLLL;
        if (interfaceC2254691DMt2 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Camera first frame captured, multi camera, facing: ");
            sbLIZ2.append(i);
            interfaceC2254691DMt2.LJ(3, 0, C2188811AlT.LIZIZ(sbLIZ2));
        }
        int i4 = C2187451AjH.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Camera first frame captured，multi camera, facing = ");
        sbLIZ3.append(i);
        sbLIZ3.append(", start preview cost time = ");
        sbLIZ3.append(jCurrentTimeMillis2);
        C2183341Ace.LIZLLL("TECameraBase", C2188811AlT.LIZIZ(sbLIZ3));
        C1305710k5B.LIZ(jCurrentTimeMillis2, "te_record_camera_preview_first_frame_cost");
    }

    @Override // X.C1DJK
    public final void LJJZZI(C20188413z0 c20188413z0) {
        this.LJIJ = c20188413z0;
    }

    @Override // X.C1DJK
    public final void LJLI(C1DNM c1dnm) {
        if (this.LJI == null) {
            this.LJI = c1dnm;
        }
    }

    @Override // X.C1DJK
    public void LJLIL(int i) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scene mode: ");
        sbLIZ.append(i);
        C2183341Ace.LIZLLL("TECameraBase", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C1DJK
    public final void LJLJL(TECameraAlgorithmParam tECameraAlgorithmParam) {
        TECameraAlgorithmInterface tECameraAlgorithmInterface = this.LJJIFFI;
        if (tECameraAlgorithmInterface != null) {
            tECameraAlgorithmInterface.updateCameraAlgorithmParam(tECameraAlgorithmParam);
        }
    }

    @Override // X.C1DJK
    public final long LJLJLJ(boolean z) {
        long j = this.LJJII;
        this.LJJIIJZLJL = z;
        return j;
    }

    @Override // X.C1DJK
    public final float LJLL(boolean z) {
        C2254941DNs c2254941DNs;
        if (z) {
            c2254941DNs = this.LJJIJLIJ.LIZJ;
        } else {
            c2254941DNs = this.LJJIJLIJ.LIZIZ;
        }
        return c2254941DNs.LIZ();
    }

    @Override // X.C1DJK
    public final void LJLLILLLL(InterfaceC2186151AhB interfaceC2186151AhB) {
        this.LJIIZILJ = interfaceC2186151AhB;
    }

    @Override // X.C1DJK
    public final void LJLLLL(C1DJY c1djy) {
        this.LJIILLIIL = c1djy;
    }

    @Override // X.C1DJK
    public final float M4(boolean z) {
        C2254941DNs c2254941DNs;
        if (z) {
            c2254941DNs = this.LJJIJLIJ.LIZJ;
        } else {
            c2254941DNs = this.LJJIJLIJ.LIZIZ;
        }
        return c2254941DNs.LIZIZ;
    }

    @Override // X.C1DJK
    public final void setDeviceRotation(int i) {
        this.LJIIJ = i;
        this.LJIJJ.set(true);
    }

    @Override // X.C1DJK
    public int LJLLI(C1DJ6 c1dj6, Cert cert) {
        this.LJIIL = c1dj6.LLJJLIIIJLLLLLLLZ;
        System.currentTimeMillis();
        this.LJJIL = c1dj6.LLLLZLLLI;
        return 0;
    }

    public final void LJLZ(int i, String str) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkIfNeedCbCameraInfo type=");
        sbLIZ.append(i);
        sbLIZ.append(", msg=");
        sbLIZ.append(str);
        C2183341Ace.LIZ("TECameraBase", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZLLL.LJ(i, 0, str);
    }

    public AbstractC2254721DMw(Context context, InterfaceC2254691DMt interfaceC2254691DMt, Handler handler, C1DJO c1djo) {
        new HashMap();
        this.LJIL = null;
        this.LJJ = new JSONObject();
        this.LJJI = false;
        this.LJJIFFI = null;
        this.LJJII = 0L;
        this.LJJIII = 0;
        this.LJJIIJ = 0L;
        this.LJJIIJZLJL = false;
        this.LJJIIZ = 0;
        this.LJJIIZI = false;
        this.LJJIJ = new Object();
        this.LJJIJIIJI = false;
        this.LJJIJIIJIL = false;
        this.LJJIJIL = false;
        this.LJJIJL = 0L;
        C1305750k5F c1305750k5F = new C1305750k5F();
        this.LJJIJLIJ = c1305750k5F;
        this.LJJIL = null;
        this.LJJIZ = false;
        this.LJJJ = new Object();
        this.LJJJI = true;
        this.LJJJIL = false;
        this.LJJJJ = new Range<>(-1, -1);
        this.LJJJJI = 0;
        this.LJJJJIZL = 0;
        this.LJJJJJ = 0;
        this.LJJJJJL = 0;
        this.LJJJJL = false;
        this.LJJJJLI = new ARunnableS120S0100000_20(this, 79);
        C1DO1 c1do1 = new C1DO1(this);
        this.LJFF = context;
        this.LIZLLL = interfaceC2254691DMt;
        this.LJ = handler;
        this.LJIILIIL = c1djo;
        c1305750k5F.LIZ.LJII = c1do1;
    }
}
