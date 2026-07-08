package X;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.FacebookSdk;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1BIo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2202641BIo {
    public static final C2202641BIo LIZ = new C2202641BIo();
    public static final HashMap<String, NsdManager.RegistrationListener> LIZIZ = new HashMap<>();

    public static final boolean LIZJ() {
        if (C807660VmG.LIZ(C2202641BIo.class)) {
            return false;
        }
        try {
            C1BJK c1bjk = (C1BJK) ((ConcurrentHashMap) C1BJL.LIZJ).get(FacebookSdk.LIZLLL());
            if (c1bjk != null) {
                return c1bjk.LIZJ.contains(C1BJP.Enabled);
            }
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static final void LIZ(String str) {
        if (C807660VmG.LIZ(C2202641BIo.class)) {
            return;
        }
        try {
            LIZ.LIZIZ(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZIZ(String str) {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            NsdManager.RegistrationListener registrationListener = LIZIZ.get(str);
            if (registrationListener != null) {
                Object objH2 = C786410Ut5.H2(FacebookSdk.LIZJ(), "servicediscovery");
                if (objH2 != null) {
                    try {
                        ((NsdManager) objH2).unregisterService(registrationListener);
                    } catch (IllegalArgumentException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    LIZIZ.remove(str);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final boolean LIZLLL(final String str) {
        if (C807660VmG.LIZ(this)) {
            return false;
        }
        try {
            HashMap<String, NsdManager.RegistrationListener> map = LIZIZ;
            if (map.containsKey(str)) {
                return true;
            }
            C786410Ut5.E2();
            String strLJIIJJI = Intrinsics.LJIIJJI(u.LJJI("17.0.0", '.', '|', false), "android-");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fbsdk_");
            sbLIZ.append(strLJIIJJI);
            sbLIZ.append('_');
            sbLIZ.append((Object) str);
            final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(strLIZIZ);
            nsdServiceInfo.setPort(80);
            Object objH2 = C786410Ut5.H2(FacebookSdk.LIZJ(), "servicediscovery");
            if (objH2 != null) {
                NsdManager.RegistrationListener registrationListener = new NsdManager.RegistrationListener() { // from class: X.1BJe
                    @Override // android.net.nsd.NsdManager.RegistrationListener
                    public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo2) {
                    }

                    @Override // android.net.nsd.NsdManager.RegistrationListener
                    public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo2, int i) {
                    }

                    @Override // android.net.nsd.NsdManager.RegistrationListener
                    public final void onServiceRegistered(NsdServiceInfo nsdServiceInfo2) {
                        if (!Intrinsics.LJFF(strLIZIZ, nsdServiceInfo2.getServiceName())) {
                            C2202641BIo.LIZ(str);
                        }
                    }

                    @Override // android.net.nsd.NsdManager.RegistrationListener
                    public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo2, int i) {
                        C2202641BIo.LIZ(str);
                    }
                };
                map.put(str, registrationListener);
                ((NsdManager) objH2).registerService(nsdServiceInfo, 1, registrationListener);
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }
}
