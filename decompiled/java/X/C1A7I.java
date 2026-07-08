package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.dataChannel.VideoViewMeasureEvent;
import com.bytedance.android.livesdk.livesetting.other.GameDualDeviceVerticalFullVideoEnabled;
import com.bytedance.android.livesdk.livesetting.other.LiveEnableCropSurfaceExp;
import com.bytedance.android.livesdk.livesetting.other.LiveEnableGpuOptExp;
import com.bytedance.android.livesdk.livesetting.other.LiveOptVideoSizeExp;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A7I, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A7I extends SurfaceView implements C0IF5, InterfaceC1090410eTv {
    public static Method LLJJ;
    public C1A7K LL;
    public C1A7L LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public final float LLILZLL;
    public float LLIZ;
    public DataChannel LLIZLLLIL;
    public long LLJ;
    public C1090400eTu LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public C1A7H LLJILLL;

    @Override // X.InterfaceC464060IHs
    public final void LIZIZ() {
        this.LLILLL = 0;
        this.LLILZ = 0;
    }

    @Override // X.C0IF5
    public /* bridge */ /* synthetic */ void setSmoothEnterHandler(C1A7N c1a7n) {
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

    @Override // X.InterfaceC464060IHs
    public final void reset() {
        C827750WdZ.LIZ("RenderView", "SurfaceView:reset");
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        C1A7L c1a7l;
        super.onDetachedFromWindow();
        if (C19741012Lo.LIZ(true)) {
            setClipBounds(null);
            C1A7K c1a7k = this.LL;
            if (c1a7k != null) {
                HandlerHook.viewRemoveCallbacks(this, c1a7k);
            }
        }
        Rect rect = C464030IHp.LJIIIZ;
        if (Build.VERSION.SDK_INT >= 30 && GameDualDeviceVerticalFullVideoEnabled.enable() && (c1a7l = this.LLILLJJLI) != null) {
            HandlerHook.viewRemoveCallbacks(this, c1a7l);
        }
        this.LLJILJIL = false;
        this.LLJILJILJ = false;
    }

    @Override // X.InterfaceC1090410eTv
    public int getCallCount() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC464060IHs
    public int getStreamHeight() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC464060IHs
    public int getStreamWidth() {
        return this.LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.1A7L] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.1A7K] */
    public C1A7I(Context context) {
        super(context);
        this.LLILZIL = 2;
        this.LLILZLL = 1.7777778f;
        this.LLIZ = 1.7777778f;
        if (Build.VERSION.SDK_INT >= 30) {
            if (LiveEnableCropSurfaceExp.isEnable()) {
                this.LL = new Runnable() { // from class: X.1A7K
                    public final void LIZ() {
                        C1A7I c1a7i = this.LL;
                        c1a7i.getClass();
                        if (C19741012Lo.LIZ(true)) {
                            Rect rect = C464030IHp.LJIIIZ;
                            if (C0IKK.LIZIZ(Long.valueOf(c1a7i.LLJ))) {
                                return;
                            }
                            try {
                                int i = c1a7i.LLILZIL;
                                Object parent = c1a7i.getParent();
                                Rect rectLIZJ = C19741012Lo.LIZJ(i, parent instanceof View ? (View) parent : null, c1a7i);
                                if (Intrinsics.LJFF(c1a7i.getClipBounds(), rectLIZJ)) {
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
                                c1a7i.setClipBounds(rectLIZJ);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C20441214yg.LJFF("RenderViewCorp", "cropVideoAboveAndroidApi30: ", th);
                            }
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SurfaceRenderView@607d.init$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SurfaceRenderView@607d.init$1");
                    }
                };
            }
            Rect rect = C464030IHp.LJIIIZ;
            if (GameDualDeviceVerticalFullVideoEnabled.enable()) {
                this.LLILLJJLI = new Runnable() { // from class: X.1A7L
                    public final void LIZ() {
                        C1A7I c1a7i = this.LL;
                        c1a7i.getClass();
                        Rect rect2 = C464030IHp.LJIIIZ;
                        if (C0IKK.LIZIZ(Long.valueOf(c1a7i.LLJ))) {
                            try {
                                Rect rectLIZJ = C0IKK.LIZJ(Long.valueOf(c1a7i.LLJ));
                                int i = c1a7i.LLILZIL;
                                Object parent = c1a7i.getParent();
                                Rect rectLIZIZ = C19741012Lo.LIZIZ(rectLIZJ, i, parent instanceof View ? (View) parent : null, c1a7i);
                                if (Intrinsics.LJFF(c1a7i.getClipBounds(), rectLIZIZ)) {
                                    return;
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("setClipBounds: left:");
                                sbLIZ.append(rectLIZIZ != null ? Integer.valueOf(rectLIZIZ.left) : null);
                                sbLIZ.append(" top:");
                                sbLIZ.append(rectLIZIZ != null ? Integer.valueOf(rectLIZIZ.top) : null);
                                sbLIZ.append(" right:");
                                sbLIZ.append(rectLIZIZ != null ? Integer.valueOf(rectLIZIZ.right) : null);
                                sbLIZ.append(" bottom:");
                                sbLIZ.append(rectLIZIZ != null ? Integer.valueOf(rectLIZIZ.bottom) : null);
                                C20441214yg.LIZIZ("RenderViewCorp", C2188811AlT.LIZIZ(sbLIZ));
                                c1a7i.setClipBounds(rectLIZIZ);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C20441214yg.LJFF("RenderViewCorp", "cropVideoByRect: ", th);
                            }
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SurfaceRenderView@607d.init$2");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SurfaceRenderView@607d.init$2");
                    }
                };
            }
        }
    }

    @Override // X.InterfaceC1090410eTv
    public final void LLZZ(ViewGroup.LayoutParams layoutParams) {
        Integer numValueOf;
        int iHashCode;
        if (this.LLJILJILJ && (layoutParams instanceof FrameLayout.LayoutParams)) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == 0 && layoutParams2.rightMargin == 0) {
                layoutParams2.gravity = 49;
            }
        }
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
        C20441214yg.LJIIIZ("ttlive_enter_room_log_RenderView", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0IF5
    public void setDataChannel(DataChannel dataChannel) {
        this.LLIZLLLIL = dataChannel;
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
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(", l:");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            sbLIZ2.append(marginLayoutParams.leftMargin);
            sbLIZ2.append(", t:");
            sbLIZ2.append(marginLayoutParams.topMargin);
            sbLIZ2.append(", r:");
            sbLIZ2.append(marginLayoutParams.rightMargin);
            sbLIZ2.append(", b:");
            sbLIZ2.append(marginLayoutParams.bottomMargin);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        boolean z = layoutParams instanceof FrameLayout.LayoutParams;
        if (z) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(", gravity:");
            sbLIZ3.append(((FrameLayout.LayoutParams) layoutParams).gravity);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        C20441214yg.LIZIZ("ttlive_enter_room_log_RenderView", strLIZIZ);
        if (z) {
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("params isn't FrameLayout.LayoutParams. params: ");
        sbLIZ4.append(layoutParams);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ4));
    }

    @Override // X.C0IF5
    public /* bridge */ /* synthetic */ void setRoomID(Long l) {
        setRoomID(l.longValue());
    }

    @Override // X.InterfaceC464060IHs
    public void setScaleType(int i) {
        LIZJ(i, "");
    }

    @Override // X.InterfaceC464060IHs
    public void setTargetScaleResolution(float f) {
        this.LLIZ = f;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        Context context;
        Resources resources;
        Configuration configuration;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setTranslationY: ");
        sbLIZ.append(f);
        C20441214yg.LIZIZ("test_lzk_dual_device_surfaceRenderView", C2188811AlT.LIZIZ(sbLIZ));
        Rect rect = C464030IHp.LJIIIZ;
        if (!C0IKK.LIZIZ(Long.valueOf(this.LLJ)) || ((context = getContext()) != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 2)) {
            super.setTranslationY(f);
        } else {
            super.setTranslationY(0.0f);
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        C1A7H c1a7h = this.LLJILLL;
        if (c1a7h != null) {
            c1a7h.LIZ(i, this.LLJ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("surfaceviewsetVisibility ");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("ttlive_enter_room_log_RenderView", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0IF5
    public void setVisibilityChangeListener(C1A7H c1a7h) {
        this.LLJILLL = c1a7h;
    }

    public void setRoomID(long j) {
        this.LLJ = j;
    }

    @Override // X.InterfaceC464060IHs
    public final void LIZJ(int i, String str) {
        FrameLayout.LayoutParams layoutParams;
        this.LLJILJILJ = false;
        if (LiveOptVideoSizeExp.isOptPerf() && i == 2) {
            this.LLILZIL = 0;
        } else if (LiveOptVideoSizeExp.isOptPic() && i == 2) {
            this.LLILZIL = 0;
            this.LLJILJIL = true;
        } else if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).eG0() && i == 2) {
            this.LLILZIL = 0;
            this.LLJILJILJ = true;
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null && layoutParams.leftMargin == 0 && layoutParams.rightMargin == 0 && layoutParams.gravity != 49) {
                layoutParams.gravity = 49;
                requestLayout();
            }
        } else {
            this.LLILZIL = i;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SurfaceView:setScaleType :");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(" from:");
        sbLIZ.append(str);
        sbLIZ.append(" hc = ");
        sbLIZ.append(hashCode());
        C827750WdZ.LIZ("RenderView", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        int i3;
        float f2;
        float f3;
        int i4;
        String str;
        int i5;
        int i6;
        View view;
        int suggestedMinimumWidth = getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight();
        int suggestedMinimumHeight = getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom();
        int i7 = 0;
        if (suggestedMinimumHeight == 0 && (getParent() instanceof ViewGroup)) {
            Object parent = getParent();
            suggestedMinimumHeight = (!(parent instanceof ViewGroup) || (view = (View) parent) == null) ? 0 : view.getHeight();
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                suggestedMinimumWidth = size;
            }
        } else {
            suggestedMinimumWidth = Math.min(suggestedMinimumWidth, size);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 1073741824) {
                suggestedMinimumHeight = size2;
            }
        } else {
            suggestedMinimumHeight = Math.min(suggestedMinimumHeight, size2);
        }
        int i8 = this.LLILZIL;
        if (i8 != 2 && (i5 = this.LLILLL) != 0 && (i6 = this.LLILZ) != 0) {
            if (i8 == 4) {
                f3 = i5;
                float f4 = i6;
                float f5 = f3 / f4;
                float f6 = this.LLIZ;
                if (f5 > f6 && f6 > 0.0f) {
                    i4 = (int) (suggestedMinimumWidth / f6);
                    i7 = (int) (i4 * f5);
                } else {
                    i4 = (int) (((suggestedMinimumWidth * 1.0f) / f3) * f4);
                    if (i4 > suggestedMinimumHeight) {
                        f2 = (suggestedMinimumHeight * 1.0f) / f4;
                        i7 = (int) (f3 * f2);
                        i4 = suggestedMinimumHeight;
                    }
                    i7 = suggestedMinimumWidth;
                }
            } else if (i8 == 1) {
                i7 = suggestedMinimumWidth;
                i4 = suggestedMinimumHeight;
            } else if (i8 == 0) {
                float f7 = i5;
                float f8 = i6;
                float f9 = ((suggestedMinimumWidth * 1.0f) / f7) * f8;
                float f10 = suggestedMinimumHeight;
                if (f9 > f10) {
                    i7 = (int) (f7 * ((f10 * 1.0f) / f8));
                    i4 = suggestedMinimumHeight;
                } else {
                    i4 = (int) f9;
                    i7 = suggestedMinimumWidth;
                }
                if (LiveOptVideoSizeExp.isOptPic() && this.LLJILJIL) {
                    i7 += 9;
                    i4 += 9;
                }
            } else if (i8 == 3) {
                float f11 = (suggestedMinimumWidth * 1.0f) / i5;
                i4 = (int) (i6 * f11);
                Rect rect = C464030IHp.LJIIIZ;
                if (C0IKK.LIZJ(Long.valueOf(this.LLJ)) == null) {
                    i7 = suggestedMinimumWidth;
                } else {
                    float f12 = (r0.bottom - r0.top) / 1000.0f;
                    float f13 = suggestedMinimumHeight;
                    if (i4 * f12 > f13) {
                        i4 = (int) (f13 / f12);
                        float f14 = (f13 * 1.0f) / (this.LLILZ * f12);
                        i7 = (int) (this.LLILLL * f14);
                        f11 = f14;
                    } else {
                        i7 = suggestedMinimumWidth;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("radioH: ");
                    sbLIZ.append(f12);
                    sbLIZ.append(", heightR: ");
                    sbLIZ.append(i4);
                    sbLIZ.append(", scale: ");
                    sbLIZ.append(f11);
                    sbLIZ.append(", widthR: ");
                    sbLIZ.append(i7);
                    sbLIZ.append(", height: ");
                    sbLIZ.append(suggestedMinimumHeight);
                    sbLIZ.append(", width: ");
                    sbLIZ.append(suggestedMinimumWidth);
                    C20441214yg.LIZIZ("test_lzk_dual_device_surfaceRenderView", C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                i4 = 0;
            }
        } else {
            float f15 = suggestedMinimumHeight;
            float f16 = suggestedMinimumWidth;
            float f18 = f15 / f16;
            int i9 = this.LLILLL;
            if (i9 != 0 && (i3 = this.LLILZ) != 0) {
                f = i3 / i9;
            } else {
                f = this.LLILZLL;
                i9 = 9;
                i3 = 16;
            }
            if (f > f18) {
                i4 = (int) (i3 * ((f16 * 1.0f) / i9));
                i7 = suggestedMinimumWidth;
            } else {
                f2 = (f15 * 1.0f) / i3;
                f3 = i9;
                i7 = (int) (f3 * f2);
                i4 = suggestedMinimumHeight;
            }
        }
        int i10 = this.LLILZIL;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        str = "";
                    } else {
                        str = "FIT_WIDTH";
                    }
                } else {
                    str = "CENTER_CROP";
                }
            } else {
                str = "FILL_PARENT";
            }
        } else {
            str = "CENTER_INSIDE";
        }
        C827750WdZ.LIZ("RenderView", "SurfaceView:onMeasure width:" + i7 + " height:" + i4 + " surfaceViewLayout:" + this.LLILZIL + " mVideoWidth:" + this.LLILLL + " mVideoHeight:" + this.LLILZ + ", hc=" + hashCode() + "，Measure W/H + " + suggestedMinimumWidth + " + " + suggestedMinimumHeight + ", surfaceViewLayout=" + str + ", hc=" + hashCode());
        setMeasuredDimension(i7, i4);
        DataChannel dataChannel = this.LLIZLLLIL;
        if (dataChannel != null) {
            dataChannel.FQ2(VideoViewMeasureEvent.class);
        }
        C1A7K c1a7k = this.LL;
        if (c1a7k != null) {
            HandlerHook.viewPost(this, c1a7k);
        }
        C1A7L c1a7l = this.LLILLJJLI;
        if (c1a7l != null) {
            HandlerHook.viewPost(this, c1a7l);
        }
    }

    @Override // X.InterfaceC464060IHs
    public final void setVideoSize(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SurfaceView:setVideoSize width:");
        sbLIZ.append(i);
        sbLIZ.append(" height:");
        sbLIZ.append(i2);
        C827750WdZ.LIZ("RenderView", C2188811AlT.LIZIZ(sbLIZ));
        if (i > 0 && i2 > 0) {
            this.LLILLL = i;
            this.LLILZ = i2;
            if (LiveEnableGpuOptExp.isEnable()) {
                getHolder().setFixedSize(i, i2);
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
