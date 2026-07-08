package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;

/* JADX INFO: renamed from: X.0WfB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C828750WfB extends C828660Wf2 implements InterfaceC828860WfM {
    @Override // X.InterfaceC828860WfM
    public final boolean LIZJ() {
        Parcel parcelLJJJZ = LJJJZ(7, LLILLIZIL());
        boolean z = parcelLJJJZ.readInt() != 0;
        parcelLJJJZ.recycle();
        return z;
    }

    public C828750WfB(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // X.InterfaceC828860WfM
    public final zzq LLZLL(zzo zzoVar) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        parcelLLILLIZIL.writeInt(1);
        zzoVar.writeToParcel(parcelLLILLIZIL, 0);
        Parcel parcelLJJJZ = LJJJZ(6, parcelLLILLIZIL);
        zzq zzqVar = (zzq) C828720Wf8.LIZ(parcelLJJJZ, zzq.CREATOR);
        parcelLJJJZ.recycle();
        return zzqVar;
    }

    @Override // X.InterfaceC828860WfM
    public final boolean LLLLZLLLI(zzs zzsVar, C0WH6 c0wh6) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        boolean z = true;
        parcelLLILLIZIL.writeInt(1);
        zzsVar.writeToParcel(parcelLLILLIZIL, 0);
        C828720Wf8.LIZJ(parcelLLILLIZIL, c0wh6);
        Parcel parcelLJJJZ = LJJJZ(5, parcelLLILLIZIL);
        if (parcelLJJJZ.readInt() == 0) {
            z = false;
        }
        parcelLJJJZ.recycle();
        return z;
    }
}
