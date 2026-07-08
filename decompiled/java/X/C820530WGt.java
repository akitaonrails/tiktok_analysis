package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: X.0WGt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820530WGt extends C820540WGu implements InterfaceC19812412fS {
    @Override // X.InterfaceC19812412fS
    public final int zza() {
        Parcel parcelLLILLIZIL = LLILLIZIL(2, LJJJZ());
        int i = parcelLLILLIZIL.readInt();
        parcelLLILLIZIL.recycle();
        return i;
    }

    public C820530WGt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // X.InterfaceC19812412fS
    public final void LJLL(long j, String str, String str2, Bundle bundle) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeString(str2);
        C0W8X.LIZJ(parcelLJJJZ, bundle);
        parcelLJJJZ.writeLong(j);
        LLLIIL(1, parcelLJJJZ);
    }
}
