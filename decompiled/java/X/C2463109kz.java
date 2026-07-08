package X;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: X.09kz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2463109kz implements IInterface {
    public final IBinder LL;

    public C2463109kz(IBinder iBinder) {
        this.LL = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LL;
    }
}
