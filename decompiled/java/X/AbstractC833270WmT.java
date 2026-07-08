package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* JADX INFO: renamed from: X.0WmT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC833270WmT {
    public static final C832010WkR LIZ = new C832010WkR("TapAndPay.TAP_AND_PAY_API", new AbstractC831970WkN() { // from class: X.0WmU
        @Override // X.AbstractC831970WkN
        public final /* synthetic */ InterfaceC831160Wj4 buildClient(final Context context, final Looper looper, final C831470WjZ c831470WjZ, Object obj, final InterfaceC832280Wks interfaceC832280Wks, final InterfaceC832890Wlr interfaceC832890Wlr) {
            return new AbstractC832400Wl4(context, looper, interfaceC832280Wks, interfaceC832890Wlr, c831470WjZ) { // from class: X.0WmV
                @Override // X.AbstractC832390Wl3, X.InterfaceC831160Wj4
                public final int getMinApkVersion() {
                    return 12800000;
                }

                @Override // X.AbstractC832390Wl3
                public final String getServiceDescriptor() {
                    return "com.google.android.gms.tapandpay.internal.ITapAndPayService";
                }

                @Override // X.AbstractC832390Wl3
                public final String getStartServiceAction() {
                    return "com.google.android.gms.tapandpay.service.BIND";
                }

                @Override // X.AbstractC832390Wl3
                public final boolean usesClientTelemetry() {
                    return true;
                }

                @Override // X.AbstractC832390Wl3
                public final Bundle getGetServiceRequestExtraArgs() {
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJI("sdk_version", "18.3.3", bundle);
                    return bundle;
                }

                @Override // X.AbstractC832390Wl3
                public final Feature[] getApiFeatures() {
                    return C833310WmX.LIZIZ;
                }

                @Override // X.AbstractC832390Wl3
                public final /* synthetic */ IInterface createServiceInterface(final IBinder iBinder) {
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayService");
                    if (iInterfaceQueryLocalInterface instanceof C833300WmW) {
                        return iInterfaceQueryLocalInterface;
                    }
                    return new C833260WmS(iBinder) { // from class: X.0WmW
                    };
                }
            };
        }
    }, new C832160Wkg());
}
