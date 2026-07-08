package X;

import Y.AAListenerS278S0200000_32;
import Y.ACListenerS166S0100000_32;
import Y.ARunnableS132S0100000_32;
import Y.AUListenerS216S0200000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.touchpoint.api.model.FeedToast;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.189j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212381189j extends FrameLayout {
    public final FeedToast LL;
    public final Pair<Integer, Integer> LLILLJJLI;
    public final int[] LLILLL;
    public final InterfaceC212382189k LLILZ;
    public TuxIconView LLILZIL;
    public ConstraintLayout LLILZLL;
    public RemoteImageView LLIZ;
    public FrameLayout LLIZLLLIL;
    public FrameLayout LLJ;
    public TuxTextView LLJI;
    public TuxIconView LLJIJIL;
    public final C01GW LLJILJIL;
    public final int[] LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public boolean LLJJIJI;

    private final ViewGroup getParentView() {
        return (ViewGroup) this.LLJILJIL.getValue();
    }

    public final void LIZ() {
        FrameLayout flToastContainerFromXml = this.LLJJIJI ? getFlToastContainerFromXml() : getFlToastBgFromXml();
        AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 509);
        LIZJ(AFwS223S0000000_32.get$arr$(161));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS216S0200000_6(valueAnimatorOfFloat, flToastContainerFromXml, 9));
        valueAnimatorOfFloat.addListener(new AAListenerS278S0200000_32(this, awS576S0100000_32, 1));
        valueAnimatorOfFloat.start();
    }

    public final ConstraintLayout getClShareContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dys);
            this.LLILZLL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final float getExpectScaleX() {
        return ((Number) this.LLJJI.getValue()).floatValue();
    }

    public final float getExpectScaleY() {
        return ((Number) this.LLJJIII.getValue()).floatValue();
    }

    public final FrameLayout getFlToastBgFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iau);
            this.LLJ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final FrameLayout getFlToastContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iav);
            this.LLIZLLLIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final RemoteImageView getRivShareIvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tn9);
            this.LLIZ = (RemoteImageView) callbackFindViewById;
        }
        return (RemoteImageView) callbackFindViewById;
    }

    public final TuxIconView getTivCloseFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y40);
            this.LLILZIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getTivPlusShareIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y45);
            this.LLJIJIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final int getTransX() {
        return ((Number) this.LLJILLL.getValue()).intValue();
    }

    public final int getTransY() {
        return ((Number) this.LLJJ.getValue()).intValue();
    }

    public final TuxTextView getTtvContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.yxs);
            this.LLJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void LIZIZ() {
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        ViewGroup parentView = getParentView();
        if (parentView != null) {
            C786410Ut5.LJJJLZIJ(this, parentView);
        }
        InterfaceC212382189k interfaceC212382189k = this.LLILZ;
        if (interfaceC212382189k != null) {
            interfaceC212382189k.LIZ(this.LLJJIJI);
        }
    }

    public final void LIZLLL() {
        if (getParentView() == null) {
            return;
        }
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        ViewGroup parentView = getParentView();
        if (parentView != null) {
            parentView.addView(this);
        }
        HandlerHook.viewPost(getClShareContainerFromXml(), new ARunnableS132S0100000_32(this, 60));
    }

    public static void LIZJ(Function0 function0) {
        function0.invoke();
    }

    public final void setClShareContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLILZLL = constraintLayout;
    }

    public final void setFlToastBgFromXml(FrameLayout frameLayout) {
        this.LLJ = frameLayout;
    }

    public final void setFlToastContainerFromXml(FrameLayout frameLayout) {
        this.LLIZLLLIL = frameLayout;
    }

    public final void setRivShareIvFromXml(RemoteImageView remoteImageView) {
        this.LLIZ = remoteImageView;
    }

    public final void setTivCloseFromXml(TuxIconView tuxIconView) {
        this.LLILZIL = tuxIconView;
    }

    public final void setTivPlusShareIconFromXml(TuxIconView tuxIconView) {
        this.LLJIJIL = tuxIconView;
    }

    public final void setTtvContentFromXml(TuxTextView tuxTextView) {
        this.LLJI = tuxTextView;
    }

    public C212381189j(Context context, FeedToast feedToast, Pair pair, int[] iArr, Drawable drawable, C212384189m c212384189m) {
        super(context, null, 0);
        this.LL = feedToast;
        this.LLILLJJLI = pair;
        this.LLILLL = iArr;
        this.LLILZ = c212384189m;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS548S0100000_4(context, 442));
        this.LLJILJILJ = new int[2];
        this.LLJILLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 512));
        this.LLJJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 513));
        this.LLJJI = C452501pT.LIZIZ(new AwS547S0100000_3(this, 100));
        this.LLJJIII = C452501pT.LIZIZ(new AwS547S0100000_3(this, 101));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ba4, this, true);
        C786410Ut5.a9(getTivCloseFromXml(), new ACListenerS166S0100000_32(this, 73));
        String str = feedToast.backgroundColor;
        if (str != null) {
            FrameLayout flToastBgFromXml = getFlToastBgFromXml();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(getContext().getResources().getDimension(R.dimen.az));
            c384050F3z.LIZ = Integer.valueOf(ColorProtector.parseColor(str));
            flToastBgFromXml.setBackground(c384050F3z.LIZ(getContext()));
        }
        getTtvContentFromXml().setText(feedToast.title.text);
        String str2 = feedToast.title.color;
        if (C123100dR.LIZ(str2) && str2 != null) {
            getTtvContentFromXml().setTextColor(ColorProtector.parseColor(str2));
        }
        getTivPlusShareIconFromXml().setImageDrawable(C621180OYa.LIZIZ.LJJJ(getContext()));
        ViewGroup.LayoutParams layoutParams = getRivShareIvFromXml().getLayoutParams();
        layoutParams.height = ((Number) pair.getFirst()).intValue();
        layoutParams.width = ((Number) pair.getSecond()).intValue();
        C786410Ut5.f7(getRivShareIvFromXml(), layoutParams);
        getRivShareIvFromXml().setImageDrawable(drawable);
    }
}
