package X;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: X.0WfD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractBinderC828770WfD extends BinderC828780WfE implements InterfaceC820590WGz {
    public AbstractBinderC828770WfD() {
        super("com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static InterfaceC820590WGz LLILLIZIL(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (iInterfaceQueryLocalInterface instanceof InterfaceC820590WGz) {
            return (InterfaceC820590WGz) iInterfaceQueryLocalInterface;
        }
        return new C828760WfC(iBinder);
    }
}
