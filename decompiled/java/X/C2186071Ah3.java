package X;

import Y.ARunnableS133S0100000_33;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.HandlerThread;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VESize;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.1Ah3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2186071Ah3 extends AbstractC2186081Ah4 implements C1DIC {
    public VECameraSettings LLILLL;
    public HandlerThread LLILZLL;
    public BPEAHandler LLIZ;
    public byte[] LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public InterfaceC2186091Ah5 LLJIJIL;
    public VESize LLILZ = new VESize(1280, 720);
    public int LLILZIL = 0;
    public final Object LLJILJIL = new Object();
    public boolean LLJILJILJ = false;

    @Override // X.C1DIC
    public final int LIZ() {
        return 0;
    }

    @Override // X.C1DIC
    public final void LJI(C1DIP c1dip) {
    }

    public final synchronized int LJII() {
        if (this.LLILLJJLI) {
            C2484209oO.LJI("VEMockCapture", "capture already started");
            return -2;
        }
        C2484209oO.LJI("VEMockCapture", "startCapture");
        if (this.LLILZLL == null) {
            HandlerThread handlerThread = new HandlerThread("VEMockCapture");
            this.LLILZLL = handlerThread;
            handlerThread.start();
            this.LLIZ = new BPEAHandler(C786410Ut5.W2(this.LLILZLL));
        }
        this.LLILLJJLI = true;
        C786410Ut5.LJJZZIII(this.LLIZ, new ARunnableS133S0100000_33(this, 80));
        return 0;
    }

    @Override // X.C1DIC
    public final C2185991Agv LJIIIIZZ(VESize vESize, boolean z) {
        return null;
    }

    @Override // X.C1DIC
    public final float[] LJIIIZ(InterfaceC2186211AhH interfaceC2186211AhH) {
        return new float[0];
    }

    @Override // X.InterfaceC2185971Agt
    public final VESize LJIIJ() {
        return null;
    }

    @Override // X.InterfaceC2185971Agt
    public final void LJIIJJI(int i) {
    }

    public final synchronized void LJIILJJIL() {
        C2484209oO.LJI("VEMockCapture", "stopCapture");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopCapture, isCapturing = ");
        sbLIZ.append(this.LLILLJJLI);
        C2484209oO.LJI("TEVideoCaptureBase", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI = false;
        this.LLILLJJLI = false;
        BPEAHandler bPEAHandler = this.LLIZ;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacks(new ARunnableS133S0100000_33(this, 80));
            this.LLIZ = null;
        }
        HandlerThread handlerThread = this.LLILZLL;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.LLILZLL = null;
        }
    }

    @Override // X.InterfaceC2185971Agt
    public final void LJIILL(int i, int i2) {
    }

    @Override // X.InterfaceC2185971Agt
    public final void LJIILLIIL(boolean z) {
    }

    @Override // X.C1DIC
    public final void Q3() {
    }

    @Override // X.C1DIC
    public final long S3() {
        return 0L;
    }

    @Override // X.InterfaceC2185971Agt
    public final VECameraSettings LIZIZ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC2185971Agt
    public final VESize N2() {
        return this.LLILZ;
    }

    public static void LIZJ(C2186071Ah3 c2186071Ah3) {
        TECameraFrame tECameraFrame;
        C1C7U.LIZ("VEMockCapture@3033.stopCapture$1L");
        synchronized (c2186071Ah3) {
            if (c2186071Ah3.LLILLJJLI) {
                C786410Ut5.LJLIIL(LSPassThroughRecordSizeConfig.DEFAULT / c2186071Ah3.LLILZIL, c2186071Ah3.LLIZ, new ARunnableS133S0100000_33(c2186071Ah3, 80));
            }
            synchronized (c2186071Ah3.LLJILJIL) {
                try {
                    c2186071Ah3.LLJILJILJ = true;
                    c2186071Ah3.LLJILJIL.notify();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            for (int i = 0; i < c2186071Ah3.LL.LIZJ().size(); i++) {
                C2185991Agv c2185991Agv = (C2185991Agv) ListProtector.get(c2186071Ah3.LL.LIZJ(), i);
                if (c2185991Agv instanceof C2186001Agw) {
                    int i2 = ((C2186001Agw) c2185991Agv).LJIIJ;
                    InterfaceC1283630jVZ interfaceC1283630jVZ = c2185991Agv.LIZJ;
                    if (interfaceC1283630jVZ != null) {
                        if (c2186071Ah3.LLIZLLLIL != null) {
                            tECameraFrame = new TECameraFrame(c2186071Ah3.LLJI, c2186071Ah3.LLJ, System.nanoTime());
                            tECameraFrame.setDependSurfaceTimestamp(false);
                            tECameraFrame.setEnableMatchFrameHandleFps(true);
                            tECameraFrame.initBufferFrame(c2186071Ah3.LLIZLLLIL, 0, TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_ARGB8, 0);
                        } else {
                            VESize vESize = c2186071Ah3.LLILZ;
                            tECameraFrame = new TECameraFrame(vESize.width, vESize.height, System.nanoTime());
                            tECameraFrame.setDependSurfaceTimestamp(false);
                            tECameraFrame.setEnableMatchFrameHandleFps(true);
                            tECameraFrame.initTextureFrame(i2, 0, null, TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES, 0);
                        }
                        interfaceC1283630jVZ.LIZIZ(tECameraFrame);
                    }
                }
            }
        }
        C1C7U.LIZIZ("VEMockCapture@3033.stopCapture$1L");
    }

    public final void LIZLLL(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
        if (bitmapDecodeFile == null) {
            C2484209oO.LIZJ("VEMockCapture", "bitmap is null!!!");
            return;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmapDecodeFile.getByteCount());
        bitmapDecodeFile.copyPixelsToBuffer(byteBufferAllocate);
        this.LLIZLLLIL = byteBufferAllocate.array();
        this.LLJ = options.outHeight;
        this.LLJI = options.outWidth;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setImage width is ");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(" , height is ");
        sbLIZ.append(this.LLJ);
        C2484209oO.LIZ("VEMockCapture", C2188811AlT.LIZIZ(sbLIZ));
        bitmapDecodeFile.recycle();
        BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeFile);
    }

    @Override // X.C1DIC
    public final int LJ(Cert cert) {
        LJII();
        synchronized (this.LLJILJIL) {
            while (!this.LLJILJILJ) {
                try {
                    try {
                        this.LLJILJIL.wait(1000L);
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return -1;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        InterfaceC2186091Ah5 interfaceC2186091Ah5 = this.LLJIJIL;
        if (interfaceC2186091Ah5 != null) {
            interfaceC2186091Ah5.LIZIZ();
            this.LLJIJIL.onInfo(2, VECameraSettings.CAMERA_TYPE.TYPE2.ordinal(), "Camera type: 2");
            return 0;
        }
        return 0;
    }

    @Override // X.C1DIC
    public final void LJFF(C1DIE c1die) {
        this.LLJIJIL = c1die;
    }

    @Override // X.InterfaceC2185971Agt
    public final int LJIILIIL(C1664350tPd<C2185991Agv> c1664350tPd) {
        synchronized (this) {
            try {
                this.LL.LIZIZ();
                for (int i = 0; i < c1664350tPd.LIZJ().size(); i++) {
                    this.LL.LIZ(c1664350tPd.LIZJ().get(i));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start with pipelines ");
        sbLIZ.append(c1664350tPd.LIZJ().size());
        C2484209oO.LJI("VEMockCapture", C2188811AlT.LIZIZ(sbLIZ));
        return LJII();
    }

    @Override // X.C1DIC
    public final void LJIIL(Context context, VECameraSettings vECameraSettings) {
        this.LLILLL = vECameraSettings;
        this.LLILZ = vECameraSettings.getPreviewSize();
        this.LLILZIL = Math.min(this.LLILLL.getFps(), 60);
    }
}
