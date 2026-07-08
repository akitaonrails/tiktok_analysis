package X;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zak;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0Wjs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractBinderC831660Wjs extends BinderC831700Wjw implements InterfaceC831710Wjx {
    public AbstractBinderC831660Wjs() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // X.BinderC831700Wjw
    public final boolean LLILLIZIL(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                C0W0K.LIZ(parcel, ConnectionResult.CREATOR);
                C0W0K.LIZ(parcel, zaa.CREATOR);
                break;
            case 4:
                C0W0K.LIZ(parcel, Status.CREATOR);
                break;
            case 5:
            default:
                return false;
            case 6:
                C0W0K.LIZ(parcel, Status.CREATOR);
                break;
            case 7:
                C0W0K.LIZ(parcel, Status.CREATOR);
                C0W0K.LIZ(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                LLFFF((zak) C0W0K.LIZ(parcel, zak.CREATOR));
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                C0W0K.LIZ(parcel, zag.CREATOR);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
