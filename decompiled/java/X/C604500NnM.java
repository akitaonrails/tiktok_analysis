package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0NnM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C604500NnM extends AbstractC604480NnK {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC604490NnL interfaceC604490NnL = (InterfaceC604490NnL) xBaseParamModel;
        InterfaceC604510NnN gpsRequestConfig = interfaceC604490NnL.getGpsRequestConfig();
        if (gpsRequestConfig == null) {
            C2382909Vj.LIZ(completionBlock, -3, "GPSRequestConfig is required for collectLocation", null, 4);
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ())), null, null, new C604460NnI(new C604530NnP(interfaceC604490NnL.getEntrance(), new C604540NnQ(gpsRequestConfig.getUserAgree(), gpsRequestConfig.getDataCertToken(), gpsRequestConfig.getDataCertAuth(), gpsRequestConfig.getDecryptCertToken(), gpsRequestConfig.getDecryptCertAuth())), completionBlock, this, null), 3);
        }
    }
}
