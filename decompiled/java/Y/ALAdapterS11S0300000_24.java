package Y;

import X.C1591700rWS;
import X.C1592450rXf;
import X.C705890RmV;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import com.ss.android.ugc.aweme.detail.ui.im.IMDetailPageComponent;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS264S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public class ALAdapterS11S0300000_24 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.$t != 0) {
            super.onAnimationStart(animator);
        } else {
            onAnimationStart$0(this, animator);
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS11S0300000_24 aLAdapterS11S0300000_24, final Animator animator) {
        ((C1592450rXf) aLAdapterS11S0300000_24.l1).removeOnLayoutChangeListener(((C1591700rWS) aLAdapterS11S0300000_24.l0).LJI);
        final C1592450rXf c1592450rXf = (C1592450rXf) aLAdapterS11S0300000_24.l1;
        final C1591700rWS c1591700rWS = (C1591700rWS) aLAdapterS11S0300000_24.l0;
        final C705890RmV c705890RmV = (C705890RmV) aLAdapterS11S0300000_24.l2;
        c1592450rXf.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0rWV
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view.removeOnLayoutChangeListener(this);
                c1591700rWS.LIZLLL(c1592450rXf, c705890RmV);
                Iterator<AnimatorListenerAdapter> it2 = c1591700rWS.LJ.iterator();
                while (it2.hasNext()) {
                    it2.next().onAnimationEnd(animator);
                }
            }
        });
    }

    public static final void onAnimationEnd$1(ALAdapterS11S0300000_24 aLAdapterS11S0300000_24, Animator animator) {
        C786410Ut5.LJLLLLLL(4, (View) aLAdapterS11S0300000_24.l0);
        ((SAFTikTokFragment) ((Fragment) aLAdapterS11S0300000_24.l1)).aS(AFwS264S0000000_24.get$arr$(617));
        IMDetailPageComponent iMDetailPageComponent = (IMDetailPageComponent) aLAdapterS11S0300000_24.l2;
        iMDetailPageComponent.LLLLLLJ = false;
        super/*com.ss.android.ugc.aweme.detail.platform.DetailPageComponent*/.LJIJ();
    }

    public static final void onAnimationStart$0(ALAdapterS11S0300000_24 aLAdapterS11S0300000_24, Animator animator) {
        super.onAnimationStart(animator);
        C1591700rWS c1591700rWS = (C1591700rWS) aLAdapterS11S0300000_24.l0;
        c1591700rWS.LJIILLIIL = c1591700rWS.LIZIZ((C1592450rXf) aLAdapterS11S0300000_24.l1);
        Iterator<AnimatorListenerAdapter> it2 = ((C1591700rWS) aLAdapterS11S0300000_24.l0).LJ.iterator();
        while (it2.hasNext()) {
            it2.next().onAnimationStart(animator);
        }
    }

    public ALAdapterS11S0300000_24(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
