package X;

import Y.AUListenerS275S0100000_27;
import android.animation.ValueAnimator;
import android.graphics.drawable.Animatable;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bytedance.android.livesdk.game.playtogether.fragment.GameLivePlayTogetherPickedFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0ycx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864810ycx implements InterfaceC1142670fqD {
    public final int $t;
    public Object l0;

    public static final void LIZ$0(C1864810ycx c1864810ycx) {
    }

    public static final void LIZ$1(C1864810ycx c1864810ycx) {
    }

    public static final void LIZIZ$0(C1864810ycx c1864810ycx, Animatable animatable) {
    }

    public static final void LIZIZ$1(C1864810ycx c1864810ycx, Animatable animatable) {
    }

    public static final void LIZLLL$0(C1864810ycx c1864810ycx, String str, Exception exc) {
    }

    public static final void LIZLLL$1(C1864810ycx c1864810ycx, String str, Exception exc) {
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                break;
            case 1:
                LIZ$1(this);
                break;
        }
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZIZ(Animatable animatable) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, animatable);
                break;
            case 1:
                LIZIZ$1(this, animatable);
                break;
        }
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZJ(int i, int i2, String str) {
        switch (this.$t) {
            case 0:
                LIZJ$0(this, i, i2, str);
                break;
            case 1:
                LIZJ$1(this, i, i2, str);
                break;
        }
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZLLL(String str, Exception exc) {
        switch (this.$t) {
            case 0:
                LIZLLL$0(this, str, exc);
                break;
            case 1:
                LIZLLL$1(this, str, exc);
                break;
        }
    }

    public C1864810ycx(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZJ$0(C1864810ycx c1864810ycx, int i, int i2, String str) {
        ViewTreeObserver viewTreeObserver;
        GameLivePlayTogetherPickedFragment gameLivePlayTogetherPickedFragment = (GameLivePlayTogetherPickedFragment) c1864810ycx.l0;
        C0JBN c0jbn = gameLivePlayTogetherPickedFragment.LLILZ;
        if (c0jbn != null && c0jbn.LJJ(gameLivePlayTogetherPickedFragment.LLILLL)) {
            GameLivePlayTogetherPickedFragment gameLivePlayTogetherPickedFragment2 = (GameLivePlayTogetherPickedFragment) c1864810ycx.l0;
            gameLivePlayTogetherPickedFragment2.getClass();
            C086F c086f = C086F.LIZ;
            AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(gameLivePlayTogetherPickedFragment2, 1170);
            c086f.getClass();
            C086F.LJI(awS571S0100000_27);
            return;
        }
        ImageView imageView = ((GameLivePlayTogetherPickedFragment) c1864810ycx.l0).LLILLL;
        if (imageView == null || (viewTreeObserver = imageView.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1864770yct viewTreeObserverOnGlobalLayoutListenerC1864770yct = new ViewTreeObserverOnGlobalLayoutListenerC1864770yct((GameLivePlayTogetherPickedFragment) c1864810ycx.l0, 10);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1864770yct);
        C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1864770yct, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    public static final void LIZJ$1(C1864810ycx c1864810ycx, int i, int i2, String str) {
        InterfaceC1807440x8Q interfaceC1807440x8Q;
        List<IntRange> listLIZJ;
        InterfaceC1807440x8Q interfaceC1807440x8Q2;
        List<IntRange> listLIZJ2;
        InterfaceC1807440x8Q interfaceC1807440x8Q3;
        if (((C1807960x9G) c1864810ycx.l0).L5()) {
            C0GYV c0gyv = ((C1807960x9G) c1864810ycx.l0).LLILZIL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gyv);
            c0gyv.setAlpha(1.0f);
            C500260Jjc.LJIILIIL(((C1807960x9G) c1864810ycx.l0).LLILZ);
            return;
        }
        final C1807960x9G c1807960x9G = (C1807960x9G) c1864810ycx.l0;
        if (c1807960x9G.L5()) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(600L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS275S0100000_27(c1807960x9G, 102));
        valueAnimatorOfFloat.setStartDelay(1000L);
        valueAnimatorOfFloat.addListener(new C1807970x9H(c1807960x9G, EnumC1807980x9I.TEXT_SCALE_OUT));
        valueAnimatorOfFloat.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(500L);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS275S0100000_27(c1807960x9G, 101));
        valueAnimatorOfFloat2.setStartDelay(1100L);
        valueAnimatorOfFloat2.addListener(new C1807970x9H(c1807960x9G, EnumC1807980x9I.ICON_SCALE_IN));
        valueAnimatorOfFloat2.start();
        C1806040x6A c1806040x6A = c1807960x9G.LLIZLLLIL;
        if (c1806040x6A == null || (interfaceC1807440x8Q = c1806040x6A.LIZIZ) == null || (listLIZJ = interfaceC1807440x8Q.LIZJ()) == null) {
            return;
        }
        final CharSequence charSequenceLIZIZ = null;
        if (!(!listLIZJ.isEmpty())) {
            return;
        }
        C1806040x6A c1806040x6A2 = c1807960x9G.LLIZLLLIL;
        if (c1806040x6A2 != null && (interfaceC1807440x8Q3 = c1806040x6A2.LIZIZ) != null) {
            charSequenceLIZIZ = interfaceC1807440x8Q3.LIZIZ(c1807960x9G.LLILLL.getContext());
        }
        final ArrayList arrayList = new ArrayList();
        C1806040x6A c1806040x6A3 = c1807960x9G.LLIZLLLIL;
        if (c1806040x6A3 != null && (interfaceC1807440x8Q2 = c1806040x6A3.LIZIZ) != null && (listLIZJ2 = interfaceC1807440x8Q2.LIZJ()) != null) {
            for (IntRange intRange : listLIZJ2) {
                int iIntValue = intRange.getStart().intValue();
                int i3 = intRange.LLILLJJLI;
                if (iIntValue <= i3) {
                    while (true) {
                        arrayList.add(Integer.valueOf(iIntValue));
                        if (iIntValue != i3) {
                            iIntValue++;
                        }
                    }
                }
            }
        }
        C08XD.LJIL(arrayList);
        final ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-3355444);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, arrayList.size() - 1);
        valueAnimatorOfInt.setDuration(1200L);
        valueAnimatorOfInt.setStartDelay(1600L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0lR1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Spannable spannable;
                int iIntValue2 = ((Number) ListProtector.get(arrayList, ((Integer) valueAnimator.getAnimatedValue()).intValue())).intValue();
                CharSequence charSequence = charSequenceLIZIZ;
                if (charSequence instanceof Spannable) {
                    spannable = (Spannable) charSequence;
                    if (spannable != null) {
                        spannable.removeSpan(foregroundColorSpan);
                        C786410Ut5.o2(spannable, foregroundColorSpan, iIntValue2, iIntValue2 + 1, 33);
                    }
                } else {
                    spannable = null;
                }
                c1807960x9G.LLILLL.setText(spannable);
            }
        });
        valueAnimatorOfInt.addListener(new C1807970x9H(c1807960x9G, EnumC1807980x9I.TEXT_SHIMMER));
        valueAnimatorOfInt.start();
        c1807960x9G.LLIZ = valueAnimatorOfInt;
    }
}
