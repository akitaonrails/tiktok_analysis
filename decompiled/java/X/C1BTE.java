package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: X.1BTE, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BTE extends C1B9K implements C1BTY {
    @Override // X.C1BTY
    public final InterfaceC820590WGz getView() {
        Parcel parcelLJJJZ = LJJJZ(8, LLILLIZIL());
        InterfaceC820590WGz interfaceC820590WGzLLILLIZIL = AbstractBinderC828770WfD.LLILLIZIL(parcelLJJJZ.readStrongBinder());
        parcelLJJJZ.recycle();
        return interfaceC820590WGzLLILLIZIL;
    }

    @Override // X.C1BTY
    public final void onDestroy() {
        LLLIIL(5, LLILLIZIL());
    }

    @Override // X.C1BTY
    public final void onLowMemory() {
        LLLIIL(6, LLILLIZIL());
    }

    @Override // X.C1BTY
    public final void onPause() {
        LLLIIL(4, LLILLIZIL());
    }

    @Override // X.C1BTY
    public final void onResume() {
        LLLIIL(3, LLILLIZIL());
    }

    @Override // X.C1BTY
    public final void onStart() {
        LLLIIL(12, LLILLIZIL());
    }

    @Override // X.C1BTY
    public final void onStop() {
        LLLIIL(13, LLILLIZIL());
    }

    public C1BTE(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    @Override // X.C1BTY
    public final void LJJIII(InterfaceC2205151BSf interfaceC2205151BSf) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, interfaceC2205151BSf);
        LLLIIL(9, parcelLLILLIZIL);
    }

    @Override // X.C1BTY
    public final void onCreate(Bundle bundle) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZJ(parcelLLILLIZIL, bundle);
        LLLIIL(2, parcelLLILLIZIL);
    }

    @Override // X.C1BTY
    public final void onSaveInstanceState(Bundle bundle) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZJ(parcelLLILLIZIL, bundle);
        Parcel parcelLJJJZ = LJJJZ(7, parcelLLILLIZIL);
        if (parcelLJJJZ.readInt() != 0) {
            bundle.readFromParcel(parcelLJJJZ);
        }
        parcelLJJJZ.recycle();
    }
}
