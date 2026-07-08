package X;

import android.os.Parcel;

/* JADX INFO: renamed from: X.0WfF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractBinderC828790WfF extends BinderC828780WfE implements InterfaceC828830WfJ {
    public static final /* synthetic */ int LL = 0;

    public AbstractBinderC828790WfF() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // X.BinderC828780WfE
    public final boolean LJJJZ(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int i2 = ((AbstractBinderC828800WfG) this).LLILLJJLI;
            parcel2.writeNoException();
            parcel2.writeInt(i2);
            return true;
        }
        InterfaceC820590WGz interfaceC820590WGzLIZLLL = ((AbstractBinderC828800WfG) this).LIZLLL();
        parcel2.writeNoException();
        C828720Wf8.LIZJ(parcel2, interfaceC820590WGzLIZLLL);
        return true;
    }
}
