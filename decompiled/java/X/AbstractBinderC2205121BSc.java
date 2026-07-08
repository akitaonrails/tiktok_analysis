package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: X.1BSc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractBinderC2205121BSc extends BinderC837100Wse implements InterfaceC2205151BSf {
    public AbstractBinderC2205121BSc() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override // X.BinderC837100Wse
    public final boolean LJJJZ(int i, Parcel parcel, Parcel parcel2) {
        C1BS1 c1bsu;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c1bsu = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (iInterfaceQueryLocalInterface instanceof C1BS1) {
                    c1bsu = (C1BS1) iInterfaceQueryLocalInterface;
                } else {
                    c1bsu = new C1BSU(strongBinder);
                }
            }
            C837530WtL.LIZIZ(parcel);
            LLIIIL(c1bsu);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
