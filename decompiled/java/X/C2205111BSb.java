package X;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: X.1BSb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2205111BSb extends C1B9K implements C1BSF {
    @Override // X.C1BSF
    public final int LJIIJJI() {
        Parcel parcelLJJJZ = LJJJZ(18, LLILLIZIL());
        int i = parcelLJJJZ.readInt();
        parcelLJJJZ.recycle();
        return i;
    }

    @Override // X.C1BSF
    public final void LJIILL() {
        LLLIIL(1, LLILLIZIL());
    }

    public C2205111BSb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    @Override // X.C1BSF
    public final boolean LJLIL(C1BSF c1bsf) {
        boolean z;
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, c1bsf);
        Parcel parcelLJJJZ = LJJJZ(17, parcelLLILLIZIL);
        if (parcelLJJJZ.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        parcelLJJJZ.recycle();
        return z;
    }
}
