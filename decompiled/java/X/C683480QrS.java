package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0QrS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C683480QrS {
    public static final C683480QrS LIZ = new C683480QrS();

    public static void LIZ(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "rotation", 0.0f, -20.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "rotation", -20.0f, 20.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "rotation", 20.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        if (((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).enableAddCartAnimatorOpt()) {
            objectAnimatorOfFloat.setDuration(100L);
            objectAnimatorOfFloat2.setDuration(100L);
            objectAnimatorOfFloat3.setDuration(100L);
        }
        animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet.start();
    }
}
