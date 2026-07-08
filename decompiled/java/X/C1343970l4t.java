package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.experiment.AudioAsrConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0l4t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1343970l4t {
    public static final C1343970l4t LIZ = new C1343970l4t();
    public static final AudioAsrConfig LIZIZ = new AudioAsrConfig(LSPassThroughRecordSizeConfig.DEFAULT, LSPassThroughRecordSizeConfig.DEFAULT, 3);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(658));

    public static int LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(((AudioAsrConfig) LIZJ.getValue()).retryCount);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Integer numValueOf = Integer.valueOf(LIZIZ.retryCount);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = numValueOf;
        }
        return ((Number) c098200Yq).intValue();
    }
}
