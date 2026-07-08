package X;

import com.ss.android.ugc.aweme.boost.ThreadBoostConfig;
import com.ss.android.ugc.aweme.boost.ThreadCpuCoreConfig;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Afq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2185321Afq extends C09AY implements Function0<List<? extends ThreadCpuCoreConfig>> {
    public C2185321Afq() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends ThreadCpuCoreConfig> invoke() {
        return ((ThreadBoostConfig) C2185281Afm.LJFF.getValue()).threadCpuCoreConfigs;
    }
}
