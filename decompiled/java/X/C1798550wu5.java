package X;

import com.bytedance.i18n.location.api.CellClient;
import com.bytedance.i18n.location.api.DefaultMockClient;
import com.bytedance.i18n.location.api.LocationClient;
import com.bytedance.i18n.location.api.MockClient;
import com.bytedance.i18n.location.api.SensorClient;
import com.bytedance.i18n.location.api.WifiClient;
import com.bytedance.i18n.location.api.internal.DefaultCellClient;
import com.bytedance.i18n.location.api.internal.DefaultLocationClient;
import com.bytedance.i18n.location.api.internal.DefaultSensorClient;
import com.bytedance.i18n.location.api.internal.DefaultWifiClient;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.0wu5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1798550wu5 {
    public static final C1798550wu5 LIZ = new C1798550wu5();
    public static final LocationClient LIZIZ;
    public static final MockClient LIZJ;
    public static final SensorClient LIZLLL;
    public static final CellClient LJ;
    public static final WifiClient LJFF;
    public static final C01GW LJI;

    static {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        Object c098200Yq4;
        Object c098200Yq5;
        try {
            c098200Yq = (LocationClient) PluggableExtentionKt.pluggableSpi$default(LocationClient.class, false, false, false, 14, null);
            if (c098200Yq == null) {
                c098200Yq = new DefaultLocationClient();
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1798620wuC c1798620wuC = C1798620wuC.LIZ;
            C1798620wuC.LIZJ("LocationServices", "get LocationClient failed", thM5exceptionOrNullimpl);
            c098200Yq = new DefaultLocationClient();
        }
        LIZIZ = (LocationClient) c098200Yq;
        try {
            c098200Yq2 = (MockClient) PluggableExtentionKt.pluggableSpi$default(MockClient.class, false, false, false, 14, null);
            if (c098200Yq2 == null) {
                c098200Yq2 = new DefaultMockClient();
            }
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
        if (thM5exceptionOrNullimpl2 != null) {
            C1798620wuC c1798620wuC2 = C1798620wuC.LIZ;
            C1798620wuC.LIZJ("LocationServices", "get MockClient failed", thM5exceptionOrNullimpl2);
            c098200Yq2 = new DefaultMockClient();
        }
        LIZJ = (MockClient) c098200Yq2;
        try {
            c098200Yq3 = (SensorClient) PluggableExtentionKt.pluggableSpi$default(SensorClient.class, false, false, false, 14, null);
            if (c098200Yq3 == null) {
                c098200Yq3 = new DefaultSensorClient();
            }
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq3 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        Throwable thM5exceptionOrNullimpl3 = C189200o6.m5exceptionOrNullimpl(c098200Yq3);
        if (thM5exceptionOrNullimpl3 != null) {
            C1798620wuC c1798620wuC3 = C1798620wuC.LIZ;
            C1798620wuC.LIZJ("LocationServices", "get SensorClient failed", thM5exceptionOrNullimpl3);
            c098200Yq3 = new DefaultSensorClient();
        }
        LIZLLL = (SensorClient) c098200Yq3;
        try {
            c098200Yq4 = (CellClient) PluggableExtentionKt.pluggableSpi$default(CellClient.class, false, false, false, 14, null);
            if (c098200Yq4 == null) {
                c098200Yq4 = new DefaultCellClient();
            }
            C189200o6.m2constructorimpl(c098200Yq4);
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq4 = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq4);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq4) != null) {
            c098200Yq4 = new DefaultCellClient();
        }
        LJ = (CellClient) c098200Yq4;
        try {
            c098200Yq5 = (WifiClient) PluggableExtentionKt.pluggableSpi$default(WifiClient.class, false, false, false, 14, null);
            if (c098200Yq5 == null) {
                c098200Yq5 = new DefaultWifiClient();
            }
            C189200o6.m2constructorimpl(c098200Yq5);
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
            c098200Yq5 = new C098200Yq(th5);
            C189200o6.m2constructorimpl(c098200Yq5);
        }
        Throwable thM5exceptionOrNullimpl4 = C189200o6.m5exceptionOrNullimpl(c098200Yq5);
        if (thM5exceptionOrNullimpl4 != null) {
            C1798620wuC c1798620wuC4 = C1798620wuC.LIZ;
            C1798620wuC.LIZJ("LocationServices", "get WifiClient failed", thM5exceptionOrNullimpl4);
            c098200Yq5 = new DefaultWifiClient();
        }
        LJFF = (WifiClient) c098200Yq5;
        LJI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1761));
    }
}
