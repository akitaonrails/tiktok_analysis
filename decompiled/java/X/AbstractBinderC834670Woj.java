package X;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: X.0Woj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractBinderC834670Woj extends BinderC832650WlT implements InterfaceC834800Wow {
    public AbstractBinderC834670Woj() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // X.BinderC832650WlT
    public final boolean LJJJZ(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 101:
                C834680Wok.LIZ(parcel, GoogleSignInAccount.CREATOR);
                C834680Wok.LIZ(parcel, Status.CREATOR);
                C834680Wok.LIZIZ(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) C834680Wok.LIZ(parcel, Status.CREATOR);
                C834680Wok.LIZIZ(parcel);
                LLLIL(status);
                break;
            case 103:
                Status status2 = (Status) C834680Wok.LIZ(parcel, Status.CREATOR);
                C834680Wok.LIZIZ(parcel);
                LLLIIIL(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
