package X;

import Y.ACListenerS152S0100000_17;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import avg.f;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import mf.a;

/* JADX INFO: renamed from: X.0faI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1132800faI extends ConstraintLayout implements C0T8B {
    public final ImageView LL;
    public final C16F5 LLILLJJLI;
    public final C16F5 LLILLL;
    public final C16F5 LLILZ;
    public final View LLILZIL;
    public final View LLILZLL;
    public ObjectAnimator LLIZ;
    public long LLIZLLLIL;
    public long LLJ;
    public C1132810faJ LLJI;
    public Function1<? super C1132810faJ, Unit> LLJIJIL;
    public boolean LLJILJIL;

    @Override // X.C0T8B
    public final boolean h() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LLJILJIL = false;
        h0(true);
        super.onDetachedFromWindow();
    }

    public final void h0(boolean z) {
        ObjectAnimator objectAnimator = this.LLIZ;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.LLIZ = null;
        if (z) {
            C786410Ut5.Cb(this.LL, 0.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i0(X.C1142020fpA r8) {
        /*
            r7 = this;
            X.0faJ r0 = r7.LLJI
            r2 = 0
            r6 = 1
            if (r0 == 0) goto L13
            boolean r0 = X.C1136700fga.LIZIZ(r0, r8)
            if (r0 == 0) goto L13
            X.0fpM r1 = r8.LIZJ
            X.0fpM r0 = X.EnumC1142140fpM.PLAYING
            if (r1 != r0) goto L13
            r2 = 1
        L13:
            r7.setPlaybackState(r2)
            X.0faJ r2 = r7.LLJI
            java.lang.String r3 = ""
            if (r2 == 0) goto L3c
            boolean r0 = X.C1136700fga.LIZIZ(r2, r8)
            r5 = 2131856471(0x7f118c57, float:1.9346675E38)
            r4 = 2131856470(0x7f118c56, float:1.9346673E38)
            if (r0 != 0) goto L51
            X.16F5 r1 = r7.LLILLJJLI
            java.lang.String r0 = r2.LIZIZ
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            if (r0 == 0) goto L4a
            java.lang.String r0 = X.C497740JfY.LJIJI(r4)
            if (r0 != 0) goto L39
        L38:
            r0 = r3
        L39:
            r1.setText(r0)
        L3c:
            X.0faJ r0 = r7.LLJI
            if (r0 == 0) goto L49
            boolean r0 = X.C1136700fga.LIZIZ(r0, r8)
            if (r0 != 0) goto L8f
            r7.e0(r3, r3)
        L49:
            return
        L4a:
            java.lang.String r0 = X.C497740JfY.LJIJI(r5)
            if (r0 != 0) goto L39
            goto L38
        L51:
            X.16F5 r2 = r7.LLILLJJLI
            X.0fpC r0 = r8.LJIIJ
            int[] r1 = X.C1142030fpB.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            if (r1 == r6) goto L75
            r0 = 2
            if (r1 == r0) goto L84
            r0 = 3
            if (r1 == r0) goto L6e
            r0 = 4
            if (r1 == r0) goto L6e
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L6e:
            java.lang.String r1 = X.C497740JfY.LJIJI(r5)
            if (r1 != 0) goto L8b
            goto L8a
        L75:
            java.lang.String r1 = r8.LJI
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            if (r0 == 0) goto L8b
            java.lang.String r1 = X.C497740JfY.LJIJI(r4)
            if (r1 != 0) goto L8b
            goto L8a
        L84:
            java.lang.String r1 = X.C497740JfY.LJIJI(r4)
            if (r1 != 0) goto L8b
        L8a:
            r1 = r3
        L8b:
            r2.setText(r1)
            goto L3c
        L8f:
            X.0fgr r0 = r8.LIZ
            if (r0 == 0) goto L97
            java.lang.String r1 = r0.LJI
            if (r1 != 0) goto L98
        L97:
            r1 = r3
        L98:
            if (r0 == 0) goto L9f
            java.lang.String r0 = r0.LJII
            if (r0 == 0) goto L9f
            r3 = r0
        L9f:
            r7.e0(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1132800faI.i0(X.0fpA):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090 A[EXC_TOP_SPLITTER, PHI: r3
      0x0090: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v4 java.lang.String) binds: [B:20:0x0059, B:22:0x006b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setData(X.C1132810faJ r9) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1132800faI.setData(X.0faJ):void");
    }

    public final void setOnBannerClickListener(Function1<? super C1132810faJ, Unit> function1) {
        this.LLJIJIL = function1;
        setClickable(true);
    }

    public final void setPlaybackState(boolean z) {
        if (this.LLJILJIL == z) {
            return;
        }
        this.LLJILJIL = z;
        boolean z2 = false;
        if (z) {
            ObjectAnimator objectAnimator = this.LLIZ;
            if (objectAnimator != null && objectAnimator.isStarted()) {
                return;
            }
            ImageView imageView = this.LL;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ROTATION, imageView.getRotation(), this.LL.getRotation() + 360.0f);
            objectAnimatorOfFloat.setDuration(12000L);
            objectAnimatorOfFloat.setRepeatCount(-1);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            C786410Ut5.Pd(objectAnimatorOfFloat);
            this.LLIZ = objectAnimatorOfFloat;
            return;
        }
        C1132810faJ c1132810faJ = this.LLJI;
        if (c1132810faJ != null) {
            C1142070fpF.LIZ.getClass();
            C1142020fpA c1142020fpA = (C1142020fpA) C1142070fpF.LJIILIIL.getValue();
            if (C1136700fga.LIZIZ(c1132810faJ, c1142020fpA) && c1142020fpA.LIZJ == EnumC1142140fpM.PAUSED) {
                z2 = true;
            }
        }
        h0(!z2);
    }

    public C1132800faI(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void e0(String str, String str2) {
        int i;
        int i2;
        int i3;
        boolean z = !a0.LJJJIL(str);
        boolean z2 = !a0.LJJJIL(str2);
        View view = this.LLILZLL;
        int i4 = 0;
        if (!z && !z2) {
            i = 8;
        } else {
            i = 0;
        }
        C786410Ut5.LJLLLLLL(i, view);
        C16F5 c16f5 = this.LLILLL;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, c16f5);
        View view2 = this.LLILZIL;
        if (z && z2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        C786410Ut5.LJLLLLLL(i3, view2);
        C16F5 c16f52 = this.LLILZ;
        if (!z2) {
            i4 = 8;
        }
        C786410Ut5.LJLLLLLL(i4, c16f52);
        this.LLILLL.setText(str);
        this.LLILZ.setText(str2);
    }

    public C1132800faI(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setPaddingRelative(C439101nJ.LIZ(8), 0, C439101nJ.LIZ(12), 0);
        setBackgroundResource(R.drawable.dtf);
        ViewGroup.inflate(context, R.layout.hzi, this);
        this.LL = (ImageView) findViewById(R.id.ovf);
        C16F5 c16f5 = (C16F5) findViewById(R.id.ovi);
        this.LLILLJJLI = c16f5;
        this.LLILLL = (C16F5) findViewById(R.id.ovg);
        this.LLILZ = (C16F5) findViewById(R.id.ovc);
        this.LLILZIL = findViewById(R.id.ove);
        this.LLILZLL = findViewById(R.id.ovh);
        c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), 500, context));
        View.OnClickListener aCListenerS152S0100000_17 = new ACListenerS152S0100000_17(this, 46);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS152S0100000_17) : aCListenerS152S0100000_17);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        setClickable(true);
    }
}
