package X;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: X.0Wf9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C828730Wf9 extends C828660Wf2 implements InterfaceC828830WfJ {
    @Override // X.InterfaceC828830WfJ
    public final int LIZIZ() {
        Parcel parcelLJJJZ = LJJJZ(2, LLILLIZIL());
        int i = parcelLJJJZ.readInt();
        parcelLJJJZ.recycle();
        return i;
    }

    @Override // X.InterfaceC828830WfJ
    public final InterfaceC820590WGz LIZLLL() {
        Parcel parcelLJJJZ = LJJJZ(1, LLILLIZIL());
        InterfaceC820590WGz interfaceC820590WGzLLILLIZIL = AbstractBinderC828770WfD.LLILLIZIL(parcelLJJJZ.readStrongBinder());
        parcelLJJJZ.recycle();
        return interfaceC820590WGzLLILLIZIL;
    }

    public C828730Wf9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }
}
