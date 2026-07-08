package X;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.FavoriteFragment;
import com.ss.android.ugc.aweme.tako.aivideo.detail.cell.TakoAIVideoFeedInfoAreaAssem;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import nv7.c0;
import y5o.n0;

/* JADX INFO: renamed from: X.0uI4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class ViewOnLayoutChangeListenerC1698100uI4 implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Throwable {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 4:
                onLayoutChange$4(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 5:
                onLayoutChange$5(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 6:
                onLayoutChange$6(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 7:
                onLayoutChange$7(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC1698100uI4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC1698100uI4 viewOnLayoutChangeListenerC1698100uI4, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        float f;
        TakoAIVideoFeedInfoAreaAssem takoAIVideoFeedInfoAreaAssem = (TakoAIVideoFeedInfoAreaAssem) viewOnLayoutChangeListenerC1698100uI4.l0;
        if (takoAIVideoFeedInfoAreaAssem.LLJL) {
            return;
        }
        if (takoAIVideoFeedInfoAreaAssem.LLJJJJLIIL) {
            i9 = 8;
        } else {
            i9 = 0;
        }
        if (view.getVisibility() != i9) {
            TakoAIVideoFeedInfoAreaAssem takoAIVideoFeedInfoAreaAssem2 = (TakoAIVideoFeedInfoAreaAssem) viewOnLayoutChangeListenerC1698100uI4.l0;
            takoAIVideoFeedInfoAreaAssem2.LLJL = true;
            takoAIVideoFeedInfoAreaAssem2.ep(i9, view);
            if (((TakoAIVideoFeedInfoAreaAssem) viewOnLayoutChangeListenerC1698100uI4.l0).LLJJJJLIIL) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            C786410Ut5.T4(view, f);
            ((TakoAIVideoFeedInfoAreaAssem) viewOnLayoutChangeListenerC1698100uI4.l0).LLJL = false;
        }
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC1698100uI4 viewOnLayoutChangeListenerC1698100uI4, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight;
        View decorView;
        if (i4 != i8 && ((BaseScreenAdaptScene) viewOnLayoutChangeListenerC1698100uI4.l0).LLLLLIL()) {
            if (((BaseScreenAdaptScene) viewOnLayoutChangeListenerC1698100uI4.l0).LLLLLILLIL() instanceof c0) {
                Window window = ((BaseScreenAdaptScene) viewOnLayoutChangeListenerC1698100uI4.l0).getWindow();
                if (window != null) {
                    decorView = window.getDecorView();
                } else {
                    decorView = null;
                }
                AFwS214S0000000_25 aFwS214S0000000_25 = AFwS214S0000000_25.get$arr$(87);
                if (decorView == null) {
                    iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight = ((Number) aFwS214S0000000_25.invoke()).intValue();
                } else {
                    iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight = C1257310ip7.LIZ(decorView);
                }
            } else {
                Activity activity = ((BaseScreenAdaptScene) viewOnLayoutChangeListenerC1698100uI4.l0).mActivity;
                if (activity != null) {
                    iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight = ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(activity);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            if (((BaseScreenAdaptScene) viewOnLayoutChangeListenerC1698100uI4.l0).LLLLLILLIL() instanceof c0) {
                c0.LIZ.LJIIJ(iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight);
                ((BaseScreenAdaptScene) viewOnLayoutChangeListenerC1698100uI4.l0).LLLLLJIL();
            } else {
                if (((BaseScreenAdaptScene) viewOnLayoutChangeListenerC1698100uI4.l0).LLJJJJJIL == iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight && !C0CHR.LIZ()) {
                    return;
                }
                BaseScreenAdaptScene baseScreenAdaptScene = (BaseScreenAdaptScene) viewOnLayoutChangeListenerC1698100uI4.l0;
                baseScreenAdaptScene.LLJJJJJIL = iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight;
                baseScreenAdaptScene.LLLLLILLIL().s2(iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight);
                ((BaseScreenAdaptScene) viewOnLayoutChangeListenerC1698100uI4.l0).LLLLLJIL();
            }
        }
    }

    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC1698100uI4 viewOnLayoutChangeListenerC1698100uI4, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Throwable {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1698100uI4);
        if (Intrinsics.LJFF(((FavoriteFragment) viewOnLayoutChangeListenerC1698100uI4.l0).PR().LIZ.LJIIJ(), ((FavoriteFragment) viewOnLayoutChangeListenerC1698100uI4.l0).LLJJ)) {
            ((FavoriteFragment) viewOnLayoutChangeListenerC1698100uI4.l0).setUserVisibleHint(true);
        }
    }

    public static final void onLayoutChange$3(ViewOnLayoutChangeListenerC1698100uI4 viewOnLayoutChangeListenerC1698100uI4, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C1654510t9l) viewOnLayoutChangeListenerC1698100uI4.l0).requestLayout();
    }

    public static final void onLayoutChange$4(ViewOnLayoutChangeListenerC1698100uI4 viewOnLayoutChangeListenerC1698100uI4, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C1654510t9l) viewOnLayoutChangeListenerC1698100uI4.l0).requestLayout();
    }

    public static final void onLayoutChange$5(ViewOnLayoutChangeListenerC1698100uI4 viewOnLayoutChangeListenerC1698100uI4, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1698100uI4);
        ((C1630020sWG) viewOnLayoutChangeListenerC1698100uI4.l0).LLLZI();
    }

    public static final void onLayoutChange$6(ViewOnLayoutChangeListenerC1698100uI4 viewOnLayoutChangeListenerC1698100uI4, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight;
        AbstractActivityC1674880tgc abstractActivityC1674880tgc = (AbstractActivityC1674880tgc) viewOnLayoutChangeListenerC1698100uI4.l0;
        if (i4 != i8) {
            if (abstractActivityC1674880tgc.LLLLZLLIL() instanceof c0) {
                iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight = C14KI.LIZJ(abstractActivityC1674880tgc);
            } else {
                iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight = ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(abstractActivityC1674880tgc);
            }
            if (abstractActivityC1674880tgc.LLLLZLLIL() instanceof c0) {
                c0.LIZ.LJIIJ(iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight);
                abstractActivityC1674880tgc.LLLZLZ();
                return;
            } else {
                if (abstractActivityC1674880tgc.LLILZIL == iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight) {
                    return;
                }
                abstractActivityC1674880tgc.LLILZIL = iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight;
                abstractActivityC1674880tgc.LLLLZLLIL().s2(iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight);
                abstractActivityC1674880tgc.LLLZLZ();
                return;
            }
        }
        abstractActivityC1674880tgc.getClass();
    }

    public static final void onLayoutChange$7(ViewOnLayoutChangeListenerC1698100uI4 viewOnLayoutChangeListenerC1698100uI4, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect) && !Intrinsics.LJFF(((n0) viewOnLayoutChangeListenerC1698100uI4.l0).LLJJL.getValue(), rect)) {
            ((n0) viewOnLayoutChangeListenerC1698100uI4.l0).LLJJL.setValue(rect);
        }
    }
}
