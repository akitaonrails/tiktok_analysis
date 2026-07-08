package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0To2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C757800To2 extends AbstractC757810To3 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        boolean zIsLocationPermissionGranted;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        if (context != null) {
            IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            if (iHostAppContext != null) {
                zIsLocationPermissionGranted = iHostAppContext.isLocationPermissionGranted(context);
            } else {
                zIsLocationPermissionGranted = false;
            }
            InterfaceC757820To4 interfaceC757820To4 = (InterfaceC757820To4) C1909107dp.LIZJ(InterfaceC757820To4.class, null);
            interfaceC757820To4.setEnable(Boolean.valueOf(zIsLocationPermissionGranted));
            completionBlock.onSuccess(interfaceC757820To4, "");
            return;
        }
        InterfaceC757820To4 interfaceC757820To42 = (InterfaceC757820To4) C1909107dp.LIZJ(InterfaceC757820To4.class, null);
        interfaceC757820To42.setEnable(Boolean.FALSE);
        completionBlock.onSuccess(interfaceC757820To42, "");
    }
}
