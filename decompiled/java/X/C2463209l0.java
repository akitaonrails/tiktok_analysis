package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: renamed from: X.09l0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2463209l0 extends C2463309l1 implements InterfaceC2459209kM {
    public C2463209l0(IBinder iBinder) {
        super(iBinder);
    }

    @Override // X.InterfaceC2459209kM
    public final void K0(String str, int i, Bundle bundle, BinderC2467909ll binderC2467909ll) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        parcelObtain.writeString(str);
        parcelObtain.writeInt(i);
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(binderC2467909ll);
        LJJJZ(4, parcelObtain);
    }

    @Override // X.InterfaceC2459209kM
    public final void LLLF(String str, List list, Bundle bundle, BinderC2468109ln binderC2468109ln) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        parcelObtain.writeString(str);
        parcelObtain.writeTypedList(list);
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(binderC2468109ln);
        LJJJZ(7, parcelObtain);
    }

    @Override // X.InterfaceC2459209kM
    public final void LLLI(String str, List list, Bundle bundle, BinderC2468009lm binderC2468009lm) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        parcelObtain.writeString(str);
        parcelObtain.writeTypedList(list);
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(binderC2468009lm);
        LJJJZ(8, parcelObtain);
    }

    @Override // X.InterfaceC2459209kM
    public final void LLLLLLJ(String str, List list, Bundle bundle, BinderC2467809lk binderC2467809lk) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        parcelObtain.writeString(str);
        parcelObtain.writeTypedList(list);
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(binderC2467809lk);
        LJJJZ(2, parcelObtain);
    }
}
