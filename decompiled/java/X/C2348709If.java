package X;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.text.u;

/* JADX INFO: renamed from: X.09If, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2348709If {
    public static void LIZ(Dialog dialog) {
        Object c098200Yq;
        View viewPeekDecorView;
        Object tag;
        Window window;
        try {
            Field declaredField = Dialog.class.getDeclaredField("mWindow");
            boolean z = true;
            declaredField.setAccessible(true);
            Object obj = declaredField.get(dialog);
            String str = null;
            if ((obj instanceof Window) && (window = (Window) obj) != null) {
                viewPeekDecorView = window.peekDecorView();
            } else {
                viewPeekDecorView = null;
            }
            if (viewPeekDecorView != null && (tag = viewPeekDecorView.getTag(R.id.web_client_security)) != null && (tag instanceof String) && (str = (String) tag) != null && str.length() != 0) {
                z = false;
            }
            if ((z || !u.LJJIIJZLJL(str, "Dialog#", false)) && viewPeekDecorView != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Dialog#");
                sbLIZ.append(dialog.getClass().getCanonicalName());
                viewPeekDecorView.setTag(R.id.web_client_security, C2188811AlT.LIZIZ(sbLIZ));
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("error occured. ");
            sbLIZ2.append(C2348209Ia.LIZJ(thM5exceptionOrNullimpl, false));
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }
}
