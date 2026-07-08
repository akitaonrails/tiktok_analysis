package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFYPCardPerformanceOptSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.lynx.tasm.behavior.ui.swiper.XSwiperUI;
import defpackage.RecyclerViewFirstDrawWatcher;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Amh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class ViewOnAttachStateChangeListenerC2189571Amh implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC2189571Amh viewOnAttachStateChangeListenerC2189571Amh, View view) {
    }

    public static final void onViewAttachedToWindow$2(ViewOnAttachStateChangeListenerC2189571Amh viewOnAttachStateChangeListenerC2189571Amh, View view) {
    }

    public static final void onViewAttachedToWindow$4(ViewOnAttachStateChangeListenerC2189571Amh viewOnAttachStateChangeListenerC2189571Amh, View view) {
    }

    public static final void onViewAttachedToWindow$5(ViewOnAttachStateChangeListenerC2189571Amh viewOnAttachStateChangeListenerC2189571Amh, View view) {
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC2189571Amh viewOnAttachStateChangeListenerC2189571Amh, View view) {
    }

    public static final void onViewDetachedFromWindow$3(ViewOnAttachStateChangeListenerC2189571Amh viewOnAttachStateChangeListenerC2189571Amh, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
            case 2:
                onViewAttachedToWindow$2(this, view);
                break;
            case 3:
                onViewAttachedToWindow$3(this, view);
                break;
            case 4:
                onViewAttachedToWindow$4(this, view);
                break;
            case 5:
                onViewAttachedToWindow$5(this, view);
                break;
            case 6:
                onViewAttachedToWindow$6(this, view);
                break;
            case 7:
                onViewAttachedToWindow$7(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
            case 2:
                onViewDetachedFromWindow$2(this, view);
                break;
            case 3:
                onViewDetachedFromWindow$3(this, view);
                break;
            case 4:
                onViewDetachedFromWindow$4(this, view);
                break;
            case 5:
                onViewDetachedFromWindow$5(this, view);
                break;
            case 6:
                onViewDetachedFromWindow$6(this, view);
                break;
            case 7:
                onViewDetachedFromWindow$7(this, view);
                break;
        }
    }

    public ViewOnAttachStateChangeListenerC2189571Amh(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC2189571Amh viewOnAttachStateChangeListenerC2189571Amh, View view) {
        ((RecyclerViewFirstDrawWatcher) viewOnAttachStateChangeListenerC2189571Amh.l0).LL.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC2189571Amh);
        ((RecyclerViewFirstDrawWatcher) viewOnAttachStateChangeListenerC2189571Amh.l0).LIZIZ();
    }

    public static final void onViewAttachedToWindow$3(ViewOnAttachStateChangeListenerC2189571Amh viewOnAttachStateChangeListenerC2189571Amh, View view) {
        ((C1AJ2) viewOnAttachStateChangeListenerC2189571Amh.l0).LLJI = true;
        view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC2189571Amh);
    }

    public static final void onViewAttachedToWindow$6(ViewOnAttachStateChangeListenerC2189571Amh viewOnAttachStateChangeListenerC2189571Amh, View view) {
        C21694119vH c21694119vH = (C21694119vH) viewOnAttachStateChangeListenerC2189571Amh.l0;
        c21694119vH.getClass();
        C036E.LIZ.LIZ(c21694119vH.LLJJJJLIIL);
    }

    public static final void onViewAttachedToWindow$7(ViewOnAttachStateChangeListenerC2189571Amh viewOnAttachStateChangeListenerC2189571Amh, View view) {
        XSwiperUI xSwiperUI = (XSwiperUI) viewOnAttachStateChangeListenerC2189571Amh.l0;
        xSwiperUI.LLJJJ = true;
        if (xSwiperUI.LLJILLL) {
            xSwiperUI.LLJLIL.removeCallbacks(xSwiperUI.LLJLL);
            XSwiperUI xSwiperUI2 = (XSwiperUI) viewOnAttachStateChangeListenerC2189571Amh.l0;
            C786410Ut5.LJLIIL(xSwiperUI2.LLJJIII, xSwiperUI2.LLJLIL, xSwiperUI2.LLJLL);
        }
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC2189571Amh viewOnAttachStateChangeListenerC2189571Amh, View view) {
        ViewTreeObserver viewTreeObserver = ((ViewOnKeyListenerC21552919Wl) viewOnAttachStateChangeListenerC2189571Amh.l0).LLJJJJLIIL;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                ((ViewOnKeyListenerC21552919Wl) viewOnAttachStateChangeListenerC2189571Amh.l0).LLJJJJLIIL = view.getViewTreeObserver();
            }
            ViewOnKeyListenerC21552919Wl viewOnKeyListenerC21552919Wl = (ViewOnKeyListenerC21552919Wl) viewOnAttachStateChangeListenerC2189571Amh.l0;
            C786410Ut5.A3(viewOnKeyListenerC21552919Wl.LLJJJJLIIL, viewOnKeyListenerC21552919Wl.LLJI);
        }
        view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC2189571Amh);
    }

    public static final void onViewDetachedFromWindow$2(ViewOnAttachStateChangeListenerC2189571Amh viewOnAttachStateChangeListenerC2189571Amh, View view) {
        ViewTreeObserver viewTreeObserver = ((ViewOnKeyListenerC21552819Wk) viewOnAttachStateChangeListenerC2189571Amh.l0).LLJJI;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                ((ViewOnKeyListenerC21552819Wk) viewOnAttachStateChangeListenerC2189571Amh.l0).LLJJI = view.getViewTreeObserver();
            }
            ViewOnKeyListenerC21552819Wk viewOnKeyListenerC21552819Wk = (ViewOnKeyListenerC21552819Wk) viewOnAttachStateChangeListenerC2189571Amh.l0;
            C786410Ut5.A3(viewOnKeyListenerC21552819Wk.LLJJI, viewOnKeyListenerC21552819Wk.LLJI);
        }
        view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC2189571Amh);
    }

    public static final void onViewDetachedFromWindow$4(ViewOnAttachStateChangeListenerC2189571Amh viewOnAttachStateChangeListenerC2189571Amh, View view) {
        ((RecyclerViewFirstDrawWatcher) viewOnAttachStateChangeListenerC2189571Amh.l0).LIZ();
    }

    public static final void onViewDetachedFromWindow$5(ViewOnAttachStateChangeListenerC2189571Amh viewOnAttachStateChangeListenerC2189571Amh, View view) {
        AbstractC914750Zub abstractC914750Zub;
        Pair<Rect, Bitmap> pair;
        Bitmap second;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewDetachedFromWindow ");
        sbLIZ.append(((C1AF3) viewOnAttachStateChangeListenerC2189571Amh.l0).LIZIZ);
        C20441214yg.LIZIZ("LinkMicFeedCoverViewManager", C2188811AlT.LIZIZ(sbLIZ));
        view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC2189571Amh);
        C1AF3 c1af3 = (C1AF3) viewOnAttachStateChangeListenerC2189571Amh.l0;
        ViewGroup viewGroup = c1af3.LJJIJIL;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener((View.OnLayoutChangeListener) c1af3.LJJIL.getValue());
        }
        C1AF3 c1af32 = (C1AF3) viewOnAttachStateChangeListenerC2189571Amh.l0;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1af32.LJIIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            C930540aK4.LJJIJL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
            if (LinkMicFYPCardPerformanceOptSetting.INSTANCE.preloadOptEnable()) {
                SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
                if (sparkContext != null) {
                    sparkContext.LJJIII(InterfaceC1514950pWf.class);
                }
                C14CE.LIZ.getClass();
                C14CE.LIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
                c1af32.LJIIL = null;
            } else {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
            }
        }
        C1AF3 c1af33 = (C1AF3) viewOnAttachStateChangeListenerC2189571Amh.l0;
        C1AF4 c1af4 = c1af33.LJJIZ;
        if (c1af4 != null) {
            C14CE.LIZ.getClass();
            WeakReference<AbstractC914750Zub> weakReference = C14CE.LIZIZ;
            if (weakReference != null) {
                abstractC914750Zub = weakReference.get();
            } else {
                abstractC914750Zub = null;
            }
            if (Intrinsics.LJFF(abstractC914750Zub, c1af4)) {
                C14CE.LIZIZ = null;
            }
            if (c1af33.LJJI() && (pair = c1af4.LJ) != null && (second = pair.getSecond()) != null) {
                second.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(second);
            }
            c1af33.LJJIZ = null;
        }
        C1AF3 c1af34 = (C1AF3) viewOnAttachStateChangeListenerC2189571Amh.l0;
        c1af34.LJJIJIL = null;
        c1af34.LIZ.onDestroy();
        ((C1AF3) viewOnAttachStateChangeListenerC2189571Amh.l0).LJJIIJ.LJ();
    }

    public static final void onViewDetachedFromWindow$6(ViewOnAttachStateChangeListenerC2189571Amh viewOnAttachStateChangeListenerC2189571Amh, View view) {
        C21694119vH c21694119vH = (C21694119vH) viewOnAttachStateChangeListenerC2189571Amh.l0;
        c21694119vH.getClass();
        C036E.LIZ.LIZLLL(c21694119vH.LLJJJJLIIL);
    }

    public static final void onViewDetachedFromWindow$7(ViewOnAttachStateChangeListenerC2189571Amh viewOnAttachStateChangeListenerC2189571Amh, View view) {
        XSwiperUI xSwiperUI = (XSwiperUI) viewOnAttachStateChangeListenerC2189571Amh.l0;
        if (xSwiperUI.LLJJJJLIIL && ((C21405118pl) xSwiperUI.mView).getViewPager().LLJI) {
            C21606519h9 viewPager = ((C21405118pl) ((XSwiperUI) viewOnAttachStateChangeListenerC2189571Amh.l0).mView).getViewPager();
            if (viewPager.LLLLII != Integer.MIN_VALUE) {
                if (viewPager.LJIIJJI()) {
                    viewPager.scrollTo(viewPager.LLJ.getCurrX(), viewPager.LLLLII);
                } else {
                    viewPager.scrollTo(viewPager.LLLLII, viewPager.LLJ.getCurrY());
                }
            }
            viewPager.LLLLII = Integer.MIN_VALUE;
        }
        XSwiperUI xSwiperUI2 = (XSwiperUI) viewOnAttachStateChangeListenerC2189571Amh.l0;
        xSwiperUI2.LLJJJ = false;
        xSwiperUI2.LLJLIL.removeCallbacks(xSwiperUI2.LLJLL);
    }
}
