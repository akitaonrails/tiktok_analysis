package X;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: renamed from: X.0WGC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0WGC extends C0WGD implements InterfaceC19804212e8 {
    public C0WGC() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // X.C0WGD
    public final boolean LJJJZ(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Bundle bundle = (Bundle) C0W8X.LIZ(parcel, Bundle.CREATOR);
            C0W8X.LIZLLL(parcel);
            ((C0WGB) this).LJJ(bundle);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
