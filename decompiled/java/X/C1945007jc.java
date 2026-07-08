package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07jc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1945007jc {
    public static final String[] LIZ;
    public static final String[] LIZIZ;

    static {
        String[] strArr;
        String[] strArr2 = {"surl", "fallback_url"};
        LIZ = strArr2;
        try {
            strArr = (String[]) SettingsManager.LIZLLL().LJIIIIZZ("lynxview_command_blacklist", String[].class, strArr2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strArr = LIZ;
        }
        LIZIZ = strArr;
    }
}
