package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: renamed from: X.0WnU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C833900WnU extends AbstractC832400Wl4 {
    public final C833910WnV LL;

    @Override // X.AbstractC832390Wl3, X.InterfaceC831160Wj4
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // X.AbstractC832390Wl3
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // X.AbstractC832390Wl3
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // X.AbstractC832390Wl3
    public final Bundle getGetServiceRequestExtraArgs() {
        C833910WnV c833910WnV = this.LL;
        c833910WnV.getClass();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("consumer_package", null, bundle);
        bundle.putBoolean("force_save_dialog", c833910WnV.LL);
        C786410Ut5.LJJJI("log_session_id", c833910WnV.LLILLJJLI, bundle);
        return bundle;
    }

    @Override // X.AbstractC832390Wl3
    public final /* synthetic */ IInterface createServiceInterface(final IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (iInterfaceQueryLocalInterface instanceof C834020Wng) {
            return iInterfaceQueryLocalInterface;
        }
        return new C834590Wob(iBinder) { // from class: X.0Wng
        };
    }

    public C833900WnU(Context context, Looper looper, C831470WjZ c831470WjZ, C833910WnV c833910WnV, InterfaceC832260Wkq interfaceC832260Wkq, InterfaceC832270Wkr interfaceC832270Wkr) {
        super(context, looper, 68, c831470WjZ, interfaceC832260Wkq, interfaceC832270Wkr);
        C833920WnW c833920WnW = new C833920WnW(c833910WnV == null ? C833910WnV.LLILLL : c833910WnV);
        c833920WnW.LIZIZ = C833580Wmy.LIZ();
        this.LL = new C833910WnV(c833920WnW);
    }
}
