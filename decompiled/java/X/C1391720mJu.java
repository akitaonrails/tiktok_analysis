package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mJu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1391720mJu extends FrameLayout {
    public final C1391750mJx LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public EnumC1235690iGF LLILZ;
    public boolean LLILZIL;
    public final int LLILZLL;
    public final C19751612Pq LLIZ;

    public final void LIZLLL() {
        if (!this.LLILZIL) {
            C426750GoL.LJIIJJI(this, 0, 0, 0, 0, false);
            return;
        }
        int i = C1235700iGG.LIZ[this.LLILZ.ordinal()];
        if (i == 1) {
            C426750GoL.LJIIJJI(this, 0, 0, 0, Integer.valueOf(this.LLILLL), false);
            return;
        }
        if (i == 2) {
            C426750GoL.LJIIJJI(this, 0, Integer.valueOf(this.LLILLL), 0, 0, false);
        } else if (i == 3) {
            C426750GoL.LJIIJJI(this, 0, 0, Integer.valueOf(this.LLILLL), 0, false);
        } else {
            if (i != 4) {
                throw new C1954807lC();
            }
            C426750GoL.LJIIJJI(this, Integer.valueOf(this.LLILLL), 0, 0, 0, false);
        }
    }

    public final void LIZJ() {
        if (!this.LLILZIL) {
            setMinimumWidth(this.LLILZLL);
            setMinimumHeight(this.LLILZLL);
            return;
        }
        int i = C1235700iGG.LIZ[this.LLILZ.ordinal()];
        if (i == 1 || i == 2) {
            setMinimumWidth(this.LLILZLL);
            setMinimumHeight(this.LLILZLL + this.LLILLL);
        } else {
            setMinimumWidth(this.LLILZLL + this.LLILLL);
            setMinimumHeight(this.LLILZLL);
        }
    }

    public final void LIZ(boolean z) {
        if (z) {
            C1391750mJx c1391750mJx = this.LL;
            c1391750mJx.LJFF.setColor(this.LLILLJJLI);
        } else {
            this.LL.LJFF.setColor(-1);
        }
        C1391750mJx c1391750mJx2 = this.LL;
        if (!Intrinsics.LJFF(c1391750mJx2.LIZ.LIZIZ, Boolean.valueOf(z))) {
            c1391750mJx2.LIZ.LIZIZ = Boolean.valueOf(z);
            c1391750mJx2.LIZ.LIZ();
        }
    }

    public final void LIZIZ(boolean z) {
        this.LLILZIL = z;
        if (z) {
            C1391750mJx c1391750mJx = this.LL;
            C19751612Pq c19751612Pq = this.LLIZ;
            if (!Intrinsics.LJFF(c1391750mJx.LJIIJJI, c19751612Pq)) {
                c1391750mJx.LJIIJJI = c19751612Pq;
                c1391750mJx.LIZ.LIZ();
            }
        } else {
            C1391750mJx c1391750mJx2 = this.LL;
            if (!Intrinsics.LJFF(c1391750mJx2.LJIIJJI, null)) {
                c1391750mJx2.LJIIJJI = null;
                c1391750mJx2.LIZ.LIZ();
            }
        }
        C1391750mJx c1391750mJx3 = this.LL;
        if (!Intrinsics.LJFF(c1391750mJx3.LIZ.LIZJ, Boolean.valueOf(z))) {
            c1391750mJx3.LIZ.LIZJ = Boolean.valueOf(z);
            c1391750mJx3.LIZ.LIZ();
        }
        LIZLLL();
        LIZJ();
    }

    public final void setAx(int i) {
        C1391730mJv c1391730mJv = this.LL.LIZ;
        float f = i;
        if (c1391730mJv.LIZLLL != f) {
            c1391730mJv.LIZLLL = f;
            c1391730mJv.LIZ();
        }
    }

    public final void setAy(int i) {
        C1391730mJv c1391730mJv = this.LL.LIZ;
        float f = i;
        if (c1391730mJv.LJ != f) {
            c1391730mJv.LJ = f;
            c1391730mJv.LIZ();
        }
    }

    public final void setColor(int i) {
        this.LL.LJ.setColor(i);
    }

    public final void setContentView(View view) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        C786410Ut5.W5(view, new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view);
    }

    public final void setPosition(EnumC1235690iGF enumC1235690iGF) {
        this.LLILZ = enumC1235690iGF;
        C1391730mJv c1391730mJv = this.LL.LIZ;
        if (c1391730mJv.LIZ != enumC1235690iGF) {
            c1391730mJv.LIZ = enumC1235690iGF;
            c1391730mJv.LIZ();
        }
        LIZLLL();
        LIZJ();
    }

    public C1391720mJu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.z6);
        C1391750mJx c1391750mJx = new C1391750mJx(new C1391730mJv());
        this.LL = c1391750mJx;
        this.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.TOP;
        this.LLILZ = enumC1235690iGF;
        this.LLILZIL = true;
        this.LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        C19659111vp c19659111vp = new C19659111vp();
        c19659111vp.LIZ = C418440Gaw.LIZIZ(12);
        c19659111vp.LIZLLL = C418440Gaw.LIZIZ(12);
        int[] iArr = R$styleable.TuxTooltip;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.z6, 0);
        c19659111vp.LJFF = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTooltip__tux_tooltipShadow, 0));
        typedArrayObtainStyledAttributes.recycle();
        C19751612Pq c19751612PqLIZ = c19659111vp.LIZ(context);
        C19659111vp c19659111vp2 = new C19659111vp();
        c19659111vp2.LIZ = C418440Gaw.LIZIZ(6);
        c19659111vp2.LIZLLL = C418440Gaw.LIZIZ(12);
        c19659111vp2.LJFF = Integer.valueOf(ColorProtector.parseColor("#1F000000"));
        C19751612Pq c19751612PqLIZ2 = c19659111vp2.LIZ(context);
        this.LLIZ = c19751612PqLIZ2;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, R.attr.z6, 0);
        int color = typedArrayObtainStyledAttributes2.getColor(R$styleable.TuxTooltip__tux_tooltipMessageBgColor, 0);
        this.LLILLJJLI = typedArrayObtainStyledAttributes2.getColor(R$styleable.TuxTooltip__tux_tooltipStrokeColor, 0);
        typedArrayObtainStyledAttributes2.recycle();
        c1391750mJx.LJ.setColor(color);
        setPosition(enumC1235690iGF);
        LIZ(false);
        if (!Intrinsics.LJFF(c1391750mJx.LJIIJJI, c19751612PqLIZ2)) {
            c1391750mJx.LJIIJJI = c19751612PqLIZ2;
            c1391750mJx.LIZ.LIZ();
        }
        if (!Intrinsics.LJFF(c1391750mJx.LJIIL, c19751612PqLIZ)) {
            c1391750mJx.LJIIL = c19751612PqLIZ;
            c1391750mJx.LIZ.LIZ();
        }
        LIZIZ(this.LLILZIL);
        setBackground(c1391750mJx);
        LIZLLL();
    }
}
