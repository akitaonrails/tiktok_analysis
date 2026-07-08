package X;

import com.bytedance.im.core.client.configs.SessionScopeConfig;

/* JADX INFO: renamed from: X.0YHJ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YHJ {
    public static final SessionScopeConfig LIZ = new SessionScopeConfig(false, false, false, false, false, 0);

    public static SessionScopeConfig LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        SessionScopeConfig sessionScopeConfig = LIZ;
        SessionScopeConfig sessionScopeConfig2 = (SessionScopeConfig) c0c64LJIILLIIL.LJJII(SessionScopeConfig.class, sessionScopeConfig, "imsdk_session_scope_refactor", true);
        return sessionScopeConfig2 != null ? sessionScopeConfig2 : sessionScopeConfig;
    }
}
