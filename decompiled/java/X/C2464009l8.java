package X;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09l8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2464009l8 {
    public final InterfaceC2463809l6 LIZ;
    public final PendingIntent LIZIZ;

    public final IBinder LIZ() {
        InterfaceC2463809l6 interfaceC2463809l6 = this.LIZ;
        if (interfaceC2463809l6 != null) {
            return interfaceC2463809l6.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.LIZIZ;
        return pendingIntent != null ? pendingIntent.hashCode() : LIZ().hashCode();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof C2464009l8)) {
            return false;
        }
        C2464009l8 c2464009l8 = (C2464009l8) obj;
        PendingIntent pendingIntent = c2464009l8.LIZIZ;
        PendingIntent pendingIntent2 = this.LIZIZ;
        boolean z2 = true;
        if (pendingIntent2 == null) {
            z = true;
        } else {
            z = false;
        }
        if (pendingIntent != null) {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (pendingIntent2 != null) {
            return pendingIntent2.equals(pendingIntent);
        }
        return LIZ().equals(c2464009l8.LIZ());
    }

    public C2464009l8(InterfaceC2463809l6 interfaceC2463809l6, PendingIntent pendingIntent) {
        if (interfaceC2463809l6 == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.LIZ = interfaceC2463809l6;
        this.LIZIZ = pendingIntent;
        if (interfaceC2463809l6 != null) {
            new C0W58() { // from class: X.09l7
                @Override // X.C0W58
                public final void LIZJ(Bundle bundle) {
                    try {
                        this.LIZ.LIZ.LLJILJILJ(bundle);
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }

                @Override // X.C0W58
                public final void LIZ(Bundle bundle, String str) {
                    try {
                        this.LIZ.LIZ.LLJZIJLIL(bundle, str);
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }

                @Override // X.C0W58
                public final Bundle LIZIZ(Bundle bundle, String str) {
                    try {
                        return this.LIZ.LIZ.u(bundle, str);
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return null;
                    }
                }

                @Override // X.C0W58
                public final void LIZLLL(int i, Bundle bundle) {
                    try {
                        this.LIZ.LIZ.LLLILZJ(i, bundle);
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }

                @Override // X.C0W58
                public final void LJ(Bundle bundle, String str) {
                    try {
                        this.LIZ.LIZ.LLLFZ(bundle, str);
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }

                @Override // X.C0W58
                public final void LJFF(int i, Uri uri, boolean z, Bundle bundle) {
                    try {
                        this.LIZ.LIZ.LLLLLZL(i, uri, z, bundle);
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            };
        }
    }
}
