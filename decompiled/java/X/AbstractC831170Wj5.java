package X;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: X.0Wj5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC831170Wj5 {
    public final int LIZ;

    public AbstractC831170Wj5(int i) {
        this.LIZ = i;
    }

    public abstract void LIZ(Status status);

    public abstract void LIZIZ(Exception exc);

    public abstract void LIZJ(C831140Wj2<?> c831140Wj2);

    public abstract void LIZLLL(C831150Wj3 c831150Wj3, boolean z);

    public static /* bridge */ /* synthetic */ Status LJ(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }
}
