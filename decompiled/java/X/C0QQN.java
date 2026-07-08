package X;

import com.ss.android.ugc.aweme.ml.api.ClientAIConfigCenter;
import com.ss.android.ugc.aweme.ml.feature.ClientAIConfigCenterImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QQN, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QQN extends C09AY implements Function0<ClientAIConfigCenter> {
    public C0QQN() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ml.api.ClientAIConfigCenter, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ClientAIConfigCenter invoke() {
        ?? LIZ = C04TD.LIZ(ClientAIConfigCenter.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C04TD.u2 == null) {
            synchronized (ClientAIConfigCenter.class) {
                if (C04TD.u2 == null) {
                    C04TD.u2 = new ClientAIConfigCenterImpl();
                }
            }
        }
        return C04TD.u2;
    }
}
