package X;

import Y.AAListenerS338S0100000_28;
import Y.ARunnableS112S0100000_12;
import Y.AUListenerS276S0100000_28;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;

/* JADX INFO: renamed from: X.10ik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19323210ik extends C14JV implements InterfaceC20244014Ja {
    public int LIZJ;
    public boolean LIZLLL;
    public C20244614Jg LJ;
    public int LJFF = 0;
    public final /* synthetic */ MeasureLinearLayout LJI;

    @Override // X.C14JV
    public final C14JR LJ(C14JT c14jt, C14JR c14jr) {
        return c14jr;
    }

    public C19323210ik(MeasureLinearLayout measureLinearLayout) {
        this.LJI = measureLinearLayout;
    }

    @Override // X.C14JV
    public final void LIZIZ(C14JT c14jt) {
        if (this.LIZLLL && (c14jt.LIZ() & 8) != 0) {
            this.LIZLLL = false;
        }
    }

    @Override // X.C14JV
    public final void LIZJ(C14JT c14jt) {
        if ((c14jt.LIZ() & 8) != 0) {
            this.LIZLLL = true;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC20244014Ja
    public final C20244614Jg LIZ(View view, C20244614Jg c20244614Jg) {
        int i;
        long j;
        int i2;
        int i3;
        if (this.LJ != null && c20244614Jg.LIZ(8).LIZLLL == this.LJ.LIZ(8).LIZLLL) {
            return C20244614Jg.LIZIZ;
        }
        int i4 = c20244614Jg.LIZ(2).LIZLLL;
        int i5 = 0;
        boolean z = false;
        this.LIZJ = Math.max(c20244614Jg.LIZ(8).LIZLLL - i4, 0);
        this.LJI.setPadding(c20244614Jg.LIZ(7).LIZ, this.LJI.getPaddingTop(), c20244614Jg.LIZ(7).LIZJ, c20244614Jg.LIZ(2).LIZLLL);
        if (this.LIZLLL) {
            i = 2;
        } else {
            i = 10;
        }
        C20244814Ji c20244814JiLIZ = c20244614Jg.LIZ(i);
        int i6 = c20244814JiLIZ.LIZLLL;
        if (i4 > 0) {
            i6 -= i4;
        }
        MeasureLinearLayout measureLinearLayout = this.LJI;
        InterfaceC19323110ij interfaceC19323110ij = measureLinearLayout.LLILLJJLI;
        boolean z2 = true;
        if (interfaceC19323110ij != null) {
            int i7 = this.LIZJ;
            if (i7 > 0) {
                z = true;
            }
            interfaceC19323110ij.u2(i7, z);
        } else {
            Rect rect = new Rect(c20244814JiLIZ.LIZ, c20244814JiLIZ.LIZIZ, c20244814JiLIZ.LIZJ, Math.max(i6, 0));
            Rect rect2 = measureLinearLayout.LLIZ;
            if (rect2 != null && rect2.bottom != rect.bottom) {
                ValueAnimator valueAnimator = measureLinearLayout.LLILZIL;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (rect.bottom <= measureLinearLayout.LLILLL) {
                    z2 = false;
                }
                boolean z3 = !z2;
                measureLinearLayout.LLILZ = z3;
                if (z3) {
                    j = 120;
                } else {
                    j = 100;
                }
                long jAbs = (long) ((Math.abs(r5 - rect2.bottom) / (Math.max(rect.bottom, rect2.bottom) * 1.0f)) * j);
                ValueAnimator valueAnimator2 = measureLinearLayout.LLILZIL;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(jAbs);
                measureLinearLayout.LLILZIL = duration;
                if (measureLinearLayout.LLILZ) {
                    duration.setInterpolator(new AccelerateInterpolator());
                } else {
                    duration.setInterpolator(new DecelerateInterpolator());
                }
                int i8 = rect.bottom;
                int i9 = rect2.bottom;
                int i10 = measureLinearLayout.LLILLL;
                if (i9 == i10) {
                    i2 = i8 - i10;
                    i3 = 0;
                } else {
                    i2 = i8;
                    i3 = i9;
                }
                if (i8 == i10) {
                    i3 = i9 - i10;
                } else {
                    i5 = i2;
                }
                measureLinearLayout.LLILZIL.addUpdateListener(new AUListenerS276S0100000_28(measureLinearLayout, z2, i5, i3, 6));
                measureLinearLayout.LLILZIL.addListener(new AAListenerS338S0100000_28(measureLinearLayout, 8));
                C0R9K.LIZ(measureLinearLayout, new ARunnableS112S0100000_12(measureLinearLayout, 497));
                measureLinearLayout.LLIZ = rect;
            }
        }
        this.LJ = c20244614Jg;
        return c20244614Jg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        return r4;
     */
    @Override // X.C14JV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20244614Jg LIZLLL(X.C20244614Jg r4, java.util.List<X.C14JT> r5) {
        /*
            r3 = this;
            java.util.Iterator r1 = r5.iterator()
        L4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r1.next()
            X.14JT r0 = (X.C14JT) r0
            int r0 = r0.LIZ()
            r2 = 8
            r0 = r0 & 8
            if (r0 == 0) goto L4
            com.bytedance.android.live.common.keyboard.MeasureLinearLayout r0 = r3.LJI
            android.animation.ValueAnimator r1 = r0.LLILZIL
            if (r1 == 0) goto L27
            boolean r0 = r0.LLILZ
            if (r0 != 0) goto L27
            r1.cancel()
        L27:
            X.14Ji r0 = r4.LIZ(r2)
            int r1 = r0.LIZLLL
            r0 = 2
            X.14Ji r0 = r4.LIZ(r0)
            int r0 = r0.LIZLLL
            int r1 = r1 - r0
            if (r1 >= 0) goto L38
            r1 = 0
        L38:
            int r0 = r3.LIZJ
            if (r0 != 0) goto L41
            int r0 = r3.LJFF
            if (r0 != 0) goto L41
        L40:
            return r4
        L41:
            r3.LJFF = r1
            com.bytedance.android.live.common.keyboard.MeasureLinearLayout r0 = r3.LJI
            r0.getClass()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19323210ik.LIZLLL(X.14Jg, java.util.List):X.14Jg");
    }
}
