package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.ui.image.GlobalImageLoadListener;
import com.lynx.tasm.utils.ColorUtils;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0kLJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1315710kLJ extends C1322110kVd {
    public boolean mAutoPlay;
    public C1317680kOU mBigImageHelper;
    public C1313900kIO mBorderRadii;
    public final Object mCallerContext;
    public boolean mConsumeHoverEvent;
    public InterfaceC1320650kTH mControllerForTesting;
    public InterfaceC1320650kTH mControllerListener;
    public boolean mCoverStart;
    public C1325710kbR mCurImageRequest;
    public boolean mDeferInvalidation;
    public boolean mDisableDefaultPlaceholder;
    public final AbstractC1320720kTO mDraweeControllerBuilder;
    public int mFadeDurationMs;
    public boolean mFixFrescoBug;
    public boolean mFrescoNinePatch;
    public GlobalImageLoadListener mGlobalImageLoadListener;
    public C1315720kLK mImageDelegate;
    public int mImageOrigin;
    public InterfaceC1316370kMN mImageRequestBuilderHook;
    public boolean mIsBorderRadiusDirty;
    public boolean mIsDirty;
    public boolean mIsFrescoAttach;
    public boolean mIsFrescoVisible;
    public boolean mIsNoSubSampleMode;
    public boolean mIsPixelated;
    public C1315960kLi mLoaderCallback;
    public LynxBaseUI mLynxBaseUI;
    public int mOverlayColor;
    public float mPreFetchHeight;
    public float mPreFetchWidth;
    public C1323050kX9<?> mRef;
    public boolean mRepeat;
    public InterfaceC1320380kSq mScaleType;
    public int mShowCnt;
    public int mSourceImageHeight;
    public int mSourceImageWidth;
    public long mStartTimeStamp;
    public C1323050kX9<Bitmap> mTempPlaceHolder;
    public boolean mUsePostprocessorScaling;
    public C1316050kLr mWeakImageOriginListener;

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void markDirty() {
        this.mIsDirty = true;
    }

    public void maybeUpdateView() {
        if ((!this.mIsDirty || ((getWidth() <= 0 || getHeight() <= 0) && !this.mImageDelegate.LJIIL)) && this.mPreFetchWidth <= 0.0f && this.mPreFetchHeight <= 0.0f) {
            return;
        }
        if (getWidth() <= 0 || getHeight() <= 0) {
            tryFetchImage((int) this.mPreFetchWidth, (int) this.mPreFetchHeight, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        } else {
            maybeUpdateViewInternal(getWidth(), getHeight(), getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        com_lynx_tasm_ui_image_FrescoImageView_com_bytedance_tt_reliability_monitor_viewchecker_BitmapCrashChecker_onDraw(this, canvas);
    }

    public void onImageRequestLoaded() {
    }

    public void onPostprocessorPreparing(List<InterfaceC1291910jiv> list) {
    }

    public void destroy() {
        C1317680kOU c1317680kOU = this.mBigImageHelper;
        if (c1317680kOU != null) {
            c1317680kOU.LIZJ();
        }
        C1323050kX9<?> c1323050kX9 = this.mRef;
        if (c1323050kX9 != null) {
            c1323050kX9.close();
            this.mRef = null;
        }
        C1315720kLK c1315720kLK = this.mImageDelegate;
        c1315720kLK.LIZLLL = 0;
        c1315720kLK.LJ = 0;
        if (this.mTempPlaceHolder != null) {
            C1331070kk5 hierarchy = getHierarchy();
            if (hierarchy != null) {
                hierarchy.LJIJ(null, 1);
            }
            this.mTempPlaceHolder.close();
            this.mTempPlaceHolder = null;
        }
    }

    public long getBitmapMemorySizeBytes() {
        C1315720kLK c1315720kLK = this.mImageDelegate;
        if (c1315720kLK == null) {
            return 0L;
        }
        return c1315720kLK.LJIILLIIL;
    }

    public int getLoopCount() {
        return this.mImageDelegate.LJJIL;
    }

    public String getSrc() {
        C089P c089p = this.mImageDelegate.LJJ;
        if (c089p != null) {
            return c089p.LIZIZ().toString();
        }
        return null;
    }

    public void onNodeReady() {
        C1315720kLK c1315720kLK = this.mImageDelegate;
        if (c1315720kLK.LJJJJJL) {
            c1315720kLK.LJJJJJL = false;
            if (c1315720kLK.LJIIL) {
                c1315720kLK.LJIIIIZZ();
            }
        }
    }

    public void onSourceSetted() {
        int i = this.mShowCnt + 1;
        this.mShowCnt = i;
        C1317680kOU c1317680kOU = this.mBigImageHelper;
        if (c1317680kOU != null) {
            c1317680kOU.LIZLLL = i;
            c1317680kOU.LIZJ();
        }
    }

    @Override // X.C1322090kVb
    public void onAttach() {
        this.mStartTimeStamp = System.currentTimeMillis();
        super.onAttach();
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mIsFrescoVisible) {
            setFrescoVisible();
        }
        if (this.mIsFrescoAttach) {
            setFrescoAttach();
        }
    }

    public boolean pauseAnimate() {
        if (getController() == null || getController().LIZ() == null) {
            return false;
        }
        Animatable animatableLIZ = getController().LIZ();
        if (animatableLIZ instanceof AnimatedDrawable2) {
            return C1315790kLR.LIZLLL((AnimatedDrawable2) animatableLIZ);
        }
        return false;
    }

    public void setFrescoVisible() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setVisible(true, false);
        }
    }

    public void startAnimate() {
        if (getController() == null || getController().LIZ() == null) {
            return;
        }
        getController().LIZ().start();
    }

    public void stopAnimate() {
        if (getController() == null || getController().LIZ() == null) {
            return;
        }
        getController().LIZ().stop();
    }

    public InterfaceC1320380kSq getFrescoScaleType() {
        return this.mScaleType;
    }

    public void setFrescoAttach() {
        doAttach();
    }

    private float[] adjustBorderRadiusArrayWithPadding(float[] fArr) {
        if (fArr != null && fArr.length == 8) {
            float[] fArr2 = new float[8];
            int i = 0;
            fArr2[0] = getPaddingLeft();
            fArr2[1] = getPaddingTop();
            fArr2[2] = getPaddingRight();
            fArr2[3] = getPaddingTop();
            fArr2[4] = getPaddingRight();
            fArr2[5] = getPaddingBottom();
            fArr2[6] = getPaddingLeft();
            fArr2[7] = getPaddingBottom();
            do {
                fArr2[i] = Math.max(0.0f, fArr[i] - fArr2[i]);
                i++;
            } while (i < 8);
            return fArr2;
        }
        return null;
    }

    public static C1331070kk5 buildHierarchy(Context context) {
        C1331090kk7 c1331090kk7 = new C1331090kk7(context.getResources());
        c1331090kk7.LJIIZILJ = null;
        return c1331090kk7.LIZ();
    }

    public void com_lynx_tasm_ui_image_FrescoImageView__onDraw$___twin___(Canvas canvas) {
        DisplayMetrics displayMetricsLIZ;
        s sVar;
        Bitmap underlyingBitmap;
        C1315960kLi c1315960kLi = this.mLoaderCallback;
        if (c1315960kLi != null) {
            c1315960kLi.LIZIZ(getWidth(), getHeight());
            if (this.mLoaderCallback.LIZ()) {
                return;
            }
        }
        C1323050kX9<?> c1323050kX9 = this.mRef;
        if (c1323050kX9 != null && c1323050kX9.LJIILLIIL() && this.mImageDelegate.LJIJI) {
            Object obj = this.mRef.get();
            if (obj instanceof AbstractC1325130kaV) {
                underlyingBitmap = ((AbstractC1325130kaV) obj).getUnderlyingBitmap();
            } else if (obj instanceof Bitmap) {
                underlyingBitmap = (Bitmap) obj;
            }
            if (underlyingBitmap != null) {
                LynxLog.i("Lynx Android Image", "draw image from local cache");
                int width = canvas.getWidth();
                int height = canvas.getHeight();
                int width2 = underlyingBitmap.getWidth();
                int height2 = underlyingBitmap.getHeight();
                InterfaceC1320380kSq interfaceC1320380kSq = this.mScaleType;
                C1315720kLK c1315720kLK = this.mImageDelegate;
                if (C1315900kLc.customDraw(width, height, width2, height2, interfaceC1320380kSq, c1315720kLK.LJI, c1315720kLK.LJII, canvas, underlyingBitmap)) {
                    return;
                }
            }
        }
        if (!this.mFrescoNinePatch && this.mImageDelegate.LJI != null && !LynxEnv.inst().disableBigImageHelper()) {
            LynxLog.i("Lynx Android Image", "load origin bitmap to draw image with cap-insets");
            if (this.mBigImageHelper == null) {
                this.mBigImageHelper = new C1317680kOU(new InterfaceC1317720kOY() { // from class: X.0jwM
                    @Override // X.InterfaceC1317720kOY
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1317720kOY
                    public final void LIZJ() {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            this.LIZ.invalidate();
                        } else {
                            this.LIZ.postInvalidate();
                        }
                    }
                }, this.mShowCnt);
            }
            int i = this.mShowCnt;
            float width3 = getWidth();
            float height3 = getHeight();
            boolean z = this.mRepeat;
            InterfaceC1320380kSq interfaceC1320380kSq2 = this.mScaleType;
            String src = getSrc();
            Point pointLJFF = C1317680kOU.LJFF(canvas);
            C1315720kLK c1315720kLK2 = this.mImageDelegate;
            if (this.mBigImageHelper.LIZLLL(getContext(), canvas, this.mCurImageRequest, new C1317710kOX(i, width3, height3, z, interfaceC1320380kSq2, src, pointLJFF, c1315720kLK2.LJI, c1315720kLK2.LJII))) {
                return;
            }
        }
        if (TraceController.isTracingStarted()) {
            HashMap map = new HashMap();
            LynxBaseUI lynxBaseUI = this.mLynxBaseUI;
            if (lynxBaseUI != null && (sVar = lynxBaseUI.mContext) != null) {
                map.put("instance_id", String.valueOf(sVar.LLJLILLLLZIIL));
            }
            String str = this.mImageDelegate.LJIJJLI;
            if (str != null && str.startsWith("http")) {
                map.put("src", this.mImageDelegate.LJIJJLI);
            }
            TraceEvent.LIZJ("FrescoImageView.onDraw", map);
        }
        if (!LynxEnv.inst().disableBigImageHelper() && (this.mIsNoSubSampleMode || (getController() != null && getController().LIZ() == null && this.mImageDelegate.LJI == null))) {
            if (this.mBigImageHelper == null) {
                this.mBigImageHelper = new C1317680kOU(new InterfaceC1317720kOY() { // from class: X.0jwM
                    @Override // X.InterfaceC1317720kOY
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1317720kOY
                    public final void LIZJ() {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            this.LIZ.invalidate();
                        } else {
                            this.LIZ.postInvalidate();
                        }
                    }
                }, this.mShowCnt);
            }
            int i2 = this.mShowCnt;
            float width4 = getWidth();
            float height4 = getHeight();
            boolean z2 = this.mRepeat;
            InterfaceC1320380kSq interfaceC1320380kSq3 = this.mScaleType;
            String src2 = getSrc();
            Point pointLJFF2 = C1317680kOU.LJFF(canvas);
            C1315720kLK c1315720kLK3 = this.mImageDelegate;
            C1317710kOX c1317710kOX = new C1317710kOX(i2, width4, height4, z2, interfaceC1320380kSq3, src2, pointLJFF2, c1315720kLK3.LJI, c1315720kLK3.LJII);
            if (this.mIsNoSubSampleMode) {
                C1317680kOU c1317680kOU = this.mBigImageHelper;
                Context context = getContext();
                C1325710kbR c1325710kbR = this.mCurImageRequest;
                c1317680kOU.LJ = true;
                C1317700kOW c1317700kOW = c1317680kOU.LIZIZ;
                if (c1317700kOW != null && c1317700kOW.LIZLLL != null && c1317700kOW.LJFF.LIZ == i2) {
                    c1317680kOU.LJ(canvas, c1317700kOW);
                } else {
                    c1317680kOU.LIZJ();
                    c1317680kOU.LJII(context, c1325710kbR, c1317710kOX);
                    c1317680kOU.LJ(canvas, c1317680kOU.LIZIZ);
                }
                if (TraceController.isTracingStarted()) {
                    TraceEvent.LJII("FrescoImageView.onDraw");
                    return;
                }
                return;
            }
            LynxBaseUI lynxBaseUI2 = this.mLynxBaseUI;
            if (lynxBaseUI2 == null) {
                displayMetricsLIZ = DisplayMetricsHolder.LIZ(getContext());
            } else {
                displayMetricsLIZ = lynxBaseUI2.mContext.LLJJJ;
            }
            C1317680kOU c1317680kOU2 = this.mBigImageHelper;
            Context context2 = getContext();
            C1325710kbR c1325710kbR2 = this.mCurImageRequest;
            c1317680kOU2.getClass();
            if (displayMetricsLIZ != null && (width4 > displayMetricsLIZ.widthPixels * 3 || height4 > displayMetricsLIZ.heightPixels || z2)) {
                c1317680kOU2.LJ = false;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("drawBigImage: w:");
                sbLIZ.append(width4);
                sbLIZ.append(", h:");
                sbLIZ.append(height4);
                LynxLog.d("LynxImageHelper", C2188811AlT.LIZIZ(sbLIZ));
                C1317700kOW c1317700kOW2 = c1317680kOU2.LIZIZ;
                if (c1317700kOW2 != null && c1317700kOW2.LIZLLL != null && c1317700kOW2.LJFF.LIZ == i2) {
                    c1317680kOU2.LJ(canvas, c1317700kOW2);
                } else {
                    c1317680kOU2.LIZJ();
                    c1317680kOU2.LJII(context2, c1325710kbR2, c1317710kOX);
                    c1317680kOU2.LJ(canvas, c1317680kOU2.LIZIZ);
                }
                if (TraceController.isTracingStarted()) {
                    TraceEvent.LJII("FrescoImageView.onDraw");
                    return;
                }
                return;
            }
        }
        try {
            super.onDraw(canvas);
        } catch (OutOfMemoryError e) {
            TryCatchGuardChecker.doCheck(e);
            LynxLog.e("FrescoImageView", e.getMessage());
        }
        if (TraceController.isTracingStarted()) {
            TraceEvent.LJII("FrescoImageView.onDraw");
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0kLr, X.0kbN] */
    public C1325700kbQ createImageRequestBuilder(Uri uri) {
        C1325700kbQ c1325700kbQLIZLLL = this.mImageDelegate.LIZLLL(uri);
        InterfaceC1316370kMN interfaceC1316370kMN = this.mImageRequestBuilderHook;
        if (interfaceC1316370kMN != null) {
            interfaceC1316370kMN.LIZ(c1325700kbQLIZLLL);
        }
        if (!C1299180jue.LIZ.booleanValue()) {
            ?? r0 = new C1320270kSf(this) { // from class: X.0kLr
                public final WeakReference<C1315710kLJ> LIZ;

                {
                    this.LIZ = new WeakReference<>(this);
                }

                @Override // X.C1320270kSf, X.InterfaceC1325690kbP
                public final void LJIIIZ(String str, String str2, boolean z) {
                    C1315710kLJ c1315710kLJ = this.LIZ.get();
                    if (c1315710kLJ != null) {
                        c1315710kLJ.mImageOrigin = C1327250kdv.LIZ(str2);
                    }
                }
            };
            this.mWeakImageOriginListener = r0;
            c1325700kbQLIZLLL.LJIIZILJ = r0;
        }
        return c1325700kbQLIZLLL;
    }

    public void fixFrescoWebPBug(boolean z) {
        this.mFixFrescoBug = z;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (!super.onHoverEvent(motionEvent) && !this.mConsumeHoverEvent) {
            return false;
        }
        return true;
    }

    @Override // X.C1322090kVb, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("catch onTouchEvent exception: ");
            sbLIZ.append(th.toString());
            LynxLog.e("Lynx FrescoImageView", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }

    public void setAsyncRedirect(boolean z) {
        this.mImageDelegate.LJJJJL = z;
    }

    public void setAutoPlay(boolean z) {
        this.mAutoPlay = z;
    }

    public void setAutoSize(boolean z) {
        C1315720kLK c1315720kLK = this.mImageDelegate;
        c1315720kLK.LJIIL = z;
        if (!z || (c1315720kLK.LJ != 0 && c1315720kLK.LIZLLL != 0)) {
            c1315720kLK.LJIIIIZZ();
        }
        c1315720kLK.LJJII.LIZ();
    }

    public void setAwaitLocalCache(boolean z) {
        this.mImageDelegate.LJIJJ = z;
    }

    public void setBitmapConfig(Bitmap.Config config) {
        C1315720kLK c1315720kLK = this.mImageDelegate;
        c1315720kLK.LJIILL = config;
        c1315720kLK.LJJII.LIZ();
    }

    public void setBlurRadius(int i) {
        this.mImageDelegate.LJIIZILJ(i);
    }

    public void setBorderRadius(C1313900kIO c1313900kIO) {
        this.mBorderRadii = c1313900kIO;
        this.mIsDirty = true;
        this.mIsBorderRadiusDirty = true;
    }

    public void setCacheKeyPathOnly(boolean z) {
        this.mImageDelegate.LJIIJJI = z;
    }

    public void setCapInsets(String str) {
        C1315720kLK c1315720kLK = this.mImageDelegate;
        c1315720kLK.LJI = str;
        c1315720kLK.LJJII.LIZ();
    }

    public void setCapInsetsScale(String str) {
        C1315720kLK c1315720kLK = this.mImageDelegate;
        c1315720kLK.LJII = str;
        c1315720kLK.LJJII.LIZ();
    }

    public void setConsumeHoverEvent(boolean z) {
        this.mConsumeHoverEvent = z;
    }

    public void setControllerListener(InterfaceC1320650kTH interfaceC1320650kTH) {
        this.mControllerForTesting = interfaceC1320650kTH;
        this.mIsDirty = true;
        maybeUpdateView();
    }

    public void setCoverStart(boolean z) {
        this.mCoverStart = z;
        this.mIsDirty = true;
    }

    public void setDeferInvalidation(boolean z) {
        this.mDeferInvalidation = z;
    }

    public void setDisableDefaultPlaceHolder(boolean z) {
        this.mDisableDefaultPlaceholder = z;
    }

    public void setEnableCustomGifDecoder(boolean z) {
        this.mImageDelegate.LJJJJJ = z;
    }

    public void setEnableImageSR(boolean z) {
        C1315720kLK c1315720kLK = this.mImageDelegate;
        c1315720kLK.LJJJJLI = z;
        c1315720kLK.LJIILL = Bitmap.Config.ARGB_8888;
    }

    public void setEnableReportInfo(boolean z) {
        this.mImageDelegate.LJJJI = z;
    }

    public void setEnableResourceHint(boolean z) {
        this.mImageDelegate.LJFF = z;
    }

    public void setExtraLoadInfo(boolean z) {
        this.mImageDelegate.LJJJ = z;
    }

    public void setFadeDuration(int i) {
        this.mFadeDurationMs = i;
    }

    public void setFrescoNinePatch(boolean z) {
        this.mFrescoNinePatch = z;
    }

    public void setHeaders(ReadableMap readableMap) {
        this.mImageDelegate.LJJIIJ = readableMap;
    }

    public void setImageCacheChoice(String str) {
        this.mImageDelegate.LJIIIZ = str;
    }

    public void setImageCustomParams(ReadableMap readableMap) {
        this.mImageDelegate.LJIJ(readableMap);
    }

    public void setImageEvents(Map<String, C1299120juY> map) {
        this.mImageDelegate.LJIJI(map);
    }

    public void setImageLoaderCallback(C1315960kLi c1315960kLi) {
        this.mLoaderCallback = c1315960kLi;
    }

    public void setImagePlaceHolderHashConfig(ReadableMap readableMap) {
        this.mImageDelegate.LJIJJ(readableMap);
    }

    public void setImageRedirectListener(InterfaceC1316380kMO interfaceC1316380kMO) {
        this.mImageDelegate.LJJIFFI = interfaceC1316380kMO;
    }

    public void setImageRequestBuilderHook(InterfaceC1316370kMN interfaceC1316370kMN) {
        this.mImageRequestBuilderHook = interfaceC1316370kMN;
    }

    public void setImageRequestPriority(String str) {
        this.mImageDelegate.LJIIIIZZ = str;
    }

    public void setImageSRScale(float f) {
        C1315720kLK c1315720kLK = this.mImageDelegate;
        if (f > 0.0f) {
            c1315720kLK.LJJJJLI = true;
            c1315720kLK.LJIILL = Bitmap.Config.ARGB_8888;
            c1315720kLK.LJJJJLL = f;
        } else {
            c1315720kLK.LJJJJLI = false;
            c1315720kLK.LJJJJLL = 0.0f;
        }
    }

    public void setImageTransitionStyle(String str) {
        if ("fadeIn".equals(str)) {
            this.mFadeDurationMs = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        } else {
            this.mFadeDurationMs = 0;
        }
    }

    public void setIsPixelated(boolean z) {
        this.mIsPixelated = z;
        this.mIsDirty = true;
    }

    public void setLocalCache(boolean z) {
        this.mImageDelegate.LJIJI = z;
    }

    public void setLoopCount(int i) {
        this.mImageDelegate.LJJIL = i;
    }

    public void setLynxBaseUI(LynxBaseUI lynxBaseUI) {
        this.mLynxBaseUI = lynxBaseUI;
        this.mImageDelegate.LJJIIZ = lynxBaseUI;
    }

    public void setNoSubSampleMode(boolean z) {
        this.mIsNoSubSampleMode = z;
        this.mImageDelegate.LJJLIIIJL = z;
    }

    public void setOverlayColor(int i) {
        this.mOverlayColor = i;
        this.mIsDirty = true;
    }

    public void setPlaceholder(String str) {
        this.mImageDelegate.LJIL(null, str);
    }

    public void setPreFetchHeight(float f) {
        this.mPreFetchHeight = f;
    }

    public void setPreFetchWidth(float f) {
        this.mPreFetchWidth = f;
    }

    public void setProgressiveRendering(boolean z) {
        this.mImageDelegate.LJJLIIIJJI = z;
    }

    public void setProgressiveRenderingEnabled(boolean z) {
        this.mImageDelegate.LJIILJJIL = z;
    }

    public void setRegionToDecode(Rect rect) {
        C1315720kLK c1315720kLK = this.mImageDelegate;
        if (rect == null) {
            c1315720kLK.LJJLIIIJJIZ = null;
        } else {
            c1315720kLK.getClass();
            c1315720kLK.LJJLIIIJJIZ = new Rect(rect);
        }
        this.mIsDirty = true;
    }

    public void setRepeat(boolean z) {
        this.mRepeat = z;
    }

    public void setResizeMethod(EnumC1316020kLo enumC1316020kLo) {
        C1315720kLK c1315720kLK = this.mImageDelegate;
        c1315720kLK.LJIIZILJ = enumC1316020kLo;
        c1315720kLK.LJJII.LIZ();
    }

    public void setScaleType(InterfaceC1320380kSq interfaceC1320380kSq) {
        this.mScaleType = interfaceC1320380kSq;
        this.mIsDirty = true;
    }

    public void setSimpleCacheKey(boolean z) {
        this.mImageDelegate.LJIIJ = z;
    }

    public void setSmoothAnimation(boolean z) {
        this.mImageDelegate.LJJIZ = z;
    }

    public void setSource(String str) {
        this.mImageDelegate.LJJI(str);
    }

    public void setSrc(String str) {
        this.mImageDelegate.LJJ(str, true);
    }

    public void setSrcSkippingRedirection(String str) {
        this.mImageDelegate.LJJ(str, false);
    }

    public void setTintColor(String str) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (!ColorUtils.LIZ(str)) {
            porterDuffColorFilter = null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(ColorUtils.LIZIZ(str), PorterDuff.Mode.SRC_IN);
        }
        if (getHierarchy() != null) {
            getHierarchy().LJI.setColorFilter(porterDuffColorFilter);
        }
    }

    public static void com_lynx_tasm_ui_image_FrescoImageView_com_bytedance_tt_reliability_monitor_viewchecker_BitmapCrashChecker_onDraw(C1315710kLJ c1315710kLJ, Canvas canvas) {
        try {
            c1315710kLJ.com_lynx_tasm_ui_image_FrescoImageView__onDraw$___twin___(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, c1315710kLJ);
            throw e;
        }
    }

    public int bitmapMemorySize(int i, int i2) {
        C1315720kLK c1315720kLK = this.mImageDelegate;
        if (c1315720kLK == null) {
            return 0;
        }
        return c1315720kLK.LIZ(i, i2);
    }

    public void setPlaceholder(String str, boolean z) {
        C1315720kLK c1315720kLK = this.mImageDelegate;
        if (z) {
            c1315720kLK.LJIL(null, str);
        } else {
            c1315720kLK.LJIJJLI(str);
        }
    }

    public void setRedirectImageSource(String str, String str2) {
        this.mImageDelegate.LJIL(str, str2);
    }

    public C1315710kLJ(Context context, AbstractC1320720kTO abstractC1320720kTO, GlobalImageLoadListener globalImageLoadListener, Object obj) {
        this(context, abstractC1320720kTO, globalImageLoadListener, obj, null);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            maybeUpdateView();
        }
    }

    public void updateRedirectCheckResult(String str, String str2, boolean z, boolean z2) {
        this.mImageDelegate.LJJIII(str, str2, z, z2);
    }

    public C1315710kLJ(Context context, AbstractC1320720kTO abstractC1320720kTO, GlobalImageLoadListener globalImageLoadListener, Object obj, LynxBaseUI lynxBaseUI) {
        super(context, buildHierarchy(context));
        this.mUsePostprocessorScaling = false;
        this.mSourceImageWidth = 0;
        this.mSourceImageHeight = 0;
        this.mPreFetchWidth = -1.0f;
        this.mPreFetchHeight = -1.0f;
        this.mIsFrescoVisible = false;
        this.mIsFrescoAttach = false;
        this.mFrescoNinePatch = false;
        this.mAutoPlay = true;
        this.mIsPixelated = false;
        this.mFadeDurationMs = 0;
        this.mBorderRadii = null;
        this.mIsNoSubSampleMode = false;
        this.mRef = null;
        this.mDisableDefaultPlaceholder = false;
        this.mTempPlaceHolder = null;
        this.mConsumeHoverEvent = false;
        this.mLynxBaseUI = null;
        this.mImageOrigin = -1;
        this.mScaleType = InterfaceC1320380kSq.LIZ;
        this.mDraweeControllerBuilder = abstractC1320720kTO;
        this.mGlobalImageLoadListener = globalImageLoadListener;
        this.mCallerContext = obj;
        this.mShowCnt = 0;
        this.mRepeat = false;
        this.mCoverStart = false;
        C1315720kLK c1315720kLK = new C1315720kLK(context, new InterfaceC1315950kLh() { // from class: X.0kLQ
            @Override // X.InterfaceC1315950kLh
            public final void LIZ() {
                this.LIZ.markDirty();
            }

            @Override // X.InterfaceC1315950kLh
            public final void LIZJ() {
                this.LIZ.maybeUpdateView();
            }

            @Override // X.InterfaceC1315950kLh
            public final void LJFF() {
                C1315710kLJ c1315710kLJ = this.LIZ;
                c1315710kLJ.tryFetchImageFromFresco(c1315710kLJ.getWidth(), this.LIZ.getHeight(), this.LIZ.getPaddingLeft(), this.LIZ.getPaddingTop(), this.LIZ.getPaddingRight(), this.LIZ.getPaddingBottom());
            }

            @Override // X.InterfaceC1315950kLh
            public final boolean LJI() {
                return this.LIZ.mUsePostprocessorScaling;
            }

            @Override // X.InterfaceC1315950kLh
            public final void LJII() {
                this.LIZ.onSourceSetted();
                C1323050kX9<?> c1323050kX9 = this.LIZ.mRef;
                if (c1323050kX9 != null) {
                    c1323050kX9.close();
                    this.LIZ.mRef = null;
                }
                C1315710kLJ c1315710kLJ = this.LIZ;
                if (c1315710kLJ.mTempPlaceHolder != null) {
                    C1331070kk5 hierarchy = c1315710kLJ.getHierarchy();
                    if (hierarchy != null) {
                        hierarchy.LJIJ(null, 1);
                    }
                    this.LIZ.mTempPlaceHolder.close();
                    this.LIZ.mTempPlaceHolder = null;
                }
            }

            @Override // X.InterfaceC1315950kLh
            public final void clear() {
                this.LIZ.setController(null);
            }

            @Override // X.InterfaceC1315950kLh
            public final void LIZIZ(C1323050kX9<?> c1323050kX9) {
                C1323050kX9<?> c1323050kX92;
                Bitmap underlyingBitmap;
                C1323050kX9<?> c1323050kX93 = this.LIZ.mRef;
                if (c1323050kX93 != null) {
                    c1323050kX93.close();
                    this.LIZ.mRef = null;
                }
                this.LIZ.mRef = c1323050kX9.clone();
                C1315710kLJ c1315710kLJ = this.LIZ;
                if (c1315710kLJ.mLoaderCallback != null && (c1323050kX92 = c1315710kLJ.mRef) != null) {
                    Object obj2 = c1323050kX92.get();
                    if (obj2 instanceof AbstractC1325130kaV) {
                        underlyingBitmap = ((AbstractC1325130kaV) obj2).getUnderlyingBitmap();
                    } else {
                        if (obj2 instanceof Bitmap) {
                            underlyingBitmap = (Bitmap) obj2;
                        }
                        LynxLog.e("FrescoImageView", "onLocalCacheGet error bitmap is null or recycled");
                    }
                    if (underlyingBitmap != null && !underlyingBitmap.isRecycled()) {
                        this.LIZ.mLoaderCallback.LJ(underlyingBitmap.getWidth(), underlyingBitmap.getHeight());
                    } else {
                        LynxLog.e("FrescoImageView", "onLocalCacheGet error bitmap is null or recycled");
                    }
                }
                this.LIZ.postInvalidate();
            }

            @Override // X.InterfaceC1315950kLh
            public final void LIZLLL(List<InterfaceC1291910jiv> list) {
                this.LIZ.onPostprocessorPreparing(list);
            }

            @Override // X.InterfaceC1315950kLh
            public final C1325700kbQ LJ(Uri uri) {
                return this.LIZ.createImageRequestBuilder(uri);
            }
        });
        this.mImageDelegate = c1315720kLK;
        c1315720kLK.LJJLIIIIJ = getHierarchy();
        setLynxBaseUI(lynxBaseUI);
    }

    private void maybeUpdateViewInternal(int i, int i2, int i3, int i4, int i5, int i6) {
        C1323050kX9<?> c1323050kX9;
        C1315720kLK c1315720kLK = this.mImageDelegate;
        C089P c089p = c1315720kLK.LJJ;
        if (c089p == null && c1315720kLK.LJJI == null) {
            return;
        }
        if (C1316170kM3.LIZ(c089p, c1315720kLK.LJIIZILJ) && !this.mImageDelegate.LJIIL && (i <= 0 || i2 <= 0)) {
            return;
        }
        this.mImageOrigin = -1;
        C1315960kLi c1315960kLi = this.mLoaderCallback;
        if (c1315960kLi != null) {
            c1315960kLi.LJFF();
        }
        TraceEvent.LIZLLL("FrescoImageView.maybeUpdateViewInternal");
        C1315720kLK c1315720kLK2 = this.mImageDelegate;
        if (c1315720kLK2.LJIJI) {
            if (c1315720kLK2.LJJIJIL) {
                if (c1315720kLK2.LJJII(i, i2)) {
                    TraceEvent.LJII("FrescoImageView.maybeUpdateViewInternal");
                    return;
                }
            } else {
                c1315720kLK2.LJJIFFI(i, i2);
            }
        }
        if (this.mImageDelegate.LJIJI && (((c1323050kX9 = this.mRef) != null && c1323050kX9.LJIILLIIL() && this.mRef.get() != null) || this.mImageDelegate.LJIJJ)) {
            TraceEvent.LJII("FrescoImageView.maybeUpdateViewInternal");
        } else {
            tryFetchImageFromFresco(i, i2, i3, i4, i5, i6);
            TraceEvent.LJII("FrescoImageView.maybeUpdateViewInternal");
        }
    }

    public void tryFetchImage(int i, int i2, int i3, int i4, int i5, int i6) {
        maybeUpdateViewInternal(i, i2, i3, i4, i5, i6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [REQUEST, X.0kbR] */
    public void tryFetchImageFromFresco(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        float[] fArrAdjustBorderRadiusArrayWithPadding;
        boolean z2;
        C089P c089p;
        InterfaceC1320380kSq interfaceC1320380kSq;
        if (TraceController.isTracingStarted()) {
            HashMap map = new HashMap();
            String str = this.mImageDelegate.LJIJJLI;
            if (str != null && str.startsWith("http")) {
                map.put("url", this.mImageDelegate.LJIJJLI);
            }
            TraceEvent.LIZJ("LynxImageManager.tryFetchImageFromFresco", map);
        }
        C1331070kk5 hierarchy = getHierarchy();
        if (!this.mFixFrescoBug) {
            hierarchy.LJIIZILJ(this.mScaleType);
        }
        InterfaceC1320380kSq interfaceC1320380kSq2 = this.mScaleType;
        C1320340kSm c1320340kSm = InterfaceC1320380kSq.LJI;
        if (interfaceC1320380kSq2 == c1320340kSm && this.mCoverStart) {
            InterfaceC1320380kSq interfaceC1320380kSq3 = new InterfaceC1320380kSq() { // from class: X.0GVs
                @Override // X.InterfaceC1320380kSq
                public final Matrix LIZ(float f, float f2, int i7, int i8, Rect rect, Matrix matrix) {
                    float fWidth = rect.width() / i7;
                    float fHeight = rect.height() / i8;
                    float fMax = Math.max(fWidth, fHeight);
                    float f3 = rect.left;
                    float f4 = rect.top;
                    if (fWidth > fHeight) {
                        matrix.postTranslate(f3, 0.0f);
                    } else {
                        matrix.postTranslate(0.0f, f4);
                    }
                    matrix.setScale(fMax, fMax);
                    return matrix;
                }
            };
            this.mScaleType = interfaceC1320380kSq3;
            hierarchy.LJIIZILJ(interfaceC1320380kSq3);
        }
        C1315720kLK c1315720kLK = this.mImageDelegate;
        if (!c1315720kLK.LJJJJLI && (interfaceC1320380kSq = this.mScaleType) != c1320340kSm && interfaceC1320380kSq != InterfaceC1320380kSq.LJII && !c1315720kLK.LJIIL && !this.mIsPixelated && !c1315720kLK.LJFF) {
            z = true;
        } else {
            z = false;
        }
        this.mUsePostprocessorScaling = z;
        C1313900kIO c1313900kIO = this.mBorderRadii;
        C1331100kk8 c1331100kk8LIZJ = null;
        if (c1313900kIO != null) {
            if (c1313900kIO.LIZLLL(i + i3 + i5, i2 + i4 + i6)) {
                this.mIsBorderRadiusDirty = true;
            }
            fArrAdjustBorderRadiusArrayWithPadding = adjustBorderRadiusArrayWithPadding(this.mBorderRadii.LIZ());
        } else {
            fArrAdjustBorderRadiusArrayWithPadding = null;
        }
        if (this.mIsBorderRadiusDirty) {
            if (!this.mUsePostprocessorScaling && fArrAdjustBorderRadiusArrayWithPadding != null) {
                c1331100kk8LIZJ = C1331100kk8.LIZJ(fArrAdjustBorderRadiusArrayWithPadding);
                int i7 = this.mOverlayColor;
                if (i7 != 0) {
                    c1331100kk8LIZJ.LJIIIIZZ(i7);
                } else {
                    c1331100kk8LIZJ.LIZ = EnumC1321320kUM.BITMAP_ONLY;
                }
            }
            hierarchy.LJJIII(c1331100kk8LIZJ);
            this.mIsBorderRadiusDirty = true;
        }
        int i8 = this.mFadeDurationMs;
        if (i8 < 0) {
            i8 = 0;
        }
        hierarchy.LJIJI(i8);
        ?? CreateImageRequest = createImageRequest(this.mImageDelegate.LJJ, i, i2, 0, 0, 0, 0, fArrAdjustBorderRadiusArrayWithPadding, this.mScaleType);
        C1325710kbR c1325710kbR = this.mCurImageRequest;
        this.mCurImageRequest = CreateImageRequest;
        REQUEST requestCreateImageRequest = createImageRequest(this.mImageDelegate.LJJI, i, i2, 0, 0, 0, 0, fArrAdjustBorderRadiusArrayWithPadding, this.mScaleType);
        if (this.mDeferInvalidation) {
            requestCreateImageRequest = c1325710kbR;
        }
        GlobalImageLoadListener globalImageLoadListener = this.mGlobalImageLoadListener;
        if (globalImageLoadListener != null && (c089p = this.mImageDelegate.LJJ) != null) {
            globalImageLoadListener.onLoadAttempt(c089p.LIZIZ());
        }
        this.mDraweeControllerBuilder.LIZJ();
        final WeakReference weakReference = new WeakReference(this);
        AbstractC1320720kTO abstractC1320720kTO = this.mDraweeControllerBuilder;
        abstractC1320720kTO.LJIIJJI = this.mAutoPlay;
        abstractC1320720kTO.LIZJ = this.mCallerContext;
        abstractC1320720kTO.LJIILJJIL = getController();
        abstractC1320720kTO.LIZLLL = CreateImageRequest;
        if (requestCreateImageRequest != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        abstractC1320720kTO.LJIIL = z2;
        abstractC1320720kTO.LJ = requestCreateImageRequest;
        final String str2 = this.mImageDelegate.LJIJJLI;
        this.mStartTimeStamp = System.currentTimeMillis();
        C1320700kTM<InterfaceC1330440kj4> c1320700kTM = new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0kLM
            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LJFF(Object obj, String str3) {
            }

            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LIZLLL(String str3, Throwable th) {
                int i9;
                if (this.LIZLLL.mImageDelegate.LJIILIIL(str2)) {
                    return;
                }
                this.LIZLLL.mIsDirty = true;
                int iLIZ = C846560XIw.LIZ(th);
                int iLIZIZ = C846560XIw.LIZIZ(iLIZ);
                if (this.LIZLLL.mLoaderCallback != null) {
                    LynxError lynxError = new LynxError(iLIZIZ, "Android FrescoImageView loading image failed", "", "error");
                    if (th != null) {
                        lynxError.LJIIIIZZ(th.getMessage());
                    }
                    LynxBaseUI lynxBaseUI = this.LIZLLL.mLynxBaseUI;
                    if (lynxBaseUI != null) {
                        i9 = lynxBaseUI.mNodeIndex;
                    } else {
                        i9 = 0;
                    }
                    lynxError.LIZ("node_index", Integer.toString(i9));
                    this.LIZLLL.mLoaderCallback.LIZLLL(lynxError, iLIZIZ, iLIZ);
                }
                this.LIZLLL.mImageOrigin = -1;
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1315710kLJ c1315710kLJ = this.LIZLLL;
                C1315720kLK c1315720kLK2 = c1315710kLJ.mImageDelegate;
                c1315720kLK2.LJIIIZ(c1315720kLK2.LJIJJLI, false, c1315710kLJ.mStartTimeStamp, jCurrentTimeMillis, 0, null);
                C1315710kLJ c1315710kLJ2 = this.LIZLLL;
                C1315720kLK c1315720kLK3 = c1315710kLJ2.mImageDelegate;
                c1315720kLK3.LJIIJJI(iLIZ, 0, c1315710kLJ2.mStartTimeStamp, jCurrentTimeMillis, c1315720kLK3.LJIJJLI, false, false);
                C1315710kLJ c1315710kLJ3 = this.LIZLLL;
                C1315720kLK c1315720kLK4 = c1315710kLJ3.mImageDelegate;
                c1315720kLK4.LJIIJ(c1315720kLK4.LJIJJLI, iLIZ, false, c1315710kLJ3.mImageOrigin, c1315710kLJ3.mStartTimeStamp, jCurrentTimeMillis, false, 0, 0);
                C1315720kLK c1315720kLK5 = this.LIZLLL.mImageDelegate;
                th.getMessage();
                c1315720kLK5.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFailed src:");
                sbLIZ.append(str2);
                sbLIZ.append("with reason");
                sbLIZ.append(th.getMessage());
                LynxLog.e("FrescoImageView", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LJ(String str3, Object obj, Animatable animatable) {
                C1323050kX9<Bitmap> c1323050kX9;
                InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj;
                if (weakReference.get() != null) {
                    ((C1315710kLJ) weakReference.get()).onImageRequestLoaded();
                }
                C1315710kLJ c1315710kLJ = this.LIZLLL;
                if (c1315710kLJ.mImageOrigin == -1 && (interfaceC1330440kj4 instanceof AbstractC1327750kej)) {
                    c1315710kLJ.mImageDelegate.getClass();
                    if (C1315720kLK.LJFF((AbstractC1327750kej) interfaceC1330440kj4)) {
                        this.LIZLLL.mImageOrigin = 5;
                    }
                }
                C1315710kLJ c1315710kLJ2 = this.LIZLLL;
                if (c1315710kLJ2.mDisableDefaultPlaceholder && (interfaceC1330440kj4 instanceof C1325120kaU)) {
                    C1323050kX9<Bitmap> c1323050kX92 = c1315710kLJ2.mTempPlaceHolder;
                    if (c1323050kX92 != null) {
                        c1323050kX92.close();
                        this.LIZLLL.mTempPlaceHolder = null;
                    }
                    this.LIZLLL.mTempPlaceHolder = ((C1325120kaU) interfaceC1330440kj4).cloneUnderlyingBitmapReference();
                    C1331070kk5 hierarchy2 = this.LIZLLL.getHierarchy();
                    if (hierarchy2 != null && (c1323050kX9 = this.LIZLLL.mTempPlaceHolder) != null && c1323050kX9.get() != null) {
                        hierarchy2.LJIJ(new C1319910kS5(new BitmapDrawable(this.LIZLLL.getResources(), this.LIZLLL.mTempPlaceHolder.get()), this.LIZLLL.mScaleType), 1);
                    }
                }
                C1315710kLJ c1315710kLJ3 = this.LIZLLL;
                if (c1315710kLJ3.mIsPixelated && c1315710kLJ3.getTopLevelDrawable() != null) {
                    this.LIZLLL.getTopLevelDrawable().setFilterBitmap(false);
                }
                C1315710kLJ c1315710kLJ4 = this.LIZLLL;
                C1315720kLK c1315720kLK2 = c1315710kLJ4.mImageDelegate;
                int width = c1315710kLJ4.getWidth();
                int height = this.LIZLLL.getHeight();
                C1315710kLJ c1315710kLJ5 = this.LIZLLL;
                c1315720kLK2.LJII(width, height, interfaceC1330440kj4, animatable, c1315710kLJ5.mStartTimeStamp, false, c1315710kLJ5.mImageOrigin, c1315710kLJ5.mLoaderCallback);
            }
        };
        this.mControllerListener = c1320700kTM;
        if (this.mControllerForTesting == null) {
            this.mDraweeControllerBuilder.LJIIIIZZ = c1320700kTM;
        } else {
            C1320680kTK c1320680kTK = new C1320680kTK();
            c1320680kTK.LJIIJJI(this.mControllerListener);
            c1320680kTK.LJIIJJI(this.mControllerForTesting);
            this.mDraweeControllerBuilder.LJIIIIZZ = c1320680kTK;
        }
        setController(this.mDraweeControllerBuilder.LIZ());
        this.mIsDirty = false;
        C1315720kLK c1315720kLK2 = this.mImageDelegate;
        c1315720kLK2.LIZIZ = i;
        c1315720kLK2.LIZJ = i2;
        this.mDraweeControllerBuilder.LIZJ();
        if (TraceController.isTracingStarted()) {
            TraceEvent.LJII("LynxImageManager.tryFetchImageFromFresco");
        }
    }

    public C1325710kbR createImageRequest(C089P c089p, int i, int i2, int i3, int i4, int i5, int i6, float[] fArr, InterfaceC1320380kSq interfaceC1320380kSq) {
        return this.mImageDelegate.LIZJ(c089p, i, i2, i3, i4, i5, i6, fArr, interfaceC1320380kSq);
    }
}
