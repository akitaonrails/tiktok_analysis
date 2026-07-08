package Y;

import X.AbstractC1604130rqV;
import X.C0BMO;
import X.C0P0K;
import X.C0P0T;
import X.C0S4J;
import X.C280060AyK;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.detail.prefab.ShootAssem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModeReachBottomGuideAssem;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadService;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.utils.OnboardingButtonClickListener;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.utils.OpenDialogBoxUtil;

/* JADX INFO: loaded from: classes10.dex */
public class ATListenerS443S0100000_9 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS443S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS443S0100000_9 aTListenerS443S0100000_9, View view, MotionEvent motionEvent) {
        ShootAssem shootAssem = (ShootAssem) aTListenerS443S0100000_9.l0;
        if (!shootAssem.LLJJJIL) {
            shootAssem.LLJJJIL = true;
            if (C280060AyK.LIZ() && ((Number) C0BMO.LIZ.getValue()).intValue() == 2) {
                ((ILayoutPreloadService) ServiceManager.get().getService(ILayoutPreloadService.class)).preloadLayoutFiles();
            }
        }
        return false;
    }

    public static final boolean onTouch$1(ATListenerS443S0100000_9 aTListenerS443S0100000_9, View view, MotionEvent motionEvent) {
        return ((GestureDetector) aTListenerS443S0100000_9.l0).onTouchEvent(motionEvent);
    }

    public static final boolean onTouch$2(ATListenerS443S0100000_9 aTListenerS443S0100000_9, View view, MotionEvent motionEvent) {
        return ((C0P0K) aTListenerS443S0100000_9.l0).onTouchEvent(motionEvent);
    }

    public static final boolean onTouch$3(ATListenerS443S0100000_9 aTListenerS443S0100000_9, View view, MotionEvent motionEvent) {
        OfflineModeReachBottomGuideAssem offlineModeReachBottomGuideAssem = (OfflineModeReachBottomGuideAssem) aTListenerS443S0100000_9.l0;
        if (!offlineModeReachBottomGuideAssem.LLJZIJLIL) {
            return false;
        }
        View view2 = offlineModeReachBottomGuideAssem.LLJZ;
        if (view2 != null) {
            view2.getHitRect(offlineModeReachBottomGuideAssem.LLLFF);
        }
        if (offlineModeReachBottomGuideAssem.LLLFF.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return true;
        }
        if (motionEvent.getActionMasked() == 0) {
            C0S4J c0s4j = ((OfflineModeReachBottomGuideAssem) aTListenerS443S0100000_9.l0).LLLII;
            boolean z = AbstractC1604130rqV.LIZLLL;
            c0s4j.LIZ("[dismiss][ACTION_DOWN]", null);
            ((OfflineModeReachBottomGuideAssem) aTListenerS443S0100000_9.l0).dismiss();
        }
        return false;
    }

    public static final boolean onTouch$4(ATListenerS443S0100000_9 aTListenerS443S0100000_9, View view, MotionEvent motionEvent) {
        OnboardingButtonClickListener onboardingButtonClickListener = ((OpenDialogBoxUtil) aTListenerS443S0100000_9.l0).LLJ;
        if (onboardingButtonClickListener != null) {
            onboardingButtonClickListener.sg();
        }
        ((OpenDialogBoxUtil) aTListenerS443S0100000_9.l0).dismiss();
        return true;
    }

    public static final boolean onTouch$5(ATListenerS443S0100000_9 aTListenerS443S0100000_9, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((C0P0T) aTListenerS443S0100000_9.l0).dismiss();
            return true;
        }
        return true;
    }
}
