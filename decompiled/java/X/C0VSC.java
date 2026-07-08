package X;

import com.bytedance.ies.safemode.SmartProtected.utils.logger.LLog;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VSC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VSC {
    public static void LIZ() {
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LLog.LIZ(th, "getClearCacheWhiteList failed", new Object[0]);
            LLog lLog = LLog.LIZ;
            try {
                C09CA.LIZ.LJIILL(null);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            lLog.getClass();
            C1697810uHb.LJIIJJI(".*imsdk_device_sp.*", ".*imsdk_.*", ".*fastboot.*", ".*aweme_account_session.*", ".*enterprise_user.*", ".*aweme_account_country_code.*", ".*MainTabPreferences.*", "/files/npth.*", "/files/shortvideo.*", "/files/ALOG.*", "/files/reparo-root.*", "/files/im_interactive_resource.*", "/databases/aweme.db", "/databases/aweme.db-journal", "/databases/aweme_new.db", "/databases/aweme_new.db-journal", "/databases/im_biz_.*\\.db.*", "/databases/encrypted_im_biz_.*\\.db.*", "/databases/.*_im\\.db.*", "/databases/encrypted_.*_im\\.db.*", ".*aweme_user.*", ".*local_user.*", ".*com_bytedance_sdk_account_utils_common_request_cache_helper.*", ".*token_shared_preference.*", ".*com_ss_android_token_sp_host.*", ".*ss_app_config.*", ".*com.bytedance.sdk.account_setting.*", ".*com.bytedance.sdk.account_setting.*", ".*account_sdk_settings_sp.*", ".*account_sdk_induce_recorder.*", ".*account_x_sp_file.*", ".*account_sdk_settings_sp.*", ".*bd_onekey_special_operate.*");
        }
    }
}
