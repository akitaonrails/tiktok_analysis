package X;

import com.bytedance.forest.Forest;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06K8, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06K8 extends C09AY implements Function0<Forest> {
    public C06K8() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Forest invoke() {
        IMFoundationBridgeApi.LIZ.getClass();
        IMFoundationBridgeApi iMFoundationBridgeApiLIZ = C895630ZBp.LIZ();
        if (iMFoundationBridgeApiLIZ != null) {
            return iMFoundationBridgeApiLIZ.LJIIJJI();
        }
        return null;
    }
}
