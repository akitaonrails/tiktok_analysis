package X;

import com.ss.android.ugc.aweme.app.SharePrefCache;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0v1e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1726360v1e extends C09AY implements Function0<C1610290s0R> {
    public C1726360v1e() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0s0R] */
    @Override // kotlin.jvm.functions.Function0
    public final C1610290s0R invoke() {
        return new AbstractC1610280s0Q() { // from class: X.0s0R
            @Override // X.AbstractC1610280s0Q
            public final C2230608oa<Long> LIZIZ() {
                return SharePrefCache.inst().getLastGetRelieveAwemeTime();
            }
        };
    }
}
