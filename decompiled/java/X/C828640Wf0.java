package X;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: X.0Wf0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C828640Wf0 extends C828660Wf2 {
    public C828640Wf0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final InterfaceC820590WGz LLLIIL(C0WH6 c0wh6, String str, int i) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C828720Wf8.LIZJ(parcelLLILLIZIL, c0wh6);
        parcelLLILLIZIL.writeString(str);
        parcelLLILLIZIL.writeInt(i);
        Parcel parcelLJJJZ = LJJJZ(2, parcelLLILLIZIL);
        InterfaceC820590WGz interfaceC820590WGzLLILLIZIL = AbstractBinderC828770WfD.LLILLIZIL(parcelLJJJZ.readStrongBinder());
        parcelLJJJZ.recycle();
        return interfaceC820590WGzLLILLIZIL;
    }

    public final InterfaceC820590WGz x(C0WH6 c0wh6, String str, int i) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C828720Wf8.LIZJ(parcelLLILLIZIL, c0wh6);
        parcelLLILLIZIL.writeString(str);
        parcelLLILLIZIL.writeInt(i);
        Parcel parcelLJJJZ = LJJJZ(4, parcelLLILLIZIL);
        InterfaceC820590WGz interfaceC820590WGzLLILLIZIL = AbstractBinderC828770WfD.LLILLIZIL(parcelLJJJZ.readStrongBinder());
        parcelLJJJZ.recycle();
        return interfaceC820590WGzLLILLIZIL;
    }

    public final InterfaceC820590WGz LLLLII(C0WH6 c0wh6, String str, int i, C0WH6 c0wh62) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C828720Wf8.LIZJ(parcelLLILLIZIL, c0wh6);
        parcelLLILLIZIL.writeString(str);
        parcelLLILLIZIL.writeInt(i);
        C828720Wf8.LIZJ(parcelLLILLIZIL, c0wh62);
        Parcel parcelLJJJZ = LJJJZ(8, parcelLLILLIZIL);
        InterfaceC820590WGz interfaceC820590WGzLLILLIZIL = AbstractBinderC828770WfD.LLILLIZIL(parcelLJJJZ.readStrongBinder());
        parcelLJJJZ.recycle();
        return interfaceC820590WGzLLILLIZIL;
    }

    public final InterfaceC820590WGz m0(C0WH6 c0wh6, String str, boolean z, long j) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C828720Wf8.LIZJ(parcelLLILLIZIL, c0wh6);
        parcelLLILLIZIL.writeString(str);
        parcelLLILLIZIL.writeInt(z ? 1 : 0);
        parcelLLILLIZIL.writeLong(j);
        Parcel parcelLJJJZ = LJJJZ(7, parcelLLILLIZIL);
        InterfaceC820590WGz interfaceC820590WGzLLILLIZIL = AbstractBinderC828770WfD.LLILLIZIL(parcelLJJJZ.readStrongBinder());
        parcelLJJJZ.recycle();
        return interfaceC820590WGzLLILLIZIL;
    }
}
