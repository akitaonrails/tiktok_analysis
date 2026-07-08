package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.127o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class DialogC197046127o extends C19GU {
    public SparkPopupSchemaParam LLILZLL;

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        Object obj;
        Window window = getWindow();
        if (window != null) {
            window.setFlags(8, 8);
        }
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mQCv9PFyHMkyqC1a3lHjjAphFW+srA+EfRw21HT0wyPrboxx6xEb+LmyQEQ==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "androidx/appcompat/app/AppCompatDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "androidx/appcompat/app/AppCompatDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
            super.show();
            c0wst.LIZ(300000, "androidx/appcompat/app/AppCompatDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.clearFlags(8);
        }
        SparkPopupSchemaParam sparkPopupSchemaParam = this.LLILZLL;
        if (sparkPopupSchemaParam == null || !sparkPopupSchemaParam.getForceDialogNonCancelable()) {
            return;
        }
        setCancelable(false);
    }

    public final void LJJZ() {
        boolean z;
        SparkPopupSchemaParam sparkPopupSchemaParam;
        Window window;
        View decorView;
        Window window2;
        WindowManager.LayoutParams attributes;
        C1058140dds navigationBarBgColor;
        C1058140dds statusBarBgColor;
        Window window3 = getWindow();
        if (window3 != null) {
            window3.getDecorView().setPadding(0, 0, 0, 0);
            window3.setBackgroundDrawable(new ColorDrawable(0));
            SparkPopupSchemaParam sparkPopupSchemaParam2 = this.LLILZLL;
            int color = (sparkPopupSchemaParam2 == null || (statusBarBgColor = sparkPopupSchemaParam2.getStatusBarBgColor()) == null) ? 0 : statusBarBgColor.getColor(window3.getContext(), "light");
            SparkPopupSchemaParam sparkPopupSchemaParam3 = this.LLILZLL;
            int color2 = (sparkPopupSchemaParam3 == null || (navigationBarBgColor = sparkPopupSchemaParam3.getNavigationBarBgColor()) == null) ? 0 : navigationBarBgColor.getColor(window3.getContext(), "light");
            Activity ownerActivity = getOwnerActivity();
            if (ownerActivity != null && (window2 = ownerActivity.getWindow()) != null && (attributes = window2.getAttributes()) != null) {
                window3.addFlags(attributes.flags);
            }
            Activity ownerActivity2 = getOwnerActivity();
            int systemUiVisibility = (ownerActivity2 == null || (window = ownerActivity2.getWindow()) == null || (decorView = window.getDecorView()) == null) ? 0 : decorView.getSystemUiVisibility();
            window3.setStatusBarColor(color);
            SparkPopupSchemaParam sparkPopupSchemaParam4 = this.LLILZLL;
            if (sparkPopupSchemaParam4 == null || !sparkPopupSchemaParam4.getTransStatusBar()) {
                z = true;
            } else {
                window3.clearFlags(67108864);
                systemUiVisibility |= 1024;
                z = false;
            }
            SparkPopupSchemaParam sparkPopupSchemaParam5 = this.LLILZLL;
            if (Intrinsics.LJFF(sparkPopupSchemaParam5 != null ? sparkPopupSchemaParam5.getStatusFontMode() : null, "light")) {
                systemUiVisibility &= -8193;
            } else {
                SparkPopupSchemaParam sparkPopupSchemaParam6 = this.LLILZLL;
                if (sparkPopupSchemaParam6 != null && sparkPopupSchemaParam6.getStatusFontMode() != null) {
                    systemUiVisibility |= 8192;
                }
            }
            SparkPopupSchemaParam sparkPopupSchemaParam7 = this.LLILZLL;
            if (sparkPopupSchemaParam7 != null && sparkPopupSchemaParam7.getTransNavigationBar()) {
                window3.clearFlags(134217728);
                systemUiVisibility |= 512;
                z = false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 26 && (sparkPopupSchemaParam = this.LLILZLL) != null && sparkPopupSchemaParam.getNavigationFontMode() != null) {
                SparkPopupSchemaParam sparkPopupSchemaParam8 = this.LLILZLL;
                systemUiVisibility = Intrinsics.LJFF(sparkPopupSchemaParam8 != null ? sparkPopupSchemaParam8.getNavigationFontMode() : null, "light") ? systemUiVisibility & (-17) : systemUiVisibility | 16;
                if (i >= 29) {
                    window3.setNavigationBarContrastEnforced(false);
                }
            }
            window3.setNavigationBarColor(color2);
            if (!z) {
                window3.addFlags(Integer.MIN_VALUE);
            }
            View decorView2 = window3.getDecorView();
            if (decorView2 != null) {
                decorView2.setSystemUiVisibility(systemUiVisibility);
            }
            View decorView3 = window3.getDecorView();
            if (decorView3 != null) {
                decorView3.setFitsSystemWindows(z);
            }
            View viewQe = C786410Ut5.qe(window3, R.id.content);
            if (viewQe != null) {
                viewQe.setForeground(null);
            }
        }
    }

    public DialogC197046127o(Context context) {
        super(context, com.zhiliaoapp.musically.R.style.ns);
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public final void setContentView(int i) {
        try {
            C189200o6.m2constructorimpl(Boolean.valueOf(LJJLL(1)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        super.setContentView(i);
        LJJZ();
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public final void setContentView(View view) {
        try {
            C189200o6.m2constructorimpl(Boolean.valueOf(LJJLL(1)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        super.setContentView(view);
        LJJZ();
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        try {
            C189200o6.m2constructorimpl(Boolean.valueOf(LJJLL(1)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        super.setContentView(view, layoutParams);
        LJJZ();
    }
}
