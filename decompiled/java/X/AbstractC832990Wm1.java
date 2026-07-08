package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: renamed from: X.0Wm1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC832990Wm1 extends AbstractC831380WjQ<C833100WmC> {
    public static final C832010WkR<C833100WmC> LIZ = new C832010WkR<>("SmsRetriever.API", new AbstractC831970WkN<C833020Wm4, C833100WmC>() { // from class: X.0Wm3
        @Override // X.AbstractC831970WkN
        public final /* synthetic */ InterfaceC831160Wj4 buildClient(Context context, Looper looper, C831470WjZ c831470WjZ, C833100WmC c833100WmC, InterfaceC832260Wkq interfaceC832260Wkq, InterfaceC832270Wkr interfaceC832270Wkr) {
            return new AbstractC832400Wl4<InterfaceC833120WmE>(context, looper, c831470WjZ, interfaceC832260Wkq, interfaceC832270Wkr) { // from class: X.0Wm4
                @Override // X.AbstractC832390Wl3
                public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
                    return iInterfaceQueryLocalInterface instanceof InterfaceC833120WmE ? iInterfaceQueryLocalInterface : new C833060Wm8(iBinder);
                }

                @Override // X.AbstractC832390Wl3, X.InterfaceC831160Wj4
                public final int getMinApkVersion() {
                    return 12451000;
                }

                @Override // X.AbstractC832390Wl3
                public final String getServiceDescriptor() {
                    return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
                }

                @Override // X.AbstractC832390Wl3
                public final String getStartServiceAction() {
                    return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
                }
            };
        }
    }, new C832160Wkg());

    public AbstractC832990Wm1(Context context) {
        super(context, LIZ, (InterfaceC833080WmA) null, new C831630Wjp());
    }

    public abstract AbstractC835450Wpz<Void> LIZLLL();
}
