package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.IsReadyToPayRequest;

/* JADX INFO: renamed from: X.0WnG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class C833760WnG implements InterfaceC831290WjH {
    public final /* synthetic */ IsReadyToPayRequest LIZ;

    public /* synthetic */ C833760WnG(IsReadyToPayRequest isReadyToPayRequest) {
        this.LIZ = isReadyToPayRequest;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC831290WjH
    public final void LIZ(InterfaceC831160Wj4 interfaceC831160Wj4, Object obj) {
        IsReadyToPayRequest isReadyToPayRequest = this.LIZ;
        C833630Wn3 c833630Wn3 = (C833630Wn3) interfaceC831160Wj4;
        final C835520Wq6 c835520Wq6 = (C835520Wq6) obj;
        c833630Wn3.getClass();
        BinderC833790WnJ binderC833790WnJ = new BinderC833790WnJ(c835520Wq6) { // from class: X.0WnI
            public final C835520Wq6 LL;

            {
                this.LL = c835520Wq6;
            }

            @Override // X.BinderC833790WnJ, X.InterfaceC834870Wp3
            public final void LLLII(int i, boolean z) {
                C832640WlS.LIZ(new Status(i, null), Boolean.valueOf(z), this.LL);
            }

            @Override // X.BinderC833790WnJ, X.InterfaceC834870Wp3
            public final void m(Status status, boolean z) {
                C832640WlS.LIZ(status, Boolean.valueOf(z), this.LL);
            }
        };
        try {
            C833660Wn6 c833660Wn6 = (C833660Wn6) c833630Wn3.getService();
            Bundle bundleLJ = c833630Wn3.LJ();
            c833660Wn6.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            C833770WnH.LIZIZ(parcelObtain, isReadyToPayRequest);
            C833770WnH.LIZIZ(parcelObtain, bundleLJ);
            parcelObtain.writeStrongBinder(binderC833790WnJ);
            try {
                c833660Wn6.LL.transact(14, parcelObtain, null, 1);
                parcelObtain.recycle();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                parcelObtain.recycle();
                throw th;
            }
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            binderC833790WnJ.m(Status.RESULT_INTERNAL_ERROR, false);
        }
    }
}
