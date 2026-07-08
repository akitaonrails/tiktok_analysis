package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: X.0WGx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820570WGx extends C820540WGu implements C0WH2 {
    public C820570WGx(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // X.C0WH2
    public final Bundle LJJ(Bundle bundle) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZJ(parcelLJJJZ, bundle);
        Parcel parcelLLILLIZIL = LLILLIZIL(1, parcelLJJJZ);
        Bundle bundle2 = (Bundle) C0W8X.LIZ(parcelLLILLIZIL, Bundle.CREATOR);
        parcelLLILLIZIL.recycle();
        return bundle2;
    }
}
