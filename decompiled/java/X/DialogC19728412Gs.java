package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.view.View;
import android.view.Window;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.DialogChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.model.InterceptResult;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Gs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class DialogC19728412Gs extends Dialog {
    public static void com_ss_android_ugc_aweme_tux_business_base_GlobalHookDialog_android_app_Dialog_show_super(Dialog dialog, C0WZX c0wzx) throws Throwable {
        Object obj;
        Dialog dialog2 = dialog;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "android/app/Dialog", "show", dialog2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "android/app/Dialog", "show", null, objArr, dialog2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            dialog2 = (Dialog) obj;
        }
        super.show();
        c0wst.LIZ(300000, "android/app/Dialog", "show", null, objArr, dialog2, c0wzw, true);
    }

    @Override // android.app.Dialog
    public void show() {
        com_ss_android_ugc_aweme_tux_business_base_GlobalHookDialog_com_bytedance_tt_reliability_monitor_viewchecker_DialogChecker_show(this);
    }

    public void com_ss_android_ugc_aweme_tux_business_base_GlobalHookDialog__show$___twin___() throws Throwable {
        View decorView;
        com_ss_android_ugc_aweme_tux_business_base_GlobalHookDialog_android_app_Dialog_show_super(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP69e9HMySFbD6Lc58vIbGuWHyp7/eRf35f9Z7KoH+P61aU=", null));
        Window window = getWindow();
        if (window == null || (decorView = window.getDecorView()) == null || decorView.getTag(R.id.yzv) == null) {
            C1766570w4V c1766570w4V = C1766570w4V.LIZ;
            InterfaceC1896407bm interfaceC1896407bm = new InterfaceC1896407bm(this) { // from class: X.07bl
                public final Dialog LIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1896307bl) && Intrinsics.LJFF(this.LIZ, ((C1896307bl) obj).LIZ);
                }

                public final int hashCode() {
                    return this.LIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("DialogData(dialog=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = this;
                }
            };
            c1766570w4V.getClass();
            C1766570w4V.LIZ(interfaceC1896407bm);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        View decorView;
        super.onAttachedToWindow();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "gray_mode", true, false)) {
            Paint paint = new Paint();
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            Window window = getWindow();
            if (window == null || (decorView = window.getDecorView()) == null) {
                return;
            }
            decorView.setLayerType(2, paint);
        }
    }

    public DialogC19728412Gs(Context context) {
        super(context);
    }

    public static void com_ss_android_ugc_aweme_tux_business_base_GlobalHookDialog_com_bytedance_tt_reliability_monitor_viewchecker_DialogChecker_show(DialogC19728412Gs dialogC19728412Gs) throws Throwable {
        try {
            DialogChecker.reportShowMonitorIfNeed(dialogC19728412Gs, null, null);
            if (DialogChecker.enableCheck) {
                InterceptResult interceptResultInterceptDialogShow = DialogChecker.interceptDialogShow(dialogC19728412Gs);
                if (interceptResultInterceptDialogShow.isIntercept()) {
                    DialogChecker.reportInterceptSuccess(dialogC19728412Gs.getClass().getName(), interceptResultInterceptDialogShow);
                    return;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        dialogC19728412Gs.com_ss_android_ugc_aweme_tux_business_base_GlobalHookDialog__show$___twin___();
    }

    public DialogC19728412Gs(Context context, int i) {
        super(context, i);
    }

    public DialogC19728412Gs(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
    }
}
