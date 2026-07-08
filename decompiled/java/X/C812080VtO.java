package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: X.0VtO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C812080VtO extends C812090VtP implements InterfaceC811930Vt9 {
    public C812080VtO(IBinder iBinder) {
        super(iBinder);
    }

    @Override // X.InterfaceC811930Vt9
    public final void LLLJL(Bundle bundle, BinderC812190VtZ binderC812190VtZ) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.LLILLJJLI);
        C812480Vu2.LIZJ(parcelObtain, bundle);
        parcelObtain.writeStrongBinder(binderC812190VtZ);
        LJJJZ(1, parcelObtain);
    }

    @Override // X.InterfaceC811930Vt9
    public final void LLLLL(Bundle bundle, BinderC812110VtR binderC812110VtR) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.LLILLJJLI);
        C812480Vu2.LIZJ(parcelObtain, bundle);
        parcelObtain.writeStrongBinder(binderC812110VtR);
        LJJJZ(3, parcelObtain);
    }

    @Override // X.InterfaceC811930Vt9
    public final void O0(Bundle bundle, BinderC812180VtY binderC812180VtY) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.LLILLJJLI);
        C812480Vu2.LIZJ(parcelObtain, bundle);
        parcelObtain.writeStrongBinder(binderC812180VtY);
        LJJJZ(4, parcelObtain);
    }

    @Override // X.InterfaceC811930Vt9
    public final void g(Bundle bundle, BinderC812170VtX binderC812170VtX) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.LLILLJJLI);
        C812480Vu2.LIZJ(parcelObtain, bundle);
        parcelObtain.writeStrongBinder(binderC812170VtX);
        LJJJZ(2, parcelObtain);
    }
}
