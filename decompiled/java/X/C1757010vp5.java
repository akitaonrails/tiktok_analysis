package X;

import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.libra.EcSeaPdpOptRevertSwitchSettings;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vp5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1757010vp5 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(ViewGroup viewGroup) {
        try {
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if ((childAt instanceof TextView) && LIZIZ((TextView) childAt)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static boolean LIZIZ(TextView textView) {
        int lineCount;
        try {
            Layout layout = textView.getLayout();
            if (layout == null || (lineCount = layout.getLineCount()) <= 0) {
                return false;
            }
            if (layout.getEllipsisCount(lineCount - 1) <= 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static void LIZJ(C10505048x c10505048x, String str, String str2) {
        if (!EcSeaPdpOptRevertSwitchSettings.LIZIZ.disableTextEllipsizedMonitor) {
            String string = c10505048x.getText().toString();
            if (!a0.LJJJIL(string)) {
                Object tag = c10505048x.getTag(R.id.egw);
                if (!(tag instanceof String)) {
                    tag = null;
                }
                if (!Intrinsics.LJFF(string, tag)) {
                    c10505048x.setTag(R.id.egw, string);
                    C430110Gtl.LIZ(c10505048x, new C1757020vp6(c10505048x, str, str2, string, null));
                }
            }
        }
    }
}
