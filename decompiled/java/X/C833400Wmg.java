package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: renamed from: X.0Wmg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C833400Wmg {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new C832010WkR("Fido.U2F_ZERO_PARTY_API", new AbstractC831970WkN() { // from class: X.0Wmf
            @Override // X.AbstractC831970WkN
            public final /* synthetic */ InterfaceC831160Wj4 buildClient(Context context, Looper looper, C831470WjZ c831470WjZ, Object obj, InterfaceC832260Wkq interfaceC832260Wkq, InterfaceC832270Wkr interfaceC832270Wkr) {
                return new AbstractC832400Wl4(context, looper, c831470WjZ, interfaceC832260Wkq, interfaceC832270Wkr) { // from class: X.0Wme
                    @Override // X.AbstractC832390Wl3, X.InterfaceC831160Wj4
                    public final int getMinApkVersion() {
                        return 13000000;
                    }

                    @Override // X.AbstractC832390Wl3
                    public final String getServiceDescriptor() {
                        return "com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService";
                    }

                    @Override // X.AbstractC832390Wl3
                    public final String getStartServiceAction() {
                        return "com.google.android.gms.fido.u2f.zeroparty.START";
                    }

                    @Override // X.AbstractC832390Wl3
                    public final boolean usesClientTelemetry() {
                        return true;
                    }

                    @Override // X.AbstractC832390Wl3
                    public final Bundle getGetServiceRequestExtraArgs() {
                        Bundle bundle = new Bundle();
                        C786410Ut5.LJJJI("ACTION_START_SERVICE", "com.google.android.gms.fido.u2f.zeroparty.START", bundle);
                        return bundle;
                    }

                    @Override // X.AbstractC832390Wl3
                    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
                        if (iInterfaceQueryLocalInterface instanceof C833370Wmd) {
                            return iInterfaceQueryLocalInterface;
                        }
                        return new C833360Wmc(iBinder) { // from class: X.0Wmd
                        };
                    }
                };
            }
        }, new C832160Wkg());
    }
}
