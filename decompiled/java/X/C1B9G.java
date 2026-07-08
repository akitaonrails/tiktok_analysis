package X;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: X.1B9G, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B9G extends C1B9F implements C1B9H {
    public C1B9G(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
    }

    @Override // X.C1B9H
    public final void LLIIJLIL(String str, String str2, C1B9X c1b9x) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeString(str2);
        parcelLJJJZ.writeStrongBinder(c1b9x);
        LLLLII(1, parcelLJJJZ);
    }
}
