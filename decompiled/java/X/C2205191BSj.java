package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: renamed from: X.1BSj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2205191BSj extends C1B9K implements InterfaceC2205031BRt {
    public C2205191BSj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // X.InterfaceC2205031BRt
    public final InterfaceC820590WGz o0(float f) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        parcelLLILLIZIL.writeFloat(f);
        Parcel parcelLJJJZ = LJJJZ(4, parcelLLILLIZIL);
        InterfaceC820590WGz interfaceC820590WGzLLILLIZIL = AbstractBinderC828770WfD.LLILLIZIL(parcelLJJJZ.readStrongBinder());
        parcelLJJJZ.recycle();
        return interfaceC820590WGzLLILLIZIL;
    }

    @Override // X.InterfaceC2205031BRt
    public final InterfaceC820590WGz LLLL(LatLngBounds latLngBounds, int i) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZJ(parcelLLILLIZIL, latLngBounds);
        parcelLLILLIZIL.writeInt(i);
        Parcel parcelLJJJZ = LJJJZ(10, parcelLLILLIZIL);
        InterfaceC820590WGz interfaceC820590WGzLLILLIZIL = AbstractBinderC828770WfD.LLILLIZIL(parcelLJJJZ.readStrongBinder());
        parcelLJJJZ.recycle();
        return interfaceC820590WGzLLILLIZIL;
    }

    @Override // X.InterfaceC2205031BRt
    public final InterfaceC820590WGz LLLLJI(LatLng latLng, float f) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZJ(parcelLLILLIZIL, latLng);
        parcelLLILLIZIL.writeFloat(f);
        Parcel parcelLJJJZ = LJJJZ(9, parcelLLILLIZIL);
        InterfaceC820590WGz interfaceC820590WGzLLILLIZIL = AbstractBinderC828770WfD.LLILLIZIL(parcelLJJJZ.readStrongBinder());
        parcelLJJJZ.recycle();
        return interfaceC820590WGzLLILLIZIL;
    }

    @Override // X.InterfaceC2205031BRt
    public final InterfaceC820590WGz LJLJJL(LatLngBounds latLngBounds, int i, int i2, int i3) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZJ(parcelLLILLIZIL, latLngBounds);
        parcelLLILLIZIL.writeInt(i);
        parcelLLILLIZIL.writeInt(i2);
        parcelLLILLIZIL.writeInt(i3);
        Parcel parcelLJJJZ = LJJJZ(11, parcelLLILLIZIL);
        InterfaceC820590WGz interfaceC820590WGzLLILLIZIL = AbstractBinderC828770WfD.LLILLIZIL(parcelLJJJZ.readStrongBinder());
        parcelLJJJZ.recycle();
        return interfaceC820590WGzLLILLIZIL;
    }
}
