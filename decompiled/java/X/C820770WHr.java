package X;

import com.ss.android.ugc.aweme.experiment.ApplogAllowKeysExp;
import com.ss.android.ugc.aweme.experiment.ApplogAllowKeysModel;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WHr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820770WHr extends C09AY implements Function0<Set<String>> {
    public C820770WHr() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<String> invoke() {
        Set<String> setLJ = C093Y.LJ("os_version", "app_version_minor", "app_name", "priority_version", "channel", "auth_status", "user_agent", "os", "tz_name", "tz_offset", "app_language", "is_upgrade_user", "aid", "package", "is_jailbroken", "app_version", "display_density", "timezone", "sdk_version", "version_code", "display_name", "os_api", "sig_hash", "push_sdk", "rom", "release_build", "update_version_code", "manifest_version_code", "cpu_abi", "not_request_sender", "rom_version", "platform", "resolution", "custom", "sim_region", "device_token", "install_id", "display_density_v2", "device_id", "access", "language", "region", "carrier_region", "device_brand", "density_dpi", "timezone_offset", "device_model", "model_display_name", "carrier", "timezone_name", "sys_region", "resolution_v2", "ab_version", "tweaked_channel", "device_manufacturer", "app_region", "sdk_version_code", "sdk_version_name", "guest_mode", "device_platform", "ab_sdk_version", "udid", "ram_size", "bits_commit_id", "mcc_mnc", "gaid_limited");
        setLJ.addAll(((ApplogAllowKeysModel) ApplogAllowKeysExp.LJFF.getValue()).allowKeys);
        ApplogAllowKeysExp.AppDiffProtocol.LIZ.getClass();
        setLJ.addAll(C820810WHv.LIZIZ.getValue().LIZ());
        return setLJ;
    }
}
