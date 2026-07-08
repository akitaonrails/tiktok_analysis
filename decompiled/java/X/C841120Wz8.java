package X;

import com.bytedance.helios.network.NetworkComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wz8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841120Wz8 extends C09AY implements Function0<String> {
    public C841120Wz8() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isNetworkEnabled: ");
        sbLIZ.append(NetworkComponent.INSTANCE.isNetworkEnabled());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
