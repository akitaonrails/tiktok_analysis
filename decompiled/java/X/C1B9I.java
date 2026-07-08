package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: X.1B9I, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B9I extends C1B9F implements InterfaceC2200631BAv {
    public C1B9I(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // X.InterfaceC2200631BAv
    public final int LJIJ(String str, String str2) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeInt(3);
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeString(str2);
        Parcel parcelLLILLIZIL = LLILLIZIL(5, parcelLJJJZ);
        int i = parcelLLILLIZIL.readInt();
        parcelLLILLIZIL.recycle();
        return i;
    }

    @Override // X.InterfaceC2200631BAv
    public final void LLILZIL(Bundle bundle, C1B9M c1b9m) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeInt(1);
        bundle.writeToParcel(parcelLJJJZ, 0);
        parcelLJJJZ.writeStrongBinder(c1b9m);
        LLLLII(2001, parcelLJJJZ);
    }

    @Override // X.InterfaceC2200631BAv
    public final Bundle F0(String str, String str2, String str3) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeInt(3);
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeString(str2);
        parcelLJJJZ.writeString(str3);
        parcelLJJJZ.writeString(null);
        Parcel parcelLLILLIZIL = LLILLIZIL(3, parcelLJJJZ);
        Bundle bundle = (Bundle) C1779490wPL.LIZ(parcelLLILLIZIL, Bundle.CREATOR);
        parcelLLILLIZIL.recycle();
        return bundle;
    }

    @Override // X.InterfaceC2200631BAv
    public final void J0(String str, Bundle bundle, C1B9N c1b9n) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeInt(12);
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeInt(1);
        bundle.writeToParcel(parcelLJJJZ, 0);
        parcelLJJJZ.writeStrongBinder(c1b9n);
        LLLIIL(1201, parcelLJJJZ);
    }

    @Override // X.InterfaceC2200631BAv
    public final Bundle LLLLIIIILLL(String str, String str2, Bundle bundle) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeInt(9);
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeString(str2);
        parcelLJJJZ.writeInt(1);
        bundle.writeToParcel(parcelLJJJZ, 0);
        Parcel parcelLLILLIZIL = LLILLIZIL(902, parcelLJJJZ);
        Bundle bundle2 = (Bundle) C1779490wPL.LIZ(parcelLLILLIZIL, Bundle.CREATOR);
        parcelLLILLIZIL.recycle();
        return bundle2;
    }

    @Override // X.InterfaceC2200631BAv
    public final int LLLLIILLL(int i, String str, String str2) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeInt(i);
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeString(str2);
        Parcel parcelLLILLIZIL = LLILLIZIL(1, parcelLJJJZ);
        int i2 = parcelLLILLIZIL.readInt();
        parcelLLILLIZIL.recycle();
        return i2;
    }

    @Override // X.InterfaceC2200631BAv
    public final Bundle LLLLLILLIL(String str, String str2, Bundle bundle) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeInt(9);
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeString(str2);
        parcelLJJJZ.writeInt(1);
        bundle.writeToParcel(parcelLJJJZ, 0);
        Parcel parcelLLILLIZIL = LLILLIZIL(12, parcelLJJJZ);
        Bundle bundle2 = (Bundle) C1779490wPL.LIZ(parcelLLILLIZIL, Bundle.CREATOR);
        parcelLLILLIZIL.recycle();
        return bundle2;
    }

    @Override // X.InterfaceC2200631BAv
    public final void R0(String str, Bundle bundle, C1B9W c1b9w) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeInt(18);
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeInt(1);
        bundle.writeToParcel(parcelLJJJZ, 0);
        parcelLJJJZ.writeStrongBinder(c1b9w);
        LLLIIL(1301, parcelLJJJZ);
    }

    @Override // X.InterfaceC2200631BAv
    public final void h1(String str, Bundle bundle, C1B9S c1b9s) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeInt(27);
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeInt(1);
        bundle.writeToParcel(parcelLJJJZ, 0);
        parcelLJJJZ.writeStrongBinder(c1b9s);
        LLLLII(1901, parcelLJJJZ);
    }

    @Override // X.InterfaceC2200631BAv
    public final Bundle s0(String str, String str2, String str3) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeInt(3);
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeString(str2);
        parcelLJJJZ.writeString(str3);
        Parcel parcelLLILLIZIL = LLILLIZIL(4, parcelLJJJZ);
        Bundle bundle = (Bundle) C1779490wPL.LIZ(parcelLLILLIZIL, Bundle.CREATOR);
        parcelLLILLIZIL.recycle();
        return bundle;
    }

    @Override // X.InterfaceC2200631BAv
    public final int LJLLLL(int i, String str, String str2, Bundle bundle) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeInt(i);
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeString(str2);
        parcelLJJJZ.writeInt(1);
        bundle.writeToParcel(parcelLJJJZ, 0);
        Parcel parcelLLILLIZIL = LLILLIZIL(10, parcelLJJJZ);
        int i2 = parcelLLILLIZIL.readInt();
        parcelLLILLIZIL.recycle();
        return i2;
    }

    @Override // X.InterfaceC2200631BAv
    public final Bundle G0(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeInt(i);
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeString(str2);
        parcelLJJJZ.writeInt(1);
        bundle.writeToParcel(parcelLJJJZ, 0);
        parcelLJJJZ.writeInt(1);
        bundle2.writeToParcel(parcelLJJJZ, 0);
        Parcel parcelLLILLIZIL = LLILLIZIL(901, parcelLJJJZ);
        Bundle bundle3 = (Bundle) C1779490wPL.LIZ(parcelLLILLIZIL, Bundle.CREATOR);
        parcelLLILLIZIL.recycle();
        return bundle3;
    }

    @Override // X.InterfaceC2200631BAv
    public final Bundle n0(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeInt(i);
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeString(str2);
        parcelLJJJZ.writeString(str3);
        parcelLJJJZ.writeInt(1);
        bundle.writeToParcel(parcelLJJJZ, 0);
        Parcel parcelLLILLIZIL = LLILLIZIL(11, parcelLJJJZ);
        Bundle bundle2 = (Bundle) C1779490wPL.LIZ(parcelLLILLIZIL, Bundle.CREATOR);
        parcelLLILLIZIL.recycle();
        return bundle2;
    }

    @Override // X.InterfaceC2200631BAv
    public final Bundle q0(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeInt(i);
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeString(str2);
        parcelLJJJZ.writeString(str3);
        parcelLJJJZ.writeString(null);
        parcelLJJJZ.writeInt(1);
        bundle.writeToParcel(parcelLJJJZ, 0);
        Parcel parcelLLILLIZIL = LLILLIZIL(8, parcelLJJJZ);
        Bundle bundle2 = (Bundle) C1779490wPL.LIZ(parcelLLILLIZIL, Bundle.CREATOR);
        parcelLLILLIZIL.recycle();
        return bundle2;
    }
}
