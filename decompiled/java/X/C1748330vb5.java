package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vb5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1748330vb5 extends FrameLayout {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final C1748340vb6 LLIZ;
    public final FrameLayout LLIZLLLIL;
    public TuxIconView LLJ;
    public final TuxTextView LLJI;
    public final TuxTextView LLJIJIL;
    public InterfaceC1722750uvp LLJILJIL;
    public InterfaceC1719620uqm LLJILJILJ;
    public boolean LLJILLL;
    public C0VRM LLJJ;
    public int LLJJI;
    public int LLJJIII;

    public C1748330vb5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZ() {
        String strLIZIZ;
        if (this.LLJIJIL.getVisibility() != 0) {
            this.LLJIJIL.setText((CharSequence) null);
            return;
        }
        TuxTextView tuxTextView = this.LLJIJIL;
        int i = C0VRN.LIZ[this.LLJJ.ordinal()];
        if (i == 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLJJI);
            sbLIZ.append('/');
            sbLIZ.append(this.LLJJIII);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            if (i != 2) {
                throw new C1954807lC();
            }
            strLIZIZ = String.valueOf(this.LLJJI);
        }
        tuxTextView.setText(strLIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r3 = this;
            X.0uvp r0 = r3.LLJILJIL
            r2 = 0
            if (r0 == 0) goto L14
            com.bytedance.tux.input.TuxTextView r0 = r3.LLJI
            java.lang.CharSequence r0 = r0.getText()
            r1 = 1
            if (r0 == 0) goto L14
            int r0 = r0.length()
            if (r0 != 0) goto L15
        L14:
            r1 = 0
        L15:
            android.widget.FrameLayout r0 = r3.LLIZLLLIL
            if (r1 != 0) goto L1b
            r2 = 8
        L1b:
            X.C786410Ut5.LJLLLLLL(r2, r0)
            if (r1 == 0) goto L46
            com.bytedance.tux.icon.TuxIconView r2 = r3.LLJ
            if (r2 == 0) goto L46
            X.0uvp r1 = r3.LLJILJIL
            X.03ov r0 = X.C958703ov.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L3d
            X.0uqm r1 = r3.LLJILJILJ
            X.0DNo r0 = X.C338180DNo.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L47
            int r0 = r3.LLILLJJLI
        L3a:
            r2.setIconRes(r0)
        L3d:
            com.bytedance.tux.input.TuxTextView r0 = r3.LLJI
            int r0 = r0.getCurrentTextColor()
            r2.setTintColor(r0)
        L46:
            return
        L47:
            int r0 = r3.LLILZ
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1748330vb5.LIZIZ():void");
    }

    private final void setCustomMessageIcon(View view) {
        this.LLJ = null;
        C786410Ut5.LJJJJIZL(this.LLIZLLLIL);
        if (view != null) {
            this.LLIZLLLIL.addView(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setMessageIconRes(int i) {
        TuxIconView tuxIconView = this.LLJ;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(i);
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        TuxIconView tuxIconView2 = new TuxIconView(getContext(), null, 0, 6, null == true ? 1 : 0);
        C786410Ut5.M6(tuxIconView2, new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LIZIZ = iLIZIZ;
        c419910GdJ.LIZJ = iLIZIZ;
        tuxIconView2.setTuxIcon(c419910GdJ);
        this.LLJ = tuxIconView2;
        C786410Ut5.LJJJJIZL(this.LLIZLLLIL);
        this.LLIZLLLIL.addView(tuxIconView2);
    }

    public final void setCounterStyle(InterfaceC1748380vbA interfaceC1748380vbA) {
        int i;
        if (Intrinsics.LJFF(interfaceC1748380vbA, C1748400vbC.LIZ)) {
            i = this.LLILZIL;
        } else if (Intrinsics.LJFF(interfaceC1748380vbA, C1748390vbB.LIZ)) {
            i = this.LLILZLL;
        } else if (interfaceC1748380vbA instanceof C1748430vbF) {
            interfaceC1748380vbA.getClass();
            i = 0;
        } else {
            throw new C1954807lC();
        }
        this.LLJIJIL.setTextColor(i);
    }

    public final void setCounterVariant(C0VRM c0vrm) {
        this.LLJJ = c0vrm;
        LIZ();
    }

    public final void setFadeInMessage(boolean z) {
        this.LLJILLL = z;
        this.LLIZ.setFadeInOut(z);
    }

    public final void setHasCounter(boolean z) {
        int i;
        TuxTextView tuxTextView = this.LLJIJIL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, tuxTextView);
        LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setMessage(java.lang.CharSequence r8) {
        /*
            r7 = this;
            com.bytedance.tux.input.TuxTextView r0 = r7.LLJI
            java.lang.CharSequence r0 = r0.getText()
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L79
            int r0 = r0.length()
            if (r0 == 0) goto L79
            r0 = 0
        L11:
            r4 = r0 ^ 1
            if (r8 == 0) goto L77
            int r0 = r8.length()
            if (r0 == 0) goto L77
            r0 = 0
        L1c:
            r3 = r0 ^ 1
            com.bytedance.tux.input.TuxTextView r0 = r7.LLJI
            r0.setText(r8)
            com.bytedance.tux.input.TuxTextView r1 = r7.LLJI
            if (r3 == 0) goto L74
            r0 = 0
        L28:
            X.C786410Ut5.LJLLLLLL(r0, r1)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r4 != 0) goto L57
            if (r3 == 0) goto L59
            boolean r0 = r7.LLJILLL
            if (r0 == 0) goto L42
            X.0vb6 r1 = r7.LLIZ
            android.animation.ValueAnimator r0 = r1.LLIZ
            r0.start()
            r1.LLILZ = r5
        L3e:
            r7.LIZIZ()
            return
        L42:
            X.0vb6 r1 = r7.LLIZ
            android.animation.ValueAnimator r0 = r1.LLIZ
            r0.cancel()
            r1.LLILZ = r5
            r1.LL = r2
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r1)
            r1.setAlpha(r2)
            r1.requestLayout()
            goto L3e
        L57:
            if (r3 != 0) goto L3e
        L59:
            X.0vb6 r1 = r7.LLIZ
            android.animation.ValueAnimator r0 = r1.LLIZ
            r0.cancel()
            r1.LLILZ = r6
            r0 = 0
            r1.LL = r0
            boolean r0 = r1.LLILZLL
            if (r0 == 0) goto L6a
            r2 = 0
        L6a:
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r1)
            r1.setAlpha(r2)
            r1.requestLayout()
            goto L3e
        L74:
            r0 = 8
            goto L28
        L77:
            r0 = 1
            goto L1c
        L79:
            r0 = 1
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1748330vb5.setMessage(java.lang.CharSequence):void");
    }

    public final void setMessageIcon(InterfaceC1722750uvp interfaceC1722750uvp) {
        this.LLJILJIL = interfaceC1722750uvp;
        if (interfaceC1722750uvp == null) {
            this.LLJ = null;
            C786410Ut5.LJJJJIZL(this.LLIZLLLIL);
        } else if (Intrinsics.LJFF(interfaceC1722750uvp, C958703ov.LIZ)) {
            setMessageIconRes(this.LLILLJJLI);
        } else if (interfaceC1722750uvp instanceof C338170DNn) {
            setMessageIconRes(((C338170DNn) interfaceC1722750uvp).LIZ);
        } else if (interfaceC1722750uvp instanceof C1722760uvq) {
            setCustomMessageIcon(null);
        } else {
            throw new C1954807lC();
        }
        LIZIZ();
    }

    public final void setMessageStyle(InterfaceC1719620uqm interfaceC1719620uqm) {
        int i;
        this.LLJILJILJ = interfaceC1719620uqm;
        if (Intrinsics.LJFF(interfaceC1719620uqm, C338180DNo.LIZ)) {
            i = this.LL;
        } else if (Intrinsics.LJFF(interfaceC1719620uqm, C1719580uqi.LIZ)) {
            i = this.LLILLL;
        } else if (interfaceC1719620uqm instanceof C1719630uqn) {
            interfaceC1719620uqm.getClass();
            i = 0;
        } else {
            throw new C1954807lC();
        }
        this.LLJI.setTextColor(i);
        LIZIZ();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1748330vb5(Context context, AttributeSet attributeSet, int i) {
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.xw;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        C338180DNo c338180DNo = C338180DNo.LIZ;
        this.LLJILJILJ = c338180DNo;
        this.LLJJ = C0VRM.CONTRAST;
        FrameLayout.inflate(context, R.layout.g4, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxFieldFooter, i2, 0);
        this.LL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxFieldFooter__tux_fieldFooterMessageErrorColor, 0);
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxFieldFooter__tux_fieldFooterMessageErrorIcon, 0);
        this.LLILLL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxFieldFooter__tux_fieldFooterMessageInfoColor, 0);
        this.LLILZ = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxFieldFooter__tux_fieldFooterMessageInfoIcon, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxFieldFooter__tux_fieldFooterMessageFont, 0);
        this.LLILZIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxFieldFooter__tux_fieldFooterCounterNormalColor, 0);
        this.LLILZLL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxFieldFooter__tux_fieldFooterCounterErrorColor, 0);
        int i4 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxFieldFooter__tux_fieldFooterCounterFont, 0);
        typedArrayObtainStyledAttributes.recycle();
        C1748340vb6 c1748340vb6 = (C1748340vb6) findViewById(R.id.hwn);
        c1748340vb6.setHasOverlappingRendering(false);
        c1748340vb6.setAnimationDuration(100L);
        c1748340vb6.setAnimationInterpolator(C1619980sG4.LJIILIIL());
        this.LLIZ = c1748340vb6;
        this.LLIZLLLIL = (FrameLayout) findViewById(R.id.hwo);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.hwp);
        tuxTextView.setTuxFont(i3);
        tuxTextView.setAccessibilityLiveRegion(1);
        this.LLJI = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.hwm);
        tuxTextView2.setTuxFont(i4);
        tuxTextView2.setTextDirection(5);
        this.LLJIJIL = tuxTextView2;
        setMessageStyle(c338180DNo);
        setCounterStyle(C1748400vbC.LIZ);
    }
}
