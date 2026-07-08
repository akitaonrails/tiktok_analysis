package X;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: X.0WmB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C833090WmB implements IInterface {
    public final IBinder LL;
    public final String LLILLJJLI = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";

    public C833090WmB(IBinder iBinder) {
        this.LL = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LL;
    }
}
