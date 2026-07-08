package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0k1G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1303280k1G extends C1295960jpS {
    public void com_ss_android_ugc_aweme_base_ui_AnimationImageView__onDraw$___twin___(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // X.C1295960jpS, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        com_ss_android_ugc_aweme_base_ui_AnimationImageView_com_bytedance_tt_reliability_monitor_viewchecker_BitmapCrashChecker_onDraw(this, canvas);
    }

    private void init() {
        setImageFolder("images");
        addAnimatorListener(new AnimatorListenerAdapter() { // from class: X.0k1H
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                this.LL.setLayerType(0, null);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                this.LL.setLayerType(0, null);
            }
        });
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelAnimation();
    }

    public C1303280k1G(Context context) {
        super(context);
        init();
    }

    private void setImageFolder(String str) {
        setImageAssetsFolder(str);
    }

    public C1303280k1G(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public static void com_ss_android_ugc_aweme_base_ui_AnimationImageView_com_bytedance_tt_reliability_monitor_viewchecker_BitmapCrashChecker_onDraw(C1303280k1G c1303280k1G, Canvas canvas) {
        try {
            c1303280k1G.com_ss_android_ugc_aweme_base_ui_AnimationImageView__onDraw$___twin___(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, c1303280k1G);
            throw e;
        }
    }

    public C1303280k1G(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
