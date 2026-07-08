package X;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;

/* JADX INFO: renamed from: X.0Wl2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C832380Wl2 extends AbstractC832400Wl4<C832780Wlg> implements InterfaceC831550Wjh {
    public static final /* synthetic */ int LLILZIL = 0;
    public final boolean LL;
    public final C831470WjZ LLILLJJLI;
    public final Bundle LLILLL;
    public final Integer LLILZ;

    @Override // X.AbstractC832390Wl3, X.InterfaceC831160Wj4
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // X.AbstractC832390Wl3
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // X.AbstractC832390Wl3
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // X.AbstractC832390Wl3, X.InterfaceC831160Wj4
    public final boolean requiresSignIn() {
        return this.LL;
    }

    @Override // X.InterfaceC831550Wjh
    public final void LIZ() {
        connect(new C832560WlK(this));
    }

    @Override // X.AbstractC832390Wl3
    public final Bundle getGetServiceRequestExtraArgs() {
        if (!this.zzl.getPackageName().equals(this.LLILLJJLI.LJFF)) {
            C786410Ut5.LJJJI("com.google.android.gms.signin.internal.realClientPackageName", this.LLILLJJLI.LJFF, this.LLILLL);
        }
        return this.LLILLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC831550Wjh
    public final void LIZJ() {
        try {
            C832590WlN c832590WlN = (C832590WlN) getService();
            Integer num = this.LLILZ;
            C0W3J.LJIIIIZZ(num);
            int iIntValue = num.intValue();
            c832590WlN.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(c832590WlN.LLILLJJLI);
            parcelObtain.writeInt(iIntValue);
            c832590WlN.LJJJZ(7, parcelObtain);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC831550Wjh
    public final void LIZLLL(InterfaceC831710Wjx interfaceC831710Wjx) {
        GoogleSignInAccount googleSignInAccountLIZJ;
        C0W3J.LJIIIZ(interfaceC831710Wjx, "Expecting a valid ISignInCallbacks");
        try {
            Account account = this.LLILLJJLI.LIZ;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccountLIZJ = C832370Wl1.LIZIZ(this.zzl).LIZJ();
            } else {
                googleSignInAccountLIZJ = null;
            }
            Integer num = this.LLILZ;
            C0W3J.LJIIIIZZ(num);
            zat zatVar = new zat(2, account, num.intValue(), googleSignInAccountLIZJ);
            C832590WlN c832590WlN = (C832590WlN) getService();
            zai zaiVar = new zai(1, zatVar);
            c832590WlN.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(c832590WlN.LLILLJJLI);
            parcelObtain.writeInt(1);
            zaiVar.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(interfaceC831710Wjx.asBinder());
            c832590WlN.LJJJZ(12, parcelObtain);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                interfaceC831710Wjx.LLFFF(new zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException e2) {
                TryCatchGuardChecker.doCheck(e2);
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // X.AbstractC832390Wl3
    public final /* synthetic */ IInterface createServiceInterface(final IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (iInterfaceQueryLocalInterface instanceof C832780Wlg) {
            return iInterfaceQueryLocalInterface;
        }
        return new C832590WlN(iBinder) { // from class: X.0Wlg
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC831550Wjh
    public final void LIZIZ(InterfaceC828880WfO interfaceC828880WfO, boolean z) {
        try {
            C832590WlN c832590WlN = (C832590WlN) getService();
            Integer num = this.LLILZ;
            C0W3J.LJIIIIZZ(num);
            int iIntValue = num.intValue();
            c832590WlN.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(c832590WlN.LLILLJJLI);
            parcelObtain.writeStrongBinder(interfaceC828880WfO.asBinder());
            parcelObtain.writeInt(iIntValue);
            parcelObtain.writeInt(z ? 1 : 0);
            c832590WlN.LJJJZ(9, parcelObtain);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C832380Wl2(Context context, Looper looper, C831470WjZ c831470WjZ, Bundle bundle, InterfaceC832260Wkq interfaceC832260Wkq, InterfaceC832270Wkr interfaceC832270Wkr) {
        super(context, looper, 44, c831470WjZ, interfaceC832260Wkq, interfaceC832270Wkr);
        this.LL = true;
        this.LLILLJJLI = c831470WjZ;
        this.LLILLL = bundle;
        this.LLILZ = c831470WjZ.LJIIIIZZ;
    }
}
