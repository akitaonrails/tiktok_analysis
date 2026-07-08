package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commerce.BizAccount;

/* JADX INFO: renamed from: X.0XEE, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XEE {
    public static final BizAccount LIZ() {
        try {
            return (BizAccount) SettingsManager.LIZLLL().LJIIIIZZ("biz_account", BizAccount.class, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return null;
        }
    }
}
