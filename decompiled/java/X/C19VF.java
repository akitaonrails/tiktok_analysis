package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuPresenter;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: renamed from: X.19VF, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C19VF extends ViewGroup {
    public final C19VT LL;
    public final Context LLILLJJLI;
    public C19VD LLILLL;
    public ActionMenuPresenter LLILZ;
    public int LLILZIL;
    public C19WF LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;

    public int getAnimatedVisibility() {
        return this.LLILZLL != null ? this.LL.LIZIZ : getVisibility();
    }

    public int getContentHeight() {
        return this.LLILZIL;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.ActionBar, R.attr.b82, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(R$styleable.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.LLILZ;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.LLJJIII = new C18K0(actionMenuPresenter.LLILLJJLI).LIZ();
            C19V6 c19v6 = actionMenuPresenter.LLILLL;
            if (c19v6 != null) {
                c19v6.LJIILL(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHoverEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r4 = r6.getActionMasked()
            r3 = 0
            r2 = 9
            if (r4 != r2) goto Lb
            r5.LLIZLLLIL = r3
        Lb:
            boolean r0 = r5.LLIZLLLIL
            r1 = 1
            if (r0 != 0) goto L1b
            boolean r0 = super.onHoverEvent(r6)
            if (r4 != r2) goto L1b
            if (r0 != 0) goto L1a
            r5.LLIZLLLIL = r1
        L1a:
            return r1
        L1b:
            r0 = 10
            if (r4 == r0) goto L22
            r0 = 3
            if (r4 != r0) goto L1a
        L22:
            r5.LLIZLLLIL = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19VF.onHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r3 = r5.getActionMasked()
            r2 = 0
            if (r3 != 0) goto L9
            r4.LLIZ = r2
        L9:
            boolean r0 = r4.LLIZ
            r1 = 1
            if (r0 != 0) goto L19
            boolean r0 = super.onTouchEvent(r5)
            if (r3 != 0) goto L19
            if (r0 != 0) goto L18
            r4.LLIZ = r1
        L18:
            return r1
        L19:
            if (r3 == r1) goto L1e
            r0 = 3
            if (r3 != r0) goto L18
        L1e:
            r4.LLIZ = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19VF.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setContentHeight(int i) {
        this.LLILZIL = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C19WF c19wf = this.LLILZLL;
            if (c19wf != null) {
                c19wf.LIZIZ();
            }
            super.setVisibility(i);
        }
    }

    public C19VF(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final C19WF LJ(int i, long j) {
        C19WF c19wf = this.LLILZLL;
        if (c19wf != null) {
            c19wf.LIZIZ();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                setAlpha(0.0f);
            }
            C19WF c19wfLIZIZ = q0.LIZIZ(this);
            c19wfLIZIZ.LIZ(1.0f);
            c19wfLIZIZ.LIZJ(j);
            C19VT c19vt = this.LL;
            c19vt.LIZJ.LLILZLL = c19wfLIZIZ;
            c19vt.LIZIZ = i;
            c19wfLIZIZ.LJ(c19vt);
            return c19wfLIZIZ;
        }
        C19WF c19wfLIZIZ2 = q0.LIZIZ(this);
        c19wfLIZIZ2.LIZ(0.0f);
        c19wfLIZIZ2.LIZJ(j);
        C19VT c19vt2 = this.LL;
        c19vt2.LIZJ.LLILZLL = c19wfLIZIZ2;
        c19vt2.LIZIZ = i;
        c19wfLIZIZ2.LJ(c19vt2);
        return c19wfLIZIZ2;
    }

    public C19VF(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new C19VT(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.b7z, typedValue, true) && typedValue.resourceId != 0) {
            this.LLILLJJLI = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.LLILLJJLI = context;
        }
    }

    public static int LIZJ(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int LIZLLL(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
            return -measuredWidth;
        }
        view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        return measuredWidth;
    }
}
