package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1BTN, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BTN extends AbstractC2203141BKm {
    public final Fragment LJ;
    public InterfaceC2190731AoZ LJFF;
    public Activity LJI;
    public final List LJII = new ArrayList();

    public final void LJFF() {
        Activity activity = this.LJI;
        if (activity == null || this.LJFF == null || this.LIZ != 0) {
            return;
        }
        try {
            synchronized (C1BTM.class) {
                C1BTM.LIZ(activity);
            }
            final C1BTX c1btxP = C829110Wfl.LIZ(this.LJI).p(new C0WH6(this.LJI));
            InterfaceC2190731AoZ interfaceC2190731AoZ = this.LJFF;
            final Fragment fragment = this.LJ;
            ((C2203151BKn) interfaceC2190731AoZ).LIZ(new C1BTZ(fragment, c1btxP) { // from class: X.1BTT
                public final Fragment LIZ;
                public final C1BTX LIZIZ;

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

                public final void LIZIZ(C1BTK c1btk) {
                    try {
                        this.LIZIZ.s(new C1BTJ(c1btk));
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
                        if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                            C20136913qh.LIZJ(bundle2, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
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

                {
                    C0W3J.LJIIIIZZ(c1btxP);
                    this.LIZIZ = c1btxP;
                    C0W3J.LJIIIIZZ(fragment);
                    this.LIZ = fragment;
                }

                @Override // X.C1BTZ
                public final void LIZ(Activity activity2, Bundle bundle, Bundle bundle2) {
                    try {
                        Bundle bundle3 = new Bundle();
                        C20136913qh.LIZIZ(bundle2, bundle3);
                        this.LIZIZ.LLJJJJ(new C0WH6(activity2), bundle3);
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
                        InterfaceC820590WGz interfaceC820590WGzLJJLIIIJILLIZJL = this.LIZIZ.LJJLIIIJILLIZJL(new C0WH6(layoutInflater), new C0WH6(viewGroup), bundle2);
                        C20136913qh.LIZIZ(bundle2, bundle);
                        return (View) C0WH6.LLLIIL(interfaceC820590WGzLJJLIIIJILLIZJL);
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new C829150Wfp(e);
                    }
                }
            });
            Iterator it2 = ((ArrayList) this.LJII).iterator();
            while (it2.hasNext()) {
                ((C1BTT) this.LIZ).LIZIZ((C1BTK) it2.next());
            }
            ((ArrayList) this.LJII).clear();
        } catch (C812710VuP e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (RemoteException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new C829150Wfp(e2);
        }
    }

    public C1BTN(Fragment fragment) {
        this.LJ = fragment;
    }

    @Override // X.AbstractC2203141BKm
    public final void LIZ(C2203151BKn c2203151BKn) {
        this.LJFF = c2203151BKn;
        LJFF();
    }
}
