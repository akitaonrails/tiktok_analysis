package X;

import Y.ACallableS425S0100000_20;
import Y.ACallableS68S1100000_20;
import Y.ACallableS97S0101000_20;
import Y.ARunnableS120S0100000_20;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.JsonReader;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lottie.LottieAnimationView$SavedState;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.io.StringReader;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jhz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1291330jhz extends AppCompatImageView {
    public static final EnumC1291340ji0 LLJILLL = EnumC1291340ji0.Weak;
    public final C1290550jgj LL;
    public final C1291310jhx LLILLJJLI;
    public final C1291430ji9 LLILLL;
    public String LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public final Set<InterfaceC1291000jhS> LLJI;
    public C1290520jgg LLJIJIL;
    public C1291600jiQ LLJILJIL;
    public final ARunnableS120S0100000_20 LLJILJILJ;

    public final void cancelAnimation() {
        this.LLILZLL = false;
        HandlerHook.viewRemoveCallbacks(this, this.LLJILJILJ);
        C1291430ji9 c1291430ji9 = this.LLILLL;
        c1291430ji9.getClass();
        boolean z = C1291380ji4.LIZ;
        c1291430ji9.LLILZIL.clear();
        c1291430ji9.LLILLL.cancel();
        LIZJ();
    }

    public final void pauseAnimation() {
        this.LLIZ = false;
        this.LLILZLL = false;
        HandlerHook.viewRemoveCallbacks(this, this.LLJILJILJ);
        C1291430ji9 c1291430ji9 = this.LLILLL;
        c1291430ji9.getClass();
        boolean z = C1291380ji4.LIZ;
        c1291430ji9.LLILZIL.clear();
        c1291430ji9.LLILLL.LJI(true);
        LIZJ();
    }

    public void setDrawFpsTracerOutputListener(InterfaceC1291370ji3 interfaceC1291370ji3) {
    }

    public final void LIZJ() {
        ChoreographerFrameCallbackC1291420ji8 choreographerFrameCallbackC1291420ji8;
        try {
            int i = 1;
            if (this.LLIZLLLIL && (choreographerFrameCallbackC1291420ji8 = this.LLILLL.LLILLL) != null && choreographerFrameCallbackC1291420ji8.LLJIJIL) {
                i = 2;
            }
            setLayerType(i, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void cancelLoaderTask() {
        C1290520jgg c1290520jgg = this.LLJIJIL;
        if (c1290520jgg != null) {
            C1290550jgj c1290550jgj = this.LL;
            synchronized (c1290520jgg) {
                c1290520jgg.LIZIZ.remove(c1290550jgj);
                if (c1290520jgg.LJ != null) {
                    c1290520jgg.LJI();
                }
            }
            this.LLJIJIL.LIZLLL(this.LLILLJJLI);
        }
    }

    public long getDuration() {
        C1291600jiQ c1291600jiQ = this.LLJILJIL;
        if (c1291600jiQ != null) {
            return (long) c1291600jiQ.LIZIZ();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.LLILLL.LLILLL.LLILZLL;
    }

    public String getImageAssetsFolder() {
        return this.LLILLL.LLIZ;
    }

    public float getMaxFrame() {
        return this.LLILLL.LLILLL.LIZLLL();
    }

    public float getMinFrame() {
        return this.LLILLL.LLILLL.LJ();
    }

    public C1291010jhT getPerformanceTracker() {
        C1291600jiQ c1291600jiQ = this.LLILLL.LLILLJJLI;
        if (c1291600jiQ != null) {
            return c1291600jiQ.LIZ;
        }
        return null;
    }

    public float getProgress() {
        return this.LLILLL.LLILLL.LIZJ();
    }

    public int getRepeatCount() {
        return this.LLILLL.LLILLL.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.LLILLL.LLILLL.getRepeatMode();
    }

    public float getScale() {
        return this.LLILLL.LLILZ;
    }

    public float getSpeed() {
        return this.LLILLL.LLILLL.LLILLL;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        C1291430ji9 c1291430ji9 = this.LLILLL;
        if (C1291380ji4.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("traceLottieViewOnDetachedFromWindow  {isShown=");
            sbLIZ.append(isShown());
            sbLIZ.append(" visibility:");
            sbLIZ.append(getVisibility());
            sbLIZ.append("  view=");
            sbLIZ.append(hashCode());
            sbLIZ.append(" drawable=");
            sbLIZ.append(c1291430ji9 != null ? Integer.valueOf(c1291430ji9.hashCode()) : null);
            sbLIZ.append(" visible:");
            sbLIZ.append(isShown());
            sbLIZ.append("}");
            C2188811AlT.LIZIZ(sbLIZ);
        }
        ChoreographerFrameCallbackC1291420ji8 choreographerFrameCallbackC1291420ji8 = this.LLILLL.LLILLL;
        if (choreographerFrameCallbackC1291420ji8 != null && choreographerFrameCallbackC1291420ji8.LLJIJIL) {
            cancelAnimation();
            this.LLILZLL = true;
        }
        if (!this.LLJ) {
            LIZ(this);
        }
        super.onDetachedFromWindow();
    }

    public final void playAnimation() {
        this.LLILLL.LIZLLL();
        LIZJ();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1291430ji9 c1291430ji9 = this.LLILLL;
        if (C1291380ji4.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("traceLottieViewOnAttachedToWindow  {isShown=");
            sbLIZ.append(isShown());
            sbLIZ.append(" visibility:");
            sbLIZ.append(getVisibility());
            sbLIZ.append("  view=");
            sbLIZ.append(hashCode());
            sbLIZ.append(" drawable=");
            sbLIZ.append(c1291430ji9 != null ? Integer.valueOf(c1291430ji9.hashCode()) : null);
            sbLIZ.append(" visible:");
            sbLIZ.append(isShown());
            sbLIZ.append("}");
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (this.LLIZ || this.LLILZLL) {
            playAnimation();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        LottieAnimationView$SavedState lottieAnimationView$SavedState = new LottieAnimationView$SavedState(super.onSaveInstanceState());
        lottieAnimationView$SavedState.LL = this.LLILZ;
        lottieAnimationView$SavedState.LLILLJJLI = this.LLILZIL;
        lottieAnimationView$SavedState.LLILLL = this.LLILLL.LLILLL.LIZJ();
        C1291430ji9 c1291430ji9 = this.LLILLL;
        ChoreographerFrameCallbackC1291420ji8 choreographerFrameCallbackC1291420ji8 = c1291430ji9.LLILLL;
        lottieAnimationView$SavedState.LLILZ = choreographerFrameCallbackC1291420ji8 == null ? false : choreographerFrameCallbackC1291420ji8.LLJIJIL;
        lottieAnimationView$SavedState.LLILZIL = c1291430ji9.LLIZ;
        lottieAnimationView$SavedState.LLILZLL = choreographerFrameCallbackC1291420ji8.getRepeatMode();
        lottieAnimationView$SavedState.LLIZ = this.LLILLL.LLILLL.getRepeatCount();
        return lottieAnimationView$SavedState;
    }

    public String getAnimationName() {
        return this.LLILZ;
    }

    public C1291600jiQ getComposition() {
        return this.LLJILJIL;
    }

    public boolean getUseHardwareAcceleration() {
        return this.LLIZLLLIL;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0jgj] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0jhx] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0jmJ] */
    public C1291330jhz(Context context) {
        String strXd;
        super(context);
        final C1290900jhI c1290900jhI = (C1290900jhI) this;
        this.LL = new InterfaceC1290510jgf<C1291600jiQ>() { // from class: X.0jgj
            @Override // X.InterfaceC1290510jgf
            public final void onResult(C1291600jiQ c1291600jiQ) {
                c1290900jhI.setComposition(c1291600jiQ);
            }
        };
        this.LLILLJJLI = new InterfaceC1290510jgf<Throwable>() { // from class: X.0jhx
            @Override // X.InterfaceC1290510jgf
            public final void onResult(Throwable th) {
                C1291680jiY c1291680jiYLIZ = C1291670jiX.LIZ();
                IllegalStateException illegalStateException = new IllegalStateException("Unable to parse composition", th);
                StringBuilder sb = new StringBuilder();
                sb.append(((LinkedHashMap) C1291320jhy.LIZIZ.LIZ.LJIIIIZZ()).keySet().toString());
                Map<String, C1290520jgg<C1291600jiQ>> map = C1290610jgp.LIZ;
                if (map != null) {
                    sb.append(" /---/ ");
                    sb.append(((ConcurrentHashMap) map).keySet().toString());
                }
                c1291680jiYLIZ.LIZ(sb.toString(), illegalStateException);
            }
        };
        C1291430ji9 c1291430ji9 = new C1291430ji9();
        this.LLILLL = c1291430ji9;
        this.LLILZLL = false;
        this.LLIZ = false;
        this.LLIZLLLIL = false;
        this.LLJ = false;
        this.LLJI = new HashSet();
        this.LLJILJILJ = new ARunnableS120S0100000_20(c1290900jhI, 34);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, R$styleable.LottieAnimationView);
        typedArrayObtainStyledAttributes.getInt(R$styleable.LottieAnimationView_lottie_cacheStrategy, LLJILLL.ordinal());
        EnumC1291340ji0.values();
        if (!isInEditMode()) {
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_rawRes);
            boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_fileName);
            boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_url);
            if (zHasValue) {
                if (!zHasValue2) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.LottieAnimationView_lottie_rawRes, 0);
                    if (resourceId != 0) {
                        setAnimation(resourceId);
                    }
                } else {
                    throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use use only one at once.");
                }
            } else if (zHasValue2) {
                String strXd2 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.LottieAnimationView_lottie_fileName);
                if (strXd2 != null) {
                    setAnimation(strXd2);
                }
            } else if (zHasValue3 && (strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.LottieAnimationView_lottie_url)) != null) {
                setAnimationFromUrl(strXd);
            }
        }
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_autoPlay, false)) {
            this.LLILZLL = true;
            this.LLIZ = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_loop, false)) {
            c1291430ji9.LLILLL.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_repeatMode)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(R$styleable.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_repeatCount)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(R$styleable.LottieAnimationView_lottie_repeatCount, -1));
        }
        setImageAssetsFolder(C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.LottieAnimationView_lottie_imageAssetsFolder));
        setProgress(typedArrayObtainStyledAttributes.getFloat(R$styleable.LottieAnimationView_lottie_progress, 0.0f));
        enableMergePathsForKitKatAndAbove(typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_colorFilter)) {
            final int color = typedArrayObtainStyledAttributes.getColor(R$styleable.LottieAnimationView_lottie_colorFilter, 0);
            c1291430ji9.LIZ(new C1291740jie("**"), InterfaceC1292740jkG.LJJ, new C1292420jjk(new PorterDuffColorFilter(color) { // from class: X.0jmJ
                {
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                }
            }));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_scale)) {
            c1291430ji9.LLILZ = typedArrayObtainStyledAttributes.getFloat(R$styleable.LottieAnimationView_lottie_scale, 1.0f);
            c1291430ji9.LJIIL();
        }
        typedArrayObtainStyledAttributes.recycle();
        LIZJ();
    }

    public static void LIZ(C1291330jhz c1291330jhz) {
        C1290760jh4 c1290760jh4;
        try {
            C1291430ji9 c1291430ji9 = c1291330jhz.LLILLL;
            if (c1291430ji9 != null && (c1290760jh4 = c1291430ji9.LLILZLL) != null) {
                c1290760jh4.LIZIZ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZLLL(JsonReader jsonReader) {
        C1291380ji4.LIZ(this, this.LLILLL, "jsonReader");
        this.LLJILJIL = null;
        C1291430ji9 c1291430ji9 = this.LLILLL;
        C1290760jh4 c1290760jh4 = c1291430ji9.LLILZLL;
        if (c1290760jh4 != null) {
            c1290760jh4.LIZIZ();
        }
        ChoreographerFrameCallbackC1291420ji8 choreographerFrameCallbackC1291420ji8 = c1291430ji9.LLILLL;
        if (choreographerFrameCallbackC1291420ji8.LLJIJIL) {
            choreographerFrameCallbackC1291420ji8.cancel();
        }
        c1291430ji9.LLILLJJLI = null;
        c1291430ji9.LLJIJIL = null;
        c1291430ji9.LLILZLL = null;
        ChoreographerFrameCallbackC1291420ji8 choreographerFrameCallbackC1291420ji82 = c1291430ji9.LLILLL;
        choreographerFrameCallbackC1291420ji82.LLJI = null;
        choreographerFrameCallbackC1291420ji82.LLIZLLLIL = -2.1474836E9f;
        choreographerFrameCallbackC1291420ji82.LLJ = 2.1474836E9f;
        c1291430ji9.invalidateSelf();
        cancelLoaderTask();
        C1290520jgg<C1291600jiQ> c1290520jggLIZ = C1290610jgp.LIZ(null, new ACallableS68S1100000_20(jsonReader, 2));
        c1290520jggLIZ.LIZIZ(this.LL);
        c1290520jggLIZ.LIZ(this.LLILLJJLI);
        this.LLJIJIL = c1290520jggLIZ;
    }

    @Override // android.view.View
    public final void buildDrawingCache(boolean z) {
        super.buildDrawingCache(z);
    }

    public final void enableMergePathsForKitKatAndAbove(boolean z) {
        C1291430ji9 c1291430ji9 = this.LLILLL;
        if (c1291430ji9.LLJI != z) {
            c1291430ji9.LLJI = z;
            if (c1291430ji9.LLILLJJLI != null) {
                c1291430ji9.LIZIZ();
            }
        }
    }

    @Override // android.view.View
    public final Bitmap getDrawingCache(boolean z) throws Throwable {
        ImageView imageView;
        boolean zBooleanValue = z;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyIaXtP0NdjhCNu+KgfqxoV+G/IaVZwxytcKQ==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {Boolean.valueOf(zBooleanValue)};
        C0WZW c0wzw = new C0WZW(false, "(Z)Landroid/graphics/Bitmap;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(2826, "androidx/appcompat/widget/AppCompatImageView", "getDrawingCache", this, objArr, "android.graphics.Bitmap", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(2826, "androidx/appcompat/widget/AppCompatImageView", "getDrawingCache", null, objArr, this, c0wzw, false);
            return (Bitmap) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                imageView = (ImageView) obj;
            } else {
                imageView = this;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                zBooleanValue = ((Boolean) obj2).booleanValue();
            }
        } else {
            imageView = this;
        }
        Bitmap drawingCache = super.getDrawingCache(zBooleanValue);
        c0wst.LIZ(2826, "androidx/appcompat/widget/AppCompatImageView", "getDrawingCache", drawingCache, objArr, imageView, c0wzw, true);
        return drawingCache;
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C1291430ji9 c1291430ji9 = this.LLILLL;
        if (drawable2 == c1291430ji9) {
            super.invalidateDrawable(c1291430ji9);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof LottieAnimationView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        LottieAnimationView$SavedState lottieAnimationView$SavedState = (LottieAnimationView$SavedState) parcelable;
        super.onRestoreInstanceState(lottieAnimationView$SavedState.getSuperState());
        String str = lottieAnimationView$SavedState.LL;
        this.LLILZ = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.LLILZ);
        }
        int i = lottieAnimationView$SavedState.LLILLJJLI;
        this.LLILZIL = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(lottieAnimationView$SavedState.LLILLL);
        if (lottieAnimationView$SavedState.LLILZ) {
            playAnimation();
        }
        this.LLILLL.LLIZ = lottieAnimationView$SavedState.LLILZIL;
        setRepeatMode(lottieAnimationView$SavedState.LLILZLL);
        setRepeatCount(lottieAnimationView$SavedState.LLIZ);
    }

    public void setAnimation(final int i) {
        C1291380ji4.LIZ(this, this.LLILLL, Integer.valueOf(i));
        this.LLILZIL = i;
        this.LLILZ = null;
        C1291320jhy c1291320jhy = C1291320jhy.LIZIZ;
        c1291320jhy.getClass();
        C1291600jiQ c1291600jiQLIZ = c1291320jhy.LIZ(Integer.toString(i));
        if (c1291600jiQLIZ != null) {
            setComposition(c1291600jiQLIZ);
            return;
        }
        this.LLJILJIL = null;
        C1291430ji9 c1291430ji9 = this.LLILLL;
        C1290760jh4 c1290760jh4 = c1291430ji9.LLILZLL;
        if (c1290760jh4 != null) {
            c1290760jh4.LIZIZ();
        }
        ChoreographerFrameCallbackC1291420ji8 choreographerFrameCallbackC1291420ji8 = c1291430ji9.LLILLL;
        if (choreographerFrameCallbackC1291420ji8.LLJIJIL) {
            choreographerFrameCallbackC1291420ji8.cancel();
        }
        c1291430ji9.LLILLJJLI = null;
        c1291430ji9.LLJIJIL = null;
        c1291430ji9.LLILZLL = null;
        ChoreographerFrameCallbackC1291420ji8 choreographerFrameCallbackC1291420ji82 = c1291430ji9.LLILLL;
        choreographerFrameCallbackC1291420ji82.LLJI = null;
        choreographerFrameCallbackC1291420ji82.LLIZLLLIL = -2.1474836E9f;
        choreographerFrameCallbackC1291420ji82.LLJ = 2.1474836E9f;
        c1291430ji9.invalidateSelf();
        cancelLoaderTask();
        Context contextN3 = C786410Ut5.N3(getContext());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("rawRes_");
        sbLIZ.append(i);
        C1290520jgg<C1291600jiQ> c1290520jggLIZ = C1290610jgp.LIZ(C2188811AlT.LIZIZ(sbLIZ), new ACallableS97S0101000_20(i, contextN3, 1));
        c1290520jggLIZ.LIZIZ(new InterfaceC1290510jgf<C1291600jiQ>() { // from class: X.0jgy
            @Override // X.InterfaceC1290510jgf
            public final void onResult(C1291600jiQ c1291600jiQ) {
                C1291320jhy c1291320jhy2 = C1291320jhy.LIZIZ;
                int i2 = i;
                c1291320jhy2.getClass();
                c1291320jhy2.LIZIZ(c1291600jiQ, Integer.toString(i2));
            }
        });
        c1290520jggLIZ.LIZIZ(this.LL);
        c1290520jggLIZ.LIZ(this.LLILLJJLI);
        this.LLJIJIL = c1290520jggLIZ;
    }

    public void setAnimationFromJson(String str) {
        C1291380ji4.LIZ(this, this.LLILLL, "jsonString");
        LIZLLL(new JsonReader(new StringReader(str)));
    }

    public void setAnimationFromUrl(String str) {
        C1291380ji4.LIZ(this, this.LLILLL, str);
        this.LLJILJIL = null;
        C1291430ji9 c1291430ji9 = this.LLILLL;
        C1290760jh4 c1290760jh4 = c1291430ji9.LLILZLL;
        if (c1290760jh4 != null) {
            c1290760jh4.LIZIZ();
        }
        ChoreographerFrameCallbackC1291420ji8 choreographerFrameCallbackC1291420ji8 = c1291430ji9.LLILLL;
        if (choreographerFrameCallbackC1291420ji8.LLJIJIL) {
            choreographerFrameCallbackC1291420ji8.cancel();
        }
        c1291430ji9.LLILLJJLI = null;
        c1291430ji9.LLJIJIL = null;
        c1291430ji9.LLILZLL = null;
        ChoreographerFrameCallbackC1291420ji8 choreographerFrameCallbackC1291420ji82 = c1291430ji9.LLILLL;
        choreographerFrameCallbackC1291420ji82.LLJI = null;
        choreographerFrameCallbackC1291420ji82.LLIZLLLIL = -2.1474836E9f;
        choreographerFrameCallbackC1291420ji82.LLJ = 2.1474836E9f;
        c1291430ji9.invalidateSelf();
        cancelLoaderTask();
        C1290520jgg c1290520jgg = new C1290520jgg(new ACallableS425S0100000_20(new C1291620jiS(getContext(), str), 16));
        c1290520jgg.LIZIZ(this.LL);
        c1290520jgg.LIZ(this.LLILLJJLI);
        this.LLJIJIL = c1290520jgg;
    }

    public void setComposition(C1291600jiQ c1291600jiQ) {
        boolean z;
        this.LLILLL.setCallback(this);
        this.LLJILJIL = c1291600jiQ;
        C1291430ji9 c1291430ji9 = this.LLILLL;
        c1291430ji9.getClass();
        boolean z2 = C1291380ji4.LIZ;
        if (c1291430ji9.LLILLJJLI == c1291600jiQ) {
            z = false;
        } else {
            C1290760jh4 c1290760jh4 = c1291430ji9.LLILZLL;
            if (c1290760jh4 != null) {
                c1290760jh4.LIZIZ();
            }
            ChoreographerFrameCallbackC1291420ji8 choreographerFrameCallbackC1291420ji8 = c1291430ji9.LLILLL;
            if (choreographerFrameCallbackC1291420ji8.LLJIJIL) {
                choreographerFrameCallbackC1291420ji8.cancel();
            }
            c1291430ji9.LLILLJJLI = null;
            c1291430ji9.LLJIJIL = null;
            c1291430ji9.LLILZLL = null;
            ChoreographerFrameCallbackC1291420ji8 choreographerFrameCallbackC1291420ji82 = c1291430ji9.LLILLL;
            choreographerFrameCallbackC1291420ji82.LLJI = null;
            choreographerFrameCallbackC1291420ji82.LLIZLLLIL = -2.1474836E9f;
            choreographerFrameCallbackC1291420ji82.LLJ = 2.1474836E9f;
            c1291430ji9.invalidateSelf();
            c1291430ji9.LLILLJJLI = c1291600jiQ;
            if (c1291600jiQ != null) {
                String str = c1291430ji9.LLIZ;
                if (str != null) {
                    c1291600jiQ.LJIILJJIL = str;
                }
                InterfaceC1291560jiM interfaceC1291560jiM = c1291430ji9.LLIZLLLIL;
                if (interfaceC1291560jiM != null) {
                    c1291600jiQ.LJIILJJIL = interfaceC1291560jiM.getClass().getName();
                }
            }
            c1291430ji9.LIZIZ();
            c1291430ji9.LJFF();
            z = true;
        }
        setCompositionAfter(z);
    }

    public void setCompositionAfter(boolean z) {
        Object[] array;
        LIZJ();
        if (getDrawable() == this.LLILLL && !z) {
            return;
        }
        setImageDrawable(null);
        setImageDrawable(this.LLILLL);
        requestLayout();
        if (((HashSet) this.LLJI).size() > 0 && (array = ((HashSet) this.LLJI).toArray()) != null) {
            for (Object obj : array) {
                if (obj != null && (obj instanceof InterfaceC1291000jhS)) {
                    ((InterfaceC1291000jhS) obj).LIZ(this.LLJILJIL);
                }
            }
        }
    }

    public void setFailureListener(InterfaceC1290510jgf<Throwable> interfaceC1290510jgf) {
        C1290520jgg c1290520jgg = this.LLJIJIL;
        if (c1290520jgg != null) {
            c1290520jgg.LIZLLL(this.LLILLJJLI);
            this.LLJIJIL.LIZ(interfaceC1290510jgf);
        }
    }

    public void setFrame(int i) {
        this.LLILLL.LJI(i);
    }

    public void setImageAssetDelegate(InterfaceC1291560jiM interfaceC1291560jiM) {
        C1291430ji9 c1291430ji9 = this.LLILLL;
        c1291430ji9.LLIZLLLIL = interfaceC1291560jiM;
        C1290760jh4 c1290760jh4 = c1291430ji9.LLILZLL;
        if (c1290760jh4 != null) {
            c1290760jh4.LIZJ = interfaceC1291560jiM;
        }
    }

    public void setImageAssetsFolder(String str) {
        this.LLILLL.LLIZ = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        LIZ(this);
        cancelLoaderTask();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (drawable != this.LLILLL) {
            LIZ(this);
        }
        cancelLoaderTask();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        LIZ(this);
        cancelLoaderTask();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.LLILLL.LJII(i);
    }

    public void setMaxProgress(float f) {
        this.LLILLL.LJIIIIZZ(f);
    }

    public void setMinFrame(int i) {
        this.LLILLL.LJIIIZ(i);
    }

    public void setMinProgress(float f) {
        this.LLILLL.LJIIJ(f);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        C1291430ji9 c1291430ji9 = this.LLILLL;
        c1291430ji9.LLJILJILJ = z;
        C1291600jiQ c1291600jiQ = c1291430ji9.LLILLJJLI;
        if (c1291600jiQ != null) {
            c1291600jiQ.LIZ.LIZIZ = z;
        }
    }

    public void setProgress(float f) {
        this.LLILLL.LJIIJJI(f);
    }

    public void setRenderMode(EnumC1152890g6h enumC1152890g6h) {
        LIZJ();
    }

    public void setRepeatCount(int i) {
        this.LLILLL.LLILLL.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.LLILLL.LLILLL.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.LLILLL.getClass();
    }

    public void setScale(float f) {
        C1291430ji9 c1291430ji9 = this.LLILLL;
        c1291430ji9.LLILZ = f;
        c1291430ji9.LJIIL();
        if (getDrawable() == this.LLILLL) {
            cancelLoaderTask();
            super.setImageDrawable(null);
            C1291430ji9 c1291430ji92 = this.LLILLL;
            cancelLoaderTask();
            super.setImageDrawable(c1291430ji92);
        }
    }

    public void setSpeed(float f) {
        this.LLILLL.LLILLL.LLILLL = f;
    }

    public void setTextDelegate(C1291360ji2 c1291360ji2) {
        this.LLILLL.getClass();
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
    }

    public void setFontAssetDelegate(C1291350ji1 c1291350ji1) {
    }

    public void setAnimation(final String str) {
        try {
            C1291380ji4.LIZ(this, this.LLILLL, str);
            this.LLILZ = str;
            this.LLILZIL = 0;
            C1291600jiQ c1291600jiQLIZ = C1291320jhy.LIZIZ.LIZ(str);
            if (c1291600jiQLIZ != null) {
                setComposition(c1291600jiQLIZ);
                return;
            }
            this.LLJILJIL = null;
            C1291430ji9 c1291430ji9 = this.LLILLL;
            C1290760jh4 c1290760jh4 = c1291430ji9.LLILZLL;
            if (c1290760jh4 != null) {
                c1290760jh4.LIZIZ();
            }
            ChoreographerFrameCallbackC1291420ji8 choreographerFrameCallbackC1291420ji8 = c1291430ji9.LLILLL;
            if (choreographerFrameCallbackC1291420ji8.LLJIJIL) {
                choreographerFrameCallbackC1291420ji8.cancel();
            }
            c1291430ji9.LLILLJJLI = null;
            c1291430ji9.LLJIJIL = null;
            c1291430ji9.LLILZLL = null;
            ChoreographerFrameCallbackC1291420ji8 choreographerFrameCallbackC1291420ji82 = c1291430ji9.LLILLL;
            choreographerFrameCallbackC1291420ji82.LLJI = null;
            choreographerFrameCallbackC1291420ji82.LLIZLLLIL = -2.1474836E9f;
            choreographerFrameCallbackC1291420ji82.LLJ = 2.1474836E9f;
            c1291430ji9.invalidateSelf();
            cancelLoaderTask();
            C1290520jgg<C1291600jiQ> c1290520jggLIZ = C1290610jgp.LIZ(str, new ACallableS68S1100000_20(C786410Ut5.N3(getContext()), str, 1));
            c1290520jggLIZ.LIZIZ(new InterfaceC1290510jgf<C1291600jiQ>() { // from class: X.0jgz
                @Override // X.InterfaceC1290510jgf
                public final void onResult(C1291600jiQ c1291600jiQ) {
                    C1291320jhy.LIZIZ.LIZIZ(c1291600jiQ, str);
                }
            });
            c1290520jggLIZ.LIZIZ(this.LL);
            c1290520jggLIZ.LIZ(this.LLILLJJLI);
            this.LLJIJIL = c1290520jggLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1291670jiX.LIZ().LIZ(str, new IllegalStateException("setAnimation error!", e));
        }
    }

    public void setAnimation(JSONObject jSONObject) {
        C1291380ji4.LIZ(this, this.LLILLL, "json object");
        setAnimation(new JsonReader(new StringReader(C786410Ut5.J3(jSONObject))));
    }

    public void setAnimation(JsonReader jsonReader) {
        LIZLLL(jsonReader);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
