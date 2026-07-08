package X;

import android.animation.Animator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.userservice.UserService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS629S0100000_15;

/* JADX INFO: renamed from: X.0apE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949860apE {
    public final String LIZ;
    public final ViewGroup LIZIZ;
    public final Map<String, C1295960jpS> LIZJ = new LinkedHashMap();

    public final void LIZ(final String str) {
        final C1295960jpS c1295960jpS = (C1295960jpS) ((LinkedHashMap) this.LIZJ).get(str);
        if (c1295960jpS == null) {
            c1295960jpS = new C1295960jpS(this.LIZIZ.getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C497740JfY.LIZIZ(320.0f), (int) C497740JfY.LIZIZ(320.0f), 17);
            layoutParams.setMargins(0, 0, 0, 0);
            C786410Ut5.s6(c1295960jpS, layoutParams);
            this.LIZJ.put(str, c1295960jpS);
        }
        c1295960jpS.removeAllAnimatorListeners();
        c1295960jpS.clearAnimation();
        c1295960jpS.addAnimatorListener(new Animator.AnimatorListener() { // from class: X.0apF
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("lottie onAnimationCancel: ");
                sbLIZ.append(str);
                C20441214yg.LIZIZ("LottieLoader", C2188811AlT.LIZIZ(sbLIZ));
                C930540aK4.LJJIJL(c1295960jpS);
                c1295960jpS.removeAnimatorListener(this);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("lottie onAnimationEnd: ");
                sbLIZ.append(str);
                C20441214yg.LIZIZ("LottieLoader", C2188811AlT.LIZIZ(sbLIZ));
                C930540aK4.LJJIJL(c1295960jpS);
                c1295960jpS.removeAnimatorListener(this);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("lottie onAnimationStart: ");
                sbLIZ.append(str);
                C20441214yg.LIZIZ("LottieLoader", C2188811AlT.LIZIZ(sbLIZ));
            }
        });
        final AwS629S0100000_15 awS629S0100000_15 = new AwS629S0100000_15(this, 69);
        C1143680frq.LJIILL(c1295960jpS, this.LIZ, str, false, new InterfaceC1143790fs1() { // from class: X.0aVF
            @Override // X.InterfaceC1143790fs1
            public final void onFinish(boolean z) {
                if (!z) {
                    C1295960jpS c1295960jpS2 = c1295960jpS;
                    if (c1295960jpS2 != null) {
                        C439101nJ.LJI(c1295960jpS2);
                    }
                    String strLJIILL = C917520Zz4.LJIILL(UserService.getInstance().user().LJIJJLI());
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("lottie failed for ");
                    sbLIZ.append(str);
                    C01N8.LIZ(-1, "LottieLoader", "ACTION_LOTTIE", 0L, strLJIILL, C2188811AlT.LIZIZ(sbLIZ), "");
                    return;
                }
                String strLJIILL2 = C917520Zz4.LJIILL(UserService.getInstance().user().LJIJJLI());
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("lottie success for ");
                sbLIZ2.append(str);
                C01N8.LIZ(0, "LottieLoader", "ACTION_LOTTIE", 0L, strLJIILL2, C2188811AlT.LIZIZ(sbLIZ2), "");
                awS629S0100000_15.invoke(c1295960jpS, str);
            }
        });
    }

    public C949860apE(String str, ViewGroup viewGroup) {
        this.LIZ = str;
        this.LIZIZ = viewGroup;
    }
}
