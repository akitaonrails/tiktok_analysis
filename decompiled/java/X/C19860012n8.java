package X;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: X.12n8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19860012n8 implements IInterface {
    public final IBinder LL;
    public final String LLILLJJLI = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    public C19860012n8(IBinder iBinder) {
        this.LL = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LL;
    }
}
