package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0oSB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473730oSB extends C1473600oRy implements InterfaceC1471240oOA {
    public C1288220jcy LLIZLLLIL;
    public WeakReference<ViewGroup> LLJ;
    public WeakReference<InterfaceC1473740oSC> LLJI;
    public ArrayList<Runnable> LLJIJIL;
    public boolean LLJILJIL;
    public volatile boolean LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;

    @Override // X.InterfaceC1471240oOA
    public final void q3() {
        setKeepScreenOn(true);
    }

    private float getAdjustAlpha() {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return 1.0f;
        }
        String str = Build.MODEL;
        return (i == 29 && (str.equals("TAH-AN00") || str.equals("TAH-N29") || str.equals("RLI-AN00") || str.equals("RLI-N29") || str.equals("TAH-AN00m") || str.equals("RHA-AN00m") || str.equals("MRX-AL09") || str.equals("MRX-AL19") || str.equals("MRX-AN19") || str.equals("MRX-W09") || str.equals("IN2010") || str.equals("SM-G9650") || str.equals("MRX-W19"))) ? 1.0f : 0.99f;
    }

    public ViewGroup getParentLayout() {
        return this.LLJ.get();
    }

    public Surface getSurface() {
        C1288220jcy c1288220jcy = this.LLIZLLLIL;
        if (c1288220jcy != null) {
            return c1288220jcy.getSurface();
        }
        return null;
    }

    @Override // X.InterfaceC1471240oOA
    public final void r3() {
        InterfaceC1473620oS0 interfaceC1473620oS0 = this.LLILZIL;
        if (interfaceC1473620oS0 != null) {
            interfaceC1473620oS0.r3();
        }
    }

    @Override // X.InterfaceC1471240oOA
    public final void t3() {
        C12ES.LJIILL(0, this.LLIZLLLIL);
    }

    public final void LJI() {
        if (LIZ()) {
            if (this.LLIZ.booleanValue() || this.LLILLJJLI.LLJILJILJ) {
                if (!this.LLILLJJLI.LIZLLL() || this.LLILLJJLI.LLJJIII) {
                    this.LLILLJJLI.LJIIJ();
                    C1471190oO5 c1471190oO5 = this.LLILLJJLI;
                    if (c1471190oO5 == null || !c1471190oO5.LJIIZILJ()) {
                        LJFF(new Runnable() { // from class: X.0oRx
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("VideoMediaView@bb6d.play$1");
                                try {
                                    Surface surface = this.LL.getSurface();
                                    C1471190oO5 c1471190oO52 = this.LL.LLILLJJLI;
                                    if (c1471190oO52 != null) {
                                        c1471190oO52.LJIILLIIL(surface);
                                    }
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("VideoMediaView@bb6d.play$1");
                            }
                        });
                    }
                    LynxLog.i("VideoMediaView", "Did trigger VideoController play in VideoMediaView");
                    this.LLJILJILJ = true;
                }
            }
        }
    }

    public C1473730oSB(Context context) {
        super(context);
        this.LLJIJIL = new ArrayList<>();
        this.LLJILJIL = false;
        this.LLJILJILJ = false;
        this.LLJILLL = 0;
        this.LLJJ = 0;
        setClipChildren(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.LLIZLLLIL = new C1288220jcy(context);
        C1288220jcy c1288220jcy = this.LLIZLLLIL;
        float adjustAlpha = getAdjustAlpha();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1288220jcy);
        c1288220jcy.setAlpha(adjustAlpha);
        setBackgroundColor(-16777216);
        layoutParams.gravity = 17;
        addView(this.LLIZLLLIL, layoutParams);
        C12ES.LJIILL(8, this.LLIZLLLIL);
        this.LLIZLLLIL.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.0oRv
            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                C1471190oO5 c1471190oO5 = this.LL.LLILLJJLI;
                if (c1471190oO5 != null) {
                    c1471190oO5.LJIILLIIL(null);
                    return true;
                }
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                ArrayList<Runnable> arrayList;
                C1473730oSB c1473730oSB = this.LL;
                C1471190oO5 c1471190oO5 = c1473730oSB.LLILLJJLI;
                if (c1471190oO5 != null) {
                    c1471190oO5.LJIILLIIL(c1473730oSB.getSurface());
                    C1471190oO5 c1471190oO52 = this.LL.LLILLJJLI;
                    if (c1471190oO52.LL != null && c1471190oO52.LL != null) {
                        c1471190oO52.LL.LIZJ(341, i);
                        c1471190oO52.LL.LIZJ(342, i2);
                    }
                }
                C1473730oSB c1473730oSB2 = this.LL;
                if (!c1473730oSB2.LLJILJIL && (arrayList = c1473730oSB2.LLJIJIL) != null && !arrayList.isEmpty()) {
                    c1473730oSB2.LLJILJIL = true;
                    Surface surface = c1473730oSB2.getSurface();
                    C1471190oO5 c1471190oO53 = c1473730oSB2.LLILLJJLI;
                    if (c1471190oO53 != null) {
                        c1471190oO53.LJIILLIIL(surface);
                    }
                    Iterator it2 = new ArrayList(c1473730oSB2.LLJIJIL).iterator();
                    while (it2.hasNext()) {
                        ((Runnable) it2.next()).run();
                    }
                    c1473730oSB2.LLJIJIL.clear();
                    c1473730oSB2.LLJILJIL = false;
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                C1471190oO5 c1471190oO5 = this.LL.LLILLJJLI;
                if (c1471190oO5.LL != null && c1471190oO5.LL != null) {
                    c1471190oO5.LL.LIZJ(341, i);
                    c1471190oO5.LL.LIZJ(342, i2);
                }
            }
        });
    }

    private void setVideoMetaInternal(ReadableMap readableMap) {
        int iLJII = LJII("vwidth", "vwidth", readableMap);
        int iLJII2 = LJII("vheight", "vheight", readableMap);
        if (iLJII > 0 && iLJII2 > 0) {
            if (iLJII == this.LLJILLL && iLJII2 == this.LLJJ) {
                return;
            }
            this.LLJILLL = iLJII;
            this.LLJJ = iLJII2;
            C1288220jcy c1288220jcy = this.LLIZLLLIL;
            if (c1288220jcy != null) {
                if (c1288220jcy.LLILZIL != iLJII || c1288220jcy.LLILZLL != iLJII2) {
                    c1288220jcy.LLILZIL = iLJII;
                    c1288220jcy.LLILZLL = iLJII2;
                    c1288220jcy.LLJI = 0;
                    c1288220jcy.LLJIJIL = 0;
                    c1288220jcy.requestLayout();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setVideoMeta: Success. Set video size to ");
                sbLIZ.append(this.LLJILLL);
                sbLIZ.append("x");
                sbLIZ.append(this.LLJJ);
                LynxLog.i("VideoMediaView", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setVideoMeta: Invalid video dimensions. Width: ");
        sbLIZ2.append(iLJII);
        sbLIZ2.append(", Height: ");
        sbLIZ2.append(iLJII2);
        LynxLog.w("VideoMediaView", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LJ(Boolean bool) {
        WeakReference<InterfaceC1473740oSC> weakReference;
        InterfaceC1473740oSC interfaceC1473740oSC;
        if (LIZ() && !this.LLILLJJLI.LLJJI && (weakReference = this.LLJI) != null && (interfaceC1473740oSC = weakReference.get()) != null) {
            this.LLILLJJLI.LLJJI = true;
            interfaceC1473740oSC.LJIILLIIL(this, bool);
            InterfaceC1473620oS0 interfaceC1473620oS0 = this.LLILZIL;
            if (interfaceC1473620oS0 != null) {
                interfaceC1473620oS0.LIZ(true);
            }
        }
    }

    public final void LJFF(Runnable runnable) {
        C1471190oO5 c1471190oO5;
        Surface surface = getSurface();
        if (surface != null && surface.isValid() && (c1471190oO5 = this.LLILLJJLI) != null) {
            c1471190oO5.LJIILLIIL(surface);
            runnable.run();
        } else {
            if (this.LLJIJIL == null) {
                this.LLJIJIL = new ArrayList<>();
            }
            this.LLJIJIL.add(runnable);
        }
    }

    @Override // X.InterfaceC1471240oOA
    public final void s3(Runnable runnable) {
        LJFF(runnable);
    }

    public void setParentLayout(ViewGroup viewGroup) {
        this.LLJ = new WeakReference<>(viewGroup);
    }

    public void setTextureLayout(int i) {
        C1288220jcy c1288220jcy = this.LLIZLLLIL;
        if (c1288220jcy != null) {
            c1288220jcy.setVideoViewLayout(i);
        }
    }

    public void setTransformer(InterfaceC1473740oSC interfaceC1473740oSC) {
        this.LLJI = new WeakReference<>(interfaceC1473740oSC);
    }

    public void setVideoMeta(ReadableMap readableMap) {
        if (readableMap == null) {
            LynxLog.w("VideoMediaView", "setVideoMeta: videoMeta is null");
        } else {
            setVideoMetaInternal(readableMap);
        }
    }

    @Override // X.C1473600oRy
    public final void LIZLLL(C1471230oO9 c1471230oO9, InterfaceC1471260oOC interfaceC1471260oOC) {
        super.LIZLLL(c1471230oO9, interfaceC1471260oOC);
        C1471190oO5 c1471190oO5 = this.LLILLJJLI;
        if (c1471190oO5 != null) {
            c1471190oO5.LLJI = this;
        }
    }

    @Override // X.InterfaceC1471240oOA
    public final void onVideoSizeChanged(int i, int i2) {
        C1288220jcy c1288220jcy = this.LLIZLLLIL;
        if (c1288220jcy.LLILZIL != i || c1288220jcy.LLILZLL != i2) {
            c1288220jcy.LLILZIL = i;
            c1288220jcy.LLILZLL = i2;
            c1288220jcy.LLJI = 0;
            c1288220jcy.LLJIJIL = 0;
            c1288220jcy.requestLayout();
        }
    }

    public static int LJII(String str, String str2, ReadableMap readableMap) {
        if (!readableMap.hasKey(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setVideoMeta: Missing '");
            sbLIZ.append(str2);
            sbLIZ.append("' key");
            LynxLog.w("VideoMediaView", C2188811AlT.LIZIZ(sbLIZ));
            return 0;
        }
        try {
            return readableMap.getInt(str);
        } catch (ClassCastException | IllegalArgumentException | NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setVideoMeta: Failed to retrieve '");
            sbLIZ2.append(str2);
            sbLIZ2.append("'. Error: ");
            sbLIZ2.append(e.getMessage());
            sbLIZ2.append(", Type: ");
            sbLIZ2.append(e.getClass().getSimpleName());
            LynxLog.e("VideoMediaView", C2188811AlT.LIZIZ(sbLIZ2));
            return 0;
        }
    }
}
