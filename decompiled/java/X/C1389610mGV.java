package X;

import android.app.Dialog;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mGV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1389610mGV {
    public static final float LIZ() {
        C07XM c07xmInvoke;
        float f = 0.5f;
        try {
            Function0<C07XM> function0 = C07XO.LIZIZ;
            if (function0 != null && (c07xmInvoke = function0.invoke()) != null) {
                f = c07xmInvoke.LIZ;
                return f;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return f;
    }

    public static final void LIZIZ(Dialog dialog) {
        C07XM c07xmInvoke;
        Function0<C07XM> function0 = C07XO.LIZIZ;
        if (function0 != null && (c07xmInvoke = function0.invoke()) != null) {
            float f = c07xmInvoke.LIZ;
            int i = c07xmInvoke.LIZIZ;
            if (dialog != null) {
                try {
                    Window window = dialog.getWindow();
                    if (window != null) {
                        window.addFlags(2);
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        if (attributes != null) {
                            attributes.dimAmount = f;
                        }
                        window.setAttributes(attributes);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("setupReduceTransparency dim=");
                        sbLIZ.append(f);
                        sbLIZ.append(" for ");
                        sbLIZ.append(dialog);
                        C2188811AlT.LIZIZ(sbLIZ);
                        if (Build.VERSION.SDK_INT >= 31 && window.getDecorView() != null && i >= 0) {
                            window.setBackgroundBlurRadius(i);
                            return;
                        }
                        return;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return;
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setupReduceTransparency fail dim=");
            sbLIZ2.append(f);
            sbLIZ2.append(" for ");
            sbLIZ2.append(dialog);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }
}
