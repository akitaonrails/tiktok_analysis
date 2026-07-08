package X;

import com.ss.android.ugc.aweme.experiment.SearchPostRealTimeConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0R17, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R17 extends C09AY implements Function0<Long> {
    public C0R17() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(((SearchPostRealTimeConfig) C21141917oP.LIZIZ.getValue()).expireSeconds);
    }
}
