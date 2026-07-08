package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0MqW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class ViewTreeObserverOnPreDrawListenerC580980MqW implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(ViewTreeObserverOnPreDrawListenerC580980MqW viewTreeObserverOnPreDrawListenerC580980MqW) {
        ((MvChoosePhotoScene) viewTreeObserverOnPreDrawListenerC580980MqW.l0).startChoosePhotoSceneAnim();
        C786410Ut5.D3(((View) viewTreeObserverOnPreDrawListenerC580980MqW.l1).getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC580980MqW);
        return true;
    }

    public static final boolean onPreDraw$1(ViewTreeObserverOnPreDrawListenerC580980MqW viewTreeObserverOnPreDrawListenerC580980MqW) {
        C786410Ut5.D3(((View) viewTreeObserverOnPreDrawListenerC580980MqW.l0).getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC580980MqW);
        TuxImmersionBar tuxImmersionBarLJ = C1766560w4U.LJ((ChooseCoverActivity) viewTreeObserverOnPreDrawListenerC580980MqW.l1);
        tuxImmersionBarLJ.LJIIIIZZ(R.attr.zm);
        tuxImmersionBarLJ.LIZIZ.LJIIJ(true);
        tuxImmersionBarLJ.LIZLLL();
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC580980MqW(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
