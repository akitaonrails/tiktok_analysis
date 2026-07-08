package X;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vTl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class DialogC1743790vTl extends DialogC1389100mFg {
    public AbstractC1760900vvM LLJILJIL;

    @Override // X.C19EK, android.app.Dialog
    public final void onBackPressed() {
        AbstractC1760900vvM abstractC1760900vvM = this.LLJILJIL;
        if (abstractC1760900vvM != null) {
            abstractC1760900vvM.LIZIZ(new AwS570S0100000_26(this, 1401));
        } else {
            super.onBackPressed();
        }
    }

    public static void LJLIIIL(View view) {
        View view2;
        if (!Intrinsics.LJFF(Build.MODEL, "M2004J19C")) {
            return;
        }
        if (view != null) {
            view.setFitsSystemWindows(false);
        }
        Object parent = null;
        if (view != null) {
            parent = view.getParent();
        }
        if ((parent instanceof ViewGroup) && (view2 = (View) parent) != null) {
            LJLIIIL(view2);
        }
    }

    @Override // X.DialogC1389100mFg, X.C19GU, X.C19EK, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
        }
    }

    @Override // X.DialogC1389100mFg, X.C19GU, X.C19EK, android.app.Dialog
    public final void setContentView(int i) {
        View viewLJLLJ = C786410Ut5.LJLLJ(getContext(), i, null);
        super.setContentView(viewLJLLJ);
        LJLIIIL(viewLJLLJ);
    }

    @Override // X.DialogC1389100mFg, X.C19GU, X.C19EK, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(view);
        LJLIIIL(view);
    }

    public DialogC1743790vTl(Context context, int i) {
        Window window;
        WindowManager.LayoutParams attributes;
        super(context, i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(256);
        }
        if (Build.VERSION.SDK_INT >= 30 && (window = getWindow()) != null && (attributes = window.getAttributes()) != null) {
            attributes.setFitInsetsSides(0);
        }
    }

    @Override // X.DialogC1389100mFg, X.C19GU, X.C19EK, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        LJLIIIL(view);
    }
}
