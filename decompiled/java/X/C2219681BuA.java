package X;

import Y.AObjectS103S0101000_34;
import Y.AObjectS301S0200000_34;
import Y.AObjectS408S0100000_34;
import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.ProxyInfo;
import android.net.TransportInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.telephony.CellSignalStrength;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.view.OrientationEventListener;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.cronet.AbsCronetDependAdapter;
import com.ss.android.ugc.bytex.pthread.base.BuildConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.chromium.CronetAppProviderManager;
import org.chromium.CronetDependManager;

/* JADX INFO: renamed from: X.1BuA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2219681BuA implements InterfaceC1304090k2Z {
    public final C1304160k2g LIZ;
    public C1304350k2z LIZJ;
    public ConnectivityManager LJ;
    public TelephonyManager LJFF;
    public WifiManager LJI;
    public C1BF1 LJII;
    public C2219791BuL LJIIIIZZ;
    public ComponentCallbacks2C2219781BuK LJIIIZ;
    public final ConcurrentHashMap<EnumC1304340k2y, Vector<C1304330k2x>> LIZIZ = new ConcurrentHashMap<>();
    public final C2219731BuF LIZLLL = new C2219731BuF(0);
    public final String LJIIJ = BuildConfig.VERSION_NAME;
    public final C054G LJIIJJI = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZ));
    public final C054G LJIIL = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C2107308Nj.LIZ));

    public final EnumC2219711BuD LJL() throws Throwable {
        NetworkCapabilities networkCapabilitiesLJLJL;
        NetworkInfo networkInfoLJIJ;
        ConnectivityManager connectivityManager = this.LJ;
        Network activeNetwork = connectivityManager != null ? connectivityManager.getActiveNetwork() : null;
        ConnectivityManager connectivityManager2 = this.LJ;
        if (connectivityManager2 == null || (networkCapabilitiesLJLJL = C2204961BRm.LJLJL(connectivityManager2, activeNetwork, new C0WZX("dzBzEgAjS8/YVFkiQFyFazRzjkQWGhg/xMmInCmbDBgXSP3lHXwHkAK6sfEdvDiihSyN29ZGdEdsBqrR0klbMbwkcR9Iq39AS1NA", null))) == null || !networkCapabilitiesLJLJL.hasCapability(12)) {
            return EnumC2219711BuD.NONE;
        }
        if (networkCapabilitiesLJLJL.hasTransport(1)) {
            return EnumC2219711BuD.WIFI;
        }
        if (networkCapabilitiesLJLJL.hasTransport(3)) {
            return EnumC2219711BuD.WIFI;
        }
        if (!networkCapabilitiesLJLJL.hasTransport(0)) {
            return EnumC2219711BuD.UNKNOWN;
        }
        ConnectivityManager connectivityManager3 = this.LJ;
        if (connectivityManager3 == null || (networkInfoLJIJ = C786410Ut5.LJIJ(connectivityManager3)) == null) {
            return EnumC2219711BuD.MOBILE_UNKNOWN;
        }
        int iLJLL = C2204961BRm.LJLL(networkInfoLJIJ, new C0WZX("dzBzEgAjS8/YVFkiQFyFazRzjkQWGhg/xMmInCmbDBgXSP3lHXwHkAK6sfEdvDiihSyN29ZGdEdsBqrR0klbMbwkcR9Iq39AS1NA", null));
        if (iLJLL == 20) {
            return EnumC2219711BuD.MOBILE_5G;
        }
        switch (iLJLL) {
        }
        return EnumC2219711BuD.WIFI;
    }

    public final C2219751BuH LJLI() {
        C2219751BuH c2219751BuH = new C2219751BuH(0);
        ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(this.LIZ.LIZ(), "activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        C2204961BRm.LJFF(activityManager, memoryInfo, new C0WZX("dzBzEgAjS8/YVFkiQFyFazRzjkQWGhg/xMmInCmbDBgXSP3lHXwHkAK6sfEdvDiihSyN29ZGdEdsBqrR0klbMbwkcR9Iq39AS1NA", null));
        long j = memoryInfo.totalMem;
        long j2 = 1024;
        String str = Build.SUPPORTED_ABIS[0];
        c2219751BuH.LIZ = str;
        c2219751BuH.LIZIZ = str;
        c2219751BuH.LIZJ = 40;
        c2219751BuH.LIZLLL = Build.BRAND;
        c2219751BuH.LJ = Build.MODEL;
        c2219751BuH.LJFF = "Android " + Build.VERSION.RELEASE;
        c2219751BuH.LJI = "android";
        c2219751BuH.LJII = "";
        c2219751BuH.LJIIIIZZ = (j / j2) / j2;
        return c2219751BuH;
    }

    public final C2219691BuB LJLIIIL() {
        C2219691BuB c2219691BuB = new C2219691BuB(0);
        Context contextLIZ = this.LIZ.LIZ();
        InterfaceC1304030k2T interfaceC1304030k2T = this.LIZ.LIZJ;
        interfaceC1304030k2T.LJII();
        int width = interfaceC1304030k2T.getWidth();
        int height = interfaceC1304030k2T.getHeight();
        c2219691BuB.LIZ = width;
        c2219691BuB.LIZIZ = height;
        c2219691BuB.LJ = interfaceC1304030k2T.getDensity();
        c2219691BuB.LJFF = interfaceC1304030k2T.getDensity();
        c2219691BuB.LIZJ = width;
        c2219691BuB.LIZLLL = height;
        C2219771BuJ c2219771BuJ = c2219691BuB.LJIIJ;
        c2219771BuJ.LIZ = interfaceC1304030k2T.LJIIJJI();
        c2219771BuJ.LIZIZ = interfaceC1304030k2T.LJIIIIZZ();
        c2219771BuJ.LIZJ = interfaceC1304030k2T.LIZJ();
        c2219771BuJ.LIZLLL = interfaceC1304030k2T.LJIIIZ();
        c2219771BuJ.LJ = interfaceC1304030k2T.LJIIIZ() - interfaceC1304030k2T.LIZJ();
        c2219771BuJ.LJFF = interfaceC1304030k2T.LJIIIIZZ() - interfaceC1304030k2T.LJIIJJI();
        c2219691BuB.LJIJI = interfaceC1304030k2T.getStatusBarHeight();
        c2219691BuB.LJI = contextLIZ.getResources().getConfiguration().orientation == 2 ? "landscape" : "portrait";
        c2219691BuB.LJII = "Android " + Build.VERSION.RELEASE;
        c2219691BuB.LJIIIIZZ = "android";
        C1304160k2g c1304160k2g = this.LIZ;
        c2219691BuB.LJIILIIL = c1304160k2g.LIZLLL;
        c2219691BuB.LJIIL = c1304160k2g.LJ;
        c2219691BuB.LJIIJJI = c1304160k2g.LJFF;
        c2219691BuB.LJIILJJIL = Build.MODEL;
        c2219691BuB.LJIILL = Build.BRAND;
        c2219691BuB.LJIILLIIL = (Build.VERSION.SDK_INT < 30 ? (contextLIZ.getResources().getConfiguration().uiMode & 48) != 16 : contextLIZ.getResources().getConfiguration().isNightModeActive()) ? "dark" : "light";
        c2219691BuB.LJIJ = 16.0f;
        c2219691BuB.LJIIZILJ = 1.0f;
        c2219691BuB.LJIIIZ = interfaceC1304030k2T.getAppLanguage();
        return c2219691BuB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, X.1BuB] */
    public final C2219691BuB LJLIIL() throws Throwable {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = new C2219691BuB(0);
        C23250099c.LJ(C23271099x.INSTANCE, new C05DD(this, new AObjectS301S0200000_34(this, c259800zU, 5), null));
        return (C2219691BuB) c259800zU.element;
    }

    public final void LJLILLLLZI() {
        C2219731BuF c2219731BuF = this.LIZLLL;
        EnumC2219711BuD enumC2219711BuD = c2219731BuF.LIZIZ;
        c2219731BuF.LIZIZ = LJL();
        C2219731BuF c2219731BuF2 = this.LIZLLL;
        EnumC2219711BuD enumC2219711BuD2 = EnumC2219711BuD.NONE;
        EnumC2219711BuD enumC2219711BuD3 = c2219731BuF2.LIZIZ;
        c2219731BuF2.LIZ = enumC2219711BuD2 != enumC2219711BuD3;
        if (enumC2219711BuD != enumC2219711BuD3) {
            LJLIL(EnumC1304340k2y.OnNetworkChange, c2219731BuF2);
        }
    }

    public final void LJLJI() {
        LinkProperties linkPropertiesLJLJJLL;
        ConnectivityManager connectivityManager = this.LJ;
        ProxyInfo httpProxy = null;
        Network activeNetwork = connectivityManager != null ? connectivityManager.getActiveNetwork() : null;
        ConnectivityManager connectivityManager2 = this.LJ;
        if (connectivityManager2 != null && (linkPropertiesLJLJJLL = C2204961BRm.LJLJJLL(connectivityManager2, activeNetwork, new C0WZX("dzBzEgAjS8/YVFkiQFyFazRzjkQWGhg/xMmInCmbDBgXSP3lHXwHkAK6sfEdvDiihSyN29ZGdEdsBqrR0klbMbwkcR9Iq39AS1NA", null))) != null) {
            httpProxy = linkPropertiesLJLJJLL.getHttpProxy();
        }
        this.LIZLLL.LIZLLL = httpProxy != null;
    }

    public final void LJLJJI() {
        Integer numLIZIZ;
        NetworkCapabilities networkCapabilitiesLJLJL;
        SignalStrength signalStrength;
        List<CellSignalStrength> cellSignalStrengths;
        Integer numValueOf;
        CellSignalStrength next = null;
        int iIntValue = 0;
        switch (C2219701BuC.LIZIZ[this.LIZLLL.LIZIZ.ordinal()]) {
            case 1:
                C2219731BuF c2219731BuF = this.LIZLLL;
                if (Build.VERSION.SDK_INT >= 31) {
                    ConnectivityManager connectivityManager = this.LJ;
                    Network activeNetwork = connectivityManager != null ? connectivityManager.getActiveNetwork() : null;
                    ConnectivityManager connectivityManager2 = this.LJ;
                    TransportInfo transportInfo = (connectivityManager2 == null || (networkCapabilitiesLJLJL = C2204961BRm.LJLJL(connectivityManager2, activeNetwork, new C0WZX("dzBzEgAjS8/YVFkiQFyFazRzjkQWGhg/xMmInCmbDBgXSP3lHXwHkAK6sfEdvDiihSyN29ZGdEdsBqrR0klbMbwkcR9Iq39AS1NA", null))) == null) ? null : networkCapabilitiesLJLJL.getTransportInfo();
                    if (transportInfo instanceof WifiInfo) {
                        iIntValue = C2204961BRm.LJLLLLLL((WifiInfo) transportInfo, new C0WZX("dzBzEgAjS8/YVFkiQFyFazRzjkQWGhg/xMmInCmbDBgXSP3lHXwHkAK6sfEdvDiihSyN29ZGdEdsBqrR0klbMbwkcR9Iq39AS1NA", null));
                    }
                } else {
                    WifiManager wifiManager = this.LJI;
                    if (wifiManager != null && (numLIZIZ = C786600UtO.LIZIZ(wifiManager)) != null) {
                        iIntValue = numLIZIZ.intValue();
                    }
                }
                c2219731BuF.LJ = iIntValue;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                C2219731BuF c2219731BuF2 = this.LIZLLL;
                TelephonyManager telephonyManager = this.LJFF;
                if (telephonyManager != null && Build.VERSION.SDK_INT >= 29 && (signalStrength = telephonyManager.getSignalStrength()) != null && (cellSignalStrengths = signalStrength.getCellSignalStrengths()) != null) {
                    Iterator<CellSignalStrength> it2 = cellSignalStrengths.iterator();
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (it2.hasNext()) {
                            int dbm = next.getDbm();
                            do {
                                CellSignalStrength next2 = it2.next();
                                int dbm2 = next2.getDbm();
                                if (dbm < dbm2) {
                                    next = next2;
                                    dbm = dbm2;
                                }
                            } while (it2.hasNext());
                        }
                    }
                    CellSignalStrength cellSignalStrength = next;
                    if (cellSignalStrength != null && (numValueOf = Integer.valueOf(cellSignalStrength.getDbm())) != null) {
                        iIntValue = numValueOf.intValue();
                    }
                }
                c2219731BuF2.LJ = iIntValue;
                break;
            default:
                this.LIZLLL.LJ = 0;
                break;
        }
    }

    @Override // X.InterfaceC1304090k2Z
    public final void onExit() {
        ConnectivityManager connectivityManager;
        C2296808zG.LIZJ(this.LJIIJJI, null);
        C2296808zG.LIZJ(this.LJIIL, null);
        this.LIZIZ.clear();
        C1BF1 c1bf1 = this.LJII;
        if (c1bf1 != null && (connectivityManager = this.LJ) != null) {
            connectivityManager.unregisterNetworkCallback(c1bf1);
        }
        this.LIZJ = null;
        Context contextLIZ = this.LIZ.LIZ();
        ComponentCallbacks2C2219781BuK componentCallbacks2C2219781BuK = this.LJIIIZ;
        if (componentCallbacks2C2219781BuK != null) {
            contextLIZ.unregisterComponentCallbacks(componentCallbacks2C2219781BuK);
        }
        this.LJIIIZ = null;
    }

    @Override // X.InterfaceC1304090k2Z
    public final void onPause() {
        C1304350k2z c1304350k2z = this.LIZJ;
        if (c1304350k2z == null || !c1304350k2z.canDetectOrientation()) {
            return;
        }
        c1304350k2z.disable();
    }

    @Override // X.InterfaceC1304090k2Z
    public final void onResume() {
        C1304350k2z c1304350k2z = this.LIZJ;
        if (c1304350k2z == null || !c1304350k2z.canDetectOrientation()) {
            return;
        }
        c1304350k2z.enable();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.1BuK, android.content.ComponentCallbacks] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0k2z] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.1BuL] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.1BF1, android.net.ConnectivityManager$NetworkCallback] */
    @Override // X.InterfaceC1304090k2Z
    public final void onStart() {
        ConnectivityManager connectivityManager;
        Context contextLIZ = this.LIZ.LIZ();
        Object objH2 = C786410Ut5.H2(contextLIZ, "connectivity");
        if (objH2 != null) {
            this.LJ = (ConnectivityManager) objH2;
            Object objH22 = C786410Ut5.H2(C786410Ut5.N3(contextLIZ), "wifi");
            this.LJI = objH22 instanceof WifiManager ? (WifiManager) objH22 : null;
            Object objH23 = C786410Ut5.H2(contextLIZ, "phone");
            this.LJFF = objH23 instanceof TelephonyManager ? (TelephonyManager) objH23 : null;
            this.LIZLLL.LIZIZ = LJL();
            C2219731BuF c2219731BuF = this.LIZLLL;
            c2219731BuF.LIZ = EnumC2219711BuD.NONE != c2219731BuF.LIZIZ;
            c2219731BuF.LIZJ = TTNetInit.getEffectiveConnectionType() < 4;
            LJLJJI();
            LJLJI();
        }
        this.LIZJ = null;
        C1BF1 c1bf1 = this.LJII;
        if (c1bf1 != null && (connectivityManager = this.LJ) != null) {
            connectivityManager.unregisterNetworkCallback(c1bf1);
        }
        final Context contextLIZ2 = this.LIZ.LIZ();
        this.LIZJ = new OrientationEventListener(contextLIZ2) { // from class: X.0k2z
            public int LIZ;

            @Override // android.view.OrientationEventListener
            public final void onOrientationChanged(int i) {
                if (i == -1) {
                    return;
                }
                int i2 = 1;
                if (45 <= i && (i < 135 || (225 <= i && i < 315))) {
                    i2 = 2;
                }
                if (i2 != this.LIZ) {
                    this.LIZ = i2;
                    this.LJLIL(EnumC1304340k2y.OnOrientation, null);
                }
            }
        };
        if (this.LJ != null) {
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).addTransportType(3).build();
            ?? r1 = new ConnectivityManager.NetworkCallback() { // from class: X.1BF1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onUnavailable() throws Throwable {
                    super.onUnavailable();
                    C2219681BuA c2219681BuA = this.LIZ;
                    c2219681BuA.LJJZZI(new AObjectS408S0100000_34(c2219681BuA, 1));
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onAvailable(Network network) throws Throwable {
                    super.onAvailable(network);
                    C2219681BuA c2219681BuA = this.LIZ;
                    c2219681BuA.LJJZZI(new AObjectS408S0100000_34(c2219681BuA, 2));
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onLost(Network network) throws Throwable {
                    super.onLost(network);
                    C2219681BuA c2219681BuA = this.LIZ;
                    c2219681BuA.LJJZZI(new AObjectS408S0100000_34(c2219681BuA, 0));
                }
            };
            this.LJII = r1;
            ConnectivityManager connectivityManager2 = this.LJ;
            if (connectivityManager2 != 0) {
                connectivityManager2.registerNetworkCallback(networkRequestBuild, (ConnectivityManager.NetworkCallback) r1);
            }
        }
        this.LJIIIIZZ = new AbsCronetDependAdapter() { // from class: X.1BuL
            @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
            public final void onEffectiveConnectionTypeChanged(int i) throws Throwable {
                C2219681BuA c2219681BuA = this.LIZ;
                c2219681BuA.LJJZZI(new AObjectS103S0101000_34(c2219681BuA, i, 2));
            }
        };
        CronetDependManager.inst().setAdapter(this.LJIIIIZZ);
        CronetAppProviderManager.inst().setAdapter(this.LJIIIIZZ);
        if (this.LJIIIZ == null) {
            ?? r0 = new ComponentCallbacks2() { // from class: X.1BuK
                @Override // android.content.ComponentCallbacks
                public final void onConfigurationChanged(Configuration configuration) {
                }

                @Override // android.content.ComponentCallbacks
                public final void onLowMemory() {
                    this.LL.LJLIL(EnumC1304340k2y.OnMemoryWarning, new C1699640uKY(15));
                }

                @Override // android.content.ComponentCallbacks2
                public final void onTrimMemory(int i) {
                    if (i != 5 && i != 10 && i != 15) {
                        return;
                    }
                    this.LL.LJLIL(EnumC1304340k2y.OnMemoryWarning, new C1699640uKY(i));
                }
            };
            this.LJIIIZ = r0;
            contextLIZ.registerComponentCallbacks(r0);
        }
    }

    public C2219681BuA(C1304160k2g c1304160k2g) {
        this.LIZ = c1304160k2g;
    }

    public final void LJJZZI(Function0 function0) throws Throwable {
        C23250099c.LJ(C23271099x.INSTANCE, new C05DA(this, function0, null));
    }

    public final void LJJZZIII(Function0<Unit> function0) {
        C23250099c.LIZLLL(this.LJIIL, null, null, new C05DB(function0, null), 3);
    }

    public final void LJLJJL(C1304330k2x c1304330k2x) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1304320k2w(this, c1304330k2x, null), 3);
    }

    public final EnumC1488940oqi LJLJJLL(EnumC2219721BuE enumC2219721BuE) {
        Vibrator defaultVibrator;
        long j;
        Context contextLIZ = this.LIZ.LIZ();
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            defaultVibrator = ((VibratorManager) C786410Ut5.H2(contextLIZ, "vibrator_manager")).getDefaultVibrator();
        } else {
            defaultVibrator = (Vibrator) C786410Ut5.H2(contextLIZ, "vibrator");
        }
        if (!defaultVibrator.hasVibrator()) {
            return EnumC1488940oqi.UNSUPPORTED;
        }
        if (EnumC2219721BuE.LONG == enumC2219721BuE) {
            j = 400;
        } else {
            j = 15;
        }
        EnumC1488940oqi enumC1488940oqi = EnumC1488940oqi.OK;
        if (i >= 26) {
            int i2 = -1;
            if (defaultVibrator.hasAmplitudeControl()) {
                int i3 = C2219701BuC.LIZ[enumC2219721BuE.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            i2 = 255;
                        }
                    } else {
                        i2 = 127;
                    }
                } else {
                    i2 = 10;
                }
            } else if (EnumC2219721BuE.SHORT_MEDIUM == enumC2219721BuE || EnumC2219721BuE.SHORT_HEAVY == enumC2219721BuE) {
                enumC1488940oqi = EnumC1488940oqi.UNSUPPORTED;
            }
            defaultVibrator.vibrate(VibrationEffect.createOneShot(j, i2));
            return enumC1488940oqi;
        }
        if (EnumC2219721BuE.SHORT_MEDIUM == enumC2219721BuE || EnumC2219721BuE.SHORT_HEAVY == enumC2219721BuE) {
            enumC1488940oqi = EnumC1488940oqi.UNSUPPORTED;
        }
        defaultVibrator.vibrate(j);
        return enumC1488940oqi;
    }

    public final C1304330k2x LJJZ(EnumC1304340k2y enumC1304340k2y, Function1<Object, Unit> function1) {
        C1304330k2x c1304330k2x = new C1304330k2x(enumC1304340k2y, function1);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1304310k2v(this, enumC1304340k2y, c1304330k2x, null), 3);
        return c1304330k2x;
    }

    public final void LJLIL(EnumC1304340k2y enumC1304340k2y, Object obj) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1304300k2u(this, enumC1304340k2y, obj, null), 3);
    }
}
