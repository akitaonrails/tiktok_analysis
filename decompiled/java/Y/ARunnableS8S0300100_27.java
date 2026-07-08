package Y;

import X.C1602160rnK;
import X.C1819070xRB;
import X.C1834580xqC;
import X.C1846010y8d;
import X.C1C7U;
import X.C20553115bd;
import X.C259800zU;
import X.C360660ECa;
import X.C385340F8y;
import X.C786410Ut5;
import X.EnumC1802220x00;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS25S0100100_27;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.replay.proto.TextStickerConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.explore.assem.ExploreViewPagerComponent;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public class ARunnableS8S0300100_27 implements Runnable {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$0() {
        if (((FrameLayout) this.l0).getWidth() <= 0 || ((FrameLayout) this.l0).getHeight() <= 0 || ((View) ((C259800zU) this.l1).element).getWidth() <= 0 || ((View) ((C259800zU) this.l1).element).getHeight() <= 0) {
            return;
        }
        View view = (View) ((C259800zU) this.l1).element;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
        view.setX((((FrameLayout) this.l0).getWidth() - ((View) ((C259800zU) this.l1).element).getWidth()) / 2.0f);
        View view2 = (View) ((C259800zU) this.l1).element;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view2);
        view2.setY((((FrameLayout) this.l0).getHeight() - ((View) ((C259800zU) this.l1).element).getHeight()) / 2.0f);
        if (((LiveHighLightPageFragment) this.l2).LLLLIL.containsKey(Long.valueOf(this.j3))) {
            return;
        }
        ((LiveHighLightPageFragment) this.l2).ZS(this.j3, (C385340F8y) ((C259800zU) this.l1).element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$1() {
        PointF pointF = (PointF) ((LinkedHashMap) ((LiveHighLightPageFragment) this.l0).LLLLIL).get(Long.valueOf(this.j3));
        if (pointF != null) {
            View view = (View) ((C259800zU) this.l1).element;
            float f = pointF.x;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
            view.setX(f);
            View view2 = (View) ((C259800zU) this.l1).element;
            float f2 = pointF.y;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view2);
            view2.setY(f2);
            return;
        }
        if (((FrameLayout) this.l2).getWidth() <= 0 || ((FrameLayout) this.l2).getHeight() <= 0 || ((View) ((C259800zU) this.l1).element).getWidth() <= 0 || ((View) ((C259800zU) this.l1).element).getHeight() <= 0) {
            return;
        }
        View view3 = (View) ((C259800zU) this.l1).element;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view3);
        view3.setX((((FrameLayout) this.l2).getWidth() - ((View) ((C259800zU) this.l1).element).getWidth()) / 2.0f);
        View view4 = (View) ((C259800zU) this.l1).element;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view4);
        view4.setY((((FrameLayout) this.l2).getHeight() - ((View) ((C259800zU) this.l1).element).getHeight()) / 2.0f);
        ((LiveHighLightPageFragment) this.l0).ZS(this.j3, (C385340F8y) ((C259800zU) this.l1).element);
    }

    public final void LIZ$2() {
        if (!((C1819070xRB) this.l0).isAttachedToWindow() || ((C1819070xRB) this.l0).getWidth() <= 0) {
            C1819070xRB c1819070xRB = (C1819070xRB) this.l0;
            Function0 function0 = (Function0) this.l1;
            c1819070xRB.LLILZIL = null;
            c1819070xRB.LLILZ = EnumC1802220x00.LL;
            C786410Ut5.Z1(c1819070xRB.LLJILJIL, 8);
            int visibility = c1819070xRB.getVisibility();
            c1819070xRB.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c1819070xRB);
            c1819070xRB.LIZ();
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        ((C1819070xRB) this.l0).LJIIJJI();
        C1819070xRB c1819070xRB2 = (C1819070xRB) this.l0;
        c1819070xRB2.LLILZIL = c1819070xRB2.LIZLLL();
        C1819070xRB c1819070xRB3 = (C1819070xRB) this.l0;
        c1819070xRB3.LLILZ = EnumC1802220x00.LLILLJJLI;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(c1819070xRB3.LLILLL, 1.0f);
        long j = this.j3;
        C1819070xRB c1819070xRB4 = (C1819070xRB) this.l0;
        Function0 function02 = (Function0) this.l2;
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS275S0100000_27(c1819070xRB4, 9));
        valueAnimatorOfFloat.addListener(new ALAdapterS21S0200000_27(c1819070xRB4, function02, 1));
        c1819070xRB3.LLIZ = valueAnimatorOfFloat;
        ((C1819070xRB) this.l0).LIZ();
        ValueAnimator valueAnimator = ((C1819070xRB) this.l0).LLIZ;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    public static final void run$0(ARunnableS8S0300100_27 aRunnableS8S0300100_27) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreViewPagerComponent@6933.scheduleUgPinFirstGuide$3");
        try {
            final ExploreViewPagerComponent exploreViewPagerComponent = (ExploreViewPagerComponent) aRunnableS8S0300100_27.l0;
            if (exploreViewPagerComponent.LLJLIL == 0) {
                HandlerHook.viewPost((C1846010y8d) aRunnableS8S0300100_27.l1, new ARunnableS25S0100100_27(aRunnableS8S0300100_27.j3, exploreViewPagerComponent, 1));
            } else {
                final C20553115bd c20553115bd = (C20553115bd) aRunnableS8S0300100_27.l2;
                final C1846010y8d c1846010y8d = (C1846010y8d) aRunnableS8S0300100_27.l1;
                final long j = aRunnableS8S0300100_27.j3;
                c20553115bd.addOnPageChangeListener(new C360660ECa() { // from class: X.0y8Q
                    @Override // X.C360660ECa, X.InterfaceC469360Ias
                    public final void onPageScrollStateChanged(int i) {
                        if (i == 0) {
                            c20553115bd.removeOnPageChangeListener(this);
                            HandlerHook.viewPost(c1846010y8d, new ARunnableS25S0100100_27(j, exploreViewPagerComponent, 2));
                        }
                    }
                });
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreViewPagerComponent@6933.scheduleUgPinFirstGuide$3");
    }

    public static final void run$1(ARunnableS8S0300100_27 aRunnableS8S0300100_27) {
        boolean zLIZ;
        C1C7U.LIZ("LiveHighLightPageFragment@5404.ensureCaptionView$5");
        try {
            aRunnableS8S0300100_27.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveHighLightPageFragment@5404.ensureCaptionView$5");
    }

    public static final void run$2(ARunnableS8S0300100_27 aRunnableS8S0300100_27) {
        boolean zLIZ;
        C1C7U.LIZ("LiveHighLightPageFragment@5404.ensureCaptionView$7$1");
        try {
            aRunnableS8S0300100_27.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveHighLightPageFragment@5404.ensureCaptionView$7$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$3(ARunnableS8S0300100_27 aRunnableS8S0300100_27) {
        boolean zLIZ;
        C1C7U.LIZ("LiveHighLightPageFragment@5404.ensureCaptionView$7");
        try {
            C259800zU c259800zU = (C259800zU) aRunnableS8S0300100_27.l0;
            HandlerHook.viewPost((C385340F8y) c259800zU.element, new ARunnableS8S0300100_27(aRunnableS8S0300100_27.j3, (FrameLayout) aRunnableS8S0300100_27.l2, (LiveHighLightPageFragment) aRunnableS8S0300100_27.l1, c259800zU, 2));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveHighLightPageFragment@5404.ensureCaptionView$7");
    }

    public static final void run$4(ARunnableS8S0300100_27 aRunnableS8S0300100_27) {
        boolean zLIZ;
        C1C7U.LIZ("MinisOperationBanner@203a.animateExpand$posted$1");
        try {
            aRunnableS8S0300100_27.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisOperationBanner@203a.animateExpand$posted$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$5(ARunnableS8S0300100_27 aRunnableS8S0300100_27) {
        boolean zLIZ;
        boolean z;
        C1C7U.LIZ("LiveHighLightPageFragment@5404.ensureTextStickerView$1");
        try {
            LiveHighLightPageFragment liveHighLightPageFragment = (LiveHighLightPageFragment) aRunnableS8S0300100_27.l0;
            long j = aRunnableS8S0300100_27.j3;
            T t = ((C259800zU) aRunnableS8S0300100_27.l1).element;
            C385340F8y c385340F8y = (C385340F8y) t;
            TextStickerConfig textStickerConfig = ((C1834580xqC) aRunnableS8S0300100_27.l2).LLJZIJLIL;
            if (((C385340F8y) t).getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            liveHighLightPageFragment.jT(j, c385340F8y, textStickerConfig, z);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveHighLightPageFragment@5404.ensureTextStickerView$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS8S0300100_27(long r2, android.widget.FrameLayout r4, com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment r5, X.C259800zU r6, int r7) {
        /*
            r1 = this;
            r1.$t = r7
            switch(r7) {
                case 1: goto L1c;
                case 2: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r6
            r0.l1 = r5
            r0.j3 = r2
            r0.l2 = r4
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.l0 = r5
            r0.j3 = r2
            r0.l1 = r6
            r0.l2 = r4
            goto Le
        L1c:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r6
            r0.l2 = r5
            r0.j3 = r2
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS8S0300100_27.<init>(long, android.widget.FrameLayout, com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment, X.00zU, int):void");
    }

    public ARunnableS8S0300100_27(long j, Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj3;
        this.l2 = obj2;
        this.j3 = j;
    }
}
