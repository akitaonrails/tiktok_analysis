package X;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: X.0WkL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C831950WkL extends AbstractDialogInterfaceOnCancelListenerC829260Wg0 {
    public final SparseArray<C832070WkX> LLILZLL;

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void LJII() {
        this.LLILLJJLI = true;
        new StringBuilder(String.valueOf(this.LLILZLL).length() + 14);
        if (this.LLILLL.get() == null) {
            for (int i = 0; i < this.LLILZLL.size(); i++) {
                C832070WkX c832070WkXLJIILIIL = LJIILIIL(i);
                if (c832070WkXLJIILIIL != null) {
                    c832070WkXLJIILIIL.LLILLJJLI.LIZLLL();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void LJIIIIZZ() {
        this.LLILLJJLI = false;
        for (int i = 0; i < this.LLILZLL.size(); i++) {
            C832070WkX c832070WkXLJIILIIL = LJIILIIL(i);
            if (c832070WkXLJIILIIL != null) {
                c832070WkXLJIILIIL.LLILLJJLI.LJ();
            }
        }
    }

    @Override // X.AbstractDialogInterfaceOnCancelListenerC829260Wg0
    public final void LJIIJ() {
        for (int i = 0; i < this.LLILZLL.size(); i++) {
            C832070WkX c832070WkXLJIILIIL = LJIILIIL(i);
            if (c832070WkXLJIILIIL != null) {
                c832070WkXLJIILIIL.LLILLJJLI.LIZLLL();
            }
        }
    }

    public C831950WkL(InterfaceC831130Wj1 interfaceC831130Wj1) {
        super(interfaceC831130Wj1, GoogleApiAvailability.getInstance());
        this.LLILZLL = new SparseArray<>();
        interfaceC831130Wj1.jM("AutoManageHelper", this);
    }

    public final C832070WkX LJIILIIL(int i) {
        if (this.LLILZLL.size() <= i) {
            return null;
        }
        SparseArray<C832070WkX> sparseArray = this.LLILZLL;
        return sparseArray.get(sparseArray.keyAt(i));
    }

    @Override // X.AbstractDialogInterfaceOnCancelListenerC829260Wg0
    public final void LJIIIZ(ConnectionResult connectionResult, int i) {
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        C832070WkX c832070WkX = this.LLILZLL.get(i);
        if (c832070WkX != null) {
            C832070WkX c832070WkX2 = this.LLILZLL.get(i);
            this.LLILZLL.remove(i);
            if (c832070WkX2 != null) {
                c832070WkX2.LLILLJJLI.LJIILJJIL(c832070WkX2);
                c832070WkX2.LLILLJJLI.LJ();
            }
            InterfaceC832270Wkr interfaceC832270Wkr = c832070WkX.LLILLL;
            if (interfaceC832270Wkr != null) {
                interfaceC832270Wkr.LJJJZ(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void LIZ(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.LLILZLL.size(); i++) {
            C832070WkX c832070WkXLJIILIIL = LJIILIIL(i);
            if (c832070WkXLJIILIIL != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(c832070WkXLJIILIIL.LL);
                printWriter.println(":");
                c832070WkXLJIILIIL.LLILLJJLI.LJFF(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }
}
