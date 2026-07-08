package X;

import android.content.Context;
import android.provider.Settings;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0IYy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C468540IYy {
    public static Pair LIZ() {
        Context context = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context();
        if (context == null) {
            return new Pair(Boolean.FALSE, "context is null");
        }
        try {
            return new Pair(Boolean.valueOf(Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) == 1), "");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Boolean bool = Boolean.FALSE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetch settings error:");
            sbLIZ.append(th.getMessage());
            return new Pair(bool, C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
