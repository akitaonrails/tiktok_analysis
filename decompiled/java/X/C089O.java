package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.089O, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C089O {
    public static volatile C089O LIZIZ;
    public final Map<String, Integer> LIZ = new HashMap();

    public final Uri LIZ(Context context, String str) {
        int iN3;
        if (str != null && !str.isEmpty()) {
            String strReplace = str.toLowerCase().replace("-", "_");
            try {
                iN3 = CastIntegerProtector.parseInt(strReplace);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                synchronized (this) {
                    try {
                        if (((HashMap) this.LIZ).containsKey(strReplace)) {
                            iN3 = ((Integer) ((HashMap) this.LIZ).get(strReplace)).intValue();
                        } else {
                            iN3 = C786410Ut5.n3(context.getResources(), strReplace, "drawable", context.getPackageName());
                            ((HashMap) this.LIZ).put(strReplace, Integer.valueOf(iN3));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        } else {
            iN3 = 0;
        }
        if (iN3 > 0) {
            return new Uri.Builder().scheme("res").path(String.valueOf(iN3)).build();
        }
        return Uri.EMPTY;
    }
}
