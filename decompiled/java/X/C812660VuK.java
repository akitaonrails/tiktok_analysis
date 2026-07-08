package X;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: X.0VuK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C812660VuK extends C812670VuL implements InterfaceC812680VuM {
    public C812660VuK(IBinder iBinder) {
        super(iBinder);
    }

    @Override // X.InterfaceC812680VuM
    public final String getId() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.LLILLJJLI);
        Parcel parcelLJJJZ = LJJJZ(1, parcelObtain);
        String string = parcelLJJJZ.readString();
        parcelLJJJZ.recycle();
        return string;
    }

    @Override // X.InterfaceC812680VuM
    public final boolean LLLZL(boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.LLILLJJLI);
        boolean z2 = true;
        parcelObtain.writeInt(1);
        Parcel parcelLJJJZ = LJJJZ(2, parcelObtain);
        if (parcelLJJJZ.readInt() == 0) {
            z2 = false;
        }
        parcelLJJJZ.recycle();
        return z2;
    }
}
