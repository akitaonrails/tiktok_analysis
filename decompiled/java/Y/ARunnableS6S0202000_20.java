package Y;

import X.C1271330jBj;
import X.C1272880jEE;
import X.C1289620jfE;
import X.C1298340jtI;
import X.C1312310kFp;
import X.C1312410kFz;
import X.C1C7U;
import X.C1DX7;
import X.C2188811AlT;
import X.C2257191DWj;
import X.SurfaceHolderCallbackC1272890jEF;
import android.graphics.SurfaceTexture;
import android.util.AndroidRuntimeException;
import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.core.JSProxy;
import com.ss.ttlivestreamer.core.opengl.GLSurface;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS6S0202000_20 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String strLIZIZ;
        SurfaceHolderCallbackC1272890jEF surfaceHolderCallbackC1272890jEF = (SurfaceHolderCallbackC1272890jEF) this.l1;
        int i = this.i2;
        int i2 = this.i3;
        Surface surface = (Surface) this.l0;
        surfaceHolderCallbackC1272890jEF.LLJJI = i;
        surfaceHolderCallbackC1272890jEF.LLJJ = i2;
        GLSurface gLSurface = surfaceHolderCallbackC1272890jEF.LLILZ;
        if (gLSurface != null) {
            int iNativeQuerySurfaceWidth = gLSurface.nativeQuerySurfaceWidth();
            int iNativeQuerySurfaceHeight = surfaceHolderCallbackC1272890jEF.LLILZ.nativeQuerySurfaceHeight();
            if (iNativeQuerySurfaceWidth != i || iNativeQuerySurfaceHeight != i2) {
                surfaceHolderCallbackC1272890jEF.LLILZ.surfaceDestroy();
                surfaceHolderCallbackC1272890jEF.LLILZ.release();
                surfaceHolderCallbackC1272890jEF.LLILZ = null;
                GLSurface gLSurface2 = new GLSurface();
                surfaceHolderCallbackC1272890jEF.LLILZ = gLSurface2;
                gLSurface2.nativeSurfaceCreate(i, i2, surface);
                surfaceHolderCallbackC1272890jEF.LLILZ.nativeMakeCurrent();
            }
            surfaceHolderCallbackC1272890jEF.LLILZ.nativeSurfaceChanged(i, i2, 0);
        }
        C1272880jEE c1272880jEE = surfaceHolderCallbackC1272890jEF.LLILZIL;
        if (c1272880jEE != null) {
            c1272880jEE.LJLL(i, i2);
        }
        if (surfaceHolderCallbackC1272890jEF.LLJJJJLIIL) {
            surfaceHolderCallbackC1272890jEF.LLJL = false;
        }
        if (surfaceHolderCallbackC1272890jEF.LLLFZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isSelfSideRender:");
            sbLIZ.append(surfaceHolderCallbackC1272890jEF.LLJLLL);
            sbLIZ.append(" onSurfaceChanged mUIViewSizeChanged:");
            sbLIZ.append(surfaceHolderCallbackC1272890jEF.LLJJL);
            sbLIZ.append(" frameSizeChanged:");
            sbLIZ.append(surfaceHolderCallbackC1272890jEF.LLJJLIIIJLLLLLLLZ);
            sbLIZ.append(" surfaceSizeChanged:");
            sbLIZ.append(surfaceHolderCallbackC1272890jEF.LLJL);
            sbLIZ.append("\n frameWidth:");
            sbLIZ.append(surfaceHolderCallbackC1272890jEF.LLJJIII);
            sbLIZ.append(" frameHeight:");
            sbLIZ.append(surfaceHolderCallbackC1272890jEF.LLJJIJI);
            if (surfaceHolderCallbackC1272890jEF.LLL || surfaceHolderCallbackC1272890jEF.LLILZ == null) {
                strLIZIZ = "";
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("\n nativWidth:");
                sbLIZ2.append(surfaceHolderCallbackC1272890jEF.LLILZ.nativeQuerySurfaceWidth());
                sbLIZ2.append(" nativHeight:");
                sbLIZ2.append(surfaceHolderCallbackC1272890jEF.LLILZ.nativeQuerySurfaceHeight());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            sbLIZ.append(strLIZIZ);
            sbLIZ.append("\n surfaWidth:");
            sbLIZ.append(surfaceHolderCallbackC1272890jEF.LLJJI);
            sbLIZ.append(" surfaHeight:");
            sbLIZ.append(surfaceHolderCallbackC1272890jEF.LLJJ);
            sbLIZ.append("\n viewuWidth:");
            sbLIZ.append(surfaceHolderCallbackC1272890jEF.LLJILLL);
            sbLIZ.append(" viewuHeight:");
            sbLIZ.append(surfaceHolderCallbackC1272890jEF.LLJILJILJ);
            sbLIZ.append("");
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public final void LIZ$1() {
        try {
            float f = ((C1312310kFp) this.l1).LIZLLL.LIZJ.LLJILJILJ.mFontSize;
            C1DX7 c1dx7 = new C1DX7(f, f);
            c1dx7.LIZ(this.i2, this.i3);
            C1289620jfE.LIZJ(new ARunnableS89S0200000_20(this, new C1312410kFz((C2257191DWj) this.l0, c1dx7, ((C1312310kFp) this.l1).LJIJ), 131));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("renderLegacySVG failed: ");
            sbLIZ.append(e.getMessage());
            LynxLog.e("lynx_SVGRenderer", C2188811AlT.LIZIZ(sbLIZ));
            C1289620jfE.LIZJ(new ARunnableS120S0100000_20(this, 207));
        }
    }

    public final void LIZ$2() {
        try {
            C1271330jBj c1271330jBj = (C1271330jBj) this.l1;
            if (c1271330jBj.LJ == 0) {
                c1271330jBj.LJ = GlUtil.generateTexture(36197);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("createSurface generateTexture ");
                sbLIZ.append(((C1271330jBj) this.l1).LJ);
                AVLog.logKibana(4, "SurfaceWrapper", C2188811AlT.LIZIZ(sbLIZ), null);
            }
            C1271330jBj c1271330jBj2 = (C1271330jBj) this.l1;
            c1271330jBj2.LJFF = this.i2;
            c1271330jBj2.LJI = this.i3;
            ((SurfaceTexture[]) this.l0)[0] = new SurfaceTexture(((C1271330jBj) this.l1).LJ);
            ((SurfaceTexture[]) this.l0)[0].setDefaultBufferSize(this.i2, this.i3);
            ((SurfaceTexture[]) this.l0)[0].setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: X.0jBk
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                    float[] fArr;
                    C1271330jBj c1271330jBj3;
                    int i;
                    int i2;
                    synchronized (((C1271330jBj) this.LL.l1).LJII) {
                        try {
                            if (((C1271330jBj) this.LL.l1).LJIIIIZZ) {
                                return;
                            }
                            try {
                                surfaceTexture.updateTexImage();
                                fArr = new float[16];
                                surfaceTexture.getTransformMatrix(fArr);
                                surfaceTexture.getTimestamp();
                                c1271330jBj3 = (C1271330jBj) this.LL.l1;
                                i = c1271330jBj3.LJFF;
                                i2 = c1271330jBj3.LJI;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            if (i >= 1 && i2 >= 1) {
                                InterfaceC1271380jBo interfaceC1271380jBo = c1271330jBj3.LIZLLL;
                                if (interfaceC1271380jBo != null) {
                                    ((C1271290jBf) interfaceC1271380jBo).LIZ(c1271330jBj3.LJ, i, i2, fArr);
                                }
                                return;
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Bad Params,width=");
                            sbLIZ2.append(i);
                            sbLIZ2.append(",height=");
                            sbLIZ2.append(i2);
                            C1274080jGA.LIZ.LIZ("SurfaceWrapper.getSurface", new AndroidRuntimeException(C2188811AlT.LIZIZ(sbLIZ2)));
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            });
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void run$0(ARunnableS6S0202000_20 aRunnableS6S0202000_20) {
        boolean zLIZ;
        C1C7U.LIZ("GLRenderVideoSink@a139.surfaceChanged$1");
        try {
            aRunnableS6S0202000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GLRenderVideoSink@a139.surfaceChanged$1");
    }

    public static final void run$1(ARunnableS6S0202000_20 aRunnableS6S0202000_20) {
        boolean zLIZ;
        C1C7U.LIZ("SVGRenderer@6976.renderLegacySVG$1");
        try {
            aRunnableS6S0202000_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SVGRenderer@6976.renderLegacySVG$1");
    }

    public static final void run$2(ARunnableS6S0202000_20 aRunnableS6S0202000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LynxIntersectionObserverManager@1299.callIntersectionObserver$1");
        try {
            JSProxy jSProxy = ((C1298340jtI) aRunnableS6S0202000_20.l1).LJJ.get();
            if (jSProxy != null) {
                jSProxy.LIZJ(aRunnableS6S0202000_20.i2, aRunnableS6S0202000_20.i3, (JavaOnlyMap) aRunnableS6S0202000_20.l0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxIntersectionObserverManager@1299.callIntersectionObserver$1");
    }

    public static final void run$3(ARunnableS6S0202000_20 aRunnableS6S0202000_20) {
        boolean zLIZ;
        C1C7U.LIZ("SurfaceWrapper@1798.createSurface$1");
        try {
            aRunnableS6S0202000_20.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SurfaceWrapper@1798.createSurface$1");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:18:0x0066
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static final void run$4(Y.ARunnableS6S0202000_20 r8) throws java.lang.Throwable {
        /*
            java.lang.Object r6 = r8.l0
            X.16Fd r6 = (X.C20743516Fd) r6
            java.lang.Object r3 = r8.l1
            android.content.Context r3 = (android.content.Context) r3
            int r2 = r8.i2
            int r1 = r8.i3
            r6.getClass()
            java.lang.String r8 = "LiveIconDrawable@ed24.asyncCreateShadowBitmap$1L"
            X.C1C7U.LIZ(r8)
            r4 = 0
            if (r3 == 0) goto L76
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ALPHA_8
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r7)
            android.graphics.drawable.Drawable r0 = r6.LL
            if (r0 == 0) goto L29
            r0.draw(r1)
        L29:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8
            r0 = 1
            android.graphics.Bitmap r1 = r7.copy(r1, r0)
            float r5 = r6.LLJIJIL
            android.renderscript.RenderScript r4 = android.renderscript.RenderScript.create(r3)     // Catch: java.lang.Throwable -> L66
            android.renderscript.Element r0 = android.renderscript.Element.U8(r4)     // Catch: java.lang.Throwable -> L64
            android.renderscript.ScriptIntrinsicBlur r3 = android.renderscript.ScriptIntrinsicBlur.create(r4, r0)     // Catch: java.lang.Throwable -> L64
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createFromBitmap(r4, r1)     // Catch: java.lang.Throwable -> L64
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r4, r7)     // Catch: java.lang.Throwable -> L64
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L4f
            r5 = 981668463(0x3a83126f, float:0.001)
            goto L57
        L4f:
            r0 = 1103626240(0x41c80000, float:25.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L57
            r5 = 1103626240(0x41c80000, float:25.0)
        L57:
            r3.setRadius(r5)     // Catch: java.lang.Throwable -> L64
            r3.setInput(r2)     // Catch: java.lang.Throwable -> L64
            r3.forEach(r1)     // Catch: java.lang.Throwable -> L64
            r1.copyTo(r7)     // Catch: java.lang.Throwable -> L64
            goto L70
        L64:
            r0 = move-exception
            goto L67
        L66:
            r0 = move-exception
        L67:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L66
            if (r4 == 0) goto L6f
            r4.destroy()
        L6f:
            throw r0
        L70:
            if (r4 == 0) goto L75
            r4.destroy()
        L75:
            r4 = r7
        L76:
            r6.LLJILLL = r4
            r0 = 2
            r6.LLJJJJLIIL = r0
            boolean r0 = r6.LLJJJJJIL
            if (r0 == 0) goto L86
            com.bytedance.bpea.transmit.delegate.BPEAHandler r1 = r6.LLJJJJ
            Y.ARunnableS106S0100000_6 r0 = r6.LLJL
            X.C786410Ut5.LJL(r1, r0)
        L86:
            X.C1C7U.LIZIZ(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS6S0202000_20.run$4(Y.ARunnableS6S0202000_20):void");
    }

    public ARunnableS6S0202000_20(C1271330jBj c1271330jBj, SurfaceTexture[] surfaceTextureArr, int i) {
        this.$t = i;
        this.l1 = c1271330jBj;
        this.i2 = 480;
        this.i3 = 480;
        this.l0 = surfaceTextureArr;
    }

    public ARunnableS6S0202000_20(Object obj, int i, int i2, Object obj2, int i3) {
        this.$t = i3;
        this.l1 = obj;
        this.i2 = i;
        this.i3 = i2;
        this.l0 = obj2;
    }
}
