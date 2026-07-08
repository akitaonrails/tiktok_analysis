package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.07MM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07MM {
    public static final String[] LIZ = {"576x1024", "720x1280", "720x1280", "720x1280", "480x848", "544x960", "944x1680", "1080x1920"};

    public static final List<String> LIZ() {
        List<String> listLJJLL = null;
        try {
            String[] strArr = (String[]) SettingsManager.LIZLLL().LJIIIIZZ("video_size_category", String[].class, LIZ);
            if (strArr == null) {
                return null;
            }
            listLJJLL = C13LQ.LJJLL(strArr);
            return listLJJLL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return listLJJLL;
        }
    }
}
