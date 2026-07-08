package X;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: X.09kx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2462909kx implements IInterface {
    public final IBinder LL;
    public final String LLILLJJLI = "com.google.android.play.agesignals.protocol.IAgeSignalsService";

    public C2462909kx(IBinder iBinder) {
        this.LL = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LL;
    }
}
