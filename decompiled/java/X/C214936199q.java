package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.scene.navigation.NavigationScene;

/* JADX INFO: renamed from: X.199q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214936199q {
    public final String LIZ;
    public final Bundle LIZIZ;
    public boolean LIZJ = true;
    public boolean LIZLLL = true;
    public int LJ;
    public boolean LJFF;
    public float LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;

    public final Bundle LIZ() {
        if (TextUtils.isEmpty(this.LIZ)) {
            throw new IllegalArgumentException("call setRootScene first");
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("extra_rootScene", this.LIZ, bundle);
        C786410Ut5.LJJIIZI(bundle, this.LIZIZ, "extra_rootScene_arguments");
        bundle.putBoolean("extra_drawWindowBackground", this.LIZJ);
        bundle.putBoolean("extra_fixSceneBackground_enabled", this.LIZLLL);
        bundle.putInt("extra_sceneBackground", this.LJ);
        bundle.putBoolean("extra_onlyRestoreVisibleScene", this.LJFF);
        bundle.putFloat("extra_autoRecycleInvisibleScenesThreshold", this.LJI);
        bundle.putBoolean("extra_useActivityContextAndLayoutInflater", this.LJII);
        bundle.putBoolean("extra_lazyLoadNavigationSceneUnnecessaryView", this.LJIIIIZZ);
        bundle.putBoolean("extra_mergeNavigationSceneView", this.LJIIIZ);
        bundle.putBoolean("extra_useWindowFocusChangedDispatch", this.LJIIJ);
        bundle.putBoolean("extra_reduceColdStartCallStack", this.LJIIJJI);
        bundle.putBoolean("extra_optimizedViewLayer", this.LJIIL);
        bundle.putBoolean("extra_reuseOutsideView", this.LJIILIIL);
        bundle.putBoolean("extra_onlyDispatchToTopSceneWindowInsets", this.LJIILJJIL);
        bundle.putBoolean("extra_useExtraViewToBlockGesture", this.LJIILL);
        bundle.putBoolean("extra_skipPopAnimationWhenTargetIsDestroyed", this.LJIILLIIL);
        bundle.putBoolean("extra_fixOnResultTiming", this.LJIIZILJ);
        return bundle;
    }

    public C214936199q(Bundle bundle, Class cls) {
        if (!cls.isAssignableFrom(NavigationScene.class)) {
            this.LIZ = cls.getName();
            this.LIZIZ = bundle;
            return;
        }
        throw new IllegalArgumentException("cant use NavigationScene as root scene");
    }

    public C214936199q(String str, Bundle bundle) {
        this.LIZ = str;
        this.LIZIZ = bundle;
    }
}
