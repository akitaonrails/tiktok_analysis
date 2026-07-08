package X;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0SVC, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SVC {
    public static final C0SVC LIZ = new C0SVC();

    public static int LIZ(int i, Context context) {
        C1361400lX0 c1361400lX0 = new C1361400lX0(context, R.style.jf);
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        if (abstractC1896090zRP != null) {
            return abstractC1896090zRP.LJIIL(i, c1361400lX0);
        }
        return -1;
    }

    public static int LIZIZ(C0SVC c0svc, String str) {
        if (str != null) {
            if (!u.LJJIIJZLJL(str, "#", false)) {
                try {
                    return CastIntegerProtector.parseInt(str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return -1;
                }
            }
            try {
                return Color.parseColor(str);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return -1;
            }
        }
        return -1;
    }
}
