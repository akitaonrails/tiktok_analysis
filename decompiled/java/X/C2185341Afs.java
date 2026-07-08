package X;

import com.ss.android.ugc.aweme.boost.ThreadBoostConfig;
import com.ss.android.ugc.aweme.boost.ThreadSuspendConfig;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Afs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2185341Afs extends C09AY implements Function0<List<? extends ThreadSuspendConfig>> {
    public C2185341Afs() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends ThreadSuspendConfig> invoke() {
        return ((ThreadBoostConfig) C2185281Afm.LJFF.getValue()).threadSuspendConfigs;
    }
}
