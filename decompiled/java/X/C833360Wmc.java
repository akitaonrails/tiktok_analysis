package X;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: X.0Wmc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C833360Wmc implements IInterface {
    public final IBinder LL;
    public final String LLILLJJLI;

    public C833360Wmc(IBinder iBinder, String str) {
        this.LL = iBinder;
        this.LLILLJJLI = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LL;
    }
}
