package X;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: X.1BSo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractBinderC2205241BSo extends BinderC837100Wse implements InterfaceC2205261BSq {
    public static InterfaceC2205261BSq LLILLIZIL(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        if (iInterfaceQueryLocalInterface instanceof InterfaceC2205261BSq) {
            return (InterfaceC2205261BSq) iInterfaceQueryLocalInterface;
        }
        return new C2205181BSi(iBinder);
    }
}
