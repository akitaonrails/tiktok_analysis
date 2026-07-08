package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09rX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2503709rX {
    public static final String LIZ;

    static {
        String strLJI = "https://p16-oec-partner.tiktokcdn-us.com/tos-useast5-i-uhlxaycfue-tx/main.png";
        try {
            SettingsManager.LIZLLL().getClass();
            strLJI = SettingsManager.LJI("ttec_shopping_ranking_image_url", "https://p16-oec-partner.tiktokcdn-us.com/tos-useast5-i-uhlxaycfue-tx/main.png");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        LIZ = strLJI;
    }
}
