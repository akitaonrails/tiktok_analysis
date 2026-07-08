package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1188, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1188 extends DialogC19728412Gs {
    public View LL;
    public View.OnClickListener LLILLJJLI;
    public final View LLILLL;
    public final C12YD LLILZ;

    public final void LJJLIIIJLLLLLLLZ() {
        View view = this.LL;
        if (view == null || view.getVisibility() != 0) {
            C786410Ut5.LJLLLLLL(8, this.LLILLL);
            return;
        }
        C786410Ut5.LJLLLLLL(0, this.LLILLL);
        View view2 = this.LL;
        if (view2 != null) {
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            Window window = getWindow();
            layoutParams.copyFrom(window != null ? window.getAttributes() : null);
            layoutParams.x = iArr[0];
            layoutParams.y = iArr[1] - ScreenUtils.getStatusBarHeight(getContext());
            layoutParams.width = view2.getMeasuredWidth();
            layoutParams.height = view2.getMeasuredHeight();
            layoutParams.gravity = 8388659;
            layoutParams.flags = 40;
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setAttributes(layoutParams);
            }
        }
    }

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        Object obj;
        LJJLIIIJLLLLLLLZ();
        View view = this.LL;
        if (view != null) {
            view.addOnLayoutChangeListener(this.LLILZ);
        }
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yD0EJ4beGbBtQ9pEd6MSGbtBLdTsrdFCoCBjIwxxLU1WoPUtl8VpeOeBVb5BjqkmsLttRzEqLCNU18eGqjOVsSBmYy6MohW", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, this, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
        super.show();
        c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        View view = this.LL;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.LLILZ);
        }
    }

    public AnonymousClass1188(Context context) {
        super(context, R.style.aeq);
        View view = new View(context);
        C786410Ut5.I7(new ACListenerS163S0100000_29(this, 143), view);
        this.LLILLL = view;
        this.LLILZ = new C12YD(this, 4);
        setContentView(view);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setFlags(40, 40);
        }
    }
}
