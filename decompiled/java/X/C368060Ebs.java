package X;

import Y.ALAdapterS0S0101001_5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ebs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368060Ebs extends LinearLayout {
    public final C368420EcS LL;
    public final C368080Ebu LLILLJJLI;
    public List<C350030Dnt> LLILLL;
    public final InterpolatorC366870EZx LLILZ;
    public final C368160Ec2 LLILZIL;

    public final void LIZ() {
        C368080Ebu c368080Ebu = this.LLILLJJLI;
        int visibility = c368080Ebu.getVisibility();
        c368080Ebu.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c368080Ebu);
        C368420EcS c368420EcS = this.LL;
        int visibility2 = c368420EcS.getVisibility();
        c368420EcS.setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, c368420EcS);
        Iterator<C368690Ect> it2 = this.LL.getDropList().iterator();
        while (it2.hasNext()) {
            C376310EpB c376310EpBLIZ = it2.next().LIZ();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c376310EpBLIZ);
            c376310EpBLIZ.setScaleX(0.0f);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c376310EpBLIZ);
            c376310EpBLIZ.setScaleY(0.0f);
        }
        C368080Ebu c368080Ebu2 = this.LLILLJJLI;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c368080Ebu2);
        c368080Ebu2.setAlpha(0.0f);
    }

    public final C368080Ebu getTrackLine() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[PHI: r3
      0x005c: PHI (r3v1 float) = (r3v0 float), (r3v0 float), (r3v3 float), (r3v3 float) binds: [B:9:0x0017, B:10:0x0019, B:12:0x001d, B:13:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setDropGroupVisibility(int r7) {
        /*
            r6 = this;
            X.0Ec2 r0 = r6.LLILZIL
            r0.cancel()
            X.0EcS r0 = r6.LL
            int r0 = r0.getVisibility()
            if (r0 != r7) goto Le
            return
        Le:
            r3 = 0
            r1 = 8
            r0 = 4
            if (r7 == r0) goto L5f
            if (r7 == r1) goto L5f
            r5 = 0
        L17:
            if (r7 == r0) goto L5c
            if (r7 == r1) goto L5c
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r7 == r0) goto L5c
            if (r7 == r1) goto L5c
            r1 = 150(0x96, double:7.4E-322)
        L23:
            X.0Ec2 r0 = r6.LLILZIL
            r0.setStartDelay(r1)
            X.0Ec2 r0 = r6.LLILZIL
            r0.removeAllUpdateListeners()
            X.0Ec2 r0 = r6.LLILZIL
            r0.removeAllListeners()
            X.0EcS r0 = r6.LL
            java.util.List r0 = r0.getDropList()
            java.util.Iterator r4 = r0.iterator()
        L3c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r4.next()
            X.0Ect r0 = (X.C368690Ect) r0
            X.0EpB r2 = r0.LIZ()
            int r0 = X.C376310EpB.LLILZ
            float r1 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            r2.setPivotX(r1)
            int r0 = X.C376310EpB.LLILZIL
            float r0 = (float) r0
            r2.setPivotY(r0)
            goto L3c
        L5c:
            r1 = 0
            goto L23
        L5f:
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L17
        L62:
            X.0Ec2 r2 = r6.LLILZIL
            r0 = 2
            float[] r1 = new float[r0]
            r0 = 0
            r1[r0] = r5
            r0 = 1
            r1[r0] = r3
            r2.setFloatValues(r1)
            X.0Ec2 r2 = r6.LLILZIL
            Y.AUListenerS255S0100000_5 r1 = new Y.AUListenerS255S0100000_5
            r0 = 20
            r1.<init>(r6, r0)
            r2.addUpdateListener(r1)
            X.0Ec2 r2 = r6.LLILZIL
            Y.ALAdapterS0S0101001_5 r1 = new Y.ALAdapterS0S0101001_5
            r0 = 0
            r1.<init>(r7, r6, r3, r0)
            r2.addListener(r1)
            X.0Ec2 r0 = r6.LLILZIL
            r0.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368060Ebs.setDropGroupVisibility(int):void");
    }

    public final void setOnDropClick(Function1<? super String, Unit> function1) {
        this.LL.setOnItemClickCallback(function1);
    }

    public final void setPipDropViewClickable(boolean z) {
        Iterator<C368690Ect> it2 = this.LL.getDropList().iterator();
        while (it2.hasNext()) {
            it2.next().LIZ().setClickable(z);
        }
    }

    public final void setPipTrackVisibility(int i) {
        float f;
        this.LLILLJJLI.animate().cancel();
        if (this.LLILLJJLI.getVisibility() == i) {
            return;
        }
        if (i != 4 && i != 8) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        C368080Ebu c368080Ebu = this.LLILLJJLI;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c368080Ebu);
        c368080Ebu.setAlpha(f);
        C368150Ec1 c368150Ec1 = new C368150Ec1(c368080Ebu);
        c368150Ec1.LIZIZ.cancel();
        c368150Ec1.LJI = 150L;
        c368150Ec1.LJFF = f;
        c368150Ec1.LJII = 150L;
        c368150Ec1.LJIIIIZZ = this.LLILZ;
        c368150Ec1.LJIIIZ = new ALAdapterS0S0101001_5(i, this, f, 1);
        c368150Ec1.LIZ();
    }

    public C368060Ebs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = C13BV.INSTANCE;
        this.LLILZ = new InterpolatorC366870EZx();
        C368160Ec2 c368160Ec2 = new C368160Ec2();
        c368160Ec2.setInterpolator(new InterpolatorC366870EZx());
        c368160Ec2.setDuration(545L);
        this.LLILZIL = c368160Ec2;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dv3, this, true);
        this.LL = (C368420EcS) findViewById(R.id.ga5);
        this.LLILLJJLI = (C368080Ebu) findViewById(R.id.yh0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iLIZJ;
        float f;
        int i3;
        FrameLayout.LayoutParams layoutParams;
        Number numberValueOf;
        int i4;
        FrameLayout.LayoutParams layoutParams2;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            iLIZJ = View.MeasureSpec.getSize(i);
        } else {
            long jMax = 0;
            for (C350030Dnt c350030Dnt : this.LLILLL) {
                if (c350030Dnt.LIZJ == NLETrackType.VIDEO) {
                    Iterator<NLETrackSlot> it2 = c350030Dnt.LIZLLL.iterator();
                    while (it2.hasNext()) {
                        jMax = Math.max(jMax, it2.next().getEndTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                    }
                }
            }
            iLIZJ = (int) ((jMax * C360610EBv.LIZJ()) + C368690Ect.LJIIJ);
        }
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            numberValueOf = Integer.valueOf(View.MeasureSpec.getSize(i2));
        } else {
            if (this.LL.getVisibility() == 8) {
                float f2 = C368080Ebu.LLILZLL;
                ViewGroup.LayoutParams layoutParams3 = this.LLILLJJLI.getLayoutParams();
                if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams3) != null) {
                    i4 = layoutParams2.bottomMargin;
                } else {
                    i4 = 0;
                }
                f = f2 + i4;
            } else {
                f = C368690Ect.LJIIJJI;
                float f3 = C368080Ebu.LLILZLL;
                ViewGroup.LayoutParams layoutParams4 = this.LLILLJJLI.getLayoutParams();
                if ((layoutParams4 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams4) != null) {
                    i3 = layoutParams.bottomMargin;
                } else {
                    i3 = 0;
                }
                float f4 = i3 + f3;
                if (f < f4) {
                    f = f4;
                }
            }
            numberValueOf = Float.valueOf(f);
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, View.MeasureSpec.makeMeasureSpec(iLIZJ, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
        }
        setMeasuredDimension(iLIZJ, numberValueOf.intValue());
    }
}
