package X;

import Y.AComparatorS517S0100000_20;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS12S0400000_3;
import Y.ARunnableS1S0204000_20;
import Y.ARunnableS26S0201000_20;
import Y.ARunnableS7S0102000_20;
import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.core.utils.VideoFrameStatics;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.CaptureBase;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.TTLHABSettingsConfigs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jAZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1270610jAZ extends C1270350jA9 implements C1DJP, C1DJX, InterfaceC1271000jBC, InterfaceC1268690j7T {
    public static final Map<String, Bundle> y = new HashMap();
    public int LLJJIJIIJIL;
    public Context LLJJIJIL;
    public final int LLJJJ;
    public final TECameraCapture LLJJJIL;
    public C1DJ6 LLJJJJ;
    public C1DJM LLJJJJJIL;
    public final InterfaceC1270200j9u LLJJJJLIIL;
    public SurfaceTexture LLJJL;
    public C1269390j8b LLJJLIIIJLLLLLLLZ;
    public final Handler LLJL;
    public final BPEAHandler LLJLIL;
    public int LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public int LLJLLL;
    public int LLJZ;
    public long LLJZIJLIL;
    public boolean LLL;
    public final float[] LLLF;
    public final Object LLLFF;
    public final C1270800jAs LLLFFI;
    public long LLLFZ;
    public final boolean LLLI;
    public C1271390jBp LLLII;
    public C1271390jBp LLLIIII;
    public GlRenderDrawer LLLIIIIL;
    public volatile boolean LLLIIIL;
    public final Handler LLLIIL;
    public GLThread LLLIILIL;
    public final Bundle LLLIL;
    public final boolean LLLILZ;
    public int LLLILZJ;
    public final int LLLILZLLLI;
    public final int LLLIZZ;
    public int LLLJ;
    public int LLLJIL;
    public final boolean LLLJL;
    public final boolean LLLL;
    public final boolean LLLLII;
    public boolean LLLLIIIILLL;
    public boolean LLLLIIL;
    public VideoFrameStatics LLLLIILL;
    public int LLLLIILLL;
    public final int LLLLIL;
    public final boolean LLLLILI;
    public final boolean LLLLJ;
    public final int LLLLJI;
    public final boolean LLLLL;
    public volatile int LLLLLIL;
    public volatile int LLLLLILLIL;
    public int LLLLLJIL;
    public long LLLLLJLJLL;
    public JSONObject LLLLLL;
    public final String LLLLLLIL;
    public volatile int LLLLLLJ;
    public C1271390jBp LLLLLLL;
    public final Handler LLLLLLLLL;
    public GlRenderDrawer LLLLLLLLLL;
    public C1271390jBp LLLLLLLZIL;
    public C1271390jBp LLLLLLZ;
    public boolean LLLLLLZZ;
    public boolean LLLLLZ;
    public final boolean LLLLLZIL;
    public C1270840jAw LLLLLZL;
    public final boolean LLLLZ;
    public final C1270330jA7 LLLLZI;
    public final C1270440jAI LLLLZIL;
    public final C1270440jAI LLLLZLL;
    public final C1270440jAI LLLLZLLIL;
    public final C1270430jAH LLLLZLLLI;
    public final C1270420jAG LLLZ;
    public final boolean LLLZI;
    public final C1269940j9U LLLZIIL;
    public int LLLZIL;
    public int LLLZL;
    public int LLLZLL;
    public String LLLZLZ;
    public boolean LLLZZ;
    public UUID LLLZZIL;
    public InterfaceC1270850jAx LLZ;
    public GlRenderDrawer LLZIL;
    public final int LLZILL;
    public final int LLZL;
    public final int LLZLI;
    public final int LLZLL;
    public final boolean LLZLLIL;
    public final boolean LLZLLLL;
    public final boolean LLZZ;
    public TECameraFrame LLZZJLIL;
    public C1270960jB8 LLZZLLIL;
    public C1270780jAq LLZZZIL;
    public boolean LLZZZZ;
    public long a;
    public long b;
    public double c;
    public List<TEFrameSizei> d;
    public long e;
    public long f;
    public final boolean g;
    public C1270720jAk h;
    public final AtomicBoolean i;
    public final AtomicBoolean j;
    public final AtomicInteger k;
    public String l;
    public final C1267500j5Y m;
    public boolean n;
    public final C1270590jAX o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public volatile boolean t;
    public TECameraFrame u;
    public long v;
    public TECameraFrame w;
    public long x;

    @Override // X.InterfaceC1268690j7T
    public final int LJJIJIIJIL() {
        final int[] iArr = {0, 0};
        final Object obj = new Object();
        TECameraCapture tECameraCapture = this.LLJJJIL;
        if (tECameraCapture != null) {
            int iQueryZoomAbility = tECameraCapture.queryZoomAbility(new InterfaceC2254701DMu() { // from class: X.0jB1
                public final /* synthetic */ boolean LL = true;

                @Override // X.InterfaceC2254701DMu
                public final boolean LJII() {
                    return this.LL;
                }

                @Override // X.InterfaceC2254701DMu
                public final void LIZLLL(float f, int i, boolean z) {
                    if (AVLog.enableLogToIODevice2()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("queryZoomAbility: cameraType ");
                        sbLIZ.append(i);
                        sbLIZ.append(", zoomValue ");
                        sbLIZ.append(f);
                        sbLIZ.append(", stopped ");
                        sbLIZ.append(z);
                        AVLog.logToIODevice2(4, "CameraVideoCapturer", C2188811AlT.LIZIZ(sbLIZ), null, 31, 10000);
                    }
                }

                @Override // X.InterfaceC2254701DMu
                public final void LIZJ(int i, boolean z, boolean z2, float f, List<Integer> list) {
                    String str;
                    String str2;
                    try {
                        synchronized (obj) {
                            try {
                                if (AVLog.enableLogToIODevice2()) {
                                    String strLIZIZ = "";
                                    Iterator<Integer> it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        int iIntValue = it2.next().intValue();
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append(strLIZIZ);
                                        if (strLIZIZ.isEmpty()) {
                                            str2 = e3.e;
                                        } else {
                                            str2 = ", ";
                                        }
                                        sbLIZ.append(str2);
                                        sbLIZ.append(iIntValue);
                                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                    }
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(strLIZIZ);
                                    if (strLIZIZ.isEmpty()) {
                                        str = "";
                                    } else {
                                        str = e3.f;
                                    }
                                    sbLIZ2.append(str);
                                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("queryZoomAbility: cameraType ");
                                    sbLIZ3.append(i);
                                    sbLIZ3.append(", supportZoom ");
                                    sbLIZ3.append(z);
                                    sbLIZ3.append(", supportSmooth ");
                                    sbLIZ3.append(z2);
                                    sbLIZ3.append(", maxZoom ");
                                    sbLIZ3.append(f);
                                    sbLIZ3.append(", ratios ");
                                    sbLIZ3.append(strLIZIZ2);
                                    AVLog.logToIODevice2(4, "CameraVideoCapturer", C2188811AlT.LIZIZ(sbLIZ3), null, 20, 10000);
                                }
                                iArr[1] = (int) f;
                                obj.notifyAll();
                            } finally {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    } catch (Exception th) {
                    }
                }
            }, true);
            iArr[0] = iQueryZoomAbility;
            if (iQueryZoomAbility != 0) {
                return -Math.abs(iQueryZoomAbility);
            }
            try {
                synchronized (obj) {
                    try {
                        obj.wait(500L);
                        if (iArr[1] == 0 && AVLog.enableLogToIODevice2()) {
                            AVLog.logToIODevice2(4, "CameraVideoCapturer", "queryZoomAbility: query timeout", null, 66, 10000);
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Exception th) {
            }
        }
        return iArr[1];
    }

    @Override // X.C1DJX
    public final void LJLLILLLL(SurfaceTexture surfaceTexture) {
    }

    @Override // X.InterfaceC1268690j7T
    public final int LL() {
        return 0;
    }

    @Override // X.C1270350jA9
    public final void LLJILLL() {
        this.LLJJLIIIJLLLLLLLZ.LIZ();
        this.LLJJ = true;
        if (this.LLJ == 1 && this.LLJLL) {
            LLJLILLLLZIIL(this.f, Math.max(TimeUtils.currentTimeMs(), this.LLLLLJLJLL), this.v, false);
        }
    }

    @Override // X.C1270350jA9, com.ss.ttlivestreamer.core.engine.NativeObject
    public final synchronized void release() {
        C1270590jAX c1270590jAX = this.o;
        if (c1270590jAX != null && c1270590jAX.LLILLJJLI == this) {
            c1270590jAX.LLILLJJLI = null;
        }
        this.m.LIZ.ttlhABSettingsConfigs.getClass();
        if (TTLHABSettingsConfigs.LJI.getEnableMemoryLeakOpt()) {
            TECameraCapture.registerLogOutput((byte) 5, null);
        }
        if (this.LLJL != null) {
            stop();
            Handler handler = this.LLLLLLLLL;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 428));
            }
            C786410Ut5.LJJZZIII(this.LLJL, new ARunnableS120S0100000_20(this, 429));
        }
        TECameraCapture tECameraCapture = this.LLJJJIL;
        if (tECameraCapture != null) {
            TECameraCapture.registerMonitor(tECameraCapture, null);
        }
        this.LLJJIJIL = null;
        this.LLLLIILL = null;
        super.release();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[Catch: all -> 0x0096, TryCatch #1 {all -> 0x0096, blocks: (B:19:0x0050, B:21:0x0056, B:23:0x0063, B:25:0x006b, B:22:0x005d), top: B:44:0x0050, outer: #2 }] */
    @Override // X.C1270350jA9, X.AbstractC1268600j7K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void stop() {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1270610jAZ.stop():void");
    }

    @Override // X.InterfaceC1268690j7T
    public final C1270830jAv LJIIJJI() {
        C1286570jaJ cameraECInfo;
        TECameraCapture tECameraCapture = this.LLJJJIL;
        if (tECameraCapture == null || (cameraECInfo = tECameraCapture.getCameraECInfo()) == null) {
            return null;
        }
        C1270830jAv c1270830jAv = new C1270830jAv();
        c1270830jAv.LIZ = cameraECInfo.LIZ;
        c1270830jAv.LIZIZ = cameraECInfo.LIZJ;
        return c1270830jAv;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0090 A[Catch: Exception -> 0x010f, all -> 0x0117, TryCatch #0 {Exception -> 0x010f, blocks: (B:7:0x000e, B:9:0x001b, B:10:0x002b, B:18:0x004b, B:19:0x0052, B:32:0x00df, B:34:0x00e8, B:35:0x00f0, B:37:0x00f6, B:39:0x0101, B:40:0x0105, B:31:0x00d8, B:26:0x0090, B:28:0x0098, B:29:0x009a, B:30:0x00d1, B:17:0x0043, B:13:0x0030), top: B:51:0x000e, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e8 A[Catch: Exception -> 0x010f, all -> 0x0117, TryCatch #0 {Exception -> 0x010f, blocks: (B:7:0x000e, B:9:0x001b, B:10:0x002b, B:18:0x004b, B:19:0x0052, B:32:0x00df, B:34:0x00e8, B:35:0x00f0, B:37:0x00f6, B:39:0x0101, B:40:0x0105, B:31:0x00d8, B:26:0x0090, B:28:0x0098, B:29:0x009a, B:30:0x00d1, B:17:0x0043, B:13:0x0030), top: B:51:0x000e, outer: #1 }] */
    @Override // X.InterfaceC1268690j7T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LJJLIIIJ() {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1270610jAZ.LJJLIIIJ():org.json.JSONObject");
    }

    @Override // X.InterfaceC1268690j7T
    public final C1269830j9J LLFFF() {
        return new C1269830j9J(!LLJJLIIIJLLLLLLLZ() ? -1 : this.LLLZIL, this.LLLZL, this.LLLZLL, this.LLLZLZ);
    }

    @Override // X.InterfaceC1268690j7T
    public final boolean LLIFFJFJJ() {
        return this.LLLILZJ != 1;
    }

    @Override // X.AbstractC1268600j7K
    public final float LLIZLLLIL() {
        VideoFrameStatics videoFrameStatics = this.LLLLIILL;
        if (videoFrameStatics != null) {
            return videoFrameStatics.getRealRatePerSecond();
        }
        return 0.0f;
    }

    public final void LLJJIJI() {
        String str = this.LLLLLLIL;
        if (str == null || !(str.equals("linear_mipmap_linear") || this.LLLLLLIL.equals("linear_mipmap_nearest") || this.LLLLLLIL.equals("nearest_mipmap_nearest") || this.LLLLLLIL.equals("nearest_mipmap_linear"))) {
            this.LLLLLLJ = 0;
            return;
        }
        if (this.LLILZLL <= 0 || this.LLIZ <= 0 || this.LLLLLIL <= 0 || this.LLLLLILLIL <= 0) {
            this.LLLLLLJ = -1;
        } else {
            this.LLLLLLJ = (this.LLILZLL <= (this.LLLLLIL << 1) || this.LLIZ <= (this.LLLLLILLIL << 1)) ? -2 : 1;
        }
    }

    public final boolean LLJJJJ() {
        return this.LLLLLLLLL != null;
    }

    public final boolean LLJJLIIIJLLLLLLLZ() {
        return this.m.LIZIZ.LJJJJLL == 1;
    }

    public final void LLJLIL() {
        try {
            this.LLJJLIIIJLLLLLLLZ.LIZ();
            LLJJL();
            AVLog.ioi("CameraVideoCapturer", "switchCamera");
            if (this.LLJJJIL == null) {
                this.LLJJJJLIIL.LJI(-205, new Exception("Capture already release"));
                return;
            }
            if (this.LLJ != 1) {
                if (C1270690jAh.LIZ(EnumC1270750jAn.REPORT_TRACE, 1)) {
                    C1270690jAh.LIZJ(1, "CameraVideoCapturer", "Camera no ready.");
                    return;
                }
                return;
            }
            boolean z = this.LLJLILLLLZIIL != 1;
            this.LLLLIILLL = this.LLLLIILLL != 0 ? 1 : 0;
            if (z) {
                this.LLLLIILLL = -101;
            }
            if (!LLIFFJFJJ()) {
                this.LLLLIILLL = -100;
            }
            this.LLJLILLLLZIIL = z ? 1 : this.LLLLIILLL == 1 ? 2 : 0;
            LLJJIII(false);
            C1269500j8m.LJI(this.LLJJJIL, this.LLJLILLLLZIIL);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C786410Ut5.LJJZZIII(this.LLJL, new ARunnableS103S0100000_3(this, 158));
        }
    }

    public final void LLJLLL() {
        WindowManager windowManager;
        Context context = this.LLJJIJIL;
        if (context == null || (windowManager = (WindowManager) C786410Ut5.H2(context, "window")) == null) {
            return;
        }
        this.LLJZ = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEd7IWV43QAGQdGXVEhh91RAp2lK4EDHBvFmo/rwPIuZwS1+MJb5q4fUhXnPywr0Dq6JMTHizCqk=", null)).getRotation();
    }

    @Override // X.InterfaceC1268690j7T
    public final int M3() {
        TECameraCapture tECameraCapture = this.LLJJJIL;
        if (tECameraCapture != null) {
            return tECameraCapture.getCameraState();
        }
        return -1;
    }

    @Override // X.InterfaceC1268690j7T
    public final float LLILL() {
        return LLIZLLLIL();
    }

    public final void LLJJL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resetCameraState mCameraSizeOptEnable:");
        sbLIZ.append(this.LLLILZ);
        AVLog.logKibana(4, "CameraVideoCapturer", C2188811AlT.LIZIZ(sbLIZ), null);
        if (this.LLLILZ) {
            this.h = null;
            this.i.set(false);
            this.d = null;
        }
    }

    @Override // X.InterfaceC1268690j7T
    public final double LJIJ() {
        return this.c;
    }

    @Override // X.InterfaceC1268690j7T
    public final int LJIL() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1268690j7T
    public final String LJJIJ() {
        return this.l;
    }

    @Override // X.InterfaceC1268690j7T
    public final int LJJJJ() {
        return this.s;
    }

    @Override // X.InterfaceC1268690j7T
    public final int LJJL() {
        return this.r;
    }

    @Override // X.InterfaceC1268690j7T
    public final long LLFF() {
        return this.b;
    }

    @Override // X.InterfaceC1268690j7T
    public final long LLIL() {
        return this.a;
    }

    @Override // X.InterfaceC1268690j7T
    public final long LLILZ() {
        return this.e;
    }

    @Override // X.AbstractC1268600j7K
    public final int LLIZ() {
        return this.LLJJIJIIJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02bf  */
    @Override // X.C1DJX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(final com.ss.android.ttvecamera.TECameraFrame r25) {
        /*
            Method dump skipped, instruction units count: 747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1270610jAZ.LIZIZ(com.ss.android.ttvecamera.TECameraFrame):void");
    }

    @Override // X.InterfaceC1268690j7T
    public final int LJIIIZ(float f) {
        TECameraCapture tECameraCapture;
        int[] iArr = {-1};
        C1270830jAv c1270830jAvLJIIJJI = LJIIJJI();
        if (c1270830jAvLJIIJJI != null && ((f <= c1270830jAvLJIIJJI.LIZ || f >= c1270830jAvLJIIJJI.LIZIZ) && (tECameraCapture = this.LLJJJIL) != null)) {
            try {
                this.LLLLIIL = true;
                tECameraCapture.setExposureCompensation((int) f);
                LLJJJJLIIL(1000L, this.LLJL, new ARunnableS89S0200000_20(this, iArr, 237));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return -1;
            }
        }
        return iArr[0];
    }

    @Override // X.C1DJP
    public final void LJIILJJIL(final int i) {
        if (LLJJLIIIJLLLLLLLZ() && this.LLJ == 0) {
            return;
        }
        this.r = -1;
        this.s = -1;
        this.LLLILZJ = -1;
        this.c = -1.0d;
        this.l = "";
        try {
            this.LLJJLIIIJLLLLLLLZ.LIZ();
            if (this.LLJJJJJIL != null) {
                this.LLJJJJJIL = null;
            }
            if (C1270690jAh.LIZ(EnumC1270750jAn.REPORT_TRACE, 1)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onCaptureStopped ");
                sbLIZ.append(i);
                sbLIZ.append(" this:");
                sbLIZ.append(this);
                C1270690jAh.LIZJ(1, "CameraVideoCapturer", C2188811AlT.LIZIZ(sbLIZ));
            }
            super.stop();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C786410Ut5.LJJZZIII(this.LLJL, new Runnable() { // from class: X.00qk
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CameraVideoCapturer@8f5e.onCaptureStopped$1");
                    try {
                        this.LLILLJJLI.LJIILJJIL(i);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CameraVideoCapturer@8f5e.onCaptureStopped$1");
                }
            }) && this.LLZZ) {
                super.stop();
            }
        }
    }

    @Override // X.InterfaceC1271000jBC
    public final TEFrameSizei LJJJ(List<TEFrameSizei> list) {
        int i;
        int i2;
        int i3;
        if (list != null) {
            Collections.sort(list, new AComparatorS517S0100000_20(this, 3));
            if (this.d == null) {
                this.d = new ArrayList();
            }
            this.d.clear();
            this.d.addAll(list);
        }
        TEFrameSizei tEFrameSizeiLIZ = C1270730jAl.LIZ(this.LLLJ, this.LLLJIL, this.g, list);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Calling getPreviewSize getAdaptedFrameSize:");
        sbLIZ.append(this.LLLJ);
        sbLIZ.append(" mCameraCaptureHeight:");
        sbLIZ.append(this.LLLJIL);
        sbLIZ.append(" chosen size:");
        sbLIZ.append(tEFrameSizeiLIZ);
        sbLIZ.append(" mChooseBestCaptureResolution:");
        sbLIZ.append(this.g);
        AVLog.logKibana(4, "CameraVideoCapturer", C2188811AlT.LIZIZ(sbLIZ), null);
        if (tEFrameSizeiLIZ != null) {
            int i4 = this.LLLJ;
            int i5 = tEFrameSizeiLIZ.width;
            if (i4 == i5 && (i2 = this.LLLJIL) == tEFrameSizeiLIZ.height) {
                boolean z = this.LLZZZZ;
                if (z) {
                    i3 = i2;
                } else {
                    i3 = i4;
                }
                this.LLILZLL = i3;
                if (!z) {
                    i4 = i2;
                }
                this.LLIZ = i4;
            } else {
                this.LLLJ = i5;
                int i6 = tEFrameSizeiLIZ.height;
                this.LLLJIL = i6;
                boolean z2 = this.LLZZZZ;
                if (z2) {
                    i = i6;
                } else {
                    i = i5;
                }
                this.LLILZLL = i;
                if (!z2) {
                    i5 = i6;
                }
                this.LLIZ = i5;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Calling getPreviewSize and get default resolution:");
                sbLIZ2.append(this.LLILZLL);
                sbLIZ2.append("x");
                sbLIZ2.append(this.LLIZ);
                AVLog.iow("CameraVideoCapturer", C2188811AlT.LIZIZ(sbLIZ2));
                this.LLJJJJLIIL.LJIILIIL(2, this.LLILZLL, this.LLIZ, "Capture Resolution Changed.");
            }
            this.LLJJJJLIIL.LJIILIIL(5, this.LLILZLL, this.LLIZ, "Camera Init Size Changed!");
            this.LLJJJJLIIL.LJIILIIL(3, tEFrameSizeiLIZ.width, tEFrameSizeiLIZ.height, "Camera Size Changed!");
        }
        return tEFrameSizeiLIZ;
    }

    @Override // X.C1270350jA9
    public final void LLJJ(int i) {
        C1271390jBp c1271390jBp = this.LLLLLLLZIL;
        if (c1271390jBp != null && i == c1271390jBp.LIZIZ) {
            this.LLLLLLZZ = false;
        } else {
            C1271390jBp c1271390jBp2 = this.LLLLLLZ;
            if (c1271390jBp2 != null && i == c1271390jBp2.LIZIZ) {
                this.LLLLLZ = false;
            }
        }
        C1270840jAw c1270840jAw = this.LLLLLZL;
        if (c1270840jAw != null) {
            if (c1271390jBp != null && c1270840jAw.LIZIZ == c1271390jBp.LIZIZ) {
                this.LLLLLLZZ = true;
                C786410Ut5.LJJZZIII(this.LLJL, c1270840jAw.LIZ);
            } else {
                C1271390jBp c1271390jBp3 = this.LLLLLLZ;
                if (c1271390jBp3 != null && c1270840jAw.LIZIZ == c1271390jBp3.LIZIZ) {
                    this.LLLLLZ = true;
                    C786410Ut5.LJJZZIII(this.LLJL, c1270840jAw.LIZ);
                }
            }
            this.LLLLLZL = null;
            return;
        }
        if (this.LLJ != 1 || !this.LLJLL) {
            return;
        }
        LLJLILLLLZIIL(this.f, Math.max(TimeUtils.currentTimeMs(), this.LLLLLJLJLL), this.v, false);
    }

    public final void LLJJIII(boolean z) {
        StringBuilder sbLIZ;
        try {
            if (!z) {
                sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LLLILZJ);
                sbLIZ.append("_");
                sbLIZ.append(this.LLJLILLLLZIIL);
            } else {
                sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LLJJJJ.LLILLJJLI);
                sbLIZ.append("_");
                sbLIZ.append(this.LLJJJJ.LLILZ);
            }
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Map<String, Bundle> map = y;
            if (((Bundle) ((HashMap) map).get(strLIZIZ)) == null) {
                if (!z) {
                    return;
                }
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("camera_support_fps_range", "", bundle);
                this.LLJJJIL.queryFeatures(bundle);
                ((HashMap) map).put(strLIZIZ, bundle);
            } else if (z) {
                return;
            }
            Bundle bundle2 = (Bundle) ((HashMap) map).get(strLIZIZ);
            if (bundle2 == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("CAMERA_FEATURES[\"");
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append("\"] is null.");
                AVLog.ioe("CameraVideoCapturer", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Feature of ");
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append("(type_facing): ");
            sbLIZ3.append(bundle2);
            AVLog.iow("CameraVideoCapturer", C2188811AlT.LIZIZ(sbLIZ3));
            LLJJIJIIJIL(bundle2, z);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.logToIODeviceInternal(6, "CameraVideoCapturer", "queryFeatures fail. ", e);
        }
    }

    public final void LLJLL(TECameraFrame tECameraFrame) {
        if (tECameraFrame.getPixelFormat() == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES && this.j.get()) {
            if (this.k.get() < 14) {
                this.k.getAndIncrement();
                System.currentTimeMillis();
                this.LLZZJLIL = this.LLJJJIL.processAlgorithm(tECameraFrame);
                return;
            }
            C786410Ut5.LJJZZIII(this.LLJL, new ARunnableS120S0100000_20(this, 434));
        }
    }

    @Override // X.InterfaceC1268690j7T
    public final int LJJZZIII(float f, C1271210jBX c1271210jBX) {
        TECameraCapture tECameraCapture = this.LLJJJIL;
        if (tECameraCapture != null) {
            return tECameraCapture.zoomV2(f, c1271210jBX);
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0115 A[PHI: r4 r7
      0x0115: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String), (r4v0 java.lang.String) binds: [B:36:0x00da, B:45:0x010c, B:42:0x0107] A[DONT_GENERATE, DONT_INLINE]
      0x0115: PHI (r7v1 int) = (r7v0 int), (r7v3 int), (r7v4 int) binds: [B:36:0x00da, B:45:0x010c, B:42:0x0107] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C1DJP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIL(final int r6, int r7) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1270610jAZ.LLIIL(int, int):void");
    }

    public final void LLJJIJIIJIL(Bundle bundle, boolean z) {
        int i;
        String str;
        String str2;
        int i2;
        try {
            int i3 = this.LLLLJI;
            if (i3 <= 0) {
                return;
            }
            ArrayList<TEFrameRateRange> parcelableArrayList = bundle.getParcelableArrayList("camera_support_fps_range");
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                TEFrameRateRange tEFrameRateRange = this.LLJJJJ.LLILLL;
                String strLIZIZ = "";
                for (TEFrameRateRange tEFrameRateRange2 : parcelableArrayList) {
                    int i4 = tEFrameRateRange2.max;
                    int i5 = tEFrameRateRange2.fpsUnitFactor;
                    int i6 = i4 / i5;
                    int i7 = tEFrameRateRange2.min;
                    int i8 = i7 / i5;
                    int i9 = tEFrameRateRange.max;
                    int i10 = i9 / i5;
                    if (i6 >= i3) {
                        int i11 = i4 / i5;
                        int i12 = i7 / i5;
                        int i13 = tEFrameRateRange.fpsUnitFactor;
                        int i14 = i9 / i13;
                        int i15 = tEFrameRateRange.min / i13;
                        if (i11 != i14) {
                            i2 = i11 - i14;
                        } else {
                            i2 = i12 - i15;
                        }
                        if (i2 < 0 || (this.LLLLL && i10 < i3)) {
                            tEFrameRateRange = new TEFrameRateRange(i8, i6);
                        }
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    if (strLIZIZ.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = ", ";
                    }
                    sbLIZ.append(str2);
                    sbLIZ.append(e3.h);
                    sbLIZ.append(i8);
                    sbLIZ.append(", ");
                    sbLIZ.append(i6);
                    sbLIZ.append(")");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                TEFrameRateRange tEFrameRateRange3 = this.LLJJJJ.LLILLL;
                int i16 = tEFrameRateRange.max;
                int i17 = tEFrameRateRange.fpsUnitFactor;
                int i18 = i16 / i17;
                int i19 = tEFrameRateRange.min / i17;
                int i20 = tEFrameRateRange3.max;
                int i21 = tEFrameRateRange3.fpsUnitFactor;
                int i22 = i20 / i21;
                int i23 = tEFrameRateRange3.min / i21;
                if (i18 != i22) {
                    i = i18 - i22;
                } else {
                    i = i19 - i23;
                }
                if (i != 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Dest fps: ");
                    sbLIZ2.append(this.LLLLJI);
                    sbLIZ2.append(". Fps range list: [");
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append("]. mCapture.setPreviewFpsRange(");
                    sbLIZ2.append(tEFrameRateRange.min);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(tEFrameRateRange.max);
                    sbLIZ2.append(")");
                    if (z) {
                        str = " after ";
                    } else {
                        str = " before ";
                    }
                    sbLIZ2.append(str);
                    sbLIZ2.append("open camera.");
                    AVLog.iow("CameraVideoCapturer", C2188811AlT.LIZIZ(sbLIZ2));
                    synchronized (this.LLLFF) {
                        try {
                            this.LLJJJJ.LLILLL = tEFrameRateRange;
                            if (z) {
                                this.LLJJJIL.setPreviewFpsRange(tEFrameRateRange, 1);
                            }
                            this.LLIZLLLIL = tEFrameRateRange.max;
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    return;
                }
                return;
            }
            AVLog.ioe("CameraVideoCapturer", "TECameraCapture query CAMERA_SUPPORT_FPS_RANGE get null.");
        } catch (Exception th) {
        }
    }

    public final void LLJJIJIL(int i, int i2) {
        C1269140j8C c1269140j8C = this.m.LIZIZ;
        C2185991Agv c2185991Agv = c1269140j8C.LJJJJZ;
        if (c2185991Agv == null) {
            this.LLLZIL = 8;
            return;
        }
        if (c1269140j8C.LJJJJZI == null) {
            this.LLLZIL = 9;
            return;
        }
        TEFrameSizei tEFrameSizei = c2185991Agv.LIZIZ;
        int i3 = tEFrameSizei.width;
        int i4 = tEFrameSizei.height;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkReuseCameraStatus ->liveCameraWidth=");
        sbLIZ.append(i3);
        sbLIZ.append(";liveCameraHeight=");
        sbLIZ.append(i4);
        sbLIZ.append(";cameraWidth=");
        sbLIZ.append(i);
        sbLIZ.append(";cameraHeight=");
        sbLIZ.append(i2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (i == i3 && i2 == i4) {
            this.LLLZZ = true;
            this.LLLZL = Math.min(i, i2);
            this.LLLZLL = Math.max(i, i2);
            this.LLLZIL = 4;
            return;
        }
        this.LLLZIL = 2;
        this.LLLZLZ = strLIZIZ;
    }

    public final C1DJM LLJJJIL(int i, int i2) {
        this.LLJJLIIIJLLLLLLLZ.LIZ();
        Handler handler = this.LLLLLLLLL;
        if (handler != null) {
            C1283100jUi.LIZIZ(handler, new ARunnableS7S0102000_20(i, this, i2, 9));
        } else {
            SurfaceTexture surfaceTexture = this.LLJJL;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.LLJJJ);
            this.LLJJL = surfaceTexture2;
            surfaceTexture2.updateTexImage();
            this.LLJJL.setDefaultBufferSize(i, i2);
        }
        C1DJM c1djm = new C1DJM(new TEFrameSizei(i, i2), (C1DJX) this, true, this.LLJJL, this.LLJJJ);
        if (this.LLLZZIL == null) {
            this.LLLZZIL = UUID.randomUUID();
        }
        c1djm.LJIIJ = this.LLLZZIL;
        return c1djm;
    }

    public final void LLJJJJJIL(int i, Exception exc) {
        switch (i) {
            case -417:
            case -416:
                break;
            case -415:
            case -414:
            case -413:
                this.LLLLIIL = false;
                break;
            case -412:
            case -411:
                this.LLLLIIIILLL = false;
                break;
            default:
                boolean z = this.m.LIZ.captureBase.videoCapture.LJFF;
                if (i == -443 && z && this.LLJJJIL != null) {
                    AVLog.logKibana(6, "CameraVideoCapturer", "onErrorOnHandler: mCapture restart due to non_fatal_error", null);
                    this.LLJJJIL.stop(true);
                    C1DJM c1djmLLJJJIL = LLJJJIL(this.LLLJ, this.LLLJIL);
                    if (LLJJLIIIJLLLLLLLZ()) {
                        this.LLJJJIL.removeCameraProvider();
                    }
                    this.LLJJJIL.addCameraProvider(c1djmLLJJJIL);
                    this.LLJJJIL.start();
                } else {
                    this.LLJ = 2;
                    if (i != -404 && C1270690jAh.LIZ(EnumC1270750jAn.REPORT_TRACE, 1)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onErrorOnHandler TECaptureError:");
                        sbLIZ.append(i);
                        sbLIZ.append(" params:");
                        sbLIZ.append(this.LLLIL);
                        sbLIZ.append(" observer:");
                        sbLIZ.append(this.LLJJJJLIIL);
                        C1270690jAh.LIZJ(1, "CameraVideoCapturer", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    if ((this.m.LIZ.captureBase.videoCapture.LJ || (this.LLLLIIIILLL && this.LLLLIIL)) && i != -404 && i != -409 && i != -403 && i != -420 && i != -421 && i != -105) {
                        this.LLJJJJLIIL.LJI(i, exc);
                    } else {
                        this.LLJJJJLIIL.LJIILIIL(1, i, 0, "Camera error!");
                    }
                }
                break;
        }
    }

    public final int LLJL(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCameraPreviewFpsRangeWhenRunning min:");
        sbLIZ.append(i);
        sbLIZ.append(" max:");
        sbLIZ.append(i2);
        AVLog.logKibana(4, "CameraVideoCapturer", C2188811AlT.LIZIZ(sbLIZ), null);
        int[] iArr = {-1};
        try {
            this.LLJJJIL.setPreviewFpsRangeWhenRunning(new TEFrameRateRange(i, i2));
            return iArr[0];
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1;
        }
    }

    @Override // X.C1DJP
    public final void onError(int i, String str) {
        if (this.LLLILZ) {
            this.i.set(false);
        }
        Exception exc = new Exception(str);
        if (C786410Ut5.u3() == this.LLJL.getLooper().getThread()) {
            LLJJJJJIL(i, exc);
        } else {
            C786410Ut5.LJJZZIII(this.LLJL, new ARunnableS26S0201000_20(exc, i, this, 17));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x01a5 A[Catch: all -> 0x01e3, TryCatch #0 {all -> 0x01e3, blocks: (B:12:0x005b, B:14:0x0061, B:17:0x00b2, B:21:0x00ba, B:27:0x00d9, B:29:0x00dd, B:30:0x00e1, B:32:0x00ec, B:33:0x00ee, B:35:0x00f4, B:36:0x00f6, B:38:0x0150, B:39:0x0157, B:41:0x015d, B:43:0x0165, B:45:0x0169, B:47:0x016d, B:49:0x0173, B:50:0x0177, B:52:0x0185, B:56:0x01b3, B:58:0x01e1, B:53:0x01a5, B:54:0x01aa, B:22:0x00c6, B:26:0x00d4, B:25:0x00ce, B:57:0x01d3), top: B:64:0x005b }] */
    @Override // X.C1270350jA9, X.AbstractC1268600j7K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJI(int r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1270610jAZ.LLJI(int, int, int):void");
    }

    public final void LLJJJJLIIL(long j, Handler handler, Runnable runnable) {
        if (handler != null && j > 0) {
            Object obj = new Object();
            boolean[] zArr = {false};
            synchronized (obj) {
                try {
                    if (C786410Ut5.LJJZZIII(handler, new ARunnableS12S0400000_3(runnable, zArr, obj, this, 1))) {
                        try {
                            obj.wait(j);
                        } catch (InterruptedException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.C1DJP
    public final void onInfo(int i, int i2, String str) {
        if (this.LLLILZ && i == 0) {
            if (C1270690jAh.LIZ(EnumC1270750jAn.REPORT_ALOG, 8)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TECapture type ");
                sbLIZ.append(i);
                sbLIZ.append(" ext ");
                sbLIZ.append(i2);
                sbLIZ.append(" msg ");
                sbLIZ.append(str);
                C1270690jAh.LIZIZ(8, C2188811AlT.LIZIZ(sbLIZ));
            }
            this.i.set(false);
            C1270720jAk c1270720jAk = this.h;
            if (c1270720jAk != null) {
                C786410Ut5.LJJZZIII(this.LLJLIL, new ARunnableS89S0200000_20(this, c1270720jAk, 235));
                this.h = null;
                return;
            }
            return;
        }
        if (i == 120) {
            if (!C1270690jAh.LIZ(EnumC1270750jAn.REPORT_TRACE, 4)) {
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onInfo TECaptureInfo:");
            sbLIZ2.append(i);
            sbLIZ2.append(" Ext:");
            sbLIZ2.append(i2);
            sbLIZ2.append(" msg:");
            sbLIZ2.append(str);
            sbLIZ2.append("CameraType:");
            sbLIZ2.append(this.LLLILZJ);
            sbLIZ2.append(" cameraOpenRetryCnt:");
            sbLIZ2.append(this.LLLILZLLLI);
            C1270690jAh.LIZJ(4, "CameraVideoCapturer", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (i == 0) {
            if (!C1270690jAh.LIZ(EnumC1270750jAn.REPORT_TRACE, 4)) {
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onInfo TECaptureInfo:");
            sbLIZ3.append(i);
            sbLIZ3.append(" Ext:");
            sbLIZ3.append(i2);
            sbLIZ3.append(" msg:");
            sbLIZ3.append(str);
            sbLIZ3.append("CameraType:");
            sbLIZ3.append(this.LLLILZJ);
            sbLIZ3.append(" cameraOpenRetryCnt:");
            sbLIZ3.append(this.LLLILZLLLI);
            C1270690jAh.LIZJ(4, "CameraVideoCapturer", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        if (i == 1) {
            LLJJIII(true);
            return;
        }
        if (i == 121) {
            this.l = str;
            if (C1270690jAh.LIZ(EnumC1270750jAn.REPORT_TRACE, 4)) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("onInfo TECaptureInfo:");
                sbLIZ4.append(i);
                sbLIZ4.append(" VideoCaptureMinFps:");
                sbLIZ4.append(this.LLZILL);
                sbLIZ4.append(" VideoCaptureFps:");
                sbLIZ4.append(this.LLIZLLLIL);
                sbLIZ4.append("RealFpsRange:");
                sbLIZ4.append(str);
                sbLIZ4.append(" CameraType:");
                sbLIZ4.append(this.LLLILZJ);
                C1270690jAh.LIZJ(4, "CameraVideoCapturer", C2188811AlT.LIZIZ(sbLIZ4));
            }
            if (!this.LLLILZ) {
                return;
            }
            this.i.set(false);
            C1270720jAk c1270720jAk2 = this.h;
            if (c1270720jAk2 == null) {
                return;
            }
            C786410Ut5.LJJZZIII(this.LLJLIL, new ARunnableS89S0200000_20(this, c1270720jAk2, 235));
            this.h = null;
            return;
        }
        if (i == 52) {
            if (!LLJJLIIIJLLLLLLLZ()) {
                return;
            }
            C786410Ut5.LJJZZIII(this.LLJL, new ARunnableS120S0100000_20(this, 421));
        } else {
            if (!C1270690jAh.LIZ(EnumC1270750jAn.REPORT_ALOG, 8)) {
                return;
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("TECapture type ");
            sbLIZ5.append(i);
            sbLIZ5.append(" ext ");
            sbLIZ5.append(i2);
            sbLIZ5.append(" msg ");
            sbLIZ5.append(str);
            C1270690jAh.LIZIZ(8, C2188811AlT.LIZIZ(sbLIZ5));
        }
    }

    public final int LLJJJ(int i, int i2, int i3, boolean z) {
        int i4;
        if (this.LLLLLLLZIL == null) {
            C1271390jBp c1271390jBp = new C1271390jBp(null);
            this.LLLLLLLZIL = c1271390jBp;
            c1271390jBp.LIZLLL(i2, i3);
        }
        if (this.LLLLLLZ == null && this.LLLLLZIL) {
            C1271390jBp c1271390jBp2 = new C1271390jBp(null);
            this.LLLLLLZ = c1271390jBp2;
            c1271390jBp2.LIZLLL(i2, i3);
        }
        if (this.LLLLLLLLLL == null) {
            this.LLLLLLLLLL = new GlRenderDrawer();
        }
        C1271390jBp c1271390jBp3 = this.LLLLLLLZIL;
        if (((c1271390jBp3 == null || this.LLLLLLZZ) && ((c1271390jBp3 = this.LLLLLLZ) == null || this.LLLLLZ)) || c1271390jBp3 == null) {
            return i;
        }
        c1271390jBp3.LIZLLL(i2, i3);
        GLES20.glBindFramebuffer(36160, c1271390jBp3.LIZ);
        if (z) {
            i4 = 0;
            this.LLLLLLLLLL.drawOes(i, null, null, 0, 0, i2, i3);
        } else {
            i4 = 0;
            this.LLLLLLLLLL.drawRgb(i, null, null, 0, 0, i2, i3);
        }
        GLES20.glBindFramebuffer(36160, i4);
        GLES20.glFinish();
        return c1271390jBp3.LIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x032d A[PHI: r10
      0x032d: PHI (r10v3 boolean) = (r10v2 boolean), (r10v6 boolean) binds: [B:106:0x0287, B:114:0x029d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJLILLLLZIIL(long r29, long r31, long r33, boolean r35) {
        /*
            Method dump skipped, instruction units count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1270610jAZ.LLJLILLLLZIIL(long, long, long, boolean):void");
    }

    @Override // X.InterfaceC1268690j7T
    public final int j3(int i, int i2, int i3, int i4) {
        int[] iArr = {-1};
        TECameraCapture tECameraCapture = this.LLJJJIL;
        if (tECameraCapture != null) {
            try {
                this.LLLLIIIILLL = true;
                tECameraCapture.focusAtPoint(i, i2, 0.15f, i3, i4);
                LLJJJJLIIL(3000L, this.LLJL, new ARunnableS89S0200000_20(this, iArr, 238));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return -1;
            }
        }
        return iArr[0];
    }

    public final void LLJLLIL(int i, int i2, int i3, int i4, boolean z) {
        boolean z2;
        long jNativeNanoTime;
        TEFrameSizei tEFrameSizeiLIZ;
        int i5;
        int i6;
        int i7;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateCaptureResolution width:");
        sbLIZ.append(i);
        sbLIZ.append(" height:");
        sbLIZ.append(i2);
        sbLIZ.append(" minFps:");
        sbLIZ.append(i3);
        sbLIZ.append(" fps:");
        sbLIZ.append(i4);
        sbLIZ.append(" cameraSizeOptEnable:");
        sbLIZ.append(this.LLLILZ);
        sbLIZ.append(" updating:");
        sbLIZ.append(this.i.get());
        AVLog.logKibana(4, "CameraVideoCapturer", C2188811AlT.LIZIZ(sbLIZ), null);
        CaptureBase.VideoCaptureParams videoCaptureParams = this.m.LIZ.captureBase.videoCapture;
        if (videoCaptureParams != null && !this.n) {
            AVLog.logKibana(4, "CameraVideoCapturer", "updateCaptureResolution return because not mStarted", null);
            return;
        }
        if (this.LLLILZ && this.i.get()) {
            C1270720jAk c1270720jAk = new C1270720jAk(i, i2, i3, i4);
            this.h = c1270720jAk;
            c1270720jAk.LJ = z;
            return;
        }
        this.LLLJ = Math.max(i, i2);
        int iMin = Math.min(i, i2);
        this.LLLJIL = iMin;
        if (this.LLLILZ) {
            this.LLILZLL = i;
            this.LLIZ = i2;
            this.LLIZLLLIL = i4;
        }
        if (i2 != iMin) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLZZZZ = z2;
        List<TEFrameSizei> list = this.d;
        if (list != null) {
            if (z) {
                tEFrameSizeiLIZ = new TEFrameSizei(this.LLLJ, this.LLLJIL);
            } else {
                tEFrameSizeiLIZ = C1270730jAl.LIZ(this.LLLJ, iMin, this.g, list);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Calling updateCaptureResolution getAdaptedFrameSize:");
            sbLIZ2.append(this.LLLJ);
            sbLIZ2.append(" mCameraCaptureHeight:");
            sbLIZ2.append(this.LLLJIL);
            sbLIZ2.append(" chosen size:");
            sbLIZ2.append(tEFrameSizeiLIZ);
            sbLIZ2.append(" mChooseBestCaptureResolution:");
            sbLIZ2.append(this.g);
            AVLog.logKibana(4, "CameraVideoCapturer", C2188811AlT.LIZIZ(sbLIZ2), null);
            if (tEFrameSizeiLIZ != null) {
                int i8 = this.LLLJ;
                int i9 = tEFrameSizeiLIZ.width;
                if (i8 == i9 && (i6 = this.LLLJIL) == tEFrameSizeiLIZ.height) {
                    boolean z3 = this.LLZZZZ;
                    if (z3) {
                        i7 = i6;
                    } else {
                        i7 = i8;
                    }
                    this.LLILZLL = i7;
                    if (!z3) {
                        i8 = i6;
                    }
                    this.LLIZ = i8;
                } else {
                    this.LLLJ = i9;
                    int i10 = tEFrameSizeiLIZ.height;
                    this.LLLJIL = i10;
                    boolean z4 = this.LLZZZZ;
                    if (z4) {
                        i5 = i10;
                    } else {
                        i5 = i9;
                    }
                    this.LLILZLL = i5;
                    if (!z4) {
                        i9 = i10;
                    }
                    this.LLIZ = i9;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Calling getPreviewSize and get default resolution:");
                    sbLIZ3.append(this.LLILZLL);
                    sbLIZ3.append("x");
                    sbLIZ3.append(this.LLIZ);
                    AVLog.iow("CameraVideoCapturer", C2188811AlT.LIZIZ(sbLIZ3));
                    this.LLJJJJLIIL.LJIILIIL(2, this.LLILZLL, this.LLIZ, "Capture Resolution Changed.");
                }
                this.LLJJJJLIIL.LJIILIIL(5, this.LLILZLL, this.LLIZ, "Camera Init Size Changed!");
                this.LLJJJJLIIL.LJIILIIL(3, tEFrameSizeiLIZ.width, tEFrameSizeiLIZ.height, "Camera Size Changed!");
            }
        }
        if (this.LLLILZ) {
            int i11 = this.LLLJ;
            int i12 = this.LLLJIL;
            this.i.set(true);
            C786410Ut5.LJJZZIII(this.LLJL, new ARunnableS1S0204000_20(this, i11, videoCaptureParams, i12, i3, i4, 2));
            return;
        }
        if (AVLog.isLogKibanaEnabled()) {
            jNativeNanoTime = TimeUtils.nativeNanoTime();
        } else {
            jNativeNanoTime = 0;
        }
        this.LLJJJIL.stop();
        C1DJM c1djmLLJJJIL = LLJJJIL(this.LLLJ, this.LLLJIL);
        if (LLJJLIIIJLLLLLLLZ()) {
            this.LLJJJIL.removeCameraProvider();
        }
        this.LLJJJIL.addCameraProvider(c1djmLLJJJIL);
        this.LLJJJIL.start();
        if (!AVLog.isLogKibanaEnabled()) {
            return;
        }
        long jNativeNanoTime2 = TimeUtils.nativeNanoTime() - jNativeNanoTime;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("restart Camera with cost Ns:");
        sbLIZ4.append(jNativeNanoTime2);
        AVLog.logKibana(5, "CameraVideoCapturer", C2188811AlT.LIZIZ(sbLIZ4), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0jAs] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1270610jAZ(android.os.Handler r12, android.os.Handler r13, boolean r14, X.InterfaceC1270200j9u r15, android.content.Context r16, int r17, android.os.Bundle r18, X.C1267500j5Y r19) {
        /*
            Method dump skipped, instruction units count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1270610jAZ.<init>(android.os.Handler, android.os.Handler, boolean, X.0j9u, android.content.Context, int, android.os.Bundle, X.0j5Y):void");
    }
}
