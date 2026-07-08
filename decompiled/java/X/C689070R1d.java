package X;

import com.ss.android.ugc.aweme.im.IMSearchImpl;
import com.ss.android.ugc.aweme.im.search.api.IMSearchApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0R1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C689070R1d extends C09AY implements Function0<IMSearchApi> {
    public C689070R1d() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.search.api.IMSearchApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMSearchApi invoke() {
        ?? LIZ = C04TD.LIZ(IMSearchApi.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C04TD.Q0 == null) {
            synchronized (IMSearchApi.class) {
                if (C04TD.Q0 == null) {
                    C04TD.Q0 = new IMSearchImpl();
                }
            }
        }
        return C04TD.Q0;
    }
}
