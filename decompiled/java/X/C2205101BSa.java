package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

/* JADX INFO: renamed from: X.1BSa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2205101BSa extends C1B9K implements C1BSA {
    @Override // X.C1BSA
    public final VisibleRegion LJJIJIIJIL() {
        Parcel parcelLJJJZ = LJJJZ(3, LLILLIZIL());
        VisibleRegion visibleRegion = (VisibleRegion) C837530WtL.LIZ(parcelLJJJZ, VisibleRegion.CREATOR);
        parcelLJJJZ.recycle();
        return visibleRegion;
    }

    public C2205101BSa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override // X.C1BSA
    public final InterfaceC820590WGz e(LatLng latLng) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZJ(parcelLLILLIZIL, latLng);
        Parcel parcelLJJJZ = LJJJZ(2, parcelLLILLIZIL);
        InterfaceC820590WGz interfaceC820590WGzLLILLIZIL = AbstractBinderC828770WfD.LLILLIZIL(parcelLJJJZ.readStrongBinder());
        parcelLJJJZ.recycle();
        return interfaceC820590WGzLLILLIZIL;
    }
}
