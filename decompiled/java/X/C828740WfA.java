package X;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: X.0WfA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C828740WfA extends C828660Wf2 implements InterfaceC828880WfO {
    @Override // X.InterfaceC828880WfO
    public final Account LIZ() {
        Parcel parcelLJJJZ = LJJJZ(2, LLILLIZIL());
        Account account = (Account) C828720Wf8.LIZ(parcelLJJJZ, Account.CREATOR);
        parcelLJJJZ.recycle();
        return account;
    }

    public C828740WfA(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }
}
