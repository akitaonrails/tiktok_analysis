package X;

import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.OkHttp3Instrumentation;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.OkHttp3SecurityFactorInterceptor;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.net.interceptor.AwemeAuthTokenInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.DevicesNullInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.NetWorkSpeedInterceptor;
import com.ss.android.ugc.aweme.sec.SecVerifyInterceptor;
import com.ss.android.ugc.aweme.utils.SecUidInterceptor;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0X2i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842260X2i {
    public static final C842260X2i LIZJ = new C842260X2i();
    public C1495520p1K LIZ;
    public final C1495520p1K LIZIZ = OkHttp3Instrumentation.init();

    public final C1495520p1K LIZ() throws Throwable {
        C1495520p1K c1495520p1K = this.LIZ;
        if (c1495520p1K != null) {
            return c1495520p1K;
        }
        AbstractC842290X2l.LIZ.LIZ();
        C1495520p1K c1495520p1K2 = this.LIZIZ;
        c1495520p1K2.getClass();
        C1495510p1J c1495510p1J = new C1495510p1J(c1495520p1K2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c1495510p1J.connectTimeout(60000L, timeUnit);
        c1495510p1J.readTimeout(60000L, timeUnit);
        c1495510p1J.retryOnConnectionFailure(true);
        if (C823110WQr.LIZ != null) {
            c1495510p1J.dispatcher(new C1495530p1L(C823110WQr.LIZ));
        }
        C844470XAv.LIZ.getClass();
        if (C2162308dZ.LJI(C844470XAv.LIZ())) {
            final CookieHandler cookieHandler = CookieHandler.getDefault();
            c1495510p1J.cookieJar(new C0X2Z(cookieHandler) { // from class: X.0X2X
                public final CookieHandler LIZIZ;

                {
                    PatternProtector.compile("(?<=Domain=)([^;]*)", 2);
                    this.LIZIZ = cookieHandler;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection] */
                /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
                @Override // X.C0X2Z
                public final List<C842190X2b> LIZ(C0XLQ c0xlq) {
                    ?? arrayList;
                    if (c0xlq == null) {
                        return Collections.emptyList();
                    }
                    try {
                        Map<String, List<String>> map = this.LIZIZ.get(c0xlq.LJIL(), Collections.emptyMap());
                        if (map != null && !map.isEmpty()) {
                            ArrayList arrayList2 = null;
                            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                                String key = entry.getKey();
                                if ("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                                    if (entry.getValue() != null && !entry.getValue().isEmpty()) {
                                        for (String str : entry.getValue()) {
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            if (TextUtils.isEmpty(str)) {
                                                arrayList = Collections.emptyList();
                                            } else {
                                                arrayList = new ArrayList();
                                                String[] strArrSplit = str.split(";");
                                                for (String str2 : strArrSplit) {
                                                    C842190X2b c842190X2bLIZIZ = C842190X2b.LIZIZ(c0xlq, str2);
                                                    if (c842190X2bLIZIZ != null) {
                                                        arrayList.add(c842190X2bLIZIZ);
                                                    }
                                                }
                                            }
                                            arrayList2.addAll(arrayList);
                                        }
                                    }
                                }
                            }
                            if (arrayList2 != null) {
                                return Collections.unmodifiableList(arrayList2);
                            }
                            return Collections.emptyList();
                        }
                        return Collections.emptyList();
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return Collections.emptyList();
                    }
                }

                @Override // X.C0X2Z
                public final void LIZIZ(C0XLQ c0xlq, List<C842190X2b> list) {
                    if (c0xlq != null && !C0IKQ.LIZ(list)) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<C842190X2b> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().toString());
                        }
                        try {
                            this.LIZIZ.put(c0xlq.LJIL(), Collections.singletonMap("Set-Cookie", arrayList));
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            });
        }
        if (C826840Wc6.LIZ != null) {
            c1495510p1J.addInterceptor(new SecVerifyInterceptor());
        }
        c1495510p1J.addNetworkInterceptor(new NetWorkSpeedInterceptor());
        c1495510p1J.addNetworkInterceptor(new OkHttp3SecurityFactorInterceptor());
        c1495510p1J.addNetworkInterceptor(new AwemeAuthTokenInterceptor());
        c1495510p1J.addInterceptor(new DevicesNullInterceptor());
        c1495510p1J.addInterceptor(new SecUidInterceptor());
        c1495510p1J.addInterceptor(new InterfaceC836900WsK() { // from class: X.0X2j
            @Override // X.InterfaceC836900WsK
            public final C0XLY intercept(C0X0W c0x0w) {
                C1494230ozF.LJIILL(null);
                C1494230ozF.LJIILLIIL();
                C1495400p18 c1495400p18 = (C1495400p18) c0x0w;
                return c1495400p18.LIZ(c1495400p18.LJFF);
            }
        });
        c1495510p1J.protocols(Collections.singletonList(EnumC847200XLi.HTTP_1_1));
        C1495520p1K c1495520p1KBuild = OkHttp3Instrumentation.build(c1495510p1J);
        this.LIZ = c1495520p1KBuild;
        return c1495520p1KBuild;
    }

    public final void LIZIZ(InterfaceC836900WsK interfaceC836900WsK) {
        C1495520p1K c1495520p1KBuild;
        if (this.LIZ == null) {
            LIZ();
        }
        C1495520p1K c1495520p1K = this.LIZ;
        c1495520p1K.getClass();
        C1495510p1J c1495510p1J = new C1495510p1J(c1495520p1K);
        c1495510p1J.addNetworkInterceptor(interfaceC836900WsK);
        if (!(c1495510p1J instanceof C1495510p1J)) {
            c1495520p1KBuild = C2204961BRm.k0(c1495510p1J, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOStd9Hh1xqfaPsa55KYAHnt", null));
        } else {
            c1495520p1KBuild = OkHttp3Instrumentation.build(c1495510p1J);
        }
        this.LIZ = c1495520p1KBuild;
    }
}
