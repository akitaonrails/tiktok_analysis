package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.airemix.api.experiment.AIRemixCreationConfig;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.04yw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1275604yw {
    public static final C1275604yw LIZ = new C1275604yw();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(980));

    public static final AIRemixCreationConfig LIZ() {
        Object c098200Yq;
        Object c098200Yq2;
        SettingsManager.LIZLLL().getClass();
        String strLJI = SettingsManager.LJI("ai_remix_creation_config_settings", "{\"enable_auth_post\":true,\"enable_auth_save\":true,\"enable_auth_share\":true,\"allow_multiple_publish\":true}");
        if (strLJI.length() == 0) {
            strLJI = "{\"enable_auth_post\":true,\"enable_auth_save\":true,\"enable_auth_share\":true,\"allow_multiple_publish\":true}";
        }
        try {
            LIZ.getClass();
            c098200Yq = (AIRemixCreationConfig) ((Gson) LIZIZ.getValue()).LJII(strLJI, AIRemixCreationConfig.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        AIRemixCreationConfig aIRemixCreationConfig = (AIRemixCreationConfig) c098200Yq;
        if (aIRemixCreationConfig != null) {
            return aIRemixCreationConfig;
        }
        LIZ.getClass();
        try {
            c098200Yq2 = (AIRemixCreationConfig) ((Gson) LIZIZ.getValue()).LJII("{\"enable_auth_post\":true,\"enable_auth_save\":true,\"enable_auth_share\":true,\"allow_multiple_publish\":true}", AIRemixCreationConfig.class);
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        AIRemixCreationConfig aIRemixCreationConfig2 = (AIRemixCreationConfig) (C189200o6.m7isFailureimpl(c098200Yq2) ? null : c098200Yq2);
        return aIRemixCreationConfig2 == null ? new AIRemixCreationConfig(true, true, true, true) : aIRemixCreationConfig2;
    }
}
