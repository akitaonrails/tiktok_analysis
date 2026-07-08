package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.150L, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C150L extends FrameLayout implements C15AJ {
    public ViewGroup LL;
    public String LLILLJJLI;
    public final boolean LLILLL;
    public final C150H LLILZ;
    public final C150H LLILZIL;
    public C1561430qjd LLILZLL;
    public boolean LLIZ;
    public C11JF LLIZLLLIL;
    public C20475915Af LLJ;
    public AnimatorSet LLJI;

    @Override // X.C15AJ
    public final boolean LLZZLLIL() {
        return true;
    }

    @Override // X.C15AJ
    public final void g() {
        C500260Jjc.LJLJLJ(this, true);
    }

    public final void LIZ() {
        C11JF c11jf = this.LLIZLLLIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLIZLLLIL = null;
        AnimatorSet animatorSet = this.LLJI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLJI = null;
    }

    @Override // X.C15AJ
    public final boolean LLIIII() {
        return getParent() != null;
    }

    @Override // android.view.View, X.C15AJ
    public String getTag() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BoardGeniusView");
        sbLIZ.append(this.LLILLL ? "" : "_screenshot");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZ();
    }

    @Override // X.C15AJ
    public final void LJIIJ() {
        C15AI.LJII(this);
    }

    @Override // X.C15AJ
    public final void LLLIILIL() {
        C15AI.LIZ(this);
    }

    @Override // X.C15AJ
    public String getGeniusId() {
        return this.LLILLJJLI;
    }

    @Override // X.C15AJ
    public ViewGroup getRoot() {
        return this.LL;
    }

    @Override // X.C15AJ
    public C20475915Af getGeniusModel() {
        return this.LLJ;
    }

    @Override // X.C15AJ
    public final ViewGroup.LayoutParams LLIIIZ(Rect rect) {
        return C15AI.LIZIZ(this, rect);
    }

    @Override // X.C15AJ
    public final void LLIIL(View view) {
        C15AI.LJIIIIZZ(this, view);
    }

    @Override // X.C15AJ
    public final void W(InterfaceC20476615Am interfaceC20476615Am) {
        C15AI.LJ(this, interfaceC20476615Am);
        C500260Jjc.LJLJLJ(this, false);
    }

    @Override // X.C15AJ
    public final void log(String str) {
        C15AI.LJFF(this, str);
    }

    public void setGeniusId(String str) {
        this.LLILLJJLI = str;
    }

    @Override // X.C15AJ
    public void setRoot(ViewGroup viewGroup) {
        this.LL = viewGroup;
    }

    @Override // X.C15AJ
    public void setGeniusModel(C20475915Af c20475915Af) {
        this.LLJ = c20475915Af;
    }

    public C150L(ViewGroup viewGroup, String str, boolean z) {
        super(viewGroup.getContext());
        this.LL = viewGroup;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        C786410Ut5.Td(C786410Ut5.ne(getRoot().getContext()), R.layout.h_x, this, true);
        this.LLILZ = (C150H) findViewById(R.id.c6n);
        this.LLILZIL = (C150H) findViewById(R.id.c6o);
        ViewGroup.LayoutParams layoutParamsLLIIIZ = LLIIIZ(new Rect());
        layoutParamsLLIIIZ.width = -1;
        layoutParamsLLIIIZ.height = -2;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParamsLLIIIZ);
    }

    public final void LIZIZ(final long j, List list, final List list2) {
        if (!this.LLILLL) {
            C15AI.LJFF(this, "startFlipping update right now");
            this.LLILZ.LIZIZ(true, false, Long.valueOf(j), list2);
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.LLILZIL.LIZIZ(false, this.LLILLL, Long.valueOf(j), list2);
        C150H c150h = this.LLILZ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c150h);
        c150h.setTranslationY(0.0f);
        this.LLILZ.LIZ();
        float measuredHeight = this.LLILZ.getMeasuredHeight();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startFlipping curShowLabelData.size:");
        sbLIZ.append(list.size());
        sbLIZ.append(" flipLabelData.size:");
        sbLIZ.append(list2.size());
        sbLIZ.append(" scrollHeight:");
        sbLIZ.append(measuredHeight);
        C20441214yg.LJ("wws_animation", C2188811AlT.LIZIZ(sbLIZ));
        arrayList.add(C519880KaA.LIZ(this.LLILZ, FrameLayout.TRANSLATION_Y, new float[]{0.0f, (-1.0f) * measuredHeight}));
        C150H c150h2 = this.LLILZIL;
        int visibility = c150h2.getVisibility();
        c150h2.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c150h2);
        C150H c150h3 = this.LLILZIL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c150h3);
        c150h3.setTranslationY(measuredHeight);
        ObjectAnimator objectAnimatorLIZ = C519880KaA.LIZ(this.LLILZIL, FrameLayout.TRANSLATION_Y, new float[]{measuredHeight, 0.0f});
        objectAnimatorLIZ.addListener(new C464420IJc() { // from class: X.150M
            @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                C150L c150l = this.LL;
                c150l.getClass();
                C15AI.LJFF(c150l, "startFlipping animation cancel");
            }

            @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                this.LL.LLILZ.LIZIZ(true, true, Long.valueOf(j), list2);
                C150H c150h4 = this.LL.LLILZ;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c150h4);
                c150h4.setTranslationY(0.0f);
                C150H c150h5 = this.LL.LLILZIL;
                int visibility2 = c150h5.getVisibility();
                c150h5.setVisibility(8);
                C1602160rnK.LIZIZ(visibility2, 8, c150h5);
            }
        });
        arrayList.add(objectAnimatorLIZ);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        this.LLJI = animatorSet;
    }

    @Override // X.C15AJ
    public final void LJLL(List list, InterfaceC20476615Am interfaceC20476615Am, Function2 function2) {
        C15AI.LJIIIZ(this, list, interfaceC20476615Am, function2);
    }

    @Override // X.C15AJ
    public final void LLJJIJIL(List list, InterfaceC20476615Am interfaceC20476615Am, Function2 function2) {
        if (function2 != null) {
            function2.invoke(Boolean.TRUE, null);
        }
    }

    @Override // X.C15AJ
    public final void LLJLILLLLZIIL(InterfaceC20476615Am interfaceC20476615Am, String str, Function2 function2) {
        C15AI.LJI(this, interfaceC20476615Am, str, function2);
    }

    @Override // X.C15AJ
    public final void LLLZZIL(InterfaceC20476615Am interfaceC20476615Am, String str, boolean z, Function2 function2) {
        C1561430qjd c1561430qjd;
        int i;
        int i2;
        ArrayList arrayList;
        C1561430qjd c1561430qjd2;
        List<List<C150F>> list;
        C20475915Af c20475915Af = (C20475915Af) interfaceC20476615Am;
        C15AI.LJIIJ(this, c20475915Af, str, z, function2);
        if (z) {
            C15AI.LJFF(this, "updateByGeniusModel return as onlyInit is true");
            return;
        }
        InterfaceC20477315At interfaceC20477315At = c20475915Af.LIZIZ;
        if (!(interfaceC20477315At instanceof C1561430qjd)) {
            interfaceC20477315At = null;
        }
        if (Intrinsics.LJFF(interfaceC20477315At, this.LLILZLL)) {
            C15AI.LJFF(this, "updateByGeniusModel return as config don't change");
            return;
        }
        InterfaceC20477315At interfaceC20477315At2 = c20475915Af.LIZIZ;
        if (interfaceC20477315At2 instanceof C1561430qjd) {
            c1561430qjd = (C1561430qjd) interfaceC20477315At2;
        } else {
            c1561430qjd = null;
        }
        this.LLILZLL = c1561430qjd;
        C500260Jjc.LJLJLJ(this, true);
        C150H c150h = this.LLILZ;
        C1561430qjd c1561430qjd3 = this.LLILZLL;
        int i3 = 11;
        if (c1561430qjd3 != null) {
            i = c1561430qjd3.LIZIZ;
        } else {
            i = 11;
        }
        c150h.setTitleTextSize(i);
        C150H c150h2 = this.LLILZ;
        C1561430qjd c1561430qjd4 = this.LLILZLL;
        int i4 = 16;
        if (c1561430qjd4 != null) {
            i2 = c1561430qjd4.LIZJ;
        } else {
            i2 = 16;
        }
        c150h2.setContentTextSize(i2);
        C150H c150h3 = this.LLILZIL;
        C1561430qjd c1561430qjd5 = this.LLILZLL;
        if (c1561430qjd5 != null) {
            i3 = c1561430qjd5.LIZIZ;
        }
        c150h3.setTitleTextSize(i3);
        C150H c150h4 = this.LLILZIL;
        C1561430qjd c1561430qjd6 = this.LLILZLL;
        if (c1561430qjd6 != null) {
            i4 = c1561430qjd6.LIZJ;
        }
        c150h4.setContentTextSize(i4);
        setTranslationZ(c20475915Af.LIZ.LJII);
        StringBuilder sb = new StringBuilder("updateByGeniusModel boardList:");
        C1561430qjd c1561430qjd7 = this.LLILZLL;
        if (c1561430qjd7 != null && (list = c1561430qjd7.LIZ) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (List<C150F> list2 : list) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<C150F> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next());
                }
                arrayList.add(arrayList2);
            }
        } else {
            arrayList = null;
        }
        sb.append(arrayList);
        C15AI.LJFF(this, sb.toString());
        InterfaceC20477315At interfaceC20477315At3 = c20475915Af.LIZIZ;
        if (!(interfaceC20477315At3 instanceof C1561430qjd) || (c1561430qjd2 = (C1561430qjd) interfaceC20477315At3) == null) {
            return;
        }
        if (c1561430qjd2.LIZ.isEmpty()) {
            LIZ();
            this.LLILZ.LIZ();
            this.LLILZIL.LIZ();
            C500260Jjc.LJLJLJ(this, false);
            return;
        }
        C500260Jjc.LJLJLJ(this, true);
        if (c1561430qjd2.LIZ.size() == 1) {
            LIZ();
            this.LLILZ.LIZIZ(true, this.LLILLL, Long.valueOf(c1561430qjd2.LJ), (List) ListProtector.get(c1561430qjd2.LIZ, 0));
            C150H c150h5 = this.LLILZ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c150h5);
            c150h5.setTranslationY(0.0f);
            this.LLILZIL.LIZ();
            C500260Jjc.LJLJLJ(this.LLILZIL, false);
            return;
        }
        if (c1561430qjd2.LIZ.size() <= 2) {
            LIZ();
            long j = c1561430qjd2.LIZLLL;
            final long j2 = c1561430qjd2.LJ;
            final List list3 = (List) ListProtector.get(c1561430qjd2.LIZ, 0);
            final List list4 = (List) ListProtector.get(c1561430qjd2.LIZ, 1);
            this.LLIZ = false;
            this.LLILZ.LIZIZ(true, this.LLILLL, Long.valueOf(j2), list3);
            this.LLILZIL.LIZ();
            C500260Jjc.LJLJLJ(this.LLILZIL, false);
            this.LLIZLLLIL = (C11JF) C11NZ.LJJJJJL(j, j, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.150N
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("BoardGeniusViewNew@8ab8.startCountDown$1");
                    if (this.LL.LLIZ) {
                        this.LL.LIZIZ(j2, list4, list3);
                    } else {
                        this.LL.LIZIZ(j2, list3, list4);
                    }
                    this.LL.LLIZ = !r1.LLIZ;
                    C1C7U.LIZIZ("BoardGeniusViewNew@8ab8.startCountDown$1");
                }
            });
            if (function2 == null) {
                return;
            }
            function2.invoke(Boolean.TRUE, null);
            return;
        }
        throw new IllegalArgumentException("boardList.size largger than 2,please check");
    }
}
