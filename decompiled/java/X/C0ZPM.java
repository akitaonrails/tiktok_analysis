package X;

import Y.ARunnableS109S0100000_9;
import android.view.ViewPropertyAnimator;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.socialavatar.SocialAvatarFeature;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZPM, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZPM implements InterfaceC894770Z8h {
    public static final /* synthetic */ int LIZJ = 0;
    public C899130ZPb LIZ;
    public C0ZPP LIZIZ;

    @Override // X.InterfaceC894770Z8h
    public final void LIZIZ(boolean z) {
        C19727912Gn c19727912Gn;
        int i;
        C0ZPP c0zpp = this.LIZIZ;
        if (c0zpp != null) {
            if (!c0zpp.LIZ) {
                C19727912Gn c19727912Gn2 = c0zpp.LIZIZ;
                if (c19727912Gn2 != null) {
                    if (z) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    C786410Ut5.LJLLLLLL(i, c19727912Gn2);
                }
                if (z && (c19727912Gn = c0zpp.LIZIZ) != null) {
                    c19727912Gn.setActive(true);
                    return;
                }
                return;
            }
            C19727912Gn c19727912Gn3 = c0zpp.LIZIZ;
            if (c19727912Gn3 == null) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = null;
            if (z) {
                ViewPropertyAnimator viewPropertyAnimator2 = c0zpp.LIZJ;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate = c19727912Gn3.animate();
                if (viewPropertyAnimatorAnimate != null) {
                    viewPropertyAnimatorAnimate.alpha(1.0f);
                    viewPropertyAnimatorAnimate.setDuration(250L);
                    viewPropertyAnimatorAnimate.withStartAction(new ARunnableS109S0100000_9((Object) c19727912Gn3, 207));
                    viewPropertyAnimator = viewPropertyAnimatorAnimate;
                }
                c0zpp.LIZJ = viewPropertyAnimator;
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator3 = c0zpp.LIZJ;
            if (viewPropertyAnimator3 != null) {
                viewPropertyAnimator3.cancel();
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = c19727912Gn3.animate();
            if (viewPropertyAnimatorAnimate2 != null) {
                viewPropertyAnimatorAnimate2.alpha(0.0f);
                viewPropertyAnimatorAnimate2.setDuration(250L);
                viewPropertyAnimatorAnimate2.withEndAction(new ARunnableS109S0100000_9((Object) c19727912Gn3, 208));
                viewPropertyAnimator = viewPropertyAnimatorAnimate2;
            }
            c0zpp.LIZJ = viewPropertyAnimator;
        }
    }

    @Override // X.InterfaceC894770Z8h
    public final InterfaceC1398730mVD LIZ(C1609500rzA c1609500rzA, LifecycleOwner lifecycleOwner, String str, String str2, boolean z, Function1 function1, Function0 function0) {
        SocialAvatarFeature socialAvatarFeatureLIZ;
        if (this.LIZ == null || !(c1609500rzA instanceof C1609500rzA) || c1609500rzA == null || (socialAvatarFeatureLIZ = SocialAvatarFeature.LIZ.LIZ()) == null) {
            return null;
        }
        C1605770rt9 c1605770rt9 = new C1605770rt9(EnumC1615506Uf.STORY, c1609500rzA, lifecycleOwner, EnumC1606080rte.DM);
        c1605770rt9.LJFF = str;
        c1605770rt9.LJI = str2;
        c1605770rt9.LJIIJ = false;
        if (function1 != null) {
            c1605770rt9.LJIIIIZZ = function1;
        }
        if (function0 != null) {
            c1605770rt9.LJIIJJI = function0;
        }
        return socialAvatarFeatureLIZ.LIZ(c1605770rt9);
    }
}
