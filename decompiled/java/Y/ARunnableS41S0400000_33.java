package Y;

import X.C0IDP;
import X.C16GX;
import X.C16GZ;
import X.C19V6;
import X.C19X2;
import X.C1C7U;
import X.C21553219Wo;
import X.C2179971ATj;
import X.C786410Ut5;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3NavHideOnScrollAssem;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.LynxExposeHelper;

/* JADX INFO: loaded from: classes34.dex */
public class ARunnableS41S0400000_33 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C19X2 c19x2 = (C19X2) this.l0;
        if (c19x2 != null) {
            ((C21553219Wo) this.l3).LL.LLJJLIIIJLLLLLLLZ = true;
            c19x2.LIZIZ.LIZJ(false);
            ((C21553219Wo) this.l3).LL.LLJJLIIIJLLLLLLLZ = false;
        }
        if (((MenuItem) this.l1).isEnabled() && ((MenuItem) this.l1).hasSubMenu()) {
            ((C19V6) this.l2).LJIILLIIL((MenuItem) this.l1, null, 4);
        }
    }

    public final void LIZ$1() {
        int height;
        C16GX c16gx;
        Drawable background;
        Drawable.ConstantState constantState;
        Drawable drawableNewDrawable;
        Drawable drawableMutate;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        FriendsV3NavHideOnScrollAssem friendsV3NavHideOnScrollAssem = (FriendsV3NavHideOnScrollAssem) this.l0;
        if (friendsV3NavHideOnScrollAssem.LLJI == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.l1;
        View view = (View) this.l2;
        View view2 = (View) this.l3;
        if (view.getHeight() > 0) {
            height = view.getHeight();
        } else {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            height = (layoutParams == null || layoutParams.height <= 0) ? 0 : view.getLayoutParams().height;
        }
        friendsV3NavHideOnScrollAssem.LLJILJILJ = height;
        int height2 = view2 != null ? view2.getHeight() : 0;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null && marginLayoutParams.topMargin != height2) {
            marginLayoutParams.topMargin = height2;
            C786410Ut5.W5(view, marginLayoutParams);
        }
        if (view2 != null) {
            view2.addOnLayoutChangeListener(new C0IDP(view, 8));
        }
        if (view.getBackground() == null && (background = frameLayout.getBackground()) != null && (constantState = background.getConstantState()) != null && (drawableNewDrawable = constantState.newDrawable()) != null && (drawableMutate = drawableNewDrawable.mutate()) != null) {
            view.setBackground(drawableMutate);
        }
        FriendsV3NavHideOnScrollAssem friendsV3NavHideOnScrollAssem2 = (FriendsV3NavHideOnScrollAssem) this.l0;
        if (!friendsV3NavHideOnScrollAssem2.LLJILLL && friendsV3NavHideOnScrollAssem2.LLJILJILJ > 0 && (c16gx = friendsV3NavHideOnScrollAssem2.LLJILJIL) != null) {
            View view3 = new View(c16gx.getContext());
            C16GZ c16gz = new C16GZ(friendsV3NavHideOnScrollAssem2.LLJILJILJ);
            c16gz.LIZ = 1;
            c16gx.addView(view3, 0, c16gz);
            friendsV3NavHideOnScrollAssem2.LLJILLL = true;
        }
        FriendsV3FeedListAbility friendsV3FeedListAbility = (FriendsV3FeedListAbility) ((FriendsV3NavHideOnScrollAssem) this.l0).LLJ.getValue();
        if (friendsV3FeedListAbility != null) {
            friendsV3FeedListAbility.OD(((FriendsV3NavHideOnScrollAssem) this.l0).LLJJIII);
        }
    }

    public static final void run$0(ARunnableS41S0400000_33 aRunnableS41S0400000_33) {
        try {
            aRunnableS41S0400000_33.LIZ$0();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$1(ARunnableS41S0400000_33 aRunnableS41S0400000_33) {
        boolean zLIZ;
        C1C7U.LIZ("FriendsV3NavHideOnScrollAssem@a277.onViewCreated$2");
        try {
            aRunnableS41S0400000_33.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FriendsV3NavHideOnScrollAssem@a277.onViewCreated$2");
    }

    public static final void run$2(ARunnableS41S0400000_33 aRunnableS41S0400000_33) {
        boolean zLIZ;
        C1C7U.LIZ("LynxExposeHelper$ExposeView@b1f9.1$2$onViewAttachedToWindow$1");
        try {
            ((LynxExposeHelper.ExposeView) aRunnableS41S0400000_33.l0).LIZ((ViewTreeObserver.OnGlobalLayoutListener) aRunnableS41S0400000_33.l1, (ViewTreeObserver.OnWindowFocusChangeListener) aRunnableS41S0400000_33.l2, (ViewTreeObserver.OnScrollChangedListener) aRunnableS41S0400000_33.l3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxExposeHelper$ExposeView@b1f9.1$2$onViewAttachedToWindow$1");
    }

    public ARunnableS41S0400000_33(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l3 = obj;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj4;
    }
}
