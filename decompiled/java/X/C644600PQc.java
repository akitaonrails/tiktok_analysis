package X;

import com.ss.android.ugc.aweme.search.performance.core.config.SearchPhotoPrefetchOptConfig;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0PQc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C644600PQc {
    public static final C644600PQc LIZ = new C644600PQc();
    public static final SearchPhotoPrefetchOptConfig LIZIZ = new SearchPhotoPrefetchOptConfig(0, 0.5f, 200, 4);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(761));

    public static SearchPhotoPrefetchOptConfig LIZ() {
        return (SearchPhotoPrefetchOptConfig) LIZJ.getValue();
    }

    public static final boolean LIZIZ() {
        LIZ.getClass();
        return LIZ().group == 1 || LIZ().group == 3;
    }

    public static final boolean LIZJ() {
        LIZ.getClass();
        return LIZ().group == 2 || LIZ().group == 3;
    }
}
