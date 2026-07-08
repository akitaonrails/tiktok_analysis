package X;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: renamed from: X.1B9M, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1B9M extends BinderC817640W5q implements C1B9O {
    public C1B9M() {
        super("com.android.vending.billing.IInAppBillingDelegateToBackendCallback");
    }

    @Override // X.BinderC817640W5q
    public final boolean LJJJZ(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Bundle bundle = (Bundle) C1779490wPL.LIZ(parcel, Bundle.CREATOR);
            BinderC817640W5q.LLILLIZIL(parcel);
            y0(bundle);
            return true;
        }
        return false;
    }
}
