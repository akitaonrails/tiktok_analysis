package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.other.LiveEnableCropPreviewSurfaceExp;
import com.bytedance.android.livesdk.livesetting.other.LiveEnableCropSurfaceExp;
import com.bytedance.android.livesdk.livesetting.other.LiveEnableGpuOptExp;
import com.bytedance.android.livesdk.livesetting.other.LiveOptSurfaceUse;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.Logger;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A7J, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A7J extends SurfaceView implements C0IF5, InterfaceC1090410eTv, SurfaceHolder.Callback {
    public C1A7M LL;
    public SurfaceHolder.Callback LLILLJJLI;
    public Surface LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public final float LLIZ;
    public float LLIZLLLIL;
    public DataChannel LLJ;
    public C1090400eTu LLJI;
    public int LLJIJIL;
    public C1A7N LLJILJIL;
    public volatile AwS434S0200000_33 LLJILJILJ;

    @Override // X.InterfaceC464060IHs
    public final void LIZIZ() {
        this.LLILZ = 0;
        this.LLILZIL = 0;
        this.LLJILJIL = null;
        if (getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams);
        }
    }

    @Override // X.C0IF5
    public /* bridge */ /* synthetic */ void setRoomID(Long l) {
    }

    @Override // X.C0IF5
    public /* bridge */ /* synthetic */ void setVisibilityChangeListener(C1A7H c1a7h) {
    }

    @Override // X.InterfaceC1090410eTv
    public final void LLJL() {
        this.LLJIJIL++;
    }

    @Override // X.InterfaceC1090410eTv
    public C1090400eTu getCacheHelper() {
        C1090400eTu c1090400eTu = this.LLJI;
        if (c1090400eTu != null) {
            return c1090400eTu;
        }
        C1090400eTu c1090400eTu2 = new C1090400eTu();
        this.LLJI = c1090400eTu2;
        return c1090400eTu2;
    }

    public final Surface getSurface() {
        Surface surface = this.LLILLL;
        if (surface == null || !surface.isValid()) {
            return null;
        }
        return this.LLILLL;
    }

    @Override // X.InterfaceC464060IHs
    public final void reset() {
        C827750WdZ.LIZ("SurfaceRenderV2View", "SurfaceView:reset");
        this.LLJILJIL = null;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (C19741012Lo.LIZ(LiveEnableCropPreviewSurfaceExp.isEnable())) {
            setClipBounds(null);
            C1A7M c1a7m = this.LL;
            if (c1a7m != null) {
                HandlerHook.viewRemoveCallbacks(this, c1a7m);
            }
        }
    }

    @Override // X.InterfaceC1090410eTv
    public int getCallCount() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC464060IHs
    public int getStreamHeight() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC464060IHs
    public int getStreamWidth() {
        return this.LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1A7M] */
    public C1A7J(Context context) {
        super(context);
        this.LLILZLL = 2;
        this.LLIZ = 1.7777778f;
        this.LLIZLLLIL = 1.7777778f;
        getHolder().addCallback(this);
        if (Build.VERSION.SDK_INT >= 30 && LiveEnableCropSurfaceExp.isEnable()) {
            this.LL = new Runnable() { // from class: X.1A7M
                public final void LIZ() {
                    C1A7J c1a7j = this.LL;
                    c1a7j.getClass();
                    if (C19741012Lo.LIZ(LiveEnableCropPreviewSurfaceExp.isEnable())) {
                        try {
                            int i = c1a7j.LLILZLL;
                            Object parent = c1a7j.getParent();
                            Rect rectLIZJ = C19741012Lo.LIZJ(i, parent instanceof View ? (View) parent : null, c1a7j);
                            if (Intrinsics.LJFF(c1a7j.getClipBounds(), rectLIZJ)) {
                                return;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("setClipBounds: left:");
                            sbLIZ.append(rectLIZJ != null ? Integer.valueOf(rectLIZJ.left) : null);
                            sbLIZ.append(" top:");
                            sbLIZ.append(rectLIZJ != null ? Integer.valueOf(rectLIZJ.top) : null);
                            sbLIZ.append(" right:");
                            sbLIZ.append(rectLIZJ != null ? Integer.valueOf(rectLIZJ.right) : null);
                            sbLIZ.append(" bottom:");
                            sbLIZ.append(rectLIZJ != null ? Integer.valueOf(rectLIZJ.bottom) : null);
                            C20441214yg.LIZIZ("RenderViewCorp", C2188811AlT.LIZIZ(sbLIZ));
                            c1a7j.setClipBounds(rectLIZJ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C20441214yg.LJFF("RenderViewCorp", "cropVideoAboveAndroidApi30: ", th);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SurfaceRenderV2View@c0fb.initHolder$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SurfaceRenderV2View@c0fb.initHolder$1");
                }
            };
        }
    }

    @Override // X.InterfaceC1090410eTv
    public final void LLZZ(ViewGroup.LayoutParams layoutParams) {
        Integer numValueOf;
        int iHashCode;
        super.setLayoutParams(layoutParams);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("surfaceview performChangeLayoutParams: width: ");
        Integer numValueOf2 = null;
        if (layoutParams != null) {
            numValueOf = Integer.valueOf(layoutParams.width);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", height: ");
        if (layoutParams != null) {
            numValueOf2 = Integer.valueOf(layoutParams.height);
        }
        sbLIZ.append(numValueOf2);
        sbLIZ.append(", hc = ");
        sbLIZ.append(hashCode());
        sbLIZ.append(" lp.hc = ");
        if (layoutParams != null) {
            iHashCode = layoutParams.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        Logger.i("ttlive_enter_room_log_SurfaceRenderV2View", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0IF5
    public void setDataChannel(DataChannel dataChannel) {
        this.LLJ = dataChannel;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Integer numValueOf;
        int iHashCode;
        C1090380eTs.LIZ(this, layoutParams);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("surfaceview performChangeLayoutParams: width: ");
        Integer numValueOf2 = null;
        if (layoutParams != null) {
            numValueOf = Integer.valueOf(layoutParams.width);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", height: ");
        if (layoutParams != null) {
            numValueOf2 = Integer.valueOf(layoutParams.height);
        }
        sbLIZ.append(numValueOf2);
        sbLIZ.append(", hc = ");
        sbLIZ.append(hashCode());
        sbLIZ.append(" params.hc = ");
        if (layoutParams != null) {
            iHashCode = layoutParams.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        Logger.i("ttlive_enter_room_log_SurfaceRenderV2View", C2188811AlT.LIZIZ(sbLIZ));
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("params isn't FrameLayout.LayoutParams. params: ");
        sbLIZ2.append(layoutParams);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.InterfaceC464060IHs
    public void setScaleType(int i) {
        LIZJ(i, "");
    }

    @Override // X.C0IF5
    public void setSmoothEnterHandler(C1A7N c1a7n) {
        this.LLJILJIL = c1a7n;
    }

    public final void setSurfaceCallBack(SurfaceHolder.Callback callback) {
        this.LLILLJJLI = callback;
        if (callback != null && this.LLJILJILJ != null) {
            AwS434S0200000_33 awS434S0200000_33 = this.LLJILJILJ;
            if (awS434S0200000_33 != null) {
                awS434S0200000_33.invoke();
            }
            this.LLJILJILJ = null;
        }
    }

    @Override // X.InterfaceC464060IHs
    public void setTargetScaleResolution(float f) {
        this.LLIZLLLIL = f;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.LLILLL = surfaceHolder.getSurface();
        SurfaceHolder.Callback callback = this.LLILLJJLI;
        if (callback == null) {
            this.LLJILJILJ = new AwS434S0200000_33(this, surfaceHolder, 150);
        } else {
            callback.surfaceCreated(surfaceHolder);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SurfaceView:surfaceCreated hc = ");
        sbLIZ.append(hashCode());
        sbLIZ.append(" ,pendingAction = ");
        sbLIZ.append(this.LLJILJILJ);
        sbLIZ.append(", surfaceHolderCallback = ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(' ');
        C827750WdZ.LIZ("SurfaceRenderV2View", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vDestroyed hc = ");
        sbLIZ.append(hashCode());
        sbLIZ.append(" ,pendingAction = ");
        sbLIZ.append(this.LLJILJILJ);
        sbLIZ.append(", surfaceHolderCallback = ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(' ');
        C827750WdZ.LIZ("SurfaceRenderV2View", C2188811AlT.LIZIZ(sbLIZ));
        SurfaceHolder.Callback callback = this.LLILLJJLI;
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
        if (!LiveOptSurfaceUse.isEnable()) {
            this.LLILLL = null;
        }
        this.LLJILJILJ = null;
    }

    @Override // X.InterfaceC464060IHs
    public final void LIZJ(int i, String str) {
        this.LLILZLL = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SurfaceView:setScaleType :");
        sbLIZ.append(i);
        sbLIZ.append(" from:");
        sbLIZ.append(str);
        sbLIZ.append(" hc = ");
        sbLIZ.append(hashCode());
        C827750WdZ.LIZ("SurfaceRenderV2View", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0186, code lost:
    
        if (r2 > r1) goto L78;
     */
    @Override // android.view.SurfaceView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r16, int r17) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1A7J.onMeasure(int, int):void");
    }

    @Override // X.InterfaceC464060IHs
    public final void setVideoSize(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SurfaceView:setVideoSize width:");
        sbLIZ.append(i);
        sbLIZ.append(" height:");
        sbLIZ.append(i2);
        C827750WdZ.LIZ("SurfaceRenderV2View", C2188811AlT.LIZIZ(sbLIZ));
        if (i > 0 && i2 > 0) {
            this.LLILZ = i;
            this.LLILZIL = i2;
            if (LiveEnableGpuOptExp.isEnable()) {
                getHolder().setFixedSize(i, i2);
            }
            requestLayout();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        SurfaceHolder.Callback callback = this.LLILLJJLI;
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i, i2, i3);
        }
    }
}
