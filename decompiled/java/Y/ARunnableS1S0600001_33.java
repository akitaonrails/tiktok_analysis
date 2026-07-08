package Y;

import X.C1C7U;
import X.C21567519ar;
import X.C21570319bJ;
import X.C21570419bK;
import X.C21570819bO;
import X.C21572519bf;
import X.InterfaceC21567619as;
import X.InterfaceC21573019bk;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public class ARunnableS1S0600001_33 implements Runnable {
    public final int $t;
    public float f6;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C21570319bJ c21570319bJ = (C21570319bJ) this.l5;
        c21570319bJ.LLJJJJ = null;
        RectF rectF = c21570319bJ.LLJJ;
        boolean z = rectF == null || rectF.isEmpty();
        Rect rect = (Rect) this.l0;
        boolean z2 = rect == null || rect.isEmpty();
        Rect rect2 = (Rect) this.l1;
        boolean z3 = rect2 == null || rect2.isEmpty();
        if (z || z2 || z3) {
            ((C21570319bJ) this.l5).LLJJJIL = new AnimatorSet();
            ((C21570319bJ) this.l5).LLJJJIL.addListener(new ALAdapterS27S0100000_33(this, 17));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS280S0100000_33(this, 42));
            ((C21570319bJ) this.l5).LLJJJIL.playTogether(valueAnimatorOfFloat);
            C21570319bJ c21570319bJ2 = (C21570319bJ) this.l5;
            c21570319bJ2.LLJJJIL.setInterpolator(c21570319bJ2.getInterpolator());
            ((C21570319bJ) this.l5).LLJJJIL.setDuration(200L);
            ((C21570319bJ) this.l5).LLJJJIL.start();
            return;
        }
        int[] iArr = new int[2];
        ((C21570319bJ) this.l5).getLocationOnScreen(iArr);
        ((Rect) this.l0).offset(-iArr[0], -iArr[1]);
        ((Rect) this.l1).offset(-iArr[0], -iArr[1]);
        Animator animatorLJI = ((C21570319bJ) this.l5).LJI(new Matrix(((C21570319bJ) this.l5).LJFF((Rect) this.l0, (InterfaceC21567619as) this.l2)), new Matrix(((C21570319bJ) this.l5).LLJJJ), (C21570819bO) this.l3);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS280S0100000_33(this, 43));
        C21570819bO c21570819bO = (C21570819bO) this.l3;
        if (c21570819bO != null) {
            valueAnimatorOfFloat2.setDuration(c21570819bO.LJII);
            valueAnimatorOfFloat2.setInterpolator(((C21570819bO) this.l3).LIZLLL);
        }
        ArrayList arrayList = new ArrayList();
        Rect rect3 = new Rect((Rect) this.l0);
        int[] iArr2 = (int[]) this.l4;
        if (iArr2 != null) {
            if (iArr2.length != 4) {
                throw new IllegalArgumentException("maskInsetPixel length must equal 4");
            }
            rect3.left += iArr2[0];
            rect3.top += iArr2[1];
            rect3.right -= iArr2[2];
            rect3.bottom -= iArr2[3];
        }
        arrayList.add(((C21570319bJ) this.l5).LJ(rect3, (Rect) this.l1, this.f6, false));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        C21570819bO c21570819bO2 = (C21570819bO) this.l3;
        if (c21570819bO2 != null) {
            animatorSet.setDuration(c21570819bO2.LJI);
            animatorSet.setInterpolator(((C21570819bO) this.l3).LIZJ);
        }
        ((C21570319bJ) this.l5).LLJJJIL = new AnimatorSet();
        ((C21570319bJ) this.l5).LLJJJIL.addListener(new ALAdapterS27S0100000_33(this, 18));
        ((C21570319bJ) this.l5).LLJJJIL.playTogether(animatorLJI, animatorSet, valueAnimatorOfFloat2);
        C21570319bJ c21570319bJ3 = (C21570319bJ) this.l5;
        c21570319bJ3.LLJJJIL.setInterpolator(c21570319bJ3.getInterpolator());
        if (((C21570819bO) this.l3) == null) {
            ((C21570319bJ) this.l5).LLJJJIL.setDuration(200L);
        }
        ((C21570319bJ) this.l5).LLJJJIL.start();
    }

    public final void LIZ$1() {
        Rect rect;
        Rect rect2 = ((C21572519bf) this.l0).LLJJ;
        boolean zIsEmpty = rect2 != null ? rect2.isEmpty() : true;
        Rect rect3 = (Rect) this.l1;
        boolean zIsEmpty2 = rect3 != null ? rect3.isEmpty() : true;
        Rect rect4 = (Rect) this.l2;
        boolean zIsEmpty3 = rect4 != null ? rect4.isEmpty() : true;
        if (zIsEmpty || zIsEmpty2 || zIsEmpty3) {
            InterfaceC21573019bk interfaceC21573019bk = ((C21572519bf) this.l0).LLJLIL;
            if (interfaceC21573019bk != null) {
                interfaceC21573019bk.LIZJ(0.0f);
            }
            C21572519bf c21572519bf = (C21572519bf) this.l0;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21572519bf);
            c21572519bf.setAlpha(0.0f);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS280S0100000_33((C21572519bf) this.l0, 46));
            ((C21572519bf) this.l0).LLJJJIL = new AnimatorSet();
            C21572519bf c21572519bf2 = (C21572519bf) this.l0;
            AnimatorSet animatorSet = c21572519bf2.LLJJJIL;
            if (animatorSet != null) {
                animatorSet.addListener(new ALAdapterS27S0100000_33(c21572519bf2, 20));
                animatorSet.playTogether(valueAnimatorOfFloat);
                animatorSet.setInterpolator(c21572519bf2.LLJL);
                animatorSet.setDuration(200L);
                animatorSet.start();
                return;
            }
            return;
        }
        Rect rect5 = (Rect) this.l1;
        if (rect5 == null || (rect = (Rect) this.l2) == null) {
            return;
        }
        int[] iArr = new int[2];
        ((C21572519bf) this.l0).getLocationOnScreen(iArr);
        rect5.offset(-iArr[0], -iArr[1]);
        rect.offset(-iArr[0], -iArr[1]);
        Matrix matrixLIZ = C21570419bK.LIZ((Rect) this.l1, ((C21572519bf) this.l0).getWidth(), ((C21572519bf) this.l0).getHeight(), ((C21572519bf) this.l0).LLJJ, (InterfaceC21567619as) this.l3);
        ((C21572519bf) this.l0).LLJILJILJ = new Matrix(matrixLIZ);
        ((C21572519bf) this.l0).postInvalidateOnAnimation();
        InterfaceC21573019bk interfaceC21573019bk2 = ((C21572519bf) this.l0).LLJLIL;
        if (interfaceC21573019bk2 != null) {
            interfaceC21573019bk2.LIZJ(0.0f);
        }
        Matrix matrix = new Matrix(matrixLIZ);
        Matrix matrix2 = new Matrix();
        C21572519bf c21572519bf3 = (C21572519bf) this.l0;
        AnimatorSet animatorSetLIZIZ = C21570419bK.LIZIZ(matrix, matrix2, c21572519bf3.LLJJ, (C21570819bO) this.l4, new AwS612S0100000_33(c21572519bf3, 151));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        C21570819bO c21570819bO = (C21570819bO) this.l4;
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS280S0100000_33((C21572519bf) this.l0, 45));
        valueAnimatorOfFloat2.setDuration(c21570819bO.LJII);
        valueAnimatorOfFloat2.setInterpolator(c21570819bO.LIZLLL);
        Rect rect6 = new Rect((Rect) this.l1);
        int[] iArr2 = (int[]) this.l5;
        if (iArr2 != null) {
            if (iArr2.length != 4) {
                "maskInsetPixel length must equal 4".toString();
                throw new IllegalArgumentException("maskInsetPixel length must equal 4");
            }
            rect6.left += iArr2[0];
            rect6.top += iArr2[1];
            rect6.right -= iArr2[2];
            rect6.bottom -= iArr2[3];
        }
        Animator animatorLJ = ((C21572519bf) this.l0).LJ(rect6, (Rect) this.l2, this.f6, false);
        C21570819bO c21570819bO2 = (C21570819bO) this.l4;
        animatorLJ.setDuration(c21570819bO2.LJI);
        animatorLJ.setInterpolator(c21570819bO2.LIZJ);
        C21572519bf c21572519bf4 = (C21572519bf) this.l0;
        if (c21572519bf4.LLIZ != null && c21572519bf4.LLIZLLLIL != null && !c21572519bf4.LLJI.isEmpty()) {
            c21572519bf4.LIZJ(0.0f);
        }
        ((C21572519bf) this.l0).LLJJJIL = new AnimatorSet();
        C21572519bf c21572519bf5 = (C21572519bf) this.l0;
        AnimatorSet animatorSet2 = c21572519bf5.LLJJJIL;
        if (animatorSet2 != null) {
            animatorSet2.addListener(new ALAdapterS27S0100000_33(c21572519bf5, 21));
            animatorSet2.playTogether(animatorSetLIZIZ, animatorLJ, valueAnimatorOfFloat2);
            animatorSet2.setInterpolator(c21572519bf5.LLJL);
            animatorSet2.setDuration(200L);
            animatorSet2.start();
        }
    }

    public static final void run$0(ARunnableS1S0600001_33 aRunnableS1S0600001_33) {
        boolean zLIZ;
        C1C7U.LIZ("GestureLayout@764.animateAppear$1");
        try {
            aRunnableS1S0600001_33.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GestureLayout@764.animateAppear$1");
    }

    public static final void run$1(ARunnableS1S0600001_33 aRunnableS1S0600001_33) {
        boolean zLIZ;
        C1C7U.LIZ("ScaleGestureLayout@a429.animateAppear$1");
        try {
            aRunnableS1S0600001_33.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ScaleGestureLayout@a429.animateAppear$1");
    }

    public ARunnableS1S0600001_33(C21570319bJ c21570319bJ, Rect rect, Rect rect2, C21567519ar c21567519ar, C21570819bO c21570819bO, int i) {
        this.$t = i;
        this.l5 = c21570319bJ;
        this.l0 = rect;
        this.l1 = rect2;
        this.l2 = c21567519ar;
        this.l3 = c21570819bO;
        this.l4 = null;
        this.f6 = 0.0f;
    }

    public ARunnableS1S0600001_33(C21572519bf c21572519bf, Rect rect, Rect rect2, C21567519ar c21567519ar, C21570819bO c21570819bO, int i) {
        this.$t = i;
        this.l0 = c21572519bf;
        this.l1 = rect;
        this.l2 = rect2;
        this.l3 = c21567519ar;
        this.l4 = c21570819bO;
        this.f6 = 0.0f;
        this.l5 = null;
    }
}
