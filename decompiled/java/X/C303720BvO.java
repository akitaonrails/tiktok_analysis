package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BvO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C303720BvO extends C09AY implements Function0<String[]> {
    public C303720BvO() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String[] invoke() {
        try {
            SettingsManager.LIZLLL().getClass();
            String[] strArr = (String[]) SettingsManager.LJII("rrq_path_white_list", String[].class);
            return strArr == null ? new String[]{"/aweme/v1/aweme/stats/"} : strArr;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new String[]{"/aweme/v1/aweme/stats/"};
        }
    }
}
