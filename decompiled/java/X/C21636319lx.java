package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.19lx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21636319lx {
    public static final int LJIILIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70));
    public final Context LIZ;
    public final View LIZIZ;
    public Dialog LIZJ;
    public final WindowManager LIZLLL;
    public View LJ;
    public final int LJFF;
    public final int LJI;
    public final float LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public Function0<Boolean> LJIIJ;
    public final C01GW LJIIJJI;
    public C21636519lz LJIIL;

    public final void LIZ(Integer num) {
        Window window;
        Dialog dialog;
        Dialog dialog2 = this.LIZJ;
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            int[] iArr = new int[2];
            View view = this.LJ;
            if (view != null) {
                view.getLocationOnScreen(iArr);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.x = iArr[0];
                attributes.y = (((Number) this.LJIIJJI.getValue()).intValue() - iArr[1]) + this.LJIIIIZZ;
                if (num != null) {
                    attributes.height = num.intValue();
                }
                window.setAttributes(attributes);
                if (attributes.height <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))) {
                    Dialog dialog3 = this.LIZJ;
                    if (dialog3 != null) {
                        dialog3.hide();
                    }
                } else if (this.LJIIJ.invoke().booleanValue() && (dialog = this.LIZJ) != null) {
                    C786410Ut5.B4(dialog);
                }
                C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("refreshPos: x = ");
                sbLIZ.append(attributes.x);
                sbLIZ.append(", y = ");
                sbLIZ.append(attributes.y);
                sbLIZ.append(", height = ");
                sbLIZ.append(attributes.height);
                c547140Ld2.LIZ("BlurredWindowHelper", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public final void LIZIZ(boolean z) {
        Window window;
        Dialog dialog = this.LIZJ;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            if (z && Build.VERSION.SDK_INT >= 31) {
                window.setBackgroundBlurRadius(LJIILIIL);
                int i = this.LJI;
                float f = this.LJII;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(i);
                gradientDrawable.setCornerRadius(f);
                window.setBackgroundDrawable(gradientDrawable);
                return;
            }
            View view = this.LIZIZ;
            int i2 = this.LJFF;
            float f2 = this.LJII;
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setColor(i2);
            gradientDrawable2.setCornerRadius(f2);
            view.setBackground(gradientDrawable2);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public C21636319lx(Context context, View view) {
        int iIntValue;
        int iIntValue2;
        this.LIZ = context;
        this.LIZIZ = view;
        this.LIZLLL = (WindowManager) context.getSystemService(WindowManager.class);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LJFF = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 570425343;
        }
        this.LJI = iIntValue2;
        this.LJII = C418440Gaw.LIZIZ(26);
        this.LJIIIZ = true;
        this.LJIIJ = AFwS194S0000000_8.get$arr$(515);
        this.LJIIJJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4108));
    }
}
