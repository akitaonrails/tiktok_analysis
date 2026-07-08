package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* JADX INFO: renamed from: X.0WnK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C833800WnK extends AbstractC831380WjQ {
    public static final C832010WkR LIZIZ = new C832010WkR("Auth.Api.Identity.CredentialSaving.API", new AbstractC831970WkN() { // from class: X.0WnL
        @Override // X.AbstractC831970WkN
        public final /* synthetic */ InterfaceC831160Wj4 buildClient(final Context context, final Looper looper, final C831470WjZ c831470WjZ, Object obj, final InterfaceC832280Wks interfaceC832280Wks, final InterfaceC832890Wlr interfaceC832890Wlr) {
            return new AbstractC832400Wl4(context, looper, c831470WjZ, interfaceC832280Wks, interfaceC832890Wlr) { // from class: X.0WnM
                public final Bundle LL = new Bundle();

                @Override // X.AbstractC832390Wl3
                public final Bundle getGetServiceRequestExtraArgs() {
                    return this.LL;
                }

                @Override // X.AbstractC832390Wl3, X.InterfaceC831160Wj4
                public final int getMinApkVersion() {
                    return 17895000;
                }

                @Override // X.AbstractC832390Wl3
                public final String getServiceDescriptor() {
                    return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
                }

                @Override // X.AbstractC832390Wl3
                public final String getStartServiceAction() {
                    return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
                }

                @Override // X.AbstractC832390Wl3
                public final boolean getUseDynamicLookup() {
                    return true;
                }

                @Override // X.AbstractC832390Wl3
                public final boolean usesClientTelemetry() {
                    return true;
                }

                @Override // X.AbstractC832390Wl3
                public final Feature[] getApiFeatures() {
                    return C834040Wni.LJFF;
                }

                @Override // X.AbstractC832390Wl3
                public final /* synthetic */ IInterface createServiceInterface(final IBinder iBinder) {
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
                    if (iInterfaceQueryLocalInterface instanceof C833840WnO) {
                        return iInterfaceQueryLocalInterface;
                    }
                    return new C834590Wob(iBinder) { // from class: X.0WnO
                    };
                }
            };
        }
    }, new C832160Wkg());
    public final String LIZ;

    public C833800WnK(Activity activity, C833830WnN c833830WnN) {
        super(activity, (C832010WkR<C833830WnN>) LIZIZ, c833830WnN, C831490Wjb.LIZJ);
        this.LIZ = C833580Wmy.LIZ();
    }
}
