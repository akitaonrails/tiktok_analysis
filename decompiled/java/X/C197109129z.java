package X;

import Y.AObjectS247S0100000_29;
import Y.AObserverS231S0100000_29;
import Y.ATListenerS461S0100000_29;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.129z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197109129z extends C1617920sCk implements InterfaceC585770MyF {
    public EffectRecommendationCarouselViewModel LLLLIILL;
    public float LLLLIILLL;
    public float LLLLIL;
    public float LLLLILI;
    public float LLLLJ;
    public float LLLLJI;
    public C21526919Ml LLLLL;

    @Override // X.InterfaceC585770MyF
    public final void LJLLLL() {
        EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel = this.LLLLIILL;
        if (effectRecommendationCarouselViewModel != null) {
            effectRecommendationCarouselViewModel.vQ2(C12AD.LIZ);
        }
    }

    private final int getScreenHeightDp() {
        return (int) C0HCL.LIZIZ(getResources().getDisplayMetrics().heightPixels, getContext());
    }

    public final boolean I0() {
        return getScreenHeightDp() >= 800;
    }

    public final boolean L0() {
        return getScreenHeightDp() <= 640;
    }

    @Override // X.InterfaceC585770MyF
    public final void LLLLIIIILLL(C19EG c19eg) {
        EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel = this.LLLLIILL;
        if (effectRecommendationCarouselViewModel != null) {
            effectRecommendationCarouselViewModel.vQ2(new C12A1(c19eg));
        }
    }

    @Override // X.InterfaceC585770MyF
    public final void a(C19EG c19eg) {
        EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel = this.LLLLIILL;
        if (effectRecommendationCarouselViewModel != null) {
            effectRecommendationCarouselViewModel.vQ2(new C197108129y(getContext(), c19eg));
        }
    }

    public static boolean F0(MotionEvent motionEvent, CardView cardView) {
        Rect rect = new Rect();
        cardView.getGlobalVisibleRect(rect);
        return rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
    }

    @Override // X.InterfaceC585770MyF
    public final void Y(Fragment fragment, Aweme aweme) {
        C560530Lyd c560530Lyd;
        MutableLiveData mutableLiveData;
        EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel = (EffectRecommendationCarouselViewModel) ViewModelProviders.of(fragment).get(EffectRecommendationCarouselViewModel.class);
        effectRecommendationCarouselViewModel.vQ2(new C12A2(aweme));
        this.LLLLIILL = effectRecommendationCarouselViewModel;
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel2 = this.LLLLIILL;
        if (effectRecommendationCarouselViewModel2 != null && (mutableLiveData = effectRecommendationCarouselViewModel2.LLILZLL) != null) {
            mutableLiveData.observe(viewLifecycleOwner, new AObserverS231S0100000_29(this, 190));
        }
        EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel3 = this.LLLLIILL;
        if (effectRecommendationCarouselViewModel3 != null && (c560530Lyd = effectRecommendationCarouselViewModel3.LLIZLLLIL) != null) {
            c560530Lyd.LIZ(viewLifecycleOwner, new AObjectS247S0100000_29(this, 45));
        }
        C21526919Ml c21526919Ml = (C21526919Ml) findViewById(R.id.ere);
        c21526919Ml.setInteractionEnabled(false);
        this.LLLLL = c21526919Ml;
        findViewById(R.id.dgu).setOnTouchListener(new ATListenerS461S0100000_29(this, 5));
        C21526919Ml c21526919Ml2 = this.LLLLL;
        if (c21526919Ml2 != null) {
            c21526919Ml2.setTransitionListener(new InterfaceC21527419Mq() { // from class: X.12A0
                @Override // X.InterfaceC21527419Mq
                public final void LIZ() {
                }

                @Override // X.InterfaceC21527419Mq
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC21527419Mq
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC21527419Mq
                public final void LIZJ(int i) {
                    C21526919Ml c21526919Ml3 = this.LL.LLLLL;
                    int i2 = 0;
                    if (c21526919Ml3 != null) {
                        c21526919Ml3.setInteractionEnabled(false);
                    }
                    if (i != R.id.vzw) {
                        if (i == R.id.w01) {
                            i2 = 1;
                        } else if (i == R.id.vzz) {
                            i2 = 2;
                        }
                    }
                    EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel4 = this.LL.LLLLIILL;
                    if (effectRecommendationCarouselViewModel4 != null) {
                        effectRecommendationCarouselViewModel4.vQ2(new C12A5(Integer.valueOf(i2)));
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC585770MyF
    public final void j(C19EG c19eg, Aweme aweme) {
        EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel = this.LLLLIILL;
        if (effectRecommendationCarouselViewModel != null) {
            effectRecommendationCarouselViewModel.vQ2(new C197107129x(getContext(), c19eg));
        }
    }

    public C197109129z(final Context context, final AttributeSet attributeSet, final int i) {
        new C21526919Ml(context, attributeSet, i) { // from class: X.0sCk
            @Override // android.view.ViewGroup, android.view.View
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                C1616450sAN.LIZ(motionEvent, this);
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        C786410Ut5.Sd(R.layout.eku, C786410Ut5.ne(context), this);
    }
}
