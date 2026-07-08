package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS41S0001000_29;

/* JADX INFO: renamed from: X.0MqY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC581000MqY implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
            case 4:
                onGlobalLayout$4(this);
                break;
            case 5:
                onGlobalLayout$5(this);
                break;
            case 6:
                onGlobalLayout$6(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC581000MqY viewTreeObserverOnGlobalLayoutListenerC581000MqY) {
        View view;
        View viewFindViewById;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C19A3 c19a3 = ((C553830Lnp) viewTreeObserverOnGlobalLayoutListenerC581000MqY.l0).LLJJIII;
        int i = 0;
        if (c19a3 != null && (viewFindViewById = c19a3.findViewById(R.id.gy2)) != null) {
            int measuredHeight = viewFindViewById.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                i = marginLayoutParams.bottomMargin;
            }
            i += measuredHeight;
        }
        C553830Lnp c553830Lnp = (C553830Lnp) viewTreeObserverOnGlobalLayoutListenerC581000MqY.l0;
        C19A3 c19a32 = c553830Lnp.LLJJIII;
        if (c19a32 != null && (view = c19a32.mView) != null) {
            ((C553830Lnp) viewTreeObserverOnGlobalLayoutListenerC581000MqY.l0).LLJJJJJIL.setValue(Float.valueOf(view.getMeasuredHeight() - i));
        } else {
            c553830Lnp.LLJJJJJIL.setValue(Float.valueOf(C418440Gaw.LIZIZ(222)));
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC581000MqY viewTreeObserverOnGlobalLayoutListenerC581000MqY) {
        ViewTreeObserver viewTreeObserver;
        C1846060y8i c1846060y8i = ((MvChoosePhotoScene) viewTreeObserverOnGlobalLayoutListenerC581000MqY.l0).mediaTypeNavigator;
        if (c1846060y8i != null && (viewTreeObserver = c1846060y8i.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC581000MqY);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC581000MqY, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        if (((MvChoosePhotoScene) viewTreeObserverOnGlobalLayoutListenerC581000MqY.l0).isLiveRecordingsTabVisible()) {
            MvChoosePhotoScene mvChoosePhotoScene = (MvChoosePhotoScene) viewTreeObserverOnGlobalLayoutListenerC581000MqY.l0;
            mvChoosePhotoScene.liveRecordingsEntranceShowReported = true;
            mvChoosePhotoScene.mobLiveRecordingsTabEntranceShow();
        } else {
            final MvChoosePhotoScene mvChoosePhotoScene2 = (MvChoosePhotoScene) viewTreeObserverOnGlobalLayoutListenerC581000MqY.l0;
            C1846060y8i c1846060y8i2 = mvChoosePhotoScene2.mediaTypeNavigator;
            if (c1846060y8i2 == null) {
                return;
            }
            c1846060y8i2.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: X.0KhB
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    MvChoosePhotoScene mvChoosePhotoScene3 = mvChoosePhotoScene2;
                    if (mvChoosePhotoScene3.liveRecordingsEntranceShowReported) {
                        C1846060y8i c1846060y8i3 = mvChoosePhotoScene3.mediaTypeNavigator;
                        if (c1846060y8i3 != null) {
                            c1846060y8i3.setOnScrollChangeListener(null);
                            return;
                        }
                        return;
                    }
                    if (!mvChoosePhotoScene3.isLiveRecordingsTabVisible()) {
                        return;
                    }
                    MvChoosePhotoScene mvChoosePhotoScene4 = mvChoosePhotoScene2;
                    mvChoosePhotoScene4.liveRecordingsEntranceShowReported = true;
                    C1846060y8i c1846060y8i4 = mvChoosePhotoScene4.mediaTypeNavigator;
                    if (c1846060y8i4 != null) {
                        c1846060y8i4.setOnScrollChangeListener(null);
                    }
                    mvChoosePhotoScene2.mobLiveRecordingsTabEntranceShow();
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onGlobalLayout$2(X.ViewTreeObserverOnGlobalLayoutListenerC581000MqY r8) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewTreeObserverOnGlobalLayoutListenerC581000MqY.onGlobalLayout$2(X.0MqY):void");
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC581000MqY viewTreeObserverOnGlobalLayoutListenerC581000MqY) {
        ConstraintLayout constraintLayout;
        ViewTreeObserver viewTreeObserver;
        ConstraintLayout constraintLayout2 = ((C572260McS) viewTreeObserverOnGlobalLayoutListenerC581000MqY.l0).LLJJI;
        if (constraintLayout2 != null && constraintLayout2.getMeasuredWidth() > 0 && (constraintLayout = ((C572260McS) viewTreeObserverOnGlobalLayoutListenerC581000MqY.l0).LLJJI) != null && constraintLayout.getMeasuredHeight() > 0) {
            C572260McS c572260McS = (C572260McS) viewTreeObserverOnGlobalLayoutListenerC581000MqY.l0;
            ConstraintLayout constraintLayout3 = c572260McS.LLJJI;
            if (constraintLayout3 != null) {
                constraintLayout3.getGlobalVisibleRect(c572260McS.LLJJL);
            }
            View view = ((C572260McS) viewTreeObserverOnGlobalLayoutListenerC581000MqY.l0).mView;
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC581000MqY);
                C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC581000MqY, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
        }
    }

    public static final void onGlobalLayout$4(ViewTreeObserverOnGlobalLayoutListenerC581000MqY viewTreeObserverOnGlobalLayoutListenerC581000MqY) {
        ((C556940Lsq) viewTreeObserverOnGlobalLayoutListenerC581000MqY.l0).LLLLLJLJLL().LIZ(Integer.valueOf(((C556940Lsq) viewTreeObserverOnGlobalLayoutListenerC581000MqY.l0).LLLLLJIL()));
    }

    public static final void onGlobalLayout$5(ViewTreeObserverOnGlobalLayoutListenerC581000MqY viewTreeObserverOnGlobalLayoutListenerC581000MqY) {
        C786410Ut5.C3(((FrameLayout) viewTreeObserverOnGlobalLayoutListenerC581000MqY.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC581000MqY);
        int iMax = (int) Math.max(C418440Gaw.LIZIZ(388), C1415610mwR.LIZ() * 0.5f);
        ViewGroup.LayoutParams layoutParams = ((FrameLayout) viewTreeObserverOnGlobalLayoutListenerC581000MqY.l0).getLayoutParams();
        layoutParams.height = iMax;
        C786410Ut5.a6((FrameLayout) viewTreeObserverOnGlobalLayoutListenerC581000MqY.l0, layoutParams);
    }

    public static final void onGlobalLayout$6(ViewTreeObserverOnGlobalLayoutListenerC581000MqY viewTreeObserverOnGlobalLayoutListenerC581000MqY) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C1173010gd9 c1173010gd9 = (C1173010gd9) viewTreeObserverOnGlobalLayoutListenerC581000MqY.l0;
        CutVideoPreviewViewModel cutVideoPreviewViewModel = c1173010gd9.LLJJJ;
        if (cutVideoPreviewViewModel == null) {
            cutVideoPreviewViewModel = null;
        }
        ViewGroup.LayoutParams layoutParams = c1173010gd9.LLLLIILL().mView.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i = marginLayoutParams.bottomMargin;
        } else {
            i = 0;
        }
        int height = i + ((C1173010gd9) viewTreeObserverOnGlobalLayoutListenerC581000MqY.l0).LLLLIILL().mView.getHeight();
        cutVideoPreviewViewModel.getClass();
        cutVideoPreviewViewModel.setState(new AwS41S0001000_29(height, 37));
        C786410Ut5.C3(((C1173010gd9) viewTreeObserverOnGlobalLayoutListenerC581000MqY.l0).mView.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC581000MqY);
    }

    public ViewTreeObserverOnGlobalLayoutListenerC581000MqY(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
