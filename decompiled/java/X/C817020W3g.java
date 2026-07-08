package X;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: X.0W3g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C817020W3g implements IInterface {
    public final IBinder LL;

    public C817020W3g(IBinder iBinder) {
        this.LL = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LL;
    }
}
