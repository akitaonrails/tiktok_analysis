package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: renamed from: X.1BSi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2205181BSi extends C1B9K implements InterfaceC2205261BSq {
    @Override // X.InterfaceC2205261BSq
    public final int LIZJ() {
        Parcel parcelLJJJZ = LJJJZ(17, LLILLIZIL());
        int i = parcelLJJJZ.readInt();
        parcelLJJJZ.recycle();
        return i;
    }

    @Override // X.InterfaceC2205261BSq
    public final float LJFF() {
        Parcel parcelLJJJZ = LJJJZ(28, LLILLIZIL());
        float f = parcelLJJJZ.readFloat();
        parcelLJJJZ.recycle();
        return f;
    }

    @Override // X.InterfaceC2205261BSq
    public final InterfaceC820590WGz LJI() {
        Parcel parcelLJJJZ = LJJJZ(30, LLILLIZIL());
        InterfaceC820590WGz interfaceC820590WGzLLILLIZIL = AbstractBinderC828770WfD.LLILLIZIL(parcelLJJJZ.readStrongBinder());
        parcelLJJJZ.recycle();
        return interfaceC820590WGzLLILLIZIL;
    }

    @Override // X.InterfaceC2205261BSq
    public final LatLng LJIIJJI() {
        Parcel parcelLJJJZ = LJJJZ(4, LLILLIZIL());
        LatLng latLng = (LatLng) C837530WtL.LIZ(parcelLJJJZ, LatLng.CREATOR);
        parcelLJJJZ.recycle();
        return latLng;
    }

    @Override // X.InterfaceC2205261BSq
    public final String LJIIL() {
        Parcel parcelLJJJZ = LJJJZ(6, LLILLIZIL());
        String string = parcelLJJJZ.readString();
        parcelLJJJZ.recycle();
        return string;
    }

    @Override // X.InterfaceC2205261BSq
    public final void LJIILL() {
        LLLIIL(1, LLILLIZIL());
    }

    @Override // X.InterfaceC2205261BSq
    public final void LLJIJIL() {
        LLLIIL(11, LLILLIZIL());
    }

    @Override // X.InterfaceC2205261BSq
    public final boolean LLJJIJI() {
        Parcel parcelLJJJZ = LJJJZ(13, LLILLIZIL());
        boolean z = parcelLJJJZ.readInt() != 0;
        parcelLJJJZ.recycle();
        return z;
    }

    @Override // X.InterfaceC2205261BSq
    public final boolean LLJJLIIIJLLLLLLLZ() {
        Parcel parcelLJJJZ = LJJJZ(15, LLILLIZIL());
        boolean z = parcelLJJJZ.readInt() != 0;
        parcelLJJJZ.recycle();
        return z;
    }

    public C2205181BSi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // X.InterfaceC2205261BSq
    public final void LLJI(String str) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        parcelLLILLIZIL.writeString(str);
        LLLIIL(5, parcelLLILLIZIL);
    }

    @Override // X.InterfaceC2205261BSq
    public final void LLJLIL(float f) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        parcelLLILLIZIL.writeFloat(f);
        LLLIIL(27, parcelLLILLIZIL);
    }

    @Override // X.InterfaceC2205261BSq
    public final void LLJLLIL(C0WH6 c0wh6) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, c0wh6);
        LLLIIL(29, parcelLLILLIZIL);
    }

    @Override // X.InterfaceC2205261BSq
    public final void U(InterfaceC820590WGz interfaceC820590WGz) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, interfaceC820590WGz);
        LLLIIL(18, parcelLLILLIZIL);
    }

    @Override // X.InterfaceC2205261BSq
    public final boolean a(InterfaceC2205261BSq interfaceC2205261BSq) {
        boolean z;
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, interfaceC2205261BSq);
        Parcel parcelLJJJZ = LJJJZ(16, parcelLLILLIZIL);
        if (parcelLJJJZ.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        parcelLJJJZ.recycle();
        return z;
    }

    @Override // X.InterfaceC2205261BSq
    public final void i(boolean z) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        parcelLLILLIZIL.writeInt(z ? 1 : 0);
        LLLIIL(14, parcelLLILLIZIL);
    }

    @Override // X.InterfaceC2205261BSq
    public final void v(LatLng latLng) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZJ(parcelLLILLIZIL, latLng);
        LLLIIL(3, parcelLLILLIZIL);
    }

    @Override // X.InterfaceC2205261BSq
    public final void LLLJIL(float f, float f2) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        parcelLLILLIZIL.writeFloat(f);
        parcelLLILLIZIL.writeFloat(f2);
        LLLIIL(19, parcelLLILLIZIL);
    }
}
