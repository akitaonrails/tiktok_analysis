package X;

import X.AbstractC2203141BKm;
import X.C1BTP;
import X.C2145708at;
import X.C2205361BTa;
import X.C2205411BTf;
import X.C2205421BTg;
import X.C2205431BTh;
import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.SupportMapFragment;
import java.util.ArrayList;
import jv6.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS400S0200000_34;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: renamed from: X.1BTQ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BTQ implements InterfaceC1176690gj5 {
    public final C1203050hPb LIZ;
    public SupportMapFragment LIZIZ;
    public C2205361BTa LIZJ;

    @Override // X.InterfaceC1176690gj5
    public final Fragment LIZIZ() throws Throwable {
        SupportMapFragment supportMapFragmentMR;
        Object obj;
        Context context;
        GoogleMapOptions googleMapOptionsLIZ = C1203070hPd.LIZ(this.LIZ);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOepc9HN0yDVHkdQvRCEcOY+CmR3zWqhqg==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {googleMapOptionsLIZ};
        C0WZW c0wzw = new C0WZW(false, "(Lcom/google/android/gms/maps/GoogleMapOptions;)Lcom/google/android/gms/maps/SupportMapFragment;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11525, "com/google/android/gms/maps/SupportMapFragment", "newInstance", SupportMapFragment.class, objArr, "com.google.android.gms.maps.SupportMapFragment", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11525, "com/google/android/gms/maps/SupportMapFragment", "newInstance", null, objArr, SupportMapFragment.class, c0wzw, false);
            supportMapFragmentMR = (SupportMapFragment) c0wsuLIZIZ.LIZIZ;
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null && (obj = objArr2[0]) != null) {
                googleMapOptionsLIZ = (GoogleMapOptions) obj;
            }
            supportMapFragmentMR = SupportMapFragment.MR(googleMapOptionsLIZ);
            c0wst.LIZ(11525, "com/google/android/gms/maps/SupportMapFragment", "newInstance", supportMapFragmentMR, objArr, SupportMapFragment.class, c0wzw, true);
        }
        this.LIZIZ = supportMapFragmentMR;
        if (supportMapFragmentMR != null && (context = supportMapFragmentMR.getContext()) != null) {
            a.LIZLLL(context);
        }
        return this.LIZIZ;
    }

    public C1BTQ(C1203050hPb c1203050hPb) {
        this.LIZ = c1203050hPb;
    }

    @Override // X.InterfaceC1176690gj5
    public final void X(Function1<? super InterfaceC1177250gjz, Unit> function1) {
        final AwS400S0200000_34 awS400S0200000_34 = new AwS400S0200000_34(this, (C1BTQ) function1, (Function1<? super InterfaceC1177250gjz, Unit>) 39);
        SupportMapFragment supportMapFragment = this.LIZIZ;
        if (supportMapFragment != null) {
            new C1BTS(supportMapFragment, new AwS613S0100000_34(awS400S0200000_34, 134));
            return;
        }
        C2205361BTa c2205361BTa = this.LIZJ;
        if (c2205361BTa == null) {
            return;
        }
        InterfaceC2205441BTi interfaceC2205441BTi = new InterfaceC2205441BTi() { // from class: X.1BTb
            @Override // X.InterfaceC2205441BTi
            public final void LIZ(C1BSM c1bsm) {
                awS400S0200000_34.invoke(c1bsm);
            }
        };
        C0W3J.LJ("getMapAsync() must be called on the main thread");
        C1BTP c1btp = c2205361BTa.LL;
        T t = c1btp.LIZ;
        if (t != 0) {
            try {
                ((C1BTU) t).LIZIZ.LJJIII(new BinderC2205391BTd(interfaceC2205441BTi));
                return;
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new C829150Wfp(e);
            }
        }
        ((ArrayList) c1btp.LJIIIIZZ).add(interfaceC2205441BTi);
    }

    @Override // X.InterfaceC1176690gj5
    public final View LIZ(Context context, LifecycleOwner lifecycleOwner) {
        C2205361BTa c2205361BTa = new C2205361BTa(context, C1203070hPd.LIZ(this.LIZ));
        this.LIZJ = c2205361BTa;
        Context context2 = c2205361BTa.getContext();
        if (context2 != null) {
            a.LIZLLL(context2);
        }
        final C2205361BTa c2205361BTa2 = this.LIZJ;
        if (c2205361BTa2 != null) {
            lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.map.core.MapHelperKt$attachLifecycle$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    switch (C2145708at.LIZ[event.ordinal()]) {
                        case 1:
                            C2205361BTa c2205361BTa3 = c2205361BTa2;
                            c2205361BTa3.getClass();
                            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
                            try {
                                C1BTP c1btp = c2205361BTa3.LL;
                                c1btp.getClass();
                                c1btp.LJ(null, new C2205411BTf(c1btp, null));
                                if (c2205361BTa3.LL.LIZ == 0) {
                                    AbstractC2203141BKm.LIZJ(c2205361BTa3);
                                    break;
                                }
                                StrictMode.setThreadPolicy(threadPolicy);
                                return;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                StrictMode.setThreadPolicy(threadPolicy);
                                throw th;
                            }
                        case 2:
                            C1BTP c1btp2 = c2205361BTa2.LL;
                            c1btp2.getClass();
                            c1btp2.LJ(null, new C2205421BTg(c1btp2));
                            return;
                        case 3:
                            C1BTP c1btp3 = c2205361BTa2.LL;
                            c1btp3.getClass();
                            c1btp3.LJ(null, new C2205431BTh(c1btp3));
                            return;
                        case 4:
                            C1BTP c1btp4 = c2205361BTa2.LL;
                            T t = c1btp4.LIZ;
                            if (t != 0) {
                                t.onPause();
                                return;
                            } else {
                                c1btp4.LIZLLL(5);
                                return;
                            }
                        case 5:
                            C1BTP c1btp5 = c2205361BTa2.LL;
                            T t2 = c1btp5.LIZ;
                            if (t2 != 0) {
                                t2.onStop();
                                return;
                            } else {
                                c1btp5.LIZLLL(4);
                                return;
                            }
                        case 6:
                            C1BTP c1btp6 = c2205361BTa2.LL;
                            T t3 = c1btp6.LIZ;
                            if (t3 != 0) {
                                t3.onDestroy();
                                return;
                            } else {
                                c1btp6.LIZLLL(1);
                                return;
                            }
                        default:
                            return;
                    }
                }
            });
        }
        return this.LIZJ;
    }
}
