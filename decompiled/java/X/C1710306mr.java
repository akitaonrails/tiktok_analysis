package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;

/* JADX INFO: renamed from: X.06mr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1710306mr {
    public static final int LIZ(Context context) {
        int iN3 = C786410Ut5.n3(context.getResources(), "navigation_bar_height", "dimen", "android");
        if (iN3 > 0) {
            return context.getResources().getDimensionPixelSize(iN3);
        }
        return 0;
    }

    public static final String LIZIZ(int i, Object... objArr) {
        try {
            return C1383370m6R.LIZ.getString(i, Arrays.copyOf(objArr, objArr.length));
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get string fail: ");
            sbLIZ.append(i);
            C1647306ch.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            return "";
        }
    }

    public static final void LIZJ(TextView textView, CharSequence charSequence) {
        C1360520lVa c1360520lVa = new C1360520lVa();
        c1360520lVa.LIZ.append(charSequence);
        textView.setText(c1360520lVa.LIZ);
    }
}
