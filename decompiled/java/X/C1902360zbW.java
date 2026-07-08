package X;

import Y.ACListenerS162S0100000_28;
import Y.ALAdapterS22S0200000_28;
import Y.ALAdapterS23S0100000_28;
import Y.AObserverS230S0100000_28;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.notification.adapter.FilterViewModel;
import com.ss.android.ugc.aweme.notification.adapter.GroupFilterViewHolder;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zbW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1902360zbW extends C214906198m implements InterfaceC487330J9f {
    public final Context LL;
    public final InterfaceC1902350zbV LLILLJJLI;
    public final Fragment LLILLL;
    public ViewOnAttachStateChangeListenerC20604515jv LLILZ;
    public View LLILZIL;
    public final FilterViewModel LLILZLL;
    public Function0<Unit> LLIZ;
    public Function0<Unit> LLIZLLLIL;

    public final int LJJIIJZLJL() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILZ;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        float height = viewOnAttachStateChangeListenerC20604515jv.getHeight() / C1389340mG4.LIZJ(null, null).LIZJ;
        if (height < 0.33333334f) {
            return 200;
        }
        if (height < 0.6666667f) {
            return 250;
        }
        return DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
    }

    public final int LJJIIZ() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILZ;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        float height = viewOnAttachStateChangeListenerC20604515jv.getHeight() / C1389340mG4.LIZJ(null, null).LIZJ;
        if (height < 0.33333334f) {
            return 250;
        }
        if (height < 0.6666667f) {
            return DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        }
        return 350;
    }

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void dismiss() {
        AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(this, 1072);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILZ;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = viewOnAttachStateChangeListenerC20604515jv == null ? null : viewOnAttachStateChangeListenerC20604515jv;
        Property property = View.TRANSLATION_Y;
        float[] fArr = new float[2];
        fArr[0] = 0.0f;
        float f = 0;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        fArr[1] = f - viewOnAttachStateChangeListenerC20604515jv.getHeight();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewOnAttachStateChangeListenerC20604515jv2, (Property<ViewOnAttachStateChangeListenerC20604515jv, Float>) property, fArr);
        View view = this.LLILZIL;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view != null ? view : null, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        long jLJJIIJZLJL = LJJIIJZLJL();
        objectAnimatorOfFloat.setDuration(jLJJIIJZLJL);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
        objectAnimatorOfFloat2.setDuration(jLJJIIJZLJL);
        objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LIZLLL());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.addListener(new ALAdapterS22S0200000_28(this, awS572S0100000_28, 4));
        animatorSet.start();
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        super.showAsDropDown(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLILZ;
        View view2 = null;
        if (viewOnAttachStateChangeListenerC20604515jv2 == null) {
            viewOnAttachStateChangeListenerC20604515jv = null;
        } else {
            viewOnAttachStateChangeListenerC20604515jv = viewOnAttachStateChangeListenerC20604515jv2;
        }
        Property property = View.TRANSLATION_Y;
        float[] fArr = new float[2];
        float f = 0;
        if (viewOnAttachStateChangeListenerC20604515jv2 == null) {
            viewOnAttachStateChangeListenerC20604515jv2 = null;
        }
        fArr[0] = f - viewOnAttachStateChangeListenerC20604515jv2.getHeight();
        fArr[1] = 0.0f;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewOnAttachStateChangeListenerC20604515jv, (Property<ViewOnAttachStateChangeListenerC20604515jv, Float>) property, fArr);
        View view3 = this.LLILZIL;
        if (view3 != null) {
            view2 = view3;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        long jLJJIIZ = LJJIIZ();
        objectAnimatorOfFloat.setDuration(jLJJIIZ);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIL());
        objectAnimatorOfFloat2.setDuration(jLJJIIZ);
        objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJIIL());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.addListener(new ALAdapterS23S0100000_28(this, 18));
        animatorSet.start();
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        ViewTreeObserver viewTreeObserver;
        View view = this.LLILLL.getView();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC19333710kR viewTreeObserverOnGlobalLayoutListenerC19333710kR = new ViewTreeObserverOnGlobalLayoutListenerC19333710kR(this, 1);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC19333710kR);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC19333710kR, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    public C1902360zbW(Context context, InterfaceC1902350zbV interfaceC1902350zbV, BaseFragment baseFragment) {
        int width;
        super(context);
        this.LL = context;
        this.LLILLJJLI = interfaceC1902350zbV;
        this.LLILLL = baseFragment;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.abn, null, false);
        setContentView(viewTd);
        this.LLILZ = (ViewOnAttachStateChangeListenerC20604515jv) viewTd.findViewById(R.id.hya);
        this.LLILZIL = viewTd.findViewById(R.id.c30);
        View view = baseFragment.getView();
        if (view != null) {
            width = view.getWidth();
        } else {
            width = C1389340mG4.LIZJ(context, null).LIZIZ;
        }
        setWidth(width);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(C446980Hfs.LIZ(context, R.color.dr)));
        setFocusable(true);
        setAnimationStyle(0);
        View view2 = this.LLILZIL;
        C786410Ut5.I7(new ACListenerS162S0100000_28(this, 194), view2 == null ? null : view2);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILZ;
        (viewOnAttachStateChangeListenerC20604515jv == null ? null : viewOnAttachStateChangeListenerC20604515jv).setLifecycleOwner(baseFragment);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLILZ;
        (viewOnAttachStateChangeListenerC20604515jv2 != null ? viewOnAttachStateChangeListenerC20604515jv2 : null).LJIILJJIL(GroupFilterViewHolder.class);
        FilterViewModel filterViewModel = (FilterViewModel) ViewModelProviders.of(baseFragment).get(FilterViewModel.class);
        this.LLILZLL = filterViewModel;
        ((LiveData) filterViewModel.LLILLJJLI.getValue()).observe(this.LLILLL, new AObserverS230S0100000_28(this, 112));
        C487280J9a.LIZ(context.hashCode(), this);
    }
}
