package X;

import Y.AUListenerS278S0100000_31;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimation;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimationItem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: renamed from: X.15O6, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15O6 implements AnonymousClass1800 {
    public Context LIZ;
    public Long LIZIZ;
    public final InterfaceC756790TmP LIZJ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).j6();
    public LiveBagIconAnimationItem LIZLLL;
    public C15O3 LJ;
    public View LJFF;
    public boolean LJI;

    @Override // X.AnonymousClass1800
    public final void LIZIZ() {
        this.LJ = null;
        this.LJI = false;
    }

    @Override // X.AnonymousClass1800
    public final void LJ(long j, LiveBagIconAnimation liveBagIconAnimation) {
    }

    public final void LJFF() {
        this.LJI = false;
        C1440005kM.LIZ(new C591940NJo(6, false));
    }

    @Override // X.AnonymousClass1800
    public final void destroy() {
        this.LJI = false;
        C15O3 c15o3 = this.LJ;
        if (c15o3 != null && (!c15o3.LJFF)) {
            c15o3.LIZ(true);
        }
        this.LJ = null;
    }

    @Override // X.AnonymousClass1800
    public final void LIZ() {
        C15O3 c15o3 = this.LJ;
        if (c15o3 != null && (!c15o3.LJFF)) {
            c15o3.LIZ(true);
            LJII("show_anim", "screen_clear");
        }
        this.LJ = null;
        LJFF();
    }

    @Override // X.AnonymousClass1800
    public final void LIZJ() {
        ViewGroup viewGroup;
        Context context = this.LIZ;
        if (context == null) {
            LJII("show_anim", "create_promotion_bubble_fail");
            LJFF();
            return;
        }
        AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(42);
        Rect rectLIZ = C21206517yp.LIZ(context, this.LIZJ, true);
        if (rectLIZ == null) {
            LJII("show_anim", "create_promotion_bubble_fail");
            LJFF();
            return;
        }
        int iCenterX = rectLIZ.centerX();
        int i = rectLIZ.top;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ == null || (viewGroup = (ViewGroup) activityLIZ.findViewById(R.id.q32)) == null) {
            LJII("show_anim", "create_promotion_bubble_fail");
            LJFF();
            return;
        }
        C15O4 c15o4 = new C15O4();
        c15o4.LIZ = -1;
        c15o4.LIZIZ = viewGroup;
        c15o4.LJII = iCenterX;
        c15o4.LJIIIIZZ = i;
        c15o4.LIZLLL = C0H9H.LIZIZ(10);
        c15o4.LJIIJJI = C0H9H.LIZIZ(28);
        c15o4.LJIIL = C0H9H.LIZIZ(6);
        c15o4.LJIIJ = C0H9H.LIZ(15);
        c15o4.LJIIIZ = this.LJFF;
        c15o4.LJIILL = new AwS645S0100000_31(this, 1);
        c15o4.LJFF = 150L;
        c15o4.LJI = 200L;
        c15o4.LJ = 2000L;
        c15o4.LJIILJJIL = null;
        c15o4.LJIILIIL = aFwS221S0000000_31;
        C15O3 c15o3 = new C15O3(context, c15o4);
        this.LJ = c15o3;
        if (c15o4.LJII < 0 || c15o4.LJIIIIZZ < 0 || c15o4.LIZIZ == null || !c15o3.LJFF) {
            return;
        }
        if (c15o3.LJ()) {
            c15o3.LJFF();
            return;
        }
        int i2 = c15o4.LIZLLL;
        c15o3.LJIIL = i2;
        if (i2 < 0) {
            c15o3.LJIIL = 0;
        }
        c15o3.LJIIL = c15o3.LJIIL;
        c15o3.LIZLLL();
        if (c15o3.LJ()) {
            c15o3.LJFF();
        }
    }

    @Override // X.AnonymousClass1800
    public final boolean isShowing() {
        return this.LJI;
    }

    @Override // X.AnonymousClass1800
    public final void init(Context context) {
        this.LIZ = context;
    }

    public final void LJII(String str, String str2) {
        C21212917zr c21212917zrLIZIZ = C21213217zu.LIZ.LIZIZ(this.LIZIZ);
        if (c21212917zrLIZIZ != null) {
            c21212917zrLIZIZ.LIZLLL(str, str2, false);
        }
    }

    @Override // X.AnonymousClass1800
    public final void LIZLLL(long j, LiveBagIconAnimation liveBagIconAnimation, AwS610S0100000_31 awS610S0100000_31) {
        List<LiveBagIconAnimationItem> list;
        String str;
        Integer num;
        C419910GdJ c419910GdJ;
        this.LIZIZ = Long.valueOf(j);
        if (liveBagIconAnimation != null) {
            list = liveBagIconAnimation.animationItemList;
        } else {
            list = null;
        }
        Context context = this.LIZ;
        if (context != null) {
            View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.bv4, null);
            TextView textView = (TextView) viewLJLLJ.findViewById(R.id.o8v);
            if (list != null) {
                for (LiveBagIconAnimationItem liveBagIconAnimationItem : list) {
                    List<String> list2 = liveBagIconAnimationItem.itemTextList;
                    if (list2 != null && (str = (String) C13LP.LJJJLZIJ(0, list2)) != null && new Paint(textView.getPaint()).measureText(str) < textView.getMaxWidth()) {
                        this.LIZLLL = liveBagIconAnimationItem;
                        textView.setText(str);
                        TuxIconView tuxIconView = (TuxIconView) viewLJLLJ.findViewById(R.id.jxe);
                        if (tuxIconView != null && (num = liveBagIconAnimationItem.itemRank) != null) {
                            if (num.intValue() == 110) {
                                c419910GdJ = new C419910GdJ();
                                c419910GdJ.LIZ = R.raw.icon_bolt_fill;
                                c419910GdJ.LJ = Integer.valueOf(R.attr.ww);
                            } else if (num != null) {
                                if (num.intValue() != 115 && num.intValue() != 117) {
                                    if (num.intValue() == 120) {
                                        c419910GdJ = new C419910GdJ();
                                        c419910GdJ.LIZ = R.raw.icon_fire_3_fill;
                                        c419910GdJ.LJ = Integer.valueOf(R.attr.a1r);
                                    } else if (num.intValue() == 125) {
                                        c419910GdJ = new C419910GdJ();
                                        c419910GdJ.LIZ = R.raw.icon_truck_moving_fill_ltr;
                                        c419910GdJ.LJ = Integer.valueOf(R.attr.a1t);
                                    }
                                } else {
                                    c419910GdJ = new C419910GdJ();
                                    c419910GdJ.LIZ = R.raw.icon_coupon_fill;
                                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1r);
                                }
                            }
                            tuxIconView.setTuxIcon(c419910GdJ);
                        }
                        this.LJFF = viewLJLLJ;
                        C1440005kM.LIZ(new C591940NJo(5, true));
                        awS610S0100000_31.invoke(this.LIZLLL);
                        this.LJI = true;
                        return;
                    }
                }
            }
        }
        LJII("before_show", "no_fit_width_promotion");
        LJFF();
    }

    public static ValueAnimator LJI(View view, float f, float f2, long j) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.47f, 0.0f, 0.0f, 1.0f));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS278S0100000_31(view, 0));
        return valueAnimatorOfFloat;
    }
}
