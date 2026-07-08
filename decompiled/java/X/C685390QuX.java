package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.nimblecard.model.NimbleJson;

/* JADX INFO: renamed from: X.0QuX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C685390QuX {
    public static final String LIZ(NimbleJson nimbleJson) {
        String strLJIILL = "";
        try {
            C1227904rF.LIZ.getClass();
            Gson gsonLIZLLL = C1227904rF.LIZLLL();
            Object obj = nimbleJson;
            if (nimbleJson == null) {
                obj = "";
            }
            strLJIILL = gsonLIZLLL.LJIILL(obj);
            return strLJIILL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strLJIILL;
        }
    }

    public static final NimbleJson LIZIZ(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            C1227904rF.LIZ.getClass();
            return (NimbleJson) C1227904rF.LIZLLL().LJII(str, NimbleJson.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
