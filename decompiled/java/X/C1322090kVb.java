package X;

import X.InterfaceC1316360kMM;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0kVb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1322090kVb<DH extends InterfaceC1316360kMM> extends ImageView {
    public static boolean sGlobalLegacyVisibilityHandlingEnabled;
    public float mAspectRatio;
    public C1320770kTT<DH> mDraweeHolder;
    public boolean mInitialised;
    public C1322080kVa mLazySizeAttach;
    public boolean mLegacyVisibilityHandlingEnabled;
    public final C1322170kVj mMeasureSpec;
    public C1322050kVX mSizeDeterminer;

    public void com_facebook_drawee_view_DraweeView__onDraw$___twin___(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        com_facebook_drawee_view_DraweeView_com_ss_android_ugc_aweme_lancet_ImageStopLossLanect_simpleDraweeViewOnDetachedFromWindow(this);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        com_facebook_drawee_view_DraweeView_com_ss_android_ugc_aweme_lancet_DraweeViewLanect_onDraw(this, canvas);
    }

    public void cancelLazySizeAttach() {
        C1322080kVa c1322080kVa = this.mLazySizeAttach;
        if (c1322080kVa != null) {
            ((ArrayList) this.mSizeDeterminer.LIZIZ).remove(c1322080kVa);
            this.mLazySizeAttach = null;
        }
    }

    public void doAttach() {
        this.mDraweeHolder.LJFF();
    }

    public void doDetach() {
        this.mDraweeHolder.LJI();
    }

    public InterfaceC1320850kTb getController() {
        return this.mDraweeHolder.LLILZIL;
    }

    public DH getHierarchy() {
        DH dh = this.mDraweeHolder.LLILZ;
        dh.getClass();
        return dh;
    }

    public Drawable getTopLevelDrawable() {
        return this.mDraweeHolder.LIZLLL();
    }

    public boolean hasController() {
        return this.mDraweeHolder.LLILZIL != null;
    }

    public boolean hasHierarchy() {
        return this.mDraweeHolder.LLILZ != null;
    }

    public boolean hasLazySizeAttached() {
        return this.mLazySizeAttach != null;
    }

    public void maybeOverrideVisibilityHandling() {
        Drawable drawable;
        if (!this.mLegacyVisibilityHandlingEnabled || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public void com_facebook_drawee_view_DraweeView__onDetachedFromWindow$___twin___() {
        super.onDetachedFromWindow();
        maybeOverrideVisibilityHandling();
        this.mSizeDeterminer.LIZ();
        onDetach();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onDetach();
    }

    @Override // android.view.View
    public String toString() {
        C1320100kSO c1320100kSOLIZIZ = C1320090kSN.LIZIZ(this);
        C1320770kTT<DH> c1320770kTT = this.mDraweeHolder;
        c1320100kSOLIZIZ.LIZIZ(c1320770kTT != null ? c1320770kTT.toString() : "<no holder set>", "holder");
        return c1320100kSOLIZIZ.toString();
    }

    public float getAspectRatio() {
        return this.mAspectRatio;
    }

    public void onAttach() {
        doAttach();
    }

    public void onDetach() {
        doDetach();
    }

    public C1322090kVb(Context context) {
        super(context);
        this.mMeasureSpec = new C1322170kVj();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        init(context);
    }

    public static void com_facebook_drawee_view_DraweeView_com_ss_android_ugc_aweme_lancet_ImageStopLossLanect_simpleDraweeViewOnDetachedFromWindow(C1322090kVb c1322090kVb) {
        c1322090kVb.com_facebook_drawee_view_DraweeView__onDetachedFromWindow$___twin___();
        C20597815iq.LIZ(c1322090kVb);
    }

    private void init(Context context) {
        try {
            C1336010ks3.LIZIZ();
            if (this.mInitialised) {
                C1336010ks3.LIZIZ();
                return;
            }
            boolean z = true;
            this.mInitialised = true;
            this.mDraweeHolder = new C1320770kTT<>(null);
            this.mSizeDeterminer = new C1322050kVX(this);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                C1336010ks3.LIZIZ();
                return;
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!sGlobalLegacyVisibilityHandlingEnabled || context.getApplicationInfo().targetSdkVersion < 24) {
                z = false;
            }
            this.mLegacyVisibilityHandlingEnabled = z;
            C1336010ks3.LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1336010ks3.LIZIZ();
            throw th;
        }
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        sGlobalLegacyVisibilityHandlingEnabled = z;
    }

    public void controllerAttachSizeDeterminer(InterfaceC1320850kTb interfaceC1320850kTb) {
        if (interfaceC1320850kTb instanceof AbstractC1320710kTN) {
            AbstractC1320710kTN abstractC1320710kTN = (AbstractC1320710kTN) interfaceC1320850kTb;
            C1325710kbR c1325710kbR = abstractC1320710kTN.LJIJJLI;
            if (c1325710kbR != null) {
                c1325710kbR.LJJ = this.mSizeDeterminer;
            } else {
                abstractC1320710kTN.LJIL = this.mSizeDeterminer;
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mDraweeHolder.LJII(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f) {
        if (f == this.mAspectRatio) {
            return;
        }
        this.mAspectRatio = f;
        requestLayout();
    }

    public void setController(InterfaceC1320850kTb interfaceC1320850kTb) {
        cancelLazySizeAttach();
        controllerAttachSizeDeterminer(interfaceC1320850kTb);
        this.mDraweeHolder.LJIIIIZZ(interfaceC1320850kTb);
        super.setImageDrawable(this.mDraweeHolder.LIZLLL());
    }

    public void setHierarchy(DH dh) {
        this.mDraweeHolder.LJIIIZ(dh);
        super.setImageDrawable(this.mDraweeHolder.LIZLLL());
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        init(getContext());
        cancelLazySizeAttach();
        this.mDraweeHolder.LJIIIIZZ(null);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        init(getContext());
        cancelLazySizeAttach();
        this.mDraweeHolder.LJIIIIZZ(null);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        init(getContext());
        cancelLazySizeAttach();
        this.mDraweeHolder.LJIIIIZZ(null);
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        init(getContext());
        cancelLazySizeAttach();
        this.mDraweeHolder.LJIIIIZZ(null);
        super.setImageURI(uri);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0kVY] */
    public void setLazySizeAttach(C1322080kVa c1322080kVa) {
        if (this.mLazySizeAttach != null) {
            cancelLazySizeAttach();
        }
        this.mLazySizeAttach = c1322080kVa;
        final C1322050kVX c1322050kVX = this.mSizeDeterminer;
        View viewLJFF = c1322050kVX.LJFF();
        if (viewLJFF != null) {
            int iLJ = C1322050kVX.LJ(viewLJFF);
            int iLIZLLL = C1322050kVX.LIZLLL(viewLJFF);
            if ((iLJ > 0 || iLJ == Integer.MIN_VALUE) && (iLIZLLL > 0 || iLIZLLL == Integer.MIN_VALUE)) {
                c1322080kVa.LIZ(iLJ, iLIZLLL);
                return;
            }
            if (!((ArrayList) c1322050kVX.LIZIZ).contains(c1322080kVa)) {
                ((ArrayList) c1322050kVX.LIZIZ).add(c1322080kVa);
            }
            if (c1322050kVX.LIZJ != null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = viewLJFF.getViewTreeObserver();
            c1322050kVX.LIZJ = new ViewTreeObserver.OnPreDrawListener(c1322050kVX) { // from class: X.0kVY
                public final WeakReference<C1322050kVX> LL;

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    View viewLJFF2;
                    C1322050kVX c1322050kVX2 = this.LL.get();
                    if (c1322050kVX2 != null && !((ArrayList) c1322050kVX2.LIZIZ).isEmpty() && (viewLJFF2 = c1322050kVX2.LJFF()) != null) {
                        int iLJ2 = C1322050kVX.LJ(viewLJFF2);
                        int iLIZLLL2 = C1322050kVX.LIZLLL(viewLJFF2);
                        if ((iLJ2 > 0 || iLJ2 == Integer.MIN_VALUE) && (iLIZLLL2 > 0 || iLIZLLL2 == Integer.MIN_VALUE)) {
                            Iterator it2 = new ArrayList(c1322050kVX2.LIZIZ).iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC1322070kVZ) it2.next()).LIZ(iLJ2, iLIZLLL2);
                            }
                            c1322050kVX2.LIZ();
                        }
                    }
                    return true;
                }

                {
                    this.LL = new WeakReference<>(c1322050kVX);
                }
            };
            C786410Ut5.y3(viewTreeObserver, c1322050kVX.LIZJ);
        }
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.mLegacyVisibilityHandlingEnabled = z;
    }

    public C1322090kVb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMeasureSpec = new C1322170kVj();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        init(context);
    }

    public static void com_facebook_drawee_view_DraweeView_com_bytedance_tt_reliability_monitor_viewchecker_BitmapCrashChecker_onDraw(C1322090kVb c1322090kVb, Canvas canvas) {
        try {
            c1322090kVb.com_facebook_drawee_view_DraweeView__onDraw$___twin___(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, c1322090kVb);
            throw e;
        }
    }

    public static void com_facebook_drawee_view_DraweeView_com_ss_android_ugc_aweme_lancet_DraweeViewLanect_onDraw(C1322090kVb c1322090kVb, Canvas canvas) {
        if (C1322190kVl.LIZ == null) {
            SettingsManager.LIZLLL().getClass();
            C1322190kVl.LIZ = Boolean.valueOf(SettingsManager.LIZ("catch_baseCanvasRecycleCrash", false));
        }
        if (!C1322190kVl.LIZ.booleanValue()) {
            com_facebook_drawee_view_DraweeView_com_bytedance_tt_reliability_monitor_viewchecker_BitmapCrashChecker_onDraw(c1322090kVb, canvas);
            return;
        }
        try {
            com_facebook_drawee_view_DraweeView_com_bytedance_tt_reliability_monitor_viewchecker_BitmapCrashChecker_onDraw(c1322090kVb, canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                C20602085g.LIZ(c1322090kVb, null);
                throw e;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw e;
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        C1322170kVj c1322170kVj = this.mMeasureSpec;
        c1322170kVj.LIZ = i;
        c1322170kVj.LIZIZ = i2;
        float f = this.mAspectRatio;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (f > 0.0f && layoutParams != null) {
            int i3 = layoutParams.height;
            if (i3 != 0 && i3 != -2) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                c1322170kVj.LIZIZ = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c1322170kVj.LIZ) - paddingLeft) / f) + paddingTop), c1322170kVj.LIZIZ), 1073741824);
            } else {
                int i4 = layoutParams.width;
                if (i4 == 0 || i4 == -2) {
                    c1322170kVj.LIZ = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c1322170kVj.LIZIZ) - paddingTop) * f) + paddingLeft), c1322170kVj.LIZ), 1073741824);
                }
            }
        }
        C1322170kVj c1322170kVj2 = this.mMeasureSpec;
        super.onMeasure(c1322170kVj2.LIZ, c1322170kVj2.LIZIZ);
    }

    @Override // android.view.View
    public void onVisibilityChanged(final View view, final int i) {
        C822690WPb.LIZ().execute(new Runnable() { // from class: X.0Ga7
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DraweeView@f1ee.onVisibilityChanged$1");
                try {
                    super/*android.widget.ImageView*/.onVisibilityChanged(view, i);
                    this.LLILLL.maybeOverrideVisibilityHandling();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DraweeView@f1ee.onVisibilityChanged$1");
            }
        });
    }

    public C1322090kVb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMeasureSpec = new C1322170kVj();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        init(context);
    }

    public C1322090kVb(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mMeasureSpec = new C1322170kVj();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        init(context);
    }
}
