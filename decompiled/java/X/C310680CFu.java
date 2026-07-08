package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.setting.DMInsertUnreadMUFConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CFu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C310680CFu extends C09AY implements Function0<DMInsertUnreadMUFConfig> {
    public C310680CFu() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final DMInsertUnreadMUFConfig invoke() {
        DMInsertUnreadMUFConfig dMInsertUnreadMUFConfig;
        try {
            DMInsertUnreadMUFConfig dMInsertUnreadMUFConfig2 = (DMInsertUnreadMUFConfig) SettingsManager.LIZLLL().LJIIIIZZ("im_inbox_unread_chats_raising", DMInsertUnreadMUFConfig.class, C310690CFv.LIZ);
            C189200o6.m2constructorimpl(dMInsertUnreadMUFConfig2);
            dMInsertUnreadMUFConfig = dMInsertUnreadMUFConfig2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            dMInsertUnreadMUFConfig = c098200Yq;
        }
        return (C189200o6.m7isFailureimpl(dMInsertUnreadMUFConfig) || dMInsertUnreadMUFConfig == 0) ? C310690CFv.LIZ : dMInsertUnreadMUFConfig;
    }
}
