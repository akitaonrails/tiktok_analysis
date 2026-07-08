package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.feed.platform.ab.RealtimeFcpClientExpConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SVA, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SVA {
    public static final RealtimeFcpClientExpConfig LIZ = new RealtimeFcpClientExpConfig(false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0SVB());

    public static boolean LIZ() {
        RealtimeFcpClientExpConfig realtimeFcpClientExpConfig = (RealtimeFcpClientExpConfig) LIZIZ.getValue();
        return (realtimeFcpClientExpConfig != null && realtimeFcpClientExpConfig.npSwitch) || Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), Boolean.FALSE);
    }
}
