package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: renamed from: X.1BTV, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BTV implements C1BTZ {
    public final Fragment LIZ;
    public final C1BTW LIZIZ;

    @Override // X.C1BTZ
    public final void onDestroy() {
        try {
            this.LIZIZ.onDestroy();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    @Override // X.C1BTZ
    public final void onDestroyView() {
        try {
            this.LIZIZ.onDestroyView();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    @Override // X.C1BTZ
    public final void onLowMemory() {
        try {
            this.LIZIZ.onLowMemory();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    @Override // X.C1BTZ
    public final void onPause() {
        try {
            this.LIZIZ.onPause();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    @Override // X.C1BTZ
    public final void onResume() {
        try {
            this.LIZIZ.onResume();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    @Override // X.C1BTZ
    public final void onStart() {
        try {
            this.LIZIZ.onStart();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    @Override // X.C1BTZ
    public final void onStop() {
        try {
            this.LIZIZ.onStop();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    @Override // X.C1BTZ
    public final void onCreate(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C20136913qh.LIZIZ(bundle, bundle2);
            Bundle arguments = this.LIZ.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                C20136913qh.LIZJ(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            this.LIZIZ.onCreate(bundle2);
            C20136913qh.LIZIZ(bundle2, bundle);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    @Override // X.C1BTZ
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C20136913qh.LIZIZ(bundle, bundle2);
            this.LIZIZ.onSaveInstanceState(bundle2);
            C20136913qh.LIZIZ(bundle2, bundle);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    public C1BTV(Fragment fragment, C1BTW c1btw) {
        this.LIZIZ = c1btw;
        C0W3J.LJIIIIZZ(fragment);
        this.LIZ = fragment;
    }

    @Override // X.C1BTZ
    public final void LIZ(Activity activity, Bundle bundle, Bundle bundle2) {
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
        try {
            Bundle bundle3 = new Bundle();
            C20136913qh.LIZIZ(bundle2, bundle3);
            this.LIZIZ.LLJILLL(new C0WH6(activity), googleMapOptions, bundle3);
            C20136913qh.LIZIZ(bundle3, bundle2);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    @Override // X.C1BTZ
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C20136913qh.LIZIZ(bundle, bundle2);
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
            try {
                InterfaceC820590WGz interfaceC820590WGzLJJLIIIJILLIZJL = this.LIZIZ.LJJLIIIJILLIZJL(new C0WH6(layoutInflater), new C0WH6(viewGroup), bundle2);
                StrictMode.setThreadPolicy(threadPolicy);
                C20136913qh.LIZIZ(bundle2, bundle);
                return (View) C0WH6.LLLIIL(interfaceC820590WGzLJJLIIIJILLIZJL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }
}
