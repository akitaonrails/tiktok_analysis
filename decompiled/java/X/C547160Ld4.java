package X;

import android.util.LruCache;
import com.bytedance.aigc.proto.FlowDomain;
import com.bytedance.aigc.proto.Level;
import com.bytedance.aigc.proto.Tenant;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.quality.trace.TraceErrorContext;
import com.ss.android.ugc.aweme.trace.api.TraceLogApi;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ld4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547160Ld4 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(431));
    public static final Object LIZIZ = new Object();
    public static final C547210Ld9 LIZJ = new LruCache<C547170Ld5, C547220LdA>() { // from class: X.0Ld9
        @Override // android.util.LruCache
        public final void entryRemoved(boolean z, C547170Ld5 c547170Ld5, C547220LdA c547220LdA, C547220LdA c547220LdA2) {
            C547220LdA c547220LdA3 = c547220LdA;
            if (z && !c547220LdA3.LJ) {
                c547220LdA3.LIZLLL.clear();
                c547220LdA3.LJFF = Level.DEBUG;
                c547220LdA3.LJI = null;
            }
        }
    };
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1144));

    public static String LIZIZ() {
        return (String) LIZLLL.getValue();
    }

    public static Map LIZ(Function1 function1) {
        TraceErrorContext traceErrorContext = new TraceErrorContext(null, null, null, null);
        function1.invoke(traceErrorContext);
        C13DA c13da = new C13DA();
        String str = traceErrorContext.functionName;
        if (str != null) {
            c13da.put(Scene.SCENE_SERVICE, str);
        }
        Integer num = traceErrorContext.errorCode;
        if (num != null) {
            c13da.put("error_code", String.valueOf(num.intValue()));
        }
        String str2 = traceErrorContext.errorMessage;
        if (str2 != null) {
            c13da.put("simple_error_msg", str2);
        }
        String str3 = traceErrorContext.errorDetailedMessage;
        if (str3 != null) {
            c13da.put("detailed_error_msg", str3);
        }
        return c13da.build();
    }

    public static C547220LdA LIZLLL(final String str, final C547200Ld8 c547200Ld8, final C547180Ld6 c547180Ld6) {
        Object obj = new Object(str, c547200Ld8, c547180Ld6) { // from class: X.0Ld5
            public final String LIZ;
            public final C547200Ld8 LIZIZ;
            public final C547180Ld6 LIZJ;

            public final int hashCode() {
                return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.LIZ.hashCode()) * 31) + this.LIZIZ.LIZJ.hashCode()) * 31) + this.LIZIZ.LIZIZ.hashCode()) * 31) + this.LIZJ.LIZ.hashCode()) * 31) + this.LIZJ.LIZIZ.hashCode();
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C547170Ld5)) {
                    return false;
                }
                C547170Ld5 c547170Ld5 = (C547170Ld5) obj2;
                if (Intrinsics.LJFF(this.LIZ, c547170Ld5.LIZ)) {
                    C547200Ld8 c547200Ld82 = this.LIZIZ;
                    Tenant tenant = c547200Ld82.LIZ;
                    C547200Ld8 c547200Ld83 = c547170Ld5.LIZIZ;
                    if (tenant == c547200Ld83.LIZ && c547200Ld82.LIZJ == c547200Ld83.LIZJ && c547200Ld82.LIZIZ == c547200Ld83.LIZIZ) {
                        C547180Ld6 c547180Ld62 = this.LIZJ;
                        FlowDomain flowDomain = c547180Ld62.LIZ;
                        C547180Ld6 c547180Ld63 = c547170Ld5.LIZJ;
                        if (flowDomain == c547180Ld63.LIZ && c547180Ld62.LIZIZ == c547180Ld63.LIZIZ) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }

            {
                this.LIZ = str;
                this.LIZIZ = c547200Ld8;
                this.LIZJ = c547180Ld6;
            }
        };
        synchronized (LIZIZ) {
            try {
                C547210Ld9 c547210Ld9 = LIZJ;
                C547220LdA c547220LdA = c547210Ld9.get(obj);
                if (c547220LdA != null && !c547220LdA.LJ) {
                    return c547220LdA;
                }
                C547220LdA c547220LdA2 = new C547220LdA(str, c547200Ld8, c547180Ld6);
                c547210Ld9.put(obj, c547220LdA2);
                return c547220LdA2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJFF(String str, C547200Ld8 c547200Ld8, C547180Ld6 c547180Ld6, Function1 function1) {
        LIZJ(Level.ERROR.toString(), str, c547200Ld8.LIZIZ.toString(), c547200Ld8.LIZJ.toString(), c547200Ld8.LIZ.toString(), System.currentTimeMillis(), C547190Ld7.LIZ(c547180Ld6), LIZ(function1));
    }

    public static void LJ(Level level, String str, C547200Ld8 c547200Ld8, C547180Ld6 c547180Ld6, Function1 function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        function1.invoke(linkedHashMap);
        LIZJ(level.toString(), str, c547200Ld8.LIZIZ.toString(), c547200Ld8.LIZJ.toString(), c547200Ld8.LIZ.toString(), System.currentTimeMillis(), C547190Ld7.LIZ(c547180Ld6), linkedHashMap);
    }

    public static void LIZJ(String str, String str2, String str3, String str4, String str5, long j, String str6, Map map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str3);
        sbLIZ.append('.');
        sbLIZ.append(str4);
        sbLIZ.append('.');
        sbLIZ.append(str6);
        String strLIZ = C547150Ld3.LIZ(str2, C2188811AlT.LIZIZ(sbLIZ), null);
        String string = map.toString();
        InterfaceC1631630sYr<? super String, ? super String, ? super String, ? super Throwable, Unit> interfaceC1631630sYr = C547130Ld1.LIZ;
        if (interfaceC1631630sYr != null) {
            interfaceC1631630sYr.invoke(str, strLIZ, string, null);
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "aikit_trace_force_network", true, false)) {
            TraceLogApi traceLogApi = (TraceLogApi) LIZ.getValue();
            if (traceLogApi != null) {
                traceLogApi.LIZ(str2, str3, str4, str5, str6, j, str, map);
                return;
            }
            return;
        }
        TraceLogApi traceLogApi2 = (TraceLogApi) LIZ.getValue();
        if (traceLogApi2 == null) {
            return;
        }
        traceLogApi2.LIZIZ(str2, str3, str4, str5, str6, j, str, map);
    }
}
