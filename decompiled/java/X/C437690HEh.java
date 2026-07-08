package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.aweme.im.service.service.IQuickDmService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0HEh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C437690HEh extends C09AY implements Function0<C437680HEg> {
    public C437690HEh() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C437680HEg invoke() {
        return new IQuickDmService() { // from class: X.0HEg
            @Override // com.ss.android.ugc.aweme.im.service.service.IQuickDmService
            public final Integer getNumEmojiToDisplayElseNull(String str) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IQuickDmService
            public final void onQuickReplyEmojiSendAnimations(View view, String str, Integer num, Function0<String> function0) {
                if (view != null && !C281310B0v.LIZ()) {
                    AwS585S0100000_6 awS585S0100000_6 = new AwS585S0100000_6(view, 24);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.8f);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.8f);
                    animatorSet.setDuration(150L);
                    animatorSet.setInterpolator(new LinearInterpolator());
                    awS585S0100000_6.invoke(animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2));
                    animatorSet.start();
                }
                String strInvoke = function0.invoke();
                if (!C123100dR.LIZ(strInvoke)) {
                    strInvoke = null;
                }
                String str2 = strInvoke;
                if (str2 != null) {
                    C0RSR c0rsr = new C0RSR(1, num);
                    c0rsr.LIZJ = str2;
                    c0rsr.LIZLLL = str;
                    C1440005kM.LIZ(c0rsr);
                }
            }
        };
    }
}
