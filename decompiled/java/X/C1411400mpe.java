package X;

import kotlin.jvm.functions.Function1;
import webcast.api.sub.SupportedServiceInfo;

/* JADX INFO: renamed from: X.0mpe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411400mpe extends C09AY implements Function1<SupportedServiceInfo, CharSequence> {
    public C1411400mpe() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(SupportedServiceInfo supportedServiceInfo) {
        SupportedServiceInfo supportedServiceInfo2 = supportedServiceInfo;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(supportedServiceInfo2.type);
        sbLIZ.append('=');
        sbLIZ.append(supportedServiceInfo2.defaultEnabled);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
