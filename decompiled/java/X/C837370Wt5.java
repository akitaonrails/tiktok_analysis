package X;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: X.0Wt5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C837370Wt5 implements IInterface {
    public final IBinder LL;

    public C837370Wt5(IBinder iBinder) {
        this.LL = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LL;
    }
}
