package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: X.1BTF, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BTF extends C1B9K implements C1BTX {
    @Override // X.C1BTX
    public final void onDestroy() {
        LLLIIL(8, LLILLIZIL());
    }

    @Override // X.C1BTX
    public final void onDestroyView() {
        LLLIIL(7, LLILLIZIL());
    }

    @Override // X.C1BTX
    public final void onLowMemory() {
        LLLIIL(9, LLILLIZIL());
    }

    @Override // X.C1BTX
    public final void onPause() {
        LLLIIL(6, LLILLIZIL());
    }

    @Override // X.C1BTX
    public final void onResume() {
        LLLIIL(5, LLILLIZIL());
    }

    @Override // X.C1BTX
    public final void onStart() {
        LLLIIL(13, LLILLIZIL());
    }

    @Override // X.C1BTX
    public final void onStop() {
        LLLIIL(14, LLILLIZIL());
    }

    public C1BTF(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
    }

    @Override // X.C1BTX
    public final void onCreate(Bundle bundle) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZJ(parcelLLILLIZIL, bundle);
        LLLIIL(3, parcelLLILLIZIL);
    }

    @Override // X.C1BTX
    public final void onSaveInstanceState(Bundle bundle) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZJ(parcelLLILLIZIL, bundle);
        Parcel parcelLJJJZ = LJJJZ(10, parcelLLILLIZIL);
        if (parcelLJJJZ.readInt() != 0) {
            bundle.readFromParcel(parcelLJJJZ);
        }
        parcelLJJJZ.recycle();
    }

    @Override // X.C1BTX
    public final void s(C1BTJ c1btj) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, c1btj);
        LLLIIL(12, parcelLLILLIZIL);
    }

    @Override // X.C1BTX
    public final void LLJJJJ(C0WH6 c0wh6, Bundle bundle) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, c0wh6);
        C837530WtL.LIZJ(parcelLLILLIZIL, null);
        C837530WtL.LIZJ(parcelLLILLIZIL, bundle);
        LLLIIL(2, parcelLLILLIZIL);
    }

    @Override // X.C1BTX
    public final InterfaceC820590WGz LJJLIIIJILLIZJL(C0WH6 c0wh6, C0WH6 c0wh62, Bundle bundle) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, c0wh6);
        C837530WtL.LIZLLL(parcelLLILLIZIL, c0wh62);
        C837530WtL.LIZJ(parcelLLILLIZIL, bundle);
        Parcel parcelLJJJZ = LJJJZ(4, parcelLLILLIZIL);
        InterfaceC820590WGz interfaceC820590WGzLLILLIZIL = AbstractBinderC828770WfD.LLILLIZIL(parcelLJJJZ.readStrongBinder());
        parcelLJJJZ.recycle();
        return interfaceC820590WGzLLILLIZIL;
    }
}
