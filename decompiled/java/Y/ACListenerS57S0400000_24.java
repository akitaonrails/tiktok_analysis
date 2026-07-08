package Y;

import X.AbstractC1607170rvP;
import X.C013C;
import X.C0OBG;
import X.C1237320iIs;
import X.C1388190mED;
import X.C1602160rnK;
import X.C1606270rtx;
import X.C1606900ruy;
import X.C1619980sG4;
import X.C418440Gaw;
import X.C563770M9f;
import X.C728900SiW;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1608710rxt;
import X.InterfaceC1606880ruw;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.series.payment.fragment.SeriesPurchaseSummaryFragment;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes25.dex */
public class ACListenerS57S0400000_24 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS57S0400000_24 aCListenerS57S0400000_24, View view) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator viewPropertyAnimatorTranslationY;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator listener;
        int measuredHeight;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator viewPropertyAnimatorAlpha2;
        ViewPropertyAnimator viewPropertyAnimatorTranslationY2;
        ViewPropertyAnimator interpolator2;
        ViewPropertyAnimator listener2;
        ViewGroup.LayoutParams layoutParams;
        C013C c013c = (C013C) aCListenerS57S0400000_24.l0;
        boolean z = !c013c.element;
        c013c.element = z;
        if (z) {
            SeriesPurchaseSummaryFragment seriesPurchaseSummaryFragment = (SeriesPurchaseSummaryFragment) aCListenerS57S0400000_24.l1;
            seriesPurchaseSummaryFragment.WR();
            C1237320iIs c1237320iIs = seriesPurchaseSummaryFragment.LLJJJJ;
            if (c1237320iIs != null) {
                c1237320iIs.measure(-1, -2);
            }
            C1237320iIs c1237320iIs2 = seriesPurchaseSummaryFragment.LLJJJJ;
            if (c1237320iIs2 != null) {
                measuredHeight = c1237320iIs2.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            C1237320iIs c1237320iIs3 = seriesPurchaseSummaryFragment.LLJJJJ;
            if (c1237320iIs3 != null && (layoutParams = c1237320iIs3.getLayoutParams()) != null) {
                layoutParams.height = 0;
            }
            C1237320iIs c1237320iIs4 = seriesPurchaseSummaryFragment.LLJJJJ;
            if (c1237320iIs4 != null) {
                c1237320iIs4.requestLayout();
            }
            C1237320iIs c1237320iIs5 = seriesPurchaseSummaryFragment.LLJJJJ;
            if (c1237320iIs5 != null) {
                int visibility = c1237320iIs5.getVisibility();
                c1237320iIs5.setVisibility(4);
                C1602160rnK.LIZIZ(visibility, 4, c1237320iIs5);
            }
            C1237320iIs c1237320iIs6 = seriesPurchaseSummaryFragment.LLJJJJ;
            if (c1237320iIs6 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1237320iIs6);
                c1237320iIs6.setAlpha(0.0f);
            }
            C1237320iIs c1237320iIs7 = seriesPurchaseSummaryFragment.LLJJJJ;
            if (c1237320iIs7 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1237320iIs7);
                c1237320iIs7.setTranslationY(0.0f);
            }
            C1237320iIs c1237320iIs8 = seriesPurchaseSummaryFragment.LLJJJJ;
            if (c1237320iIs8 != null && (viewPropertyAnimatorAnimate2 = c1237320iIs8.animate()) != null && (duration2 = viewPropertyAnimatorAnimate2.setDuration(300L)) != null && (viewPropertyAnimatorAlpha2 = duration2.alpha(1.0f)) != null && (viewPropertyAnimatorTranslationY2 = viewPropertyAnimatorAlpha2.translationY(0.0f)) != null && (interpolator2 = viewPropertyAnimatorTranslationY2.setInterpolator(C1619980sG4.LIZLLL())) != null && (listener2 = interpolator2.setListener(new ALAdapterS3S0101000_24(seriesPurchaseSummaryFragment, measuredHeight, 2))) != null) {
                listener2.start();
            }
            TuxIconView tuxIconView = (TuxIconView) aCListenerS57S0400000_24.l2;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
            TuxIconView tuxIconView2 = (TuxIconView) aCListenerS57S0400000_24.l3;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                return;
            }
            return;
        }
        SeriesPurchaseSummaryFragment seriesPurchaseSummaryFragment2 = (SeriesPurchaseSummaryFragment) aCListenerS57S0400000_24.l1;
        seriesPurchaseSummaryFragment2.WR();
        C1237320iIs c1237320iIs9 = seriesPurchaseSummaryFragment2.LLJJJJ;
        if (c1237320iIs9 != null && (viewPropertyAnimatorAnimate = c1237320iIs9.animate()) != null && (duration = viewPropertyAnimatorAnimate.setDuration(150L)) != null && (viewPropertyAnimatorAlpha = duration.alpha(0.0f)) != null && (viewPropertyAnimatorTranslationY = viewPropertyAnimatorAlpha.translationY(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)))) != null && (interpolator = viewPropertyAnimatorTranslationY.setInterpolator(C1619980sG4.LIZLLL())) != null && (listener = interpolator.setListener(new ALAdapterS19S0100000_24(seriesPurchaseSummaryFragment2, 7))) != null) {
            listener.start();
        }
        TuxIconView tuxIconView3 = (TuxIconView) aCListenerS57S0400000_24.l2;
        if (tuxIconView3 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
        }
        TuxIconView tuxIconView4 = (TuxIconView) aCListenerS57S0400000_24.l3;
        if (tuxIconView4 == null) {
            return;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView4, 8);
    }

    public static final void onClick$1(ACListenerS57S0400000_24 aCListenerS57S0400000_24, View view) {
        C728900SiW c728900SiW;
        String str;
        Activity activityLIZ;
        C563770M9f c563770M9fLIZLLL;
        C563770M9f c563770M9fLIZLLL2;
        WeakReference<Activity> weakReference;
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        Function2<EnumC1608710rxt, InterfaceC1606880ruw, Unit> onNodeClickListener = ((AvatarComponentView) aCListenerS57S0400000_24.l0).getClickListener().getOnNodeClickListener();
        if (onNodeClickListener != null) {
            onNodeClickListener.invoke(EnumC1608710rxt.BADGE, (AbstractC1607170rvP) aCListenerS57S0400000_24.l1);
        }
        C1606270rtx c1606270rtx = ((C1606900ruy) aCListenerS57S0400000_24.l2).LIZLLL;
        if (c1606270rtx != null && (c728900SiW = c1606270rtx.LIZLLL) != null) {
            String str2 = c728900SiW.LIZ;
            String str3 = "unknown";
            if (str2 == null) {
                str = "unknown";
            } else {
                str = str2;
            }
            if (str2 == null) {
                str2 = "unknown";
            }
            String str4 = c728900SiW.LIZ;
            if (str4 != null) {
                str3 = str4;
            }
            EnterStoryParam enterStoryParam = new EnterStoryParam(null, "click_view_lists_panel_profile_plus", str, null, null, str2, "click_view_lists_panel_profile_plus", null, new ShootExtraData(str3, null, null, null, "click_view_lists_panel_profile_plus", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777198, null), false, false, false, 0, 0.0f, 0, null, null, null, null, null, null, false, null, false, null, null, 67108505, null);
            C1606900ruy c1606900ruy = (C1606900ruy) aCListenerS57S0400000_24.l2;
            Context context = (Context) aCListenerS57S0400000_24.l3;
            C1606270rtx c1606270rtx2 = c1606900ruy.LIZLLL;
            if ((c1606270rtx2 == null || (weakReference = c1606270rtx2.LJ) == null || (activityLIZ = weakReference.get()) == null) && (activityLIZ = C1388190mED.LIZ(context)) == null) {
                SocMediaPickerService socMediaPickerService = (SocMediaPickerService) PluggableExtentionKt.pluggableSpi$default(SocMediaPickerService.class, false, false, false, 14, null);
                if (socMediaPickerService != null && (c563770M9fLIZLLL = socMediaPickerService.LIZLLL()) != null) {
                    c563770M9fLIZLLL.openStoryRecordingPageDirectly(context, enterStoryParam, null);
                    return;
                }
                return;
            }
            SocMediaPickerService socMediaPickerService2 = (SocMediaPickerService) PluggableExtentionKt.pluggableSpi$default(SocMediaPickerService.class, false, false, false, 14, null);
            if (socMediaPickerService2 == null || (c563770M9fLIZLLL2 = socMediaPickerService2.LIZLLL()) == null) {
                return;
            }
            c563770M9fLIZLLL2.startStoryPublish(activityLIZ, enterStoryParam, c563770M9fLIZLLL2.chooseBPEAToken("bpea-story_head_plus_request_read_storage_permission_target34", "bpea-story_head_plus_request_read_storage_permission_target33", "bpea-story_head_plus_request_read_storage_permission"));
        }
    }

    public ACListenerS57S0400000_24(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
