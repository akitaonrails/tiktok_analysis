package X;

import Y.ALAdapterS1S0300000_6;
import Y.ARunnableS106S0100000_6;
import Y.AUListenerS256S0100000_6;
import Y.AUListenerS66S0101000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0HqL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C453470HqL extends LinearLayout implements InterfaceC1632106aF, GenericLifecycleObserver {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final InterfaceC1632106aF LL;
    public boolean LLILLJJLI;
    public final C01GW LLILLL;
    public boolean LLILZ;
    public String LLILZIL;
    public InterfaceC453460HqK LLILZLL;
    public InterfaceC453160Hpq LLIZ;
    public final C01GW LLIZLLLIL;
    public AnonymousClass0956 LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public ValueAnimator LLJILJIL;
    public final float LLJILJILJ;
    public Integer LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public final ARunnableS106S0100000_6 LLJJIJIIJIL;
    public volatile InterfaceC452460Hoi LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C453470HqL.class, "typingRecommendStickerAnalytics", "getTypingRecommendStickerAnalytics()Lcom/ss/android/ugc/aweme/analytics/ITypingRecommendStickerAnalytics;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public C453470HqL(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    @Override // X.InterfaceC1632106aF
    public final void LJIILIIL() {
        this.LL.LJIILIIL();
    }

    @Override // X.C06OA
    public final void LLLZIL(C06MF c06mf) {
        this.LL.LLLZIL(c06mf);
    }

    @Override // X.C06OA
    public final void LLZLI() {
        this.LL.LLZLI();
    }

    public final InterfaceC452460Hoi getTypingRecommendStickerAnalytics() {
        InterfaceC452460Hoi interfaceC452460Hoi = this.LLJJIJIL;
        if (interfaceC452460Hoi == null) {
            synchronized (this) {
                interfaceC452460Hoi = this.LLJJIJIL;
                if (interfaceC452460Hoi == null) {
                    InterfaceC452460Hoi interfaceC452460Hoi2 = (InterfaceC452460Hoi) C1807670x8n.LLLLLLL();
                    this.LLJJIJIL = interfaceC452460Hoi2;
                    return interfaceC452460Hoi2;
                }
            }
        }
        return interfaceC452460Hoi;
    }

    @Override // X.C06OA
    public final void l(C06MF c06mf) {
        this.LL.l(c06mf);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    private final long getAnimationDuration() {
        return ((Number) this.LLIZLLLIL.getValue()).longValue();
    }

    public final RecyclerView getRecyclerView() {
        return (RecyclerView) this.LLILLL.getValue();
    }

    public final void LIZIZ() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = -2;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        HandlerHook.viewRemoveCallbacks(this, this.LLJJIJIIJIL);
    }

    public final boolean getAlphaOnlyDismiss() {
        return this.LLJJI;
    }

    public final boolean getAnimationDisabled() {
        return this.LLJJ;
    }

    public final boolean getDeferAnimationPlayback() {
        return this.LLJJIII;
    }

    public final boolean getHasScrolled() {
        return this.LLJIJIL;
    }

    public final Integer getStickerItemSize() {
        return this.LLJILLL;
    }

    public final void LIZ(Function0<Unit> function0) {
        int iIntValue;
        if (this.LLILZ) {
            return;
        }
        HandlerHook.viewRemoveCallbacks(this, this.LLJJIJIIJIL);
        this.LLJJIJI = true;
        if (this.LLJJ) {
            function0.invoke();
            return;
        }
        this.LLILZ = true;
        AnonymousClass0956 anonymousClass0956 = this.LLJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        ValueAnimator valueAnimator = this.LLJILJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.LLJJI) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            C013C c013c = new C013C();
            valueAnimatorOfFloat.setDuration(150L);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 164));
            valueAnimatorOfFloat.addListener(new ALAdapterS1S0300000_6(c013c, this, function0, 14));
            valueAnimatorOfFloat.start();
            this.LLJILJIL = valueAnimatorOfFloat;
            return;
        }
        Integer numValueOf = Integer.valueOf(getHeight());
        if (numValueOf.intValue() > 0) {
            iIntValue = numValueOf.intValue();
        } else {
            Integer numValueOf2 = Integer.valueOf(getMeasuredHeight());
            if (numValueOf2.intValue() > 0) {
                iIntValue = numValueOf2.intValue();
            } else {
                function0.invoke();
                this.LLILZ = false;
                C786410Ut5.LJLLLLLL(8, this);
                return;
            }
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        C013C c013c2 = new C013C();
        valueAnimatorOfFloat2.setDuration(getAnimationDuration());
        valueAnimatorOfFloat2.setInterpolator(C1619980sG4.LJIILIIL());
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS66S0101000_6(this, iIntValue, 0));
        valueAnimatorOfFloat2.addListener(new ALAdapterS1S0300000_6(c013c2, this, function0, 4));
        valueAnimatorOfFloat2.start();
        this.LLJILJIL = valueAnimatorOfFloat2;
    }

    public final void setAlphaOnlyDismiss(boolean z) {
        this.LLJJI = z;
    }

    public final void setAnimationDisabled(boolean z) {
        this.LLJJ = z;
    }

    public final void setDeferAnimationPlayback(boolean z) {
        this.LLJJIII = z;
    }

    public final void setHasScrolled(boolean z) {
        this.LLJIJIL = z;
    }

    public final void setStickerItemSize(Integer num) {
        this.LLJILLL = num;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C453470HqL(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        C1631706aB c1631706aB = (i & 8) != 0 ? new C1631706aB() : null;
        super(context, attributeSet, 0);
        this.LL = c1631706aB;
        this.LLILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1532));
        this.LLILZIL = "";
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(570));
        this.LLJILJILJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = new ARunnableS106S0100000_6((Object) this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0234  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.util.List<com.ss.android.ugc.aweme.im.common.model.StickerItem> r17, java.lang.String r18, X.InterfaceC453460HqK r19, X.InterfaceC453160Hpq r20) {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C453470HqL.LIZJ(java.util.List, java.lang.String, X.0HqK, X.0Hpq):void");
    }
}
