package X;

import Y.AUListenerS0S0400001_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.0FTh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C390630FTh implements C0FUG {
    public final Context LL;
    public final InterfaceC388760FMc LLILLJJLI;
    public final FrameLayout LLILLL;
    public final C0FUH LLILZ;
    public final LifecycleOwner LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public C0FTI LLJ;
    public boolean LLJI;
    public float LLJILJIL;
    public float LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJI;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 997));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 443));
    public float LLJJ = -1.0f;

    @Override // X.C0FUG
    public final void LIZJ() {
    }

    @Override // X.C0FUG
    public final void LJI() {
    }

    @Override // X.C0FUG
    public final void LJII(MotionEvent motionEvent) {
    }

    @Override // X.C0FUG
    public final void LJIIJ(int i) {
    }

    @Override // X.C0FUG
    public final void LJIIJJI(float f, int i, RectF rectF) {
    }

    @Override // X.C0FUG
    public final void LJIILL(int i) {
    }

    @Override // X.C0FUG
    public final void LJIILLIIL(int i) {
    }

    @Override // X.C0FUG
    public final void LJIIZILJ() {
    }

    @Override // X.C0FUG
    public final void LJIJ(int i, EnumC1466150oFx enumC1466150oFx) {
    }

    @Override // X.C0FUG
    public final void LJIJI(int i, boolean z) {
    }

    @Override // X.C0FUG
    public final void LJIL() {
    }

    @Override // X.C0FUG
    public final void LJJIII() {
    }

    @Override // X.C0FUG
    public final void LJJIIJZLJL() {
    }

    @Override // X.C0FUG
    public final void LJJIIZ(int i, EnumC1466150oFx enumC1466150oFx, float f, float f2, RectF rectF, float f3) {
    }

    @Override // X.C0FUG
    public final void LJJIJ() {
    }

    @Override // X.C0FUG
    public final void LJJIJIIJI(int i) {
    }

    @Override // X.C0FUG
    public final int getPriority() {
        return 50;
    }

    public final C1664680tQA<C390640FTi> LIZIZ() {
        return (C1664680tQA) this.LLIZLLLIL.getValue();
    }

    @Override // X.C0FUG
    public final void LJIIIIZZ(int i) {
        this.LLILLJJLI.LJJIFFI();
        this.LLJILJIL = 0.0f;
        this.LLJILJILJ = 0.0f;
        this.LLJILLL = false;
        C0FTJ c0ftjLIZ = C0FKU.LIZ(i, (List) this.LLIZ.getValue());
        if (c0ftjLIZ == null) {
            return;
        }
        if (c0ftjLIZ.LJJIFFI()) {
            LIZ(i, 0.0f, 0.0f, false);
            ((InterfaceC388760FMc) this.LLILZLL.getValue()).LJIILJJIL(1);
        }
        this.LLJJ = -1.0f;
        this.LLJJI = false;
    }

    public final void LIZ(int i, float f, float f2, boolean z) {
        C0FT8 c0ft8;
        Object next;
        C0FFE c0ffe;
        C0FT8 c0ft82;
        Object next2;
        C0FFE c0ffe2;
        C0FT8 c0ft83;
        Object next3;
        C0FFE c0ffe3;
        this.LLJIJIL.getValue();
        if (z) {
            C390640FTi c390640FTi = LIZIZ().LIZ;
            c390640FTi.getClass();
            int i2 = c390640FTi.LJFF;
            int i3 = c390640FTi.LJI - c390640FTi.LJIIIZ;
            if (new Rect(i2, i3, c390640FTi.LJII + i2, c390640FTi.LJIIIIZZ + i3).contains((int) f, (int) f2)) {
                C0FTI c0fti = this.LLJ;
                if (c0fti != null && (c0ft83 = c0fti.LIZ.LJIIIZ) != null) {
                    Iterator it2 = ((ArrayList) c0ft83.LIZ.LJIIL).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next3 = it2.next();
                            if (((C0FTJ) next3).getStickerId() == i) {
                                break;
                            }
                        } else {
                            next3 = null;
                            break;
                        }
                    }
                    C0FTJ c0ftj = (C0FTJ) next3;
                    if (c0ftj != null) {
                        C390390FSj c390390FSj = c0ft83.LIZ;
                        if (C390650FTj.LIZ()) {
                            C0FTH c0fthLJIILL = c390390FSj.LJIILL();
                            if (C390650FTj.LIZ() && !c0fthLJIILL.LIZJ().LLJJI) {
                                c0fthLJIILL.LIZJ().LLJJI = true;
                                if ((c0ftj instanceof C0FFE) && (c0ffe3 = (C0FFE) c0ftj) != null) {
                                    C1664680tQA<BaseStickerModel> c1664680tQALJJIJ = c0ffe3.LJJIJ();
                                    float f3 = c0fthLJIILL.LIZJ().LLJJ;
                                    float translateX = c0ffe3.LJJIIJZLJL().getTranslateX();
                                    float translateY = c0ffe3.LJJIIJZLJL().getTranslateY();
                                    int containerLeft = c0ffe3.LJJIIJZLJL().getContainerLeft() + (c0ffe3.LJJIIJZLJL().getContainerWidth() / 2);
                                    int containerTop = c0ffe3.LJJIIJZLJL().getContainerTop() + (c0ffe3.LJJIIJZLJL().getContainerHeight() / 2);
                                    C390640FTi c390640FTi2 = c0fthLJIILL.LIZJ().LIZIZ().LIZ;
                                    Pair pair = new Pair(Float.valueOf((c390640FTi2.LJFF + (c390640FTi2.LJII / 2)) - containerLeft), Float.valueOf(((c390640FTi2.LJI - c390640FTi2.LJIIIZ) + (c390640FTi2.LJIIIIZZ / 2)) - containerTop));
                                    C390660FTk.LIZ = ((Number) pair.getFirst()).floatValue();
                                    float fFloatValue = ((Number) pair.getSecond()).floatValue();
                                    C390660FTk.LIZIZ = C390660FTk.LIZ - translateX;
                                    C390660FTk.LIZJ = fFloatValue - translateY;
                                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    valueAnimatorOfFloat.setDuration(200L);
                                    valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJII());
                                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS0S0400001_5(f3, c0fthLJIILL, c0ffe3, new C817403Hg(), c1664680tQALJJIJ, 0));
                                    valueAnimatorOfFloat.start();
                                }
                            }
                        } else {
                            c0ftj.setAlpha(0.3137255f);
                        }
                    }
                }
                LIZIZ().LIZLLL(AFwS234S0000000_5.get$arr$(402), true);
                return;
            }
            C0FTI c0fti2 = this.LLJ;
            if (c0fti2 != null && (c0ft82 = c0fti2.LIZ.LJIIIZ) != null) {
                Iterator it3 = ((ArrayList) c0ft82.LIZ.LJIIL).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (((C0FTJ) next2).getStickerId() == i) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                C0FTJ c0ftj2 = (C0FTJ) next2;
                if (c0ftj2 != null) {
                    C390390FSj c390390FSj2 = c0ft82.LIZ;
                    if (C390650FTj.LIZ()) {
                        C0FTH c0fthLJIILL2 = c390390FSj2.LJIILL();
                        if (C390650FTj.LIZ() && c0fthLJIILL2.LIZJ().LLJJI) {
                            c0fthLJIILL2.LIZJ().LLJJI = false;
                            if ((c0ftj2 instanceof C0FFE) && (c0ffe2 = (C0FFE) c0ftj2) != null) {
                                C1664680tQA<BaseStickerModel> c1664680tQALJJIJ2 = c0ffe2.LJJIJ();
                                float f4 = c0fthLJIILL2.LIZJ().LLJJ;
                                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                valueAnimatorOfFloat2.setDuration(150L);
                                valueAnimatorOfFloat2.setInterpolator(C1619980sG4.LJII());
                                valueAnimatorOfFloat2.addUpdateListener(new AUListenerS0S0400001_5(f4, c0fthLJIILL2, c0ffe2, new C817403Hg(), c1664680tQALJJIJ2, 1));
                                valueAnimatorOfFloat2.start();
                            }
                        }
                    } else {
                        c0ftj2.setAlpha(c0ftj2.LJ());
                    }
                }
            }
            LIZIZ().LIZLLL(AFwS234S0000000_5.get$arr$(403), true);
            return;
        }
        Integer num = LIZIZ().LIZ.LIZIZ;
        if (num != null && num.intValue() == 2) {
            C0FTI c0fti3 = this.LLJ;
            if (c0fti3 != null) {
                c0fti3.LIZ(i, "SLIDE_UP");
            }
            LIZIZ().LIZLLL(AFwS234S0000000_5.get$arr$(404), true);
            return;
        }
        C0FTI c0fti4 = this.LLJ;
        if (c0fti4 != null && (c0ft8 = c0fti4.LIZ.LJIIIZ) != null) {
            Iterator it4 = ((ArrayList) c0ft8.LIZ.LJIIL).iterator();
            while (true) {
                if (it4.hasNext()) {
                    next = it4.next();
                    if (((C0FTJ) next).getStickerId() == i) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0FTJ c0ftj3 = (C0FTJ) next;
            if (c0ftj3 != null) {
                C390390FSj c390390FSj3 = c0ft8.LIZ;
                if (C390650FTj.LIZ()) {
                    C0FTH c0fthLJIILL3 = c390390FSj3.LJIILL();
                    if (C390650FTj.LIZ() && c0fthLJIILL3.LIZJ().LLJJI) {
                        c0fthLJIILL3.LIZJ().LLJJI = false;
                        if ((c0ftj3 instanceof C0FFE) && (c0ffe = (C0FFE) c0ftj3) != null) {
                            C1664680tQA<BaseStickerModel> c1664680tQALJJIJ3 = c0ffe.LJJIJ();
                            float f5 = c0fthLJIILL3.LIZJ().LLJJ;
                            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat3.setDuration(150L);
                            valueAnimatorOfFloat3.setInterpolator(C1619980sG4.LJII());
                            valueAnimatorOfFloat3.addUpdateListener(new AUListenerS0S0400001_5(f5, c0fthLJIILL3, c0ffe, new C817403Hg(), c1664680tQALJJIJ3, 1));
                            valueAnimatorOfFloat3.start();
                        }
                    }
                } else {
                    c0ftj3.setAlpha(c0ftj3.LJ());
                }
            }
        }
        LIZIZ().LIZLLL(AFwS234S0000000_5.get$arr$(405), true);
    }

    @Override // X.C0FUG
    public final void LJJ(int i, EnumC1466150oFx enumC1466150oFx, float f, float f2) {
        C0FFE c0ffe;
        this.LLJILJIL = f;
        this.LLJILJILJ = f2;
        List list = (List) this.LLIZ.getValue();
        C0FTJ c0ftjLIZ = null;
        if (list != null) {
            c0ftjLIZ = C0FKU.LIZ(i, list);
        }
        if ((c0ftjLIZ instanceof C0FFE) && (c0ffe = (C0FFE) c0ftjLIZ) != null) {
            this.LLJJ = c0ffe.LJJIIJZLJL().getScale();
        }
    }

    @Override // X.C0FUG
    public final void LJJI(int i, float f, float f2, RectF rectF) {
        this.LLILLJJLI.LJJIFFI();
        C0FTJ c0ftjLIZ = C0FKU.LIZ(i, (List) this.LLIZ.getValue());
        if (c0ftjLIZ != null && c0ftjLIZ.LJJIFFI() && Math.abs(f - this.LLJILJIL) >= 2.0f && Math.abs(f2 - this.LLJILJILJ) >= 2.0f) {
            if (!this.LLJILLL) {
                ((InterfaceC388760FMc) this.LLILZLL.getValue()).LJJIIJ(1);
                this.LLJILLL = true;
            }
            LIZ(i, f, f2, true);
        }
    }

    public C390630FTh(Context context, InterfaceC388760FMc interfaceC388760FMc, FrameLayout frameLayout, C390420FSm c390420FSm, C0FUH c0fuh, LifecycleOwner lifecycleOwner) {
        this.LL = context;
        this.LLILLJJLI = interfaceC388760FMc;
        this.LLILLL = frameLayout;
        this.LLILZ = c0fuh;
        this.LLILZIL = lifecycleOwner;
        this.LLILZLL = C452501pT.LIZIZ(new AwS549S0100000_5(c390420FSm, 996));
        this.LLIZ = C452501pT.LIZIZ(new AwS549S0100000_5(c390420FSm, 998));
    }
}
