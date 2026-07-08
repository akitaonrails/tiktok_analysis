package X;

import com.ss.android.ugc.aweme.experiment.ApplogAllowKeysExp;
import com.ss.android.ugc.aweme.experiment.ApplogAllowKeysModel;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WHq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820760WHq extends C09AY implements Function0<Set<String>> {
    public C820760WHq() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<String> invoke() {
        Set<String> setLJ = C093Y.LJ("ab_sdk_version", "ab_version", "access", "app_region", "build_serial", "carrier", "carrier_region", "custom", "density_dpi", "device_brand", "device_id", "device_manufacturer", "device_model", "device_platform", "device_token", "display_density_v2", "fingerprint", "guest_mode", "install_id", "language", "mc", "mcc_mnc", "model_display_name", "old_did", "region", "resolution", "resolution_v2", "sdk_version_code", "sdk_version_name", "serial_number", "sim_region", "sim_serial_number", "sys_region", "timezone_name", "timezone_offset", "tweaked_channel", "os_version", "app_version_minor", "app_name", "priority_version", "channel", "auth_status", "user_agent", "os", "tz_name", "tz_offset", "app_language", "is_upgrade_user", "aid", "package", "is_jailbroken", "app_version", "display_density", "timezone", "sdk_version", "version_code", "display_name", "os_api", "sig_hash", "push_sdk", "rom", "release_build", "update_version_code", "manifest_version_code", "app_version_minor", "cpu_abi", "not_request_sender", "rom_version", "platform");
        setLJ.addAll(((ApplogAllowKeysModel) ApplogAllowKeysExp.LJFF.getValue()).kidsAllowKeys);
        return setLJ;
    }
}
