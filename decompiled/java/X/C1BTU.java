package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1BTU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BTU implements C1BTZ {
    public final ViewGroup LIZ;
    public final C1BTY LIZIZ;
    public View LIZJ;

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
        throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
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
            this.LIZIZ.onCreate(bundle2);
            C20136913qh.LIZIZ(bundle2, bundle);
            this.LIZJ = (View) C0WH6.LLLIIL(this.LIZIZ.getView());
            C786410Ut5.LJJJJI(this.LIZ);
            this.LIZ.addView(this.LIZJ);
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

    public C1BTU(ViewGroup viewGroup, C1BTY c1bty) {
        this.LIZIZ = c1bty;
        C0W3J.LJIIIIZZ(viewGroup);
        this.LIZ = viewGroup;
    }

    @Override // X.C1BTZ
    public final void LIZ(Activity activity, Bundle bundle, Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
    }

    @Override // X.C1BTZ
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
    }
}
