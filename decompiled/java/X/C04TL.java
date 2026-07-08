package X;

import com.ss.android.ugc.aweme.api.IBootLogApi;
import com.ss.android.ugc.aweme.impl.IBootLogImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04TL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04TL extends C09AY implements Function0<IBootLogApi> {
    public C04TL() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.api.IBootLogApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IBootLogApi invoke() {
        ?? LIZ = C04TD.LIZ(IBootLogApi.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C04TD.q1 == null) {
            synchronized (IBootLogApi.class) {
                if (C04TD.q1 == null) {
                    C04TD.q1 = new IBootLogImpl();
                }
            }
        }
        return C04TD.q1;
    }
}
