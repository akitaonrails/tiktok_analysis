package X;

import Y.ARunnableS113S0100000_13;
import Y.AfS5S0100200_15;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import avg.f;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS559S0100000_15;
import mf.a;

/* JADX INFO: renamed from: X.0bjx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C985030bjx extends FrameLayout {
    public final C418350Gan LL;
    public final View LLILLJJLI;
    public final C418350Gan LLILLL;
    public final ImageView LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public final C985050bjz LLIZ;
    public AbstractC985060bk0 LLIZLLLIL;
    public View.OnClickListener LLJ;

    public final void LIZIZ() {
        this.LLIZ.LIZ();
    }

    public final long getRematchBtnShowDuration() {
        return this.LLILZIL;
    }

    public final void LIZ(long j) {
        animate().cancel();
        C786410Ut5.LLJL(this, 0);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setScaleX(0.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setScaleY(0.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(0.0f);
        ImageView imageView = this.LLILZ;
        ImageView imageView2 = null;
        if (imageView == null) {
            imageView = null;
        }
        imageView.animate().cancel();
        ImageView imageView3 = this.LLILZ;
        if (imageView3 == null) {
            imageView3 = null;
        }
        C786410Ut5.LJZI(4, imageView3);
        ImageView imageView4 = this.LLILZ;
        if (imageView4 == null) {
            imageView4 = null;
        }
        C786410Ut5.Lc(imageView4, 0.0f);
        this.LLIZ.LIZ();
        animate().setDuration(200L).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setInterpolator(new C1125420fOO()).start();
        AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(this, 140);
        ImageView imageView5 = this.LLILZ;
        if (imageView5 != null) {
            imageView2 = imageView5;
        }
        HandlerHook.viewPostDelay(imageView2, new ARunnableS113S0100000_13(awS559S0100000_15, 45), 500L);
        this.LLILZIL = j;
        C985050bjz c985050bjz = this.LLIZ;
        c985050bjz.getClass();
        long j2 = (j - 0) + 1;
        if (j2 > 0) {
            c985050bjz.LIZ = (C11JF) C19490011Na.LIZ(0L, 1L, TimeUnit.SECONDS).LJLIIL(j2).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS5S0100200_15(c985050bjz, j, 0), new C09JN() { // from class: X.00j2
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("CountDownTicker@dd82.startCountDown$2");
                    C20441214yg.LIZLLL(((Throwable) obj).toString());
                    C1C7U.LIZIZ("CountDownTicker@dd82.startCountDown$2");
                }
            });
        }
    }

    public final void setButtonText(String str) {
        C418350Gan c418350Gan = this.LL;
        if (c418350Gan == null) {
            c418350Gan = null;
        }
        c418350Gan.setText(str);
    }

    public final void setCountDownListener(AbstractC985060bk0 abstractC985060bk0) {
        this.LLIZLLLIL = abstractC985060bk0;
    }

    public final void setMaxWidth(int i) {
        this.LLILZLL = i;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        C418350Gan c418350Gan = this.LL;
        if (c418350Gan == null) {
            c418350Gan = null;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c418350Gan);
        c418350Gan.setLayoutParams(layoutParams);
    }

    public final void setOnRematchClickListener(View.OnClickListener onClickListener) {
        this.LLJ = onClickListener;
    }

    public C985030bjx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C985050bjz c985050bjz = new C985050bjz();
        this.LLIZ = c985050bjz;
        AbstractC985060bk0 abstractC985060bk0 = new AbstractC985060bk0() { // from class: X.0bjy
            @Override // X.AbstractC985060bk0
            public final void LIZ(long j) {
                AbstractC985060bk0 abstractC985060bk02 = this.LIZ.LLIZLLLIL;
                if (abstractC985060bk02 != null) {
                    abstractC985060bk02.LIZ(j);
                }
            }

            @Override // X.AbstractC985060bk0
            public final void LIZIZ(long j) {
                AbstractC985060bk0 abstractC985060bk02 = this.LIZ.LLIZLLLIL;
                if (abstractC985060bk02 != null) {
                    abstractC985060bk02.LIZIZ(j);
                }
            }

            @Override // X.AbstractC985060bk0
            public final void LIZJ(long j) {
                C418350Gan c418350Gan = this.LIZ.LLILLL;
                if (c418350Gan == null) {
                    c418350Gan = null;
                }
                c418350Gan.setText(C786410Ut5.j4(C497740JfY.LJIILJJIL().getString(2131852014), Arrays.copyOf(new Object[]{String.valueOf(j)}, 1)));
                AbstractC985060bk0 abstractC985060bk02 = this.LIZ.LLIZLLLIL;
                if (abstractC985060bk02 != null) {
                    abstractC985060bk02.LIZJ(j);
                }
            }
        };
        View.OnClickListener onClickListener = new AbstractViewOnClickListenerC951940asa() { // from class: X.0bTg
            {
                super(0);
            }

            @Override // X.AbstractViewOnClickListenerC951940asa
            public final void LIZ(View view) {
                View.OnClickListener onClickListener2 = this.LLILZIL.LLJ;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                }
            }
        };
        C786410Ut5.Sd(R.layout.hgi, C786410Ut5.ne(context), this);
        this.LL = (C418350Gan) findViewById(R.id.cnp);
        this.LLILLJJLI = findViewById(R.id.cnj);
        this.LLILLL = (C418350Gan) findViewById(R.id.cni);
        this.LLILZ = (ImageView) findViewById(R.id.cno);
        c985050bjz.LIZIZ = abstractC985060bk0;
        a aVar = new a(C1848410yCV.LIZ ? new f(onClickListener) : onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        setBackgroundResource(R.drawable.e2w);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if ((mode != Integer.MIN_VALUE && mode != 0) || 1 > (i3 = this.LLILZLL) || i3 >= size) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i2);
        }
    }
}
