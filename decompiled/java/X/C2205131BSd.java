package X;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: X.1BSd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2205131BSd extends C1B9K implements C1BSP {
    @Override // X.C1BSP
    public final void LL() {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        parcelLLILLIZIL.writeInt(0);
        LLLIIL(18, parcelLLILLIZIL);
    }

    @Override // X.C1BSP
    public final void LLLLIIL() {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        parcelLLILLIZIL.writeInt(0);
        LLLIIL(3, parcelLLILLIZIL);
    }

    @Override // X.C1BSP
    public final void LLLLIL() {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        parcelLLILLIZIL.writeInt(0);
        LLLIIL(2, parcelLLILLIZIL);
    }

    public C2205131BSd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    @Override // X.C1BSP
    public final void LLJLLL(boolean z) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        parcelLLILLIZIL.writeInt(z ? 1 : 0);
        LLLIIL(8, parcelLLILLIZIL);
    }

    @Override // X.C1BSP
    public final void S0(boolean z) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        parcelLLILLIZIL.writeInt(z ? 1 : 0);
        LLLIIL(20, parcelLLILLIZIL);
    }
}
