package X;

import Y.ACListenerS116S0200000_12;
import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UgA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class DialogC778400UgA extends C19GI {
    public final Context LLIZLLLIL;
    public final View LLJ;
    public TextView LLJI;
    public TextView LLJIJIL;
    public TextView LLJILJIL;
    public TextView LLJILJILJ;
    public LinearLayout LLJILLL;
    public TextView LLJJ;
    public TextView LLJJI;
    public InterfaceC774350UZd LLJJIII;
    public InterfaceC774360UZe LLJJIJI;

    @Override // X.C19GI
    public final boolean LJJZ() {
        return false;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        InterfaceC774350UZd interfaceC774350UZd = this.LLJJIII;
        if (interfaceC774350UZd != null) {
            interfaceC774350UZd.onBackPressed();
        }
        super.onBackPressed();
    }

    @Override // X.C19GI, X.DialogC19728412Gs, android.app.Dialog
    public final void show() {
        Object obj;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt/cZ1hsjSnQBuoOxM48cLaA==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/bytedance/android/live/design/app/LiveControllableDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/bytedance/android/live/design/app/LiveControllableDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            C19GI c19gi = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (C19GI) obj;
            super.show();
            c0wst.LIZ(300000, "com/bytedance/android/live/design/app/LiveControllableDialog", "show", null, objArr, c19gi, c0wzw, true);
        }
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = (int) this.LLIZLLLIL.getResources().getDimension(R.dimen.ayb);
            layoutParams.height = -2;
            window.setAttributes(layoutParams);
        }
    }

    @Override // X.C19GI, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
    }

    public DialogC778400UgA(Context context) {
        super(context, R.style.aje);
        this.LLIZLLLIL = context;
        View viewSd = C786410Ut5.Sd(R.layout.ga9, C786410Ut5.ne(getContext()), null);
        this.LLJ = viewSd;
        setContentView(viewSd);
        LJJZZIII(1);
    }

    public final void LJJZZI(View.OnClickListener onClickListener) {
        C786410Ut5.T7(this.LLJILJIL, onClickListener);
    }

    public final void LJJZZIII(int i) {
        this.LLJ.findViewById(R.id.yaq);
        this.LLJ.findViewById(R.id.yao);
        this.LLJ.findViewById(R.id.y_a);
        this.LLJI = (TextView) this.LLJ.findViewById(R.id.tqb);
        this.LLJIJIL = (TextView) this.LLJ.findViewById(R.id.tqa);
        this.LLJILJIL = (TextView) this.LLJ.findViewById(R.id.tq7);
        this.LLJILJILJ = (TextView) this.LLJ.findViewById(R.id.tq6);
        this.LLJILLL = (LinearLayout) this.LLJ.findViewById(R.id.tq8);
        this.LLJJ = (TextView) this.LLJ.findViewById(R.id.tq9);
        this.LLJJI = (TextView) this.LLJ.findViewById(R.id.tq_);
        if (i == 1) {
            C786410Ut5.LLIL(this.LLJILJIL, 0);
            C786410Ut5.LJZL(8, this.LLJILLL);
        } else {
            if (i != 2) {
                return;
            }
            C786410Ut5.LLIL(this.LLJILJIL, 8);
            C786410Ut5.LJZL(0, this.LLJILLL);
        }
    }

    public final void LJL(View.OnClickListener onClickListener) {
        C786410Ut5.LLIL(this.LLJILJILJ, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r1 = r6.getAction()
            r0 = 1
            if (r0 != r1) goto L4f
            android.content.Context r1 = r5.getContext()
            float r0 = r6.getX()
            int r4 = (int) r0
            float r0 = r6.getY()
            int r3 = (int) r0
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r1)
            int r2 = r0.getScaledWindowTouchSlop()
            android.view.Window r0 = r5.getWindow()
            if (r0 == 0) goto L48
            android.view.Window r0 = r5.getWindow()
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L48
            android.view.Window r0 = r5.getWindow()
            android.view.View r1 = r0.getDecorView()
            int r0 = -r2
            if (r4 < r0) goto L48
            if (r3 < r0) goto L48
            int r0 = r1.getWidth()
            int r0 = r0 + r2
            if (r4 > r0) goto L48
            int r0 = r1.getHeight()
            int r0 = r0 + r2
            if (r3 <= r0) goto L4f
        L48:
            X.0UZe r0 = r5.LLJJIJI
            if (r0 == 0) goto L4f
            r0.LIZ()
        L4f:
            boolean r0 = super.onTouchEvent(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC778400UgA.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public DialogC778400UgA(Context context, C778420UgC c778420UgC) {
        super(context, R.style.aje);
        this.LLIZLLLIL = context;
        int i = c778420UgC.LIZJ;
        View viewSd = C786410Ut5.Sd(i <= 0 ? R.layout.ga9 : i, C786410Ut5.ne(getContext()), null);
        this.LLJ = viewSd;
        setContentView(viewSd);
        LJJZZIII(c778420UgC.LIZIZ);
        this.LLJI.setText(c778420UgC.LIZLLL);
        this.LLJIJIL.setText(c778420UgC.LJ);
        if (TextUtils.isEmpty(c778420UgC.LJ)) {
            C786410Ut5.LLIL(this.LLJIJIL, 8);
        } else {
            C786410Ut5.LLIL(this.LLJIJIL, 0);
        }
        int i2 = c778420UgC.LIZIZ;
        if (i2 == 1) {
            C786410Ut5.LLIL(this.LLJILJIL, 0);
            C786410Ut5.LJZL(8, this.LLJILLL);
            this.LLJILJIL.setText(c778420UgC.LJFF);
            Drawable drawable = c778420UgC.LJI;
            if (drawable != null) {
                this.LLJILJIL.setBackground(drawable);
            }
            C786410Ut5.T7(this.LLJILJIL, new ACListenerS116S0200000_12(c778420UgC, this, 28));
        } else if (i2 == 2) {
            C786410Ut5.LLIL(this.LLJILJIL, 8);
            C786410Ut5.LJZL(0, this.LLJILLL);
            this.LLJJ.setText((CharSequence) null);
            this.LLJJI.setText((CharSequence) null);
            C786410Ut5.T7(this.LLJJ, new ACListenerS147S0100000_12(this, c778420UgC, 178));
            C786410Ut5.T7(this.LLJJI, new ACListenerS147S0100000_12(this, c778420UgC, 179));
        }
        if (!TextUtils.isEmpty(null)) {
            C786410Ut5.LLIL(this.LLJILJILJ, 0);
            this.LLJILJILJ.setText((CharSequence) null);
            C786410Ut5.T7(this.LLJILJILJ, null);
        }
        setCanceledOnTouchOutside(c778420UgC.LJIIIIZZ);
        setCancelable(c778420UgC.LJIIIZ);
        setOnCancelListener(null);
        setOnDismissListener(null);
        setOnShowListener(null);
    }
}
