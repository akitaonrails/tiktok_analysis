package X;

import Y.ARunnableS106S0100000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.im.common.experiment.IMMessageBubbleAGSLSetting;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0H1s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434420H1s implements InterfaceC430010Gtb {
    public final ViewGroup LL;
    public final View LLILLJJLI;
    public final C420070GdZ LLILLL;
    public final float LLILZ = -C418440Gaw.LIZIZ(-40);
    public float LLILZIL;
    public final View LLILZLL;
    public final C1295960jpS LLIZ;
    public ValueAnimator LLIZLLLIL;
    public final View LLJ;

    @Override // X.InterfaceC430010Gtb
    public final void LJIL() {
        this.LLJ.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(200L).setInterpolator(C1619980sG4.LJFF()).withEndAction(new ARunnableS106S0100000_6(this, 296));
    }

    @Override // X.InterfaceC430010Gtb
    public final void dismiss() {
        if (this.LLJ.getParent() != null) {
            this.LLILZIL = Math.min(Math.max(0.0f, 0), this.LLILZ) / this.LLILZ;
            this.LLILLL.LIZ(0.0f);
            ValueAnimator valueAnimator = this.LLIZLLLIL;
            if (valueAnimator != null) {
                valueAnimator.pause();
            }
            ViewGroup viewGroup = this.LL;
            if (viewGroup != null) {
                C786410Ut5.LJJJLZIJ(this.LLJ, viewGroup);
            }
        }
    }

    @Override // X.InterfaceC430010Gtb
    public final void show() {
        if (this.LLJ.getParent() != null) {
            return;
        }
        C786410Ut5.T4(this.LLJ, 1.0f);
        C786410Ut5.Ob(this.LLJ, 1.0f);
        C786410Ut5.pc(this.LLJ, 1.0f);
        C786410Ut5.ed(this.LLJ, 0.0f);
        C786410Ut5.Ob(this.LLILZLL, 1.0f);
        C786410Ut5.pc(this.LLILZLL, 1.0f);
        this.LLIZ.setProgress(0.0f);
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            viewGroup.addView(this.LLJ);
        }
        int[] iArr = new int[2];
        this.LLILLJJLI.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        ViewGroup viewGroup2 = this.LL;
        if (viewGroup2 != null) {
            viewGroup2.getLocationOnScreen(iArr2);
        }
        View view = this.LLJ;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new C0IDO(iArr, iArr2, 4));
        } else {
            C786410Ut5.Fd(view, iArr[0] - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
            C786410Ut5.Ld(view, ((iArr[1] - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48))) - iArr2[1]);
        }
        ValueAnimator valueAnimatorOfFloat = this.LLIZLLLIL;
        if (valueAnimatorOfFloat == null) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, C418440Gaw.LIZIZ(Double.valueOf(2.5d)));
            valueAnimatorOfFloat.setDuration(700L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setRepeatMode(2);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJFF());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 162));
            this.LLIZLLLIL = valueAnimatorOfFloat;
        }
        valueAnimatorOfFloat.start();
    }

    @Override // X.InterfaceC430010Gtb
    public final void LJJIFFI(int i) {
        float fMin = Math.min(Math.max(0.0f, -i), this.LLILZ) / this.LLILZ;
        this.LLILZIL = fMin;
        this.LLILLL.LIZ(fMin);
        this.LLJ.invalidateDrawable(this.LLILLL);
        float interpolation = C1619980sG4.LJFF().getInterpolation(this.LLILZIL);
        this.LLILLJJLI.getLocationOnScreen(new int[2]);
        int[] iArr = new int[2];
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            viewGroup.getLocationOnScreen(iArr);
        }
        C786410Ut5.Ld(this.LLJ, (((r1[1] - iArr[1]) - r3.getHeight()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48))) + (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-16)) * interpolation));
        float f = 1.0f - interpolation;
        C786410Ut5.Ob(this.LLILZLL, f);
        C786410Ut5.pc(this.LLILZLL, f);
        this.LLIZ.setProgress(interpolation);
    }

    public C434420H1s(final Context context, ViewGroup viewGroup, View view) {
        ViewGroup viewGroup2;
        this.LL = viewGroup;
        this.LLILLJJLI = view;
        this.LLJ = C786410Ut5.Sd(R.layout.crd, (LayoutInflater) C786410Ut5.H2(context, "layout_inflater"), null);
        int iLJFF = C1383370m6R.LJFF(R.attr.a1e);
        IMMessageBubbleAGSLSetting.BubbleAGSLSetting bubbleAGSLSettingLIZ = IMMessageBubbleAGSLSetting.LIZ();
        int[] iArr = new int[4];
        int i = 0;
        do {
            iArr[i] = iLJFF;
            i++;
        } while (i < 4);
        List<String> list = bubbleAGSLSettingLIZ.colors;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(ColorProtector.parseColor(it2.next())));
        }
        int[] iArrLLII = C13LP.LLII(arrayList);
        float[] fArrLLI = C13LP.LLI(bubbleAGSLSettingLIZ.ratio);
        View view2 = this.LLJ;
        C420070GdZ c420070GdZ = new C420070GdZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), new C420080Gda(null, iArr), new C420080Gda(fArrLLI, iArrLLII));
        this.LLILLL = c420070GdZ;
        view2.setBackground(c420070GdZ);
        ViewParent parent = this.LLJ.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
        }
        this.LLILZLL = this.LLJ.findViewById(R.id.drd);
        C1295960jpS c1295960jpS = (C1295960jpS) this.LLJ.findViewById(R.id.sz1);
        this.LLIZ = c1295960jpS;
        c1295960jpS.addValueCallback(new C1295090jo3("**"), InterfaceC1295080jo2.LJJIJL, (InterfaceC1296040jpa<ColorFilter>) new InterfaceC1296040jpa() { // from class: X.129e
            @Override // X.InterfaceC1296040jpa
            public final Object LIZ(C1295570jop c1295570jop) {
                float f;
                int iLJFF2;
                if (c1295570jop != null) {
                    f = c1295570jop.LJI;
                } else {
                    f = 0.0f;
                }
                boolean zLIZIZ = C960203pA.LIZIZ(context);
                C1593200rYs c1593200rYs = C1593200rYs.LIZ;
                if (zLIZIZ) {
                    iLJFF2 = C1383370m6R.LJFF(R.attr.a1k);
                } else {
                    iLJFF2 = 0;
                }
                return new C1296110jph(((Integer) c1593200rYs.evaluate(f, Integer.valueOf(iLJFF2), Integer.valueOf(C1383370m6R.LJFF(R.attr.a0o)))).intValue());
            }
        });
        C786410Ut5.W5(this.LLJ, new ViewGroup.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72))));
    }
}
