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

/* JADX INFO: renamed from: X.0H1t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434430H1t extends C214906198m implements InterfaceC430010Gtb {
    public final View LL;
    public final C420070GdZ LLILLJJLI;
    public final float LLILLL;
    public float LLILZ;
    public final View LLILZIL;
    public final C1295960jpS LLILZLL;
    public ValueAnimator LLIZ;

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void dismiss() {
        this.LLILZ = Math.min(Math.max(0.0f, 0), this.LLILLL) / this.LLILLL;
        this.LLILLJJLI.LIZ(0.0f);
        ValueAnimator valueAnimator = this.LLIZ;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
        super.dismiss();
    }

    @Override // X.InterfaceC430010Gtb
    public final void LJIL() {
        getContentView().animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(200L).setInterpolator(C1619980sG4.LJFF()).withEndAction(new ARunnableS106S0100000_6(this, 297));
    }

    @Override // X.InterfaceC430010Gtb
    public final void show() {
        C786410Ut5.T4(getContentView(), 1.0f);
        C786410Ut5.Ob(getContentView(), 1.0f);
        C786410Ut5.pc(getContentView(), 1.0f);
        C786410Ut5.ed(getContentView(), 0.0f);
        C786410Ut5.Ob(this.LLILZIL, 1.0f);
        C786410Ut5.pc(this.LLILZIL, 1.0f);
        this.LLILZLL.setProgress(0.0f);
        showAsDropDown(this.LL, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-6)), ((-this.LL.getHeight()) - getHeight()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), 17);
        ValueAnimator valueAnimatorOfFloat = this.LLIZ;
        if (valueAnimatorOfFloat == null) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, C418440Gaw.LIZIZ(Double.valueOf(2.5d)));
            valueAnimatorOfFloat.setDuration(700L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setRepeatMode(2);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJFF());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 163));
            this.LLIZ = valueAnimatorOfFloat;
        }
        valueAnimatorOfFloat.start();
    }

    @Override // X.InterfaceC430010Gtb
    public final void LJJIFFI(int i) {
        float fMin = Math.min(Math.max(0.0f, -i), this.LLILLL) / this.LLILLL;
        this.LLILZ = fMin;
        this.LLILLJJLI.LIZ(fMin);
        getContentView().invalidateDrawable(this.LLILLJJLI);
        float interpolation = C1619980sG4.LJFF().getInterpolation(this.LLILZ);
        update(this.LL, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-6)), ((int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-16)) * interpolation)) + (((-this.LL.getHeight()) - getHeight()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48))), -1, -1);
        float f = 1.0f - interpolation;
        C786410Ut5.Ob(this.LLILZIL, f);
        C786410Ut5.pc(this.LLILZIL, f);
        this.LLILZLL.setProgress(interpolation);
    }

    public C434430H1t(final Context context, View view) {
        ViewGroup viewGroup;
        super(context);
        this.LL = view;
        this.LLILLL = -C418440Gaw.LIZIZ(-40);
        setContentView(C786410Ut5.Sd(R.layout.crd, (LayoutInflater) C786410Ut5.H2(context, "layout_inflater"), null));
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
        View contentView = getContentView();
        C420070GdZ c420070GdZ = new C420070GdZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), new C420080Gda(null, iArr), new C420080Gda(fArrLLI, iArrLLII));
        this.LLILLJJLI = c420070GdZ;
        contentView.setBackground(c420070GdZ);
        ViewParent parent = getContentView().getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        this.LLILZIL = getContentView().findViewById(R.id.drd);
        C1295960jpS c1295960jpS = (C1295960jpS) getContentView().findViewById(R.id.sz1);
        this.LLILZLL = c1295960jpS;
        c1295960jpS.addValueCallback(new C1295090jo3("**"), InterfaceC1295080jo2.LJJIJL, (InterfaceC1296040jpa<ColorFilter>) new InterfaceC1296040jpa() { // from class: X.129f
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
        setWidth(-2);
        setHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)));
        setTouchable(false);
        setClippingEnabled(false);
        setBackgroundDrawable(null);
    }
}
