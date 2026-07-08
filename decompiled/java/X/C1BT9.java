package X;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: X.1BT9, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BT9 extends C1B9K implements C1BTA {
    public C1BT9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // X.C1BTA
    public final InterfaceC820590WGz LLLZIL(Bitmap bitmap) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZJ(parcelLLILLIZIL, bitmap);
        Parcel parcelLJJJZ = LJJJZ(6, parcelLLILLIZIL);
        InterfaceC820590WGz interfaceC820590WGzLLILLIZIL = AbstractBinderC828770WfD.LLILLIZIL(parcelLJJJZ.readStrongBinder());
        parcelLJJJZ.recycle();
        return interfaceC820590WGzLLILLIZIL;
    }
}
