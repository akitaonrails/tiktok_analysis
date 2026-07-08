package X;

import com.bytedance.keva.Keva;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: renamed from: X.0CJ1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CJ1 {
    public final String LIZ = "is_fetch_launch";
    public final String LIZIZ = "fetch_request_type";
    public final String LIZJ = "fetch_config_by_group_original_json";
    public final String LIZLLL = "cdn_file_url_namespace_set";
    public final String LJ = "ABMOCK_FETCH_COMMON_KEVA";
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS548S0100000_4(this, 566));
    public final String LJI = "CONFIG_ABMOCK_FETCH_COMMON_KEVA";
    public final C01GW LJII = C452501pT.LIZIZ(new AwS548S0100000_4(this, 565));

    public final Set<String> LIZ() {
        return ((Keva) this.LJFF.getValue()).getStringSet(this.LIZLLL, new LinkedHashSet());
    }
}
