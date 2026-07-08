package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BE7, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1BE7 {
    public final Context LIZ;
    public C1BER LIZIZ;
    public C1BEG LIZJ;
    public Map<String, C1BE6> LIZLLL;
    public AbstractC2201671BEv LJ;

    public final void LIZ() {
        if (C1BE8.LIZIZ().LIZ) {
            return;
        }
        C1BE8 c1be8LIZIZ = C1BE8.LIZIZ();
        Context context = this.LIZ;
        C1BER c1ber = this.LIZIZ;
        if (!c1be8LIZIZ.LIZ && context != null && c1ber != null) {
            c1be8LIZIZ.LIZIZ = C786410Ut5.N3(context);
            c1be8LIZIZ.LJFF = new C1BEA(context, "byte_ad_tracker_preferences");
            c1be8LIZIZ.LIZJ = c1ber;
            c1be8LIZIZ.LIZ = true;
        }
        C1BE8.LIZIZ().LJI = this.LIZJ;
        C1BE8.LIZIZ().LJII = this.LJ;
        C1BE8.LIZIZ().getClass();
        C1BE8.LIZIZ().getClass();
        ExecutorService executorService = C1BE2.LIZ;
        if (executorService != null) {
            executorService.shutdown();
        }
        C1BE2.LIZ = null;
        Iterator it2 = ((HashMap) this.LIZLLL).entrySet().iterator();
        while (it2.hasNext()) {
            final C1BE6 c1be6 = (C1BE6) ((Map.Entry) it2.next()).getValue();
            C1BE8 c1be8LIZIZ2 = C1BE8.LIZIZ();
            if (c1be8LIZIZ2.LIZ) {
                c1be8LIZIZ2.LJ.getClass();
                if (c1be6 != null) {
                    c1be6.LIZ();
                    if (!TextUtils.isEmpty("c2s")) {
                        C1BE2.LIZ(new C05F1() { // from class: X.1BE5
                            @Override // X.C05F0
                            public final void LIZ() {
                                C1BE4 c1be4 = C1BE8.LIZIZ().LIZLLL;
                                C1BE6 c1be62 = c1be6;
                                c1be4.getClass();
                                c1be62.LIZ();
                                C1BE6 c1be63 = (C1BE6) ((ConcurrentHashMap) c1be4.LIZ).get("c2s");
                                if (c1be63 != null) {
                                    if (c1be63 == c1be62) {
                                        return;
                                    }
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("existing tracker with key:");
                                    sbLIZ.append("c2s");
                                    sbLIZ.append("found, replace it");
                                    C2188811AlT.LIZIZ(sbLIZ);
                                    c1be63.LJ();
                                }
                                ((ConcurrentHashMap) c1be4.LIZ).put("c2s", c1be62);
                                c1be62.LIZLLL();
                                ((C1BEN) c1be62).LJI();
                                c1be62.LIZIZ();
                            }
                        });
                    }
                }
            }
        }
        final C2201451BDz c2201451BDz = C2201451BDz.LIZLLL;
        Context contextN3 = C786410Ut5.N3(this.LIZ);
        synchronized (c2201451BDz) {
            c2201451BDz.LIZJ = contextN3;
            C1BER c1ber2 = C1BE8.LIZIZ().LIZJ;
            if (c1ber2 != null && c1ber2.LIZJ && !c2201451BDz.LIZ) {
                ConnectivityManager connectivityManager = (ConnectivityManager) C786410Ut5.H2(C1BE8.LIZIZ().LIZIZ, "connectivity");
                if (connectivityManager == null) {
                    C1BE8.LIZIZ().LIZJ.LIZJ = false;
                } else {
                    NetworkRequest.Builder builderAddCapability = new NetworkRequest.Builder().addTransportType(0).addTransportType(1).addCapability(12);
                    if (Build.VERSION.SDK_INT >= 28) {
                        builderAddCapability.addCapability(21);
                    }
                    builderAddCapability.addCapability(16);
                    try {
                        connectivityManager.registerNetworkCallback(builderAddCapability.build(), new ConnectivityManager.NetworkCallback() { // from class: X.1BE0
                            @Override // android.net.ConnectivityManager.NetworkCallback
                            public final void onUnavailable() {
                                super.onUnavailable();
                                ((HashSet) c2201451BDz.LIZIZ).clear();
                            }

                            @Override // android.net.ConnectivityManager.NetworkCallback
                            public final void onAvailable(Network network) {
                                String str;
                                super.onAvailable(network);
                                C2201451BDz c2201451BDz2 = c2201451BDz;
                                c2201451BDz2.getClass();
                                boolean zLJI = MethodIDManager.LJI(196653);
                                boolean zIsEmpty = ((HashSet) c2201451BDz2.LIZIZ).isEmpty();
                                Iterator it3 = ((HashSet) c2201451BDz2.LIZIZ).iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (((Network) it3.next()).equals(network)) {
                                            break;
                                        }
                                    } else {
                                        ((HashSet) c2201451BDz2.LIZIZ).add(network);
                                        break;
                                    }
                                }
                                boolean z = !((HashSet) c2201451BDz2.LIZIZ).isEmpty();
                                if (zIsEmpty && z) {
                                    for (final C1BE6 c1be62 : ((ConcurrentHashMap) C1BE8.LIZIZ().LIZLLL.LIZ).values()) {
                                        if (c1be62 != null) {
                                            C1BE2.LIZ(new C05F1() { // from class: X.1BE1
                                                @Override // X.C05F0
                                                public final void LIZ() {
                                                    c1be62.LIZJ();
                                                }
                                            });
                                        }
                                    }
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("onNetworkAvailable: ");
                                sbLIZ.append(network.toString());
                                if (zIsEmpty && z) {
                                    str = ". network become available!!!";
                                } else {
                                    str = "";
                                }
                                sbLIZ.append(str);
                                C2188811AlT.LIZIZ(sbLIZ);
                                if (zLJI) {
                                    MethodIDManager.LJ();
                                }
                            }

                            @Override // android.net.ConnectivityManager.NetworkCallback
                            public final void onLost(Network network) {
                                super.onLost(network);
                                c2201451BDz.LIZJ(network);
                            }

                            @Override // android.net.ConnectivityManager.NetworkCallback
                            public final void onLosing(Network network, int i) {
                                super.onLosing(network, i);
                                c2201451BDz.LIZJ(network);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("onLosing:");
                                sbLIZ.append(network.toString());
                                C2188811AlT.LIZIZ(sbLIZ);
                            }
                        });
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1BE8.LIZIZ().LIZJ.LIZJ = false;
                    }
                    c2201451BDz.LIZ = true;
                }
            }
        }
        C1BE8 c1be8LIZIZ3 = C1BE8.LIZIZ();
        List<Pair<View, C1BEL>> list = c1be8LIZIZ3.LJIIIIZZ;
        if (list != null && !list.isEmpty()) {
            for (Pair<View, C1BEL> pair : c1be8LIZIZ3.LJIIIIZZ) {
                C1BEH c1beh = c1be8LIZIZ3.LJ;
                View view = (View) pair.first;
                C1BEL c1bel = (C1BEL) pair.second;
                c1beh.getClass();
                C1BE8 c1be8LIZIZ4 = C1BE8.LIZIZ();
                if (c1be8LIZIZ4.LIZ && c1be8LIZIZ4.LIZJ.LIZ) {
                    C1BE2.LIZ(new C1BE9(SystemClock.uptimeMillis(), view, c1bel));
                }
            }
            c1be8LIZIZ3.LJIIIIZZ.clear();
        }
        if (C1BEF.LIZ.compareAndSet(false, true)) {
            AbstractC2201671BEv abstractC2201671BEv = C1BE8.LIZIZ().LJII;
            JSONObject jSONObjectPutOpt = new JSONObject().putOpt("sdk_aid", 2705).putOpt("sdk_version", "1.6.0").putOpt("app_version", abstractC2201671BEv == null ? null : "").putOpt("update_version_code", abstractC2201671BEv != null ? "" : null).putOpt("os_version", Build.VERSION.RELEASE);
            C1BEG c1beg = C1BE8.LIZIZ().LJI;
            if (c1beg != null) {
                c1beg.onEventV3("sdk_session_launch", jSONObjectPutOpt);
            }
        }
    }

    public C1BE7(Context context) {
        this.LIZ = context;
    }
}
