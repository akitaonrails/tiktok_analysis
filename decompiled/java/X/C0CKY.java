package X;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CKY, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CKY extends C09AY implements Function0<HashMap<String, Integer>> {
    public C0CKY() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final HashMap<String, Integer> invoke() {
        return C2097608Jq.LJI(new Pair("ab_common_request_build", 101), new Pair("ab_common_request_start_to_store_feature_flags", 201), new Pair("ab_common_request_save_config_data", 202), new Pair("ab_common_request_save_config_data_finish_to_end", 203), new Pair("ab_settings_migrate_before_save_config_data", 301), new Pair("ab_settings_migrate_save_config_data", 302), new Pair("ab_settings_migrate_inject_ab_response", 303));
    }
}
