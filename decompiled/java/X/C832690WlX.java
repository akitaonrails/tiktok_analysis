package X;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0WlX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C832690WlX {
    public static final C832010WkR<C831620Wjo> LIZ = new C832010WkR<>("Auth.PROXY_API", new AbstractC831970WkN() { // from class: X.0WlU
        @Override // X.AbstractC831970WkN
        public final /* synthetic */ InterfaceC831160Wj4 buildClient(Context context, Looper looper, C831470WjZ c831470WjZ, Object obj, InterfaceC832280Wks interfaceC832280Wks, InterfaceC832890Wlr interfaceC832890Wlr) {
            return new AbstractC832400Wl4(context, looper, c831470WjZ, (C831620Wjo) obj, interfaceC832280Wks, interfaceC832890Wlr) { // from class: X.0WlB
                public final Bundle LL;

                @Override // X.AbstractC832390Wl3
                public final Bundle getGetServiceRequestExtraArgs() {
                    return this.LL;
                }

                @Override // X.AbstractC832390Wl3, X.InterfaceC831160Wj4
                public final int getMinApkVersion() {
                    return 12451000;
                }

                @Override // X.AbstractC832390Wl3
                public final String getServiceDescriptor() {
                    return "com.google.android.gms.auth.api.internal.IAuthService";
                }

                @Override // X.AbstractC832390Wl3
                public final String getStartServiceAction() {
                    return "com.google.android.gms.auth.service.START";
                }

                @Override // X.AbstractC832390Wl3
                public final boolean usesClientTelemetry() {
                    return true;
                }

                @Override // X.AbstractC832390Wl3, X.InterfaceC831160Wj4
                public final boolean requiresSignIn() {
                    C831470WjZ c831470WjZ2 = this.zab;
                    Account account = c831470WjZ2.LIZ;
                    if (TextUtils.isEmpty(account != null ? account.name : null)) {
                        return false;
                    }
                    if (c831470WjZ2.LIZLLL.get(C832690WlX.LIZ) == null) {
                        return !c831470WjZ2.LIZIZ.isEmpty();
                    }
                    throw null;
                }

                @Override // X.AbstractC832390Wl3
                public final /* synthetic */ IInterface createServiceInterface(final IBinder iBinder) {
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
                    if (iInterfaceQueryLocalInterface instanceof C832900Wls) {
                        return iInterfaceQueryLocalInterface;
                    }
                    return new C832910Wlt(iBinder) { // from class: X.0Wls
                    };
                }

                {
                    Bundle bundle;
                    if (c831620Wjo == null) {
                        bundle = new Bundle();
                    } else {
                        bundle = new Bundle((Bundle) null);
                    }
                    this.LL = bundle;
                }
            };
        }
    }, new C832160Wkg());

    static {
        new Object() { // from class: X.0Wlz
        };
    }
}
