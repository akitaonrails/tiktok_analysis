package X;

import X.C0X0W;
import X.C0XLX;
import X.C0XLY;
import X.C1495400p18;
import X.C1495560p1O;
import X.C1495650p1X;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.OkHttp3CookieInterceptor;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.OkHttp3DnsParserInterceptor;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.OkHttp3PureControlInterceptor;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.OkHttp3SecurityFactorInterceptor;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.OkHttp3TTPSandBoxInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Request;

/* JADX INFO: renamed from: X.0oyW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493780oyW extends AbstractC1493690oyN {
    public static volatile C1493780oyW LIZ = null;
    public static volatile int LIZIZ = -1;
    public static volatile String LIZJ = "";
    public static volatile Proxy LIZLLL;
    public static final Object LJ = new Object();
    public static int LJFF = 0;
    public static volatile String LJI = "";
    public static String LJII = "tt-ok/3.10.0.2";
    public static volatile InterfaceC1493370oxr LJIIIIZZ;
    public static Context LJIIIZ;
    public static C0XLA LJIIJ;
    public static InterfaceC1494080oz0 LJIIJJI;

    public static C1495520p1K LIZIZ() {
        C0XLA c0xla = LJIIJ;
        c0xla.getClass();
        synchronized (C1494230ozF.class) {
            try {
                C1495520p1K c1495520p1K = c0xla.LIZ;
                if (c1495520p1K != null) {
                    int i = C0XLA.LIZJ;
                    if (i > 0 && i < 4) {
                        C1495510p1J c1495510p1J = new C1495510p1J(c1495520p1K);
                        C0XLA.LIZ(c1495510p1J);
                        c1495510p1J.build();
                    }
                    return c0xla.LIZ;
                }
                C1495510p1J c1495510p1J2 = new C1495510p1J();
                int i2 = C0XLA.LIZJ;
                if (i2 > 0 && i2 < 4) {
                    C0XLA.LIZ(c1495510p1J2);
                }
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                c1495510p1J2.connectionPool(new C1495440p1C(15, 180000L, timeUnit));
                InterfaceC1494070oyz interfaceC1494070oyz = C1494230ozF.LIZ;
                long j = 15000;
                c1495510p1J2.connectTimeout(j, timeUnit);
                c1495510p1J2.readTimeout(j, timeUnit);
                c1495510p1J2.writeTimeout(j, timeUnit);
                c1495510p1J2.addNetworkInterceptor(new InterfaceC836900WsK() { // from class: com.bytedance.frameworks.baselib.network.http.ok3.impl.OkHttp3Builder$1
                    @Override // X.InterfaceC836900WsK
                    public final C0XLY intercept(C0X0W c0x0w) throws IOException {
                        C1495560p1O c1495560p1O;
                        Request request = ((C1495400p18) c0x0w).LJFF;
                        InetSocketAddress inetSocketAddress = null;
                        try {
                            C1495650p1X c1495650p1X = ((C1495400p18) c0x0w).LIZLLL;
                            if (c1495650p1X != null && (c1495560p1O = c1495650p1X.LIZJ) != null) {
                                inetSocketAddress = c1495560p1O.LIZJ;
                            }
                            Logger.debug();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        try {
                            C0XLY c0xlyLIZ = ((C1495400p18) c0x0w).LIZ(request);
                            if (inetSocketAddress != null) {
                                try {
                                    c0xlyLIZ.getClass();
                                    C0XLX c0xlx = new C0XLX(c0xlyLIZ);
                                    c0xlx.LJFF.LIZ("x-net-info.remoteaddr", inetSocketAddress.getAddress().getHostAddress());
                                    c0xlyLIZ = c0xlx.LIZ();
                                    return c0xlyLIZ;
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                }
                            }
                            return c0xlyLIZ;
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                            if (inetSocketAddress != null) {
                                try {
                                    String message = e.getMessage();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(inetSocketAddress.getAddress().getHostAddress());
                                    sb.append("|");
                                    if (message == null) {
                                        message = "null";
                                    }
                                    sb.append(message);
                                    Reflect.on(e).set("detailMessage", sb.toString());
                                    throw e;
                                } catch (Throwable th3) {
                                    TryCatchGuardChecker.doCheck(th3);
                                    throw e;
                                }
                            }
                            throw e;
                        }
                    }
                });
                c1495510p1J2.ttnetDns(OkHttp3DnsParserInterceptor.LIZ());
                c1495510p1J2.cookieJar(C0X2Z.LIZ);
                c1495510p1J2.addNetworkInterceptor(new OkHttp3CookieInterceptor());
                c1495510p1J2.addInterceptor(new OkHttp3SecurityFactorInterceptor());
                c1495510p1J2.addInterceptor(new OkHttp3TTPSandBoxInterceptor());
                c1495510p1J2.addNetworkInterceptor(new OkHttp3PureControlInterceptor());
                c1495510p1J2.followRedirects(true);
                InterfaceC847030XKr interfaceC847030XKr = C0XLA.LIZIZ;
                if (interfaceC847030XKr != null) {
                    interfaceC847030XKr.LIZ(c1495510p1J2);
                }
                C1495520p1K c1495520p1KBuild = c1495510p1J2.build();
                c0xla.LIZ = c1495520p1KBuild;
                return c1495520p1KBuild;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static String LIZJ() {
        int i;
        if (TextUtils.isEmpty(LJI)) {
            StringBuilder sb = new StringBuilder();
            sb.append(LJIIIZ.getPackageName());
            sb.append('/');
            Context context = LJIIIZ;
            synchronized (LJ) {
                try {
                    if (LJFF == 0) {
                        try {
                            LJFF = C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 0).versionCode;
                        } catch (PackageManager.NameNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    i = LJFF;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            sb.append(i);
            sb.append(" (Linux; U; Android ");
            sb.append(Build.VERSION.RELEASE);
            sb.append("; ");
            sb.append(Locale.getDefault().toString());
            String str = Build.MODEL;
            if (str.length() > 0) {
                sb.append("; ");
                sb.append(str);
            }
            String str2 = Build.ID;
            if (str2.length() > 0) {
                sb.append("; Build/");
                sb.append(str2);
            }
            sb.append(";");
            sb.append(LJII);
            sb.append(')');
            LJI = sb.toString();
        }
        return LJI;
    }

    public static InterfaceC1494080oz0 LJ() {
        return LJIIJJI;
    }

    public static InterfaceC1493370oxr LJFF() {
        return LJIIIIZZ;
    }

    public static String LJI() {
        return LJII;
    }

    /* JADX WARN: Unreachable blocks removed: 5, instructions: 13 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:7:0x0022
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public C1493780oyW(android.content.Context r7) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1493780oyW.<init>(android.content.Context):void");
    }

    public static String LIZLLL(com.bytedance.retrofit2.client.Request request) {
        if (request != null && request.getMetrics() != null) {
            return "fallback_reason=" + LIZIZ + ",fallback-message=" + Base64.encodeToString(LIZJ.getBytes(), 2) + ",request-fallback-reason=" + request.getMetrics().LJII + ",request-fallback-message=" + Base64.encodeToString(request.getMetrics().LJIIIIZZ.getBytes(), 2);
        }
        return "null-metrics";
    }

    public static C1493780oyW LJII(Context context) {
        if (LIZ == null) {
            synchronized (C1493780oyW.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C1493780oyW(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    @Override // X.InterfaceC1493760oyU
    public final InterfaceC1494830p0D LIZ(com.bytedance.retrofit2.client.Request request) {
        try {
            com.bytedance.retrofit2.client.Request requestLIZ = C1493240oxe.LJI().LIZ(request);
            if (requestLIZ != null) {
                request = requestLIZ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        com.bytedance.retrofit2.client.Request requestLIZJ = C08HA.LIZLLL().LIZJ(request);
        if (requestLIZJ != null) {
            request = requestLIZJ;
        }
        return new C1494060oyy(request);
    }
}
